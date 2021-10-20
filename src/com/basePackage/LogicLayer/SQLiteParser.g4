/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 by Bart Kiers
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * Project : sqlite-parser; an ANTLR4 grammar for SQLite https://github.com/bkiers/sqlite-parser
 * Developed by : Bart Kiers, bart@big-o.nl Martin Mirchev, marti_2203@abv.bg
 */

parser grammar SQLiteParser;

@parser::header {
    import java.util.*;
    import org.antlr.v4.runtime.misc.*;
	import com.basePackage.PhysicalLayer.*;
	import java.nio.charset.Charset;
	import java.nio.charset.StandardCharsets;
	import java.text.ParseException;
	import java.io.*;
	import java.util.regex.*;  
	import com.basePackage.PhysicalLayer.Exceptions.*;
	//import com.basePackage.PhysicalLayer.Fields.*;
	import com.basePackage.UtilityLayer.StringContainer;
	import com.basePackage.LogicLayer.WhereClauseTree.*;
	import com.basePackage.LogicLayer.WhereClauseTree.Interfaces.*;
	import com.basePackage.LogicLayer.FromClauseTree.*;
}

@parser::members {
	TableManager tm = TableManager.getInstance();
	StringContainer result;
	Long sessionID = null;

	//Select-----------------------
		Map<String, Table> varTables;
		List<Table> tablesWithoutAlias;
	//----------------------------

	//Clause-----------------
		List<LeafFieldNode> leaves;
	//----------------------------

	public SQLiteParser(TokenStream input, StringContainer result) {
		this(input);
		this.result = result;
		sessionID = new Random().nextLong();
	}

	private void printArray(Object[] arr){
		String toPrint = "[";
		for(int i = 0; i< arr.length; i++){
			toPrint += arr[i];
			if(i < arr.length-1){
				toPrint+=",";
			}
		 }
		 System.out.println(toPrint.toString()+"]");
	}

    private String getFirstWord(String s){
        return s.split(" ", 2)[0];
    }

	private void terminateWithMessage(String message){
		result.changeString(message);
		if(sessionID == null){
		 	tm.UnloadAndWaitTermination();
		}
		tm.deleteSession(sessionID);
		throw new ParseCancellationException();
	}

	private DataInputStream stringToDataInputStream(String string){
		InputStream inputStream = new ByteArrayInputStream(string.getBytes(Charset.forName("UTF-8")));
        return new DataInputStream(inputStream);
	}

	private String findDuplicateStringList(List<String> list){
		for(String item1: list){
			int encounter = 0;
			for(String item2: list){
				if(item1.equals(item2)){
					encounter++;
					if(encounter > 1){
						return item1;
					}
				}
			}
		}
		return "";
	}

}

options {
	tokenVocab = SQLiteLexer;
}

parse: ( sql_stmt_list | error)* EOF;

error:
	UNEXPECTED_CHAR {
     throw new RuntimeException("UNEXPECTED_CHAR=" + $UNEXPECTED_CHAR.text);
   };

sql_stmt_list: ';'* sql_stmt (';'+ sql_stmt)* ';'*;

sql_stmt: ( //DONE
		create_table_stmt
		| delete_stmt{tm.UnloadAndWaitTermination(); }
		| drop_stmt{tm.unloadAllTables();}
		| insert_stmt{tm.UnloadAndWaitTermination();}
		| select_stmt{tm.deleteSession(sessionID);}
		| SHOW TABLES {result.changeString(tm.getTablesName());}                
	);

indexed_column://DONE
	(column_name | booleanExpr) asc_desc?;

create_table_stmt: //DONE
	CREATE TABLE nameTable = table_name {
	    List<String> names = new ArrayList<>();
		List<Type> types = new ArrayList<>();
		List<Boolean> nullable = new ArrayList<>();
		List<String> pk = new ArrayList<>();
		int numberOfDeclaredPK = 0;
		TupleDesc fk = null;
		if(new String("TempSessions").equals($nameTable.text)){
			terminateWithMessage("It can't be declared a table with this name, it's reserved");
		}
	}
	(
		(
			'(' columnName1 = column_def {
				    names.add((String) ($columnName1.toReturn[0]));
				    types.add((Type) ($columnName1.toReturn[1]));
				    Pair<String, Object> p = (Pair<String, Object>) $columnName1.toReturn[2];
				    if(p == null){
				    	nullable.add(true);
				    }else nullable.add(!p.a.equals("NOT_NULL")&&!p.a.equals("PRIMARY_KEY"));

				    if(p != null && p.a.equals("PRIMARY_KEY")){
				        pk.add(getFirstWord($columnName1.text));
				        numberOfDeclaredPK++;
				    }
				} (',' columnName2 = column_def {
					names.add((String) ($columnName2.toReturn[0]));
					types.add((Type) ($columnName2.toReturn[1]));
					p = (Pair<String, Object>) $columnName2.toReturn[2];
					if(p == null){
						nullable.add(true);
					}else nullable.add(!p.a.equals("NOT_NULL")&&!p.a.equals("PRIMARY_KEY"));


					if(p != null && p.a.equals("PRIMARY_KEY")){
   				        pk.add(getFirstWord($columnName2.text));
   				        numberOfDeclaredPK++;
                    }
				})* (
				',' constraint = table_constraint{
					if($constraint.parameters.a.equals("PRIMARY_KEY")){
						pk.addAll((List<String>) $constraint.parameters.b);
						numberOfDeclaredPK++;
					}else if($constraint.parameters.a.equals("FOREIGN_KEY")){
						TupleDesc td = (TupleDesc) $constraint.parameters.b;
						if(fk == null){
							fk = td;
						}else{
						 	try{
						 		fk = TupleDesc.merge(fk, td, false);
							 }catch(Exception e){
								 terminateWithMessage(e.toString());
							 }
						}
					 }

				}
			)* ')'
		)
		{

			if(numberOfDeclaredPK > 1){
			   	terminateWithMessage("It can't be declared more than one primary key");
			}

			String duplicateName = findDuplicateStringList(names);
			if(!duplicateName.equals("")){
				terminateWithMessage("It can't be declared more than one '" + duplicateName +"' attribute");
			}
			
			String duplicateNamePK = findDuplicateStringList(pk);
			if(!duplicateNamePK.equals("")){
				terminateWithMessage("It can't be declared more than one '" + duplicateNamePK +"' attribute in the primary key constraint");
			}

			boolean isCreated = false;
			try{
				isCreated = tm.CreateTable($nameTable.text, new TupleDesc(types.toArray(Type[]::new), names.toArray(String[]::new), nullable.toArray(Boolean[]::new)));
			}catch(Exception e){
				terminateWithMessage(e.toString());
			}

			if(!isCreated){
				terminateWithMessage("the table '"+ $nameTable.text + "' already exists");
			}

			try{
				Table currentTable = tm.getTable($nameTable.text);
				if(fk != null){
					fk.removePK();
					currentTable.addForeignKey(fk);
				}

				if(numberOfDeclaredPK == 1){
               		 currentTable.getTupleDesc().setKey(pk.toArray(String[]::new));
				}

				tm.unloadTable(currentTable);
			}catch(Exception e){
				terminateWithMessage(e.toString());
			}
			
		}
	);

column_def returns [Object[] toReturn]:
		{
			$toReturn = new Object[3];
		}
		nameColumn = column_name {
			$toReturn[0] = $nameColumn.text;
			$toReturn[1] = Type.STRING_TYPE;
			$toReturn[2] = null;
		} (typeName = type_name {$toReturn[1] = $typeName.t;})? (constraint = column_constraint{$toReturn[2] = $constraint.result;})?; //DONE


type_name returns [Type t]:
	INT {$t = Type.INT_TYPE;}
	|VARCHAR {$t = Type.STRING_TYPE;}('('signed_number ')')?
	;

column_constraint returns [Pair<String, Object> result]: ( //DONE
		(PRIMARY KEY) {$result = new Pair("PRIMARY_KEY", 1);}
		| (NOT NULL) {$result = new Pair("NOT_NULL", 1);}
	);

signed_number: ( '+' | '-')? NUMERIC_LITERAL; //DONE

table_constraint returns[Pair<String, Object> parameters]: ( //DONE
		(
			PRIMARY KEY '(' columnNamePK1 = indexed_column {
			    List<String> columnNames = new ArrayList<>();
				Pair<String, Object> p = new Pair<>("PRIMARY_KEY", columnNames);
				$parameters = p;
				columnNames.add($columnNamePK1.text);
				}(
				',' columnNamePK2 = indexed_column {columnNames.add($columnNamePK2.text);}
			)* ')'
		)
		| 
		(
			FOREIGN KEY '(' columnNameFK1 = column_name{
				List<String> columnNames = new ArrayList<>(); 
				columnNames.add($columnNameFK1.text);
			 } (',' columnNameFK2 =column_name {columnNames.add($columnNameFK2.text);})* ')' otherTable = foreign_key_clause{
				if(columnNames.size() != $otherTable.tupleDescription.numFields()){
					terminateWithMessage("Invalid declaration FOREIGN_KEY, it must contain the same number of attributes in both part of the declaration");
				}

				$otherTable.tupleDescription.changeNames(columnNames);
				$otherTable.tupleDescription.setNullable($otherTable.tupleDescription.getAttrNames());
				$parameters = new Pair<>("FOREIGN_KEY", $otherTable.tupleDescription);

			}
			(NOT NULL {$otherTable.tupleDescription.setAllAttributesNullableValue(false);})?
		)
	);

foreign_key_clause returns [TupleDesc tupleDescription]: //DONE
	{List<String> columns = new ArrayList<>();}
	REFERENCES tableName = foreign_table{
		Table currentTable = tm.getTable($tableName.text);
		if(currentTable == null){
			terminateWithMessage("The table '" + $tableName.text + "' referenced in the FOREIGN_KEY doesn't exists"); //table must exists
		}
	} (
		'(' columnName1 = column_name {columns.add($columnName1.text);} 
		( ',' columnName2 = column_name {columns.add($columnName2.text);})* ')'
	)?
	{
		try{
			$tupleDescription = currentTable.getTupleDesc().subset(columns, $tableName.text);

			for(int i = 0; i < columns.size(); i++){
				$tupleDescription.addReferenceTo($tableName.text, columns.get(i), i);
			}
		}catch(Exception e){
			terminateWithMessage(e.toString());
		}
	}
	;


cte_table_name: //DONE
	table_name ('(' column_name ( ',' column_name)* ')')?;

recursive_cte:
	cte_table_name AS '(' initial_select UNION ALL? recursive_select ')';

common_table_expression:
	table_name ('(' column_name ( ',' column_name)* ')')? AS '(' select_stmt ')';

delete_stmt: //DONE
	DELETE FROM Table_name = table_name {
		Table currentTable = tm.getTable($Table_name.text);
		if(currentTable == null){
			Exception e = new NotFoundedTableException($Table_name.text);
			terminateWithMessage(e.toString());
		}

		leaves = new ArrayList<>();
		BooleanNode head = null;
		try{
			 head = new UnaryBooleanNode(true, Operators.UnaryBooleanOp.LEAF);
		}catch(Exception e){}
	} (WHERE bNode = booleanExpr {head = $bNode.node;})?
	{
		WhereBooleanTree booleanTree = new WhereBooleanTree(head, leaves);
		try{
			currentTable.removeTuplesWithCondition(booleanTree);
		}catch(Exception e){
			terminateWithMessage(e.toString());
		}
		tm.UnloadAndWaitTermination();
	}
	;

drop_stmt:
	{boolean ifExists = false;}DROP TABLE (IF EXISTS {ifExists = true;})? tableName = any_name {
		try{
			tm.deleteTable($tableName.text);
		}catch(Exception e){
			if(!(e instanceof NotFoundedTableException) || !ifExists){
				terminateWithMessage(e.toString());
			}
		}
	};



booleanExpr returns [BooleanNode node]: 
 	'(' expNode = booleanExpr')' {$node = $expNode.node;}
	| literal = boolean_literal {$node = $literal.node;}
	| NOT expNode = booleanExpr {
			try{
				$node = new UnaryBooleanNode($expNode.node, Operators.UnaryBooleanOp.NOT);
			}catch(InvalidTypesException e){
				terminateWithMessage(e.toString());
			}
		}
	| expNodeLeftField = fieldExpr {String op;}( '<' {op = "<";}| '<=' {op = "<=";}| '>' {op = ">";}| '>='{op = ">=";} | '=' {op = "=";}| '<>'{op = "<>";})  expNodeRightField = fieldExpr{
		Operators.OrderBooleanOp operator = Operators.OrderBooleanOp.EQUALS;
		switch(op){
			case "<":
				operator = Operators.OrderBooleanOp.LESS_THAN;
				break;
			case "<=":
				operator = Operators.OrderBooleanOp.LESS_THAN_OR_EQ;
				break;
			case ">":
				operator = Operators.OrderBooleanOp.GREATER_THAN;
				break;
			case ">=":
				operator = Operators.OrderBooleanOp.GREATER_THAN_OR_EQ;
				break;
			case "=":
				operator = Operators.OrderBooleanOp.EQUALS;
				break;
			case "<>":
				operator = Operators.OrderBooleanOp.NOT_EQUALS;
				break;	
		}
		$node = new OrderBooleanNode($expNodeLeftField.node, $expNodeRightField.node, operator);

	}
	| expNodeLeft = booleanExpr AND expNodeRight = booleanExpr{
		$node = new BinaryBooleanNode($expNodeLeft.node, $expNodeRight.node , Operators.BinaryBooleanOp.AND);
	}
	| expNodeLeft = booleanExpr OR expNodeRight = booleanExpr{
		$node = new BinaryBooleanNode($expNodeLeft.node, $expNodeRight.node , Operators.BinaryBooleanOp.OR);
	}
	| expNodeField = fieldExpr ISNULL{$node = new NullOperatorNode(Operators.NullOp.ISNULL, $expNodeField.node);};


fieldExpr returns [NodeField node]:
	'(' expNodePar = fieldExpr')' {$node = $expNodePar.node;}
	| '-'numVal = fieldExpr {
		LeafFieldNode toMultiply = new LeafFieldNode(""); toMultiply.setField(new IntField(-1));
		$node = new ArithmeticFieldNode($numVal.node, toMultiply , Operators.ArithmeticOp.MUL); 
		}
	| expNode = field_litteral {$node = $expNode.node;}
	/*| expNodeLeft = fieldExpr '||' expNodeRight = fieldExpr //concatenation*/
	| expNodeLeft = fieldExpr {String op;}( '*' {op = "*";}| '/'{op = "/";}) expNodeRight = fieldExpr{
		Operators.ArithmeticOp operator = Operators.ArithmeticOp.MUL;
		if(op.equals("*")){
			operator = Operators.ArithmeticOp.MUL;
		}else operator = Operators.ArithmeticOp.DIV;
		$node = new ArithmeticFieldNode($expNodeLeft.node, $expNodeRight.node , operator); 
	}
	| expNodeLeft = fieldExpr {String op;}( '+' {op = "+";} | '-'{op = "-";}) expNodeRight = fieldExpr{
		Operators.ArithmeticOp operator = operator = Operators.ArithmeticOp.ADD;
		if(op.equals("+")){
			operator = Operators.ArithmeticOp.ADD;
		}else operator = Operators.ArithmeticOp.SUB;
		$node = new ArithmeticFieldNode($expNodeLeft.node, $expNodeRight.node , operator); 
	}
;

literal_value returns [WhereTreeNode literal]:
	numVal = NUMERIC_LITERAL 
	| strVal = STRING_LITERAL 
	| NULL 
	| TRUE 
	| FALSE;

boolean_literal returns [BooleanNode node]:
	TRUE {try{
			$node = new UnaryBooleanNode(true, Operators.UnaryBooleanOp.LEAF);
		}catch(InvalidTypesException e){
				terminateWithMessage(e.toString());
			}
		}
	| FALSE {try{
			$node = new UnaryBooleanNode(false, Operators.UnaryBooleanOp.LEAF);
		}catch(InvalidTypesException e){
				terminateWithMessage(e.toString());
		}
	};

field_litteral returns [NodeField node]:
	|{int sign = 1;}('-' {sign = -1;})?numVal = NUMERIC_LITERAL {$node = new LeafFieldNode(""); ((LeafFieldNode)$node).setField(new IntField(Integer.parseInt($numVal.text)*sign));}
	| /*string come in between of '', table name don't*/strVal = STRING_LITERAL {
		if(Pattern.compile("^(true|false)$").matcher($strVal.text).matches()){
			terminateWithMessage("Can't apply the operator '=' on boolean values");
		}
		$node = new LeafFieldNode(""); ((LeafFieldNode)$node).setField(new StringField($strVal.text));
		}
	| NULL {$node = new LeafFieldNode("");	((LeafFieldNode)$node).setField(new NullField());}
	| {String aliasToSet = "";}( aliasAttr = table_name '.' {aliasToSet = $aliasAttr.text;})? columnName = column_name {
		if(Pattern.compile("^(true|false)$").matcher($columnName.text).matches()){
			terminateWithMessage("Can't apply the operator '=' on boolean values");
		}
		LeafFieldNode leaf = new LeafFieldNode($columnName.text);
		leaf.setAlias(aliasToSet);
		leaves.add(leaf);
		$node = leaf;
		};


insert_values:
	NUMERIC_LITERAL
	| STRING_LITERAL;

insert_stmt: //DONE
	(
		INSERT
	) INTO  nameTable = table_name {
		Table table = tm.getTable($nameTable.text);
		if(table == null){
			terminateWithMessage("the table '"+ $nameTable.text + "' doesn't exists");
		}
		TupleDesc td = table.getTupleDesc();

		List<Tuple> toAdd = new ArrayList<>();
		List<String> columns = new ArrayList<>();
		List<String> tempValues = new ArrayList<>();
	}(
		'(' columnName1 = column_name {columns.add($columnName1.text);}
		 ( ',' columnName2 = column_name {columns.add($columnName2.text);})* ')'
	)? (
		{
			if(columns.size() < 1){
				columns = td.getFieldNames();
			}
			List<String> notNullableTableColumns = td.getNotNullableItems();
			for(String notNullableColumn: notNullableTableColumns){
				boolean isFound = false;
				for(String column: columns){
					if(notNullableColumn.equals(column)){
						isFound = true;
						break;
					}
				}
				
				if(!isFound){
					terminateWithMessage("The not nullable attribute '"+ notNullableColumn + "' is not been defined");
				}
			}

			Field[] fields = new Field[td.numFields()];
			for(int i = 0; i<fields.length; i++){
				fields[i] = new NullField();
			}

		}
		(
			(
				VALUES '(' v1 = insert_values {tempValues.add($v1.text);} (',' v2 = insert_values {tempValues.add($v2.text);})* ')'{
						Tuple tuple = new Tuple(td);
						toAdd.add(tuple);
						assert fields.length == td.numFields();

						if(tempValues.size() != columns.size()){
							terminateWithMessage("Invalid tuple description: incompatible with 'INSERT INTO' declaration");
						}

						try{
							for(int i = 0; i < columns.size(); i++){
								int index = td.fieldNameToIndex(columns.get(i));
								fields[index] = td.getFieldType(index).parse(stringToDataInputStream(tempValues.get(i)));
							}

							for(int i = 0; i<fields.length; i++){
								tuple.setField(i, fields[i]);
							}
						}catch(Exception e){
							terminateWithMessage(e.toString());
						}

					}(
					',' '(' v11 = insert_values{tempValues = new ArrayList<>(); tempValues.add($v11.text);} ( ',' v12 = insert_values {tempValues.add($v12.text);})* 
					{
						tuple = new Tuple(td);
						toAdd.add(tuple);
						assert fields.length == td.numFields();

						if(tempValues.size() != columns.size()){
							terminateWithMessage("Invalid tuple description: incompatible with 'INSERT INTO' declaration");
						}

						try{
							for(int i = 0; i < columns.size(); i++){
								int index = td.fieldNameToIndex(columns.get(i));
								fields[index] = td.getFieldType(index).parse(stringToDataInputStream(tempValues.get(i)));
							}

							for(int i = 0; i<fields.length; i++){
								tuple.setField(i, fields[i]);
							}
						}catch(Exception e){
							terminateWithMessage(e.toString());
						}
					}')'
				)*
			)
		)
		{	
			for(Tuple tuple: toAdd){
				try{
					table.addTuple(tuple);
				}catch(Exception e){
					terminateWithMessage(e.toString());
				}
			}
		}
	);

select_stmt : //DONE
	 select_core (order_by_stmt )? ;


select_core returns [Table t]: //DONE


	(
		{		List<String> attrToSelect = new ArrayList<>(); 
				varTables = new Hashtable<String, Table>();
				tablesWithoutAlias = new ArrayList<Table>();
				Table resultTable = null;
				FromClauseNode headFromNode = null;
				BooleanNode head = null;
				try{
					head = new UnaryBooleanNode(true, Operators.UnaryBooleanOp.LEAF);
				}catch(Exception e){
					terminateWithMessage(e.toString());
				}
				
				while(tm.existsSession(sessionID)){
					sessionID = new Random().nextLong();
				}
				tm.createSession(sessionID);
			}
		SELECT ('*' {attrToSelect.add("*");}|result1 = result_column {attrToSelect.add($result1.text);}(
			',' result2 = result_column {attrToSelect.add($result2.text);}
		)*) (
			FROM  resultNode = cartesian {headFromNode = $resultNode.nodeToReturn;}
		){leaves = new ArrayList<>();} (WHERE headNode = booleanExpr {head = $headNode.node;})?/*
		(
			GROUP BY booleanExpr (',' booleanExpr)* (HAVING booleanExpr)?
		)?*/
	{
		try{
			resultTable = headFromNode.execute();
			result.changeString(resultTable.getStringTableSelect(attrToSelect, new WhereBooleanTree(head, leaves)));
		}catch(Exception e){
			terminateWithMessage(e.toString());
		}
	}
);

factored_select_stmt: select_stmt; //DONE

simple_select_stmt: //DONE
	select_core order_by_stmt?;

compound_select_stmt: //DONE
	select_core (
		((UNION ALL?) | INTERSECT | EXCEPT) select_core
	)+ order_by_stmt?;


/*
	Map<1*String, 2*Table> varTables

	1*: table alias if exists else null
	2*: pointer of table object

 */


cartesian returns [FromClauseNode nodeToReturn]:
	n1=join  n2=cartesian_1[$n1.nodeToReturn] {$nodeToReturn = $n2.nodeToReturn;};

cartesian_1[FromClauseNode n] returns [FromClauseNode nodeToReturn]: 
	',' n1=join n2=cartesian_1[new OperationTableNode(n, $n1.nodeToReturn, OperationTableNode.Op.CARTESIAN_PRODUCT , sessionID)] {$nodeToReturn = $n2.nodeToReturn;}|{$nodeToReturn = n;};

join returns [FromClauseNode nodeToReturn]: 
	n1=term n2=join_1[$n1.nodeToReturn]{$nodeToReturn = $n2.nodeToReturn;};

join_1[FromClauseNode n] returns [FromClauseNode nodeToReturn]: 
	JOIN n1=term {OperationTableNode joinNode = new OperationTableNode(n, $n1.nodeToReturn, OperationTableNode.Op.JOIN , sessionID);
				  leaves = new ArrayList<>();} n2=join_1[joinNode] ON '(' constraint = booleanExpr ')' 
	{
		WhereBooleanTree booleanTree = new WhereBooleanTree($constraint.node, leaves);
		joinNode.setConstraint(booleanTree);
	}
	n2 = join_1[$n2.nodeToReturn]{$nodeToReturn = $n2.nodeToReturn;}
	|{$nodeToReturn = n;};

term returns [FromClauseNode nodeToReturn]: 
	|Table_name = table_name {
			/*Execute controls on existance of Table_name in Db getting Table 'Ti' from Table_name
			If it doesn't exists return failure and terminate parsing
			*/
			boolean isSetAlias = false;
			Table currentTable = tm.getTable($Table_name.text);
			if(currentTable == null){
				Exception e = new NotFoundedTableException($Table_name.text);
				terminateWithMessage(e.toString());
			}
		} (AS? Table_alias = table_alias {
			isSetAlias = true;
			if(tm.getTable($Table_alias.text) != null){
				Table daeliminare = tm.getTable($Table_alias.text);
				terminateWithMessage("The alias '" + $Table_alias.text + "' is not valid, it exists already a table with that name");
			}

			if(varTables.containsKey($Table_alias.text)){
				terminateWithMessage("The alias '" + $Table_alias.text + "' is declared multiple times");
			}

			varTables.put($Table_alias.text,  currentTable);
			}
		)?
		{
			if(!isSetAlias){
				for(Table table: tablesWithoutAlias){
					if(table.getName().equals(currentTable.getName())){
					terminateWithMessage("The table '" + $Table_name.text + "' is declared multiple times without alias");
					}
				}
				tablesWithoutAlias.add(currentTable);
				$nodeToReturn = new TableLeafNode(currentTable, "", sessionID);
			}else{
				$nodeToReturn = new TableLeafNode(currentTable, $Table_alias.text, sessionID);
			}
		}
	| '('n=cartesian')'{$nodeToReturn = $n.nodeToReturn;};


result_column: //DONE
	( aliasAttr = table_name '.' )? columnName = column_name;

column_name_list: '(' column_name (',' column_name)* ')';

qualified_table_name: table_name (AS alias)?;

order_by_stmt: ORDER BY ordering_term ( ',' ordering_term)*;

ordering_term:
	booleanExpr  asc_desc?;

asc_desc: ASC | DESC;


// unknown

offset: ',' signed_number;

default_value: ',' signed_number;

order_by_expr: ORDER BY booleanExpr+;

order_by_expr_asc_desc: ORDER BY order_by_expr_asc_desc;

expr_asc_desc: booleanExpr asc_desc? (',' booleanExpr asc_desc?)*;

//TODO BOTH OF THESE HAVE TO BE REWORKED TO FOLLOW THE SPEC
initial_select: select_stmt;

recursive_select: select_stmt;

unary_operator: '-' | '+' | NOT;

error_message: STRING_LITERAL;

module_argument: // TODO check what exactly is permitted here
	booleanExpr
	| column_def;

column_alias: IDENTIFIER | STRING_LITERAL;

keyword:
ADD
	| ALL
	| ALTER
	| AND
	| AS
	| ASC
	| BETWEEN
	| BY
	| COLUMN
	| CREATE
	| CURRENT_DATE
	| CURRENT_TIME
	| CURRENT_TIMESTAMP
	| DATABASE
	| DEFAULT
	| DELETE
	| DESC
	| DETACH
	| DISTINCT
	| DROP
	| EXCEPT
	| EXCLUSIVE
	| EXISTS
	| FROM
	| GROUP
	| HAVING
	| IN
	| INNER
	| INSERT
	| INTERSECT
	| INTO
	| IS
	| ISNULL
	| JOIN
	| KEY
	| LEFT
	| LIKE
	| MATCH
	| NATURAL
	| NO
	| NOT
	| NOTNULL
	| NULL
	| OF
	| OFFSET
	| ON
	| OR
	| ORDER
	| OUTER
	| PRIMARY
	| QUERY
	| RECURSIVE
	| REFERENCES
	| RELEASE
	| RENAME
	| REPLACE
	| RESTRICT
	| RIGHT
	| SELECT
	| SET
	| TABLE
	| TO
	| TRANSACTION
	| UNION
	| UNIQUE
	| UPDATE
	| VALUES
	| WHEN
	| WHERE
	| WITH
	| WITHOUT
	| TRUE
	| FALSE
	| NULLS
	| FIRST
	| LAST;

// TODO check all names below

name: any_name;

table_name: any_name;

table_or_index_name: any_name;

new_table_name: any_name;

column_name: any_name;

foreign_table: any_name;


table_alias: any_name;

transaction_name: any_name;

alias: any_name;

simple_func: any_name;

aggregate_func: any_name;

any_name:
	IDENTIFIER
	| keyword
	| STRING_LITERAL
	| '(' any_name ')';

