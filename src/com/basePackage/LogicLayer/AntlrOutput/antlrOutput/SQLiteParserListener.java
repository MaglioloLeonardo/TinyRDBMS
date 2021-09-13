// Generated from D:/MEGAsync/Uni/Terzo anno/tesi/Progetti/Progetto/src/com/basePackage/LogicLayer\SQLiteParser.g4 by ANTLR 4.9.1
package antlrOutput;

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

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLiteParser}.
 */
public interface SQLiteParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(SQLiteParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(SQLiteParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(SQLiteParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(SQLiteParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(SQLiteParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(SQLiteParser.Sql_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(SQLiteParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(SQLiteParser.Sql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_column(SQLiteParser.Indexed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_column(SQLiteParser.Indexed_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(SQLiteParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(SQLiteParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(SQLiteParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(SQLiteParser.Column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(SQLiteParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(SQLiteParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(SQLiteParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(SQLiteParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(SQLiteParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(SQLiteParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(SQLiteParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(SQLiteParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause(SQLiteParser.Foreign_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause(SQLiteParser.Foreign_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void enterCte_table_name(SQLiteParser.Cte_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void exitCte_table_name(SQLiteParser.Cte_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#recursive_cte}.
	 * @param ctx the parse tree
	 */
	void enterRecursive_cte(SQLiteParser.Recursive_cteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#recursive_cte}.
	 * @param ctx the parse tree
	 */
	void exitRecursive_cte(SQLiteParser.Recursive_cteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(SQLiteParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(SQLiteParser.Common_table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(SQLiteParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(SQLiteParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#drop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_stmt(SQLiteParser.Drop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#drop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_stmt(SQLiteParser.Drop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#booleanExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpr(SQLiteParser.BooleanExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#booleanExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpr(SQLiteParser.BooleanExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#fieldExpr}.
	 * @param ctx the parse tree
	 */
	void enterFieldExpr(SQLiteParser.FieldExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#fieldExpr}.
	 * @param ctx the parse tree
	 */
	void exitFieldExpr(SQLiteParser.FieldExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(SQLiteParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(SQLiteParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(SQLiteParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(SQLiteParser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#field_litteral}.
	 * @param ctx the parse tree
	 */
	void enterField_litteral(SQLiteParser.Field_litteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#field_litteral}.
	 * @param ctx the parse tree
	 */
	void exitField_litteral(SQLiteParser.Field_litteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#insert_values}.
	 * @param ctx the parse tree
	 */
	void enterInsert_values(SQLiteParser.Insert_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#insert_values}.
	 * @param ctx the parse tree
	 */
	void exitInsert_values(SQLiteParser.Insert_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(SQLiteParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(SQLiteParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(SQLiteParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(SQLiteParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#select_core}.
	 * @param ctx the parse tree
	 */
	void enterSelect_core(SQLiteParser.Select_coreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#select_core}.
	 * @param ctx the parse tree
	 */
	void exitSelect_core(SQLiteParser.Select_coreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFactored_select_stmt(SQLiteParser.Factored_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFactored_select_stmt(SQLiteParser.Factored_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_select_stmt(SQLiteParser.Simple_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_select_stmt(SQLiteParser.Simple_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_select_stmt(SQLiteParser.Compound_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_select_stmt(SQLiteParser.Compound_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#cartesian}.
	 * @param ctx the parse tree
	 */
	void enterCartesian(SQLiteParser.CartesianContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#cartesian}.
	 * @param ctx the parse tree
	 */
	void exitCartesian(SQLiteParser.CartesianContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#cartesian_1}.
	 * @param ctx the parse tree
	 */
	void enterCartesian_1(SQLiteParser.Cartesian_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#cartesian_1}.
	 * @param ctx the parse tree
	 */
	void exitCartesian_1(SQLiteParser.Cartesian_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#join}.
	 * @param ctx the parse tree
	 */
	void enterJoin(SQLiteParser.JoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#join}.
	 * @param ctx the parse tree
	 */
	void exitJoin(SQLiteParser.JoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#join_1}.
	 * @param ctx the parse tree
	 */
	void enterJoin_1(SQLiteParser.Join_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#join_1}.
	 * @param ctx the parse tree
	 */
	void exitJoin_1(SQLiteParser.Join_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(SQLiteParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(SQLiteParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(SQLiteParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(SQLiteParser.Result_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#column_name_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name_list(SQLiteParser.Column_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#column_name_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name_list(SQLiteParser.Column_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_table_name(SQLiteParser.Qualified_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_table_name(SQLiteParser.Qualified_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#order_by_stmt}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_stmt(SQLiteParser.Order_by_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#order_by_stmt}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_stmt(SQLiteParser.Order_by_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_term(SQLiteParser.Ordering_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_term(SQLiteParser.Ordering_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#asc_desc}.
	 * @param ctx the parse tree
	 */
	void enterAsc_desc(SQLiteParser.Asc_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#asc_desc}.
	 * @param ctx the parse tree
	 */
	void exitAsc_desc(SQLiteParser.Asc_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#offset}.
	 * @param ctx the parse tree
	 */
	void enterOffset(SQLiteParser.OffsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#offset}.
	 * @param ctx the parse tree
	 */
	void exitOffset(SQLiteParser.OffsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#default_value}.
	 * @param ctx the parse tree
	 */
	void enterDefault_value(SQLiteParser.Default_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#default_value}.
	 * @param ctx the parse tree
	 */
	void exitDefault_value(SQLiteParser.Default_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#order_by_expr}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_expr(SQLiteParser.Order_by_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#order_by_expr}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_expr(SQLiteParser.Order_by_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#order_by_expr_asc_desc}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_expr_asc_desc(SQLiteParser.Order_by_expr_asc_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#order_by_expr_asc_desc}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_expr_asc_desc(SQLiteParser.Order_by_expr_asc_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#expr_asc_desc}.
	 * @param ctx the parse tree
	 */
	void enterExpr_asc_desc(SQLiteParser.Expr_asc_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#expr_asc_desc}.
	 * @param ctx the parse tree
	 */
	void exitExpr_asc_desc(SQLiteParser.Expr_asc_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#initial_select}.
	 * @param ctx the parse tree
	 */
	void enterInitial_select(SQLiteParser.Initial_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#initial_select}.
	 * @param ctx the parse tree
	 */
	void exitInitial_select(SQLiteParser.Initial_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#recursive_select}.
	 * @param ctx the parse tree
	 */
	void enterRecursive_select(SQLiteParser.Recursive_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#recursive_select}.
	 * @param ctx the parse tree
	 */
	void exitRecursive_select(SQLiteParser.Recursive_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(SQLiteParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(SQLiteParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#error_message}.
	 * @param ctx the parse tree
	 */
	void enterError_message(SQLiteParser.Error_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#error_message}.
	 * @param ctx the parse tree
	 */
	void exitError_message(SQLiteParser.Error_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void enterModule_argument(SQLiteParser.Module_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void exitModule_argument(SQLiteParser.Module_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(SQLiteParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(SQLiteParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(SQLiteParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(SQLiteParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SQLiteParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SQLiteParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(SQLiteParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(SQLiteParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_index_name(SQLiteParser.Table_or_index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_index_name(SQLiteParser.Table_or_index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_table_name(SQLiteParser.New_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_table_name(SQLiteParser.New_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(SQLiteParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(SQLiteParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void enterForeign_table(SQLiteParser.Foreign_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void exitForeign_table(SQLiteParser.Foreign_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(SQLiteParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(SQLiteParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_name(SQLiteParser.Transaction_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_name(SQLiteParser.Transaction_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(SQLiteParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(SQLiteParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#simple_func}.
	 * @param ctx the parse tree
	 */
	void enterSimple_func(SQLiteParser.Simple_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#simple_func}.
	 * @param ctx the parse tree
	 */
	void exitSimple_func(SQLiteParser.Simple_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#aggregate_func}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_func(SQLiteParser.Aggregate_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#aggregate_func}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_func(SQLiteParser.Aggregate_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(SQLiteParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(SQLiteParser.Any_nameContext ctx);
}