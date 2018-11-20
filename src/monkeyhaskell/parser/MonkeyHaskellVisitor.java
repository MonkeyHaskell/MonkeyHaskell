// Generated from C:/Users/creizyz/IdeaProjects/MonkeyHaskell/src\MonkeyHaskell.g4 by ANTLR 4.7
package main.java.com.monkeyhaskell.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MonkeyHaskellParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MonkeyHaskellVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MonkeyHaskellParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MonkeyHaskellParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyHaskellParser#newline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewline(MonkeyHaskellParser.NewlineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeSignature}
	 * labeled alternative in {@link MonkeyHaskellParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSignature(MonkeyHaskellParser.TypeSignatureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncDeclaration}
	 * labeled alternative in {@link MonkeyHaskellParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDeclaration(MonkeyHaskellParser.FuncDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyHaskellParser#declval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclval(MonkeyHaskellParser.DeclvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyHaskellParser#gdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGdecl(MonkeyHaskellParser.GdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyHaskellParser#guards}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuards(MonkeyHaskellParser.GuardsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GuardExpr}
	 * labeled alternative in {@link MonkeyHaskellParser#guard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuardExpr(MonkeyHaskellParser.GuardExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefaultGuard}
	 * labeled alternative in {@link MonkeyHaskellParser#guard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultGuard(MonkeyHaskellParser.DefaultGuardContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyHaskellParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(MonkeyHaskellParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyHaskellParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(MonkeyHaskellParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyHaskellParser#cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCons(MonkeyHaskellParser.ConsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyHaskellParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(MonkeyHaskellParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyHaskellParser#funcop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncop(MonkeyHaskellParser.FuncopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyHaskellParser#consop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsop(MonkeyHaskellParser.ConsopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyHaskellParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(MonkeyHaskellParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyHaskellParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MonkeyHaskellParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeCons}
	 * labeled alternative in {@link MonkeyHaskellParser#atype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCons(MonkeyHaskellParser.TypeConsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeId}
	 * labeled alternative in {@link MonkeyHaskellParser#atype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeId(MonkeyHaskellParser.TypeIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TuplType}
	 * labeled alternative in {@link MonkeyHaskellParser#atype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuplType(MonkeyHaskellParser.TuplTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListType}
	 * labeled alternative in {@link MonkeyHaskellParser#atype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListType(MonkeyHaskellParser.ListTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PareType}
	 * labeled alternative in {@link MonkeyHaskellParser#atype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPareType(MonkeyHaskellParser.PareTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnitType}
	 * labeled alternative in {@link MonkeyHaskellParser#typecons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitType(MonkeyHaskellParser.UnitTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListTypeCons}
	 * labeled alternative in {@link MonkeyHaskellParser#typecons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListTypeCons(MonkeyHaskellParser.ListTypeConsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncTypeCons}
	 * labeled alternative in {@link MonkeyHaskellParser#typecons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncTypeCons(MonkeyHaskellParser.FuncTypeConsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TuplTypeCons}
	 * labeled alternative in {@link MonkeyHaskellParser#typecons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuplTypeCons(MonkeyHaskellParser.TuplTypeConsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyHaskellParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MonkeyHaskellParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncExpr}
	 * labeled alternative in {@link MonkeyHaskellParser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExpr(MonkeyHaskellParser.FuncExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConsExpr}
	 * labeled alternative in {@link MonkeyHaskellParser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsExpr(MonkeyHaskellParser.ConsExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteExpr}
	 * labeled alternative in {@link MonkeyHaskellParser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteExpr(MonkeyHaskellParser.LiteExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PareExpr}
	 * labeled alternative in {@link MonkeyHaskellParser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPareExpr(MonkeyHaskellParser.PareExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TuplExpr}
	 * labeled alternative in {@link MonkeyHaskellParser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuplExpr(MonkeyHaskellParser.TuplExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListExpr}
	 * labeled alternative in {@link MonkeyHaskellParser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpr(MonkeyHaskellParser.ListExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SequExpr}
	 * labeled alternative in {@link MonkeyHaskellParser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequExpr(MonkeyHaskellParser.SequExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LeftExpr}
	 * labeled alternative in {@link MonkeyHaskellParser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftExpr(MonkeyHaskellParser.LeftExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RighExpr}
	 * labeled alternative in {@link MonkeyHaskellParser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRighExpr(MonkeyHaskellParser.RighExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InfOpExpr}
	 * labeled alternative in {@link MonkeyHaskellParser#infexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfOpExpr(MonkeyHaskellParser.InfOpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegaExpr}
	 * labeled alternative in {@link MonkeyHaskellParser#infexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegaExpr(MonkeyHaskellParser.NegaExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LambdaExpr}
	 * labeled alternative in {@link MonkeyHaskellParser#infexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpr(MonkeyHaskellParser.LambdaExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondExpr}
	 * labeled alternative in {@link MonkeyHaskellParser#lexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondExpr(MonkeyHaskellParser.CondExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FExpr}
	 * labeled alternative in {@link MonkeyHaskellParser#lexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFExpr(MonkeyHaskellParser.FExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyHaskellParser#fexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFexpr(MonkeyHaskellParser.FexprContext ctx);
}