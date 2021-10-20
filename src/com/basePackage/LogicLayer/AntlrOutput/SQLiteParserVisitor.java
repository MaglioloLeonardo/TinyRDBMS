package com.basePackage.LogicLayer.AntlrOutput;// Generated from D:/MEGAsync/Uni/Triennale/Terzo anno/tesi/Progetti/Progetto/src/com/basePackage/LogicLayer\SQLiteParser.g4 by ANTLR 4.9.1

//import com.basePackage.PhysicalLayer.Fields.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLiteParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLiteParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(SQLiteParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(SQLiteParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt_list(SQLiteParser.Sql_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt(SQLiteParser.Sql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#indexed_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexed_column(SQLiteParser.Indexed_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(SQLiteParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(SQLiteParser.Column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(SQLiteParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(SQLiteParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(SQLiteParser.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(SQLiteParser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_key_clause(SQLiteParser.Foreign_key_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#cte_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_table_name(SQLiteParser.Cte_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#recursive_cte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecursive_cte(SQLiteParser.Recursive_cteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#common_table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expression(SQLiteParser.Common_table_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(SQLiteParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#drop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_stmt(SQLiteParser.Drop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#booleanExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpr(SQLiteParser.BooleanExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#fieldExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldExpr(SQLiteParser.FieldExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(SQLiteParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(SQLiteParser.Boolean_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#field_litteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_litteral(SQLiteParser.Field_litteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#insert_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_values(SQLiteParser.Insert_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(SQLiteParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(SQLiteParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#select_core}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_core(SQLiteParser.Select_coreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactored_select_stmt(SQLiteParser.Factored_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_select_stmt(SQLiteParser.Simple_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_select_stmt(SQLiteParser.Compound_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#cartesian}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCartesian(SQLiteParser.CartesianContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#cartesian_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCartesian_1(SQLiteParser.Cartesian_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin(SQLiteParser.JoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#join_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_1(SQLiteParser.Join_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(SQLiteParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(SQLiteParser.Result_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#column_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name_list(SQLiteParser.Column_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#qualified_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_table_name(SQLiteParser.Qualified_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#order_by_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_stmt(SQLiteParser.Order_by_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#ordering_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdering_term(SQLiteParser.Ordering_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#asc_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsc_desc(SQLiteParser.Asc_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#offset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffset(SQLiteParser.OffsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#default_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_value(SQLiteParser.Default_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#order_by_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_expr(SQLiteParser.Order_by_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#order_by_expr_asc_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_expr_asc_desc(SQLiteParser.Order_by_expr_asc_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#expr_asc_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_asc_desc(SQLiteParser.Expr_asc_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#initial_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitial_select(SQLiteParser.Initial_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#recursive_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecursive_select(SQLiteParser.Recursive_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(SQLiteParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#error_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_message(SQLiteParser.Error_messageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#module_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_argument(SQLiteParser.Module_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(SQLiteParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(SQLiteParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(SQLiteParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(SQLiteParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#table_or_index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_index_name(SQLiteParser.Table_or_index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#new_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_table_name(SQLiteParser.New_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(SQLiteParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#foreign_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_table(SQLiteParser.Foreign_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(SQLiteParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#transaction_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_name(SQLiteParser.Transaction_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(SQLiteParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#simple_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_func(SQLiteParser.Simple_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#aggregate_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_func(SQLiteParser.Aggregate_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLiteParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(SQLiteParser.Any_nameContext ctx);
}