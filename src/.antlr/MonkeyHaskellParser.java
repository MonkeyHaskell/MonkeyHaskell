// Generated from c:\Users\creizyz\IdeaProjects\MonkeyHaskell\src\MonkeyHaskell.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MonkeyHaskellParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, LOWERID=4, UPPERID=5, INTEGER2=6, FLOAT=7, CHAR=8, 
		STRING=9, DECIMAL=10, OCTAL=11, HEXADECIMAL=12, EXPONENT=13, WHITESPACE=14, 
		SPACE=15, TAB=16, LOWERC=17, UPPERC=18, DIGIT=19, OCTIT=20, HEXIT=21, 
		SYMBOL=22, SPECIAL=23, RESERVEDOP=24;
	public static final int
		RULE_decl = 0, RULE_identifier = 1, RULE_expr = 2, RULE_literal = 3;
	public static final String[] ruleNames = {
		"decl", "identifier", "expr", "literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'('", "')'", null, null, null, null, null, null, null, null, 
		null, null, null, "' '", "'\t'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "LOWERID", "UPPERID", "INTEGER2", "FLOAT", "CHAR", 
		"STRING", "DECIMAL", "OCTAL", "HEXADECIMAL", "EXPONENT", "WHITESPACE", 
		"SPACE", "TAB", "LOWERC", "UPPERC", "DIGIT", "OCTIT", "HEXIT", "SYMBOL", 
		"SPECIAL", "RESERVEDOP"
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
	public static class DeclContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				identifier();
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LOWERID );
			setState(13);
			match(T__0);
			setState(14);
			expr();
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
		public TerminalNode LOWERID() { return getToken(MonkeyHaskellParser.LOWERID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(LOWERID);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERID:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				identifier();
				}
				break;
			case INTEGER2:
			case FLOAT:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				literal();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				match(T__1);
				setState(21);
				expr();
				setState(22);
				match(T__2);
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
		public TerminalNode INTEGER2() { return getToken(MonkeyHaskellParser.INTEGER2, 0); }
		public TerminalNode FLOAT() { return getToken(MonkeyHaskellParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(MonkeyHaskellParser.CHAR, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER2) | (1L << FLOAT) | (1L << CHAR) | (1L << STRING))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\37\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\6\2\f\n\2\r\2\16\2\r\3\2\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4\33\n\4\3\5\3\5\3\5\2\2\6\2\4\6\b\2\3\3\2\b\13"+
		"\2\35\2\13\3\2\2\2\4\22\3\2\2\2\6\32\3\2\2\2\b\34\3\2\2\2\n\f\5\4\3\2"+
		"\13\n\3\2\2\2\f\r\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\17\3\2\2\2\17\20"+
		"\7\3\2\2\20\21\5\6\4\2\21\3\3\2\2\2\22\23\7\6\2\2\23\5\3\2\2\2\24\33\5"+
		"\4\3\2\25\33\5\b\5\2\26\27\7\4\2\2\27\30\5\6\4\2\30\31\7\5\2\2\31\33\3"+
		"\2\2\2\32\24\3\2\2\2\32\25\3\2\2\2\32\26\3\2\2\2\33\7\3\2\2\2\34\35\t"+
		"\2\2\2\35\t\3\2\2\2\4\r\32";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}