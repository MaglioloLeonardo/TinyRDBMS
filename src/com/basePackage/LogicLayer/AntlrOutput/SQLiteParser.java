package com.basePackage.LogicLayer.AntlrOutput;// Generated from D:/MEGAsync/Uni/Triennale/Terzo anno/tesi/Progetti/Progetto/src/com/basePackage/LogicLayer\SQLiteParser.g4 by ANTLR 4.9.1

import java.util.*;
    import org.antlr.v4.runtime.misc.*;
	import com.basePackage.PhysicalLayer.*;
	import java.nio.charset.Charset;
import java.io.*;
	import java.util.regex.*;  
	import com.basePackage.PhysicalLayer.Exceptions.*;
	//import com.basePackage.PhysicalLayer.Fields.*;
	import com.basePackage.UtilityLayer.StringContainer;
	import com.basePackage.LogicLayer.WhereClauseTree.*;
	import com.basePackage.LogicLayer.WhereClauseTree.Interfaces.*;
	import com.basePackage.LogicLayer.FromClauseTree.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLiteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SCOL=1, DOT=2, OPEN_PAR=3, CLOSE_PAR=4, COMMA=5, ASSIGN=6, STAR=7, PLUS=8, 
		MINUS=9, TILDE=10, PIPE2=11, DIV=12, MOD=13, LT2=14, GT2=15, AMP=16, PIPE=17, 
		LT=18, LT_EQ=19, GT=20, GT_EQ=21, EQ=22, NOT_EQ1=23, NOT_EQ2=24, ABORT=25, 
		ACTION=26, ADD=27, AFTER=28, ALL=29, ALTER=30, AND=31, AS=32, ASC=33, 
		ATTACH=34, BEFORE=35, BEGIN=36, BETWEEN=37, BY=38, IF=39, EXCEPT=40, CASCADE=41, 
		COLUMN=42, COMMIT=43, CONFLICT=44, CONSTRAINT=45, CREATE=46, CROSS=47, 
		CURRENT_DATE=48, CURRENT_TIME=49, CURRENT_TIMESTAMP=50, DATABASE=51, DEFAULT=52, 
		DELETE=53, DESC=54, DETACH=55, DISTINCT=56, DROP=57, EXCLUSIVE=58, EXISTS=59, 
		FOREIGN=60, FROM=61, FULL=62, GROUP=63, HAVING=64, IN=65, INNER=66, INSERT=67, 
		INSTEAD=68, INT=69, INTERSECT=70, INTO=71, IS=72, ISNULL=73, JOIN=74, 
		KEY=75, LEFT=76, LIKE=77, LIMIT=78, MATCH=79, NATURAL=80, NO=81, NOT=82, 
		NOTNULL=83, NULL=84, OF=85, OFFSET=86, ON=87, OR=88, ORDER=89, OUTER=90, 
		PRIMARY=91, QUERY=92, RECURSIVE=93, REFERENCES=94, RELEASE=95, RENAME=96, 
		REPLACE=97, RESTRICT=98, RIGHT=99, SELECT=100, SET=101, SHOW=102, TABLE=103, 
		TABLES=104, THEN=105, TO=106, TRANSACTION=107, UNION=108, UNIQUE=109, 
		UPDATE=110, VALUES=111, VARCHAR=112, WHEN=113, WHERE=114, WITH=115, WITHOUT=116, 
		TRUE=117, FALSE=118, NULLS=119, FIRST=120, LAST=121, EXCLUDE=122, IDENTIFIER=123, 
		NUMERIC_LITERAL=124, BIND_PARAMETER=125, STRING_LITERAL=126, SINGLE_LINE_COMMENT=127, 
		MULTILINE_COMMENT=128, SPACES=129, UNEXPECTED_CHAR=130;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_indexed_column = 4, RULE_create_table_stmt = 5, RULE_column_def = 6, 
		RULE_type_name = 7, RULE_column_constraint = 8, RULE_signed_number = 9, 
		RULE_table_constraint = 10, RULE_foreign_key_clause = 11, RULE_cte_table_name = 12, 
		RULE_recursive_cte = 13, RULE_common_table_expression = 14, RULE_delete_stmt = 15, 
		RULE_drop_stmt = 16, RULE_booleanExpr = 17, RULE_fieldExpr = 18, RULE_literal_value = 19, 
		RULE_boolean_literal = 20, RULE_field_litteral = 21, RULE_insert_values = 22, 
		RULE_insert_stmt = 23, RULE_select_stmt = 24, RULE_select_core = 25, RULE_factored_select_stmt = 26, 
		RULE_simple_select_stmt = 27, RULE_compound_select_stmt = 28, RULE_cartesian = 29, 
		RULE_cartesian_1 = 30, RULE_join = 31, RULE_join_1 = 32, RULE_term = 33, 
		RULE_result_column = 34, RULE_column_name_list = 35, RULE_qualified_table_name = 36, 
		RULE_order_by_stmt = 37, RULE_ordering_term = 38, RULE_asc_desc = 39, 
		RULE_offset = 40, RULE_default_value = 41, RULE_order_by_expr = 42, RULE_order_by_expr_asc_desc = 43, 
		RULE_expr_asc_desc = 44, RULE_initial_select = 45, RULE_recursive_select = 46, 
		RULE_unary_operator = 47, RULE_error_message = 48, RULE_module_argument = 49, 
		RULE_column_alias = 50, RULE_keyword = 51, RULE_name = 52, RULE_table_name = 53, 
		RULE_table_or_index_name = 54, RULE_new_table_name = 55, RULE_column_name = 56, 
		RULE_foreign_table = 57, RULE_table_alias = 58, RULE_transaction_name = 59, 
		RULE_alias = 60, RULE_simple_func = 61, RULE_aggregate_func = 62, RULE_any_name = 63;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "sql_stmt_list", "sql_stmt", "indexed_column", "create_table_stmt", 
			"column_def", "type_name", "column_constraint", "signed_number", "table_constraint", 
			"foreign_key_clause", "cte_table_name", "recursive_cte", "common_table_expression", 
			"delete_stmt", "drop_stmt", "booleanExpr", "fieldExpr", "literal_value", 
			"boolean_literal", "field_litteral", "insert_values", "insert_stmt", 
			"select_stmt", "select_core", "factored_select_stmt", "simple_select_stmt", 
			"compound_select_stmt", "cartesian", "cartesian_1", "join", "join_1", 
			"term", "result_column", "column_name_list", "qualified_table_name", 
			"order_by_stmt", "ordering_term", "asc_desc", "offset", "default_value", 
			"order_by_expr", "order_by_expr_asc_desc", "expr_asc_desc", "initial_select", 
			"recursive_select", "unary_operator", "error_message", "module_argument", 
			"column_alias", "keyword", "name", "table_name", "table_or_index_name", 
			"new_table_name", "column_name", "foreign_table", "table_alias", "transaction_name", 
			"alias", "simple_func", "aggregate_func", "any_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", "'-'", 
			"'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", 
			"'>'", "'>='", "'=='", "'!='", "'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", 
			"PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", 
			"PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "ABORT", 
			"ACTION", "ADD", "AFTER", "ALL", "ALTER", "AND", "AS", "ASC", "ATTACH", 
			"BEFORE", "BEGIN", "BETWEEN", "BY", "IF", "EXCEPT", "CASCADE", "COLUMN", 
			"COMMIT", "CONFLICT", "CONSTRAINT", "CREATE", "CROSS", "CURRENT_DATE", 
			"CURRENT_TIME", "CURRENT_TIMESTAMP", "DATABASE", "DEFAULT", "DELETE", 
			"DESC", "DETACH", "DISTINCT", "DROP", "EXCLUSIVE", "EXISTS", "FOREIGN", 
			"FROM", "FULL", "GROUP", "HAVING", "IN", "INNER", "INSERT", "INSTEAD", 
			"INT", "INTERSECT", "INTO", "IS", "ISNULL", "JOIN", "KEY", "LEFT", "LIKE", 
			"LIMIT", "MATCH", "NATURAL", "NO", "NOT", "NOTNULL", "NULL", "OF", "OFFSET", 
			"ON", "OR", "ORDER", "OUTER", "PRIMARY", "QUERY", "RECURSIVE", "REFERENCES", 
			"RELEASE", "RENAME", "REPLACE", "RESTRICT", "RIGHT", "SELECT", "SET", 
			"SHOW", "TABLE", "TABLES", "THEN", "TO", "TRANSACTION", "UNION", "UNIQUE", 
			"UPDATE", "VALUES", "VARCHAR", "WHEN", "WHERE", "WITH", "WITHOUT", "TRUE", 
			"FALSE", "NULLS", "FIRST", "LAST", "EXCLUDE", "IDENTIFIER", "NUMERIC_LITERAL", 
			"BIND_PARAMETER", "STRING_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", 
			"SPACES", "UNEXPECTED_CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SQLiteParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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


	public SQLiteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQLiteParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << CREATE) | (1L << DELETE) | (1L << DROP))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (INSERT - 67)) | (1L << (SELECT - 67)) | (1L << (SHOW - 67)) | (1L << (UNEXPECTED_CHAR - 67)))) != 0)) {
				{
				setState(130);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCOL:
				case CREATE:
				case DELETE:
				case DROP:
				case INSERT:
				case SELECT:
				case SHOW:
					{
					setState(128);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(129);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(SQLiteParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);

			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null));
			   
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLiteParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLiteParser.SCOL, i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSql_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSql_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(140);
				match(SCOL);
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			sql_stmt();
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(148); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(147);
						match(SCOL);
						}
						}
						setState(150); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(152);
					sql_stmt();
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(158);
					match(SCOL);
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmtContext extends ParserRuleContext {
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Drop_stmtContext drop_stmt() {
			return getRuleContext(Drop_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode SHOW() { return getToken(SQLiteParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SQLiteParser.TABLES, 0); }
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				{
				setState(164);
				create_table_stmt();
				}
				break;
			case DELETE:
				{
				setState(165);
				delete_stmt();
				tm.UnloadAndWaitTermination(); 
				}
				break;
			case DROP:
				{
				setState(168);
				drop_stmt();
				tm.unloadAllTables();
				}
				break;
			case INSERT:
				{
				setState(171);
				insert_stmt();
				tm.UnloadAndWaitTermination();
				}
				break;
			case SELECT:
				{
				setState(174);
				select_stmt();
				tm.deleteSession(sessionID);
				}
				break;
			case SHOW:
				{
				setState(177);
				match(SHOW);
				setState(178);
				match(TABLES);
				result.changeString(tm.getTablesName());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Indexed_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public Asc_descContext asc_desc() {
			return getRuleContext(Asc_descContext.class,0);
		}
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterIndexed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitIndexed_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitIndexed_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(182);
				column_name();
				}
				break;
			case 2:
				{
				setState(183);
				booleanExpr(0);
				}
				break;
			}
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(186);
				asc_desc();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_stmtContext extends ParserRuleContext {
		public Table_nameContext nameTable;
		public Column_defContext columnName1;
		public Column_defContext columnName2;
		public Table_constraintContext constraint;
		public TerminalNode CREATE() { return getToken(SQLiteParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SQLiteParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_create_table_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(CREATE);
			setState(190);
			match(TABLE);
			setState(191);
			((Create_table_stmtContext)_localctx).nameTable = table_name();

				    List<String> names = new ArrayList<>();
					List<Type> types = new ArrayList<>();
					List<Boolean> nullable = new ArrayList<>();
					List<String> pk = new ArrayList<>();
					int numberOfDeclaredPK = 0;
					TupleDesc fk = null;
					if(new String("TempSessions").equals((((Create_table_stmtContext)_localctx).nameTable!=null?_input.getText(((Create_table_stmtContext)_localctx).nameTable.start,((Create_table_stmtContext)_localctx).nameTable.stop):null))){
						terminateWithMessage("It can't be declared a table with this name, it's reserved");
					}
				
			{
			{
			setState(193);
			match(OPEN_PAR);
			setState(194);
			((Create_table_stmtContext)_localctx).columnName1 = column_def();

							    names.add((String) (((Create_table_stmtContext)_localctx).columnName1.toReturn[0]));
							    types.add((Type) (((Create_table_stmtContext)_localctx).columnName1.toReturn[1]));
							    Pair<String, Object> p = (Pair<String, Object>) ((Create_table_stmtContext)_localctx).columnName1.toReturn[2];
							    if(p == null){
							    	nullable.add(true);
							    }else nullable.add(!p.a.equals("NOT_NULL")&&!p.a.equals("PRIMARY_KEY"));

							    if(p != null && p.a.equals("PRIMARY_KEY")){
							        pk.add(getFirstWord((((Create_table_stmtContext)_localctx).columnName1!=null?_input.getText(((Create_table_stmtContext)_localctx).columnName1.start,((Create_table_stmtContext)_localctx).columnName1.stop):null)));
							        numberOfDeclaredPK++;
							    }
							
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(196);
					match(COMMA);
					setState(197);
					((Create_table_stmtContext)_localctx).columnName2 = column_def();

										names.add((String) (((Create_table_stmtContext)_localctx).columnName2.toReturn[0]));
										types.add((Type) (((Create_table_stmtContext)_localctx).columnName2.toReturn[1]));
										p = (Pair<String, Object>) ((Create_table_stmtContext)_localctx).columnName2.toReturn[2];
										if(p == null){
											nullable.add(true);
										}else nullable.add(!p.a.equals("NOT_NULL")&&!p.a.equals("PRIMARY_KEY"));


										if(p != null && p.a.equals("PRIMARY_KEY")){
					   				        pk.add(getFirstWord((((Create_table_stmtContext)_localctx).columnName2!=null?_input.getText(((Create_table_stmtContext)_localctx).columnName2.start,((Create_table_stmtContext)_localctx).columnName2.stop):null)));
					   				        numberOfDeclaredPK++;
					                    }
									
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(205);
				match(COMMA);
				setState(206);
				((Create_table_stmtContext)_localctx).constraint = table_constraint();

									if(((Create_table_stmtContext)_localctx).constraint.parameters.a.equals("PRIMARY_KEY")){
										pk.addAll((List<String>) ((Create_table_stmtContext)_localctx).constraint.parameters.b);
										numberOfDeclaredPK++;
									}else if(((Create_table_stmtContext)_localctx).constraint.parameters.a.equals("FOREIGN_KEY")){
										TupleDesc td = (TupleDesc) ((Create_table_stmtContext)_localctx).constraint.parameters.b;
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
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			match(CLOSE_PAR);
			}


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
							isCreated = tm.CreateTable((((Create_table_stmtContext)_localctx).nameTable!=null?_input.getText(((Create_table_stmtContext)_localctx).nameTable.start,((Create_table_stmtContext)_localctx).nameTable.stop):null), new TupleDesc(types.toArray(Type[]::new), names.toArray(String[]::new), nullable.toArray(Boolean[]::new)));
						}catch(Exception e){
							terminateWithMessage(e.toString());
						}

						if(!isCreated){
							terminateWithMessage("the table '"+ (((Create_table_stmtContext)_localctx).nameTable!=null?_input.getText(((Create_table_stmtContext)_localctx).nameTable.start,((Create_table_stmtContext)_localctx).nameTable.stop):null) + "' already exists");
						}

						try{
							Table currentTable = tm.getTable((((Create_table_stmtContext)_localctx).nameTable!=null?_input.getText(((Create_table_stmtContext)_localctx).nameTable.start,((Create_table_stmtContext)_localctx).nameTable.stop):null));
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
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_defContext extends ParserRuleContext {
		public Object[] toReturn;
		public Column_nameContext nameColumn;
		public Type_nameContext typeName;
		public Column_constraintContext constraint;
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Column_constraintContext column_constraint() {
			return getRuleContext(Column_constraintContext.class,0);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

						((Column_defContext)_localctx).toReturn =  new Object[3];
					
			setState(219);
			((Column_defContext)_localctx).nameColumn = column_name();

						_localctx.toReturn[0] = (((Column_defContext)_localctx).nameColumn!=null?_input.getText(((Column_defContext)_localctx).nameColumn.start,((Column_defContext)_localctx).nameColumn.stop):null);
						_localctx.toReturn[1] = Type.STRING_TYPE;
						_localctx.toReturn[2] = null;
					
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT || _la==VARCHAR) {
				{
				setState(221);
				((Column_defContext)_localctx).typeName = type_name();
				_localctx.toReturn[1] = ((Column_defContext)_localctx).typeName.t;
				}
			}

			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT || _la==PRIMARY) {
				{
				setState(226);
				((Column_defContext)_localctx).constraint = column_constraint();
				_localctx.toReturn[2] = ((Column_defContext)_localctx).constraint.result;
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public Type t;
		public TerminalNode INT() { return getToken(SQLiteParser.INT, 0); }
		public TerminalNode VARCHAR() { return getToken(SQLiteParser.VARCHAR, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type_name);
		int _la;
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(INT);
				((Type_nameContext)_localctx).t =  Type.INT_TYPE;
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(VARCHAR);
				((Type_nameContext)_localctx).t =  Type.STRING_TYPE;
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR) {
					{
					setState(235);
					match(OPEN_PAR);
					setState(236);
					signed_number();
					setState(237);
					match(CLOSE_PAR);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraintContext extends ParserRuleContext {
		public Pair<String, Object> result;
		public TerminalNode PRIMARY() { return getToken(SQLiteParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(SQLiteParser.KEY, 0); }
		public TerminalNode NOT() { return getToken(SQLiteParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SQLiteParser.NULL, 0); }
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_column_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				{
				{
				setState(243);
				match(PRIMARY);
				setState(244);
				match(KEY);
				}
				((Column_constraintContext)_localctx).result =  new Pair("PRIMARY_KEY", 1);
				}
				break;
			case NOT:
				{
				{
				setState(247);
				match(NOT);
				setState(248);
				match(NULL);
				}
				((Column_constraintContext)_localctx).result =  new Pair("NOT_NULL", 1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLiteParser.NUMERIC_LITERAL, 0); }
		public TerminalNode PLUS() { return getToken(SQLiteParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLiteParser.MINUS, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(253);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(256);
			match(NUMERIC_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraintContext extends ParserRuleContext {
		public Pair<String, Object> parameters;
		public Indexed_columnContext columnNamePK1;
		public Indexed_columnContext columnNamePK2;
		public Column_nameContext columnNameFK1;
		public Column_nameContext columnNameFK2;
		public Foreign_key_clauseContext otherTable;
		public TerminalNode PRIMARY() { return getToken(SQLiteParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(SQLiteParser.KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode FOREIGN() { return getToken(SQLiteParser.FOREIGN, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode NOT() { return getToken(SQLiteParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SQLiteParser.NULL, 0); }
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitTable_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				{
				{
				setState(258);
				match(PRIMARY);
				setState(259);
				match(KEY);
				setState(260);
				match(OPEN_PAR);
				setState(261);
				((Table_constraintContext)_localctx).columnNamePK1 = indexed_column();

							    List<String> columnNames = new ArrayList<>();
								Pair<String, Object> p = new Pair<>("PRIMARY_KEY", columnNames);
								((Table_constraintContext)_localctx).parameters =  p;
								columnNames.add((((Table_constraintContext)_localctx).columnNamePK1!=null?_input.getText(((Table_constraintContext)_localctx).columnNamePK1.start,((Table_constraintContext)_localctx).columnNamePK1.stop):null));
								
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(263);
					match(COMMA);
					setState(264);
					((Table_constraintContext)_localctx).columnNamePK2 = indexed_column();
					columnNames.add((((Table_constraintContext)_localctx).columnNamePK2!=null?_input.getText(((Table_constraintContext)_localctx).columnNamePK2.start,((Table_constraintContext)_localctx).columnNamePK2.stop):null));
					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(272);
				match(CLOSE_PAR);
				}
				}
				break;
			case FOREIGN:
				{
				{
				setState(274);
				match(FOREIGN);
				setState(275);
				match(KEY);
				setState(276);
				match(OPEN_PAR);
				setState(277);
				((Table_constraintContext)_localctx).columnNameFK1 = column_name();

								List<String> columnNames = new ArrayList<>(); 
								columnNames.add((((Table_constraintContext)_localctx).columnNameFK1!=null?_input.getText(((Table_constraintContext)_localctx).columnNameFK1.start,((Table_constraintContext)_localctx).columnNameFK1.stop):null));
							 
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(279);
					match(COMMA);
					setState(280);
					((Table_constraintContext)_localctx).columnNameFK2 = column_name();
					columnNames.add((((Table_constraintContext)_localctx).columnNameFK2!=null?_input.getText(((Table_constraintContext)_localctx).columnNameFK2.start,((Table_constraintContext)_localctx).columnNameFK2.stop):null));
					}
					}
					setState(287);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(288);
				match(CLOSE_PAR);
				setState(289);
				((Table_constraintContext)_localctx).otherTable = foreign_key_clause();

								if(columnNames.size() != ((Table_constraintContext)_localctx).otherTable.tupleDescription.numFields()){
									terminateWithMessage("Invalid declaration FOREIGN_KEY, it must contain the same number of attributes in both part of the declaration");
								}

								((Table_constraintContext)_localctx).otherTable.tupleDescription.changeNames(columnNames);
								((Table_constraintContext)_localctx).otherTable.tupleDescription.setNullable(((Table_constraintContext)_localctx).otherTable.tupleDescription.getAttrNames());
								((Table_constraintContext)_localctx).parameters =  new Pair<>("FOREIGN_KEY", ((Table_constraintContext)_localctx).otherTable.tupleDescription);

							
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(291);
					match(NOT);
					setState(292);
					match(NULL);
					((Table_constraintContext)_localctx).otherTable.tupleDescription.setAllAttributesNullableValue(false);
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public TupleDesc tupleDescription;
		public Foreign_tableContext tableName;
		public Column_nameContext columnName1;
		public Column_nameContext columnName2;
		public TerminalNode REFERENCES() { return getToken(SQLiteParser.REFERENCES, 0); }
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterForeign_key_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitForeign_key_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitForeign_key_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			List<String> columns = new ArrayList<>();
			setState(299);
			match(REFERENCES);
			setState(300);
			((Foreign_key_clauseContext)_localctx).tableName = foreign_table();

					Table currentTable = tm.getTable((((Foreign_key_clauseContext)_localctx).tableName!=null?_input.getText(((Foreign_key_clauseContext)_localctx).tableName.start,((Foreign_key_clauseContext)_localctx).tableName.stop):null));
					if(currentTable == null){
						terminateWithMessage("The table '" + (((Foreign_key_clauseContext)_localctx).tableName!=null?_input.getText(((Foreign_key_clauseContext)_localctx).tableName.start,((Foreign_key_clauseContext)_localctx).tableName.stop):null) + "' referenced in the FOREIGN_KEY doesn't exists"); //table must exists
					}
				
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(302);
				match(OPEN_PAR);
				setState(303);
				((Foreign_key_clauseContext)_localctx).columnName1 = column_name();
				columns.add((((Foreign_key_clauseContext)_localctx).columnName1!=null?_input.getText(((Foreign_key_clauseContext)_localctx).columnName1.start,((Foreign_key_clauseContext)_localctx).columnName1.stop):null));
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(305);
					match(COMMA);
					setState(306);
					((Foreign_key_clauseContext)_localctx).columnName2 = column_name();
					columns.add((((Foreign_key_clauseContext)_localctx).columnName2!=null?_input.getText(((Foreign_key_clauseContext)_localctx).columnName2.start,((Foreign_key_clauseContext)_localctx).columnName2.stop):null));
					}
					}
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(314);
				match(CLOSE_PAR);
				}
			}


					try{
						((Foreign_key_clauseContext)_localctx).tupleDescription =  currentTable.getTupleDesc().subset(columns, (((Foreign_key_clauseContext)_localctx).tableName!=null?_input.getText(((Foreign_key_clauseContext)_localctx).tableName.start,((Foreign_key_clauseContext)_localctx).tableName.stop):null));

						for(int i = 0; i < columns.size(); i++){
							_localctx.tupleDescription.addReferenceTo((((Foreign_key_clauseContext)_localctx).tableName!=null?_input.getText(((Foreign_key_clauseContext)_localctx).tableName.start,((Foreign_key_clauseContext)_localctx).tableName.stop):null), columns.get(i), i);
						}
					}catch(Exception e){
						terminateWithMessage(e.toString());
					}
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Cte_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterCte_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitCte_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitCte_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_table_nameContext cte_table_name() throws RecognitionException {
		Cte_table_nameContext _localctx = new Cte_table_nameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			table_name();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(321);
				match(OPEN_PAR);
				setState(322);
				column_name();
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(323);
					match(COMMA);
					setState(324);
					column_name();
					}
					}
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(330);
				match(CLOSE_PAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Recursive_cteContext extends ParserRuleContext {
		public Cte_table_nameContext cte_table_name() {
			return getRuleContext(Cte_table_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLiteParser.AS, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public Initial_selectContext initial_select() {
			return getRuleContext(Initial_selectContext.class,0);
		}
		public TerminalNode UNION() { return getToken(SQLiteParser.UNION, 0); }
		public Recursive_selectContext recursive_select() {
			return getRuleContext(Recursive_selectContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode ALL() { return getToken(SQLiteParser.ALL, 0); }
		public Recursive_cteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recursive_cte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterRecursive_cte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitRecursive_cte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitRecursive_cte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Recursive_cteContext recursive_cte() throws RecognitionException {
		Recursive_cteContext _localctx = new Recursive_cteContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_recursive_cte);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			cte_table_name();
			setState(335);
			match(AS);
			setState(336);
			match(OPEN_PAR);
			setState(337);
			initial_select();
			setState(338);
			match(UNION);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL) {
				{
				setState(339);
				match(ALL);
				}
			}

			setState(342);
			recursive_select();
			setState(343);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Common_table_expressionContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLiteParser.AS, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitCommon_table_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitCommon_table_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			table_name();
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(346);
				match(OPEN_PAR);
				setState(347);
				column_name();
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(348);
					match(COMMA);
					setState(349);
					column_name();
					}
					}
					setState(354);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(355);
				match(CLOSE_PAR);
				}
			}

			setState(359);
			match(AS);
			setState(360);
			match(OPEN_PAR);
			setState(361);
			select_stmt();
			setState(362);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_stmtContext extends ParserRuleContext {
		public Table_nameContext Table_name;
		public BooleanExprContext bNode;
		public TerminalNode DELETE() { return getToken(SQLiteParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SQLiteParser.FROM, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SQLiteParser.WHERE, 0); }
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitDelete_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(DELETE);
			setState(365);
			match(FROM);
			setState(366);
			((Delete_stmtContext)_localctx).Table_name = table_name();

					Table currentTable = tm.getTable((((Delete_stmtContext)_localctx).Table_name!=null?_input.getText(((Delete_stmtContext)_localctx).Table_name.start,((Delete_stmtContext)_localctx).Table_name.stop):null));
					if(currentTable == null){
						Exception e = new NotFoundedTableException((((Delete_stmtContext)_localctx).Table_name!=null?_input.getText(((Delete_stmtContext)_localctx).Table_name.start,((Delete_stmtContext)_localctx).Table_name.stop):null));
						terminateWithMessage(e.toString());
					}

					leaves = new ArrayList<>();
					BooleanNode head = null;
					try{
						 head = new UnaryBooleanNode(true, Operators.UnaryBooleanOp.LEAF);
					}catch(Exception e){}
				
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(368);
				match(WHERE);
				setState(369);
				((Delete_stmtContext)_localctx).bNode = booleanExpr(0);
				head = ((Delete_stmtContext)_localctx).bNode.node;
				}
			}


					WhereBooleanTree booleanTree = new WhereBooleanTree(head, leaves);
					try{
						currentTable.removeTuplesWithCondition(booleanTree);
					}catch(Exception e){
						terminateWithMessage(e.toString());
					}
					tm.UnloadAndWaitTermination();
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_stmtContext extends ParserRuleContext {
		public Any_nameContext tableName;
		public TerminalNode DROP() { return getToken(SQLiteParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SQLiteParser.TABLE, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SQLiteParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SQLiteParser.EXISTS, 0); }
		public Drop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterDrop_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitDrop_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitDrop_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_stmtContext drop_stmt() throws RecognitionException {
		Drop_stmtContext _localctx = new Drop_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_drop_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			boolean ifExists = false;
			setState(377);
			match(DROP);
			setState(378);
			match(TABLE);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(379);
				match(IF);
				setState(380);
				match(EXISTS);
				ifExists = true;
				}
			}

			setState(384);
			((Drop_stmtContext)_localctx).tableName = any_name();

					try{
						tm.deleteTable((((Drop_stmtContext)_localctx).tableName!=null?_input.getText(((Drop_stmtContext)_localctx).tableName.start,((Drop_stmtContext)_localctx).tableName.stop):null));
					}catch(Exception e){
						if(!(e instanceof NotFoundedTableException) || !ifExists){
							terminateWithMessage(e.toString());
						}
					}
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExprContext extends ParserRuleContext {
		public BooleanNode node;
		public BooleanExprContext expNodeLeft;
		public BooleanExprContext expNode;
		public Boolean_literalContext literal;
		public FieldExprContext expNodeLeftField;
		public FieldExprContext expNodeRightField;
		public FieldExprContext expNodeField;
		public BooleanExprContext expNodeRight;
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<BooleanExprContext> booleanExpr() {
			return getRuleContexts(BooleanExprContext.class);
		}
		public BooleanExprContext booleanExpr(int i) {
			return getRuleContext(BooleanExprContext.class,i);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SQLiteParser.NOT, 0); }
		public List<FieldExprContext> fieldExpr() {
			return getRuleContexts(FieldExprContext.class);
		}
		public FieldExprContext fieldExpr(int i) {
			return getRuleContext(FieldExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(SQLiteParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SQLiteParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SQLiteParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SQLiteParser.GT_EQ, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLiteParser.ASSIGN, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SQLiteParser.NOT_EQ2, 0); }
		public TerminalNode ISNULL() { return getToken(SQLiteParser.ISNULL, 0); }
		public TerminalNode AND() { return getToken(SQLiteParser.AND, 0); }
		public TerminalNode OR() { return getToken(SQLiteParser.OR, 0); }
		public BooleanExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterBooleanExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitBooleanExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitBooleanExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExprContext booleanExpr() throws RecognitionException {
		return booleanExpr(0);
	}

	private BooleanExprContext booleanExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExprContext _localctx = new BooleanExprContext(_ctx, _parentState);
		BooleanExprContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_booleanExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(388);
				match(OPEN_PAR);
				setState(389);
				((BooleanExprContext)_localctx).expNode = booleanExpr(0);
				setState(390);
				match(CLOSE_PAR);
				((BooleanExprContext)_localctx).node =  ((BooleanExprContext)_localctx).expNode.node;
				}
				break;
			case 2:
				{
				setState(393);
				((BooleanExprContext)_localctx).literal = boolean_literal();
				((BooleanExprContext)_localctx).node =  ((BooleanExprContext)_localctx).literal.node;
				}
				break;
			case 3:
				{
				setState(396);
				match(NOT);
				setState(397);
				((BooleanExprContext)_localctx).expNode = booleanExpr(5);

							try{
								((BooleanExprContext)_localctx).node =  new UnaryBooleanNode(((BooleanExprContext)_localctx).expNode.node, Operators.UnaryBooleanOp.NOT);
							}catch(InvalidTypesException e){
								terminateWithMessage(e.toString());
							}
						
				}
				break;
			case 4:
				{
				setState(400);
				((BooleanExprContext)_localctx).expNodeLeftField = fieldExpr(0);
				String op;
				setState(414);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(402);
					match(LT);
					op = "<";
					}
					break;
				case LT_EQ:
					{
					setState(404);
					match(LT_EQ);
					op = "<=";
					}
					break;
				case GT:
					{
					setState(406);
					match(GT);
					op = ">";
					}
					break;
				case GT_EQ:
					{
					setState(408);
					match(GT_EQ);
					op = ">=";
					}
					break;
				case ASSIGN:
					{
					setState(410);
					match(ASSIGN);
					op = "=";
					}
					break;
				case NOT_EQ2:
					{
					setState(412);
					match(NOT_EQ2);
					op = "<>";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(416);
				((BooleanExprContext)_localctx).expNodeRightField = fieldExpr(0);

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
						((BooleanExprContext)_localctx).node =  new OrderBooleanNode(((BooleanExprContext)_localctx).expNodeLeftField.node, ((BooleanExprContext)_localctx).expNodeRightField.node, operator);

					
				}
				break;
			case 5:
				{
				setState(419);
				((BooleanExprContext)_localctx).expNodeField = fieldExpr(0);
				setState(420);
				match(ISNULL);
				((BooleanExprContext)_localctx).node =  new NullOperatorNode(Operators.NullOp.ISNULL, ((BooleanExprContext)_localctx).expNodeField.node);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(437);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(435);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanExprContext(_parentctx, _parentState);
						_localctx.expNodeLeft = _prevctx;
						_localctx.expNodeLeft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpr);
						setState(425);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(426);
						match(AND);
						setState(427);
						((BooleanExprContext)_localctx).expNodeRight = booleanExpr(4);

						          		((BooleanExprContext)_localctx).node =  new BinaryBooleanNode(((BooleanExprContext)_localctx).expNodeLeft.node, ((BooleanExprContext)_localctx).expNodeRight.node , Operators.BinaryBooleanOp.AND);
						          	
						}
						break;
					case 2:
						{
						_localctx = new BooleanExprContext(_parentctx, _parentState);
						_localctx.expNodeLeft = _prevctx;
						_localctx.expNodeLeft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpr);
						setState(430);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(431);
						match(OR);
						setState(432);
						((BooleanExprContext)_localctx).expNodeRight = booleanExpr(3);

						          		((BooleanExprContext)_localctx).node =  new BinaryBooleanNode(((BooleanExprContext)_localctx).expNodeLeft.node, ((BooleanExprContext)_localctx).expNodeRight.node , Operators.BinaryBooleanOp.OR);
						          	
						}
						break;
					}
					} 
				}
				setState(439);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FieldExprContext extends ParserRuleContext {
		public NodeField node;
		public FieldExprContext expNodeLeft;
		public FieldExprContext expNodePar;
		public FieldExprContext numVal;
		public Field_litteralContext expNode;
		public FieldExprContext expNodeRight;
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<FieldExprContext> fieldExpr() {
			return getRuleContexts(FieldExprContext.class);
		}
		public FieldExprContext fieldExpr(int i) {
			return getRuleContext(FieldExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(SQLiteParser.MINUS, 0); }
		public Field_litteralContext field_litteral() {
			return getRuleContext(Field_litteralContext.class,0);
		}
		public TerminalNode STAR() { return getToken(SQLiteParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(SQLiteParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(SQLiteParser.PLUS, 0); }
		public FieldExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterFieldExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitFieldExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitFieldExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldExprContext fieldExpr() throws RecognitionException {
		return fieldExpr(0);
	}

	private FieldExprContext fieldExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FieldExprContext _localctx = new FieldExprContext(_ctx, _parentState);
		FieldExprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_fieldExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(441);
				match(OPEN_PAR);
				setState(442);
				((FieldExprContext)_localctx).expNodePar = fieldExpr(0);
				setState(443);
				match(CLOSE_PAR);
				((FieldExprContext)_localctx).node =  ((FieldExprContext)_localctx).expNodePar.node;
				}
				break;
			case 2:
				{
				setState(446);
				match(MINUS);
				setState(447);
				((FieldExprContext)_localctx).numVal = fieldExpr(4);

						LeafFieldNode toMultiply = new LeafFieldNode(""); toMultiply.setField(new IntField(-1));
						((FieldExprContext)_localctx).node =  new ArithmeticFieldNode(((FieldExprContext)_localctx).numVal.node, toMultiply , Operators.ArithmeticOp.MUL); 
						
				}
				break;
			case 3:
				{
				setState(450);
				((FieldExprContext)_localctx).expNode = field_litteral();
				((FieldExprContext)_localctx).node =  ((FieldExprContext)_localctx).expNode.node;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(479);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(477);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new FieldExprContext(_parentctx, _parentState);
						_localctx.expNodeLeft = _prevctx;
						_localctx.expNodeLeft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_fieldExpr);
						setState(455);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						String op;
						setState(461);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case STAR:
							{
							setState(457);
							match(STAR);
							op = "*";
							}
							break;
						case DIV:
							{
							setState(459);
							match(DIV);
							op = "/";
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(463);
						((FieldExprContext)_localctx).expNodeRight = fieldExpr(3);

						          		Operators.ArithmeticOp operator = Operators.ArithmeticOp.MUL;
						          		if(op.equals("*")){
						          			operator = Operators.ArithmeticOp.MUL;
						          		}else operator = Operators.ArithmeticOp.DIV;
						          		((FieldExprContext)_localctx).node =  new ArithmeticFieldNode(((FieldExprContext)_localctx).expNodeLeft.node, ((FieldExprContext)_localctx).expNodeRight.node , operator); 
						          	
						}
						break;
					case 2:
						{
						_localctx = new FieldExprContext(_parentctx, _parentState);
						_localctx.expNodeLeft = _prevctx;
						_localctx.expNodeLeft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_fieldExpr);
						setState(466);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						String op;
						setState(472);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case PLUS:
							{
							setState(468);
							match(PLUS);
							op = "+";
							}
							break;
						case MINUS:
							{
							setState(470);
							match(MINUS);
							op = "-";
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(474);
						((FieldExprContext)_localctx).expNodeRight = fieldExpr(2);

						          		Operators.ArithmeticOp operator = operator = Operators.ArithmeticOp.ADD;
						          		if(op.equals("+")){
						          			operator = Operators.ArithmeticOp.ADD;
						          		}else operator = Operators.ArithmeticOp.SUB;
						          		((FieldExprContext)_localctx).node =  new ArithmeticFieldNode(((FieldExprContext)_localctx).expNodeLeft.node, ((FieldExprContext)_localctx).expNodeRight.node , operator); 
						          	
						}
						break;
					}
					} 
				}
				setState(481);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Literal_valueContext extends ParserRuleContext {
		public WhereTreeNode literal;
		public Token numVal;
		public Token strVal;
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLiteParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public TerminalNode NULL() { return getToken(SQLiteParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(SQLiteParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SQLiteParser.FALSE, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_literal_value);
		try {
			setState(487);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				((Literal_valueContext)_localctx).numVal = match(NUMERIC_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
				((Literal_valueContext)_localctx).strVal = match(STRING_LITERAL);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(484);
				match(NULL);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(485);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(486);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_literalContext extends ParserRuleContext {
		public BooleanNode node;
		public TerminalNode TRUE() { return getToken(SQLiteParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SQLiteParser.FALSE, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitBoolean_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitBoolean_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_boolean_literal);
		try {
			setState(493);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				match(TRUE);
				try{
							((Boolean_literalContext)_localctx).node =  new UnaryBooleanNode(true, Operators.UnaryBooleanOp.LEAF);
						}catch(InvalidTypesException e){
								terminateWithMessage(e.toString());
							}
						
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				match(FALSE);
				try{
							((Boolean_literalContext)_localctx).node =  new UnaryBooleanNode(false, Operators.UnaryBooleanOp.LEAF);
						}catch(InvalidTypesException e){
								terminateWithMessage(e.toString());
						}
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_litteralContext extends ParserRuleContext {
		public NodeField node;
		public Token numVal;
		public Token strVal;
		public Table_nameContext aliasAttr;
		public Column_nameContext columnName;
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLiteParser.NUMERIC_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SQLiteParser.MINUS, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public TerminalNode NULL() { return getToken(SQLiteParser.NULL, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Field_litteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_litteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterField_litteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitField_litteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitField_litteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_litteralContext field_litteral() throws RecognitionException {
		Field_litteralContext _localctx = new Field_litteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_field_litteral);
		int _la;
		try {
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				int sign = 1;
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(497);
					match(MINUS);
					sign = -1;
					}
				}

				setState(501);
				((Field_litteralContext)_localctx).numVal = match(NUMERIC_LITERAL);
				((Field_litteralContext)_localctx).node =  new LeafFieldNode(""); ((LeafFieldNode)_localctx.node).setField(new IntField(Integer.parseInt((((Field_litteralContext)_localctx).numVal!=null?((Field_litteralContext)_localctx).numVal.getText():null))*sign));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(503);
				((Field_litteralContext)_localctx).strVal = match(STRING_LITERAL);

						if(Pattern.compile("^(true|false)$").matcher((((Field_litteralContext)_localctx).strVal!=null?((Field_litteralContext)_localctx).strVal.getText():null)).matches()){
							terminateWithMessage("Can't apply the operator '=' on boolean values");
						}
						((Field_litteralContext)_localctx).node =  new LeafFieldNode(""); ((LeafFieldNode)_localctx.node).setField(new StringField((((Field_litteralContext)_localctx).strVal!=null?((Field_litteralContext)_localctx).strVal.getText():null)));
						
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(505);
				match(NULL);
				((Field_litteralContext)_localctx).node =  new LeafFieldNode("");	((LeafFieldNode)_localctx.node).setField(new NullField());
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				String aliasToSet = "";
				setState(512);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(508);
					((Field_litteralContext)_localctx).aliasAttr = table_name();
					setState(509);
					match(DOT);
					aliasToSet = (((Field_litteralContext)_localctx).aliasAttr!=null?_input.getText(((Field_litteralContext)_localctx).aliasAttr.start,((Field_litteralContext)_localctx).aliasAttr.stop):null);
					}
					break;
				}
				setState(514);
				((Field_litteralContext)_localctx).columnName = column_name();

						if(Pattern.compile("^(true|false)$").matcher((((Field_litteralContext)_localctx).columnName!=null?_input.getText(((Field_litteralContext)_localctx).columnName.start,((Field_litteralContext)_localctx).columnName.stop):null)).matches()){
							terminateWithMessage("Can't apply the operator '=' on boolean values");
						}
						LeafFieldNode leaf = new LeafFieldNode((((Field_litteralContext)_localctx).columnName!=null?_input.getText(((Field_litteralContext)_localctx).columnName.start,((Field_litteralContext)_localctx).columnName.stop):null));
						leaf.setAlias(aliasToSet);
						leaves.add(leaf);
						((Field_litteralContext)_localctx).node =  leaf;
						
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_valuesContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLiteParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Insert_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterInsert_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitInsert_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitInsert_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_valuesContext insert_values() throws RecognitionException {
		Insert_valuesContext _localctx = new Insert_valuesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_insert_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			_la = _input.LA(1);
			if ( !(_la==NUMERIC_LITERAL || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmtContext extends ParserRuleContext {
		public Table_nameContext nameTable;
		public Column_nameContext columnName1;
		public Column_nameContext columnName2;
		public Insert_valuesContext v1;
		public Insert_valuesContext v2;
		public Insert_valuesContext v11;
		public Insert_valuesContext v12;
		public TerminalNode INTO() { return getToken(SQLiteParser.INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode INSERT() { return getToken(SQLiteParser.INSERT, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode VALUES() { return getToken(SQLiteParser.VALUES, 0); }
		public List<Insert_valuesContext> insert_values() {
			return getRuleContexts(Insert_valuesContext.class);
		}
		public Insert_valuesContext insert_values(int i) {
			return getRuleContext(Insert_valuesContext.class,i);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(521);
			match(INSERT);
			}
			setState(522);
			match(INTO);
			setState(523);
			((Insert_stmtContext)_localctx).nameTable = table_name();

					Table table = tm.getTable((((Insert_stmtContext)_localctx).nameTable!=null?_input.getText(((Insert_stmtContext)_localctx).nameTable.start,((Insert_stmtContext)_localctx).nameTable.stop):null));
					if(table == null){
						terminateWithMessage("the table '"+ (((Insert_stmtContext)_localctx).nameTable!=null?_input.getText(((Insert_stmtContext)_localctx).nameTable.start,((Insert_stmtContext)_localctx).nameTable.stop):null) + "' doesn't exists");
					}
					TupleDesc td = table.getTupleDesc();

					List<Tuple> toAdd = new ArrayList<>();
					List<String> columns = new ArrayList<>();
					List<String> tempValues = new ArrayList<>();
				
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(525);
				match(OPEN_PAR);
				setState(526);
				((Insert_stmtContext)_localctx).columnName1 = column_name();
				columns.add((((Insert_stmtContext)_localctx).columnName1!=null?_input.getText(((Insert_stmtContext)_localctx).columnName1.start,((Insert_stmtContext)_localctx).columnName1.stop):null));
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(528);
					match(COMMA);
					setState(529);
					((Insert_stmtContext)_localctx).columnName2 = column_name();
					columns.add((((Insert_stmtContext)_localctx).columnName2!=null?_input.getText(((Insert_stmtContext)_localctx).columnName2.start,((Insert_stmtContext)_localctx).columnName2.stop):null));
					}
					}
					setState(536);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(537);
				match(CLOSE_PAR);
				}
			}

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

					
			{
			{
			setState(542);
			match(VALUES);
			setState(543);
			match(OPEN_PAR);
			setState(544);
			((Insert_stmtContext)_localctx).v1 = insert_values();
			tempValues.add((((Insert_stmtContext)_localctx).v1!=null?_input.getText(((Insert_stmtContext)_localctx).v1.start,((Insert_stmtContext)_localctx).v1.stop):null));
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(546);
				match(COMMA);
				setState(547);
				((Insert_stmtContext)_localctx).v2 = insert_values();
				tempValues.add((((Insert_stmtContext)_localctx).v2!=null?_input.getText(((Insert_stmtContext)_localctx).v2.start,((Insert_stmtContext)_localctx).v2.stop):null));
				}
				}
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(555);
			match(CLOSE_PAR);

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

								
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(557);
				match(COMMA);
				setState(558);
				match(OPEN_PAR);
				setState(559);
				((Insert_stmtContext)_localctx).v11 = insert_values();
				tempValues = new ArrayList<>(); tempValues.add((((Insert_stmtContext)_localctx).v11!=null?_input.getText(((Insert_stmtContext)_localctx).v11.start,((Insert_stmtContext)_localctx).v11.stop):null));
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(561);
					match(COMMA);
					setState(562);
					((Insert_stmtContext)_localctx).v12 = insert_values();
					tempValues.add((((Insert_stmtContext)_localctx).v12!=null?_input.getText(((Insert_stmtContext)_localctx).v12.start,((Insert_stmtContext)_localctx).v12.stop):null));
					}
					}
					setState(569);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

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
									
				setState(571);
				match(CLOSE_PAR);
				}
				}
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
				
						for(Tuple tuple: toAdd){
							try{
								table.addTuple(tuple, false);
							}catch(Exception e){
								terminateWithMessage(e.toString());
							}
						}
					
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_stmtContext extends ParserRuleContext {
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public Order_by_stmtContext order_by_stmt() {
			return getRuleContext(Order_by_stmtContext.class,0);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			select_core();
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(581);
				order_by_stmt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_coreContext extends ParserRuleContext {
		public Table t;
		public Result_columnContext result1;
		public Result_columnContext result2;
		public CartesianContext resultNode;
		public BooleanExprContext headNode;
		public TerminalNode SELECT() { return getToken(SQLiteParser.SELECT, 0); }
		public TerminalNode STAR() { return getToken(SQLiteParser.STAR, 0); }
		public TerminalNode FROM() { return getToken(SQLiteParser.FROM, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public CartesianContext cartesian() {
			return getRuleContext(CartesianContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SQLiteParser.WHERE, 0); }
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSelect_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSelect_core(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSelect_core(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_select_core);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
					List<String> attrToSelect = new ArrayList<>(); 
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
						
			setState(585);
			match(SELECT);
			setState(599);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(586);
				match(STAR);
				attrToSelect.add("*");
				}
				break;
			case OPEN_PAR:
			case ADD:
			case ALL:
			case ALTER:
			case AND:
			case AS:
			case ASC:
			case BETWEEN:
			case BY:
			case EXCEPT:
			case COLUMN:
			case CREATE:
			case CURRENT_DATE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case DATABASE:
			case DEFAULT:
			case DELETE:
			case DESC:
			case DETACH:
			case DISTINCT:
			case DROP:
			case EXCLUSIVE:
			case EXISTS:
			case FROM:
			case GROUP:
			case HAVING:
			case IN:
			case INNER:
			case INSERT:
			case INTERSECT:
			case INTO:
			case IS:
			case ISNULL:
			case JOIN:
			case KEY:
			case LEFT:
			case LIKE:
			case MATCH:
			case NATURAL:
			case NO:
			case NOT:
			case NOTNULL:
			case NULL:
			case OF:
			case OFFSET:
			case ON:
			case OR:
			case ORDER:
			case OUTER:
			case PRIMARY:
			case QUERY:
			case RECURSIVE:
			case REFERENCES:
			case RELEASE:
			case RENAME:
			case REPLACE:
			case RESTRICT:
			case RIGHT:
			case SELECT:
			case SET:
			case TABLE:
			case TO:
			case TRANSACTION:
			case UNION:
			case UNIQUE:
			case UPDATE:
			case VALUES:
			case WHEN:
			case WHERE:
			case WITH:
			case WITHOUT:
			case TRUE:
			case FALSE:
			case NULLS:
			case FIRST:
			case LAST:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(588);
				((Select_coreContext)_localctx).result1 = result_column();
				attrToSelect.add((((Select_coreContext)_localctx).result1!=null?_input.getText(((Select_coreContext)_localctx).result1.start,((Select_coreContext)_localctx).result1.stop):null));
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(590);
					match(COMMA);
					setState(591);
					((Select_coreContext)_localctx).result2 = result_column();
					attrToSelect.add((((Select_coreContext)_localctx).result2!=null?_input.getText(((Select_coreContext)_localctx).result2.start,((Select_coreContext)_localctx).result2.stop):null));
					}
					}
					setState(598);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			{
			setState(601);
			match(FROM);
			setState(602);
			((Select_coreContext)_localctx).resultNode = cartesian();
			headFromNode = ((Select_coreContext)_localctx).resultNode.nodeToReturn;
			}
			leaves = new ArrayList<>();
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(606);
				match(WHERE);
				setState(607);
				((Select_coreContext)_localctx).headNode = booleanExpr(0);
				head = ((Select_coreContext)_localctx).headNode.node;
				}
			}


					try{
						resultTable = headFromNode.execute();
						result.changeString(resultTable.getStringTableSelect(attrToSelect, new WhereBooleanTree(head, leaves)));
					}catch(Exception e){
						terminateWithMessage(e.toString());
					}
				
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factored_select_stmtContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Factored_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factored_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterFactored_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitFactored_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitFactored_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factored_select_stmtContext factored_select_stmt() throws RecognitionException {
		Factored_select_stmtContext _localctx = new Factored_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_factored_select_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			select_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_select_stmtContext extends ParserRuleContext {
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public Order_by_stmtContext order_by_stmt() {
			return getRuleContext(Order_by_stmtContext.class,0);
		}
		public Simple_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSimple_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSimple_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSimple_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_select_stmtContext simple_select_stmt() throws RecognitionException {
		Simple_select_stmtContext _localctx = new Simple_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_simple_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			select_core();
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(617);
				order_by_stmt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public Order_by_stmtContext order_by_stmt() {
			return getRuleContext(Order_by_stmtContext.class,0);
		}
		public List<TerminalNode> INTERSECT() { return getTokens(SQLiteParser.INTERSECT); }
		public TerminalNode INTERSECT(int i) {
			return getToken(SQLiteParser.INTERSECT, i);
		}
		public List<TerminalNode> EXCEPT() { return getTokens(SQLiteParser.EXCEPT); }
		public TerminalNode EXCEPT(int i) {
			return getToken(SQLiteParser.EXCEPT, i);
		}
		public List<TerminalNode> UNION() { return getTokens(SQLiteParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(SQLiteParser.UNION, i);
		}
		public List<TerminalNode> ALL() { return getTokens(SQLiteParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(SQLiteParser.ALL, i);
		}
		public Compound_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterCompound_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitCompound_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitCompound_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_select_stmtContext compound_select_stmt() throws RecognitionException {
		Compound_select_stmtContext _localctx = new Compound_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_compound_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			select_core();
			setState(630); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(627);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case UNION:
					{
					{
					setState(621);
					match(UNION);
					setState(623);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ALL) {
						{
						setState(622);
						match(ALL);
						}
					}

					}
					}
					break;
				case INTERSECT:
					{
					setState(625);
					match(INTERSECT);
					}
					break;
				case EXCEPT:
					{
					setState(626);
					match(EXCEPT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(629);
				select_core();
				}
				}
				setState(632); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==EXCEPT || _la==INTERSECT || _la==UNION );
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(634);
				order_by_stmt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CartesianContext extends ParserRuleContext {
		public FromClauseNode nodeToReturn;
		public JoinContext n1;
		public Cartesian_1Context n2;
		public JoinContext join() {
			return getRuleContext(JoinContext.class,0);
		}
		public Cartesian_1Context cartesian_1() {
			return getRuleContext(Cartesian_1Context.class,0);
		}
		public CartesianContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cartesian; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterCartesian(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitCartesian(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitCartesian(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CartesianContext cartesian() throws RecognitionException {
		CartesianContext _localctx = new CartesianContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_cartesian);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			((CartesianContext)_localctx).n1 = join();
			setState(638);
			((CartesianContext)_localctx).n2 = cartesian_1(((CartesianContext)_localctx).n1.nodeToReturn);
			((CartesianContext)_localctx).nodeToReturn =  ((CartesianContext)_localctx).n2.nodeToReturn;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cartesian_1Context extends ParserRuleContext {
		public FromClauseNode n;
		public FromClauseNode nodeToReturn;
		public JoinContext n1;
		public Cartesian_1Context n2;
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public JoinContext join() {
			return getRuleContext(JoinContext.class,0);
		}
		public Cartesian_1Context cartesian_1() {
			return getRuleContext(Cartesian_1Context.class,0);
		}
		public Cartesian_1Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Cartesian_1Context(ParserRuleContext parent, int invokingState, FromClauseNode n) {
			super(parent, invokingState);
			this.n = n;
		}
		@Override public int getRuleIndex() { return RULE_cartesian_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterCartesian_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitCartesian_1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitCartesian_1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cartesian_1Context cartesian_1(FromClauseNode n) throws RecognitionException {
		Cartesian_1Context _localctx = new Cartesian_1Context(_ctx, getState(), n);
		enterRule(_localctx, 60, RULE_cartesian_1);
		try {
			setState(647);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(641);
				match(COMMA);
				setState(642);
				((Cartesian_1Context)_localctx).n1 = join();
				setState(643);
				((Cartesian_1Context)_localctx).n2 = cartesian_1(new OperationTableNode(n, ((Cartesian_1Context)_localctx).n1.nodeToReturn, OperationTableNode.Op.CARTESIAN_PRODUCT , sessionID));
				((Cartesian_1Context)_localctx).nodeToReturn =  ((Cartesian_1Context)_localctx).n2.nodeToReturn;
				}
				break;
			case EOF:
			case SCOL:
			case CLOSE_PAR:
			case EXCEPT:
			case CREATE:
			case DELETE:
			case DROP:
			case INSERT:
			case INTERSECT:
			case ORDER:
			case SELECT:
			case SHOW:
			case UNION:
			case WHERE:
			case UNEXPECTED_CHAR:
				enterOuterAlt(_localctx, 2);
				{
				((Cartesian_1Context)_localctx).nodeToReturn =  n;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinContext extends ParserRuleContext {
		public FromClauseNode nodeToReturn;
		public TermContext n1;
		public Join_1Context n2;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Join_1Context join_1() {
			return getRuleContext(Join_1Context.class,0);
		}
		public JoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinContext join() throws RecognitionException {
		JoinContext _localctx = new JoinContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_join);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			((JoinContext)_localctx).n1 = term();
			setState(650);
			((JoinContext)_localctx).n2 = join_1(((JoinContext)_localctx).n1.nodeToReturn);
			((JoinContext)_localctx).nodeToReturn =  ((JoinContext)_localctx).n2.nodeToReturn;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_1Context extends ParserRuleContext {
		public FromClauseNode n;
		public FromClauseNode nodeToReturn;
		public TermContext n1;
		public Join_1Context n2;
		public BooleanExprContext constraint;
		public TerminalNode JOIN() { return getToken(SQLiteParser.JOIN, 0); }
		public TerminalNode ON() { return getToken(SQLiteParser.ON, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List<Join_1Context> join_1() {
			return getRuleContexts(Join_1Context.class);
		}
		public Join_1Context join_1(int i) {
			return getRuleContext(Join_1Context.class,i);
		}
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public Join_1Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Join_1Context(ParserRuleContext parent, int invokingState, FromClauseNode n) {
			super(parent, invokingState);
			this.n = n;
		}
		@Override public int getRuleIndex() { return RULE_join_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterJoin_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitJoin_1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitJoin_1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_1Context join_1(FromClauseNode n) throws RecognitionException {
		Join_1Context _localctx = new Join_1Context(_ctx, getState(), n);
		enterRule(_localctx, 64, RULE_join_1);
		try {
			setState(666);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				match(JOIN);
				setState(654);
				((Join_1Context)_localctx).n1 = term();
				OperationTableNode joinNode = new OperationTableNode(n, ((Join_1Context)_localctx).n1.nodeToReturn, OperationTableNode.Op.JOIN , sessionID);
								  leaves = new ArrayList<>();
				setState(656);
				((Join_1Context)_localctx).n2 = join_1(joinNode);
				setState(657);
				match(ON);
				setState(658);
				match(OPEN_PAR);
				setState(659);
				((Join_1Context)_localctx).constraint = booleanExpr(0);
				setState(660);
				match(CLOSE_PAR);

						WhereBooleanTree booleanTree = new WhereBooleanTree(((Join_1Context)_localctx).constraint.node, leaves);
						joinNode.setConstraint(booleanTree);
					
				setState(662);
				((Join_1Context)_localctx).n2 = join_1(((Join_1Context)_localctx).n2.nodeToReturn);
				((Join_1Context)_localctx).nodeToReturn =  ((Join_1Context)_localctx).n2.nodeToReturn;
				}
				break;
			case EOF:
			case SCOL:
			case CLOSE_PAR:
			case COMMA:
			case EXCEPT:
			case CREATE:
			case DELETE:
			case DROP:
			case INSERT:
			case INTERSECT:
			case ON:
			case ORDER:
			case SELECT:
			case SHOW:
			case UNION:
			case WHERE:
			case UNEXPECTED_CHAR:
				enterOuterAlt(_localctx, 2);
				{
				((Join_1Context)_localctx).nodeToReturn =  n;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public FromClauseNode nodeToReturn;
		public Table_nameContext Table_name;
		public Table_aliasContext Table_alias;
		public CartesianContext n;
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLiteParser.AS, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public CartesianContext cartesian() {
			return getRuleContext(CartesianContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_term);
		try {
			setState(686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(669);
				((TermContext)_localctx).Table_name = table_name();

							/*Execute controls on existance of Table_name in Db getting Table 'Ti' from Table_name
							If it doesn't exists return failure and terminate parsing
							*/
							boolean isSetAlias = false;
							Table currentTable = tm.getTable((((TermContext)_localctx).Table_name!=null?_input.getText(((TermContext)_localctx).Table_name.start,((TermContext)_localctx).Table_name.stop):null));
							if(currentTable == null){
								Exception e = new NotFoundedTableException((((TermContext)_localctx).Table_name!=null?_input.getText(((TermContext)_localctx).Table_name.start,((TermContext)_localctx).Table_name.stop):null));
								terminateWithMessage(e.toString());
							}
						
				setState(677);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(672);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						setState(671);
						match(AS);
						}
						break;
					}
					setState(674);
					((TermContext)_localctx).Table_alias = table_alias();

								isSetAlias = true;
								if(tm.getTable((((TermContext)_localctx).Table_alias!=null?_input.getText(((TermContext)_localctx).Table_alias.start,((TermContext)_localctx).Table_alias.stop):null)) != null){
									Table daeliminare = tm.getTable((((TermContext)_localctx).Table_alias!=null?_input.getText(((TermContext)_localctx).Table_alias.start,((TermContext)_localctx).Table_alias.stop):null));
									terminateWithMessage("The alias '" + (((TermContext)_localctx).Table_alias!=null?_input.getText(((TermContext)_localctx).Table_alias.start,((TermContext)_localctx).Table_alias.stop):null) + "' is not valid, it exists already a table with that name");
								}

								if(varTables.containsKey((((TermContext)_localctx).Table_alias!=null?_input.getText(((TermContext)_localctx).Table_alias.start,((TermContext)_localctx).Table_alias.stop):null))){
									terminateWithMessage("The alias '" + (((TermContext)_localctx).Table_alias!=null?_input.getText(((TermContext)_localctx).Table_alias.start,((TermContext)_localctx).Table_alias.stop):null) + "' is declared multiple times");
								}

								varTables.put((((TermContext)_localctx).Table_alias!=null?_input.getText(((TermContext)_localctx).Table_alias.start,((TermContext)_localctx).Table_alias.stop):null),  currentTable);
								
					}
					break;
				}

							if(!isSetAlias){
								for(Table table: tablesWithoutAlias){
									if(table.getName().equals(currentTable.getName())){
									terminateWithMessage("The table '" + (((TermContext)_localctx).Table_name!=null?_input.getText(((TermContext)_localctx).Table_name.start,((TermContext)_localctx).Table_name.stop):null) + "' is declared multiple times without alias");
									}
								}
								tablesWithoutAlias.add(currentTable);
								((TermContext)_localctx).nodeToReturn =  new TableLeafNode(currentTable, "", sessionID);
							}else{
								((TermContext)_localctx).nodeToReturn =  new TableLeafNode(currentTable, (((TermContext)_localctx).Table_alias!=null?_input.getText(((TermContext)_localctx).Table_alias.start,((TermContext)_localctx).Table_alias.stop):null), sessionID);
							}
						
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(681);
				match(OPEN_PAR);
				setState(682);
				((TermContext)_localctx).n = cartesian();
				setState(683);
				match(CLOSE_PAR);
				((TermContext)_localctx).nodeToReturn =  ((TermContext)_localctx).n.nodeToReturn;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Result_columnContext extends ParserRuleContext {
		public Table_nameContext aliasAttr;
		public Column_nameContext columnName;
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitResult_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_result_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(688);
				((Result_columnContext)_localctx).aliasAttr = table_name();
				setState(689);
				match(DOT);
				}
				break;
			}
			setState(693);
			((Result_columnContext)_localctx).columnName = column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_name_listContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Column_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterColumn_name_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitColumn_name_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitColumn_name_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_name_listContext column_name_list() throws RecognitionException {
		Column_name_listContext _localctx = new Column_name_listContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_column_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			match(OPEN_PAR);
			setState(696);
			column_name();
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(697);
				match(COMMA);
				setState(698);
				column_name();
				}
				}
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(704);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLiteParser.AS, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterQualified_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitQualified_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitQualified_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_qualified_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			table_name();
			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(707);
				match(AS);
				setState(708);
				alias();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_stmtContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(SQLiteParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SQLiteParser.BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Order_by_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterOrder_by_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitOrder_by_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitOrder_by_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_stmtContext order_by_stmt() throws RecognitionException {
		Order_by_stmtContext _localctx = new Order_by_stmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_order_by_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(ORDER);
			setState(712);
			match(BY);
			setState(713);
			ordering_term();
			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(714);
				match(COMMA);
				setState(715);
				ordering_term();
				}
				}
				setState(720);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ordering_termContext extends ParserRuleContext {
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public Asc_descContext asc_desc() {
			return getRuleContext(Asc_descContext.class,0);
		}
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitOrdering_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitOrdering_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			booleanExpr(0);
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(722);
				asc_desc();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Asc_descContext extends ParserRuleContext {
		public TerminalNode ASC() { return getToken(SQLiteParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SQLiteParser.DESC, 0); }
		public Asc_descContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asc_desc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterAsc_desc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitAsc_desc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitAsc_desc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asc_descContext asc_desc() throws RecognitionException {
		Asc_descContext _localctx = new Asc_descContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_asc_desc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			_la = _input.LA(1);
			if ( !(_la==ASC || _la==DESC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OffsetContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public OffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterOffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitOffset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitOffset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffsetContext offset() throws RecognitionException {
		OffsetContext _localctx = new OffsetContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			match(COMMA);
			setState(728);
			signed_number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_valueContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterDefault_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitDefault_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitDefault_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_valueContext default_value() throws RecognitionException {
		Default_valueContext _localctx = new Default_valueContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			match(COMMA);
			setState(731);
			signed_number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_exprContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(SQLiteParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SQLiteParser.BY, 0); }
		public List<BooleanExprContext> booleanExpr() {
			return getRuleContexts(BooleanExprContext.class);
		}
		public BooleanExprContext booleanExpr(int i) {
			return getRuleContext(BooleanExprContext.class,i);
		}
		public Order_by_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterOrder_by_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitOrder_by_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitOrder_by_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_exprContext order_by_expr() throws RecognitionException {
		Order_by_exprContext _localctx = new Order_by_exprContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_order_by_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			match(ORDER);
			setState(734);
			match(BY);
			setState(736); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(735);
					booleanExpr(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(738); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_expr_asc_descContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(SQLiteParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SQLiteParser.BY, 0); }
		public Order_by_expr_asc_descContext order_by_expr_asc_desc() {
			return getRuleContext(Order_by_expr_asc_descContext.class,0);
		}
		public Order_by_expr_asc_descContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_expr_asc_desc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterOrder_by_expr_asc_desc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitOrder_by_expr_asc_desc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitOrder_by_expr_asc_desc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_expr_asc_descContext order_by_expr_asc_desc() throws RecognitionException {
		Order_by_expr_asc_descContext _localctx = new Order_by_expr_asc_descContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_order_by_expr_asc_desc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(ORDER);
			setState(741);
			match(BY);
			setState(742);
			order_by_expr_asc_desc();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_asc_descContext extends ParserRuleContext {
		public List<BooleanExprContext> booleanExpr() {
			return getRuleContexts(BooleanExprContext.class);
		}
		public BooleanExprContext booleanExpr(int i) {
			return getRuleContext(BooleanExprContext.class,i);
		}
		public List<Asc_descContext> asc_desc() {
			return getRuleContexts(Asc_descContext.class);
		}
		public Asc_descContext asc_desc(int i) {
			return getRuleContext(Asc_descContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Expr_asc_descContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_asc_desc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterExpr_asc_desc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitExpr_asc_desc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitExpr_asc_desc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_asc_descContext expr_asc_desc() throws RecognitionException {
		Expr_asc_descContext _localctx = new Expr_asc_descContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expr_asc_desc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			booleanExpr(0);
			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(745);
				asc_desc();
				}
			}

			setState(755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(748);
				match(COMMA);
				setState(749);
				booleanExpr(0);
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(750);
					asc_desc();
					}
				}

				}
				}
				setState(757);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initial_selectContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Initial_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterInitial_select(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitInitial_select(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitInitial_select(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initial_selectContext initial_select() throws RecognitionException {
		Initial_selectContext _localctx = new Initial_selectContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_initial_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			select_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Recursive_selectContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Recursive_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recursive_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterRecursive_select(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitRecursive_select(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitRecursive_select(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Recursive_selectContext recursive_select() throws RecognitionException {
		Recursive_selectContext _localctx = new Recursive_selectContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_recursive_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			select_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SQLiteParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SQLiteParser.PLUS, 0); }
		public TerminalNode NOT() { return getToken(SQLiteParser.NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS || _la==NOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterError_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitError_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitError_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_argumentContext extends ParserRuleContext {
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Module_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterModule_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitModule_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitModule_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_argumentContext module_argument() throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_module_argument);
		try {
			setState(768);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				booleanExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(767);
				column_def();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitColumn_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SQLiteParser.ADD, 0); }
		public TerminalNode ALL() { return getToken(SQLiteParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(SQLiteParser.ALTER, 0); }
		public TerminalNode AND() { return getToken(SQLiteParser.AND, 0); }
		public TerminalNode AS() { return getToken(SQLiteParser.AS, 0); }
		public TerminalNode ASC() { return getToken(SQLiteParser.ASC, 0); }
		public TerminalNode BETWEEN() { return getToken(SQLiteParser.BETWEEN, 0); }
		public TerminalNode BY() { return getToken(SQLiteParser.BY, 0); }
		public TerminalNode COLUMN() { return getToken(SQLiteParser.COLUMN, 0); }
		public TerminalNode CREATE() { return getToken(SQLiteParser.CREATE, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(SQLiteParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(SQLiteParser.CURRENT_TIME, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SQLiteParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode DATABASE() { return getToken(SQLiteParser.DATABASE, 0); }
		public TerminalNode DEFAULT() { return getToken(SQLiteParser.DEFAULT, 0); }
		public TerminalNode DELETE() { return getToken(SQLiteParser.DELETE, 0); }
		public TerminalNode DESC() { return getToken(SQLiteParser.DESC, 0); }
		public TerminalNode DETACH() { return getToken(SQLiteParser.DETACH, 0); }
		public TerminalNode DISTINCT() { return getToken(SQLiteParser.DISTINCT, 0); }
		public TerminalNode DROP() { return getToken(SQLiteParser.DROP, 0); }
		public TerminalNode EXCEPT() { return getToken(SQLiteParser.EXCEPT, 0); }
		public TerminalNode EXCLUSIVE() { return getToken(SQLiteParser.EXCLUSIVE, 0); }
		public TerminalNode EXISTS() { return getToken(SQLiteParser.EXISTS, 0); }
		public TerminalNode FROM() { return getToken(SQLiteParser.FROM, 0); }
		public TerminalNode GROUP() { return getToken(SQLiteParser.GROUP, 0); }
		public TerminalNode HAVING() { return getToken(SQLiteParser.HAVING, 0); }
		public TerminalNode IN() { return getToken(SQLiteParser.IN, 0); }
		public TerminalNode INNER() { return getToken(SQLiteParser.INNER, 0); }
		public TerminalNode INSERT() { return getToken(SQLiteParser.INSERT, 0); }
		public TerminalNode INTERSECT() { return getToken(SQLiteParser.INTERSECT, 0); }
		public TerminalNode INTO() { return getToken(SQLiteParser.INTO, 0); }
		public TerminalNode IS() { return getToken(SQLiteParser.IS, 0); }
		public TerminalNode ISNULL() { return getToken(SQLiteParser.ISNULL, 0); }
		public TerminalNode JOIN() { return getToken(SQLiteParser.JOIN, 0); }
		public TerminalNode KEY() { return getToken(SQLiteParser.KEY, 0); }
		public TerminalNode LEFT() { return getToken(SQLiteParser.LEFT, 0); }
		public TerminalNode LIKE() { return getToken(SQLiteParser.LIKE, 0); }
		public TerminalNode MATCH() { return getToken(SQLiteParser.MATCH, 0); }
		public TerminalNode NATURAL() { return getToken(SQLiteParser.NATURAL, 0); }
		public TerminalNode NO() { return getToken(SQLiteParser.NO, 0); }
		public TerminalNode NOT() { return getToken(SQLiteParser.NOT, 0); }
		public TerminalNode NOTNULL() { return getToken(SQLiteParser.NOTNULL, 0); }
		public TerminalNode NULL() { return getToken(SQLiteParser.NULL, 0); }
		public TerminalNode OF() { return getToken(SQLiteParser.OF, 0); }
		public TerminalNode OFFSET() { return getToken(SQLiteParser.OFFSET, 0); }
		public TerminalNode ON() { return getToken(SQLiteParser.ON, 0); }
		public TerminalNode OR() { return getToken(SQLiteParser.OR, 0); }
		public TerminalNode ORDER() { return getToken(SQLiteParser.ORDER, 0); }
		public TerminalNode OUTER() { return getToken(SQLiteParser.OUTER, 0); }
		public TerminalNode PRIMARY() { return getToken(SQLiteParser.PRIMARY, 0); }
		public TerminalNode QUERY() { return getToken(SQLiteParser.QUERY, 0); }
		public TerminalNode RECURSIVE() { return getToken(SQLiteParser.RECURSIVE, 0); }
		public TerminalNode REFERENCES() { return getToken(SQLiteParser.REFERENCES, 0); }
		public TerminalNode RELEASE() { return getToken(SQLiteParser.RELEASE, 0); }
		public TerminalNode RENAME() { return getToken(SQLiteParser.RENAME, 0); }
		public TerminalNode REPLACE() { return getToken(SQLiteParser.REPLACE, 0); }
		public TerminalNode RESTRICT() { return getToken(SQLiteParser.RESTRICT, 0); }
		public TerminalNode RIGHT() { return getToken(SQLiteParser.RIGHT, 0); }
		public TerminalNode SELECT() { return getToken(SQLiteParser.SELECT, 0); }
		public TerminalNode SET() { return getToken(SQLiteParser.SET, 0); }
		public TerminalNode TABLE() { return getToken(SQLiteParser.TABLE, 0); }
		public TerminalNode TO() { return getToken(SQLiteParser.TO, 0); }
		public TerminalNode TRANSACTION() { return getToken(SQLiteParser.TRANSACTION, 0); }
		public TerminalNode UNION() { return getToken(SQLiteParser.UNION, 0); }
		public TerminalNode UNIQUE() { return getToken(SQLiteParser.UNIQUE, 0); }
		public TerminalNode UPDATE() { return getToken(SQLiteParser.UPDATE, 0); }
		public TerminalNode VALUES() { return getToken(SQLiteParser.VALUES, 0); }
		public TerminalNode WHEN() { return getToken(SQLiteParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(SQLiteParser.WHERE, 0); }
		public TerminalNode WITH() { return getToken(SQLiteParser.WITH, 0); }
		public TerminalNode WITHOUT() { return getToken(SQLiteParser.WITHOUT, 0); }
		public TerminalNode TRUE() { return getToken(SQLiteParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SQLiteParser.FALSE, 0); }
		public TerminalNode NULLS() { return getToken(SQLiteParser.NULLS, 0); }
		public TerminalNode FIRST() { return getToken(SQLiteParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(SQLiteParser.LAST, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << AS) | (1L << ASC) | (1L << BETWEEN) | (1L << BY) | (1L << EXCEPT) | (1L << COLUMN) | (1L << CREATE) | (1L << CURRENT_DATE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << DATABASE) | (1L << DEFAULT) | (1L << DELETE) | (1L << DESC) | (1L << DETACH) | (1L << DISTINCT) | (1L << DROP) | (1L << EXCLUSIVE) | (1L << EXISTS) | (1L << FROM) | (1L << GROUP))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (HAVING - 64)) | (1L << (IN - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERSECT - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (ISNULL - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (LEFT - 64)) | (1L << (LIKE - 64)) | (1L << (MATCH - 64)) | (1L << (NATURAL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NOTNULL - 64)) | (1L << (NULL - 64)) | (1L << (OF - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (PRIMARY - 64)) | (1L << (QUERY - 64)) | (1L << (RECURSIVE - 64)) | (1L << (REFERENCES - 64)) | (1L << (RELEASE - 64)) | (1L << (RENAME - 64)) | (1L << (REPLACE - 64)) | (1L << (RESTRICT - 64)) | (1L << (RIGHT - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (TABLE - 64)) | (1L << (TO - 64)) | (1L << (TRANSACTION - 64)) | (1L << (UNION - 64)) | (1L << (UNIQUE - 64)) | (1L << (UPDATE - 64)) | (1L << (VALUES - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (WITH - 64)) | (1L << (WITHOUT - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (NULLS - 64)) | (1L << (FIRST - 64)) | (1L << (LAST - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_or_index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_or_index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterTable_or_index_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitTable_or_index_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitTable_or_index_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_index_nameContext table_or_index_name() throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public New_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterNew_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitNew_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitNew_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_table_nameContext new_table_name() throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterForeign_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitForeign_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitForeign_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Transaction_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterTransaction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitTransaction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitTransaction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_funcContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Simple_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSimple_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSimple_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSimple_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_funcContext simple_func() throws RecognitionException {
		Simple_funcContext _localctx = new Simple_funcContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_simple_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aggregate_funcContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Aggregate_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterAggregate_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitAggregate_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitAggregate_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregate_funcContext aggregate_func() throws RecognitionException {
		Aggregate_funcContext _localctx = new Aggregate_funcContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_aggregate_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_any_name);
		try {
			setState(803);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(796);
				match(IDENTIFIER);
				}
				break;
			case ADD:
			case ALL:
			case ALTER:
			case AND:
			case AS:
			case ASC:
			case BETWEEN:
			case BY:
			case EXCEPT:
			case COLUMN:
			case CREATE:
			case CURRENT_DATE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case DATABASE:
			case DEFAULT:
			case DELETE:
			case DESC:
			case DETACH:
			case DISTINCT:
			case DROP:
			case EXCLUSIVE:
			case EXISTS:
			case FROM:
			case GROUP:
			case HAVING:
			case IN:
			case INNER:
			case INSERT:
			case INTERSECT:
			case INTO:
			case IS:
			case ISNULL:
			case JOIN:
			case KEY:
			case LEFT:
			case LIKE:
			case MATCH:
			case NATURAL:
			case NO:
			case NOT:
			case NOTNULL:
			case NULL:
			case OF:
			case OFFSET:
			case ON:
			case OR:
			case ORDER:
			case OUTER:
			case PRIMARY:
			case QUERY:
			case RECURSIVE:
			case REFERENCES:
			case RELEASE:
			case RENAME:
			case REPLACE:
			case RESTRICT:
			case RIGHT:
			case SELECT:
			case SET:
			case TABLE:
			case TO:
			case TRANSACTION:
			case UNION:
			case UNIQUE:
			case UPDATE:
			case VALUES:
			case WHEN:
			case WHERE:
			case WITH:
			case WITHOUT:
			case TRUE:
			case FALSE:
			case NULLS:
			case FIRST:
			case LAST:
				enterOuterAlt(_localctx, 2);
				{
				setState(797);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(798);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(799);
				match(OPEN_PAR);
				setState(800);
				any_name();
				setState(801);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return booleanExpr_sempred((BooleanExprContext)_localctx, predIndex);
		case 18:
			return fieldExpr_sempred((FieldExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean booleanExpr_sempred(BooleanExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean fieldExpr_sempred(FieldExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0084\u0328\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\7\2\u0085\n\2\f\2\16\2\u0088\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\7\4\u0090\n\4\f\4\16\4\u0093\13\4\3\4\3\4\6\4\u0097"+
		"\n\4\r\4\16\4\u0098\3\4\7\4\u009c\n\4\f\4\16\4\u009f\13\4\3\4\7\4\u00a2"+
		"\n\4\f\4\16\4\u00a5\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5\u00b7\n\5\3\6\3\6\5\6\u00bb\n\6\3\6\5\6\u00be\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00cb\n\7\f\7\16\7"+
		"\u00ce\13\7\3\7\3\7\3\7\3\7\7\7\u00d4\n\7\f\7\16\7\u00d7\13\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00e3\n\b\3\b\3\b\3\b\5\b\u00e8\n"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00f2\n\t\5\t\u00f4\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00fe\n\n\3\13\5\13\u0101\n\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u010e\n\f\f\f\16\f\u0111\13\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u011e\n\f\f\f\16\f\u0121"+
		"\13\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0129\n\f\5\f\u012b\n\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0138\n\r\f\r\16\r\u013b\13\r\3\r"+
		"\3\r\5\r\u013f\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\7\16\u0148\n\16\f"+
		"\16\16\16\u014b\13\16\3\16\3\16\5\16\u014f\n\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\5\17\u0157\n\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u0161\n\20\f\20\16\20\u0164\13\20\3\20\3\20\5\20\u0168\n\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0177\n\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0181\n\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u01a1\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u01aa\n\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u01b6\n\23\f\23\16\23"+
		"\u01b9\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\5\24\u01c8\n\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01d0\n\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01db\n\24\3\24\3\24"+
		"\3\24\7\24\u01e0\n\24\f\24\16\24\u01e3\13\24\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u01ea\n\25\3\26\3\26\3\26\3\26\5\26\u01f0\n\26\3\27\3\27\3\27\3"+
		"\27\5\27\u01f6\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u0203\n\27\3\27\3\27\3\27\5\27\u0208\n\27\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0217\n\31\f\31"+
		"\16\31\u021a\13\31\3\31\3\31\5\31\u021e\n\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\7\31\u0229\n\31\f\31\16\31\u022c\13\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0238\n\31\f\31\16\31\u023b"+
		"\13\31\3\31\3\31\3\31\7\31\u0240\n\31\f\31\16\31\u0243\13\31\3\31\3\31"+
		"\3\32\3\32\5\32\u0249\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\7\33\u0255\n\33\f\33\16\33\u0258\13\33\5\33\u025a\n\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0265\n\33\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\5\35\u026d\n\35\3\36\3\36\3\36\5\36\u0272\n\36\3\36\3\36\5"+
		"\36\u0276\n\36\3\36\6\36\u0279\n\36\r\36\16\36\u027a\3\36\5\36\u027e\n"+
		"\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \5 \u028a\n \3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u029d\n\"\3#\3#\3"+
		"#\3#\5#\u02a3\n#\3#\3#\3#\5#\u02a8\n#\3#\3#\3#\3#\3#\3#\3#\5#\u02b1\n"+
		"#\3$\3$\3$\5$\u02b6\n$\3$\3$\3%\3%\3%\3%\7%\u02be\n%\f%\16%\u02c1\13%"+
		"\3%\3%\3&\3&\3&\5&\u02c8\n&\3\'\3\'\3\'\3\'\3\'\7\'\u02cf\n\'\f\'\16\'"+
		"\u02d2\13\'\3(\3(\5(\u02d6\n(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\6,\u02e3"+
		"\n,\r,\16,\u02e4\3-\3-\3-\3-\3.\3.\5.\u02ed\n.\3.\3.\3.\5.\u02f2\n.\7"+
		".\u02f4\n.\f.\16.\u02f7\13.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3"+
		"\63\5\63\u0303\n\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\3"+
		"9\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3A\3A\3A\3A\3A\5A\u0326"+
		"\nA\3A\2\4$&B\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\2\b\3\2\n\13\4\2~~\u0080"+
		"\u0080\4\2##88\4\2\n\13TT\4\2}}\u0080\u0080\20\2\35\35\37#\'(**,,\60\60"+
		"\62=??AEHOQgiilqs{\2\u0347\2\u0086\3\2\2\2\4\u008b\3\2\2\2\6\u0091\3\2"+
		"\2\2\b\u00b6\3\2\2\2\n\u00ba\3\2\2\2\f\u00bf\3\2\2\2\16\u00dc\3\2\2\2"+
		"\20\u00f3\3\2\2\2\22\u00fd\3\2\2\2\24\u0100\3\2\2\2\26\u012a\3\2\2\2\30"+
		"\u012c\3\2\2\2\32\u0142\3\2\2\2\34\u0150\3\2\2\2\36\u015b\3\2\2\2 \u016e"+
		"\3\2\2\2\"\u017a\3\2\2\2$\u01a9\3\2\2\2&\u01c7\3\2\2\2(\u01e9\3\2\2\2"+
		"*\u01ef\3\2\2\2,\u0207\3\2\2\2.\u0209\3\2\2\2\60\u020b\3\2\2\2\62\u0246"+
		"\3\2\2\2\64\u024a\3\2\2\2\66\u0268\3\2\2\28\u026a\3\2\2\2:\u026e\3\2\2"+
		"\2<\u027f\3\2\2\2>\u0289\3\2\2\2@\u028b\3\2\2\2B\u029c\3\2\2\2D\u02b0"+
		"\3\2\2\2F\u02b5\3\2\2\2H\u02b9\3\2\2\2J\u02c4\3\2\2\2L\u02c9\3\2\2\2N"+
		"\u02d3\3\2\2\2P\u02d7\3\2\2\2R\u02d9\3\2\2\2T\u02dc\3\2\2\2V\u02df\3\2"+
		"\2\2X\u02e6\3\2\2\2Z\u02ea\3\2\2\2\\\u02f8\3\2\2\2^\u02fa\3\2\2\2`\u02fc"+
		"\3\2\2\2b\u02fe\3\2\2\2d\u0302\3\2\2\2f\u0304\3\2\2\2h\u0306\3\2\2\2j"+
		"\u0308\3\2\2\2l\u030a\3\2\2\2n\u030c\3\2\2\2p\u030e\3\2\2\2r\u0310\3\2"+
		"\2\2t\u0312\3\2\2\2v\u0314\3\2\2\2x\u0316\3\2\2\2z\u0318\3\2\2\2|\u031a"+
		"\3\2\2\2~\u031c\3\2\2\2\u0080\u0325\3\2\2\2\u0082\u0085\5\6\4\2\u0083"+
		"\u0085\5\4\3\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0089\u008a\7\2\2\3\u008a\3\3\2\2\2\u008b\u008c\7\u0084"+
		"\2\2\u008c\u008d\b\3\1\2\u008d\5\3\2\2\2\u008e\u0090\7\3\2\2\u008f\u008e"+
		"\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u009d\5\b\5\2\u0095\u0097\7\3"+
		"\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\5\b\5\2\u009b\u0096\3\2"+
		"\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00a3\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2\7\3\2\2\u00a1\u00a0\3\2"+
		"\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00b7\5\f\7\2\u00a7\u00a8\5 \21\2"+
		"\u00a8\u00a9\b\5\1\2\u00a9\u00b7\3\2\2\2\u00aa\u00ab\5\"\22\2\u00ab\u00ac"+
		"\b\5\1\2\u00ac\u00b7\3\2\2\2\u00ad\u00ae\5\60\31\2\u00ae\u00af\b\5\1\2"+
		"\u00af\u00b7\3\2\2\2\u00b0\u00b1\5\62\32\2\u00b1\u00b2\b\5\1\2\u00b2\u00b7"+
		"\3\2\2\2\u00b3\u00b4\7h\2\2\u00b4\u00b5\7j\2\2\u00b5\u00b7\b\5\1\2\u00b6"+
		"\u00a6\3\2\2\2\u00b6\u00a7\3\2\2\2\u00b6\u00aa\3\2\2\2\u00b6\u00ad\3\2"+
		"\2\2\u00b6\u00b0\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b7\t\3\2\2\2\u00b8\u00bb"+
		"\5r:\2\u00b9\u00bb\5$\23\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb"+
		"\u00bd\3\2\2\2\u00bc\u00be\5P)\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2"+
		"\2\u00be\13\3\2\2\2\u00bf\u00c0\7\60\2\2\u00c0\u00c1\7i\2\2\u00c1\u00c2"+
		"\5l\67\2\u00c2\u00c3\b\7\1\2\u00c3\u00c4\7\5\2\2\u00c4\u00c5\5\16\b\2"+
		"\u00c5\u00cc\b\7\1\2\u00c6\u00c7\7\7\2\2\u00c7\u00c8\5\16\b\2\u00c8\u00c9"+
		"\b\7\1\2\u00c9\u00cb\3\2\2\2\u00ca\u00c6\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d5\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00cf\u00d0\7\7\2\2\u00d0\u00d1\5\26\f\2\u00d1\u00d2\b\7\1\2\u00d2"+
		"\u00d4\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00d9\7\6\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\b\7\1\2\u00db\r\3\2\2\2"+
		"\u00dc\u00dd\b\b\1\2\u00dd\u00de\5r:\2\u00de\u00e2\b\b\1\2\u00df\u00e0"+
		"\5\20\t\2\u00e0\u00e1\b\b\1\2\u00e1\u00e3\3\2\2\2\u00e2\u00df\3\2\2\2"+
		"\u00e2\u00e3\3\2\2\2\u00e3\u00e7\3\2\2\2\u00e4\u00e5\5\22\n\2\u00e5\u00e6"+
		"\b\b\1\2\u00e6\u00e8\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\17\3\2\2\2\u00e9\u00ea\7G\2\2\u00ea\u00f4\b\t\1\2\u00eb\u00ec\7r\2\2"+
		"\u00ec\u00f1\b\t\1\2\u00ed\u00ee\7\5\2\2\u00ee\u00ef\5\24\13\2\u00ef\u00f0"+
		"\7\6\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f4\3\2\2\2\u00f3\u00e9\3\2\2\2\u00f3\u00eb\3\2\2\2\u00f4\21\3\2\2"+
		"\2\u00f5\u00f6\7]\2\2\u00f6\u00f7\7M\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fe"+
		"\b\n\1\2\u00f9\u00fa\7T\2\2\u00fa\u00fb\7V\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fe\b\n\1\2\u00fd\u00f5\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fe\23\3\2\2"+
		"\2\u00ff\u0101\t\2\2\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102"+
		"\3\2\2\2\u0102\u0103\7~\2\2\u0103\25\3\2\2\2\u0104\u0105\7]\2\2\u0105"+
		"\u0106\7M\2\2\u0106\u0107\7\5\2\2\u0107\u0108\5\n\6\2\u0108\u010f\b\f"+
		"\1\2\u0109\u010a\7\7\2\2\u010a\u010b\5\n\6\2\u010b\u010c\b\f\1\2\u010c"+
		"\u010e\3\2\2\2\u010d\u0109\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2"+
		"\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0112"+
		"\u0113\7\6\2\2\u0113\u012b\3\2\2\2\u0114\u0115\7>\2\2\u0115\u0116\7M\2"+
		"\2\u0116\u0117\7\5\2\2\u0117\u0118\5r:\2\u0118\u011f\b\f\1\2\u0119\u011a"+
		"\7\7\2\2\u011a\u011b\5r:\2\u011b\u011c\b\f\1\2\u011c\u011e\3\2\2\2\u011d"+
		"\u0119\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0123\7\6\2\2\u0123"+
		"\u0124\5\30\r\2\u0124\u0128\b\f\1\2\u0125\u0126\7T\2\2\u0126\u0127\7V"+
		"\2\2\u0127\u0129\b\f\1\2\u0128\u0125\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u012b\3\2\2\2\u012a\u0104\3\2\2\2\u012a\u0114\3\2\2\2\u012b\27\3\2\2"+
		"\2\u012c\u012d\b\r\1\2\u012d\u012e\7`\2\2\u012e\u012f\5t;\2\u012f\u013e"+
		"\b\r\1\2\u0130\u0131\7\5\2\2\u0131\u0132\5r:\2\u0132\u0139\b\r\1\2\u0133"+
		"\u0134\7\7\2\2\u0134\u0135\5r:\2\u0135\u0136\b\r\1\2\u0136\u0138\3\2\2"+
		"\2\u0137\u0133\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a"+
		"\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\7\6\2\2\u013d"+
		"\u013f\3\2\2\2\u013e\u0130\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u0141\b\r\1\2\u0141\31\3\2\2\2\u0142\u014e\5l\67\2\u0143\u0144"+
		"\7\5\2\2\u0144\u0149\5r:\2\u0145\u0146\7\7\2\2\u0146\u0148\5r:\2\u0147"+
		"\u0145\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2"+
		"\2\2\u014a\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d\7\6\2\2\u014d"+
		"\u014f\3\2\2\2\u014e\u0143\3\2\2\2\u014e\u014f\3\2\2\2\u014f\33\3\2\2"+
		"\2\u0150\u0151\5\32\16\2\u0151\u0152\7\"\2\2\u0152\u0153\7\5\2\2\u0153"+
		"\u0154\5\\/\2\u0154\u0156\7n\2\2\u0155\u0157\7\37\2\2\u0156\u0155\3\2"+
		"\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\5^\60\2\u0159"+
		"\u015a\7\6\2\2\u015a\35\3\2\2\2\u015b\u0167\5l\67\2\u015c\u015d\7\5\2"+
		"\2\u015d\u0162\5r:\2\u015e\u015f\7\7\2\2\u015f\u0161\5r:\2\u0160\u015e"+
		"\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0166\7\6\2\2\u0166\u0168\3\2"+
		"\2\2\u0167\u015c\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u016a\7\"\2\2\u016a\u016b\7\5\2\2\u016b\u016c\5\62\32\2\u016c\u016d\7"+
		"\6\2\2\u016d\37\3\2\2\2\u016e\u016f\7\67\2\2\u016f\u0170\7?\2\2\u0170"+
		"\u0171\5l\67\2\u0171\u0176\b\21\1\2\u0172\u0173\7t\2\2\u0173\u0174\5$"+
		"\23\2\u0174\u0175\b\21\1\2\u0175\u0177\3\2\2\2\u0176\u0172\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\b\21\1\2\u0179!\3\2\2\2"+
		"\u017a\u017b\b\22\1\2\u017b\u017c\7;\2\2\u017c\u0180\7i\2\2\u017d\u017e"+
		"\7)\2\2\u017e\u017f\7=\2\2\u017f\u0181\b\22\1\2\u0180\u017d\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\5\u0080A\2\u0183\u0184"+
		"\b\22\1\2\u0184#\3\2\2\2\u0185\u0186\b\23\1\2\u0186\u0187\7\5\2\2\u0187"+
		"\u0188\5$\23\2\u0188\u0189\7\6\2\2\u0189\u018a\b\23\1\2\u018a\u01aa\3"+
		"\2\2\2\u018b\u018c\5*\26\2\u018c\u018d\b\23\1\2\u018d\u01aa\3\2\2\2\u018e"+
		"\u018f\7T\2\2\u018f\u0190\5$\23\7\u0190\u0191\b\23\1\2\u0191\u01aa\3\2"+
		"\2\2\u0192\u0193\5&\24\2\u0193\u01a0\b\23\1\2\u0194\u0195\7\24\2\2\u0195"+
		"\u01a1\b\23\1\2\u0196\u0197\7\25\2\2\u0197\u01a1\b\23\1\2\u0198\u0199"+
		"\7\26\2\2\u0199\u01a1\b\23\1\2\u019a\u019b\7\27\2\2\u019b\u01a1\b\23\1"+
		"\2\u019c\u019d\7\b\2\2\u019d\u01a1\b\23\1\2\u019e\u019f\7\32\2\2\u019f"+
		"\u01a1\b\23\1\2\u01a0\u0194\3\2\2\2\u01a0\u0196\3\2\2\2\u01a0\u0198\3"+
		"\2\2\2\u01a0\u019a\3\2\2\2\u01a0\u019c\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01a3\5&\24\2\u01a3\u01a4\b\23\1\2\u01a4\u01aa\3"+
		"\2\2\2\u01a5\u01a6\5&\24\2\u01a6\u01a7\7K\2\2\u01a7\u01a8\b\23\1\2\u01a8"+
		"\u01aa\3\2\2\2\u01a9\u0185\3\2\2\2\u01a9\u018b\3\2\2\2\u01a9\u018e\3\2"+
		"\2\2\u01a9\u0192\3\2\2\2\u01a9\u01a5\3\2\2\2\u01aa\u01b7\3\2\2\2\u01ab"+
		"\u01ac\f\5\2\2\u01ac\u01ad\7!\2\2\u01ad\u01ae\5$\23\6\u01ae\u01af\b\23"+
		"\1\2\u01af\u01b6\3\2\2\2\u01b0\u01b1\f\4\2\2\u01b1\u01b2\7Z\2\2\u01b2"+
		"\u01b3\5$\23\5\u01b3\u01b4\b\23\1\2\u01b4\u01b6\3\2\2\2\u01b5\u01ab\3"+
		"\2\2\2\u01b5\u01b0\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7"+
		"\u01b8\3\2\2\2\u01b8%\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01bb\b\24\1\2"+
		"\u01bb\u01bc\7\5\2\2\u01bc\u01bd\5&\24\2\u01bd\u01be\7\6\2\2\u01be\u01bf"+
		"\b\24\1\2\u01bf\u01c8\3\2\2\2\u01c0\u01c1\7\13\2\2\u01c1\u01c2\5&\24\6"+
		"\u01c2\u01c3\b\24\1\2\u01c3\u01c8\3\2\2\2\u01c4\u01c5\5,\27\2\u01c5\u01c6"+
		"\b\24\1\2\u01c6\u01c8\3\2\2\2\u01c7\u01ba\3\2\2\2\u01c7\u01c0\3\2\2\2"+
		"\u01c7\u01c4\3\2\2\2\u01c8\u01e1\3\2\2\2\u01c9\u01ca\f\4\2\2\u01ca\u01cf"+
		"\b\24\1\2\u01cb\u01cc\7\t\2\2\u01cc\u01d0\b\24\1\2\u01cd\u01ce\7\16\2"+
		"\2\u01ce\u01d0\b\24\1\2\u01cf\u01cb\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0"+
		"\u01d1\3\2\2\2\u01d1\u01d2\5&\24\5\u01d2\u01d3\b\24\1\2\u01d3\u01e0\3"+
		"\2\2\2\u01d4\u01d5\f\3\2\2\u01d5\u01da\b\24\1\2\u01d6\u01d7\7\n\2\2\u01d7"+
		"\u01db\b\24\1\2\u01d8\u01d9\7\13\2\2\u01d9\u01db\b\24\1\2\u01da\u01d6"+
		"\3\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\5&\24\4\u01dd"+
		"\u01de\b\24\1\2\u01de\u01e0\3\2\2\2\u01df\u01c9\3\2\2\2\u01df\u01d4\3"+
		"\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"\'\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01ea\7~\2\2\u01e5\u01ea\7\u0080"+
		"\2\2\u01e6\u01ea\7V\2\2\u01e7\u01ea\7w\2\2\u01e8\u01ea\7x\2\2\u01e9\u01e4"+
		"\3\2\2\2\u01e9\u01e5\3\2\2\2\u01e9\u01e6\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9"+
		"\u01e8\3\2\2\2\u01ea)\3\2\2\2\u01eb\u01ec\7w\2\2\u01ec\u01f0\b\26\1\2"+
		"\u01ed\u01ee\7x\2\2\u01ee\u01f0\b\26\1\2\u01ef\u01eb\3\2\2\2\u01ef\u01ed"+
		"\3\2\2\2\u01f0+\3\2\2\2\u01f1\u0208\3\2\2\2\u01f2\u01f5\b\27\1\2\u01f3"+
		"\u01f4\7\13\2\2\u01f4\u01f6\b\27\1\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3"+
		"\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\7~\2\2\u01f8\u0208\b\27\1\2\u01f9"+
		"\u01fa\7\u0080\2\2\u01fa\u0208\b\27\1\2\u01fb\u01fc\7V\2\2\u01fc\u0208"+
		"\b\27\1\2\u01fd\u0202\b\27\1\2\u01fe\u01ff\5l\67\2\u01ff\u0200\7\4\2\2"+
		"\u0200\u0201\b\27\1\2\u0201\u0203\3\2\2\2\u0202\u01fe\3\2\2\2\u0202\u0203"+
		"\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\5r:\2\u0205\u0206\b\27\1\2\u0206"+
		"\u0208\3\2\2\2\u0207\u01f1\3\2\2\2\u0207\u01f2\3\2\2\2\u0207\u01f9\3\2"+
		"\2\2\u0207\u01fb\3\2\2\2\u0207\u01fd\3\2\2\2\u0208-\3\2\2\2\u0209\u020a"+
		"\t\3\2\2\u020a/\3\2\2\2\u020b\u020c\7E\2\2\u020c\u020d\7I\2\2\u020d\u020e"+
		"\5l\67\2\u020e\u021d\b\31\1\2\u020f\u0210\7\5\2\2\u0210\u0211\5r:\2\u0211"+
		"\u0218\b\31\1\2\u0212\u0213\7\7\2\2\u0213\u0214\5r:\2\u0214\u0215\b\31"+
		"\1\2\u0215\u0217\3\2\2\2\u0216\u0212\3\2\2\2\u0217\u021a\3\2\2\2\u0218"+
		"\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021b\3\2\2\2\u021a\u0218\3\2"+
		"\2\2\u021b\u021c\7\6\2\2\u021c\u021e\3\2\2\2\u021d\u020f\3\2\2\2\u021d"+
		"\u021e\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\b\31\1\2\u0220\u0221\7"+
		"q\2\2\u0221\u0222\7\5\2\2\u0222\u0223\5.\30\2\u0223\u022a\b\31\1\2\u0224"+
		"\u0225\7\7\2\2\u0225\u0226\5.\30\2\u0226\u0227\b\31\1\2\u0227\u0229\3"+
		"\2\2\2\u0228\u0224\3\2\2\2\u0229\u022c\3\2\2\2\u022a\u0228\3\2\2\2\u022a"+
		"\u022b\3\2\2\2\u022b\u022d\3\2\2\2\u022c\u022a\3\2\2\2\u022d\u022e\7\6"+
		"\2\2\u022e\u0241\b\31\1\2\u022f\u0230\7\7\2\2\u0230\u0231\7\5\2\2\u0231"+
		"\u0232\5.\30\2\u0232\u0239\b\31\1\2\u0233\u0234\7\7\2\2\u0234\u0235\5"+
		".\30\2\u0235\u0236\b\31\1\2\u0236\u0238\3\2\2\2\u0237\u0233\3\2\2\2\u0238"+
		"\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023c\3\2"+
		"\2\2\u023b\u0239\3\2\2\2\u023c\u023d\b\31\1\2\u023d\u023e\7\6\2\2\u023e"+
		"\u0240\3\2\2\2\u023f\u022f\3\2\2\2\u0240\u0243\3\2\2\2\u0241\u023f\3\2"+
		"\2\2\u0241\u0242\3\2\2\2\u0242\u0244\3\2\2\2\u0243\u0241\3\2\2\2\u0244"+
		"\u0245\b\31\1\2\u0245\61\3\2\2\2\u0246\u0248\5\64\33\2\u0247\u0249\5L"+
		"\'\2\u0248\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249\63\3\2\2\2\u024a\u024b"+
		"\b\33\1\2\u024b\u0259\7f\2\2\u024c\u024d\7\t\2\2\u024d\u025a\b\33\1\2"+
		"\u024e\u024f\5F$\2\u024f\u0256\b\33\1\2\u0250\u0251\7\7\2\2\u0251\u0252"+
		"\5F$\2\u0252\u0253\b\33\1\2\u0253\u0255\3\2\2\2\u0254\u0250\3\2\2\2\u0255"+
		"\u0258\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u025a\3\2"+
		"\2\2\u0258\u0256\3\2\2\2\u0259\u024c\3\2\2\2\u0259\u024e\3\2\2\2\u025a"+
		"\u025b\3\2\2\2\u025b\u025c\7?\2\2\u025c\u025d\5<\37\2\u025d\u025e\b\33"+
		"\1\2\u025e\u025f\3\2\2\2\u025f\u0264\b\33\1\2\u0260\u0261\7t\2\2\u0261"+
		"\u0262\5$\23\2\u0262\u0263\b\33\1\2\u0263\u0265\3\2\2\2\u0264\u0260\3"+
		"\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0267\b\33\1\2\u0267"+
		"\65\3\2\2\2\u0268\u0269\5\62\32\2\u0269\67\3\2\2\2\u026a\u026c\5\64\33"+
		"\2\u026b\u026d\5L\'\2\u026c\u026b\3\2\2\2\u026c\u026d\3\2\2\2\u026d9\3"+
		"\2\2\2\u026e\u0278\5\64\33\2\u026f\u0271\7n\2\2\u0270\u0272\7\37\2\2\u0271"+
		"\u0270\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0276\3\2\2\2\u0273\u0276\7H"+
		"\2\2\u0274\u0276\7*\2\2\u0275\u026f\3\2\2\2\u0275\u0273\3\2\2\2\u0275"+
		"\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0279\5\64\33\2\u0278\u0275\3"+
		"\2\2\2\u0279\u027a\3\2\2\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b"+
		"\u027d\3\2\2\2\u027c\u027e\5L\'\2\u027d\u027c\3\2\2\2\u027d\u027e\3\2"+
		"\2\2\u027e;\3\2\2\2\u027f\u0280\5@!\2\u0280\u0281\5> \2\u0281\u0282\b"+
		"\37\1\2\u0282=\3\2\2\2\u0283\u0284\7\7\2\2\u0284\u0285\5@!\2\u0285\u0286"+
		"\5> \2\u0286\u0287\b \1\2\u0287\u028a\3\2\2\2\u0288\u028a\b \1\2\u0289"+
		"\u0283\3\2\2\2\u0289\u0288\3\2\2\2\u028a?\3\2\2\2\u028b\u028c\5D#\2\u028c"+
		"\u028d\5B\"\2\u028d\u028e\b!\1\2\u028eA\3\2\2\2\u028f\u0290\7L\2\2\u0290"+
		"\u0291\5D#\2\u0291\u0292\b\"\1\2\u0292\u0293\5B\"\2\u0293\u0294\7Y\2\2"+
		"\u0294\u0295\7\5\2\2\u0295\u0296\5$\23\2\u0296\u0297\7\6\2\2\u0297\u0298"+
		"\b\"\1\2\u0298\u0299\5B\"\2\u0299\u029a\b\"\1\2\u029a\u029d\3\2\2\2\u029b"+
		"\u029d\b\"\1\2\u029c\u028f\3\2\2\2\u029c\u029b\3\2\2\2\u029dC\3\2\2\2"+
		"\u029e\u02b1\3\2\2\2\u029f\u02a0\5l\67\2\u02a0\u02a7\b#\1\2\u02a1\u02a3"+
		"\7\"\2\2\u02a2\u02a1\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4"+
		"\u02a5\5v<\2\u02a5\u02a6\b#\1\2\u02a6\u02a8\3\2\2\2\u02a7\u02a2\3\2\2"+
		"\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02aa\b#\1\2\u02aa\u02b1"+
		"\3\2\2\2\u02ab\u02ac\7\5\2\2\u02ac\u02ad\5<\37\2\u02ad\u02ae\7\6\2\2\u02ae"+
		"\u02af\b#\1\2\u02af\u02b1\3\2\2\2\u02b0\u029e\3\2\2\2\u02b0\u029f\3\2"+
		"\2\2\u02b0\u02ab\3\2\2\2\u02b1E\3\2\2\2\u02b2\u02b3\5l\67\2\u02b3\u02b4"+
		"\7\4\2\2\u02b4\u02b6\3\2\2\2\u02b5\u02b2\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6"+
		"\u02b7\3\2\2\2\u02b7\u02b8\5r:\2\u02b8G\3\2\2\2\u02b9\u02ba\7\5\2\2\u02ba"+
		"\u02bf\5r:\2\u02bb\u02bc\7\7\2\2\u02bc\u02be\5r:\2\u02bd\u02bb\3\2\2\2"+
		"\u02be\u02c1\3\2\2\2\u02bf\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c2"+
		"\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c2\u02c3\7\6\2\2\u02c3I\3\2\2\2\u02c4"+
		"\u02c7\5l\67\2\u02c5\u02c6\7\"\2\2\u02c6\u02c8\5z>\2\u02c7\u02c5\3\2\2"+
		"\2\u02c7\u02c8\3\2\2\2\u02c8K\3\2\2\2\u02c9\u02ca\7[\2\2\u02ca\u02cb\7"+
		"(\2\2\u02cb\u02d0\5N(\2\u02cc\u02cd\7\7\2\2\u02cd\u02cf\5N(\2\u02ce\u02cc"+
		"\3\2\2\2\u02cf\u02d2\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1"+
		"M\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d3\u02d5\5$\23\2\u02d4\u02d6\5P)\2\u02d5"+
		"\u02d4\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6O\3\2\2\2\u02d7\u02d8\t\4\2\2"+
		"\u02d8Q\3\2\2\2\u02d9\u02da\7\7\2\2\u02da\u02db\5\24\13\2\u02dbS\3\2\2"+
		"\2\u02dc\u02dd\7\7\2\2\u02dd\u02de\5\24\13\2\u02deU\3\2\2\2\u02df\u02e0"+
		"\7[\2\2\u02e0\u02e2\7(\2\2\u02e1\u02e3\5$\23\2\u02e2\u02e1\3\2\2\2\u02e3"+
		"\u02e4\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5W\3\2\2\2"+
		"\u02e6\u02e7\7[\2\2\u02e7\u02e8\7(\2\2\u02e8\u02e9\5X-\2\u02e9Y\3\2\2"+
		"\2\u02ea\u02ec\5$\23\2\u02eb\u02ed\5P)\2\u02ec\u02eb\3\2\2\2\u02ec\u02ed"+
		"\3\2\2\2\u02ed\u02f5\3\2\2\2\u02ee\u02ef\7\7\2\2\u02ef\u02f1\5$\23\2\u02f0"+
		"\u02f2\5P)\2\u02f1\u02f0\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f4\3\2\2"+
		"\2\u02f3\u02ee\3\2\2\2\u02f4\u02f7\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f5\u02f6"+
		"\3\2\2\2\u02f6[\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f8\u02f9\5\62\32\2\u02f9"+
		"]\3\2\2\2\u02fa\u02fb\5\62\32\2\u02fb_\3\2\2\2\u02fc\u02fd\t\5\2\2\u02fd"+
		"a\3\2\2\2\u02fe\u02ff\7\u0080\2\2\u02ffc\3\2\2\2\u0300\u0303\5$\23\2\u0301"+
		"\u0303\5\16\b\2\u0302\u0300\3\2\2\2\u0302\u0301\3\2\2\2\u0303e\3\2\2\2"+
		"\u0304\u0305\t\6\2\2\u0305g\3\2\2\2\u0306\u0307\t\7\2\2\u0307i\3\2\2\2"+
		"\u0308\u0309\5\u0080A\2\u0309k\3\2\2\2\u030a\u030b\5\u0080A\2\u030bm\3"+
		"\2\2\2\u030c\u030d\5\u0080A\2\u030do\3\2\2\2\u030e\u030f\5\u0080A\2\u030f"+
		"q\3\2\2\2\u0310\u0311\5\u0080A\2\u0311s\3\2\2\2\u0312\u0313\5\u0080A\2"+
		"\u0313u\3\2\2\2\u0314\u0315\5\u0080A\2\u0315w\3\2\2\2\u0316\u0317\5\u0080"+
		"A\2\u0317y\3\2\2\2\u0318\u0319\5\u0080A\2\u0319{\3\2\2\2\u031a\u031b\5"+
		"\u0080A\2\u031b}\3\2\2\2\u031c\u031d\5\u0080A\2\u031d\177\3\2\2\2\u031e"+
		"\u0326\7}\2\2\u031f\u0326\5h\65\2\u0320\u0326\7\u0080\2\2\u0321\u0322"+
		"\7\5\2\2\u0322\u0323\5\u0080A\2\u0323\u0324\7\6\2\2\u0324\u0326\3\2\2"+
		"\2\u0325\u031e\3\2\2\2\u0325\u031f\3\2\2\2\u0325\u0320\3\2\2\2\u0325\u0321"+
		"\3\2\2\2\u0326\u0081\3\2\2\2L\u0084\u0086\u0091\u0098\u009d\u00a3\u00b6"+
		"\u00ba\u00bd\u00cc\u00d5\u00e2\u00e7\u00f1\u00f3\u00fd\u0100\u010f\u011f"+
		"\u0128\u012a\u0139\u013e\u0149\u014e\u0156\u0162\u0167\u0176\u0180\u01a0"+
		"\u01a9\u01b5\u01b7\u01c7\u01cf\u01da\u01df\u01e1\u01e9\u01ef\u01f5\u0202"+
		"\u0207\u0218\u021d\u022a\u0239\u0241\u0248\u0256\u0259\u0264\u026c\u0271"+
		"\u0275\u027a\u027d\u0289\u029c\u02a2\u02a7\u02b0\u02b5\u02bf\u02c7\u02d0"+
		"\u02d5\u02e4\u02ec\u02f1\u02f5\u0302\u0325";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}