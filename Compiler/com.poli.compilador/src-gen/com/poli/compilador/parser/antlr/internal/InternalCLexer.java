package com.poli.compilador.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCLexer extends Lexer {
    public static final int RULE_STRING=14;
    public static final int RULE_SL_COMMENT=16;
    public static final int T__19=19;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int RULE_TRUE=12;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_TYPELIT=10;
    public static final int RULE_ID=4;
    public static final int RULE_WS=17;
    public static final int RULE_UO=9;
    public static final int RULE_ANY_OTHER=18;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int RULE_RO=6;
    public static final int RULE_AO1=7;
    public static final int T__25=25;
    public static final int RULE_AO2=8;
    public static final int RULE_FALSE=13;
    public static final int T__40=40;
    public static final int RULE_LO=5;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalCLexer() {;} 
    public InternalCLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalC.g"; }

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:11:7: ( '(' )
            // InternalC.g:11:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:12:7: ( ')' )
            // InternalC.g:12:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:13:7: ( '{' )
            // InternalC.g:13:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:14:7: ( '}' )
            // InternalC.g:14:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:15:7: ( ',' )
            // InternalC.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:16:7: ( ';' )
            // InternalC.g:16:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:17:7: ( 'struct' )
            // InternalC.g:17:9: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:18:7: ( 'if' )
            // InternalC.g:18:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:19:7: ( 'else' )
            // InternalC.g:19:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:20:7: ( 'while' )
            // InternalC.g:20:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:21:7: ( 'for' )
            // InternalC.g:21:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:22:7: ( 'switch' )
            // InternalC.g:22:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:23:7: ( 'default' )
            // InternalC.g:23:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:24:7: ( ':' )
            // InternalC.g:24:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:25:7: ( 'do' )
            // InternalC.g:25:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:26:7: ( 'break' )
            // InternalC.g:26:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:27:7: ( 'continue' )
            // InternalC.g:27:9: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:28:7: ( 'return' )
            // InternalC.g:28:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:29:7: ( '=' )
            // InternalC.g:29:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:30:7: ( '**' )
            // InternalC.g:30:9: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:31:7: ( '[' )
            // InternalC.g:31:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:32:7: ( ']' )
            // InternalC.g:32:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:33:7: ( '.' )
            // InternalC.g:33:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:34:7: ( 'case' )
            // InternalC.g:34:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "RULE_TYPELIT"
    public final void mRULE_TYPELIT() throws RecognitionException {
        try {
            int _type = RULE_TYPELIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:2215:14: ( ( 'int' | 'float' | 'double' | 'bool' | 'char' | 'void' ) )
            // InternalC.g:2215:16: ( 'int' | 'float' | 'double' | 'bool' | 'char' | 'void' )
            {
            // InternalC.g:2215:16: ( 'int' | 'float' | 'double' | 'bool' | 'char' | 'void' )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 'i':
                {
                alt1=1;
                }
                break;
            case 'f':
                {
                alt1=2;
                }
                break;
            case 'd':
                {
                alt1=3;
                }
                break;
            case 'b':
                {
                alt1=4;
                }
                break;
            case 'c':
                {
                alt1=5;
                }
                break;
            case 'v':
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalC.g:2215:17: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 2 :
                    // InternalC.g:2215:23: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 3 :
                    // InternalC.g:2215:31: 'double'
                    {
                    match("double"); 


                    }
                    break;
                case 4 :
                    // InternalC.g:2215:40: 'bool'
                    {
                    match("bool"); 


                    }
                    break;
                case 5 :
                    // InternalC.g:2215:47: 'char'
                    {
                    match("char"); 


                    }
                    break;
                case 6 :
                    // InternalC.g:2215:54: 'void'
                    {
                    match("void"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TYPELIT"

    // $ANTLR start "RULE_TRUE"
    public final void mRULE_TRUE() throws RecognitionException {
        try {
            int _type = RULE_TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:2217:11: ( 'true' )
            // InternalC.g:2217:13: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TRUE"

    // $ANTLR start "RULE_FALSE"
    public final void mRULE_FALSE() throws RecognitionException {
        try {
            int _type = RULE_FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:2219:12: ( 'false' )
            // InternalC.g:2219:14: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FALSE"

    // $ANTLR start "RULE_AO1"
    public final void mRULE_AO1() throws RecognitionException {
        try {
            int _type = RULE_AO1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:2221:10: ( ( '+' | '-' ) )
            // InternalC.g:2221:12: ( '+' | '-' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AO1"

    // $ANTLR start "RULE_AO2"
    public final void mRULE_AO2() throws RecognitionException {
        try {
            int _type = RULE_AO2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:2223:10: ( ( '*' | '/' ) )
            // InternalC.g:2223:12: ( '*' | '/' )
            {
            if ( input.LA(1)=='*'||input.LA(1)=='/' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AO2"

    // $ANTLR start "RULE_RO"
    public final void mRULE_RO() throws RecognitionException {
        try {
            int _type = RULE_RO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:2225:9: ( ( '>' | '>=' | '<' | '<=' | '==' | '!=' ) )
            // InternalC.g:2225:11: ( '>' | '>=' | '<' | '<=' | '==' | '!=' )
            {
            // InternalC.g:2225:11: ( '>' | '>=' | '<' | '<=' | '==' | '!=' )
            int alt2=6;
            switch ( input.LA(1) ) {
            case '>':
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='=') ) {
                    alt2=2;
                }
                else {
                    alt2=1;}
                }
                break;
            case '<':
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2=='=') ) {
                    alt2=4;
                }
                else {
                    alt2=3;}
                }
                break;
            case '=':
                {
                alt2=5;
                }
                break;
            case '!':
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalC.g:2225:12: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 2 :
                    // InternalC.g:2225:16: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 3 :
                    // InternalC.g:2225:21: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // InternalC.g:2225:25: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // InternalC.g:2225:30: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 6 :
                    // InternalC.g:2225:35: '!='
                    {
                    match("!="); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RO"

    // $ANTLR start "RULE_LO"
    public final void mRULE_LO() throws RecognitionException {
        try {
            int _type = RULE_LO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:2227:9: ( ( '&&' | '||' ) )
            // InternalC.g:2227:11: ( '&&' | '||' )
            {
            // InternalC.g:2227:11: ( '&&' | '||' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='&') ) {
                alt3=1;
            }
            else if ( (LA3_0=='|') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalC.g:2227:12: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 2 :
                    // InternalC.g:2227:17: '||'
                    {
                    match("||"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LO"

    // $ANTLR start "RULE_UO"
    public final void mRULE_UO() throws RecognitionException {
        try {
            int _type = RULE_UO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:2229:9: ( ( '~' | '++' | '--' | '&' ) )
            // InternalC.g:2229:11: ( '~' | '++' | '--' | '&' )
            {
            // InternalC.g:2229:11: ( '~' | '++' | '--' | '&' )
            int alt4=4;
            switch ( input.LA(1) ) {
            case '~':
                {
                alt4=1;
                }
                break;
            case '+':
                {
                alt4=2;
                }
                break;
            case '-':
                {
                alt4=3;
                }
                break;
            case '&':
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalC.g:2229:12: '~'
                    {
                    match('~'); 

                    }
                    break;
                case 2 :
                    // InternalC.g:2229:16: '++'
                    {
                    match("++"); 


                    }
                    break;
                case 3 :
                    // InternalC.g:2229:21: '--'
                    {
                    match("--"); 


                    }
                    break;
                case 4 :
                    // InternalC.g:2229:26: '&'
                    {
                    match('&'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UO"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:2231:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalC.g:2231:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalC.g:2231:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalC.g:2231:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalC.g:2231:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalC.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:2233:10: ( ( '0' .. '9' )+ )
            // InternalC.g:2233:12: ( '0' .. '9' )+
            {
            // InternalC.g:2233:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalC.g:2233:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:2235:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalC.g:2235:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalC.g:2235:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalC.g:2235:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalC.g:2235:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalC.g:2235:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalC.g:2235:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalC.g:2235:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalC.g:2235:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalC.g:2235:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalC.g:2235:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:2237:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalC.g:2237:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalC.g:2237:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalC.g:2237:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:2239:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalC.g:2239:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalC.g:2239:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalC.g:2239:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalC.g:2239:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalC.g:2239:41: ( '\\r' )? '\\n'
                    {
                    // InternalC.g:2239:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalC.g:2239:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:2241:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalC.g:2241:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalC.g:2241:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalC.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:2243:16: ( . )
            // InternalC.g:2243:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalC.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | RULE_TYPELIT | RULE_TRUE | RULE_FALSE | RULE_AO1 | RULE_AO2 | RULE_RO | RULE_LO | RULE_UO | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=39;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalC.g:1:10: T__19
                {
                mT__19(); 

                }
                break;
            case 2 :
                // InternalC.g:1:16: T__20
                {
                mT__20(); 

                }
                break;
            case 3 :
                // InternalC.g:1:22: T__21
                {
                mT__21(); 

                }
                break;
            case 4 :
                // InternalC.g:1:28: T__22
                {
                mT__22(); 

                }
                break;
            case 5 :
                // InternalC.g:1:34: T__23
                {
                mT__23(); 

                }
                break;
            case 6 :
                // InternalC.g:1:40: T__24
                {
                mT__24(); 

                }
                break;
            case 7 :
                // InternalC.g:1:46: T__25
                {
                mT__25(); 

                }
                break;
            case 8 :
                // InternalC.g:1:52: T__26
                {
                mT__26(); 

                }
                break;
            case 9 :
                // InternalC.g:1:58: T__27
                {
                mT__27(); 

                }
                break;
            case 10 :
                // InternalC.g:1:64: T__28
                {
                mT__28(); 

                }
                break;
            case 11 :
                // InternalC.g:1:70: T__29
                {
                mT__29(); 

                }
                break;
            case 12 :
                // InternalC.g:1:76: T__30
                {
                mT__30(); 

                }
                break;
            case 13 :
                // InternalC.g:1:82: T__31
                {
                mT__31(); 

                }
                break;
            case 14 :
                // InternalC.g:1:88: T__32
                {
                mT__32(); 

                }
                break;
            case 15 :
                // InternalC.g:1:94: T__33
                {
                mT__33(); 

                }
                break;
            case 16 :
                // InternalC.g:1:100: T__34
                {
                mT__34(); 

                }
                break;
            case 17 :
                // InternalC.g:1:106: T__35
                {
                mT__35(); 

                }
                break;
            case 18 :
                // InternalC.g:1:112: T__36
                {
                mT__36(); 

                }
                break;
            case 19 :
                // InternalC.g:1:118: T__37
                {
                mT__37(); 

                }
                break;
            case 20 :
                // InternalC.g:1:124: T__38
                {
                mT__38(); 

                }
                break;
            case 21 :
                // InternalC.g:1:130: T__39
                {
                mT__39(); 

                }
                break;
            case 22 :
                // InternalC.g:1:136: T__40
                {
                mT__40(); 

                }
                break;
            case 23 :
                // InternalC.g:1:142: T__41
                {
                mT__41(); 

                }
                break;
            case 24 :
                // InternalC.g:1:148: T__42
                {
                mT__42(); 

                }
                break;
            case 25 :
                // InternalC.g:1:154: RULE_TYPELIT
                {
                mRULE_TYPELIT(); 

                }
                break;
            case 26 :
                // InternalC.g:1:167: RULE_TRUE
                {
                mRULE_TRUE(); 

                }
                break;
            case 27 :
                // InternalC.g:1:177: RULE_FALSE
                {
                mRULE_FALSE(); 

                }
                break;
            case 28 :
                // InternalC.g:1:188: RULE_AO1
                {
                mRULE_AO1(); 

                }
                break;
            case 29 :
                // InternalC.g:1:197: RULE_AO2
                {
                mRULE_AO2(); 

                }
                break;
            case 30 :
                // InternalC.g:1:206: RULE_RO
                {
                mRULE_RO(); 

                }
                break;
            case 31 :
                // InternalC.g:1:214: RULE_LO
                {
                mRULE_LO(); 

                }
                break;
            case 32 :
                // InternalC.g:1:222: RULE_UO
                {
                mRULE_UO(); 

                }
                break;
            case 33 :
                // InternalC.g:1:230: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 34 :
                // InternalC.g:1:238: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 35 :
                // InternalC.g:1:247: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 36 :
                // InternalC.g:1:259: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 37 :
                // InternalC.g:1:275: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 38 :
                // InternalC.g:1:291: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 39 :
                // InternalC.g:1:299: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\7\uffff\6\60\1\uffff\3\60\1\102\1\104\3\uffff\2\60\1\113\1\104\2\uffff\1\47\1\112\1\47\1\uffff\1\113\1\47\2\uffff\2\47\10\uffff\2\60\1\uffff\1\124\7\60\1\135\1\uffff\6\60\7\uffff\2\60\10\uffff\2\60\1\uffff\1\150\2\60\1\153\4\60\1\uffff\12\60\1\uffff\1\172\1\60\1\uffff\5\60\1\150\1\60\1\u0082\1\150\1\60\1\150\1\u0084\2\60\1\uffff\1\u0087\1\150\1\u0088\2\60\1\u008b\1\60\1\uffff\1\60\1\uffff\1\u008e\1\u008f\2\uffff\1\60\1\150\1\uffff\1\60\1\u0092\2\uffff\1\u0093\1\60\2\uffff\1\u0095\1\uffff";
    static final String DFA16_eofS =
        "\u0096\uffff";
    static final String DFA16_minS =
        "\1\0\6\uffff\1\164\1\146\1\154\1\150\1\141\1\145\1\uffff\1\157\1\141\1\145\1\75\1\52\3\uffff\1\157\1\162\1\53\1\52\2\uffff\1\75\1\46\1\174\1\uffff\1\55\1\101\2\uffff\2\0\10\uffff\1\162\1\151\1\uffff\1\60\1\164\1\163\1\151\1\162\1\157\1\154\1\146\1\60\1\uffff\1\145\1\157\1\156\1\163\1\141\1\164\7\uffff\1\151\1\165\10\uffff\1\165\1\164\1\uffff\1\60\1\145\1\154\1\60\1\141\1\163\1\141\1\142\1\uffff\1\141\1\154\1\164\1\145\1\162\1\165\1\144\1\145\2\143\1\uffff\1\60\1\145\1\uffff\1\164\1\145\1\165\1\154\1\153\1\60\1\151\2\60\1\162\2\60\1\164\1\150\1\uffff\3\60\1\154\1\145\1\60\1\156\1\uffff\1\156\1\uffff\2\60\2\uffff\1\164\1\60\1\uffff\1\165\1\60\2\uffff\1\60\1\145\2\uffff\1\60\1\uffff";
    static final String DFA16_maxS =
        "\1\uffff\6\uffff\1\167\1\156\1\154\1\150\2\157\1\uffff\1\162\1\157\1\145\1\75\1\52\3\uffff\1\157\1\162\1\53\1\57\2\uffff\1\75\1\46\1\174\1\uffff\1\55\1\172\2\uffff\2\uffff\10\uffff\1\162\1\151\1\uffff\1\172\1\164\1\163\1\151\1\162\1\157\1\154\1\146\1\172\1\uffff\1\145\1\157\1\156\1\163\1\141\1\164\7\uffff\1\151\1\165\10\uffff\1\165\1\164\1\uffff\1\172\1\145\1\154\1\172\1\141\1\163\1\141\1\142\1\uffff\1\141\1\154\1\164\1\145\1\162\1\165\1\144\1\145\2\143\1\uffff\1\172\1\145\1\uffff\1\164\1\145\1\165\1\154\1\153\1\172\1\151\2\172\1\162\2\172\1\164\1\150\1\uffff\3\172\1\154\1\145\1\172\1\156\1\uffff\1\156\1\uffff\2\172\2\uffff\1\164\1\172\1\uffff\1\165\1\172\2\uffff\1\172\1\145\2\uffff\1\172\1\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\6\uffff\1\16\5\uffff\1\25\1\26\1\27\4\uffff\2\36\3\uffff\1\40\2\uffff\1\41\1\42\2\uffff\1\46\1\47\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff\1\41\11\uffff\1\16\6\uffff\1\36\1\23\1\24\1\35\1\25\1\26\1\27\2\uffff\1\40\1\34\1\44\1\45\1\37\1\42\1\43\1\46\2\uffff\1\10\10\uffff\1\17\12\uffff\1\31\2\uffff\1\13\16\uffff\1\11\7\uffff\1\30\1\uffff\1\32\2\uffff\1\12\1\33\2\uffff\1\20\2\uffff\1\7\1\14\2\uffff\1\22\1\15\1\uffff\1\21";
    static final String DFA16_specialS =
        "\1\0\43\uffff\1\2\1\1\160\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\47\2\46\2\47\1\46\22\47\1\46\1\34\1\44\3\47\1\35\1\45\1\1\1\2\1\22\1\30\1\5\1\40\1\25\1\31\12\43\1\15\1\6\1\33\1\21\1\32\2\47\32\42\1\23\1\47\1\24\1\41\1\42\1\47\1\42\1\16\1\17\1\14\1\11\1\13\2\42\1\10\10\42\1\20\1\7\1\27\1\42\1\26\1\12\3\42\1\3\1\36\1\4\1\37\uff81\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\56\2\uffff\1\57",
            "\1\61\7\uffff\1\62",
            "\1\63",
            "\1\64",
            "\1\67\12\uffff\1\66\2\uffff\1\65",
            "\1\70\11\uffff\1\71",
            "",
            "\1\74\2\uffff\1\73",
            "\1\76\6\uffff\1\77\6\uffff\1\75",
            "\1\100",
            "\1\101",
            "\1\103",
            "",
            "",
            "",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\114\4\uffff\1\115",
            "",
            "",
            "\1\101",
            "\1\116",
            "\1\116",
            "",
            "\1\112",
            "\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\0\120",
            "\0\120",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\122",
            "\1\123",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\24\60\1\134\5\60",
            "",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\144",
            "\1\145",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\146",
            "\1\147",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\151",
            "\1\152",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\173",
            "",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0081",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0083",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0085",
            "\1\u0086",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0089",
            "\1\u008a",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u008c",
            "",
            "\1\u008d",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\u0090",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0091",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0094",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | RULE_TYPELIT | RULE_TRUE | RULE_FALSE | RULE_AO1 | RULE_AO2 | RULE_RO | RULE_LO | RULE_UO | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='(') ) {s = 1;}

                        else if ( (LA16_0==')') ) {s = 2;}

                        else if ( (LA16_0=='{') ) {s = 3;}

                        else if ( (LA16_0=='}') ) {s = 4;}

                        else if ( (LA16_0==',') ) {s = 5;}

                        else if ( (LA16_0==';') ) {s = 6;}

                        else if ( (LA16_0=='s') ) {s = 7;}

                        else if ( (LA16_0=='i') ) {s = 8;}

                        else if ( (LA16_0=='e') ) {s = 9;}

                        else if ( (LA16_0=='w') ) {s = 10;}

                        else if ( (LA16_0=='f') ) {s = 11;}

                        else if ( (LA16_0=='d') ) {s = 12;}

                        else if ( (LA16_0==':') ) {s = 13;}

                        else if ( (LA16_0=='b') ) {s = 14;}

                        else if ( (LA16_0=='c') ) {s = 15;}

                        else if ( (LA16_0=='r') ) {s = 16;}

                        else if ( (LA16_0=='=') ) {s = 17;}

                        else if ( (LA16_0=='*') ) {s = 18;}

                        else if ( (LA16_0=='[') ) {s = 19;}

                        else if ( (LA16_0==']') ) {s = 20;}

                        else if ( (LA16_0=='.') ) {s = 21;}

                        else if ( (LA16_0=='v') ) {s = 22;}

                        else if ( (LA16_0=='t') ) {s = 23;}

                        else if ( (LA16_0=='+') ) {s = 24;}

                        else if ( (LA16_0=='/') ) {s = 25;}

                        else if ( (LA16_0=='>') ) {s = 26;}

                        else if ( (LA16_0=='<') ) {s = 27;}

                        else if ( (LA16_0=='!') ) {s = 28;}

                        else if ( (LA16_0=='&') ) {s = 29;}

                        else if ( (LA16_0=='|') ) {s = 30;}

                        else if ( (LA16_0=='~') ) {s = 31;}

                        else if ( (LA16_0=='-') ) {s = 32;}

                        else if ( (LA16_0=='^') ) {s = 33;}

                        else if ( ((LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||LA16_0=='a'||(LA16_0>='g' && LA16_0<='h')||(LA16_0>='j' && LA16_0<='q')||LA16_0=='u'||(LA16_0>='x' && LA16_0<='z')) ) {s = 34;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 35;}

                        else if ( (LA16_0=='\"') ) {s = 36;}

                        else if ( (LA16_0=='\'') ) {s = 37;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 38;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||(LA16_0>='#' && LA16_0<='%')||(LA16_0>='?' && LA16_0<='@')||LA16_0=='\\'||LA16_0=='`'||(LA16_0>='\u007F' && LA16_0<='\uFFFF')) ) {s = 39;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_37 = input.LA(1);

                        s = -1;
                        if ( ((LA16_37>='\u0000' && LA16_37<='\uFFFF')) ) {s = 80;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_36 = input.LA(1);

                        s = -1;
                        if ( ((LA16_36>='\u0000' && LA16_36<='\uFFFF')) ) {s = 80;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}