package com.poli.compilador.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.poli.compilador.services.CGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_LO", "RULE_RO", "RULE_AO1", "RULE_AO2", "RULE_UO", "RULE_TYPELIT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "'('", "','", "')'", "'{'", "'}'", "'**'", "'struct'", "';'", "'if'", "'else'", "'while'", "'for'", "'switch'", "'default'", "':'", "'do'", "'break'", "'continue'", "'return'", "'print'", "'='", "'.'", "'['", "']'", "'case'", "'true'", "'false'"
    };
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


        public InternalCParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCParser.tokenNames; }
    public String getGrammarFileName() { return "InternalC.g"; }



     	private CGrammarAccess grammarAccess;

        public InternalCParser(TokenStream input, CGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected CGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalC.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalC.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalC.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalC.g:71:1: ruleProgram returns [EObject current=null] : ( (lv_definition_0_0= ruleDefinition ) )* ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_definition_0_0 = null;



        	enterRule();

        try {
            // InternalC.g:77:2: ( ( (lv_definition_0_0= ruleDefinition ) )* )
            // InternalC.g:78:2: ( (lv_definition_0_0= ruleDefinition ) )*
            {
            // InternalC.g:78:2: ( (lv_definition_0_0= ruleDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_TYPELIT||LA1_0==17||LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalC.g:79:3: (lv_definition_0_0= ruleDefinition )
            	    {
            	    // InternalC.g:79:3: (lv_definition_0_0= ruleDefinition )
            	    // InternalC.g:80:4: lv_definition_0_0= ruleDefinition
            	    {

            	    				newCompositeNode(grammarAccess.getProgramAccess().getDefinitionDefinitionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_definition_0_0=ruleDefinition();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"definition",
            	    					lv_definition_0_0,
            	    					"com.poli.compilador.C.Definition");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleDefinition"
    // InternalC.g:100:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalC.g:100:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalC.g:101:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalC.g:107:1: ruleDefinition returns [EObject current=null] : (this_Struct_0= ruleStruct | this_Function_1= ruleFunction | this_Declaration_2= ruleDeclaration ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_Struct_0 = null;

        EObject this_Function_1 = null;

        EObject this_Declaration_2 = null;



        	enterRule();

        try {
            // InternalC.g:113:2: ( (this_Struct_0= ruleStruct | this_Function_1= ruleFunction | this_Declaration_2= ruleDeclaration ) )
            // InternalC.g:114:2: (this_Struct_0= ruleStruct | this_Function_1= ruleFunction | this_Declaration_2= ruleDeclaration )
            {
            // InternalC.g:114:2: (this_Struct_0= ruleStruct | this_Function_1= ruleFunction | this_Declaration_2= ruleDeclaration )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==21) ) {
                        alt2=1;
                    }
                    else if ( (LA2_4==RULE_ID) ) {
                        alt2=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case RULE_TYPELIT:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalC.g:115:3: this_Struct_0= ruleStruct
                    {

                    			newCompositeNode(grammarAccess.getDefinitionAccess().getStructParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Struct_0=ruleStruct();

                    state._fsp--;


                    			current = this_Struct_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalC.g:124:3: this_Function_1= ruleFunction
                    {

                    			newCompositeNode(grammarAccess.getDefinitionAccess().getFunctionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Function_1=ruleFunction();

                    state._fsp--;


                    			current = this_Function_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalC.g:133:3: this_Declaration_2= ruleDeclaration
                    {

                    			newCompositeNode(grammarAccess.getDefinitionAccess().getDeclarationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Declaration_2=ruleDeclaration();

                    state._fsp--;


                    			current = this_Declaration_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleFunction"
    // InternalC.g:145:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalC.g:145:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalC.g:146:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalC.g:152:1: ruleFunction returns [EObject current=null] : ( () otherlv_1= 'function' ( (lv_tipo_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_params_5_0= ruleDeclaration ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleDeclaration ) ) )* )? otherlv_8= ')' otherlv_9= '{' ( (lv_commands_10_0= ruleCommand ) )* otherlv_11= '}' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_tipo_2_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_params_7_0 = null;

        EObject lv_commands_10_0 = null;



        	enterRule();

        try {
            // InternalC.g:158:2: ( ( () otherlv_1= 'function' ( (lv_tipo_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_params_5_0= ruleDeclaration ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleDeclaration ) ) )* )? otherlv_8= ')' otherlv_9= '{' ( (lv_commands_10_0= ruleCommand ) )* otherlv_11= '}' ) )
            // InternalC.g:159:2: ( () otherlv_1= 'function' ( (lv_tipo_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_params_5_0= ruleDeclaration ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleDeclaration ) ) )* )? otherlv_8= ')' otherlv_9= '{' ( (lv_commands_10_0= ruleCommand ) )* otherlv_11= '}' )
            {
            // InternalC.g:159:2: ( () otherlv_1= 'function' ( (lv_tipo_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_params_5_0= ruleDeclaration ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleDeclaration ) ) )* )? otherlv_8= ')' otherlv_9= '{' ( (lv_commands_10_0= ruleCommand ) )* otherlv_11= '}' )
            // InternalC.g:160:3: () otherlv_1= 'function' ( (lv_tipo_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_params_5_0= ruleDeclaration ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleDeclaration ) ) )* )? otherlv_8= ')' otherlv_9= '{' ( (lv_commands_10_0= ruleCommand ) )* otherlv_11= '}'
            {
            // InternalC.g:160:3: ()
            // InternalC.g:161:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFunctionAccess().getFunctionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionAccess().getFunctionKeyword_1());
            		
            // InternalC.g:171:3: ( (lv_tipo_2_0= ruleType ) )
            // InternalC.g:172:4: (lv_tipo_2_0= ruleType )
            {
            // InternalC.g:172:4: (lv_tipo_2_0= ruleType )
            // InternalC.g:173:5: lv_tipo_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getTipoTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_tipo_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionRule());
            					}
            					set(
            						current,
            						"tipo",
            						lv_tipo_2_0,
            						"com.poli.compilador.C.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalC.g:190:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalC.g:191:4: (lv_name_3_0= RULE_ID )
            {
            // InternalC.g:191:4: (lv_name_3_0= RULE_ID )
            // InternalC.g:192:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_3_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_4());
            		
            // InternalC.g:212:3: ( ( (lv_params_5_0= ruleDeclaration ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleDeclaration ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_TYPELIT||LA4_0==24) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalC.g:213:4: ( (lv_params_5_0= ruleDeclaration ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleDeclaration ) ) )*
                    {
                    // InternalC.g:213:4: ( (lv_params_5_0= ruleDeclaration ) )
                    // InternalC.g:214:5: (lv_params_5_0= ruleDeclaration )
                    {
                    // InternalC.g:214:5: (lv_params_5_0= ruleDeclaration )
                    // InternalC.g:215:6: lv_params_5_0= ruleDeclaration
                    {

                    						newCompositeNode(grammarAccess.getFunctionAccess().getParamsDeclarationParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_params_5_0=ruleDeclaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_5_0,
                    							"com.poli.compilador.C.Declaration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalC.g:232:4: (otherlv_6= ',' ( (lv_params_7_0= ruleDeclaration ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==19) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalC.g:233:5: otherlv_6= ',' ( (lv_params_7_0= ruleDeclaration ) )
                    	    {
                    	    otherlv_6=(Token)match(input,19,FOLLOW_7); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalC.g:237:5: ( (lv_params_7_0= ruleDeclaration ) )
                    	    // InternalC.g:238:6: (lv_params_7_0= ruleDeclaration )
                    	    {
                    	    // InternalC.g:238:6: (lv_params_7_0= ruleDeclaration )
                    	    // InternalC.g:239:7: lv_params_7_0= ruleDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionAccess().getParamsDeclarationParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_params_7_0=ruleDeclaration();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_7_0,
                    	    								"com.poli.compilador.C.Declaration");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_6());
            		
            otherlv_9=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalC.g:266:3: ( (lv_commands_10_0= ruleCommand ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||(LA5_0>=RULE_UO && LA5_0<=RULE_STRING)||LA5_0==18||(LA5_0>=23 && LA5_0<=24)||LA5_0==26||(LA5_0>=28 && LA5_0<=30)||(LA5_0>=33 && LA5_0<=37)||(LA5_0>=43 && LA5_0<=44)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalC.g:267:4: (lv_commands_10_0= ruleCommand )
            	    {
            	    // InternalC.g:267:4: (lv_commands_10_0= ruleCommand )
            	    // InternalC.g:268:5: lv_commands_10_0= ruleCommand
            	    {

            	    					newCompositeNode(grammarAccess.getFunctionAccess().getCommandsCommandParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_commands_10_0=ruleCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFunctionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"commands",
            	    						lv_commands_10_0,
            	    						"com.poli.compilador.C.Command");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_11=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleDeclaration"
    // InternalC.g:293:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalC.g:293:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalC.g:294:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalC.g:300:1: ruleDeclaration returns [EObject current=null] : ( () ( ( () ( ( (lv_tipo_2_0= ruleType ) ) (otherlv_3= '**' )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_val_5_0= ruleAssignment ) )? ) ) | ( () (otherlv_7= 'struct' ( (otherlv_8= RULE_ID ) ) ( (lv_name_9_0= RULE_ID ) ) ) ) ) otherlv_10= ';' ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        EObject lv_tipo_2_0 = null;

        EObject lv_val_5_0 = null;



        	enterRule();

        try {
            // InternalC.g:306:2: ( ( () ( ( () ( ( (lv_tipo_2_0= ruleType ) ) (otherlv_3= '**' )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_val_5_0= ruleAssignment ) )? ) ) | ( () (otherlv_7= 'struct' ( (otherlv_8= RULE_ID ) ) ( (lv_name_9_0= RULE_ID ) ) ) ) ) otherlv_10= ';' ) )
            // InternalC.g:307:2: ( () ( ( () ( ( (lv_tipo_2_0= ruleType ) ) (otherlv_3= '**' )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_val_5_0= ruleAssignment ) )? ) ) | ( () (otherlv_7= 'struct' ( (otherlv_8= RULE_ID ) ) ( (lv_name_9_0= RULE_ID ) ) ) ) ) otherlv_10= ';' )
            {
            // InternalC.g:307:2: ( () ( ( () ( ( (lv_tipo_2_0= ruleType ) ) (otherlv_3= '**' )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_val_5_0= ruleAssignment ) )? ) ) | ( () (otherlv_7= 'struct' ( (otherlv_8= RULE_ID ) ) ( (lv_name_9_0= RULE_ID ) ) ) ) ) otherlv_10= ';' )
            // InternalC.g:308:3: () ( ( () ( ( (lv_tipo_2_0= ruleType ) ) (otherlv_3= '**' )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_val_5_0= ruleAssignment ) )? ) ) | ( () (otherlv_7= 'struct' ( (otherlv_8= RULE_ID ) ) ( (lv_name_9_0= RULE_ID ) ) ) ) ) otherlv_10= ';'
            {
            // InternalC.g:308:3: ()
            // InternalC.g:309:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeclarationAccess().getDeclarationAction_0(),
            					current);
            			

            }

            // InternalC.g:315:3: ( ( () ( ( (lv_tipo_2_0= ruleType ) ) (otherlv_3= '**' )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_val_5_0= ruleAssignment ) )? ) ) | ( () (otherlv_7= 'struct' ( (otherlv_8= RULE_ID ) ) ( (lv_name_9_0= RULE_ID ) ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_TYPELIT) ) {
                alt8=1;
            }
            else if ( (LA8_0==24) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalC.g:316:4: ( () ( ( (lv_tipo_2_0= ruleType ) ) (otherlv_3= '**' )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_val_5_0= ruleAssignment ) )? ) )
                    {
                    // InternalC.g:316:4: ( () ( ( (lv_tipo_2_0= ruleType ) ) (otherlv_3= '**' )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_val_5_0= ruleAssignment ) )? ) )
                    // InternalC.g:317:5: () ( ( (lv_tipo_2_0= ruleType ) ) (otherlv_3= '**' )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_val_5_0= ruleAssignment ) )? )
                    {
                    // InternalC.g:317:5: ()
                    // InternalC.g:318:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getDeclarationAccess().getVarDeclObjAction_1_0_0(),
                    							current);
                    					

                    }

                    // InternalC.g:324:5: ( ( (lv_tipo_2_0= ruleType ) ) (otherlv_3= '**' )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_val_5_0= ruleAssignment ) )? )
                    // InternalC.g:325:6: ( (lv_tipo_2_0= ruleType ) ) (otherlv_3= '**' )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_val_5_0= ruleAssignment ) )?
                    {
                    // InternalC.g:325:6: ( (lv_tipo_2_0= ruleType ) )
                    // InternalC.g:326:7: (lv_tipo_2_0= ruleType )
                    {
                    // InternalC.g:326:7: (lv_tipo_2_0= ruleType )
                    // InternalC.g:327:8: lv_tipo_2_0= ruleType
                    {

                    								newCompositeNode(grammarAccess.getDeclarationAccess().getTipoTypeParserRuleCall_1_0_1_0_0());
                    							
                    pushFollow(FOLLOW_11);
                    lv_tipo_2_0=ruleType();

                    state._fsp--;


                    								if (current==null) {
                    									current = createModelElementForParent(grammarAccess.getDeclarationRule());
                    								}
                    								set(
                    									current,
                    									"tipo",
                    									lv_tipo_2_0,
                    									"com.poli.compilador.C.Type");
                    								afterParserOrEnumRuleCall();
                    							

                    }


                    }

                    // InternalC.g:344:6: (otherlv_3= '**' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==23) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalC.g:345:7: otherlv_3= '**'
                            {
                            otherlv_3=(Token)match(input,23,FOLLOW_5); 

                            							newLeafNode(otherlv_3, grammarAccess.getDeclarationAccess().getAsteriskAsteriskKeyword_1_0_1_1());
                            						

                            }
                            break;

                    }

                    // InternalC.g:350:6: ( (lv_name_4_0= RULE_ID ) )
                    // InternalC.g:351:7: (lv_name_4_0= RULE_ID )
                    {
                    // InternalC.g:351:7: (lv_name_4_0= RULE_ID )
                    // InternalC.g:352:8: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_12); 

                    								newLeafNode(lv_name_4_0, grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_1_0_1_2_0());
                    							

                    								if (current==null) {
                    									current = createModelElement(grammarAccess.getDeclarationRule());
                    								}
                    								setWithLastConsumed(
                    									current,
                    									"name",
                    									lv_name_4_0,
                    									"org.eclipse.xtext.common.Terminals.ID");
                    							

                    }


                    }

                    // InternalC.g:368:6: ( (lv_val_5_0= ruleAssignment ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==38) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalC.g:369:7: (lv_val_5_0= ruleAssignment )
                            {
                            // InternalC.g:369:7: (lv_val_5_0= ruleAssignment )
                            // InternalC.g:370:8: lv_val_5_0= ruleAssignment
                            {

                            								newCompositeNode(grammarAccess.getDeclarationAccess().getValAssignmentParserRuleCall_1_0_1_3_0());
                            							
                            pushFollow(FOLLOW_13);
                            lv_val_5_0=ruleAssignment();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getDeclarationRule());
                            								}
                            								set(
                            									current,
                            									"val",
                            									lv_val_5_0,
                            									"com.poli.compilador.C.Assignment");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalC.g:390:4: ( () (otherlv_7= 'struct' ( (otherlv_8= RULE_ID ) ) ( (lv_name_9_0= RULE_ID ) ) ) )
                    {
                    // InternalC.g:390:4: ( () (otherlv_7= 'struct' ( (otherlv_8= RULE_ID ) ) ( (lv_name_9_0= RULE_ID ) ) ) )
                    // InternalC.g:391:5: () (otherlv_7= 'struct' ( (otherlv_8= RULE_ID ) ) ( (lv_name_9_0= RULE_ID ) ) )
                    {
                    // InternalC.g:391:5: ()
                    // InternalC.g:392:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getDeclarationAccess().getStrDeclObjAction_1_1_0(),
                    							current);
                    					

                    }

                    // InternalC.g:398:5: (otherlv_7= 'struct' ( (otherlv_8= RULE_ID ) ) ( (lv_name_9_0= RULE_ID ) ) )
                    // InternalC.g:399:6: otherlv_7= 'struct' ( (otherlv_8= RULE_ID ) ) ( (lv_name_9_0= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,24,FOLLOW_5); 

                    						newLeafNode(otherlv_7, grammarAccess.getDeclarationAccess().getStructKeyword_1_1_1_0());
                    					
                    // InternalC.g:403:6: ( (otherlv_8= RULE_ID ) )
                    // InternalC.g:404:7: (otherlv_8= RULE_ID )
                    {
                    // InternalC.g:404:7: (otherlv_8= RULE_ID )
                    // InternalC.g:405:8: otherlv_8= RULE_ID
                    {

                    								if (current==null) {
                    									current = createModelElement(grammarAccess.getDeclarationRule());
                    								}
                    							
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_5); 

                    								newLeafNode(otherlv_8, grammarAccess.getDeclarationAccess().getStrStructCrossReference_1_1_1_1_0());
                    							

                    }


                    }

                    // InternalC.g:416:6: ( (lv_name_9_0= RULE_ID ) )
                    // InternalC.g:417:7: (lv_name_9_0= RULE_ID )
                    {
                    // InternalC.g:417:7: (lv_name_9_0= RULE_ID )
                    // InternalC.g:418:8: lv_name_9_0= RULE_ID
                    {
                    lv_name_9_0=(Token)match(input,RULE_ID,FOLLOW_13); 

                    								newLeafNode(lv_name_9_0, grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_1_1_1_2_0());
                    							

                    								if (current==null) {
                    									current = createModelElement(grammarAccess.getDeclarationRule());
                    								}
                    								setWithLastConsumed(
                    									current,
                    									"name",
                    									lv_name_9_0,
                    									"org.eclipse.xtext.common.Terminals.ID");
                    							

                    }


                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDeclarationAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleStruct"
    // InternalC.g:445:1: entryRuleStruct returns [EObject current=null] : iv_ruleStruct= ruleStruct EOF ;
    public final EObject entryRuleStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStruct = null;


        try {
            // InternalC.g:445:47: (iv_ruleStruct= ruleStruct EOF )
            // InternalC.g:446:2: iv_ruleStruct= ruleStruct EOF
            {
             newCompositeNode(grammarAccess.getStructRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStruct=ruleStruct();

            state._fsp--;

             current =iv_ruleStruct; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStruct"


    // $ANTLR start "ruleStruct"
    // InternalC.g:452:1: ruleStruct returns [EObject current=null] : ( () otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_decl_4_0= ruleDeclaration ) )* otherlv_5= '}' otherlv_6= ';' ) ;
    public final EObject ruleStruct() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_decl_4_0 = null;



        	enterRule();

        try {
            // InternalC.g:458:2: ( ( () otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_decl_4_0= ruleDeclaration ) )* otherlv_5= '}' otherlv_6= ';' ) )
            // InternalC.g:459:2: ( () otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_decl_4_0= ruleDeclaration ) )* otherlv_5= '}' otherlv_6= ';' )
            {
            // InternalC.g:459:2: ( () otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_decl_4_0= ruleDeclaration ) )* otherlv_5= '}' otherlv_6= ';' )
            // InternalC.g:460:3: () otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_decl_4_0= ruleDeclaration ) )* otherlv_5= '}' otherlv_6= ';'
            {
            // InternalC.g:460:3: ()
            // InternalC.g:461:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStructAccess().getStructAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getStructAccess().getStructKeyword_1());
            		
            // InternalC.g:471:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalC.g:472:4: (lv_name_2_0= RULE_ID )
            {
            // InternalC.g:472:4: (lv_name_2_0= RULE_ID )
            // InternalC.g:473:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getStructAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStructRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getStructAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalC.g:493:3: ( (lv_decl_4_0= ruleDeclaration ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_TYPELIT||LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalC.g:494:4: (lv_decl_4_0= ruleDeclaration )
            	    {
            	    // InternalC.g:494:4: (lv_decl_4_0= ruleDeclaration )
            	    // InternalC.g:495:5: lv_decl_4_0= ruleDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getStructAccess().getDeclDeclarationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_decl_4_0=ruleDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStructRule());
            	    					}
            	    					add(
            	    						current,
            	    						"decl",
            	    						lv_decl_4_0,
            	    						"com.poli.compilador.C.Declaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getStructAccess().getRightCurlyBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getStructAccess().getSemicolonKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStruct"


    // $ANTLR start "entryRuleCommand"
    // InternalC.g:524:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalC.g:524:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalC.g:525:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalC.g:531:1: ruleCommand returns [EObject current=null] : ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_trueCommands_6_0= ruleCommand ) )* otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_falseCommands_10_0= ruleCommand ) )* otherlv_11= '}' )? ) | ( () otherlv_13= 'while' otherlv_14= '(' ( (lv_exp_15_0= ruleExpression ) ) otherlv_16= ')' otherlv_17= '{' ( (lv_commands_18_0= ruleCommand ) )* otherlv_19= '}' ) | ( () otherlv_21= 'for' otherlv_22= '(' ( (lv_init_23_0= rulelValue ) ) ( (lv_initAsg_24_0= ruleAssignment ) ) otherlv_25= ';' ( (lv_exp_26_0= ruleExpression ) ) otherlv_27= ';' ( (lv_inc_28_0= ruleFactor ) ) ( (lv_incAsg_29_0= ruleAssignment ) )? otherlv_30= ')' otherlv_31= '{' ( (lv_commands_32_0= ruleCommand ) )* otherlv_33= '}' ) | ( () otherlv_35= 'switch' otherlv_36= '(' ( (lv_exp_37_0= ruleExpression ) ) otherlv_38= ')' otherlv_39= '{' ( (lv_cases_40_0= ruleCase ) )* (otherlv_41= 'default' otherlv_42= ':' ( (lv_defaultCmds_43_0= ruleCommand ) )* )? otherlv_44= '}' ) | ( () otherlv_46= 'do' otherlv_47= '{' ( (lv_commands_48_0= ruleCommand ) )* otherlv_49= '}' otherlv_50= 'while' otherlv_51= '(' ( (lv_exp_52_0= ruleExpression ) ) otherlv_53= ')' otherlv_54= ';' ) | ( () ( (lv_lval_56_0= ruleFactor ) ) ( (lv_asg_57_0= ruleAssignment ) )? otherlv_58= ';' ) | ( () otherlv_60= 'break' otherlv_61= ';' ) | ( () otherlv_63= 'continue' otherlv_64= ';' ) | ( () otherlv_66= 'return' ( (lv_exp_67_0= ruleExpression ) )? otherlv_68= ';' ) | ( () ( (lv_val_70_0= ruleDeclaration ) ) ) | ( () otherlv_72= 'print' otherlv_73= '(' ( (lv_exp_74_0= ruleExpression ) )? otherlv_75= ')' otherlv_76= ';' ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        Token otherlv_51=null;
        Token otherlv_53=null;
        Token otherlv_54=null;
        Token otherlv_58=null;
        Token otherlv_60=null;
        Token otherlv_61=null;
        Token otherlv_63=null;
        Token otherlv_64=null;
        Token otherlv_66=null;
        Token otherlv_68=null;
        Token otherlv_72=null;
        Token otherlv_73=null;
        Token otherlv_75=null;
        Token otherlv_76=null;
        EObject lv_exp_3_0 = null;

        EObject lv_trueCommands_6_0 = null;

        EObject lv_falseCommands_10_0 = null;

        EObject lv_exp_15_0 = null;

        EObject lv_commands_18_0 = null;

        EObject lv_init_23_0 = null;

        EObject lv_initAsg_24_0 = null;

        EObject lv_exp_26_0 = null;

        EObject lv_inc_28_0 = null;

        EObject lv_incAsg_29_0 = null;

        EObject lv_commands_32_0 = null;

        EObject lv_exp_37_0 = null;

        EObject lv_cases_40_0 = null;

        EObject lv_defaultCmds_43_0 = null;

        EObject lv_commands_48_0 = null;

        EObject lv_exp_52_0 = null;

        EObject lv_lval_56_0 = null;

        EObject lv_asg_57_0 = null;

        EObject lv_exp_67_0 = null;

        EObject lv_val_70_0 = null;

        EObject lv_exp_74_0 = null;



        	enterRule();

        try {
            // InternalC.g:537:2: ( ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_trueCommands_6_0= ruleCommand ) )* otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_falseCommands_10_0= ruleCommand ) )* otherlv_11= '}' )? ) | ( () otherlv_13= 'while' otherlv_14= '(' ( (lv_exp_15_0= ruleExpression ) ) otherlv_16= ')' otherlv_17= '{' ( (lv_commands_18_0= ruleCommand ) )* otherlv_19= '}' ) | ( () otherlv_21= 'for' otherlv_22= '(' ( (lv_init_23_0= rulelValue ) ) ( (lv_initAsg_24_0= ruleAssignment ) ) otherlv_25= ';' ( (lv_exp_26_0= ruleExpression ) ) otherlv_27= ';' ( (lv_inc_28_0= ruleFactor ) ) ( (lv_incAsg_29_0= ruleAssignment ) )? otherlv_30= ')' otherlv_31= '{' ( (lv_commands_32_0= ruleCommand ) )* otherlv_33= '}' ) | ( () otherlv_35= 'switch' otherlv_36= '(' ( (lv_exp_37_0= ruleExpression ) ) otherlv_38= ')' otherlv_39= '{' ( (lv_cases_40_0= ruleCase ) )* (otherlv_41= 'default' otherlv_42= ':' ( (lv_defaultCmds_43_0= ruleCommand ) )* )? otherlv_44= '}' ) | ( () otherlv_46= 'do' otherlv_47= '{' ( (lv_commands_48_0= ruleCommand ) )* otherlv_49= '}' otherlv_50= 'while' otherlv_51= '(' ( (lv_exp_52_0= ruleExpression ) ) otherlv_53= ')' otherlv_54= ';' ) | ( () ( (lv_lval_56_0= ruleFactor ) ) ( (lv_asg_57_0= ruleAssignment ) )? otherlv_58= ';' ) | ( () otherlv_60= 'break' otherlv_61= ';' ) | ( () otherlv_63= 'continue' otherlv_64= ';' ) | ( () otherlv_66= 'return' ( (lv_exp_67_0= ruleExpression ) )? otherlv_68= ';' ) | ( () ( (lv_val_70_0= ruleDeclaration ) ) ) | ( () otherlv_72= 'print' otherlv_73= '(' ( (lv_exp_74_0= ruleExpression ) )? otherlv_75= ')' otherlv_76= ';' ) ) )
            // InternalC.g:538:2: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_trueCommands_6_0= ruleCommand ) )* otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_falseCommands_10_0= ruleCommand ) )* otherlv_11= '}' )? ) | ( () otherlv_13= 'while' otherlv_14= '(' ( (lv_exp_15_0= ruleExpression ) ) otherlv_16= ')' otherlv_17= '{' ( (lv_commands_18_0= ruleCommand ) )* otherlv_19= '}' ) | ( () otherlv_21= 'for' otherlv_22= '(' ( (lv_init_23_0= rulelValue ) ) ( (lv_initAsg_24_0= ruleAssignment ) ) otherlv_25= ';' ( (lv_exp_26_0= ruleExpression ) ) otherlv_27= ';' ( (lv_inc_28_0= ruleFactor ) ) ( (lv_incAsg_29_0= ruleAssignment ) )? otherlv_30= ')' otherlv_31= '{' ( (lv_commands_32_0= ruleCommand ) )* otherlv_33= '}' ) | ( () otherlv_35= 'switch' otherlv_36= '(' ( (lv_exp_37_0= ruleExpression ) ) otherlv_38= ')' otherlv_39= '{' ( (lv_cases_40_0= ruleCase ) )* (otherlv_41= 'default' otherlv_42= ':' ( (lv_defaultCmds_43_0= ruleCommand ) )* )? otherlv_44= '}' ) | ( () otherlv_46= 'do' otherlv_47= '{' ( (lv_commands_48_0= ruleCommand ) )* otherlv_49= '}' otherlv_50= 'while' otherlv_51= '(' ( (lv_exp_52_0= ruleExpression ) ) otherlv_53= ')' otherlv_54= ';' ) | ( () ( (lv_lval_56_0= ruleFactor ) ) ( (lv_asg_57_0= ruleAssignment ) )? otherlv_58= ';' ) | ( () otherlv_60= 'break' otherlv_61= ';' ) | ( () otherlv_63= 'continue' otherlv_64= ';' ) | ( () otherlv_66= 'return' ( (lv_exp_67_0= ruleExpression ) )? otherlv_68= ';' ) | ( () ( (lv_val_70_0= ruleDeclaration ) ) ) | ( () otherlv_72= 'print' otherlv_73= '(' ( (lv_exp_74_0= ruleExpression ) )? otherlv_75= ')' otherlv_76= ';' ) )
            {
            // InternalC.g:538:2: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_trueCommands_6_0= ruleCommand ) )* otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_falseCommands_10_0= ruleCommand ) )* otherlv_11= '}' )? ) | ( () otherlv_13= 'while' otherlv_14= '(' ( (lv_exp_15_0= ruleExpression ) ) otherlv_16= ')' otherlv_17= '{' ( (lv_commands_18_0= ruleCommand ) )* otherlv_19= '}' ) | ( () otherlv_21= 'for' otherlv_22= '(' ( (lv_init_23_0= rulelValue ) ) ( (lv_initAsg_24_0= ruleAssignment ) ) otherlv_25= ';' ( (lv_exp_26_0= ruleExpression ) ) otherlv_27= ';' ( (lv_inc_28_0= ruleFactor ) ) ( (lv_incAsg_29_0= ruleAssignment ) )? otherlv_30= ')' otherlv_31= '{' ( (lv_commands_32_0= ruleCommand ) )* otherlv_33= '}' ) | ( () otherlv_35= 'switch' otherlv_36= '(' ( (lv_exp_37_0= ruleExpression ) ) otherlv_38= ')' otherlv_39= '{' ( (lv_cases_40_0= ruleCase ) )* (otherlv_41= 'default' otherlv_42= ':' ( (lv_defaultCmds_43_0= ruleCommand ) )* )? otherlv_44= '}' ) | ( () otherlv_46= 'do' otherlv_47= '{' ( (lv_commands_48_0= ruleCommand ) )* otherlv_49= '}' otherlv_50= 'while' otherlv_51= '(' ( (lv_exp_52_0= ruleExpression ) ) otherlv_53= ')' otherlv_54= ';' ) | ( () ( (lv_lval_56_0= ruleFactor ) ) ( (lv_asg_57_0= ruleAssignment ) )? otherlv_58= ';' ) | ( () otherlv_60= 'break' otherlv_61= ';' ) | ( () otherlv_63= 'continue' otherlv_64= ';' ) | ( () otherlv_66= 'return' ( (lv_exp_67_0= ruleExpression ) )? otherlv_68= ';' ) | ( () ( (lv_val_70_0= ruleDeclaration ) ) ) | ( () otherlv_72= 'print' otherlv_73= '(' ( (lv_exp_74_0= ruleExpression ) )? otherlv_75= ')' otherlv_76= ';' ) )
            int alt23=11;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt23=1;
                }
                break;
            case 28:
                {
                alt23=2;
                }
                break;
            case 29:
                {
                alt23=3;
                }
                break;
            case 30:
                {
                alt23=4;
                }
                break;
            case 33:
                {
                alt23=5;
                }
                break;
            case RULE_ID:
            case RULE_UO:
            case RULE_INT:
            case RULE_STRING:
            case 18:
            case 23:
            case 43:
            case 44:
                {
                alt23=6;
                }
                break;
            case 34:
                {
                alt23=7;
                }
                break;
            case 35:
                {
                alt23=8;
                }
                break;
            case 36:
                {
                alt23=9;
                }
                break;
            case RULE_TYPELIT:
            case 24:
                {
                alt23=10;
                }
                break;
            case 37:
                {
                alt23=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalC.g:539:3: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_trueCommands_6_0= ruleCommand ) )* otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_falseCommands_10_0= ruleCommand ) )* otherlv_11= '}' )? )
                    {
                    // InternalC.g:539:3: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_trueCommands_6_0= ruleCommand ) )* otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_falseCommands_10_0= ruleCommand ) )* otherlv_11= '}' )? )
                    // InternalC.g:540:4: () otherlv_1= 'if' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_trueCommands_6_0= ruleCommand ) )* otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_falseCommands_10_0= ruleCommand ) )* otherlv_11= '}' )?
                    {
                    // InternalC.g:540:4: ()
                    // InternalC.g:541:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getIfCmdAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,26,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getCommandAccess().getIfKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getCommandAccess().getLeftParenthesisKeyword_0_2());
                    			
                    // InternalC.g:555:4: ( (lv_exp_3_0= ruleExpression ) )
                    // InternalC.g:556:5: (lv_exp_3_0= ruleExpression )
                    {
                    // InternalC.g:556:5: (lv_exp_3_0= ruleExpression )
                    // InternalC.g:557:6: lv_exp_3_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getExpExpressionParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_exp_3_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_3_0,
                    							"com.poli.compilador.C.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getCommandAccess().getRightParenthesisKeyword_0_4());
                    			
                    otherlv_5=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getCommandAccess().getLeftCurlyBracketKeyword_0_5());
                    			
                    // InternalC.g:582:4: ( (lv_trueCommands_6_0= ruleCommand ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID||(LA10_0>=RULE_UO && LA10_0<=RULE_STRING)||LA10_0==18||(LA10_0>=23 && LA10_0<=24)||LA10_0==26||(LA10_0>=28 && LA10_0<=30)||(LA10_0>=33 && LA10_0<=37)||(LA10_0>=43 && LA10_0<=44)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalC.g:583:5: (lv_trueCommands_6_0= ruleCommand )
                    	    {
                    	    // InternalC.g:583:5: (lv_trueCommands_6_0= ruleCommand )
                    	    // InternalC.g:584:6: lv_trueCommands_6_0= ruleCommand
                    	    {

                    	    						newCompositeNode(grammarAccess.getCommandAccess().getTrueCommandsCommandParserRuleCall_0_6_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_trueCommands_6_0=ruleCommand();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"trueCommands",
                    	    							lv_trueCommands_6_0,
                    	    							"com.poli.compilador.C.Command");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getCommandAccess().getRightCurlyBracketKeyword_0_7());
                    			
                    // InternalC.g:605:4: (otherlv_8= 'else' otherlv_9= '{' ( (lv_falseCommands_10_0= ruleCommand ) )* otherlv_11= '}' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==27) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalC.g:606:5: otherlv_8= 'else' otherlv_9= '{' ( (lv_falseCommands_10_0= ruleCommand ) )* otherlv_11= '}'
                            {
                            otherlv_8=(Token)match(input,27,FOLLOW_9); 

                            					newLeafNode(otherlv_8, grammarAccess.getCommandAccess().getElseKeyword_0_8_0());
                            				
                            otherlv_9=(Token)match(input,21,FOLLOW_10); 

                            					newLeafNode(otherlv_9, grammarAccess.getCommandAccess().getLeftCurlyBracketKeyword_0_8_1());
                            				
                            // InternalC.g:614:5: ( (lv_falseCommands_10_0= ruleCommand ) )*
                            loop11:
                            do {
                                int alt11=2;
                                int LA11_0 = input.LA(1);

                                if ( (LA11_0==RULE_ID||(LA11_0>=RULE_UO && LA11_0<=RULE_STRING)||LA11_0==18||(LA11_0>=23 && LA11_0<=24)||LA11_0==26||(LA11_0>=28 && LA11_0<=30)||(LA11_0>=33 && LA11_0<=37)||(LA11_0>=43 && LA11_0<=44)) ) {
                                    alt11=1;
                                }


                                switch (alt11) {
                            	case 1 :
                            	    // InternalC.g:615:6: (lv_falseCommands_10_0= ruleCommand )
                            	    {
                            	    // InternalC.g:615:6: (lv_falseCommands_10_0= ruleCommand )
                            	    // InternalC.g:616:7: lv_falseCommands_10_0= ruleCommand
                            	    {

                            	    							newCompositeNode(grammarAccess.getCommandAccess().getFalseCommandsCommandParserRuleCall_0_8_2_0());
                            	    						
                            	    pushFollow(FOLLOW_10);
                            	    lv_falseCommands_10_0=ruleCommand();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getCommandRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"falseCommands",
                            	    								lv_falseCommands_10_0,
                            	    								"com.poli.compilador.C.Command");
                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop11;
                                }
                            } while (true);

                            otherlv_11=(Token)match(input,22,FOLLOW_2); 

                            					newLeafNode(otherlv_11, grammarAccess.getCommandAccess().getRightCurlyBracketKeyword_0_8_3());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalC.g:640:3: ( () otherlv_13= 'while' otherlv_14= '(' ( (lv_exp_15_0= ruleExpression ) ) otherlv_16= ')' otherlv_17= '{' ( (lv_commands_18_0= ruleCommand ) )* otherlv_19= '}' )
                    {
                    // InternalC.g:640:3: ( () otherlv_13= 'while' otherlv_14= '(' ( (lv_exp_15_0= ruleExpression ) ) otherlv_16= ')' otherlv_17= '{' ( (lv_commands_18_0= ruleCommand ) )* otherlv_19= '}' )
                    // InternalC.g:641:4: () otherlv_13= 'while' otherlv_14= '(' ( (lv_exp_15_0= ruleExpression ) ) otherlv_16= ')' otherlv_17= '{' ( (lv_commands_18_0= ruleCommand ) )* otherlv_19= '}'
                    {
                    // InternalC.g:641:4: ()
                    // InternalC.g:642:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getWhileCmdAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_13=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_13, grammarAccess.getCommandAccess().getWhileKeyword_1_1());
                    			
                    otherlv_14=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_14, grammarAccess.getCommandAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalC.g:656:4: ( (lv_exp_15_0= ruleExpression ) )
                    // InternalC.g:657:5: (lv_exp_15_0= ruleExpression )
                    {
                    // InternalC.g:657:5: (lv_exp_15_0= ruleExpression )
                    // InternalC.g:658:6: lv_exp_15_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getExpExpressionParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_exp_15_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_15_0,
                    							"com.poli.compilador.C.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,20,FOLLOW_9); 

                    				newLeafNode(otherlv_16, grammarAccess.getCommandAccess().getRightParenthesisKeyword_1_4());
                    			
                    otherlv_17=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_17, grammarAccess.getCommandAccess().getLeftCurlyBracketKeyword_1_5());
                    			
                    // InternalC.g:683:4: ( (lv_commands_18_0= ruleCommand ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID||(LA13_0>=RULE_UO && LA13_0<=RULE_STRING)||LA13_0==18||(LA13_0>=23 && LA13_0<=24)||LA13_0==26||(LA13_0>=28 && LA13_0<=30)||(LA13_0>=33 && LA13_0<=37)||(LA13_0>=43 && LA13_0<=44)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalC.g:684:5: (lv_commands_18_0= ruleCommand )
                    	    {
                    	    // InternalC.g:684:5: (lv_commands_18_0= ruleCommand )
                    	    // InternalC.g:685:6: lv_commands_18_0= ruleCommand
                    	    {

                    	    						newCompositeNode(grammarAccess.getCommandAccess().getCommandsCommandParserRuleCall_1_6_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_commands_18_0=ruleCommand();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"commands",
                    	    							lv_commands_18_0,
                    	    							"com.poli.compilador.C.Command");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_19, grammarAccess.getCommandAccess().getRightCurlyBracketKeyword_1_7());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalC.g:708:3: ( () otherlv_21= 'for' otherlv_22= '(' ( (lv_init_23_0= rulelValue ) ) ( (lv_initAsg_24_0= ruleAssignment ) ) otherlv_25= ';' ( (lv_exp_26_0= ruleExpression ) ) otherlv_27= ';' ( (lv_inc_28_0= ruleFactor ) ) ( (lv_incAsg_29_0= ruleAssignment ) )? otherlv_30= ')' otherlv_31= '{' ( (lv_commands_32_0= ruleCommand ) )* otherlv_33= '}' )
                    {
                    // InternalC.g:708:3: ( () otherlv_21= 'for' otherlv_22= '(' ( (lv_init_23_0= rulelValue ) ) ( (lv_initAsg_24_0= ruleAssignment ) ) otherlv_25= ';' ( (lv_exp_26_0= ruleExpression ) ) otherlv_27= ';' ( (lv_inc_28_0= ruleFactor ) ) ( (lv_incAsg_29_0= ruleAssignment ) )? otherlv_30= ')' otherlv_31= '{' ( (lv_commands_32_0= ruleCommand ) )* otherlv_33= '}' )
                    // InternalC.g:709:4: () otherlv_21= 'for' otherlv_22= '(' ( (lv_init_23_0= rulelValue ) ) ( (lv_initAsg_24_0= ruleAssignment ) ) otherlv_25= ';' ( (lv_exp_26_0= ruleExpression ) ) otherlv_27= ';' ( (lv_inc_28_0= ruleFactor ) ) ( (lv_incAsg_29_0= ruleAssignment ) )? otherlv_30= ')' otherlv_31= '{' ( (lv_commands_32_0= ruleCommand ) )* otherlv_33= '}'
                    {
                    // InternalC.g:709:4: ()
                    // InternalC.g:710:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getForCmdAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_21=(Token)match(input,29,FOLLOW_6); 

                    				newLeafNode(otherlv_21, grammarAccess.getCommandAccess().getForKeyword_2_1());
                    			
                    otherlv_22=(Token)match(input,18,FOLLOW_18); 

                    				newLeafNode(otherlv_22, grammarAccess.getCommandAccess().getLeftParenthesisKeyword_2_2());
                    			
                    // InternalC.g:724:4: ( (lv_init_23_0= rulelValue ) )
                    // InternalC.g:725:5: (lv_init_23_0= rulelValue )
                    {
                    // InternalC.g:725:5: (lv_init_23_0= rulelValue )
                    // InternalC.g:726:6: lv_init_23_0= rulelValue
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getInitLValueParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_init_23_0=rulelValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						set(
                    							current,
                    							"init",
                    							lv_init_23_0,
                    							"com.poli.compilador.C.lValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalC.g:743:4: ( (lv_initAsg_24_0= ruleAssignment ) )
                    // InternalC.g:744:5: (lv_initAsg_24_0= ruleAssignment )
                    {
                    // InternalC.g:744:5: (lv_initAsg_24_0= ruleAssignment )
                    // InternalC.g:745:6: lv_initAsg_24_0= ruleAssignment
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getInitAsgAssignmentParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_initAsg_24_0=ruleAssignment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						set(
                    							current,
                    							"initAsg",
                    							lv_initAsg_24_0,
                    							"com.poli.compilador.C.Assignment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_25=(Token)match(input,25,FOLLOW_15); 

                    				newLeafNode(otherlv_25, grammarAccess.getCommandAccess().getSemicolonKeyword_2_5());
                    			
                    // InternalC.g:766:4: ( (lv_exp_26_0= ruleExpression ) )
                    // InternalC.g:767:5: (lv_exp_26_0= ruleExpression )
                    {
                    // InternalC.g:767:5: (lv_exp_26_0= ruleExpression )
                    // InternalC.g:768:6: lv_exp_26_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getExpExpressionParserRuleCall_2_6_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_exp_26_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_26_0,
                    							"com.poli.compilador.C.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_27=(Token)match(input,25,FOLLOW_15); 

                    				newLeafNode(otherlv_27, grammarAccess.getCommandAccess().getSemicolonKeyword_2_7());
                    			
                    // InternalC.g:789:4: ( (lv_inc_28_0= ruleFactor ) )
                    // InternalC.g:790:5: (lv_inc_28_0= ruleFactor )
                    {
                    // InternalC.g:790:5: (lv_inc_28_0= ruleFactor )
                    // InternalC.g:791:6: lv_inc_28_0= ruleFactor
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getIncFactorParserRuleCall_2_8_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_inc_28_0=ruleFactor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						set(
                    							current,
                    							"inc",
                    							lv_inc_28_0,
                    							"com.poli.compilador.C.Factor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalC.g:808:4: ( (lv_incAsg_29_0= ruleAssignment ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==38) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalC.g:809:5: (lv_incAsg_29_0= ruleAssignment )
                            {
                            // InternalC.g:809:5: (lv_incAsg_29_0= ruleAssignment )
                            // InternalC.g:810:6: lv_incAsg_29_0= ruleAssignment
                            {

                            						newCompositeNode(grammarAccess.getCommandAccess().getIncAsgAssignmentParserRuleCall_2_9_0());
                            					
                            pushFollow(FOLLOW_16);
                            lv_incAsg_29_0=ruleAssignment();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getCommandRule());
                            						}
                            						set(
                            							current,
                            							"incAsg",
                            							lv_incAsg_29_0,
                            							"com.poli.compilador.C.Assignment");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_30=(Token)match(input,20,FOLLOW_9); 

                    				newLeafNode(otherlv_30, grammarAccess.getCommandAccess().getRightParenthesisKeyword_2_10());
                    			
                    otherlv_31=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_31, grammarAccess.getCommandAccess().getLeftCurlyBracketKeyword_2_11());
                    			
                    // InternalC.g:835:4: ( (lv_commands_32_0= ruleCommand ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID||(LA15_0>=RULE_UO && LA15_0<=RULE_STRING)||LA15_0==18||(LA15_0>=23 && LA15_0<=24)||LA15_0==26||(LA15_0>=28 && LA15_0<=30)||(LA15_0>=33 && LA15_0<=37)||(LA15_0>=43 && LA15_0<=44)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalC.g:836:5: (lv_commands_32_0= ruleCommand )
                    	    {
                    	    // InternalC.g:836:5: (lv_commands_32_0= ruleCommand )
                    	    // InternalC.g:837:6: lv_commands_32_0= ruleCommand
                    	    {

                    	    						newCompositeNode(grammarAccess.getCommandAccess().getCommandsCommandParserRuleCall_2_12_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_commands_32_0=ruleCommand();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"commands",
                    	    							lv_commands_32_0,
                    	    							"com.poli.compilador.C.Command");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_33, grammarAccess.getCommandAccess().getRightCurlyBracketKeyword_2_13());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalC.g:860:3: ( () otherlv_35= 'switch' otherlv_36= '(' ( (lv_exp_37_0= ruleExpression ) ) otherlv_38= ')' otherlv_39= '{' ( (lv_cases_40_0= ruleCase ) )* (otherlv_41= 'default' otherlv_42= ':' ( (lv_defaultCmds_43_0= ruleCommand ) )* )? otherlv_44= '}' )
                    {
                    // InternalC.g:860:3: ( () otherlv_35= 'switch' otherlv_36= '(' ( (lv_exp_37_0= ruleExpression ) ) otherlv_38= ')' otherlv_39= '{' ( (lv_cases_40_0= ruleCase ) )* (otherlv_41= 'default' otherlv_42= ':' ( (lv_defaultCmds_43_0= ruleCommand ) )* )? otherlv_44= '}' )
                    // InternalC.g:861:4: () otherlv_35= 'switch' otherlv_36= '(' ( (lv_exp_37_0= ruleExpression ) ) otherlv_38= ')' otherlv_39= '{' ( (lv_cases_40_0= ruleCase ) )* (otherlv_41= 'default' otherlv_42= ':' ( (lv_defaultCmds_43_0= ruleCommand ) )* )? otherlv_44= '}'
                    {
                    // InternalC.g:861:4: ()
                    // InternalC.g:862:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getSwitchCmdAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_35=(Token)match(input,30,FOLLOW_6); 

                    				newLeafNode(otherlv_35, grammarAccess.getCommandAccess().getSwitchKeyword_3_1());
                    			
                    otherlv_36=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_36, grammarAccess.getCommandAccess().getLeftParenthesisKeyword_3_2());
                    			
                    // InternalC.g:876:4: ( (lv_exp_37_0= ruleExpression ) )
                    // InternalC.g:877:5: (lv_exp_37_0= ruleExpression )
                    {
                    // InternalC.g:877:5: (lv_exp_37_0= ruleExpression )
                    // InternalC.g:878:6: lv_exp_37_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getExpExpressionParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_exp_37_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_37_0,
                    							"com.poli.compilador.C.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_38=(Token)match(input,20,FOLLOW_9); 

                    				newLeafNode(otherlv_38, grammarAccess.getCommandAccess().getRightParenthesisKeyword_3_4());
                    			
                    otherlv_39=(Token)match(input,21,FOLLOW_21); 

                    				newLeafNode(otherlv_39, grammarAccess.getCommandAccess().getLeftCurlyBracketKeyword_3_5());
                    			
                    // InternalC.g:903:4: ( (lv_cases_40_0= ruleCase ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==42) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalC.g:904:5: (lv_cases_40_0= ruleCase )
                    	    {
                    	    // InternalC.g:904:5: (lv_cases_40_0= ruleCase )
                    	    // InternalC.g:905:6: lv_cases_40_0= ruleCase
                    	    {

                    	    						newCompositeNode(grammarAccess.getCommandAccess().getCasesCaseParserRuleCall_3_6_0());
                    	    					
                    	    pushFollow(FOLLOW_21);
                    	    lv_cases_40_0=ruleCase();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"cases",
                    	    							lv_cases_40_0,
                    	    							"com.poli.compilador.C.Case");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    // InternalC.g:922:4: (otherlv_41= 'default' otherlv_42= ':' ( (lv_defaultCmds_43_0= ruleCommand ) )* )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==31) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalC.g:923:5: otherlv_41= 'default' otherlv_42= ':' ( (lv_defaultCmds_43_0= ruleCommand ) )*
                            {
                            otherlv_41=(Token)match(input,31,FOLLOW_22); 

                            					newLeafNode(otherlv_41, grammarAccess.getCommandAccess().getDefaultKeyword_3_7_0());
                            				
                            otherlv_42=(Token)match(input,32,FOLLOW_10); 

                            					newLeafNode(otherlv_42, grammarAccess.getCommandAccess().getColonKeyword_3_7_1());
                            				
                            // InternalC.g:931:5: ( (lv_defaultCmds_43_0= ruleCommand ) )*
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==RULE_ID||(LA17_0>=RULE_UO && LA17_0<=RULE_STRING)||LA17_0==18||(LA17_0>=23 && LA17_0<=24)||LA17_0==26||(LA17_0>=28 && LA17_0<=30)||(LA17_0>=33 && LA17_0<=37)||(LA17_0>=43 && LA17_0<=44)) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // InternalC.g:932:6: (lv_defaultCmds_43_0= ruleCommand )
                            	    {
                            	    // InternalC.g:932:6: (lv_defaultCmds_43_0= ruleCommand )
                            	    // InternalC.g:933:7: lv_defaultCmds_43_0= ruleCommand
                            	    {

                            	    							newCompositeNode(grammarAccess.getCommandAccess().getDefaultCmdsCommandParserRuleCall_3_7_2_0());
                            	    						
                            	    pushFollow(FOLLOW_10);
                            	    lv_defaultCmds_43_0=ruleCommand();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getCommandRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"defaultCmds",
                            	    								lv_defaultCmds_43_0,
                            	    								"com.poli.compilador.C.Command");
                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop17;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_44=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_44, grammarAccess.getCommandAccess().getRightCurlyBracketKeyword_3_8());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalC.g:957:3: ( () otherlv_46= 'do' otherlv_47= '{' ( (lv_commands_48_0= ruleCommand ) )* otherlv_49= '}' otherlv_50= 'while' otherlv_51= '(' ( (lv_exp_52_0= ruleExpression ) ) otherlv_53= ')' otherlv_54= ';' )
                    {
                    // InternalC.g:957:3: ( () otherlv_46= 'do' otherlv_47= '{' ( (lv_commands_48_0= ruleCommand ) )* otherlv_49= '}' otherlv_50= 'while' otherlv_51= '(' ( (lv_exp_52_0= ruleExpression ) ) otherlv_53= ')' otherlv_54= ';' )
                    // InternalC.g:958:4: () otherlv_46= 'do' otherlv_47= '{' ( (lv_commands_48_0= ruleCommand ) )* otherlv_49= '}' otherlv_50= 'while' otherlv_51= '(' ( (lv_exp_52_0= ruleExpression ) ) otherlv_53= ')' otherlv_54= ';'
                    {
                    // InternalC.g:958:4: ()
                    // InternalC.g:959:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getDoWhileCmdAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_46=(Token)match(input,33,FOLLOW_9); 

                    				newLeafNode(otherlv_46, grammarAccess.getCommandAccess().getDoKeyword_4_1());
                    			
                    otherlv_47=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_47, grammarAccess.getCommandAccess().getLeftCurlyBracketKeyword_4_2());
                    			
                    // InternalC.g:973:4: ( (lv_commands_48_0= ruleCommand ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_ID||(LA19_0>=RULE_UO && LA19_0<=RULE_STRING)||LA19_0==18||(LA19_0>=23 && LA19_0<=24)||LA19_0==26||(LA19_0>=28 && LA19_0<=30)||(LA19_0>=33 && LA19_0<=37)||(LA19_0>=43 && LA19_0<=44)) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalC.g:974:5: (lv_commands_48_0= ruleCommand )
                    	    {
                    	    // InternalC.g:974:5: (lv_commands_48_0= ruleCommand )
                    	    // InternalC.g:975:6: lv_commands_48_0= ruleCommand
                    	    {

                    	    						newCompositeNode(grammarAccess.getCommandAccess().getCommandsCommandParserRuleCall_4_3_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_commands_48_0=ruleCommand();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"commands",
                    	    							lv_commands_48_0,
                    	    							"com.poli.compilador.C.Command");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_49=(Token)match(input,22,FOLLOW_23); 

                    				newLeafNode(otherlv_49, grammarAccess.getCommandAccess().getRightCurlyBracketKeyword_4_4());
                    			
                    otherlv_50=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_50, grammarAccess.getCommandAccess().getWhileKeyword_4_5());
                    			
                    otherlv_51=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_51, grammarAccess.getCommandAccess().getLeftParenthesisKeyword_4_6());
                    			
                    // InternalC.g:1004:4: ( (lv_exp_52_0= ruleExpression ) )
                    // InternalC.g:1005:5: (lv_exp_52_0= ruleExpression )
                    {
                    // InternalC.g:1005:5: (lv_exp_52_0= ruleExpression )
                    // InternalC.g:1006:6: lv_exp_52_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getExpExpressionParserRuleCall_4_7_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_exp_52_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_52_0,
                    							"com.poli.compilador.C.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_53=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_53, grammarAccess.getCommandAccess().getRightParenthesisKeyword_4_8());
                    			
                    otherlv_54=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_54, grammarAccess.getCommandAccess().getSemicolonKeyword_4_9());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalC.g:1033:3: ( () ( (lv_lval_56_0= ruleFactor ) ) ( (lv_asg_57_0= ruleAssignment ) )? otherlv_58= ';' )
                    {
                    // InternalC.g:1033:3: ( () ( (lv_lval_56_0= ruleFactor ) ) ( (lv_asg_57_0= ruleAssignment ) )? otherlv_58= ';' )
                    // InternalC.g:1034:4: () ( (lv_lval_56_0= ruleFactor ) ) ( (lv_asg_57_0= ruleAssignment ) )? otherlv_58= ';'
                    {
                    // InternalC.g:1034:4: ()
                    // InternalC.g:1035:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getVarCmdAction_5_0(),
                    						current);
                    				

                    }

                    // InternalC.g:1041:4: ( (lv_lval_56_0= ruleFactor ) )
                    // InternalC.g:1042:5: (lv_lval_56_0= ruleFactor )
                    {
                    // InternalC.g:1042:5: (lv_lval_56_0= ruleFactor )
                    // InternalC.g:1043:6: lv_lval_56_0= ruleFactor
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getLvalFactorParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_lval_56_0=ruleFactor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						set(
                    							current,
                    							"lval",
                    							lv_lval_56_0,
                    							"com.poli.compilador.C.Factor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalC.g:1060:4: ( (lv_asg_57_0= ruleAssignment ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==38) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalC.g:1061:5: (lv_asg_57_0= ruleAssignment )
                            {
                            // InternalC.g:1061:5: (lv_asg_57_0= ruleAssignment )
                            // InternalC.g:1062:6: lv_asg_57_0= ruleAssignment
                            {

                            						newCompositeNode(grammarAccess.getCommandAccess().getAsgAssignmentParserRuleCall_5_2_0());
                            					
                            pushFollow(FOLLOW_13);
                            lv_asg_57_0=ruleAssignment();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getCommandRule());
                            						}
                            						set(
                            							current,
                            							"asg",
                            							lv_asg_57_0,
                            							"com.poli.compilador.C.Assignment");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_58=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_58, grammarAccess.getCommandAccess().getSemicolonKeyword_5_3());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalC.g:1085:3: ( () otherlv_60= 'break' otherlv_61= ';' )
                    {
                    // InternalC.g:1085:3: ( () otherlv_60= 'break' otherlv_61= ';' )
                    // InternalC.g:1086:4: () otherlv_60= 'break' otherlv_61= ';'
                    {
                    // InternalC.g:1086:4: ()
                    // InternalC.g:1087:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getBreakCmdAction_6_0(),
                    						current);
                    				

                    }

                    otherlv_60=(Token)match(input,34,FOLLOW_13); 

                    				newLeafNode(otherlv_60, grammarAccess.getCommandAccess().getBreakKeyword_6_1());
                    			
                    otherlv_61=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_61, grammarAccess.getCommandAccess().getSemicolonKeyword_6_2());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalC.g:1103:3: ( () otherlv_63= 'continue' otherlv_64= ';' )
                    {
                    // InternalC.g:1103:3: ( () otherlv_63= 'continue' otherlv_64= ';' )
                    // InternalC.g:1104:4: () otherlv_63= 'continue' otherlv_64= ';'
                    {
                    // InternalC.g:1104:4: ()
                    // InternalC.g:1105:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getContinueCmdAction_7_0(),
                    						current);
                    				

                    }

                    otherlv_63=(Token)match(input,35,FOLLOW_13); 

                    				newLeafNode(otherlv_63, grammarAccess.getCommandAccess().getContinueKeyword_7_1());
                    			
                    otherlv_64=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_64, grammarAccess.getCommandAccess().getSemicolonKeyword_7_2());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalC.g:1121:3: ( () otherlv_66= 'return' ( (lv_exp_67_0= ruleExpression ) )? otherlv_68= ';' )
                    {
                    // InternalC.g:1121:3: ( () otherlv_66= 'return' ( (lv_exp_67_0= ruleExpression ) )? otherlv_68= ';' )
                    // InternalC.g:1122:4: () otherlv_66= 'return' ( (lv_exp_67_0= ruleExpression ) )? otherlv_68= ';'
                    {
                    // InternalC.g:1122:4: ()
                    // InternalC.g:1123:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getReturnCmdAction_8_0(),
                    						current);
                    				

                    }

                    otherlv_66=(Token)match(input,36,FOLLOW_24); 

                    				newLeafNode(otherlv_66, grammarAccess.getCommandAccess().getReturnKeyword_8_1());
                    			
                    // InternalC.g:1133:4: ( (lv_exp_67_0= ruleExpression ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_ID||LA21_0==RULE_UO||(LA21_0>=RULE_INT && LA21_0<=RULE_STRING)||LA21_0==18||LA21_0==23||(LA21_0>=43 && LA21_0<=44)) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalC.g:1134:5: (lv_exp_67_0= ruleExpression )
                            {
                            // InternalC.g:1134:5: (lv_exp_67_0= ruleExpression )
                            // InternalC.g:1135:6: lv_exp_67_0= ruleExpression
                            {

                            						newCompositeNode(grammarAccess.getCommandAccess().getExpExpressionParserRuleCall_8_2_0());
                            					
                            pushFollow(FOLLOW_13);
                            lv_exp_67_0=ruleExpression();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getCommandRule());
                            						}
                            						set(
                            							current,
                            							"exp",
                            							lv_exp_67_0,
                            							"com.poli.compilador.C.Expression");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_68=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_68, grammarAccess.getCommandAccess().getSemicolonKeyword_8_3());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalC.g:1158:3: ( () ( (lv_val_70_0= ruleDeclaration ) ) )
                    {
                    // InternalC.g:1158:3: ( () ( (lv_val_70_0= ruleDeclaration ) ) )
                    // InternalC.g:1159:4: () ( (lv_val_70_0= ruleDeclaration ) )
                    {
                    // InternalC.g:1159:4: ()
                    // InternalC.g:1160:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getDeclCmdAction_9_0(),
                    						current);
                    				

                    }

                    // InternalC.g:1166:4: ( (lv_val_70_0= ruleDeclaration ) )
                    // InternalC.g:1167:5: (lv_val_70_0= ruleDeclaration )
                    {
                    // InternalC.g:1167:5: (lv_val_70_0= ruleDeclaration )
                    // InternalC.g:1168:6: lv_val_70_0= ruleDeclaration
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getValDeclarationParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_val_70_0=ruleDeclaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						set(
                    							current,
                    							"val",
                    							lv_val_70_0,
                    							"com.poli.compilador.C.Declaration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalC.g:1187:3: ( () otherlv_72= 'print' otherlv_73= '(' ( (lv_exp_74_0= ruleExpression ) )? otherlv_75= ')' otherlv_76= ';' )
                    {
                    // InternalC.g:1187:3: ( () otherlv_72= 'print' otherlv_73= '(' ( (lv_exp_74_0= ruleExpression ) )? otherlv_75= ')' otherlv_76= ';' )
                    // InternalC.g:1188:4: () otherlv_72= 'print' otherlv_73= '(' ( (lv_exp_74_0= ruleExpression ) )? otherlv_75= ')' otherlv_76= ';'
                    {
                    // InternalC.g:1188:4: ()
                    // InternalC.g:1189:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getPrintCmdAction_10_0(),
                    						current);
                    				

                    }

                    otherlv_72=(Token)match(input,37,FOLLOW_6); 

                    				newLeafNode(otherlv_72, grammarAccess.getCommandAccess().getPrintKeyword_10_1());
                    			
                    otherlv_73=(Token)match(input,18,FOLLOW_25); 

                    				newLeafNode(otherlv_73, grammarAccess.getCommandAccess().getLeftParenthesisKeyword_10_2());
                    			
                    // InternalC.g:1203:4: ( (lv_exp_74_0= ruleExpression ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_ID||LA22_0==RULE_UO||(LA22_0>=RULE_INT && LA22_0<=RULE_STRING)||LA22_0==18||LA22_0==23||(LA22_0>=43 && LA22_0<=44)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalC.g:1204:5: (lv_exp_74_0= ruleExpression )
                            {
                            // InternalC.g:1204:5: (lv_exp_74_0= ruleExpression )
                            // InternalC.g:1205:6: lv_exp_74_0= ruleExpression
                            {

                            						newCompositeNode(grammarAccess.getCommandAccess().getExpExpressionParserRuleCall_10_3_0());
                            					
                            pushFollow(FOLLOW_16);
                            lv_exp_74_0=ruleExpression();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getCommandRule());
                            						}
                            						set(
                            							current,
                            							"exp",
                            							lv_exp_74_0,
                            							"com.poli.compilador.C.Expression");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_75=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_75, grammarAccess.getCommandAccess().getRightParenthesisKeyword_10_4());
                    			
                    otherlv_76=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_76, grammarAccess.getCommandAccess().getSemicolonKeyword_10_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleArgument"
    // InternalC.g:1235:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalC.g:1235:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalC.g:1236:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalC.g:1242:1: ruleArgument returns [EObject current=null] : ( ( (lv_exp_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exp_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exp_0_0 = null;

        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalC.g:1248:2: ( ( ( (lv_exp_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exp_2_0= ruleExpression ) ) )* ) )
            // InternalC.g:1249:2: ( ( (lv_exp_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exp_2_0= ruleExpression ) ) )* )
            {
            // InternalC.g:1249:2: ( ( (lv_exp_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exp_2_0= ruleExpression ) ) )* )
            // InternalC.g:1250:3: ( (lv_exp_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exp_2_0= ruleExpression ) ) )*
            {
            // InternalC.g:1250:3: ( (lv_exp_0_0= ruleExpression ) )
            // InternalC.g:1251:4: (lv_exp_0_0= ruleExpression )
            {
            // InternalC.g:1251:4: (lv_exp_0_0= ruleExpression )
            // InternalC.g:1252:5: lv_exp_0_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getArgumentAccess().getExpExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
            lv_exp_0_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArgumentRule());
            					}
            					add(
            						current,
            						"exp",
            						lv_exp_0_0,
            						"com.poli.compilador.C.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalC.g:1269:3: (otherlv_1= ',' ( (lv_exp_2_0= ruleExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==19) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalC.g:1270:4: otherlv_1= ',' ( (lv_exp_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_15); 

            	    				newLeafNode(otherlv_1, grammarAccess.getArgumentAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalC.g:1274:4: ( (lv_exp_2_0= ruleExpression ) )
            	    // InternalC.g:1275:5: (lv_exp_2_0= ruleExpression )
            	    {
            	    // InternalC.g:1275:5: (lv_exp_2_0= ruleExpression )
            	    // InternalC.g:1276:6: lv_exp_2_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getArgumentAccess().getExpExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_exp_2_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getArgumentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"exp",
            	    							lv_exp_2_0,
            	    							"com.poli.compilador.C.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleAssignment"
    // InternalC.g:1298:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalC.g:1298:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalC.g:1299:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalC.g:1305:1: ruleAssignment returns [EObject current=null] : (otherlv_0= '=' ( (lv_exp_1_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalC.g:1311:2: ( (otherlv_0= '=' ( (lv_exp_1_0= ruleExpression ) ) ) )
            // InternalC.g:1312:2: (otherlv_0= '=' ( (lv_exp_1_0= ruleExpression ) ) )
            {
            // InternalC.g:1312:2: (otherlv_0= '=' ( (lv_exp_1_0= ruleExpression ) ) )
            // InternalC.g:1313:3: otherlv_0= '=' ( (lv_exp_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_0());
            		
            // InternalC.g:1317:3: ( (lv_exp_1_0= ruleExpression ) )
            // InternalC.g:1318:4: (lv_exp_1_0= ruleExpression )
            {
            // InternalC.g:1318:4: (lv_exp_1_0= ruleExpression )
            // InternalC.g:1319:5: lv_exp_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getExpExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"com.poli.compilador.C.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleExpression"
    // InternalC.g:1340:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalC.g:1340:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalC.g:1341:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalC.g:1347:1: ruleExpression returns [EObject current=null] : (this_RelExp_0= ruleRelExp ( () ( (lv_op_2_0= RULE_LO ) ) ( (lv_args_3_0= ruleRelExp ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_RelExp_0 = null;

        EObject lv_args_3_0 = null;



        	enterRule();

        try {
            // InternalC.g:1353:2: ( (this_RelExp_0= ruleRelExp ( () ( (lv_op_2_0= RULE_LO ) ) ( (lv_args_3_0= ruleRelExp ) ) )* ) )
            // InternalC.g:1354:2: (this_RelExp_0= ruleRelExp ( () ( (lv_op_2_0= RULE_LO ) ) ( (lv_args_3_0= ruleRelExp ) ) )* )
            {
            // InternalC.g:1354:2: (this_RelExp_0= ruleRelExp ( () ( (lv_op_2_0= RULE_LO ) ) ( (lv_args_3_0= ruleRelExp ) ) )* )
            // InternalC.g:1355:3: this_RelExp_0= ruleRelExp ( () ( (lv_op_2_0= RULE_LO ) ) ( (lv_args_3_0= ruleRelExp ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getRelExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_RelExp_0=ruleRelExp();

            state._fsp--;


            			current = this_RelExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalC.g:1363:3: ( () ( (lv_op_2_0= RULE_LO ) ) ( (lv_args_3_0= ruleRelExp ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_LO) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalC.g:1364:4: () ( (lv_op_2_0= RULE_LO ) ) ( (lv_args_3_0= ruleRelExp ) )
            	    {
            	    // InternalC.g:1364:4: ()
            	    // InternalC.g:1365:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getExpressionAccess().getLogicExpArgsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalC.g:1371:4: ( (lv_op_2_0= RULE_LO ) )
            	    // InternalC.g:1372:5: (lv_op_2_0= RULE_LO )
            	    {
            	    // InternalC.g:1372:5: (lv_op_2_0= RULE_LO )
            	    // InternalC.g:1373:6: lv_op_2_0= RULE_LO
            	    {
            	    lv_op_2_0=(Token)match(input,RULE_LO,FOLLOW_15); 

            	    						newLeafNode(lv_op_2_0, grammarAccess.getExpressionAccess().getOpLOTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getExpressionRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"com.poli.compilador.C.LO");
            	    					

            	    }


            	    }

            	    // InternalC.g:1389:4: ( (lv_args_3_0= ruleRelExp ) )
            	    // InternalC.g:1390:5: (lv_args_3_0= ruleRelExp )
            	    {
            	    // InternalC.g:1390:5: (lv_args_3_0= ruleRelExp )
            	    // InternalC.g:1391:6: lv_args_3_0= ruleRelExp
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getArgsRelExpParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_args_3_0=ruleRelExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"args",
            	    							lv_args_3_0,
            	    							"com.poli.compilador.C.RelExp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleRelExp"
    // InternalC.g:1413:1: entryRuleRelExp returns [EObject current=null] : iv_ruleRelExp= ruleRelExp EOF ;
    public final EObject entryRuleRelExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelExp = null;


        try {
            // InternalC.g:1413:47: (iv_ruleRelExp= ruleRelExp EOF )
            // InternalC.g:1414:2: iv_ruleRelExp= ruleRelExp EOF
            {
             newCompositeNode(grammarAccess.getRelExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelExp=ruleRelExp();

            state._fsp--;

             current =iv_ruleRelExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelExp"


    // $ANTLR start "ruleRelExp"
    // InternalC.g:1420:1: ruleRelExp returns [EObject current=null] : (this_ArithExp_0= ruleArithExp ( () ( (lv_op_2_0= RULE_RO ) ) ( (lv_args_3_0= ruleArithExp ) ) )* ) ;
    public final EObject ruleRelExp() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ArithExp_0 = null;

        EObject lv_args_3_0 = null;



        	enterRule();

        try {
            // InternalC.g:1426:2: ( (this_ArithExp_0= ruleArithExp ( () ( (lv_op_2_0= RULE_RO ) ) ( (lv_args_3_0= ruleArithExp ) ) )* ) )
            // InternalC.g:1427:2: (this_ArithExp_0= ruleArithExp ( () ( (lv_op_2_0= RULE_RO ) ) ( (lv_args_3_0= ruleArithExp ) ) )* )
            {
            // InternalC.g:1427:2: (this_ArithExp_0= ruleArithExp ( () ( (lv_op_2_0= RULE_RO ) ) ( (lv_args_3_0= ruleArithExp ) ) )* )
            // InternalC.g:1428:3: this_ArithExp_0= ruleArithExp ( () ( (lv_op_2_0= RULE_RO ) ) ( (lv_args_3_0= ruleArithExp ) ) )*
            {

            			newCompositeNode(grammarAccess.getRelExpAccess().getArithExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_ArithExp_0=ruleArithExp();

            state._fsp--;


            			current = this_ArithExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalC.g:1436:3: ( () ( (lv_op_2_0= RULE_RO ) ) ( (lv_args_3_0= ruleArithExp ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_RO) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalC.g:1437:4: () ( (lv_op_2_0= RULE_RO ) ) ( (lv_args_3_0= ruleArithExp ) )
            	    {
            	    // InternalC.g:1437:4: ()
            	    // InternalC.g:1438:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getRelExpAccess().getRelExpArgsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalC.g:1444:4: ( (lv_op_2_0= RULE_RO ) )
            	    // InternalC.g:1445:5: (lv_op_2_0= RULE_RO )
            	    {
            	    // InternalC.g:1445:5: (lv_op_2_0= RULE_RO )
            	    // InternalC.g:1446:6: lv_op_2_0= RULE_RO
            	    {
            	    lv_op_2_0=(Token)match(input,RULE_RO,FOLLOW_15); 

            	    						newLeafNode(lv_op_2_0, grammarAccess.getRelExpAccess().getOpROTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRelExpRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"com.poli.compilador.C.RO");
            	    					

            	    }


            	    }

            	    // InternalC.g:1462:4: ( (lv_args_3_0= ruleArithExp ) )
            	    // InternalC.g:1463:5: (lv_args_3_0= ruleArithExp )
            	    {
            	    // InternalC.g:1463:5: (lv_args_3_0= ruleArithExp )
            	    // InternalC.g:1464:6: lv_args_3_0= ruleArithExp
            	    {

            	    						newCompositeNode(grammarAccess.getRelExpAccess().getArgsArithExpParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_args_3_0=ruleArithExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRelExpRule());
            	    						}
            	    						add(
            	    							current,
            	    							"args",
            	    							lv_args_3_0,
            	    							"com.poli.compilador.C.ArithExp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelExp"


    // $ANTLR start "entryRuleArithExp"
    // InternalC.g:1486:1: entryRuleArithExp returns [EObject current=null] : iv_ruleArithExp= ruleArithExp EOF ;
    public final EObject entryRuleArithExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithExp = null;


        try {
            // InternalC.g:1486:49: (iv_ruleArithExp= ruleArithExp EOF )
            // InternalC.g:1487:2: iv_ruleArithExp= ruleArithExp EOF
            {
             newCompositeNode(grammarAccess.getArithExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArithExp=ruleArithExp();

            state._fsp--;

             current =iv_ruleArithExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArithExp"


    // $ANTLR start "ruleArithExp"
    // InternalC.g:1493:1: ruleArithExp returns [EObject current=null] : (this_Term_0= ruleTerm ( () ( (lv_op_2_0= RULE_AO1 ) ) ( (lv_args_3_0= ruleTerm ) ) )* ) ;
    public final EObject ruleArithExp() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Term_0 = null;

        EObject lv_args_3_0 = null;



        	enterRule();

        try {
            // InternalC.g:1499:2: ( (this_Term_0= ruleTerm ( () ( (lv_op_2_0= RULE_AO1 ) ) ( (lv_args_3_0= ruleTerm ) ) )* ) )
            // InternalC.g:1500:2: (this_Term_0= ruleTerm ( () ( (lv_op_2_0= RULE_AO1 ) ) ( (lv_args_3_0= ruleTerm ) ) )* )
            {
            // InternalC.g:1500:2: (this_Term_0= ruleTerm ( () ( (lv_op_2_0= RULE_AO1 ) ) ( (lv_args_3_0= ruleTerm ) ) )* )
            // InternalC.g:1501:3: this_Term_0= ruleTerm ( () ( (lv_op_2_0= RULE_AO1 ) ) ( (lv_args_3_0= ruleTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getArithExpAccess().getTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_Term_0=ruleTerm();

            state._fsp--;


            			current = this_Term_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalC.g:1509:3: ( () ( (lv_op_2_0= RULE_AO1 ) ) ( (lv_args_3_0= ruleTerm ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_AO1) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalC.g:1510:4: () ( (lv_op_2_0= RULE_AO1 ) ) ( (lv_args_3_0= ruleTerm ) )
            	    {
            	    // InternalC.g:1510:4: ()
            	    // InternalC.g:1511:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getArithExpAccess().getArithExpArgsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalC.g:1517:4: ( (lv_op_2_0= RULE_AO1 ) )
            	    // InternalC.g:1518:5: (lv_op_2_0= RULE_AO1 )
            	    {
            	    // InternalC.g:1518:5: (lv_op_2_0= RULE_AO1 )
            	    // InternalC.g:1519:6: lv_op_2_0= RULE_AO1
            	    {
            	    lv_op_2_0=(Token)match(input,RULE_AO1,FOLLOW_15); 

            	    						newLeafNode(lv_op_2_0, grammarAccess.getArithExpAccess().getOpAO1TerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getArithExpRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"com.poli.compilador.C.AO1");
            	    					

            	    }


            	    }

            	    // InternalC.g:1535:4: ( (lv_args_3_0= ruleTerm ) )
            	    // InternalC.g:1536:5: (lv_args_3_0= ruleTerm )
            	    {
            	    // InternalC.g:1536:5: (lv_args_3_0= ruleTerm )
            	    // InternalC.g:1537:6: lv_args_3_0= ruleTerm
            	    {

            	    						newCompositeNode(grammarAccess.getArithExpAccess().getArgsTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_args_3_0=ruleTerm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getArithExpRule());
            	    						}
            	    						add(
            	    							current,
            	    							"args",
            	    							lv_args_3_0,
            	    							"com.poli.compilador.C.Term");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithExp"


    // $ANTLR start "entryRuleTerm"
    // InternalC.g:1559:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalC.g:1559:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalC.g:1560:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalC.g:1566:1: ruleTerm returns [EObject current=null] : (this_Factor_0= ruleFactor ( () ( (lv_op_2_0= RULE_AO2 ) ) ( (lv_args_3_0= ruleFactor ) ) )* ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Factor_0 = null;

        EObject lv_args_3_0 = null;



        	enterRule();

        try {
            // InternalC.g:1572:2: ( (this_Factor_0= ruleFactor ( () ( (lv_op_2_0= RULE_AO2 ) ) ( (lv_args_3_0= ruleFactor ) ) )* ) )
            // InternalC.g:1573:2: (this_Factor_0= ruleFactor ( () ( (lv_op_2_0= RULE_AO2 ) ) ( (lv_args_3_0= ruleFactor ) ) )* )
            {
            // InternalC.g:1573:2: (this_Factor_0= ruleFactor ( () ( (lv_op_2_0= RULE_AO2 ) ) ( (lv_args_3_0= ruleFactor ) ) )* )
            // InternalC.g:1574:3: this_Factor_0= ruleFactor ( () ( (lv_op_2_0= RULE_AO2 ) ) ( (lv_args_3_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalC.g:1582:3: ( () ( (lv_op_2_0= RULE_AO2 ) ) ( (lv_args_3_0= ruleFactor ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_AO2) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalC.g:1583:4: () ( (lv_op_2_0= RULE_AO2 ) ) ( (lv_args_3_0= ruleFactor ) )
            	    {
            	    // InternalC.g:1583:4: ()
            	    // InternalC.g:1584:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getTermAccess().getTermArgsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalC.g:1590:4: ( (lv_op_2_0= RULE_AO2 ) )
            	    // InternalC.g:1591:5: (lv_op_2_0= RULE_AO2 )
            	    {
            	    // InternalC.g:1591:5: (lv_op_2_0= RULE_AO2 )
            	    // InternalC.g:1592:6: lv_op_2_0= RULE_AO2
            	    {
            	    lv_op_2_0=(Token)match(input,RULE_AO2,FOLLOW_15); 

            	    						newLeafNode(lv_op_2_0, grammarAccess.getTermAccess().getOpAO2TerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTermRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"com.poli.compilador.C.AO2");
            	    					

            	    }


            	    }

            	    // InternalC.g:1608:4: ( (lv_args_3_0= ruleFactor ) )
            	    // InternalC.g:1609:5: (lv_args_3_0= ruleFactor )
            	    {
            	    // InternalC.g:1609:5: (lv_args_3_0= ruleFactor )
            	    // InternalC.g:1610:6: lv_args_3_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getTermAccess().getArgsFactorParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_args_3_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTermRule());
            	    						}
            	    						add(
            	    							current,
            	    							"args",
            	    							lv_args_3_0,
            	    							"com.poli.compilador.C.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleFactor"
    // InternalC.g:1632:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalC.g:1632:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalC.g:1633:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalC.g:1639:1: ruleFactor returns [EObject current=null] : ( (this_Atom_0= ruleAtom ( () ( (lv_uo_2_0= RULE_UO ) ) )? ) | ( () ( (lv_uo_4_0= RULE_UO ) ) ( (lv_arg_5_0= ruleAtom ) ) ) ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token lv_uo_2_0=null;
        Token lv_uo_4_0=null;
        EObject this_Atom_0 = null;

        EObject lv_arg_5_0 = null;



        	enterRule();

        try {
            // InternalC.g:1645:2: ( ( (this_Atom_0= ruleAtom ( () ( (lv_uo_2_0= RULE_UO ) ) )? ) | ( () ( (lv_uo_4_0= RULE_UO ) ) ( (lv_arg_5_0= ruleAtom ) ) ) ) )
            // InternalC.g:1646:2: ( (this_Atom_0= ruleAtom ( () ( (lv_uo_2_0= RULE_UO ) ) )? ) | ( () ( (lv_uo_4_0= RULE_UO ) ) ( (lv_arg_5_0= ruleAtom ) ) ) )
            {
            // InternalC.g:1646:2: ( (this_Atom_0= ruleAtom ( () ( (lv_uo_2_0= RULE_UO ) ) )? ) | ( () ( (lv_uo_4_0= RULE_UO ) ) ( (lv_arg_5_0= ruleAtom ) ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID||(LA30_0>=RULE_INT && LA30_0<=RULE_STRING)||LA30_0==18||LA30_0==23||(LA30_0>=43 && LA30_0<=44)) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_UO) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalC.g:1647:3: (this_Atom_0= ruleAtom ( () ( (lv_uo_2_0= RULE_UO ) ) )? )
                    {
                    // InternalC.g:1647:3: (this_Atom_0= ruleAtom ( () ( (lv_uo_2_0= RULE_UO ) ) )? )
                    // InternalC.g:1648:4: this_Atom_0= ruleAtom ( () ( (lv_uo_2_0= RULE_UO ) ) )?
                    {

                    				newCompositeNode(grammarAccess.getFactorAccess().getAtomParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_31);
                    this_Atom_0=ruleAtom();

                    state._fsp--;


                    				current = this_Atom_0;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalC.g:1656:4: ( () ( (lv_uo_2_0= RULE_UO ) ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==RULE_UO) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalC.g:1657:5: () ( (lv_uo_2_0= RULE_UO ) )
                            {
                            // InternalC.g:1657:5: ()
                            // InternalC.g:1658:6: 
                            {

                            						current = forceCreateModelElementAndSet(
                            							grammarAccess.getFactorAccess().getPostfixOpArgAction_0_1_0(),
                            							current);
                            					

                            }

                            // InternalC.g:1664:5: ( (lv_uo_2_0= RULE_UO ) )
                            // InternalC.g:1665:6: (lv_uo_2_0= RULE_UO )
                            {
                            // InternalC.g:1665:6: (lv_uo_2_0= RULE_UO )
                            // InternalC.g:1666:7: lv_uo_2_0= RULE_UO
                            {
                            lv_uo_2_0=(Token)match(input,RULE_UO,FOLLOW_2); 

                            							newLeafNode(lv_uo_2_0, grammarAccess.getFactorAccess().getUoUOTerminalRuleCall_0_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFactorRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"uo",
                            								lv_uo_2_0,
                            								"com.poli.compilador.C.UO");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalC.g:1685:3: ( () ( (lv_uo_4_0= RULE_UO ) ) ( (lv_arg_5_0= ruleAtom ) ) )
                    {
                    // InternalC.g:1685:3: ( () ( (lv_uo_4_0= RULE_UO ) ) ( (lv_arg_5_0= ruleAtom ) ) )
                    // InternalC.g:1686:4: () ( (lv_uo_4_0= RULE_UO ) ) ( (lv_arg_5_0= ruleAtom ) )
                    {
                    // InternalC.g:1686:4: ()
                    // InternalC.g:1687:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFactorAccess().getPrefixOpAction_1_0(),
                    						current);
                    				

                    }

                    // InternalC.g:1693:4: ( (lv_uo_4_0= RULE_UO ) )
                    // InternalC.g:1694:5: (lv_uo_4_0= RULE_UO )
                    {
                    // InternalC.g:1694:5: (lv_uo_4_0= RULE_UO )
                    // InternalC.g:1695:6: lv_uo_4_0= RULE_UO
                    {
                    lv_uo_4_0=(Token)match(input,RULE_UO,FOLLOW_18); 

                    						newLeafNode(lv_uo_4_0, grammarAccess.getFactorAccess().getUoUOTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFactorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"uo",
                    							lv_uo_4_0,
                    							"com.poli.compilador.C.UO");
                    					

                    }


                    }

                    // InternalC.g:1711:4: ( (lv_arg_5_0= ruleAtom ) )
                    // InternalC.g:1712:5: (lv_arg_5_0= ruleAtom )
                    {
                    // InternalC.g:1712:5: (lv_arg_5_0= ruleAtom )
                    // InternalC.g:1713:6: lv_arg_5_0= ruleAtom
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getArgAtomParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_arg_5_0=ruleAtom();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFactorRule());
                    						}
                    						set(
                    							current,
                    							"arg",
                    							lv_arg_5_0,
                    							"com.poli.compilador.C.Atom");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleAtom"
    // InternalC.g:1735:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalC.g:1735:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalC.g:1736:2: iv_ruleAtom= ruleAtom EOF
            {
             newCompositeNode(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtom=ruleAtom();

            state._fsp--;

             current =iv_ruleAtom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalC.g:1742:1: ruleAtom returns [EObject current=null] : (this_Literal_0= ruleLiteral | ( () otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' ) | this_lValue_5= rulelValue ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Literal_0 = null;

        EObject lv_exp_3_0 = null;

        EObject this_lValue_5 = null;



        	enterRule();

        try {
            // InternalC.g:1748:2: ( (this_Literal_0= ruleLiteral | ( () otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' ) | this_lValue_5= rulelValue ) )
            // InternalC.g:1749:2: (this_Literal_0= ruleLiteral | ( () otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' ) | this_lValue_5= rulelValue )
            {
            // InternalC.g:1749:2: (this_Literal_0= ruleLiteral | ( () otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' ) | this_lValue_5= rulelValue )
            int alt31=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
            case 43:
            case 44:
                {
                alt31=1;
                }
                break;
            case 18:
                {
                alt31=2;
                }
                break;
            case RULE_ID:
            case 23:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalC.g:1750:3: this_Literal_0= ruleLiteral
                    {

                    			newCompositeNode(grammarAccess.getAtomAccess().getLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Literal_0=ruleLiteral();

                    state._fsp--;


                    			current = this_Literal_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalC.g:1759:3: ( () otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' )
                    {
                    // InternalC.g:1759:3: ( () otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' )
                    // InternalC.g:1760:4: () otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')'
                    {
                    // InternalC.g:1760:4: ()
                    // InternalC.g:1761:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomAccess().getParentesesAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalC.g:1771:4: ( (lv_exp_3_0= ruleExpression ) )
                    // InternalC.g:1772:5: (lv_exp_3_0= ruleExpression )
                    {
                    // InternalC.g:1772:5: (lv_exp_3_0= ruleExpression )
                    // InternalC.g:1773:6: lv_exp_3_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getAtomAccess().getExpExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_exp_3_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_3_0,
                    							"com.poli.compilador.C.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalC.g:1796:3: this_lValue_5= rulelValue
                    {

                    			newCompositeNode(grammarAccess.getAtomAccess().getLValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_lValue_5=rulelValue();

                    state._fsp--;


                    			current = this_lValue_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRulelValue"
    // InternalC.g:1808:1: entryRulelValue returns [EObject current=null] : iv_rulelValue= rulelValue EOF ;
    public final EObject entryRulelValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelValue = null;


        try {
            // InternalC.g:1808:47: (iv_rulelValue= rulelValue EOF )
            // InternalC.g:1809:2: iv_rulelValue= rulelValue EOF
            {
             newCompositeNode(grammarAccess.getLValueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelValue=rulelValue();

            state._fsp--;

             current =iv_rulelValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelValue"


    // $ANTLR start "rulelValue"
    // InternalC.g:1815:1: rulelValue returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ( ( () otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) )? otherlv_5= ')' ) | ( () otherlv_7= '.' ( (lv_field_8_0= RULE_ID ) ) ) | ( () otherlv_10= '[' ( (lv_index_11_0= ruleExpression ) ) otherlv_12= ']' ) )* ) | this_PointerExp_13= rulePointerExp ) ;
    public final EObject rulelValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_field_8_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_arg_4_0 = null;

        EObject lv_index_11_0 = null;

        EObject this_PointerExp_13 = null;



        	enterRule();

        try {
            // InternalC.g:1821:2: ( ( ( () ( (otherlv_1= RULE_ID ) ) ( ( () otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) )? otherlv_5= ')' ) | ( () otherlv_7= '.' ( (lv_field_8_0= RULE_ID ) ) ) | ( () otherlv_10= '[' ( (lv_index_11_0= ruleExpression ) ) otherlv_12= ']' ) )* ) | this_PointerExp_13= rulePointerExp ) )
            // InternalC.g:1822:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( () otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) )? otherlv_5= ')' ) | ( () otherlv_7= '.' ( (lv_field_8_0= RULE_ID ) ) ) | ( () otherlv_10= '[' ( (lv_index_11_0= ruleExpression ) ) otherlv_12= ']' ) )* ) | this_PointerExp_13= rulePointerExp )
            {
            // InternalC.g:1822:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( () otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) )? otherlv_5= ')' ) | ( () otherlv_7= '.' ( (lv_field_8_0= RULE_ID ) ) ) | ( () otherlv_10= '[' ( (lv_index_11_0= ruleExpression ) ) otherlv_12= ']' ) )* ) | this_PointerExp_13= rulePointerExp )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            else if ( (LA34_0==23) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalC.g:1823:3: ( () ( (otherlv_1= RULE_ID ) ) ( ( () otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) )? otherlv_5= ')' ) | ( () otherlv_7= '.' ( (lv_field_8_0= RULE_ID ) ) ) | ( () otherlv_10= '[' ( (lv_index_11_0= ruleExpression ) ) otherlv_12= ']' ) )* )
                    {
                    // InternalC.g:1823:3: ( () ( (otherlv_1= RULE_ID ) ) ( ( () otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) )? otherlv_5= ')' ) | ( () otherlv_7= '.' ( (lv_field_8_0= RULE_ID ) ) ) | ( () otherlv_10= '[' ( (lv_index_11_0= ruleExpression ) ) otherlv_12= ']' ) )* )
                    // InternalC.g:1824:4: () ( (otherlv_1= RULE_ID ) ) ( ( () otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) )? otherlv_5= ')' ) | ( () otherlv_7= '.' ( (lv_field_8_0= RULE_ID ) ) ) | ( () otherlv_10= '[' ( (lv_index_11_0= ruleExpression ) ) otherlv_12= ']' ) )*
                    {
                    // InternalC.g:1824:4: ()
                    // InternalC.g:1825:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLValueAccess().getVarAction_0_0(),
                    						current);
                    				

                    }

                    // InternalC.g:1831:4: ( (otherlv_1= RULE_ID ) )
                    // InternalC.g:1832:5: (otherlv_1= RULE_ID )
                    {
                    // InternalC.g:1832:5: (otherlv_1= RULE_ID )
                    // InternalC.g:1833:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLValueRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_32); 

                    						newLeafNode(otherlv_1, grammarAccess.getLValueAccess().getValorDefinitionCrossReference_0_1_0());
                    					

                    }


                    }

                    // InternalC.g:1844:4: ( ( () otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) )? otherlv_5= ')' ) | ( () otherlv_7= '.' ( (lv_field_8_0= RULE_ID ) ) ) | ( () otherlv_10= '[' ( (lv_index_11_0= ruleExpression ) ) otherlv_12= ']' ) )*
                    loop33:
                    do {
                        int alt33=4;
                        switch ( input.LA(1) ) {
                        case 18:
                            {
                            alt33=1;
                            }
                            break;
                        case 39:
                            {
                            alt33=2;
                            }
                            break;
                        case 40:
                            {
                            alt33=3;
                            }
                            break;

                        }

                        switch (alt33) {
                    	case 1 :
                    	    // InternalC.g:1845:5: ( () otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) )? otherlv_5= ')' )
                    	    {
                    	    // InternalC.g:1845:5: ( () otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) )? otherlv_5= ')' )
                    	    // InternalC.g:1846:6: () otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) )? otherlv_5= ')'
                    	    {
                    	    // InternalC.g:1846:6: ()
                    	    // InternalC.g:1847:7: 
                    	    {

                    	    							current = forceCreateModelElementAndSet(
                    	    								grammarAccess.getLValueAccess().getFuncCallDefAction_0_2_0_0(),
                    	    								current);
                    	    						

                    	    }

                    	    otherlv_3=(Token)match(input,18,FOLLOW_25); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getLValueAccess().getLeftParenthesisKeyword_0_2_0_1());
                    	    					
                    	    // InternalC.g:1857:6: ( (lv_arg_4_0= ruleArgument ) )?
                    	    int alt32=2;
                    	    int LA32_0 = input.LA(1);

                    	    if ( (LA32_0==RULE_ID||LA32_0==RULE_UO||(LA32_0>=RULE_INT && LA32_0<=RULE_STRING)||LA32_0==18||LA32_0==23||(LA32_0>=43 && LA32_0<=44)) ) {
                    	        alt32=1;
                    	    }
                    	    switch (alt32) {
                    	        case 1 :
                    	            // InternalC.g:1858:7: (lv_arg_4_0= ruleArgument )
                    	            {
                    	            // InternalC.g:1858:7: (lv_arg_4_0= ruleArgument )
                    	            // InternalC.g:1859:8: lv_arg_4_0= ruleArgument
                    	            {

                    	            								newCompositeNode(grammarAccess.getLValueAccess().getArgArgumentParserRuleCall_0_2_0_2_0());
                    	            							
                    	            pushFollow(FOLLOW_16);
                    	            lv_arg_4_0=ruleArgument();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getLValueRule());
                    	            								}
                    	            								set(
                    	            									current,
                    	            									"arg",
                    	            									lv_arg_4_0,
                    	            									"com.poli.compilador.C.Argument");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    otherlv_5=(Token)match(input,20,FOLLOW_32); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getLValueAccess().getRightParenthesisKeyword_0_2_0_3());
                    	    					

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalC.g:1882:5: ( () otherlv_7= '.' ( (lv_field_8_0= RULE_ID ) ) )
                    	    {
                    	    // InternalC.g:1882:5: ( () otherlv_7= '.' ( (lv_field_8_0= RULE_ID ) ) )
                    	    // InternalC.g:1883:6: () otherlv_7= '.' ( (lv_field_8_0= RULE_ID ) )
                    	    {
                    	    // InternalC.g:1883:6: ()
                    	    // InternalC.g:1884:7: 
                    	    {

                    	    							current = forceCreateModelElementAndSet(
                    	    								grammarAccess.getLValueAccess().getFieldAccessObjAction_0_2_1_0(),
                    	    								current);
                    	    						

                    	    }

                    	    otherlv_7=(Token)match(input,39,FOLLOW_5); 

                    	    						newLeafNode(otherlv_7, grammarAccess.getLValueAccess().getFullStopKeyword_0_2_1_1());
                    	    					
                    	    // InternalC.g:1894:6: ( (lv_field_8_0= RULE_ID ) )
                    	    // InternalC.g:1895:7: (lv_field_8_0= RULE_ID )
                    	    {
                    	    // InternalC.g:1895:7: (lv_field_8_0= RULE_ID )
                    	    // InternalC.g:1896:8: lv_field_8_0= RULE_ID
                    	    {
                    	    lv_field_8_0=(Token)match(input,RULE_ID,FOLLOW_32); 

                    	    								newLeafNode(lv_field_8_0, grammarAccess.getLValueAccess().getFieldIDTerminalRuleCall_0_2_1_2_0());
                    	    							

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getLValueRule());
                    	    								}
                    	    								setWithLastConsumed(
                    	    									current,
                    	    									"field",
                    	    									lv_field_8_0,
                    	    									"org.eclipse.xtext.common.Terminals.ID");
                    	    							

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalC.g:1914:5: ( () otherlv_10= '[' ( (lv_index_11_0= ruleExpression ) ) otherlv_12= ']' )
                    	    {
                    	    // InternalC.g:1914:5: ( () otherlv_10= '[' ( (lv_index_11_0= ruleExpression ) ) otherlv_12= ']' )
                    	    // InternalC.g:1915:6: () otherlv_10= '[' ( (lv_index_11_0= ruleExpression ) ) otherlv_12= ']'
                    	    {
                    	    // InternalC.g:1915:6: ()
                    	    // InternalC.g:1916:7: 
                    	    {

                    	    							current = forceCreateModelElementAndSet(
                    	    								grammarAccess.getLValueAccess().getArrayAccessArrAction_0_2_2_0(),
                    	    								current);
                    	    						

                    	    }

                    	    otherlv_10=(Token)match(input,40,FOLLOW_15); 

                    	    						newLeafNode(otherlv_10, grammarAccess.getLValueAccess().getLeftSquareBracketKeyword_0_2_2_1());
                    	    					
                    	    // InternalC.g:1926:6: ( (lv_index_11_0= ruleExpression ) )
                    	    // InternalC.g:1927:7: (lv_index_11_0= ruleExpression )
                    	    {
                    	    // InternalC.g:1927:7: (lv_index_11_0= ruleExpression )
                    	    // InternalC.g:1928:8: lv_index_11_0= ruleExpression
                    	    {

                    	    								newCompositeNode(grammarAccess.getLValueAccess().getIndexExpressionParserRuleCall_0_2_2_2_0());
                    	    							
                    	    pushFollow(FOLLOW_33);
                    	    lv_index_11_0=ruleExpression();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getLValueRule());
                    	    								}
                    	    								set(
                    	    									current,
                    	    									"index",
                    	    									lv_index_11_0,
                    	    									"com.poli.compilador.C.Expression");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }

                    	    otherlv_12=(Token)match(input,41,FOLLOW_32); 

                    	    						newLeafNode(otherlv_12, grammarAccess.getLValueAccess().getRightSquareBracketKeyword_0_2_2_3());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalC.g:1953:3: this_PointerExp_13= rulePointerExp
                    {

                    			newCompositeNode(grammarAccess.getLValueAccess().getPointerExpParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PointerExp_13=rulePointerExp();

                    state._fsp--;


                    			current = this_PointerExp_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelValue"


    // $ANTLR start "entryRulePointerExp"
    // InternalC.g:1965:1: entryRulePointerExp returns [EObject current=null] : iv_rulePointerExp= rulePointerExp EOF ;
    public final EObject entryRulePointerExp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointerExp = null;


        try {
            // InternalC.g:1965:51: (iv_rulePointerExp= rulePointerExp EOF )
            // InternalC.g:1966:2: iv_rulePointerExp= rulePointerExp EOF
            {
             newCompositeNode(grammarAccess.getPointerExpRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePointerExp=rulePointerExp();

            state._fsp--;

             current =iv_rulePointerExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePointerExp"


    // $ANTLR start "rulePointerExp"
    // InternalC.g:1972:1: rulePointerExp returns [EObject current=null] : ( () otherlv_1= '**' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject rulePointerExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalC.g:1978:2: ( ( () otherlv_1= '**' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalC.g:1979:2: ( () otherlv_1= '**' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalC.g:1979:2: ( () otherlv_1= '**' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalC.g:1980:3: () otherlv_1= '**' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            // InternalC.g:1980:3: ()
            // InternalC.g:1981:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPointerExpAccess().getPointerExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getPointerExpAccess().getAsteriskAsteriskKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getPointerExpAccess().getLeftParenthesisKeyword_2());
            		
            // InternalC.g:1995:3: ( (lv_exp_3_0= ruleExpression ) )
            // InternalC.g:1996:4: (lv_exp_3_0= ruleExpression )
            {
            // InternalC.g:1996:4: (lv_exp_3_0= ruleExpression )
            // InternalC.g:1997:5: lv_exp_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getPointerExpAccess().getExpExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_exp_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPointerExpRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_3_0,
            						"com.poli.compilador.C.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPointerExpAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePointerExp"


    // $ANTLR start "entryRuleCase"
    // InternalC.g:2022:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // InternalC.g:2022:45: (iv_ruleCase= ruleCase EOF )
            // InternalC.g:2023:2: iv_ruleCase= ruleCase EOF
            {
             newCompositeNode(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCase=ruleCase();

            state._fsp--;

             current =iv_ruleCase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // InternalC.g:2029:1: ruleCase returns [EObject current=null] : (otherlv_0= 'case' ( (lv_val_1_0= ruleAtom ) ) otherlv_2= ':' ( (lv_commands_3_0= ruleCommand ) )* ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_val_1_0 = null;

        EObject lv_commands_3_0 = null;



        	enterRule();

        try {
            // InternalC.g:2035:2: ( (otherlv_0= 'case' ( (lv_val_1_0= ruleAtom ) ) otherlv_2= ':' ( (lv_commands_3_0= ruleCommand ) )* ) )
            // InternalC.g:2036:2: (otherlv_0= 'case' ( (lv_val_1_0= ruleAtom ) ) otherlv_2= ':' ( (lv_commands_3_0= ruleCommand ) )* )
            {
            // InternalC.g:2036:2: (otherlv_0= 'case' ( (lv_val_1_0= ruleAtom ) ) otherlv_2= ':' ( (lv_commands_3_0= ruleCommand ) )* )
            // InternalC.g:2037:3: otherlv_0= 'case' ( (lv_val_1_0= ruleAtom ) ) otherlv_2= ':' ( (lv_commands_3_0= ruleCommand ) )*
            {
            otherlv_0=(Token)match(input,42,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getCaseAccess().getCaseKeyword_0());
            		
            // InternalC.g:2041:3: ( (lv_val_1_0= ruleAtom ) )
            // InternalC.g:2042:4: (lv_val_1_0= ruleAtom )
            {
            // InternalC.g:2042:4: (lv_val_1_0= ruleAtom )
            // InternalC.g:2043:5: lv_val_1_0= ruleAtom
            {

            					newCompositeNode(grammarAccess.getCaseAccess().getValAtomParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_val_1_0=ruleAtom();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCaseRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_1_0,
            						"com.poli.compilador.C.Atom");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getCaseAccess().getColonKeyword_2());
            		
            // InternalC.g:2064:3: ( (lv_commands_3_0= ruleCommand ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID||(LA35_0>=RULE_UO && LA35_0<=RULE_STRING)||LA35_0==18||(LA35_0>=23 && LA35_0<=24)||LA35_0==26||(LA35_0>=28 && LA35_0<=30)||(LA35_0>=33 && LA35_0<=37)||(LA35_0>=43 && LA35_0<=44)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalC.g:2065:4: (lv_commands_3_0= ruleCommand )
            	    {
            	    // InternalC.g:2065:4: (lv_commands_3_0= ruleCommand )
            	    // InternalC.g:2066:5: lv_commands_3_0= ruleCommand
            	    {

            	    					newCompositeNode(grammarAccess.getCaseAccess().getCommandsCommandParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_34);
            	    lv_commands_3_0=ruleCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCaseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"commands",
            	    						lv_commands_3_0,
            	    						"com.poli.compilador.C.Command");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleType"
    // InternalC.g:2087:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalC.g:2087:45: (iv_ruleType= ruleType EOF )
            // InternalC.g:2088:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalC.g:2094:1: ruleType returns [EObject current=null] : ( ( (lv_tipo_0_0= RULE_TYPELIT ) ) (otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' )? ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_tipo_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalC.g:2100:2: ( ( ( (lv_tipo_0_0= RULE_TYPELIT ) ) (otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' )? ) )
            // InternalC.g:2101:2: ( ( (lv_tipo_0_0= RULE_TYPELIT ) ) (otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' )? )
            {
            // InternalC.g:2101:2: ( ( (lv_tipo_0_0= RULE_TYPELIT ) ) (otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' )? )
            // InternalC.g:2102:3: ( (lv_tipo_0_0= RULE_TYPELIT ) ) (otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' )?
            {
            // InternalC.g:2102:3: ( (lv_tipo_0_0= RULE_TYPELIT ) )
            // InternalC.g:2103:4: (lv_tipo_0_0= RULE_TYPELIT )
            {
            // InternalC.g:2103:4: (lv_tipo_0_0= RULE_TYPELIT )
            // InternalC.g:2104:5: lv_tipo_0_0= RULE_TYPELIT
            {
            lv_tipo_0_0=(Token)match(input,RULE_TYPELIT,FOLLOW_35); 

            					newLeafNode(lv_tipo_0_0, grammarAccess.getTypeAccess().getTipoTYPELITTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tipo",
            						lv_tipo_0_0,
            						"com.poli.compilador.C.TYPELIT");
            				

            }


            }

            // InternalC.g:2120:3: (otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==40) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalC.g:2121:4: otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_36); 

                    				newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalC.g:2125:4: ( (lv_exp_2_0= ruleExpression ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==RULE_ID||LA36_0==RULE_UO||(LA36_0>=RULE_INT && LA36_0<=RULE_STRING)||LA36_0==18||LA36_0==23||(LA36_0>=43 && LA36_0<=44)) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalC.g:2126:5: (lv_exp_2_0= ruleExpression )
                            {
                            // InternalC.g:2126:5: (lv_exp_2_0= ruleExpression )
                            // InternalC.g:2127:6: lv_exp_2_0= ruleExpression
                            {

                            						newCompositeNode(grammarAccess.getTypeAccess().getExpExpressionParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_33);
                            lv_exp_2_0=ruleExpression();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getTypeRule());
                            						}
                            						set(
                            							current,
                            							"exp",
                            							lv_exp_2_0,
                            							"com.poli.compilador.C.Expression");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,41,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleLiteral"
    // InternalC.g:2153:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalC.g:2153:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalC.g:2154:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalC.g:2160:1: ruleLiteral returns [EObject current=null] : ( ( () ( (lv_val_1_0= RULE_INT ) ) ) | ( () ( (lv_val_3_0= 'true' ) ) ) | ( () ( (lv_val_5_0= 'false' ) ) ) | ( () ( (lv_val_7_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_val_1_0=null;
        Token lv_val_3_0=null;
        Token lv_val_5_0=null;
        Token lv_val_7_0=null;


        	enterRule();

        try {
            // InternalC.g:2166:2: ( ( ( () ( (lv_val_1_0= RULE_INT ) ) ) | ( () ( (lv_val_3_0= 'true' ) ) ) | ( () ( (lv_val_5_0= 'false' ) ) ) | ( () ( (lv_val_7_0= RULE_STRING ) ) ) ) )
            // InternalC.g:2167:2: ( ( () ( (lv_val_1_0= RULE_INT ) ) ) | ( () ( (lv_val_3_0= 'true' ) ) ) | ( () ( (lv_val_5_0= 'false' ) ) ) | ( () ( (lv_val_7_0= RULE_STRING ) ) ) )
            {
            // InternalC.g:2167:2: ( ( () ( (lv_val_1_0= RULE_INT ) ) ) | ( () ( (lv_val_3_0= 'true' ) ) ) | ( () ( (lv_val_5_0= 'false' ) ) ) | ( () ( (lv_val_7_0= RULE_STRING ) ) ) )
            int alt38=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt38=1;
                }
                break;
            case 43:
                {
                alt38=2;
                }
                break;
            case 44:
                {
                alt38=3;
                }
                break;
            case RULE_STRING:
                {
                alt38=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalC.g:2168:3: ( () ( (lv_val_1_0= RULE_INT ) ) )
                    {
                    // InternalC.g:2168:3: ( () ( (lv_val_1_0= RULE_INT ) ) )
                    // InternalC.g:2169:4: () ( (lv_val_1_0= RULE_INT ) )
                    {
                    // InternalC.g:2169:4: ()
                    // InternalC.g:2170:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLiteralAccess().getIntLitAction_0_0(),
                    						current);
                    				

                    }

                    // InternalC.g:2176:4: ( (lv_val_1_0= RULE_INT ) )
                    // InternalC.g:2177:5: (lv_val_1_0= RULE_INT )
                    {
                    // InternalC.g:2177:5: (lv_val_1_0= RULE_INT )
                    // InternalC.g:2178:6: lv_val_1_0= RULE_INT
                    {
                    lv_val_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_val_1_0, grammarAccess.getLiteralAccess().getValINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLiteralRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"val",
                    							lv_val_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalC.g:2196:3: ( () ( (lv_val_3_0= 'true' ) ) )
                    {
                    // InternalC.g:2196:3: ( () ( (lv_val_3_0= 'true' ) ) )
                    // InternalC.g:2197:4: () ( (lv_val_3_0= 'true' ) )
                    {
                    // InternalC.g:2197:4: ()
                    // InternalC.g:2198:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLiteralAccess().getTrueLitAction_1_0(),
                    						current);
                    				

                    }

                    // InternalC.g:2204:4: ( (lv_val_3_0= 'true' ) )
                    // InternalC.g:2205:5: (lv_val_3_0= 'true' )
                    {
                    // InternalC.g:2205:5: (lv_val_3_0= 'true' )
                    // InternalC.g:2206:6: lv_val_3_0= 'true'
                    {
                    lv_val_3_0=(Token)match(input,43,FOLLOW_2); 

                    						newLeafNode(lv_val_3_0, grammarAccess.getLiteralAccess().getValTrueKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLiteralRule());
                    						}
                    						setWithLastConsumed(current, "val", lv_val_3_0, "true");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalC.g:2220:3: ( () ( (lv_val_5_0= 'false' ) ) )
                    {
                    // InternalC.g:2220:3: ( () ( (lv_val_5_0= 'false' ) ) )
                    // InternalC.g:2221:4: () ( (lv_val_5_0= 'false' ) )
                    {
                    // InternalC.g:2221:4: ()
                    // InternalC.g:2222:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLiteralAccess().getFalseLitAction_2_0(),
                    						current);
                    				

                    }

                    // InternalC.g:2228:4: ( (lv_val_5_0= 'false' ) )
                    // InternalC.g:2229:5: (lv_val_5_0= 'false' )
                    {
                    // InternalC.g:2229:5: (lv_val_5_0= 'false' )
                    // InternalC.g:2230:6: lv_val_5_0= 'false'
                    {
                    lv_val_5_0=(Token)match(input,44,FOLLOW_2); 

                    						newLeafNode(lv_val_5_0, grammarAccess.getLiteralAccess().getValFalseKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLiteralRule());
                    						}
                    						setWithLastConsumed(current, "val", lv_val_5_0, "false");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalC.g:2244:3: ( () ( (lv_val_7_0= RULE_STRING ) ) )
                    {
                    // InternalC.g:2244:3: ( () ( (lv_val_7_0= RULE_STRING ) ) )
                    // InternalC.g:2245:4: () ( (lv_val_7_0= RULE_STRING ) )
                    {
                    // InternalC.g:2245:4: ()
                    // InternalC.g:2246:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLiteralAccess().getStrLitAction_3_0(),
                    						current);
                    				

                    }

                    // InternalC.g:2252:4: ( (lv_val_7_0= RULE_STRING ) )
                    // InternalC.g:2253:5: (lv_val_7_0= RULE_STRING )
                    {
                    // InternalC.g:2253:5: (lv_val_7_0= RULE_STRING )
                    // InternalC.g:2254:6: lv_val_7_0= RULE_STRING
                    {
                    lv_val_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_val_7_0, grammarAccess.getLiteralAccess().getValSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLiteralRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"val",
                    							lv_val_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001020402L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000011A0400L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000183E75C61E10L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000004002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001420400L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000180000841A10L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000180000841810L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000040080400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000180002841A10L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000180000941A10L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000018000040002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000183E75861E12L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00001A0000841A10L});

}