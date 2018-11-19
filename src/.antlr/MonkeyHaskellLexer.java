// Generated from c:\Users\creizyz\IdeaProjects\MonkeyHaskell\src\MonkeyHaskell.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MonkeyHaskellLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, RESERVEDID=13, FUNCID=14, CONSID=15, INTEGER=16, 
		FLOAT=17, CHAR=18, STRING=19, DECIMAL=20, OCTAL=21, HEXADECIMAL=22, EXPONENT=23, 
		WHITESPACE=24, SPACE=25, TAB=26, DASHES=27, LOWERC=28, UPPERC=29, DIGIT=30, 
		OCTIT=31, HEXIT=32, SPECIAL=33, RESERVEDOP=34, CONSSYMBOL=35, FUNCSYMBOL=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "RESERVEDID", "FUNCID", "CONSID", "INTEGER", 
		"FLOAT", "CHAR", "STRING", "DECIMAL", "OCTAL", "HEXADECIMAL", "EXPONENT", 
		"WHITESPACE", "SPACE", "TAB", "DASHES", "LOWERC", "UPPERC", "DIGIT", "OCTIT", 
		"HEXIT", "SYMBOL", "SPECIAL", "RESERVEDOP", "CONSSYMBOL", "FUNCSYMBOL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'('", "')'", "'`'", "','", "'['", "']'", "'..'", "'if'", 
		"';'", "'then'", "'else'", null, null, null, null, null, null, null, null, 
		null, null, null, null, "' '", "'\t'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "RESERVEDID", "FUNCID", "CONSID", "INTEGER", "FLOAT", "CHAR", "STRING", 
		"DECIMAL", "OCTAL", "HEXADECIMAL", "EXPONENT", "WHITESPACE", "SPACE", 
		"TAB", "DASHES", "LOWERC", "UPPERC", "DIGIT", "OCTIT", "HEXIT", "SPECIAL", 
		"RESERVEDOP", "CONSSYMBOL", "FUNCSYMBOL"
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


	public MonkeyHaskellLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MonkeyHaskell.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0115\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16x\n\16\3\17\3\17\3\17\3\17\3\17\7\17\177\n\17\f\17\16\17\u0082"+
		"\13\17\3\20\3\20\3\20\3\20\3\20\7\20\u0089\n\20\f\20\16\20\u008c\13\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u009f\n\21\3\22\3\22\3\22\3\22\5\22\u00a5\n\22\3"+
		"\22\3\22\3\22\5\22\u00aa\n\22\3\23\3\23\7\23\u00ae\n\23\f\23\16\23\u00b1"+
		"\13\23\3\23\3\23\3\24\3\24\7\24\u00b7\n\24\f\24\16\24\u00ba\13\24\3\24"+
		"\3\24\3\25\6\25\u00bf\n\25\r\25\16\25\u00c0\3\26\6\26\u00c4\n\26\r\26"+
		"\16\26\u00c5\3\27\6\27\u00c9\n\27\r\27\16\27\u00ca\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\5\31\u00d3\n\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\7\34\u00df\n\34\f\34\16\34\u00e2\13\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\5!\u00ee\n!\3\"\3\"\3\"\3\"\3\"\5\"\u00f5\n\"\3#\3#"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0106\n$\3%\3%\7%\u010a\n%"+
		"\f%\16%\u010d\13%\3&\3&\7&\u0111\n&\f&\16&\u0114\13&\2\2\'\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C\2E#"+
		"G$I%K&\3\2\20\4\2))^^\4\2$$^^\4\2GGgg\4\2--//\3\2c|\3\2C\\\3\2\62;\3\2"+
		"\629\4\2CHch\4\2##%(\n\2--/\61<<>B^^``~~\u0080\u0080\n\2*+..==]]__bb}"+
		"}\177\177\5\2??^^~~\4\2BB\u0080\u0080\2\u0136\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2"+
		"\5O\3\2\2\2\7Q\3\2\2\2\tS\3\2\2\2\13U\3\2\2\2\rW\3\2\2\2\17Y\3\2\2\2\21"+
		"[\3\2\2\2\23^\3\2\2\2\25a\3\2\2\2\27c\3\2\2\2\31h\3\2\2\2\33w\3\2\2\2"+
		"\35y\3\2\2\2\37\u0083\3\2\2\2!\u009e\3\2\2\2#\u00a9\3\2\2\2%\u00ab\3\2"+
		"\2\2\'\u00b4\3\2\2\2)\u00be\3\2\2\2+\u00c3\3\2\2\2-\u00c8\3\2\2\2/\u00cc"+
		"\3\2\2\2\61\u00d2\3\2\2\2\63\u00d6\3\2\2\2\65\u00d8\3\2\2\2\67\u00da\3"+
		"\2\2\29\u00e3\3\2\2\2;\u00e5\3\2\2\2=\u00e7\3\2\2\2?\u00e9\3\2\2\2A\u00ed"+
		"\3\2\2\2C\u00f4\3\2\2\2E\u00f6\3\2\2\2G\u0105\3\2\2\2I\u0107\3\2\2\2K"+
		"\u010e\3\2\2\2MN\7?\2\2N\4\3\2\2\2OP\7*\2\2P\6\3\2\2\2QR\7+\2\2R\b\3\2"+
		"\2\2ST\7b\2\2T\n\3\2\2\2UV\7.\2\2V\f\3\2\2\2WX\7]\2\2X\16\3\2\2\2YZ\7"+
		"_\2\2Z\20\3\2\2\2[\\\7\60\2\2\\]\7\60\2\2]\22\3\2\2\2^_\7k\2\2_`\7h\2"+
		"\2`\24\3\2\2\2ab\7=\2\2b\26\3\2\2\2cd\7v\2\2de\7j\2\2ef\7g\2\2fg\7p\2"+
		"\2g\30\3\2\2\2hi\7g\2\2ij\7n\2\2jk\7u\2\2kl\7g\2\2l\32\3\2\2\2mn\7k\2"+
		"\2nx\7h\2\2op\7v\2\2pq\7j\2\2qr\7g\2\2rx\7p\2\2st\7g\2\2tu\7n\2\2uv\7"+
		"u\2\2vx\7g\2\2wm\3\2\2\2wo\3\2\2\2ws\3\2\2\2x\34\3\2\2\2y\u0080\59\35"+
		"\2z\177\59\35\2{\177\5;\36\2|\177\5=\37\2}\177\7)\2\2~z\3\2\2\2~{\3\2"+
		"\2\2~|\3\2\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\36\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u008a\5;\36\2\u0084"+
		"\u0089\59\35\2\u0085\u0089\5;\36\2\u0086\u0089\5=\37\2\u0087\u0089\7)"+
		"\2\2\u0088\u0084\3\2\2\2\u0088\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b \3\2\2\2\u008c\u008a\3\2\2\2\u008d\u009f\5)\25\2\u008e\u008f"+
		"\7\62\2\2\u008f\u0090\7q\2\2\u0090\u0091\3\2\2\2\u0091\u009f\5+\26\2\u0092"+
		"\u0093\7\62\2\2\u0093\u0094\7Q\2\2\u0094\u0095\3\2\2\2\u0095\u009f\5+"+
		"\26\2\u0096\u0097\7\62\2\2\u0097\u0098\7z\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009f\5-\27\2\u009a\u009b\7\62\2\2\u009b\u009c\7Z\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009f\5-\27\2\u009e\u008d\3\2\2\2\u009e\u008e\3\2\2\2\u009e"+
		"\u0092\3\2\2\2\u009e\u0096\3\2\2\2\u009e\u009a\3\2\2\2\u009f\"\3\2\2\2"+
		"\u00a0\u00a1\5)\25\2\u00a1\u00a2\7\60\2\2\u00a2\u00a4\5)\25\2\u00a3\u00a5"+
		"\5/\30\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00aa\3\2\2\2\u00a6"+
		"\u00a7\5)\25\2\u00a7\u00a8\5/\30\2\u00a8\u00aa\3\2\2\2\u00a9\u00a0\3\2"+
		"\2\2\u00a9\u00a6\3\2\2\2\u00aa$\3\2\2\2\u00ab\u00af\7)\2\2\u00ac\u00ae"+
		"\n\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7)"+
		"\2\2\u00b3&\3\2\2\2\u00b4\u00b8\7$\2\2\u00b5\u00b7\n\3\2\2\u00b6\u00b5"+
		"\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7$\2\2\u00bc(\3\2\2\2\u00bd"+
		"\u00bf\5=\37\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2"+
		"\2\2\u00c0\u00c1\3\2\2\2\u00c1*\3\2\2\2\u00c2\u00c4\5? \2\u00c3\u00c2"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		",\3\2\2\2\u00c7\u00c9\5A!\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb.\3\2\2\2\u00cc\u00cd\t\4\2\2"+
		"\u00cd\u00ce\t\5\2\2\u00ce\u00cf\5)\25\2\u00cf\60\3\2\2\2\u00d0\u00d3"+
		"\5\63\32\2\u00d1\u00d3\5\65\33\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2"+
		"\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\b\31\2\2\u00d5\62\3\2\2\2\u00d6\u00d7"+
		"\7\"\2\2\u00d7\64\3\2\2\2\u00d8\u00d9\7\13\2\2\u00d9\66\3\2\2\2\u00da"+
		"\u00db\7/\2\2\u00db\u00dc\7/\2\2\u00dc\u00e0\3\2\2\2\u00dd\u00df\7/\2"+
		"\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1"+
		"\3\2\2\2\u00e18\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\t\6\2\2\u00e4"+
		":\3\2\2\2\u00e5\u00e6\t\7\2\2\u00e6<\3\2\2\2\u00e7\u00e8\t\b\2\2\u00e8"+
		">\3\2\2\2\u00e9\u00ea\t\t\2\2\u00ea@\3\2\2\2\u00eb\u00ee\5=\37\2\u00ec"+
		"\u00ee\t\n\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00eeB\3\2\2\2"+
		"\u00ef\u00f5\t\13\2\2\u00f0\u00f1\7\u00e4\2\2\u00f1\u00f2\7\u203b\2\2"+
		"\u00f2\u00f5\7\u2022\2\2\u00f3\u00f5\t\f\2\2\u00f4\u00ef\3\2\2\2\u00f4"+
		"\u00f0\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5D\3\2\2\2\u00f6\u00f7\t\r\2\2"+
		"\u00f7F\3\2\2\2\u00f8\u00f9\7\60\2\2\u00f9\u0106\7\60\2\2\u00fa\u0106"+
		"\7<\2\2\u00fb\u00fc\7<\2\2\u00fc\u0106\7<\2\2\u00fd\u0106\t\16\2\2\u00fe"+
		"\u00ff\7>\2\2\u00ff\u0106\7/\2\2\u0100\u0101\7/\2\2\u0101\u0106\7@\2\2"+
		"\u0102\u0106\t\17\2\2\u0103\u0104\7?\2\2\u0104\u0106\7@\2\2\u0105\u00f8"+
		"\3\2\2\2\u0105\u00fa\3\2\2\2\u0105\u00fb\3\2\2\2\u0105\u00fd\3\2\2\2\u0105"+
		"\u00fe\3\2\2\2\u0105\u0100\3\2\2\2\u0105\u0102\3\2\2\2\u0105\u0103\3\2"+
		"\2\2\u0106H\3\2\2\2\u0107\u010b\7<\2\2\u0108\u010a\5C\"\2\u0109\u0108"+
		"\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"J\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0112\5C\"\2\u010f\u0111\5C\"\2\u0110"+
		"\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113L\3\2\2\2\u0114\u0112\3\2\2\2\27\2w~\u0080\u0088\u008a\u009e"+
		"\u00a4\u00a9\u00af\u00b8\u00c0\u00c5\u00ca\u00d2\u00e0\u00ed\u00f4\u0105"+
		"\u010b\u0112\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}