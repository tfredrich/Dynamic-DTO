// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g 2010-03-30 16:14:32

//--------------------------------------
// XerialJ Project
//
// JSONLexer.java
// Since: Apr 26, 2007
//
//--------------------------------------
package com.strategicgains.dto.serialization.json.impl;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class JSONLexer extends Lexer {
    public static final int OBJECT=4;
    public static final int ELEMENT=5;
    public static final int RBrace=13;
    public static final int ARRAY=6;
    public static final int LBracket=14;
    public static final int Digit=20;
    public static final int Frac=26;
    public static final int HexDigit=21;
    public static final int DOUBLE=9;
    public static final int Exp=27;
    public static final int STRING=7;
    public static final int Int=25;
    public static final int FALSE=18;
    public static final int UnicodeChar=22;
    public static final int StringChar=24;
    public static final int String=29;
    public static final int INTEGER=8;
    public static final int Comma=11;
    public static final int Dot=16;
    public static final int EscapeSequence=23;
    public static final int EOF=-1;
    public static final int NULL=19;
    public static final int Integer=30;
    public static final int LBrace=12;
    public static final int Double=31;
    public static final int RBracket=15;
    public static final int WhiteSpace=28;
    public static final int TRUE=17;
    public static final int Colon=10;

    // delegates
    // delegators

    public JSONLexer() {;} 
    public JSONLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public JSONLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g"; }

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:71:6: ( ':' )
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:71:8: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:72:6: ( ',' )
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:72:8: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "LBrace"
    public final void mLBrace() throws RecognitionException {
        try {
            int _type = LBrace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:73:7: ( '{' )
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:73:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBrace"

    // $ANTLR start "RBrace"
    public final void mRBrace() throws RecognitionException {
        try {
            int _type = RBrace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:74:7: ( '}' )
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:74:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBrace"

    // $ANTLR start "LBracket"
    public final void mLBracket() throws RecognitionException {
        try {
            int _type = LBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:75:9: ( '[' )
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:75:11: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBracket"

    // $ANTLR start "RBracket"
    public final void mRBracket() throws RecognitionException {
        try {
            int _type = RBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:76:9: ( ']' )
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:76:11: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBracket"

    // $ANTLR start "Dot"
    public final void mDot() throws RecognitionException {
        try {
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:77:13: ( '.' )
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:77:15: '.'
            {
            match('.'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "Dot"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:78:5: ( 'true' )
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:78:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:79:6: ( 'false' )
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:79:8: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:80:5: ( 'null' )
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:80:7: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:82:15: ( '0' .. '9' )
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:82:17: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "Digit"

    // $ANTLR start "HexDigit"
    public final void mHexDigit() throws RecognitionException {
        try {
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:83:18: ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:83:20: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HexDigit"

    // $ANTLR start "UnicodeChar"
    public final void mUnicodeChar() throws RecognitionException {
        try {
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:84:21: (~ ( '\"' | '\\\\' ) )
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:84:23: ~ ( '\"' | '\\\\' )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "UnicodeChar"

    // $ANTLR start "StringChar"
    public final void mStringChar() throws RecognitionException {
        try {
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:85:21: ( UnicodeChar | EscapeSequence )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                alt1=1;
            }
            else if ( (LA1_0=='\\') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:85:24: UnicodeChar
                    {
                    mUnicodeChar(); 

                    }
                    break;
                case 2 :
                    // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:85:38: EscapeSequence
                    {
                    mEscapeSequence(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "StringChar"

    // $ANTLR start "EscapeSequence"
    public final void mEscapeSequence() throws RecognitionException {
        try {
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:88:2: ( '\\\\' ( '\\\"' | '\\\\' | '/' | 'b' | 'f' | 'n' | 'r' | 't' | 'u' HexDigit HexDigit HexDigit HexDigit ) )
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:88:4: '\\\\' ( '\\\"' | '\\\\' | '/' | 'b' | 'f' | 'n' | 'r' | 't' | 'u' HexDigit HexDigit HexDigit HexDigit )
            {
            match('\\'); 
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:88:9: ( '\\\"' | '\\\\' | '/' | 'b' | 'f' | 'n' | 'r' | 't' | 'u' HexDigit HexDigit HexDigit HexDigit )
            int alt2=9;
            switch ( input.LA(1) ) {
            case '\"':
                {
                alt2=1;
                }
                break;
            case '\\':
                {
                alt2=2;
                }
                break;
            case '/':
                {
                alt2=3;
                }
                break;
            case 'b':
                {
                alt2=4;
                }
                break;
            case 'f':
                {
                alt2=5;
                }
                break;
            case 'n':
                {
                alt2=6;
                }
                break;
            case 'r':
                {
                alt2=7;
                }
                break;
            case 't':
                {
                alt2=8;
                }
                break;
            case 'u':
                {
                alt2=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:88:10: '\\\"'
                    {
                    match('\"'); 

                    }
                    break;
                case 2 :
                    // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:88:17: '\\\\'
                    {
                    match('\\'); 

                    }
                    break;
                case 3 :
                    // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:88:24: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 4 :
                    // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:88:30: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 5 :
                    // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:88:36: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 6 :
                    // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:88:42: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 7 :
                    // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:88:48: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 8 :
                    // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:88:54: 't'
                    {
                    match('t'); 

                    }
                    break;
                case 9 :
                    // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:88:60: 'u' HexDigit HexDigit HexDigit HexDigit
                    {
                    match('u'); 
                    mHexDigit(); 
                    mHexDigit(); 
                    mHexDigit(); 
                    mHexDigit(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "EscapeSequence"

    // $ANTLR start "Int"
    public final void mInt() throws RecognitionException {
        try {
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:91:13: ( ( '-' )? ( '0' | '1' .. '9' ( Digit )* ) )
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:91:15: ( '-' )? ( '0' | '1' .. '9' ( Digit )* )
            {
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:91:15: ( '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:91:15: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:91:20: ( '0' | '1' .. '9' ( Digit )* )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='0') ) {
                alt5=1;
            }
            else if ( ((LA5_0>='1' && LA5_0<='9')) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:91:21: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:91:27: '1' .. '9' ( Digit )*
                    {
                    matchRange('1','9'); 
                    // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:91:36: ( Digit )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:91:36: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "Int"

    // $ANTLR start "Frac"
    public final void mFrac() throws RecognitionException {
        try {
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:92:14: ( Dot ( Digit )+ )
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:92:16: Dot ( Digit )+
            {
            mDot(); 
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:92:20: ( Digit )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:92:20: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "Frac"

    // $ANTLR start "Exp"
    public final void mExp() throws RecognitionException {
        try {
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:93:13: ( ( 'e' | 'E' ) ( '+' | '-' )? ( Digit )+ )
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:93:15: ( 'e' | 'E' ) ( '+' | '-' )? ( Digit )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:93:27: ( '+' | '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='+'||LA7_0=='-') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:93:40: ( Digit )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:93:40: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "Exp"

    // $ANTLR start "WhiteSpace"
    public final void mWhiteSpace() throws RecognitionException {
        try {
            int _type = WhiteSpace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:95:11: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:95:13: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WhiteSpace"

    // $ANTLR start "String"
    public final void mString() throws RecognitionException {
        try {
            int _type = String;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:97:7: ( '\"' ( StringChar )* '\"' )
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:97:9: '\"' ( StringChar )* '\"'
            {
            match('\"'); 
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:97:13: ( StringChar )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:97:13: StringChar
            	    {
            	    mStringChar(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "String"

    // $ANTLR start "Integer"
    public final void mInteger() throws RecognitionException {
        try {
            int _type = Integer;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:98:8: ( Int )
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:98:10: Int
            {
            mInt(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Integer"

    // $ANTLR start "Double"
    public final void mDouble() throws RecognitionException {
        try {
            int _type = Double;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:99:7: ( Int ( Frac ( Exp )? | Exp ) )
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:99:10: Int ( Frac ( Exp )? | Exp )
            {
            mInt(); 
            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:99:14: ( Frac ( Exp )? | Exp )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='.') ) {
                alt11=1;
            }
            else if ( (LA11_0=='E'||LA11_0=='e') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:99:15: Frac ( Exp )?
                    {
                    mFrac(); 
                    // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:99:20: ( Exp )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='E'||LA10_0=='e') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:99:20: Exp
                            {
                            mExp(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:99:27: Exp
                    {
                    mExp(); 

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
    // $ANTLR end "Double"

    public void mTokens() throws RecognitionException {
        // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:1:8: ( Colon | Comma | LBrace | RBrace | LBracket | RBracket | TRUE | FALSE | NULL | WhiteSpace | String | Integer | Double )
        int alt12=13;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:1:10: Colon
                {
                mColon(); 

                }
                break;
            case 2 :
                // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:1:16: Comma
                {
                mComma(); 

                }
                break;
            case 3 :
                // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:1:22: LBrace
                {
                mLBrace(); 

                }
                break;
            case 4 :
                // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:1:29: RBrace
                {
                mRBrace(); 

                }
                break;
            case 5 :
                // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:1:36: LBracket
                {
                mLBracket(); 

                }
                break;
            case 6 :
                // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:1:45: RBracket
                {
                mRBracket(); 

                }
                break;
            case 7 :
                // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:1:54: TRUE
                {
                mTRUE(); 

                }
                break;
            case 8 :
                // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:1:59: FALSE
                {
                mFALSE(); 

                }
                break;
            case 9 :
                // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:1:65: NULL
                {
                mNULL(); 

                }
                break;
            case 10 :
                // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:1:70: WhiteSpace
                {
                mWhiteSpace(); 

                }
                break;
            case 11 :
                // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:1:81: String
                {
                mString(); 

                }
                break;
            case 12 :
                // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:1:88: Integer
                {
                mInteger(); 

                }
                break;
            case 13 :
                // /Users/toddf/workspaces/eclipse/sginc/OssProjects/Dynamic-DTO/src/antlr/JSON.g:1:96: Double
                {
                mDouble(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\15\uffff\2\17\2\uffff\1\17";
    static final String DFA12_eofS =
        "\22\uffff";
    static final String DFA12_minS =
        "\1\11\13\uffff\1\60\2\56\2\uffff\1\56";
    static final String DFA12_maxS =
        "\1\175\13\uffff\1\71\2\145\2\uffff\1\145";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\3\uffff"+
        "\1\14\1\15\1\uffff";
    static final String DFA12_specialS =
        "\22\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\12\1\uffff\2\12\22\uffff\1\12\1\uffff\1\13\11\uffff\1\2\1"+
            "\14\2\uffff\1\15\11\16\1\1\40\uffff\1\5\1\uffff\1\6\10\uffff"+
            "\1\10\7\uffff\1\11\5\uffff\1\7\6\uffff\1\3\1\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\15\11\16",
            "\1\20\26\uffff\1\20\37\uffff\1\20",
            "\1\20\1\uffff\12\21\13\uffff\1\20\37\uffff\1\20",
            "",
            "",
            "\1\20\1\uffff\12\21\13\uffff\1\20\37\uffff\1\20"
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Colon | Comma | LBrace | RBrace | LBracket | RBracket | TRUE | FALSE | NULL | WhiteSpace | String | Integer | Double );";
        }
    }
 

}