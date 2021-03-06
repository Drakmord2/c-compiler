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
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_TYPELIT=10;
    public static final int RULE_ID=4;
    public static final int RULE_UO=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int RULE_AO1=7;
    public static final int T__25=25;
    public static final int RULE_AO2=8;
    public static final int RULE_LO=5;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=12;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__44=44;
    public static final int RULE_RO=6;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:11:7: ( 'function' )
            // InternalC.g:11:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:12:7: ( '(' )
            // InternalC.g:12:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:13:7: ( ')' )
            // InternalC.g:13:9: ')'
            {
            match(')'); 

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
            // InternalC.g:14:7: ( '{' )
            // InternalC.g:14:9: '{'
            {
            match('{'); 

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
            // InternalC.g:15:7: ( '}' )
            // InternalC.g:15:9: '}'
            {
            match('}'); 

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
            // InternalC.g:16:7: ( '**' )
            // InternalC.g:16:9: '**'
            {
            match("**"); 


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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:18:7: ( ';' )
            // InternalC.g:18:9: ';'
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
            // InternalC.g:19:7: ( 'if' )
            // InternalC.g:19:9: 'if'
            {
            match("if"); 


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
            // InternalC.g:20:7: ( 'else' )
            // InternalC.g:20:9: 'else'
            {
            match("else"); 


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
            // InternalC.g:21:7: ( 'while' )
            // InternalC.g:21:9: 'while'
            {
            match("while"); 


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
            // InternalC.g:22:7: ( 'for' )
            // InternalC.g:22:9: 'for'
            {
            match("for"); 


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
            // InternalC.g:23:7: ( 'switch' )
            // InternalC.g:23:9: 'switch'
            {
            match("switch"); 


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
            // InternalC.g:24:7: ( 'default' )
            // InternalC.g:24:9: 'default'
            {
            match("default"); 


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
            // InternalC.g:25:7: ( ':' )
            // InternalC.g:25:9: ':'
            {
            match(':'); 

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
            // InternalC.g:26:7: ( 'do' )
            // InternalC.g:26:9: 'do'
            {
            match("do"); 


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
            // InternalC.g:27:7: ( 'break' )
            // InternalC.g:27:9: 'break'
            {
            match("break"); 


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
            // InternalC.g:28:7: ( 'continue' )
            // InternalC.g:28:9: 'continue'
            {
            match("continue"); 


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
            // InternalC.g:29:7: ( 'return' )
            // InternalC.g:29:9: 'return'
            {
            match("return"); 


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
            // InternalC.g:30:7: ( 'print' )
            // InternalC.g:30:9: 'print'
            {
            match("print"); 


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
            // InternalC.g:31:7: ( ',' )
            // InternalC.g:31:9: ','
            {
            match(','); 

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
            // InternalC.g:32:7: ( '=' )
            // InternalC.g:32:9: '='
            {
            match('='); 

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
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:34:7: ( '[' )
            // InternalC.g:34:9: '['
            {
            match('['); 

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
            // InternalC.g:35:7: ( ']' )
            // InternalC.g:35:9: ']'
            {
            match(']'); 

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
            // InternalC.g:36:7: ( 'case' )
            // InternalC.g:36:9: 'case'
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

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:37:7: ( 'true' )
            // InternalC.g:37:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:38:7: ( 'false' )
            // InternalC.g:38:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "RULE_TYPELIT"
    public final void mRULE_TYPELIT() throws RecognitionException {
        try {
            int _type = RULE_TYPELIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:2247:14: ( ( 'int' | 'bool' | 'string' | 'void' ) )
            // InternalC.g:2247:16: ( 'int' | 'bool' | 'string' | 'void' )
            {
            // InternalC.g:2247:16: ( 'int' | 'bool' | 'string' | 'void' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 'i':
                {
                alt1=1;
                }
                break;
            case 'b':
                {
                alt1=2;
                }
                break;
            case 's':
                {
                alt1=3;
                }
                break;
            case 'v':
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalC.g:2247:17: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 2 :
                    // InternalC.g:2247:23: 'bool'
                    {
                    match("bool"); 


                    }
                    break;
                case 3 :
                    // InternalC.g:2247:30: 'string'
                    {
                    match("string"); 


                    }
                    break;
                case 4 :
                    // InternalC.g:2247:39: 'void'
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

    // $ANTLR start "RULE_AO1"
    public final void mRULE_AO1() throws RecognitionException {
        try {
            int _type = RULE_AO1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:2249:10: ( ( '+' | '-' ) )
            // InternalC.g:2249:12: ( '+' | '-' )
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
            // InternalC.g:2251:10: ( ( '*' | '/' ) )
            // InternalC.g:2251:12: ( '*' | '/' )
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
            // InternalC.g:2253:9: ( ( '>' | '>=' | '<' | '<=' | '==' | '!=' ) )
            // InternalC.g:2253:11: ( '>' | '>=' | '<' | '<=' | '==' | '!=' )
            {
            // InternalC.g:2253:11: ( '>' | '>=' | '<' | '<=' | '==' | '!=' )
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
                    // InternalC.g:2253:12: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 2 :
                    // InternalC.g:2253:16: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 3 :
                    // InternalC.g:2253:21: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // InternalC.g:2253:25: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // InternalC.g:2253:30: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 6 :
                    // InternalC.g:2253:35: '!='
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
            // InternalC.g:2255:9: ( ( '&&' | '||' ) )
            // InternalC.g:2255:11: ( '&&' | '||' )
            {
            // InternalC.g:2255:11: ( '&&' | '||' )
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
                    // InternalC.g:2255:12: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 2 :
                    // InternalC.g:2255:17: '||'
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
            // InternalC.g:2257:9: ( ( '!' | '++' | '--' | '&' ) )
            // InternalC.g:2257:11: ( '!' | '++' | '--' | '&' )
            {
            // InternalC.g:2257:11: ( '!' | '++' | '--' | '&' )
            int alt4=4;
            switch ( input.LA(1) ) {
            case '!':
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
                    // InternalC.g:2257:12: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 2 :
                    // InternalC.g:2257:16: '++'
                    {
                    match("++"); 


                    }
                    break;
                case 3 :
                    // InternalC.g:2257:21: '--'
                    {
                    match("--"); 


                    }
                    break;
                case 4 :
                    // InternalC.g:2257:26: '&'
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
            // InternalC.g:2259:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalC.g:2259:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalC.g:2259:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalC.g:2259:11: '^'
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

            // InternalC.g:2259:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalC.g:2261:10: ( ( '0' .. '9' )+ )
            // InternalC.g:2261:12: ( '0' .. '9' )+
            {
            // InternalC.g:2261:12: ( '0' .. '9' )+
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
            	    // InternalC.g:2261:13: '0' .. '9'
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
            // InternalC.g:2263:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalC.g:2263:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalC.g:2263:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalC.g:2263:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalC.g:2263:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalC.g:2263:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalC.g:2263:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalC.g:2263:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalC.g:2263:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalC.g:2263:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalC.g:2263:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalC.g:2265:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalC.g:2265:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalC.g:2265:24: ( options {greedy=false; } : . )*
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
            	    // InternalC.g:2265:52: .
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
            // InternalC.g:2267:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalC.g:2267:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalC.g:2267:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalC.g:2267:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalC.g:2267:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalC.g:2267:41: ( '\\r' )? '\\n'
                    {
                    // InternalC.g:2267:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalC.g:2267:41: '\\r'
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
            // InternalC.g:2269:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalC.g:2269:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalC.g:2269:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalC.g:2271:16: ( . )
            // InternalC.g:2271:18: .
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
        // InternalC.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RULE_TYPELIT | RULE_AO1 | RULE_AO2 | RULE_RO | RULE_LO | RULE_UO | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=41;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalC.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalC.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalC.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalC.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalC.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalC.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // InternalC.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // InternalC.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // InternalC.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // InternalC.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // InternalC.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // InternalC.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // InternalC.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // InternalC.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // InternalC.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // InternalC.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // InternalC.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // InternalC.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // InternalC.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // InternalC.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // InternalC.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // InternalC.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // InternalC.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // InternalC.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // InternalC.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // InternalC.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // InternalC.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // InternalC.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // InternalC.g:1:178: RULE_TYPELIT
                {
                mRULE_TYPELIT(); 

                }
                break;
            case 30 :
                // InternalC.g:1:191: RULE_AO1
                {
                mRULE_AO1(); 

                }
                break;
            case 31 :
                // InternalC.g:1:200: RULE_AO2
                {
                mRULE_AO2(); 

                }
                break;
            case 32 :
                // InternalC.g:1:209: RULE_RO
                {
                mRULE_RO(); 

                }
                break;
            case 33 :
                // InternalC.g:1:217: RULE_LO
                {
                mRULE_LO(); 

                }
                break;
            case 34 :
                // InternalC.g:1:225: RULE_UO
                {
                mRULE_UO(); 

                }
                break;
            case 35 :
                // InternalC.g:1:233: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 36 :
                // InternalC.g:1:241: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 37 :
                // InternalC.g:1:250: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 38 :
                // InternalC.g:1:262: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 39 :
                // InternalC.g:1:278: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 40 :
                // InternalC.g:1:294: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 41 :
                // InternalC.g:1:302: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\1\53\4\uffff\1\61\1\53\1\uffff\4\53\1\uffff\4\53\1\uffff\1\104\3\uffff\2\53\1\113\1\61\2\uffff\2\112\1\47\1\113\1\47\2\uffff\2\47\2\uffff\3\53\7\uffff\2\53\1\uffff\1\127\4\53\1\134\1\uffff\6\53\6\uffff\2\53\10\uffff\1\53\1\146\3\53\1\uffff\1\153\3\53\1\uffff\11\53\1\uffff\4\53\1\uffff\1\174\3\53\1\153\1\53\1\u0081\2\53\1\u0084\1\153\1\53\1\u0086\3\53\1\uffff\1\u008a\1\53\1\u008c\1\53\1\uffff\1\53\1\u008f\1\uffff\1\53\1\uffff\1\u0091\1\153\1\u0092\1\uffff\1\53\1\uffff\1\53\1\u0095\1\uffff\1\53\2\uffff\1\u0097\1\53\1\uffff\1\u0099\1\uffff\1\u009a\2\uffff";
    static final String DFA16_eofS =
        "\u009b\uffff";
    static final String DFA16_minS =
        "\1\0\1\141\4\uffff\1\52\1\164\1\uffff\1\146\1\154\1\150\1\145\1\uffff\1\157\1\141\1\145\1\162\1\uffff\1\75\3\uffff\1\162\1\157\1\53\1\52\2\uffff\1\75\1\46\1\174\1\55\1\101\2\uffff\2\0\2\uffff\1\156\1\162\1\154\7\uffff\1\162\1\151\1\uffff\1\60\1\164\1\163\1\151\1\146\1\60\1\uffff\1\145\1\157\1\156\1\163\1\164\1\151\6\uffff\1\165\1\151\10\uffff\1\143\1\60\1\163\1\151\1\164\1\uffff\1\60\1\145\1\154\1\141\1\uffff\1\141\1\154\1\164\1\145\1\165\1\156\1\145\1\144\1\164\1\uffff\1\145\1\143\1\156\1\143\1\uffff\1\60\1\145\1\165\1\153\1\60\1\151\1\60\1\162\1\164\2\60\1\151\1\60\1\164\1\147\1\150\1\uffff\1\60\1\154\1\60\1\156\1\uffff\1\156\1\60\1\uffff\1\157\1\uffff\3\60\1\uffff\1\164\1\uffff\1\165\1\60\1\uffff\1\156\2\uffff\1\60\1\145\1\uffff\1\60\1\uffff\1\60\2\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\165\4\uffff\1\52\1\167\1\uffff\1\156\1\154\1\150\1\157\1\uffff\1\162\1\157\1\145\1\162\1\uffff\1\75\3\uffff\1\162\1\157\1\53\1\57\2\uffff\1\75\1\46\1\174\1\55\1\172\2\uffff\2\uffff\2\uffff\1\156\1\162\1\154\7\uffff\1\162\1\151\1\uffff\1\172\1\164\1\163\1\151\1\146\1\172\1\uffff\1\145\1\157\1\156\1\163\1\164\1\151\6\uffff\1\165\1\151\10\uffff\1\143\1\172\1\163\1\165\1\164\1\uffff\1\172\1\145\1\154\1\141\1\uffff\1\141\1\154\1\164\1\145\1\165\1\156\1\145\1\144\1\164\1\uffff\1\145\1\143\1\156\1\143\1\uffff\1\172\1\145\1\165\1\153\1\172\1\151\1\172\1\162\1\164\2\172\1\151\1\172\1\164\1\147\1\150\1\uffff\1\172\1\154\1\172\1\156\1\uffff\1\156\1\172\1\uffff\1\157\1\uffff\3\172\1\uffff\1\164\1\uffff\1\165\1\172\1\uffff\1\156\2\uffff\1\172\1\145\1\uffff\1\172\1\uffff\1\172\2\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\2\uffff\1\10\4\uffff\1\17\4\uffff\1\25\1\uffff\1\27\1\30\1\31\4\uffff\2\40\5\uffff\1\43\1\44\2\uffff\1\50\1\51\3\uffff\1\43\1\2\1\3\1\4\1\5\1\6\1\37\2\uffff\1\10\6\uffff\1\17\6\uffff\1\25\1\40\1\26\1\27\1\30\1\31\2\uffff\1\42\1\36\1\46\1\47\1\41\1\44\1\45\1\50\5\uffff\1\11\4\uffff\1\20\11\uffff\1\14\4\uffff\1\35\20\uffff\1\12\4\uffff\1\32\2\uffff\1\33\1\uffff\1\34\3\uffff\1\13\1\uffff\1\21\2\uffff\1\24\1\uffff\1\7\1\15\2\uffff\1\23\1\uffff\1\16\1\uffff\1\1\1\22";
    static final String DFA16_specialS =
        "\1\1\43\uffff\1\0\1\2\165\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\47\2\46\2\47\1\46\22\47\1\46\1\35\1\44\3\47\1\36\1\45\1\2\1\3\1\6\1\31\1\22\1\40\1\24\1\32\12\43\1\15\1\10\1\34\1\23\1\33\2\47\32\42\1\25\1\47\1\26\1\41\1\42\1\47\1\42\1\16\1\17\1\14\1\12\1\1\2\42\1\11\6\42\1\21\1\42\1\20\1\7\1\27\1\42\1\30\1\13\3\42\1\4\1\37\1\5\uff82\47",
            "\1\52\15\uffff\1\51\5\uffff\1\50",
            "",
            "",
            "",
            "",
            "\1\60",
            "\1\62\2\uffff\1\63",
            "",
            "\1\65\7\uffff\1\66",
            "\1\67",
            "\1\70",
            "\1\71\11\uffff\1\72",
            "",
            "\1\75\2\uffff\1\74",
            "\1\77\15\uffff\1\76",
            "\1\100",
            "\1\101",
            "",
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
            "\1\103",
            "\1\116",
            "\1\116",
            "\1\112",
            "\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\0\120",
            "\0\120",
            "",
            "",
            "\1\122",
            "\1\123",
            "\1\124",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\125",
            "\1\126",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\143",
            "\1\144",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\145",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\147",
            "\1\151\13\uffff\1\150",
            "\1\152",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\175",
            "\1\176",
            "\1\177",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0080",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0082",
            "\1\u0083",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0085",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u008b",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u008d",
            "",
            "\1\u008e",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u0090",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u0093",
            "",
            "\1\u0094",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u0096",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0098",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
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
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RULE_TYPELIT | RULE_AO1 | RULE_AO2 | RULE_RO | RULE_LO | RULE_UO | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_36 = input.LA(1);

                        s = -1;
                        if ( ((LA16_36>='\u0000' && LA16_36<='\uFFFF')) ) {s = 80;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='f') ) {s = 1;}

                        else if ( (LA16_0=='(') ) {s = 2;}

                        else if ( (LA16_0==')') ) {s = 3;}

                        else if ( (LA16_0=='{') ) {s = 4;}

                        else if ( (LA16_0=='}') ) {s = 5;}

                        else if ( (LA16_0=='*') ) {s = 6;}

                        else if ( (LA16_0=='s') ) {s = 7;}

                        else if ( (LA16_0==';') ) {s = 8;}

                        else if ( (LA16_0=='i') ) {s = 9;}

                        else if ( (LA16_0=='e') ) {s = 10;}

                        else if ( (LA16_0=='w') ) {s = 11;}

                        else if ( (LA16_0=='d') ) {s = 12;}

                        else if ( (LA16_0==':') ) {s = 13;}

                        else if ( (LA16_0=='b') ) {s = 14;}

                        else if ( (LA16_0=='c') ) {s = 15;}

                        else if ( (LA16_0=='r') ) {s = 16;}

                        else if ( (LA16_0=='p') ) {s = 17;}

                        else if ( (LA16_0==',') ) {s = 18;}

                        else if ( (LA16_0=='=') ) {s = 19;}

                        else if ( (LA16_0=='.') ) {s = 20;}

                        else if ( (LA16_0=='[') ) {s = 21;}

                        else if ( (LA16_0==']') ) {s = 22;}

                        else if ( (LA16_0=='t') ) {s = 23;}

                        else if ( (LA16_0=='v') ) {s = 24;}

                        else if ( (LA16_0=='+') ) {s = 25;}

                        else if ( (LA16_0=='/') ) {s = 26;}

                        else if ( (LA16_0=='>') ) {s = 27;}

                        else if ( (LA16_0=='<') ) {s = 28;}

                        else if ( (LA16_0=='!') ) {s = 29;}

                        else if ( (LA16_0=='&') ) {s = 30;}

                        else if ( (LA16_0=='|') ) {s = 31;}

                        else if ( (LA16_0=='-') ) {s = 32;}

                        else if ( (LA16_0=='^') ) {s = 33;}

                        else if ( ((LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||LA16_0=='a'||(LA16_0>='g' && LA16_0<='h')||(LA16_0>='j' && LA16_0<='o')||LA16_0=='q'||LA16_0=='u'||(LA16_0>='x' && LA16_0<='z')) ) {s = 34;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 35;}

                        else if ( (LA16_0=='\"') ) {s = 36;}

                        else if ( (LA16_0=='\'') ) {s = 37;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 38;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||(LA16_0>='#' && LA16_0<='%')||(LA16_0>='?' && LA16_0<='@')||LA16_0=='\\'||LA16_0=='`'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 39;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_37 = input.LA(1);

                        s = -1;
                        if ( ((LA16_37>='\u0000' && LA16_37<='\uFFFF')) ) {s = 80;}

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