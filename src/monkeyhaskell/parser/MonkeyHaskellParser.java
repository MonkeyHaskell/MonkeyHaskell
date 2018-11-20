// Generated from C:/Users/creizyz/IdeaProjects/MonkeyHaskell/src\MonkeyHaskell.g4 by ANTLR 4.7
package main.java.com.monkeyhaskell.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MonkeyHaskellParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, RESERVEDID=21, FUNCID=22, CONSID=23, INTEGER=24, 
		FLOAT=25, CHAR=26, STRING=27, DECIMAL=28, OCTAL=29, HEXADECIMAL=30, EXPONENT=31, 
		WHITESPACE=32, SPACE=33, TAB=34, DASHES=35, NEWLINE=36, LOWERC=37, UPPERC=38, 
		DIGIT=39, OCTIT=40, HEXIT=41, SPECIAL=42, RESERVEDOP=43, CONSSYMBOL=44, 
		FUNCSYMBOL=45;
	public static final int
		RULE_program = 0, RULE_newline = 1, RULE_decl = 2, RULE_declval = 3, RULE_gdecl = 4, 
		RULE_guards = 5, RULE_guard = 6, RULE_identifier = 7, RULE_func = 8, RULE_cons = 9, 
		RULE_op = 10, RULE_funcop = 11, RULE_consop = 12, RULE_literal = 13, RULE_type = 14, 
		RULE_atype = 15, RULE_typecons = 16, RULE_expr = 17, RULE_aexpr = 18, 
		RULE_infexpr = 19, RULE_lexpr = 20, RULE_fexpr = 21;
	public static final String[] ruleNames = {
		"program", "newline", "decl", "declval", "gdecl", "guards", "guard", "identifier", 
		"func", "cons", "op", "funcop", "consop", "literal", "type", "atype", 
		"typecons", "expr", "aexpr", "infexpr", "lexpr", "fexpr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'::'", "'='", "'|'", "'otherwise'", "'('", "')'", "'`'", "'->'", 
		"','", "'['", "']'", "'()'", "'[]'", "'(->)'", "'..'", "'-'", "'if'", 
		"';'", "'then'", "'else'", null, null, null, null, null, null, null, null, 
		null, null, null, null, "' '", "'\t'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "RESERVEDID", "FUNCID", 
		"CONSID", "INTEGER", "FLOAT", "CHAR", "STRING", "DECIMAL", "OCTAL", "HEXADECIMAL", 
		"EXPONENT", "WHITESPACE", "SPACE", "TAB", "DASHES", "NEWLINE", "LOWERC", 
		"UPPERC", "DIGIT", "OCTIT", "HEXIT", "SPECIAL", "RESERVEDOP", "CONSSYMBOL", 
		"FUNCSYMBOL"
	};
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
	public String getGrammarFileName() { return "MonkeyHaskell.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MonkeyHaskellParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<TerminalNode> EOF() { return getTokens(MonkeyHaskellParser.EOF); }
		public TerminalNode EOF(int i) {
			return getToken(MonkeyHaskellParser.EOF, i);
		}
		public List<NewlineContext> newline() {
			return getRuleContexts(NewlineContext.class);
		}
		public NewlineContext newline(int i) {
			return getRuleContext(NewlineContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4 || _la==FUNCID) {
				{
				{
				setState(44);
				decl();
				setState(47);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EOF:
					{
					setState(45);
					match(EOF);
					}
					break;
				case NEWLINE:
					{
					setState(46);
					newline();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(53);
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

	public static class NewlineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(MonkeyHaskellParser.NEWLINE, 0); }
		public NewlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitNewline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewlineContext newline() throws RecognitionException {
		NewlineContext _localctx = new NewlineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_newline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(NEWLINE);
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

	public static class DeclContext extends ParserRuleContext {
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	 
		public DeclContext() { }
		public void copyFrom(DeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeSignatureContext extends DeclContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeSignatureContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitTypeSignature(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncDeclarationContext extends DeclContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public DeclvalContext declval() {
			return getRuleContext(DeclvalContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public FuncDeclarationContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitFuncDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		int _la;
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new TypeSignatureContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				func();
				setState(57);
				match(T__0);
				setState(58);
				type();
				}
				break;
			case 2:
				_localctx = new FuncDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				func();
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUNCID) {
					{
					{
					setState(61);
					identifier();
					}
					}
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(67);
				declval();
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

	public static class DeclvalContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public GdeclContext gdecl() {
			return getRuleContext(GdeclContext.class,0);
		}
		public DeclvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declval; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitDeclval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclvalContext declval() throws RecognitionException {
		DeclvalContext _localctx = new DeclvalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declval);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(T__1);
				setState(72);
				expr();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				gdecl();
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

	public static class GdeclContext extends ParserRuleContext {
		public GuardsContext guards() {
			return getRuleContext(GuardsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MonkeyHaskellParser.NEWLINE, 0); }
		public GdeclContext gdecl() {
			return getRuleContext(GdeclContext.class,0);
		}
		public GdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gdecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitGdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GdeclContext gdecl() throws RecognitionException {
		GdeclContext _localctx = new GdeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_gdecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(76);
			guards();
			setState(77);
			match(T__1);
			setState(78);
			expr();
			}
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(80);
				match(NEWLINE);
				setState(81);
				gdecl();
				}
				break;
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

	public static class GuardsContext extends ParserRuleContext {
		public GuardContext guard() {
			return getRuleContext(GuardContext.class,0);
		}
		public GuardsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guards; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitGuards(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuardsContext guards() throws RecognitionException {
		GuardsContext _localctx = new GuardsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_guards);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__2);
			setState(85);
			guard();
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

	public static class GuardContext extends ParserRuleContext {
		public GuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard; }
	 
		public GuardContext() { }
		public void copyFrom(GuardContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GuardExprContext extends GuardContext {
		public InfexprContext infexpr() {
			return getRuleContext(InfexprContext.class,0);
		}
		public GuardExprContext(GuardContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitGuardExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefaultGuardContext extends GuardContext {
		public DefaultGuardContext(GuardContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitDefaultGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuardContext guard() throws RecognitionException {
		GuardContext _localctx = new GuardContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_guard);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__9:
			case T__15:
			case T__16:
			case FUNCID:
			case CONSID:
			case INTEGER:
			case FLOAT:
			case CHAR:
			case STRING:
				_localctx = new GuardExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				infexpr();
				}
				break;
			case T__3:
				_localctx = new DefaultGuardContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(T__3);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode FUNCID() { return getToken(MonkeyHaskellParser.FUNCID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(FUNCID);
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

	public static class FuncContext extends ParserRuleContext {
		public TerminalNode FUNCID() { return getToken(MonkeyHaskellParser.FUNCID, 0); }
		public TerminalNode FUNCSYMBOL() { return getToken(MonkeyHaskellParser.FUNCSYMBOL, 0); }
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_func);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCID:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(FUNCID);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(T__4);
				setState(95);
				match(FUNCSYMBOL);
				setState(96);
				match(T__5);
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

	public static class ConsContext extends ParserRuleContext {
		public TerminalNode CONSID() { return getToken(MonkeyHaskellParser.CONSID, 0); }
		public TerminalNode CONSSYMBOL() { return getToken(MonkeyHaskellParser.CONSSYMBOL, 0); }
		public ConsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cons; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitCons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsContext cons() throws RecognitionException {
		ConsContext _localctx = new ConsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cons);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSID:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(CONSID);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(T__4);
				setState(101);
				match(CONSSYMBOL);
				setState(102);
				match(T__5);
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

	public static class OpContext extends ParserRuleContext {
		public FuncopContext funcop() {
			return getRuleContext(FuncopContext.class,0);
		}
		public ConsopContext consop() {
			return getRuleContext(ConsopContext.class,0);
		}
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_op);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				funcop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				consop();
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

	public static class FuncopContext extends ParserRuleContext {
		public TerminalNode FUNCSYMBOL() { return getToken(MonkeyHaskellParser.FUNCSYMBOL, 0); }
		public TerminalNode FUNCID() { return getToken(MonkeyHaskellParser.FUNCID, 0); }
		public FuncopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitFuncop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncopContext funcop() throws RecognitionException {
		FuncopContext _localctx = new FuncopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funcop);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCSYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(FUNCSYMBOL);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(T__6);
				setState(111);
				match(FUNCID);
				setState(112);
				match(T__6);
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

	public static class ConsopContext extends ParserRuleContext {
		public TerminalNode CONSSYMBOL() { return getToken(MonkeyHaskellParser.CONSSYMBOL, 0); }
		public TerminalNode CONSID() { return getToken(MonkeyHaskellParser.CONSID, 0); }
		public ConsopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitConsop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsopContext consop() throws RecognitionException {
		ConsopContext _localctx = new ConsopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_consop);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSSYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(CONSSYMBOL);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(T__6);
				setState(117);
				match(CONSID);
				setState(118);
				match(T__6);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MonkeyHaskellParser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(MonkeyHaskellParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(MonkeyHaskellParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(MonkeyHaskellParser.CHAR, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << FLOAT) | (1L << CHAR) | (1L << STRING))) != 0)) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public AtypeContext atype() {
			return getRuleContext(AtypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			atype();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(124);
				match(T__7);
				setState(125);
				type();
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

	public static class AtypeContext extends ParserRuleContext {
		public AtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atype; }
	 
		public AtypeContext() { }
		public void copyFrom(AtypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeIdContext extends AtypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeIdContext(AtypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitTypeId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TuplTypeContext extends AtypeContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TuplTypeContext(AtypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitTuplType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PareTypeContext extends AtypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PareTypeContext(AtypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitPareType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListTypeContext extends AtypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ListTypeContext(AtypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitListType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConsContext extends AtypeContext {
		public TypeconsContext typecons() {
			return getRuleContext(TypeconsContext.class,0);
		}
		public TypeConsContext(AtypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitTypeCons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtypeContext atype() throws RecognitionException {
		AtypeContext _localctx = new AtypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_atype);
		int _la;
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new TypeConsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				typecons();
				}
				break;
			case 2:
				_localctx = new TypeIdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				identifier();
				}
				break;
			case 3:
				_localctx = new TuplTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				match(T__4);
				setState(131);
				type();
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(132);
					match(T__8);
					setState(133);
					type();
					}
					}
					setState(136); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__8 );
				setState(138);
				match(T__5);
				}
				break;
			case 4:
				_localctx = new ListTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				match(T__9);
				setState(141);
				type();
				setState(142);
				match(T__10);
				}
				break;
			case 5:
				_localctx = new PareTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				match(T__4);
				setState(145);
				type();
				setState(146);
				match(T__5);
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

	public static class TypeconsContext extends ParserRuleContext {
		public TypeconsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typecons; }
	 
		public TypeconsContext() { }
		public void copyFrom(TypeconsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListTypeConsContext extends TypeconsContext {
		public ListTypeConsContext(TypeconsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitListTypeCons(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnitTypeContext extends TypeconsContext {
		public UnitTypeContext(TypeconsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitUnitType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TuplTypeConsContext extends TypeconsContext {
		public TuplTypeConsContext(TypeconsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitTuplTypeCons(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncTypeConsContext extends TypeconsContext {
		public FuncTypeConsContext(TypeconsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitFuncTypeCons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeconsContext typecons() throws RecognitionException {
		TypeconsContext _localctx = new TypeconsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typecons);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				_localctx = new UnitTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(T__11);
				}
				break;
			case T__12:
				_localctx = new ListTypeConsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(T__12);
				}
				break;
			case T__13:
				_localctx = new FuncTypeConsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				match(T__13);
				}
				break;
			case T__4:
				_localctx = new TuplTypeConsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				match(T__4);
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(154);
					match(T__8);
					}
					}
					setState(157); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__8 );
				setState(159);
				match(T__5);
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

	public static class ExprContext extends ParserRuleContext {
		public InfexprContext infexpr() {
			return getRuleContext(InfexprContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr);
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				infexpr();
				setState(163);
				match(T__0);
				setState(164);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				infexpr();
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

	public static class AexprContext extends ParserRuleContext {
		public AexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexpr; }
	 
		public AexprContext() { }
		public void copyFrom(AexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RighExprContext extends AexprContext {
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public InfexprContext infexpr() {
			return getRuleContext(InfexprContext.class,0);
		}
		public RighExprContext(AexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitRighExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SequExprContext extends AexprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SequExprContext(AexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitSequExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteExprContext extends AexprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteExprContext(AexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitLiteExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PareExprContext extends AexprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PareExprContext(AexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitPareExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConsExprContext extends AexprContext {
		public ConsContext cons() {
			return getRuleContext(ConsContext.class,0);
		}
		public ConsExprContext(AexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitConsExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListExprContext extends AexprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ListExprContext(AexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitListExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeftExprContext extends AexprContext {
		public InfexprContext infexpr() {
			return getRuleContext(InfexprContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public LeftExprContext(AexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitLeftExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncExprContext extends AexprContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public FuncExprContext(AexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitFuncExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TuplExprContext extends AexprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TuplExprContext(AexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitTuplExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AexprContext aexpr() throws RecognitionException {
		AexprContext _localctx = new AexprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_aexpr);
		int _la;
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new FuncExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				func();
				}
				break;
			case 2:
				_localctx = new ConsExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				cons();
				}
				break;
			case 3:
				_localctx = new LiteExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				literal();
				}
				break;
			case 4:
				_localctx = new PareExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				match(T__4);
				setState(173);
				expr();
				setState(174);
				match(T__5);
				}
				break;
			case 5:
				_localctx = new TuplExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(176);
				match(T__4);
				setState(177);
				expr();
				setState(180); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(178);
					match(T__8);
					setState(179);
					expr();
					}
					}
					setState(182); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__8 );
				setState(184);
				match(T__5);
				}
				break;
			case 6:
				_localctx = new ListExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(186);
				match(T__9);
				setState(187);
				expr();
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(188);
					match(T__8);
					setState(189);
					expr();
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(195);
				match(T__10);
				}
				break;
			case 7:
				_localctx = new SequExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(197);
				match(T__9);
				setState(198);
				expr();
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(199);
					match(T__8);
					setState(200);
					expr();
					}
				}

				setState(203);
				match(T__14);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__9) | (1L << T__15) | (1L << T__16) | (1L << FUNCID) | (1L << CONSID) | (1L << INTEGER) | (1L << FLOAT) | (1L << CHAR) | (1L << STRING))) != 0)) {
					{
					setState(204);
					expr();
					}
				}

				setState(207);
				match(T__10);
				}
				break;
			case 8:
				_localctx = new LeftExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(209);
				match(T__4);
				setState(210);
				infexpr();
				setState(211);
				op();
				setState(212);
				match(T__5);
				}
				break;
			case 9:
				_localctx = new RighExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(214);
				match(T__4);
				setState(215);
				op();
				setState(216);
				infexpr();
				setState(217);
				match(T__5);
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

	public static class InfexprContext extends ParserRuleContext {
		public InfexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infexpr; }
	 
		public InfexprContext() { }
		public void copyFrom(InfexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LambdaExprContext extends InfexprContext {
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public LambdaExprContext(InfexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitLambdaExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegaExprContext extends InfexprContext {
		public InfexprContext infexpr() {
			return getRuleContext(InfexprContext.class,0);
		}
		public NegaExprContext(InfexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitNegaExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InfOpExprContext extends InfexprContext {
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public InfexprContext infexpr() {
			return getRuleContext(InfexprContext.class,0);
		}
		public InfOpExprContext(InfexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitInfOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfexprContext infexpr() throws RecognitionException {
		InfexprContext _localctx = new InfexprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_infexpr);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new InfOpExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				lexpr();
				setState(222);
				op();
				setState(223);
				infexpr();
				}
				break;
			case 2:
				_localctx = new NegaExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(T__15);
				setState(226);
				infexpr();
				}
				break;
			case 3:
				_localctx = new LambdaExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				lexpr();
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

	public static class LexprContext extends ParserRuleContext {
		public LexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexpr; }
	 
		public LexprContext() { }
		public void copyFrom(LexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FExprContext extends LexprContext {
		public FexprContext fexpr() {
			return getRuleContext(FexprContext.class,0);
		}
		public FExprContext(LexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitFExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondExprContext extends LexprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CondExprContext(LexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitCondExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexprContext lexpr() throws RecognitionException {
		LexprContext _localctx = new LexprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_lexpr);
		int _la;
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				_localctx = new CondExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(T__16);
				setState(231);
				expr();
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(232);
					match(T__17);
					}
				}

				setState(235);
				match(T__18);
				setState(236);
				expr();
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(237);
					match(T__17);
					}
				}

				setState(240);
				match(T__19);
				setState(241);
				expr();
				}
				break;
			case T__4:
			case T__9:
			case FUNCID:
			case CONSID:
			case INTEGER:
			case FLOAT:
			case CHAR:
			case STRING:
				_localctx = new FExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				fexpr();
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

	public static class FexprContext extends ParserRuleContext {
		public List<AexprContext> aexpr() {
			return getRuleContexts(AexprContext.class);
		}
		public AexprContext aexpr(int i) {
			return getRuleContext(AexprContext.class,i);
		}
		public FexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyHaskellVisitor ) return ((MonkeyHaskellVisitor<? extends T>)visitor).visitFexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FexprContext fexpr() throws RecognitionException {
		FexprContext _localctx = new FexprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(246);
				aexpr();
				}
				}
				setState(249); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__9) | (1L << FUNCID) | (1L << CONSID) | (1L << INTEGER) | (1L << FLOAT) | (1L << CHAR) | (1L << STRING))) != 0) );
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u00fe\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\5\2\62"+
		"\n\2\7\2\64\n\2\f\2\16\2\67\13\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4A"+
		"\n\4\f\4\16\4D\13\4\3\4\3\4\5\4H\n\4\3\5\3\5\3\5\5\5M\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6U\n\6\3\7\3\7\3\7\3\b\3\b\5\b\\\n\b\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\5\nd\n\n\3\13\3\13\3\13\3\13\5\13j\n\13\3\f\3\f\5\fn\n\f\3\r\3"+
		"\r\3\r\3\r\5\rt\n\r\3\16\3\16\3\16\3\16\5\16z\n\16\3\17\3\17\3\20\3\20"+
		"\3\20\5\20\u0081\n\20\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u0089\n\21\r"+
		"\21\16\21\u008a\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u0097\n\21\3\22\3\22\3\22\3\22\3\22\6\22\u009e\n\22\r\22\16\22\u009f"+
		"\3\22\5\22\u00a3\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u00aa\n\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\6\24\u00b7\n\24\r\24"+
		"\16\24\u00b8\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00c1\n\24\f\24\16\24"+
		"\u00c4\13\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00cc\n\24\3\24\3\24\5"+
		"\24\u00d0\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u00de\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00e7\n"+
		"\25\3\26\3\26\3\26\5\26\u00ec\n\26\3\26\3\26\3\26\5\26\u00f1\n\26\3\26"+
		"\3\26\3\26\3\26\5\26\u00f7\n\26\3\27\6\27\u00fa\n\27\r\27\16\27\u00fb"+
		"\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\3\3\2\32"+
		"\35\2\u0110\2\65\3\2\2\2\48\3\2\2\2\6G\3\2\2\2\bL\3\2\2\2\nN\3\2\2\2\f"+
		"V\3\2\2\2\16[\3\2\2\2\20]\3\2\2\2\22c\3\2\2\2\24i\3\2\2\2\26m\3\2\2\2"+
		"\30s\3\2\2\2\32y\3\2\2\2\34{\3\2\2\2\36}\3\2\2\2 \u0096\3\2\2\2\"\u00a2"+
		"\3\2\2\2$\u00a9\3\2\2\2&\u00dd\3\2\2\2(\u00e6\3\2\2\2*\u00f6\3\2\2\2,"+
		"\u00f9\3\2\2\2.\61\5\6\4\2/\62\7\2\2\3\60\62\5\4\3\2\61/\3\2\2\2\61\60"+
		"\3\2\2\2\62\64\3\2\2\2\63.\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3"+
		"\2\2\2\66\3\3\2\2\2\67\65\3\2\2\289\7&\2\29\5\3\2\2\2:;\5\22\n\2;<\7\3"+
		"\2\2<=\5\36\20\2=H\3\2\2\2>B\5\22\n\2?A\5\20\t\2@?\3\2\2\2AD\3\2\2\2B"+
		"@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\5\b\5\2FH\3\2\2\2G:\3\2\2\2"+
		"G>\3\2\2\2H\7\3\2\2\2IJ\7\4\2\2JM\5$\23\2KM\5\n\6\2LI\3\2\2\2LK\3\2\2"+
		"\2M\t\3\2\2\2NO\5\f\7\2OP\7\4\2\2PQ\5$\23\2QT\3\2\2\2RS\7&\2\2SU\5\n\6"+
		"\2TR\3\2\2\2TU\3\2\2\2U\13\3\2\2\2VW\7\5\2\2WX\5\16\b\2X\r\3\2\2\2Y\\"+
		"\5(\25\2Z\\\7\6\2\2[Y\3\2\2\2[Z\3\2\2\2\\\17\3\2\2\2]^\7\30\2\2^\21\3"+
		"\2\2\2_d\7\30\2\2`a\7\7\2\2ab\7/\2\2bd\7\b\2\2c_\3\2\2\2c`\3\2\2\2d\23"+
		"\3\2\2\2ej\7\31\2\2fg\7\7\2\2gh\7.\2\2hj\7\b\2\2ie\3\2\2\2if\3\2\2\2j"+
		"\25\3\2\2\2kn\5\30\r\2ln\5\32\16\2mk\3\2\2\2ml\3\2\2\2n\27\3\2\2\2ot\7"+
		"/\2\2pq\7\t\2\2qr\7\30\2\2rt\7\t\2\2so\3\2\2\2sp\3\2\2\2t\31\3\2\2\2u"+
		"z\7.\2\2vw\7\t\2\2wx\7\31\2\2xz\7\t\2\2yu\3\2\2\2yv\3\2\2\2z\33\3\2\2"+
		"\2{|\t\2\2\2|\35\3\2\2\2}\u0080\5 \21\2~\177\7\n\2\2\177\u0081\5\36\20"+
		"\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\37\3\2\2\2\u0082\u0097\5\""+
		"\22\2\u0083\u0097\5\20\t\2\u0084\u0085\7\7\2\2\u0085\u0088\5\36\20\2\u0086"+
		"\u0087\7\13\2\2\u0087\u0089\5\36\20\2\u0088\u0086\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008d\7\b\2\2\u008d\u0097\3\2\2\2\u008e\u008f\7\f\2\2\u008f\u0090\5\36"+
		"\20\2\u0090\u0091\7\r\2\2\u0091\u0097\3\2\2\2\u0092\u0093\7\7\2\2\u0093"+
		"\u0094\5\36\20\2\u0094\u0095\7\b\2\2\u0095\u0097\3\2\2\2\u0096\u0082\3"+
		"\2\2\2\u0096\u0083\3\2\2\2\u0096\u0084\3\2\2\2\u0096\u008e\3\2\2\2\u0096"+
		"\u0092\3\2\2\2\u0097!\3\2\2\2\u0098\u00a3\7\16\2\2\u0099\u00a3\7\17\2"+
		"\2\u009a\u00a3\7\20\2\2\u009b\u009d\7\7\2\2\u009c\u009e\7\13\2\2\u009d"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\7\b\2\2\u00a2\u0098\3\2\2\2\u00a2"+
		"\u0099\3\2\2\2\u00a2\u009a\3\2\2\2\u00a2\u009b\3\2\2\2\u00a3#\3\2\2\2"+
		"\u00a4\u00a5\5(\25\2\u00a5\u00a6\7\3\2\2\u00a6\u00a7\5\36\20\2\u00a7\u00aa"+
		"\3\2\2\2\u00a8\u00aa\5(\25\2\u00a9\u00a4\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"%\3\2\2\2\u00ab\u00de\5\22\n\2\u00ac\u00de\5\24\13\2\u00ad\u00de\5\34"+
		"\17\2\u00ae\u00af\7\7\2\2\u00af\u00b0\5$\23\2\u00b0\u00b1\7\b\2\2\u00b1"+
		"\u00de\3\2\2\2\u00b2\u00b3\7\7\2\2\u00b3\u00b6\5$\23\2\u00b4\u00b5\7\13"+
		"\2\2\u00b5\u00b7\5$\23\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\7\b"+
		"\2\2\u00bb\u00de\3\2\2\2\u00bc\u00bd\7\f\2\2\u00bd\u00c2\5$\23\2\u00be"+
		"\u00bf\7\13\2\2\u00bf\u00c1\5$\23\2\u00c0\u00be\3\2\2\2\u00c1\u00c4\3"+
		"\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c5\u00c6\7\r\2\2\u00c6\u00de\3\2\2\2\u00c7\u00c8\7\f"+
		"\2\2\u00c8\u00cb\5$\23\2\u00c9\u00ca\7\13\2\2\u00ca\u00cc\5$\23\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\7\21"+
		"\2\2\u00ce\u00d0\5$\23\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d2\7\r\2\2\u00d2\u00de\3\2\2\2\u00d3\u00d4\7\7"+
		"\2\2\u00d4\u00d5\5(\25\2\u00d5\u00d6\5\26\f\2\u00d6\u00d7\7\b\2\2\u00d7"+
		"\u00de\3\2\2\2\u00d8\u00d9\7\7\2\2\u00d9\u00da\5\26\f\2\u00da\u00db\5"+
		"(\25\2\u00db\u00dc\7\b\2\2\u00dc\u00de\3\2\2\2\u00dd\u00ab\3\2\2\2\u00dd"+
		"\u00ac\3\2\2\2\u00dd\u00ad\3\2\2\2\u00dd\u00ae\3\2\2\2\u00dd\u00b2\3\2"+
		"\2\2\u00dd\u00bc\3\2\2\2\u00dd\u00c7\3\2\2\2\u00dd\u00d3\3\2\2\2\u00dd"+
		"\u00d8\3\2\2\2\u00de\'\3\2\2\2\u00df\u00e0\5*\26\2\u00e0\u00e1\5\26\f"+
		"\2\u00e1\u00e2\5(\25\2\u00e2\u00e7\3\2\2\2\u00e3\u00e4\7\22\2\2\u00e4"+
		"\u00e7\5(\25\2\u00e5\u00e7\5*\26\2\u00e6\u00df\3\2\2\2\u00e6\u00e3\3\2"+
		"\2\2\u00e6\u00e5\3\2\2\2\u00e7)\3\2\2\2\u00e8\u00e9\7\23\2\2\u00e9\u00eb"+
		"\5$\23\2\u00ea\u00ec\7\24\2\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2"+
		"\u00ec\u00ed\3\2\2\2\u00ed\u00ee\7\25\2\2\u00ee\u00f0\5$\23\2\u00ef\u00f1"+
		"\7\24\2\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2"+
		"\u00f2\u00f3\7\26\2\2\u00f3\u00f4\5$\23\2\u00f4\u00f7\3\2\2\2\u00f5\u00f7"+
		"\5,\27\2\u00f6\u00e8\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7+\3\2\2\2\u00f8"+
		"\u00fa\5&\24\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc-\3\2\2\2\36\61\65BGLT[cimsy\u0080\u008a"+
		"\u0096\u009f\u00a2\u00a9\u00b8\u00c2\u00cb\u00cf\u00dd\u00e6\u00eb\u00f0"+
		"\u00f6\u00fb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}