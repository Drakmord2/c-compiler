package com.poli.compilador.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCLexer extends Lexer {
    public static final int RULE_STRING=14;
    public static final int RULE_SL_COMMENT=16;
    public static final int T__19=19;
    public static final int RULE_TRUE=12;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_TYPELIT=4;
    public static final int RULE_ID=5;
    public static final int RULE_WS=17;
    public static final int RULE_UO=10;
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
    public static final int RULE_RO=7;
    public static final int RULE_AO1=8;
    public static final int T__25=25;
    public static final int RULE_AO2=9;
    public static final int RULE_FALSE=13;
    public static final int RULE_LO=6;
    public static final int T__20=20;
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
            // InternalC.g:11:7: ( '1' )
            // InternalC.g:11:9: '1'
            {
            match('1'); 

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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:16:7: ( 'if' )
            // InternalC.g:16:9: 'if'
            {
            match("if"); 


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
            // InternalC.g:17:7: ( 'else' )
            // InternalC.g:17:9: 'else'
            {
            match("else"); 


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
            // InternalC.g:18:7: ( 'break' )
            // InternalC.g:18:9: 'break'
            {
            match("break"); 


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
            // InternalC.g:19:7: ( ';' )
            // InternalC.g:19:9: ';'
            {
            match(';'); 

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
            // InternalC.g:20:7: ( 'continue' )
            // InternalC.g:20:9: 'continue'
            {
            match("continue"); 


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
            // InternalC.g:21:7: ( 'return' )
            // InternalC.g:21:9: 'return'
            {
            match("return"); 


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
            // InternalC.g:22:7: ( '**' )
            // InternalC.g:22:9: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "RULE_TYPELIT"
    public final void mRULE_TYPELIT() throws RecognitionException {
        try {
            int _type = RULE_TYPELIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalC.g:3085:14: ( ( 'int' | 'bool' | 'char' | 'void' ) )
            // InternalC.g:3085:16: ( 'int' | 'bool' | 'char' | 'void' )
            {
            // InternalC.g:3085:16: ( 'int' | 'bool' | 'char' | 'void' )
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
            case 'c':
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
                    // InternalC.g:3085:17: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 2 :
                    // InternalC.g:3085:23: 'bool'
                    {
                    match("bool"); 


                    }
                    break;
                case 3 :
                    // InternalC.g:3085:30: 'char'
                    {
                    match("char"); 


                    }
                    break;
                case 4 :
                    // InternalC.g:3085:37: 'void'
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
            // InternalC.g:3087:11: ( 'true' )
            // InternalC.g:3087:13: 'true'
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
            // InternalC.g:3089:12: ( 'false' )
            // InternalC.g:3089:14: 'false'
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
            // InternalC.g:3091:10: ( ( '+' | '-' ) )
            // InternalC.g:3091:12: ( '+' | '-' )
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
            // InternalC.g:3093:10: ( ( '*' | '/' ) )
            // InternalC.g:3093:12: ( '*' | '/' )
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
            // InternalC.g:3095:9: ( ( '>' | '>=' | '<' | '<=' | '==' | '!=' ) )
            // InternalC.g:3095:11: ( '>' | '>=' | '<' | '<=' | '==' | '!=' )
            {
            // InternalC.g:3095:11: ( '>' | '>=' | '<' | '<=' | '==' | '!=' )
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
                    // InternalC.g:3095:12: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 2 :
                    // InternalC.g:3095:16: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 3 :
                    // InternalC.g:3095:21: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // InternalC.g:3095:25: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // InternalC.g:3095:30: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 6 :
                    // InternalC.g:3095:35: '!='
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
            // InternalC.g:3097:9: ( ( '&&' | '||' ) )
            // InternalC.g:3097:11: ( '&&' | '||' )
            {
            // InternalC.g:3097:11: ( '&&' | '||' )
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
                    // InternalC.g:3097:12: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 2 :
                    // InternalC.g:3097:17: '||'
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
            // InternalC.g:3099:9: ( ( '~' | '++' | '--' | '&' ) )
            // InternalC.g:3099:11: ( '~' | '++' | '--' | '&' )
            {
            // InternalC.g:3099:11: ( '~' | '++' | '--' | '&' )
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
                    // InternalC.g:3099:12: '~'
                    {
                    match('~'); 

                    }
                    break;
                case 2 :
                    // InternalC.g:3099:16: '++'
                    {
                    match("++"); 


                    }
                    break;
                case 3 :
                    // InternalC.g:3099:21: '--'
                    {
                    match("--"); 


                    }
                    break;
                case 4 :
                    // InternalC.g:3099:26: '&'
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
            // InternalC.g:3101:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalC.g:3101:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalC.g:3101:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalC.g:3101:11: '^'
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

            // InternalC.g:3101:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalC.g:3103:10: ( ( '0' .. '9' )+ )
            // InternalC.g:3103:12: ( '0' .. '9' )+
            {
            // InternalC.g:3103:12: ( '0' .. '9' )+
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
            	    // InternalC.g:3103:13: '0' .. '9'
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
            // InternalC.g:3105:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalC.g:3105:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalC.g:3105:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalC.g:3105:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalC.g:3105:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalC.g:3105:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalC.g:3105:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalC.g:3105:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalC.g:3105:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalC.g:3105:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalC.g:3105:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalC.g:3107:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalC.g:3107:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalC.g:3107:24: ( options {greedy=false; } : . )*
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
            	    // InternalC.g:3107:52: .
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
            // InternalC.g:3109:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalC.g:3109:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalC.g:3109:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalC.g:3109:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalC.g:3109:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalC.g:3109:41: ( '\\r' )? '\\n'
                    {
                    // InternalC.g:3109:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalC.g:3109:41: '\\r'
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
            // InternalC.g:3111:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalC.g:3111:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalC.g:3111:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalC.g:3113:16: ( . )
            // InternalC.g:3113:18: .
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
        // InternalC.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RULE_TYPELIT | RULE_TRUE | RULE_FALSE | RULE_AO1 | RULE_AO2 | RULE_RO | RULE_LO | RULE_UO | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=27;
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
                // InternalC.g:1:82: RULE_TYPELIT
                {
                mRULE_TYPELIT(); 

                }
                break;
            case 14 :
                // InternalC.g:1:95: RULE_TRUE
                {
                mRULE_TRUE(); 

                }
                break;
            case 15 :
                // InternalC.g:1:105: RULE_FALSE
                {
                mRULE_FALSE(); 

                }
                break;
            case 16 :
                // InternalC.g:1:116: RULE_AO1
                {
                mRULE_AO1(); 

                }
                break;
            case 17 :
                // InternalC.g:1:125: RULE_AO2
                {
                mRULE_AO2(); 

                }
                break;
            case 18 :
                // InternalC.g:1:134: RULE_RO
                {
                mRULE_RO(); 

                }
                break;
            case 19 :
                // InternalC.g:1:142: RULE_LO
                {
                mRULE_LO(); 

                }
                break;
            case 20 :
                // InternalC.g:1:150: RULE_UO
                {
                mRULE_UO(); 

                }
                break;
            case 21 :
                // InternalC.g:1:158: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 22 :
                // InternalC.g:1:166: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 23 :
                // InternalC.g:1:175: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 24 :
                // InternalC.g:1:187: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 25 :
                // InternalC.g:1:203: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 26 :
                // InternalC.g:1:219: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 27 :
                // InternalC.g:1:227: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\1\41\4\uffff\3\51\1\uffff\2\51\1\62\3\51\1\67\1\62\2\uffff\2\40\1\66\1\40\1\uffff\1\67\1\40\2\uffff\2\40\10\uffff\1\76\1\51\1\uffff\3\51\1\uffff\3\51\2\uffff\3\51\11\uffff\1\111\11\51\1\uffff\1\123\1\51\1\111\1\51\1\111\1\51\1\111\1\127\1\51\1\uffff\1\131\2\51\1\uffff\1\134\1\uffff\1\51\1\136\1\uffff\1\51\1\uffff\1\140\1\uffff";
    static final String DFA16_eofS =
        "\141\uffff";
    static final String DFA16_minS =
        "\1\0\1\60\4\uffff\1\146\1\154\1\157\1\uffff\1\150\1\145\1\52\1\157\1\162\1\141\1\53\1\52\2\uffff\2\75\1\46\1\174\1\uffff\1\55\1\101\2\uffff\2\0\10\uffff\1\60\1\164\1\uffff\1\163\1\145\1\157\1\uffff\1\156\1\141\1\164\2\uffff\1\151\1\165\1\154\11\uffff\1\60\1\145\1\141\1\154\1\164\1\162\1\165\1\144\1\145\1\163\1\uffff\1\60\1\153\1\60\1\151\1\60\1\162\2\60\1\145\1\uffff\1\60\2\156\1\uffff\1\60\1\uffff\1\165\1\60\1\uffff\1\145\1\uffff\1\60\1\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\71\4\uffff\1\156\1\154\1\162\1\uffff\1\157\1\145\1\52\1\157\1\162\1\141\1\53\1\57\2\uffff\2\75\1\46\1\174\1\uffff\1\55\1\172\2\uffff\2\uffff\10\uffff\1\172\1\164\1\uffff\1\163\1\145\1\157\1\uffff\1\156\1\141\1\164\2\uffff\1\151\1\165\1\154\11\uffff\1\172\1\145\1\141\1\154\1\164\1\162\1\165\1\144\1\145\1\163\1\uffff\1\172\1\153\1\172\1\151\1\172\1\162\2\172\1\145\1\uffff\1\172\2\156\1\uffff\1\172\1\uffff\1\165\1\172\1\uffff\1\145\1\uffff\1\172\1\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\3\uffff\1\11\10\uffff\2\22\4\uffff\1\24\2\uffff\1\25\1\26\2\uffff\1\32\1\33\1\1\1\26\1\2\1\3\1\4\1\5\2\uffff\1\25\3\uffff\1\11\3\uffff\1\14\1\21\3\uffff\1\24\1\20\1\30\1\31\1\22\1\23\1\27\1\32\1\6\12\uffff\1\15\11\uffff\1\7\3\uffff\1\16\1\uffff\1\10\2\uffff\1\17\1\uffff\1\13\1\uffff\1\12";
    static final String DFA16_specialS =
        "\1\2\34\uffff\1\0\1\1\102\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\40\2\37\2\40\1\37\22\40\1\37\1\25\1\35\3\40\1\26\1\36\1\2\1\3\1\14\1\20\1\40\1\31\1\40\1\21\1\34\1\1\10\34\1\40\1\11\1\23\1\24\1\22\2\40\32\33\3\40\1\32\1\33\1\40\1\33\1\10\1\12\1\33\1\7\1\17\2\33\1\6\10\33\1\13\1\33\1\16\1\33\1\15\4\33\1\4\1\27\1\5\1\30\uff81\40",
            "\12\42",
            "",
            "",
            "",
            "",
            "\1\47\7\uffff\1\50",
            "\1\52",
            "\1\54\2\uffff\1\53",
            "",
            "\1\57\6\uffff\1\56",
            "\1\60",
            "\1\61",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\70\4\uffff\1\71",
            "",
            "",
            "\1\72",
            "\1\72",
            "\1\73",
            "\1\73",
            "",
            "\1\66",
            "\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\0\74",
            "\0\74",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\77",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\124",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\125",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\126",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\130",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\132",
            "\1\133",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\135",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\137",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
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
            return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RULE_TYPELIT | RULE_TRUE | RULE_FALSE | RULE_AO1 | RULE_AO2 | RULE_RO | RULE_LO | RULE_UO | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_29 = input.LA(1);

                        s = -1;
                        if ( ((LA16_29>='\u0000' && LA16_29<='\uFFFF')) ) {s = 60;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_30 = input.LA(1);

                        s = -1;
                        if ( ((LA16_30>='\u0000' && LA16_30<='\uFFFF')) ) {s = 60;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='1') ) {s = 1;}

                        else if ( (LA16_0=='(') ) {s = 2;}

                        else if ( (LA16_0==')') ) {s = 3;}

                        else if ( (LA16_0=='{') ) {s = 4;}

                        else if ( (LA16_0=='}') ) {s = 5;}

                        else if ( (LA16_0=='i') ) {s = 6;}

                        else if ( (LA16_0=='e') ) {s = 7;}

                        else if ( (LA16_0=='b') ) {s = 8;}

                        else if ( (LA16_0==';') ) {s = 9;}

                        else if ( (LA16_0=='c') ) {s = 10;}

                        else if ( (LA16_0=='r') ) {s = 11;}

                        else if ( (LA16_0=='*') ) {s = 12;}

                        else if ( (LA16_0=='v') ) {s = 13;}

                        else if ( (LA16_0=='t') ) {s = 14;}

                        else if ( (LA16_0=='f') ) {s = 15;}

                        else if ( (LA16_0=='+') ) {s = 16;}

                        else if ( (LA16_0=='/') ) {s = 17;}

                        else if ( (LA16_0=='>') ) {s = 18;}

                        else if ( (LA16_0=='<') ) {s = 19;}

                        else if ( (LA16_0=='=') ) {s = 20;}

                        else if ( (LA16_0=='!') ) {s = 21;}

                        else if ( (LA16_0=='&') ) {s = 22;}

                        else if ( (LA16_0=='|') ) {s = 23;}

                        else if ( (LA16_0=='~') ) {s = 24;}

                        else if ( (LA16_0=='-') ) {s = 25;}

                        else if ( (LA16_0=='^') ) {s = 26;}

                        else if ( ((LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||LA16_0=='a'||LA16_0=='d'||(LA16_0>='g' && LA16_0<='h')||(LA16_0>='j' && LA16_0<='q')||LA16_0=='s'||LA16_0=='u'||(LA16_0>='w' && LA16_0<='z')) ) {s = 27;}

                        else if ( (LA16_0=='0'||(LA16_0>='2' && LA16_0<='9')) ) {s = 28;}

                        else if ( (LA16_0=='\"') ) {s = 29;}

                        else if ( (LA16_0=='\'') ) {s = 30;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 31;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||(LA16_0>='#' && LA16_0<='%')||LA16_0==','||LA16_0=='.'||LA16_0==':'||(LA16_0>='?' && LA16_0<='@')||(LA16_0>='[' && LA16_0<=']')||LA16_0=='`'||(LA16_0>='\u007F' && LA16_0<='\uFFFF')) ) {s = 32;}

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