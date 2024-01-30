/*
 * Copyright 2023 - 2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated from org/springframework/ai/vectorstore/filter/antlr4/Filters.g4 by ANTLR 4.13.1
package org.springframework.ai.vectorstore.filter.antlr4;

/*
 * Copyright 2023-2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// ############################################################
// # NOTE: This is ANTLR4 auto-generated code. Do not modify! #
// ############################################################

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape" })
public class FiltersLexer extends Lexer {

	static {
		RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;

	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();

	public static final int WHERE = 1, DOT = 2, COMMA = 3, LEFT_SQUARE_BRACKETS = 4, RIGHT_SQUARE_BRACKETS = 5,
			LEFT_PARENTHESIS = 6, RIGHT_PARENTHESIS = 7, EQUALS = 8, MINUS = 9, PLUS = 10, GT = 11, GE = 12, LT = 13,
			LE = 14, NE = 15, AND = 16, OR = 17, IN = 18, NIN = 19, NOT = 20, BOOLEAN_VALUE = 21, QUOTED_STRING = 22,
			INTEGER_VALUE = 23, DECIMAL_VALUE = 24, IDENTIFIER = 25, WS = 26;

	public static String[] channelNames = { "DEFAULT_TOKEN_CHANNEL", "HIDDEN" };

	public static String[] modeNames = { "DEFAULT_MODE" };

	private static String[] makeRuleNames() {
		return new String[] { "WHERE", "DOT", "COMMA", "LEFT_SQUARE_BRACKETS", "RIGHT_SQUARE_BRACKETS",
				"LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "EQUALS", "MINUS", "PLUS", "GT", "GE", "LT", "LE", "NE", "AND",
				"OR", "IN", "NIN", "NOT", "BOOLEAN_VALUE", "QUOTED_STRING", "INTEGER_VALUE", "DECIMAL_VALUE",
				"IDENTIFIER", "DECIMAL_DIGITS", "DIGIT", "LETTER", "WS" };
	}

	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] { null, null, "'.'", "','", "'['", "']'", "'('", "')'", "'=='", "'-'", "'+'", "'>'", "'>='",
				"'<'", "'<='", "'!='" };
	}

	private static final String[] _LITERAL_NAMES = makeLiteralNames();

	private static String[] makeSymbolicNames() {
		return new String[] { null, "WHERE", "DOT", "COMMA", "LEFT_SQUARE_BRACKETS", "RIGHT_SQUARE_BRACKETS",
				"LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "EQUALS", "MINUS", "PLUS", "GT", "GE", "LT", "LE", "NE", "AND",
				"OR", "IN", "NIN", "NOT", "BOOLEAN_VALUE", "QUOTED_STRING", "INTEGER_VALUE", "DECIMAL_VALUE",
				"IDENTIFIER", "WS" };
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

	public FiltersLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	@Override
	public String getGrammarFileName() {
		return "Filters.g4";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public String[] getChannelNames() {
		return channelNames;
	}

	@Override
	public String[] getModeNames() {
		return modeNames;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public static final String _serializedATN = "\u0004\u0000\u001a\u00e5\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"
			+ "\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"
			+ "\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"
			+ "\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"
			+ "\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"
			+ "\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"
			+ "\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"
			+ "\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"
			+ "\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"
			+ "\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000"
			+ "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"
			+ "\u0001\u0000\u0001\u0000\u0003\u0000F\b\u0000\u0001\u0001\u0001\u0001"
			+ "\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"
			+ "\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"
			+ "\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"
			+ "\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"
			+ "\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"
			+ "\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000fp\b"
			+ "\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"
			+ "\u0010\u0003\u0010x\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"
			+ "\u0011\u0003\u0011~\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"
			+ "\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0086\b\u0012\u0001\u0013\u0001"
			+ "\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u008e"
			+ "\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"
			+ "\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"
			+ "\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"
			+ "\u0014\u0003\u0014\u00a2\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"
			+ "\u0015\u0005\u0015\u00a8\b\u0015\n\u0015\f\u0015\u00ab\t\u0015\u0001\u0015"
			+ "\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00b2\b\u0015"
			+ "\n\u0015\f\u0015\u00b5\t\u0015\u0001\u0015\u0003\u0015\u00b8\b\u0015\u0001"
			+ "\u0016\u0004\u0016\u00bb\b\u0016\u000b\u0016\f\u0016\u00bc\u0001\u0017"
			+ "\u0001\u0017\u0001\u0018\u0001\u0018\u0004\u0018\u00c3\b\u0018\u000b\u0018"
			+ "\f\u0018\u00c4\u0001\u0019\u0004\u0019\u00c8\b\u0019\u000b\u0019\f\u0019"
			+ "\u00c9\u0001\u0019\u0001\u0019\u0005\u0019\u00ce\b\u0019\n\u0019\f\u0019"
			+ "\u00d1\t\u0019\u0001\u0019\u0001\u0019\u0004\u0019\u00d5\b\u0019\u000b"
			+ "\u0019\f\u0019\u00d6\u0003\u0019\u00d9\b\u0019\u0001\u001a\u0001\u001a"
			+ "\u0001\u001b\u0001\u001b\u0001\u001c\u0004\u001c\u00e0\b\u001c\u000b\u001c"
			+ "\f\u001c\u00e1\u0001\u001c\u0001\u001c\u0000\u0000\u001d\u0001\u0001\u0003"
			+ "\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"
			+ "\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"
			+ "!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u0000"
			+ "5\u00007\u00009\u001a\u0001\u0000\u0005\u0002\u0000\'\'\\\\\u0002\u0000"
			+ "\"\"\\\\\u0001\u000009\u0002\u0000AZaz\u0003\u0000\t\n\r\r  \u00f9\u0000"
			+ "\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"
			+ "\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"
			+ "\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"
			+ "\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"
			+ "\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"
			+ "\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"
			+ "\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"
			+ "\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"
			+ "\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"
			+ "\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"
			+ "\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"
			+ "\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00009\u0001\u0000"
			+ "\u0000\u0000\u0001E\u0001\u0000\u0000\u0000\u0003G\u0001\u0000\u0000\u0000"
			+ "\u0005I\u0001\u0000\u0000\u0000\u0007K\u0001\u0000\u0000\u0000\tM\u0001"
			+ "\u0000\u0000\u0000\u000bO\u0001\u0000\u0000\u0000\rQ\u0001\u0000\u0000"
			+ "\u0000\u000fS\u0001\u0000\u0000\u0000\u0011V\u0001\u0000\u0000\u0000\u0013"
			+ "X\u0001\u0000\u0000\u0000\u0015Z\u0001\u0000\u0000\u0000\u0017\\\u0001"
			+ "\u0000\u0000\u0000\u0019_\u0001\u0000\u0000\u0000\u001ba\u0001\u0000\u0000"
			+ "\u0000\u001dd\u0001\u0000\u0000\u0000\u001fo\u0001\u0000\u0000\u0000!"
			+ "w\u0001\u0000\u0000\u0000#}\u0001\u0000\u0000\u0000%\u0085\u0001\u0000"
			+ "\u0000\u0000\'\u008d\u0001\u0000\u0000\u0000)\u00a1\u0001\u0000\u0000"
			+ "\u0000+\u00b7\u0001\u0000\u0000\u0000-\u00ba\u0001\u0000\u0000\u0000/"
			+ "\u00be\u0001\u0000\u0000\u00001\u00c2\u0001\u0000\u0000\u00003\u00d8\u0001"
			+ "\u0000\u0000\u00005\u00da\u0001\u0000\u0000\u00007\u00dc\u0001\u0000\u0000"
			+ "\u00009\u00df\u0001\u0000\u0000\u0000;<\u0005W\u0000\u0000<=\u0005H\u0000"
			+ "\u0000=>\u0005E\u0000\u0000>?\u0005R\u0000\u0000?F\u0005E\u0000\u0000"
			+ "@A\u0005w\u0000\u0000AB\u0005h\u0000\u0000BC\u0005e\u0000\u0000CD\u0005"
			+ "r\u0000\u0000DF\u0005e\u0000\u0000E;\u0001\u0000\u0000\u0000E@\u0001\u0000"
			+ "\u0000\u0000F\u0002\u0001\u0000\u0000\u0000GH\u0005.\u0000\u0000H\u0004"
			+ "\u0001\u0000\u0000\u0000IJ\u0005,\u0000\u0000J\u0006\u0001\u0000\u0000"
			+ "\u0000KL\u0005[\u0000\u0000L\b\u0001\u0000\u0000\u0000MN\u0005]\u0000"
			+ "\u0000N\n\u0001\u0000\u0000\u0000OP\u0005(\u0000\u0000P\f\u0001\u0000"
			+ "\u0000\u0000QR\u0005)\u0000\u0000R\u000e\u0001\u0000\u0000\u0000ST\u0005"
			+ "=\u0000\u0000TU\u0005=\u0000\u0000U\u0010\u0001\u0000\u0000\u0000VW\u0005"
			+ "-\u0000\u0000W\u0012\u0001\u0000\u0000\u0000XY\u0005+\u0000\u0000Y\u0014"
			+ "\u0001\u0000\u0000\u0000Z[\u0005>\u0000\u0000[\u0016\u0001\u0000\u0000"
			+ "\u0000\\]\u0005>\u0000\u0000]^\u0005=\u0000\u0000^\u0018\u0001\u0000\u0000"
			+ "\u0000_`\u0005<\u0000\u0000`\u001a\u0001\u0000\u0000\u0000ab\u0005<\u0000"
			+ "\u0000bc\u0005=\u0000\u0000c\u001c\u0001\u0000\u0000\u0000de\u0005!\u0000"
			+ "\u0000ef\u0005=\u0000\u0000f\u001e\u0001\u0000\u0000\u0000gh\u0005A\u0000"
			+ "\u0000hi\u0005N\u0000\u0000ip\u0005D\u0000\u0000jk\u0005a\u0000\u0000"
			+ "kl\u0005n\u0000\u0000lp\u0005d\u0000\u0000mn\u0005&\u0000\u0000np\u0005"
			+ "&\u0000\u0000og\u0001\u0000\u0000\u0000oj\u0001\u0000\u0000\u0000om\u0001"
			+ "\u0000\u0000\u0000p \u0001\u0000\u0000\u0000qr\u0005O\u0000\u0000rx\u0005"
			+ "R\u0000\u0000st\u0005o\u0000\u0000tx\u0005r\u0000\u0000uv\u0005|\u0000"
			+ "\u0000vx\u0005|\u0000\u0000wq\u0001\u0000\u0000\u0000ws\u0001\u0000\u0000"
			+ "\u0000wu\u0001\u0000\u0000\u0000x\"\u0001\u0000\u0000\u0000yz\u0005I\u0000"
			+ "\u0000z~\u0005N\u0000\u0000{|\u0005i\u0000\u0000|~\u0005n\u0000\u0000"
			+ "}y\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~$\u0001\u0000\u0000"
			+ "\u0000\u007f\u0080\u0005N\u0000\u0000\u0080\u0081\u0005I\u0000\u0000\u0081"
			+ "\u0086\u0005N\u0000\u0000\u0082\u0083\u0005n\u0000\u0000\u0083\u0084\u0005"
			+ "i\u0000\u0000\u0084\u0086\u0005n\u0000\u0000\u0085\u007f\u0001\u0000\u0000"
			+ "\u0000\u0085\u0082\u0001\u0000\u0000\u0000\u0086&\u0001\u0000\u0000\u0000"
			+ "\u0087\u0088\u0005N\u0000\u0000\u0088\u0089\u0005O\u0000\u0000\u0089\u008e"
			+ "\u0005T\u0000\u0000\u008a\u008b\u0005n\u0000\u0000\u008b\u008c\u0005o"
			+ "\u0000\u0000\u008c\u008e\u0005t\u0000\u0000\u008d\u0087\u0001\u0000\u0000"
			+ "\u0000\u008d\u008a\u0001\u0000\u0000\u0000\u008e(\u0001\u0000\u0000\u0000"
			+ "\u008f\u0090\u0005T\u0000\u0000\u0090\u0091\u0005R\u0000\u0000\u0091\u0092"
			+ "\u0005U\u0000\u0000\u0092\u00a2\u0005E\u0000\u0000\u0093\u0094\u0005t"
			+ "\u0000\u0000\u0094\u0095\u0005r\u0000\u0000\u0095\u0096\u0005u\u0000\u0000"
			+ "\u0096\u00a2\u0005e\u0000\u0000\u0097\u0098\u0005F\u0000\u0000\u0098\u0099"
			+ "\u0005A\u0000\u0000\u0099\u009a\u0005L\u0000\u0000\u009a\u009b\u0005S"
			+ "\u0000\u0000\u009b\u00a2\u0005E\u0000\u0000\u009c\u009d\u0005f\u0000\u0000"
			+ "\u009d\u009e\u0005a\u0000\u0000\u009e\u009f\u0005l\u0000\u0000\u009f\u00a0"
			+ "\u0005s\u0000\u0000\u00a0\u00a2\u0005e\u0000\u0000\u00a1\u008f\u0001\u0000"
			+ "\u0000\u0000\u00a1\u0093\u0001\u0000\u0000\u0000\u00a1\u0097\u0001\u0000"
			+ "\u0000\u0000\u00a1\u009c\u0001\u0000\u0000\u0000\u00a2*\u0001\u0000\u0000"
			+ "\u0000\u00a3\u00a9\u0005\'\u0000\u0000\u00a4\u00a8\b\u0000\u0000\u0000"
			+ "\u00a5\u00a6\u0005\\\u0000\u0000\u00a6\u00a8\t\u0000\u0000\u0000\u00a7"
			+ "\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8"
			+ "\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9"
			+ "\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab"
			+ "\u00a9\u0001\u0000\u0000\u0000\u00ac\u00b8\u0005\'\u0000\u0000\u00ad\u00b3"
			+ "\u0005\"\u0000\u0000\u00ae\u00b2\b\u0001\u0000\u0000\u00af\u00b0\u0005"
			+ "\\\u0000\u0000\u00b0\u00b2\t\u0000\u0000\u0000\u00b1\u00ae\u0001\u0000"
			+ "\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000"
			+ "\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000"
			+ "\u0000\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000"
			+ "\u0000\u0000\u00b6\u00b8\u0005\"\u0000\u0000\u00b7\u00a3\u0001\u0000\u0000"
			+ "\u0000\u00b7\u00ad\u0001\u0000\u0000\u0000\u00b8,\u0001\u0000\u0000\u0000"
			+ "\u00b9\u00bb\u00035\u001a\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb"
			+ "\u00bc\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc"
			+ "\u00bd\u0001\u0000\u0000\u0000\u00bd.\u0001\u0000\u0000\u0000\u00be\u00bf"
			+ "\u00033\u0019\u0000\u00bf0\u0001\u0000\u0000\u0000\u00c0\u00c3\u00037"
			+ "\u001b\u0000\u00c1\u00c3\u00035\u001a\u0000\u00c2\u00c0\u0001\u0000\u0000"
			+ "\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000"
			+ "\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000"
			+ "\u0000\u00c52\u0001\u0000\u0000\u0000\u00c6\u00c8\u00035\u001a\u0000\u00c7"
			+ "\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9"
			+ "\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca"
			+ "\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cf\u0005.\u0000\u0000\u00cc\u00ce"
			+ "\u00035\u001a\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001"
			+ "\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001"
			+ "\u0000\u0000\u0000\u00d0\u00d9\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001"
			+ "\u0000\u0000\u0000\u00d2\u00d4\u0005.\u0000\u0000\u00d3\u00d5\u00035\u001a"
			+ "\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000"
			+ "\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000"
			+ "\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000\u00d8\u00c7\u0001\u0000\u0000"
			+ "\u0000\u00d8\u00d2\u0001\u0000\u0000\u0000\u00d94\u0001\u0000\u0000\u0000"
			+ "\u00da\u00db\u0007\u0002\u0000\u0000\u00db6\u0001\u0000\u0000\u0000\u00dc"
			+ "\u00dd\u0007\u0003\u0000\u0000\u00dd8\u0001\u0000\u0000\u0000\u00de\u00e0"
			+ "\u0007\u0004\u0000\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1"
			+ "\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2"
			+ "\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e4"
			+ "\u0006\u001c\u0000\u0000\u00e4:\u0001\u0000\u0000\u0000\u0015\u0000Eo"
			+ "w}\u0085\u008d\u00a1\u00a7\u00a9\u00b1\u00b3\u00b7\u00bc\u00c2\u00c4\u00c9"
			+ "\u00cf\u00d6\u00d8\u00e1\u0001\u0000\u0001\u0000";

	public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}

}