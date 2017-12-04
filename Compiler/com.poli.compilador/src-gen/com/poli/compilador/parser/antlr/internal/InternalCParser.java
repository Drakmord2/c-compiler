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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_LO", "RULE_RO", "RULE_AO1", "RULE_AO2", "RULE_UO", "RULE_TYPELIT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "'('", "','", "')'", "'{'", "'}'", "'**'", "'struct'", "';'", "'if'", "'else'", "'while'", "'for'", "'switch'", "'default'", "':'", "'do'", "'break'", "'continue'", "'return'", "'printf'", "'='", "'.'", "'['", "']'", "'case'", "'true'", "'false'"
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
    // InternalC.g:152:1: ruleFunction returns [EObject current=null] : ( () otherlv_1= 'function' ( (lv_tipo_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_params_5_0= ruleIdDef ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleIdDef ) ) )* )? otherlv_8= ')' otherlv_9= '{' ( (lv_commands_10_0= ruleCommand ) )* otherlv_11= '}' ) ;
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
            // InternalC.g:158:2: ( ( () otherlv_1= 'function' ( (lv_tipo_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_params_5_0= ruleIdDef ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleIdDef ) ) )* )? otherlv_8= ')' otherlv_9= '{' ( (lv_commands_10_0= ruleCommand ) )* otherlv_11= '}' ) )
            // InternalC.g:159:2: ( () otherlv_1= 'function' ( (lv_tipo_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_params_5_0= ruleIdDef ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleIdDef ) ) )* )? otherlv_8= ')' otherlv_9= '{' ( (lv_commands_10_0= ruleCommand ) )* otherlv_11= '}' )
            {
            // InternalC.g:159:2: ( () otherlv_1= 'function' ( (lv_tipo_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_params_5_0= ruleIdDef ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleIdDef ) ) )* )? otherlv_8= ')' otherlv_9= '{' ( (lv_commands_10_0= ruleCommand ) )* otherlv_11= '}' )
            // InternalC.g:160:3: () otherlv_1= 'function' ( (lv_tipo_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_params_5_0= ruleIdDef ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleIdDef ) ) )* )? otherlv_8= ')' otherlv_9= '{' ( (lv_commands_10_0= ruleCommand ) )* otherlv_11= '}'
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
            		
            // InternalC.g:212:3: ( ( (lv_params_5_0= ruleIdDef ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleIdDef ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_TYPELIT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalC.g:213:4: ( (lv_params_5_0= ruleIdDef ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleIdDef ) ) )*
                    {
                    // InternalC.g:213:4: ( (lv_params_5_0= ruleIdDef ) )
                    // InternalC.g:214:5: (lv_params_5_0= ruleIdDef )
                    {
                    // InternalC.g:214:5: (lv_params_5_0= ruleIdDef )
                    // InternalC.g:215:6: lv_params_5_0= ruleIdDef
                    {

                    						newCompositeNode(grammarAccess.getFunctionAccess().getParamsIdDefParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_params_5_0=ruleIdDef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_5_0,
                    							"com.poli.compilador.C.IdDef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalC.g:232:4: (otherlv_6= ',' ( (lv_params_7_0= ruleIdDef ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==19) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalC.g:233:5: otherlv_6= ',' ( (lv_params_7_0= ruleIdDef ) )
                    	    {
                    	    otherlv_6=(Token)match(input,19,FOLLOW_4); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalC.g:237:5: ( (lv_params_7_0= ruleIdDef ) )
                    	    // InternalC.g:238:6: (lv_params_7_0= ruleIdDef )
                    	    {
                    	    // InternalC.g:238:6: (lv_params_7_0= ruleIdDef )
                    	    // InternalC.g:239:7: lv_params_7_0= ruleIdDef
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionAccess().getParamsIdDefParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_params_7_0=ruleIdDef();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_7_0,
                    	    								"com.poli.compilador.C.IdDef");
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


    // $ANTLR start "entryRuleIdDef"
    // InternalC.g:524:1: entryRuleIdDef returns [EObject current=null] : iv_ruleIdDef= ruleIdDef EOF ;
    public final EObject entryRuleIdDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdDef = null;


        try {
            // InternalC.g:524:46: (iv_ruleIdDef= ruleIdDef EOF )
            // InternalC.g:525:2: iv_ruleIdDef= ruleIdDef EOF
            {
             newCompositeNode(grammarAccess.getIdDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdDef=ruleIdDef();

            state._fsp--;

             current =iv_ruleIdDef; 
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
    // $ANTLR end "entryRuleIdDef"


    // $ANTLR start "ruleIdDef"
    // InternalC.g:531:1: ruleIdDef returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleType ) ) ( (lv_name_1_0= ruleVariable ) ) ) ;
    public final EObject ruleIdDef() throws RecognitionException {
        EObject current = null;

        EObject lv_tipo_0_0 = null;

        EObject lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalC.g:537:2: ( ( ( (lv_tipo_0_0= ruleType ) ) ( (lv_name_1_0= ruleVariable ) ) ) )
            // InternalC.g:538:2: ( ( (lv_tipo_0_0= ruleType ) ) ( (lv_name_1_0= ruleVariable ) ) )
            {
            // InternalC.g:538:2: ( ( (lv_tipo_0_0= ruleType ) ) ( (lv_name_1_0= ruleVariable ) ) )
            // InternalC.g:539:3: ( (lv_tipo_0_0= ruleType ) ) ( (lv_name_1_0= ruleVariable ) )
            {
            // InternalC.g:539:3: ( (lv_tipo_0_0= ruleType ) )
            // InternalC.g:540:4: (lv_tipo_0_0= ruleType )
            {
            // InternalC.g:540:4: (lv_tipo_0_0= ruleType )
            // InternalC.g:541:5: lv_tipo_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getIdDefAccess().getTipoTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_tipo_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIdDefRule());
            					}
            					set(
            						current,
            						"tipo",
            						lv_tipo_0_0,
            						"com.poli.compilador.C.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalC.g:558:3: ( (lv_name_1_0= ruleVariable ) )
            // InternalC.g:559:4: (lv_name_1_0= ruleVariable )
            {
            // InternalC.g:559:4: (lv_name_1_0= ruleVariable )
            // InternalC.g:560:5: lv_name_1_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getIdDefAccess().getNameVariableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIdDefRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.poli.compilador.C.Variable");
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
    // $ANTLR end "ruleIdDef"


    // $ANTLR start "entryRuleVariable"
    // InternalC.g:581:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalC.g:581:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalC.g:582:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalC.g:588:1: ruleVariable returns [EObject current=null] : ( ( () this_ID_1= RULE_ID ) | this_PointerExp_2= rulePointerExp ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token this_ID_1=null;
        EObject this_PointerExp_2 = null;



        	enterRule();

        try {
            // InternalC.g:594:2: ( ( ( () this_ID_1= RULE_ID ) | this_PointerExp_2= rulePointerExp ) )
            // InternalC.g:595:2: ( ( () this_ID_1= RULE_ID ) | this_PointerExp_2= rulePointerExp )
            {
            // InternalC.g:595:2: ( ( () this_ID_1= RULE_ID ) | this_PointerExp_2= rulePointerExp )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==23) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalC.g:596:3: ( () this_ID_1= RULE_ID )
                    {
                    // InternalC.g:596:3: ( () this_ID_1= RULE_ID )
                    // InternalC.g:597:4: () this_ID_1= RULE_ID
                    {
                    // InternalC.g:597:4: ()
                    // InternalC.g:598:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getVariableAccess().getVariableAction_0_0(),
                    						current);
                    				

                    }

                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    				newLeafNode(this_ID_1, grammarAccess.getVariableAccess().getIDTerminalRuleCall_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalC.g:610:3: this_PointerExp_2= rulePointerExp
                    {

                    			newCompositeNode(grammarAccess.getVariableAccess().getPointerExpParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PointerExp_2=rulePointerExp();

                    state._fsp--;


                    			current = this_PointerExp_2;
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleCommand"
    // InternalC.g:622:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalC.g:622:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalC.g:623:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalC.g:629:1: ruleCommand returns [EObject current=null] : ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_trueCommands_6_0= ruleCommand ) )* otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_falseCommands_10_0= ruleCommand ) )* otherlv_11= '}' )? ) | ( () otherlv_13= 'while' otherlv_14= '(' ( (lv_exp_15_0= ruleExpression ) ) otherlv_16= ')' otherlv_17= '{' ( (lv_commands_18_0= ruleCommand ) )* otherlv_19= '}' ) | ( () otherlv_21= 'for' otherlv_22= '(' ( (lv_init_23_0= rulelValue ) ) ( (lv_initAsg_24_0= ruleAssignment ) ) otherlv_25= ';' ( (lv_exp_26_0= ruleExpression ) ) otherlv_27= ';' ( (lv_inc_28_0= ruleFactor ) ) ( (lv_incAsg_29_0= ruleAssignment ) )? otherlv_30= ')' otherlv_31= '{' ( (lv_commands_32_0= ruleCommand ) )* otherlv_33= '}' ) | ( () otherlv_35= 'switch' otherlv_36= '(' ( (lv_exp_37_0= ruleExpression ) ) otherlv_38= ')' otherlv_39= '{' ( (lv_cases_40_0= ruleCase ) )* (otherlv_41= 'default' otherlv_42= ':' ( (lv_commands_43_0= ruleCommand ) )* )? otherlv_44= '}' ) | ( () otherlv_46= 'do' otherlv_47= '{' ( (lv_commands_48_0= ruleCommand ) )* otherlv_49= '}' otherlv_50= 'while' otherlv_51= '(' ( (lv_exp_52_0= ruleExpression ) ) otherlv_53= ')' otherlv_54= ';' ) | ( () ( (lv_lval_56_0= ruleFactor ) ) ( (lv_asg_57_0= ruleAssignment ) )? otherlv_58= ';' ) | ( () otherlv_60= 'break' otherlv_61= ';' ) | ( () otherlv_63= 'continue' otherlv_64= ';' ) | ( () otherlv_66= 'return' ( (lv_exp_67_0= ruleExpression ) )? otherlv_68= ';' ) | ( () ( (lv_val_70_0= ruleDeclaration ) ) ) | ( () otherlv_72= 'printf' otherlv_73= '(' ( (lv_exp_74_0= ruleExpression ) )? otherlv_75= ')' otherlv_76= ';' ) ) ;
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

        EObject lv_commands_43_0 = null;

        EObject lv_commands_48_0 = null;

        EObject lv_exp_52_0 = null;

        EObject lv_lval_56_0 = null;

        EObject lv_asg_57_0 = null;

        EObject lv_exp_67_0 = null;

        EObject lv_val_70_0 = null;

        EObject lv_exp_74_0 = null;



        	enterRule();

        try {
            // InternalC.g:635:2: ( ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_trueCommands_6_0= ruleCommand ) )* otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_falseCommands_10_0= ruleCommand ) )* otherlv_11= '}' )? ) | ( () otherlv_13= 'while' otherlv_14= '(' ( (lv_exp_15_0= ruleExpression ) ) otherlv_16= ')' otherlv_17= '{' ( (lv_commands_18_0= ruleCommand ) )* otherlv_19= '}' ) | ( () otherlv_21= 'for' otherlv_22= '(' ( (lv_init_23_0= rulelValue ) ) ( (lv_initAsg_24_0= ruleAssignment ) ) otherlv_25= ';' ( (lv_exp_26_0= ruleExpression ) ) otherlv_27= ';' ( (lv_inc_28_0= ruleFactor ) ) ( (lv_incAsg_29_0= ruleAssignment ) )? otherlv_30= ')' otherlv_31= '{' ( (lv_commands_32_0= ruleCommand ) )* otherlv_33= '}' ) | ( () otherlv_35= 'switch' otherlv_36= '(' ( (lv_exp_37_0= ruleExpression ) ) otherlv_38= ')' otherlv_39= '{' ( (lv_cases_40_0= ruleCase ) )* (otherlv_41= 'default' otherlv_42= ':' ( (lv_commands_43_0= ruleCommand ) )* )? otherlv_44= '}' ) | ( () otherlv_46= 'do' otherlv_47= '{' ( (lv_commands_48_0= ruleCommand ) )* otherlv_49= '}' otherlv_50= 'while' otherlv_51= '(' ( (lv_exp_52_0= ruleExpression ) ) otherlv_53= ')' otherlv_54= ';' ) | ( () ( (lv_lval_56_0= ruleFactor ) ) ( (lv_asg_57_0= ruleAssignment ) )? otherlv_58= ';' ) | ( () otherlv_60= 'break' otherlv_61= ';' ) | ( () otherlv_63= 'continue' otherlv_64= ';' ) | ( () otherlv_66= 'return' ( (lv_exp_67_0= ruleExpression ) )? otherlv_68= ';' ) | ( () ( (lv_val_70_0= ruleDeclaration ) ) ) | ( () otherlv_72= 'printf' otherlv_73= '(' ( (lv_exp_74_0= ruleExpression ) )? otherlv_75= ')' otherlv_76= ';' ) ) )
            // InternalC.g:636:2: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_trueCommands_6_0= ruleCommand ) )* otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_falseCommands_10_0= ruleCommand ) )* otherlv_11= '}' )? ) | ( () otherlv_13= 'while' otherlv_14= '(' ( (lv_exp_15_0= ruleExpression ) ) otherlv_16= ')' otherlv_17= '{' ( (lv_commands_18_0= ruleCommand ) )* otherlv_19= '}' ) | ( () otherlv_21= 'for' otherlv_22= '(' ( (lv_init_23_0= rulelValue ) ) ( (lv_initAsg_24_0= ruleAssignment ) ) otherlv_25= ';' ( (lv_exp_26_0= ruleExpression ) ) otherlv_27= ';' ( (lv_inc_28_0= ruleFactor ) ) ( (lv_incAsg_29_0= ruleAssignment ) )? otherlv_30= ')' otherlv_31= '{' ( (lv_commands_32_0= ruleCommand ) )* otherlv_33= '}' ) | ( () otherlv_35= 'switch' otherlv_36= '(' ( (lv_exp_37_0= ruleExpression ) ) otherlv_38= ')' otherlv_39= '{' ( (lv_cases_40_0= ruleCase ) )* (otherlv_41= 'default' otherlv_42= ':' ( (lv_commands_43_0= ruleCommand ) )* )? otherlv_44= '}' ) | ( () otherlv_46= 'do' otherlv_47= '{' ( (lv_commands_48_0= ruleCommand ) )* otherlv_49= '}' otherlv_50= 'while' otherlv_51= '(' ( (lv_exp_52_0= ruleExpression ) ) otherlv_53= ')' otherlv_54= ';' ) | ( () ( (lv_lval_56_0= ruleFactor ) ) ( (lv_asg_57_0= ruleAssignment ) )? otherlv_58= ';' ) | ( () otherlv_60= 'break' otherlv_61= ';' ) | ( () otherlv_63= 'continue' otherlv_64= ';' ) | ( () otherlv_66= 'return' ( (lv_exp_67_0= ruleExpression ) )? otherlv_68= ';' ) | ( () ( (lv_val_70_0= ruleDeclaration ) ) ) | ( () otherlv_72= 'printf' otherlv_73= '(' ( (lv_exp_74_0= ruleExpression ) )? otherlv_75= ')' otherlv_76= ';' ) )
            {
            // InternalC.g:636:2: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_trueCommands_6_0= ruleCommand ) )* otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_falseCommands_10_0= ruleCommand ) )* otherlv_11= '}' )? ) | ( () otherlv_13= 'while' otherlv_14= '(' ( (lv_exp_15_0= ruleExpression ) ) otherlv_16= ')' otherlv_17= '{' ( (lv_commands_18_0= ruleCommand ) )* otherlv_19= '}' ) | ( () otherlv_21= 'for' otherlv_22= '(' ( (lv_init_23_0= rulelValue ) ) ( (lv_initAsg_24_0= ruleAssignment ) ) otherlv_25= ';' ( (lv_exp_26_0= ruleExpression ) ) otherlv_27= ';' ( (lv_inc_28_0= ruleFactor ) ) ( (lv_incAsg_29_0= ruleAssignment ) )? otherlv_30= ')' otherlv_31= '{' ( (lv_commands_32_0= ruleCommand ) )* otherlv_33= '}' ) | ( () otherlv_35= 'switch' otherlv_36= '(' ( (lv_exp_37_0= ruleExpression ) ) otherlv_38= ')' otherlv_39= '{' ( (lv_cases_40_0= ruleCase ) )* (otherlv_41= 'default' otherlv_42= ':' ( (lv_commands_43_0= ruleCommand ) )* )? otherlv_44= '}' ) | ( () otherlv_46= 'do' otherlv_47= '{' ( (lv_commands_48_0= ruleCommand ) )* otherlv_49= '}' otherlv_50= 'while' otherlv_51= '(' ( (lv_exp_52_0= ruleExpression ) ) otherlv_53= ')' otherlv_54= ';' ) | ( () ( (lv_lval_56_0= ruleFactor ) ) ( (lv_asg_57_0= ruleAssignment ) )? otherlv_58= ';' ) | ( () otherlv_60= 'break' otherlv_61= ';' ) | ( () otherlv_63= 'continue' otherlv_64= ';' ) | ( () otherlv_66= 'return' ( (lv_exp_67_0= ruleExpression ) )? otherlv_68= ';' ) | ( () ( (lv_val_70_0= ruleDeclaration ) ) ) | ( () otherlv_72= 'printf' otherlv_73= '(' ( (lv_exp_74_0= ruleExpression ) )? otherlv_75= ')' otherlv_76= ';' ) )
            int alt24=11;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt24=1;
                }
                break;
            case 28:
                {
                alt24=2;
                }
                break;
            case 29:
                {
                alt24=3;
                }
                break;
            case 30:
                {
                alt24=4;
                }
                break;
            case 33:
                {
                alt24=5;
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
                alt24=6;
                }
                break;
            case 34:
                {
                alt24=7;
                }
                break;
            case 35:
                {
                alt24=8;
                }
                break;
            case 36:
                {
                alt24=9;
                }
                break;
            case RULE_TYPELIT:
            case 24:
                {
                alt24=10;
                }
                break;
            case 37:
                {
                alt24=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalC.g:637:3: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_trueCommands_6_0= ruleCommand ) )* otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_falseCommands_10_0= ruleCommand ) )* otherlv_11= '}' )? )
                    {
                    // InternalC.g:637:3: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_trueCommands_6_0= ruleCommand ) )* otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_falseCommands_10_0= ruleCommand ) )* otherlv_11= '}' )? )
                    // InternalC.g:638:4: () otherlv_1= 'if' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_trueCommands_6_0= ruleCommand ) )* otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_falseCommands_10_0= ruleCommand ) )* otherlv_11= '}' )?
                    {
                    // InternalC.g:638:4: ()
                    // InternalC.g:639:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getIfCmdAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,26,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getCommandAccess().getIfKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,18,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getCommandAccess().getLeftParenthesisKeyword_0_2());
                    			
                    // InternalC.g:653:4: ( (lv_exp_3_0= ruleExpression ) )
                    // InternalC.g:654:5: (lv_exp_3_0= ruleExpression )
                    {
                    // InternalC.g:654:5: (lv_exp_3_0= ruleExpression )
                    // InternalC.g:655:6: lv_exp_3_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getExpExpressionParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_17);
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
                    			
                    // InternalC.g:680:4: ( (lv_trueCommands_6_0= ruleCommand ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID||(LA11_0>=RULE_UO && LA11_0<=RULE_STRING)||LA11_0==18||(LA11_0>=23 && LA11_0<=24)||LA11_0==26||(LA11_0>=28 && LA11_0<=30)||(LA11_0>=33 && LA11_0<=37)||(LA11_0>=43 && LA11_0<=44)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalC.g:681:5: (lv_trueCommands_6_0= ruleCommand )
                    	    {
                    	    // InternalC.g:681:5: (lv_trueCommands_6_0= ruleCommand )
                    	    // InternalC.g:682:6: lv_trueCommands_6_0= ruleCommand
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
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_7, grammarAccess.getCommandAccess().getRightCurlyBracketKeyword_0_7());
                    			
                    // InternalC.g:703:4: (otherlv_8= 'else' otherlv_9= '{' ( (lv_falseCommands_10_0= ruleCommand ) )* otherlv_11= '}' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==27) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalC.g:704:5: otherlv_8= 'else' otherlv_9= '{' ( (lv_falseCommands_10_0= ruleCommand ) )* otherlv_11= '}'
                            {
                            otherlv_8=(Token)match(input,27,FOLLOW_9); 

                            					newLeafNode(otherlv_8, grammarAccess.getCommandAccess().getElseKeyword_0_8_0());
                            				
                            otherlv_9=(Token)match(input,21,FOLLOW_10); 

                            					newLeafNode(otherlv_9, grammarAccess.getCommandAccess().getLeftCurlyBracketKeyword_0_8_1());
                            				
                            // InternalC.g:712:5: ( (lv_falseCommands_10_0= ruleCommand ) )*
                            loop12:
                            do {
                                int alt12=2;
                                int LA12_0 = input.LA(1);

                                if ( (LA12_0==RULE_ID||(LA12_0>=RULE_UO && LA12_0<=RULE_STRING)||LA12_0==18||(LA12_0>=23 && LA12_0<=24)||LA12_0==26||(LA12_0>=28 && LA12_0<=30)||(LA12_0>=33 && LA12_0<=37)||(LA12_0>=43 && LA12_0<=44)) ) {
                                    alt12=1;
                                }


                                switch (alt12) {
                            	case 1 :
                            	    // InternalC.g:713:6: (lv_falseCommands_10_0= ruleCommand )
                            	    {
                            	    // InternalC.g:713:6: (lv_falseCommands_10_0= ruleCommand )
                            	    // InternalC.g:714:7: lv_falseCommands_10_0= ruleCommand
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
                            	    break loop12;
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
                    // InternalC.g:738:3: ( () otherlv_13= 'while' otherlv_14= '(' ( (lv_exp_15_0= ruleExpression ) ) otherlv_16= ')' otherlv_17= '{' ( (lv_commands_18_0= ruleCommand ) )* otherlv_19= '}' )
                    {
                    // InternalC.g:738:3: ( () otherlv_13= 'while' otherlv_14= '(' ( (lv_exp_15_0= ruleExpression ) ) otherlv_16= ')' otherlv_17= '{' ( (lv_commands_18_0= ruleCommand ) )* otherlv_19= '}' )
                    // InternalC.g:739:4: () otherlv_13= 'while' otherlv_14= '(' ( (lv_exp_15_0= ruleExpression ) ) otherlv_16= ')' otherlv_17= '{' ( (lv_commands_18_0= ruleCommand ) )* otherlv_19= '}'
                    {
                    // InternalC.g:739:4: ()
                    // InternalC.g:740:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getWhileCmdAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_13=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_13, grammarAccess.getCommandAccess().getWhileKeyword_1_1());
                    			
                    otherlv_14=(Token)match(input,18,FOLLOW_16); 

                    				newLeafNode(otherlv_14, grammarAccess.getCommandAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalC.g:754:4: ( (lv_exp_15_0= ruleExpression ) )
                    // InternalC.g:755:5: (lv_exp_15_0= ruleExpression )
                    {
                    // InternalC.g:755:5: (lv_exp_15_0= ruleExpression )
                    // InternalC.g:756:6: lv_exp_15_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getExpExpressionParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_17);
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
                    			
                    // InternalC.g:781:4: ( (lv_commands_18_0= ruleCommand ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_ID||(LA14_0>=RULE_UO && LA14_0<=RULE_STRING)||LA14_0==18||(LA14_0>=23 && LA14_0<=24)||LA14_0==26||(LA14_0>=28 && LA14_0<=30)||(LA14_0>=33 && LA14_0<=37)||(LA14_0>=43 && LA14_0<=44)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalC.g:782:5: (lv_commands_18_0= ruleCommand )
                    	    {
                    	    // InternalC.g:782:5: (lv_commands_18_0= ruleCommand )
                    	    // InternalC.g:783:6: lv_commands_18_0= ruleCommand
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
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_19, grammarAccess.getCommandAccess().getRightCurlyBracketKeyword_1_7());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalC.g:806:3: ( () otherlv_21= 'for' otherlv_22= '(' ( (lv_init_23_0= rulelValue ) ) ( (lv_initAsg_24_0= ruleAssignment ) ) otherlv_25= ';' ( (lv_exp_26_0= ruleExpression ) ) otherlv_27= ';' ( (lv_inc_28_0= ruleFactor ) ) ( (lv_incAsg_29_0= ruleAssignment ) )? otherlv_30= ')' otherlv_31= '{' ( (lv_commands_32_0= ruleCommand ) )* otherlv_33= '}' )
                    {
                    // InternalC.g:806:3: ( () otherlv_21= 'for' otherlv_22= '(' ( (lv_init_23_0= rulelValue ) ) ( (lv_initAsg_24_0= ruleAssignment ) ) otherlv_25= ';' ( (lv_exp_26_0= ruleExpression ) ) otherlv_27= ';' ( (lv_inc_28_0= ruleFactor ) ) ( (lv_incAsg_29_0= ruleAssignment ) )? otherlv_30= ')' otherlv_31= '{' ( (lv_commands_32_0= ruleCommand ) )* otherlv_33= '}' )
                    // InternalC.g:807:4: () otherlv_21= 'for' otherlv_22= '(' ( (lv_init_23_0= rulelValue ) ) ( (lv_initAsg_24_0= ruleAssignment ) ) otherlv_25= ';' ( (lv_exp_26_0= ruleExpression ) ) otherlv_27= ';' ( (lv_inc_28_0= ruleFactor ) ) ( (lv_incAsg_29_0= ruleAssignment ) )? otherlv_30= ')' otherlv_31= '{' ( (lv_commands_32_0= ruleCommand ) )* otherlv_33= '}'
                    {
                    // InternalC.g:807:4: ()
                    // InternalC.g:808:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getForCmdAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_21=(Token)match(input,29,FOLLOW_6); 

                    				newLeafNode(otherlv_21, grammarAccess.getCommandAccess().getForKeyword_2_1());
                    			
                    otherlv_22=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_22, grammarAccess.getCommandAccess().getLeftParenthesisKeyword_2_2());
                    			
                    // InternalC.g:822:4: ( (lv_init_23_0= rulelValue ) )
                    // InternalC.g:823:5: (lv_init_23_0= rulelValue )
                    {
                    // InternalC.g:823:5: (lv_init_23_0= rulelValue )
                    // InternalC.g:824:6: lv_init_23_0= rulelValue
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

                    // InternalC.g:841:4: ( (lv_initAsg_24_0= ruleAssignment ) )
                    // InternalC.g:842:5: (lv_initAsg_24_0= ruleAssignment )
                    {
                    // InternalC.g:842:5: (lv_initAsg_24_0= ruleAssignment )
                    // InternalC.g:843:6: lv_initAsg_24_0= ruleAssignment
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

                    otherlv_25=(Token)match(input,25,FOLLOW_16); 

                    				newLeafNode(otherlv_25, grammarAccess.getCommandAccess().getSemicolonKeyword_2_5());
                    			
                    // InternalC.g:864:4: ( (lv_exp_26_0= ruleExpression ) )
                    // InternalC.g:865:5: (lv_exp_26_0= ruleExpression )
                    {
                    // InternalC.g:865:5: (lv_exp_26_0= ruleExpression )
                    // InternalC.g:866:6: lv_exp_26_0= ruleExpression
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

                    otherlv_27=(Token)match(input,25,FOLLOW_16); 

                    				newLeafNode(otherlv_27, grammarAccess.getCommandAccess().getSemicolonKeyword_2_7());
                    			
                    // InternalC.g:887:4: ( (lv_inc_28_0= ruleFactor ) )
                    // InternalC.g:888:5: (lv_inc_28_0= ruleFactor )
                    {
                    // InternalC.g:888:5: (lv_inc_28_0= ruleFactor )
                    // InternalC.g:889:6: lv_inc_28_0= ruleFactor
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

                    // InternalC.g:906:4: ( (lv_incAsg_29_0= ruleAssignment ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==38) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalC.g:907:5: (lv_incAsg_29_0= ruleAssignment )
                            {
                            // InternalC.g:907:5: (lv_incAsg_29_0= ruleAssignment )
                            // InternalC.g:908:6: lv_incAsg_29_0= ruleAssignment
                            {

                            						newCompositeNode(grammarAccess.getCommandAccess().getIncAsgAssignmentParserRuleCall_2_9_0());
                            					
                            pushFollow(FOLLOW_17);
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
                    			
                    // InternalC.g:933:4: ( (lv_commands_32_0= ruleCommand ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_ID||(LA16_0>=RULE_UO && LA16_0<=RULE_STRING)||LA16_0==18||(LA16_0>=23 && LA16_0<=24)||LA16_0==26||(LA16_0>=28 && LA16_0<=30)||(LA16_0>=33 && LA16_0<=37)||(LA16_0>=43 && LA16_0<=44)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalC.g:934:5: (lv_commands_32_0= ruleCommand )
                    	    {
                    	    // InternalC.g:934:5: (lv_commands_32_0= ruleCommand )
                    	    // InternalC.g:935:6: lv_commands_32_0= ruleCommand
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
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_33, grammarAccess.getCommandAccess().getRightCurlyBracketKeyword_2_13());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalC.g:958:3: ( () otherlv_35= 'switch' otherlv_36= '(' ( (lv_exp_37_0= ruleExpression ) ) otherlv_38= ')' otherlv_39= '{' ( (lv_cases_40_0= ruleCase ) )* (otherlv_41= 'default' otherlv_42= ':' ( (lv_commands_43_0= ruleCommand ) )* )? otherlv_44= '}' )
                    {
                    // InternalC.g:958:3: ( () otherlv_35= 'switch' otherlv_36= '(' ( (lv_exp_37_0= ruleExpression ) ) otherlv_38= ')' otherlv_39= '{' ( (lv_cases_40_0= ruleCase ) )* (otherlv_41= 'default' otherlv_42= ':' ( (lv_commands_43_0= ruleCommand ) )* )? otherlv_44= '}' )
                    // InternalC.g:959:4: () otherlv_35= 'switch' otherlv_36= '(' ( (lv_exp_37_0= ruleExpression ) ) otherlv_38= ')' otherlv_39= '{' ( (lv_cases_40_0= ruleCase ) )* (otherlv_41= 'default' otherlv_42= ':' ( (lv_commands_43_0= ruleCommand ) )* )? otherlv_44= '}'
                    {
                    // InternalC.g:959:4: ()
                    // InternalC.g:960:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getSwitchCmdAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_35=(Token)match(input,30,FOLLOW_6); 

                    				newLeafNode(otherlv_35, grammarAccess.getCommandAccess().getSwitchKeyword_3_1());
                    			
                    otherlv_36=(Token)match(input,18,FOLLOW_16); 

                    				newLeafNode(otherlv_36, grammarAccess.getCommandAccess().getLeftParenthesisKeyword_3_2());
                    			
                    // InternalC.g:974:4: ( (lv_exp_37_0= ruleExpression ) )
                    // InternalC.g:975:5: (lv_exp_37_0= ruleExpression )
                    {
                    // InternalC.g:975:5: (lv_exp_37_0= ruleExpression )
                    // InternalC.g:976:6: lv_exp_37_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getExpExpressionParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_17);
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
                    			
                    // InternalC.g:1001:4: ( (lv_cases_40_0= ruleCase ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==42) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalC.g:1002:5: (lv_cases_40_0= ruleCase )
                    	    {
                    	    // InternalC.g:1002:5: (lv_cases_40_0= ruleCase )
                    	    // InternalC.g:1003:6: lv_cases_40_0= ruleCase
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
                    	    break loop17;
                        }
                    } while (true);

                    // InternalC.g:1020:4: (otherlv_41= 'default' otherlv_42= ':' ( (lv_commands_43_0= ruleCommand ) )* )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==31) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalC.g:1021:5: otherlv_41= 'default' otherlv_42= ':' ( (lv_commands_43_0= ruleCommand ) )*
                            {
                            otherlv_41=(Token)match(input,31,FOLLOW_22); 

                            					newLeafNode(otherlv_41, grammarAccess.getCommandAccess().getDefaultKeyword_3_7_0());
                            				
                            otherlv_42=(Token)match(input,32,FOLLOW_10); 

                            					newLeafNode(otherlv_42, grammarAccess.getCommandAccess().getColonKeyword_3_7_1());
                            				
                            // InternalC.g:1029:5: ( (lv_commands_43_0= ruleCommand ) )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==RULE_ID||(LA18_0>=RULE_UO && LA18_0<=RULE_STRING)||LA18_0==18||(LA18_0>=23 && LA18_0<=24)||LA18_0==26||(LA18_0>=28 && LA18_0<=30)||(LA18_0>=33 && LA18_0<=37)||(LA18_0>=43 && LA18_0<=44)) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // InternalC.g:1030:6: (lv_commands_43_0= ruleCommand )
                            	    {
                            	    // InternalC.g:1030:6: (lv_commands_43_0= ruleCommand )
                            	    // InternalC.g:1031:7: lv_commands_43_0= ruleCommand
                            	    {

                            	    							newCompositeNode(grammarAccess.getCommandAccess().getCommandsCommandParserRuleCall_3_7_2_0());
                            	    						
                            	    pushFollow(FOLLOW_10);
                            	    lv_commands_43_0=ruleCommand();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getCommandRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"commands",
                            	    								lv_commands_43_0,
                            	    								"com.poli.compilador.C.Command");
                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop18;
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
                    // InternalC.g:1055:3: ( () otherlv_46= 'do' otherlv_47= '{' ( (lv_commands_48_0= ruleCommand ) )* otherlv_49= '}' otherlv_50= 'while' otherlv_51= '(' ( (lv_exp_52_0= ruleExpression ) ) otherlv_53= ')' otherlv_54= ';' )
                    {
                    // InternalC.g:1055:3: ( () otherlv_46= 'do' otherlv_47= '{' ( (lv_commands_48_0= ruleCommand ) )* otherlv_49= '}' otherlv_50= 'while' otherlv_51= '(' ( (lv_exp_52_0= ruleExpression ) ) otherlv_53= ')' otherlv_54= ';' )
                    // InternalC.g:1056:4: () otherlv_46= 'do' otherlv_47= '{' ( (lv_commands_48_0= ruleCommand ) )* otherlv_49= '}' otherlv_50= 'while' otherlv_51= '(' ( (lv_exp_52_0= ruleExpression ) ) otherlv_53= ')' otherlv_54= ';'
                    {
                    // InternalC.g:1056:4: ()
                    // InternalC.g:1057:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getDoWhileCmdAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_46=(Token)match(input,33,FOLLOW_9); 

                    				newLeafNode(otherlv_46, grammarAccess.getCommandAccess().getDoKeyword_4_1());
                    			
                    otherlv_47=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_47, grammarAccess.getCommandAccess().getLeftCurlyBracketKeyword_4_2());
                    			
                    // InternalC.g:1071:4: ( (lv_commands_48_0= ruleCommand ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_ID||(LA20_0>=RULE_UO && LA20_0<=RULE_STRING)||LA20_0==18||(LA20_0>=23 && LA20_0<=24)||LA20_0==26||(LA20_0>=28 && LA20_0<=30)||(LA20_0>=33 && LA20_0<=37)||(LA20_0>=43 && LA20_0<=44)) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalC.g:1072:5: (lv_commands_48_0= ruleCommand )
                    	    {
                    	    // InternalC.g:1072:5: (lv_commands_48_0= ruleCommand )
                    	    // InternalC.g:1073:6: lv_commands_48_0= ruleCommand
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
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_49=(Token)match(input,22,FOLLOW_23); 

                    				newLeafNode(otherlv_49, grammarAccess.getCommandAccess().getRightCurlyBracketKeyword_4_4());
                    			
                    otherlv_50=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_50, grammarAccess.getCommandAccess().getWhileKeyword_4_5());
                    			
                    otherlv_51=(Token)match(input,18,FOLLOW_16); 

                    				newLeafNode(otherlv_51, grammarAccess.getCommandAccess().getLeftParenthesisKeyword_4_6());
                    			
                    // InternalC.g:1102:4: ( (lv_exp_52_0= ruleExpression ) )
                    // InternalC.g:1103:5: (lv_exp_52_0= ruleExpression )
                    {
                    // InternalC.g:1103:5: (lv_exp_52_0= ruleExpression )
                    // InternalC.g:1104:6: lv_exp_52_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getExpExpressionParserRuleCall_4_7_0());
                    					
                    pushFollow(FOLLOW_17);
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
                    // InternalC.g:1131:3: ( () ( (lv_lval_56_0= ruleFactor ) ) ( (lv_asg_57_0= ruleAssignment ) )? otherlv_58= ';' )
                    {
                    // InternalC.g:1131:3: ( () ( (lv_lval_56_0= ruleFactor ) ) ( (lv_asg_57_0= ruleAssignment ) )? otherlv_58= ';' )
                    // InternalC.g:1132:4: () ( (lv_lval_56_0= ruleFactor ) ) ( (lv_asg_57_0= ruleAssignment ) )? otherlv_58= ';'
                    {
                    // InternalC.g:1132:4: ()
                    // InternalC.g:1133:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getVarCmdAction_5_0(),
                    						current);
                    				

                    }

                    // InternalC.g:1139:4: ( (lv_lval_56_0= ruleFactor ) )
                    // InternalC.g:1140:5: (lv_lval_56_0= ruleFactor )
                    {
                    // InternalC.g:1140:5: (lv_lval_56_0= ruleFactor )
                    // InternalC.g:1141:6: lv_lval_56_0= ruleFactor
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

                    // InternalC.g:1158:4: ( (lv_asg_57_0= ruleAssignment ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==38) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalC.g:1159:5: (lv_asg_57_0= ruleAssignment )
                            {
                            // InternalC.g:1159:5: (lv_asg_57_0= ruleAssignment )
                            // InternalC.g:1160:6: lv_asg_57_0= ruleAssignment
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
                    // InternalC.g:1183:3: ( () otherlv_60= 'break' otherlv_61= ';' )
                    {
                    // InternalC.g:1183:3: ( () otherlv_60= 'break' otherlv_61= ';' )
                    // InternalC.g:1184:4: () otherlv_60= 'break' otherlv_61= ';'
                    {
                    // InternalC.g:1184:4: ()
                    // InternalC.g:1185:5: 
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
                    // InternalC.g:1201:3: ( () otherlv_63= 'continue' otherlv_64= ';' )
                    {
                    // InternalC.g:1201:3: ( () otherlv_63= 'continue' otherlv_64= ';' )
                    // InternalC.g:1202:4: () otherlv_63= 'continue' otherlv_64= ';'
                    {
                    // InternalC.g:1202:4: ()
                    // InternalC.g:1203:5: 
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
                    // InternalC.g:1219:3: ( () otherlv_66= 'return' ( (lv_exp_67_0= ruleExpression ) )? otherlv_68= ';' )
                    {
                    // InternalC.g:1219:3: ( () otherlv_66= 'return' ( (lv_exp_67_0= ruleExpression ) )? otherlv_68= ';' )
                    // InternalC.g:1220:4: () otherlv_66= 'return' ( (lv_exp_67_0= ruleExpression ) )? otherlv_68= ';'
                    {
                    // InternalC.g:1220:4: ()
                    // InternalC.g:1221:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getReturnCmdAction_8_0(),
                    						current);
                    				

                    }

                    otherlv_66=(Token)match(input,36,FOLLOW_24); 

                    				newLeafNode(otherlv_66, grammarAccess.getCommandAccess().getReturnKeyword_8_1());
                    			
                    // InternalC.g:1231:4: ( (lv_exp_67_0= ruleExpression ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_ID||LA22_0==RULE_UO||(LA22_0>=RULE_INT && LA22_0<=RULE_STRING)||LA22_0==18||LA22_0==23||(LA22_0>=43 && LA22_0<=44)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalC.g:1232:5: (lv_exp_67_0= ruleExpression )
                            {
                            // InternalC.g:1232:5: (lv_exp_67_0= ruleExpression )
                            // InternalC.g:1233:6: lv_exp_67_0= ruleExpression
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
                    // InternalC.g:1256:3: ( () ( (lv_val_70_0= ruleDeclaration ) ) )
                    {
                    // InternalC.g:1256:3: ( () ( (lv_val_70_0= ruleDeclaration ) ) )
                    // InternalC.g:1257:4: () ( (lv_val_70_0= ruleDeclaration ) )
                    {
                    // InternalC.g:1257:4: ()
                    // InternalC.g:1258:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getDeclCmdAction_9_0(),
                    						current);
                    				

                    }

                    // InternalC.g:1264:4: ( (lv_val_70_0= ruleDeclaration ) )
                    // InternalC.g:1265:5: (lv_val_70_0= ruleDeclaration )
                    {
                    // InternalC.g:1265:5: (lv_val_70_0= ruleDeclaration )
                    // InternalC.g:1266:6: lv_val_70_0= ruleDeclaration
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
                    // InternalC.g:1285:3: ( () otherlv_72= 'printf' otherlv_73= '(' ( (lv_exp_74_0= ruleExpression ) )? otherlv_75= ')' otherlv_76= ';' )
                    {
                    // InternalC.g:1285:3: ( () otherlv_72= 'printf' otherlv_73= '(' ( (lv_exp_74_0= ruleExpression ) )? otherlv_75= ')' otherlv_76= ';' )
                    // InternalC.g:1286:4: () otherlv_72= 'printf' otherlv_73= '(' ( (lv_exp_74_0= ruleExpression ) )? otherlv_75= ')' otherlv_76= ';'
                    {
                    // InternalC.g:1286:4: ()
                    // InternalC.g:1287:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getPrintCmdAction_10_0(),
                    						current);
                    				

                    }

                    otherlv_72=(Token)match(input,37,FOLLOW_6); 

                    				newLeafNode(otherlv_72, grammarAccess.getCommandAccess().getPrintfKeyword_10_1());
                    			
                    otherlv_73=(Token)match(input,18,FOLLOW_25); 

                    				newLeafNode(otherlv_73, grammarAccess.getCommandAccess().getLeftParenthesisKeyword_10_2());
                    			
                    // InternalC.g:1301:4: ( (lv_exp_74_0= ruleExpression ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_ID||LA23_0==RULE_UO||(LA23_0>=RULE_INT && LA23_0<=RULE_STRING)||LA23_0==18||LA23_0==23||(LA23_0>=43 && LA23_0<=44)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalC.g:1302:5: (lv_exp_74_0= ruleExpression )
                            {
                            // InternalC.g:1302:5: (lv_exp_74_0= ruleExpression )
                            // InternalC.g:1303:6: lv_exp_74_0= ruleExpression
                            {

                            						newCompositeNode(grammarAccess.getCommandAccess().getExpExpressionParserRuleCall_10_3_0());
                            					
                            pushFollow(FOLLOW_17);
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
    // InternalC.g:1333:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalC.g:1333:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalC.g:1334:2: iv_ruleArgument= ruleArgument EOF
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
    // InternalC.g:1340:1: ruleArgument returns [EObject current=null] : ( ( (lv_exp_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exp_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exp_0_0 = null;

        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalC.g:1346:2: ( ( ( (lv_exp_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exp_2_0= ruleExpression ) ) )* ) )
            // InternalC.g:1347:2: ( ( (lv_exp_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exp_2_0= ruleExpression ) ) )* )
            {
            // InternalC.g:1347:2: ( ( (lv_exp_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exp_2_0= ruleExpression ) ) )* )
            // InternalC.g:1348:3: ( (lv_exp_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exp_2_0= ruleExpression ) ) )*
            {
            // InternalC.g:1348:3: ( (lv_exp_0_0= ruleExpression ) )
            // InternalC.g:1349:4: (lv_exp_0_0= ruleExpression )
            {
            // InternalC.g:1349:4: (lv_exp_0_0= ruleExpression )
            // InternalC.g:1350:5: lv_exp_0_0= ruleExpression
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

            // InternalC.g:1367:3: (otherlv_1= ',' ( (lv_exp_2_0= ruleExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==19) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalC.g:1368:4: otherlv_1= ',' ( (lv_exp_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_16); 

            	    				newLeafNode(otherlv_1, grammarAccess.getArgumentAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalC.g:1372:4: ( (lv_exp_2_0= ruleExpression ) )
            	    // InternalC.g:1373:5: (lv_exp_2_0= ruleExpression )
            	    {
            	    // InternalC.g:1373:5: (lv_exp_2_0= ruleExpression )
            	    // InternalC.g:1374:6: lv_exp_2_0= ruleExpression
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
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleAssignment"
    // InternalC.g:1396:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalC.g:1396:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalC.g:1397:2: iv_ruleAssignment= ruleAssignment EOF
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
    // InternalC.g:1403:1: ruleAssignment returns [EObject current=null] : (otherlv_0= '=' ( (lv_exp_1_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalC.g:1409:2: ( (otherlv_0= '=' ( (lv_exp_1_0= ruleExpression ) ) ) )
            // InternalC.g:1410:2: (otherlv_0= '=' ( (lv_exp_1_0= ruleExpression ) ) )
            {
            // InternalC.g:1410:2: (otherlv_0= '=' ( (lv_exp_1_0= ruleExpression ) ) )
            // InternalC.g:1411:3: otherlv_0= '=' ( (lv_exp_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_0());
            		
            // InternalC.g:1415:3: ( (lv_exp_1_0= ruleExpression ) )
            // InternalC.g:1416:4: (lv_exp_1_0= ruleExpression )
            {
            // InternalC.g:1416:4: (lv_exp_1_0= ruleExpression )
            // InternalC.g:1417:5: lv_exp_1_0= ruleExpression
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
    // InternalC.g:1438:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalC.g:1438:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalC.g:1439:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalC.g:1445:1: ruleExpression returns [EObject current=null] : (this_RelExp_0= ruleRelExp ( () ( (lv_op_2_0= RULE_LO ) ) ( (lv_args_3_0= ruleRelExp ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_RelExp_0 = null;

        EObject lv_args_3_0 = null;



        	enterRule();

        try {
            // InternalC.g:1451:2: ( (this_RelExp_0= ruleRelExp ( () ( (lv_op_2_0= RULE_LO ) ) ( (lv_args_3_0= ruleRelExp ) ) )* ) )
            // InternalC.g:1452:2: (this_RelExp_0= ruleRelExp ( () ( (lv_op_2_0= RULE_LO ) ) ( (lv_args_3_0= ruleRelExp ) ) )* )
            {
            // InternalC.g:1452:2: (this_RelExp_0= ruleRelExp ( () ( (lv_op_2_0= RULE_LO ) ) ( (lv_args_3_0= ruleRelExp ) ) )* )
            // InternalC.g:1453:3: this_RelExp_0= ruleRelExp ( () ( (lv_op_2_0= RULE_LO ) ) ( (lv_args_3_0= ruleRelExp ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getRelExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_RelExp_0=ruleRelExp();

            state._fsp--;


            			current = this_RelExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalC.g:1461:3: ( () ( (lv_op_2_0= RULE_LO ) ) ( (lv_args_3_0= ruleRelExp ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_LO) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalC.g:1462:4: () ( (lv_op_2_0= RULE_LO ) ) ( (lv_args_3_0= ruleRelExp ) )
            	    {
            	    // InternalC.g:1462:4: ()
            	    // InternalC.g:1463:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getExpressionAccess().getLogicExpArgsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalC.g:1469:4: ( (lv_op_2_0= RULE_LO ) )
            	    // InternalC.g:1470:5: (lv_op_2_0= RULE_LO )
            	    {
            	    // InternalC.g:1470:5: (lv_op_2_0= RULE_LO )
            	    // InternalC.g:1471:6: lv_op_2_0= RULE_LO
            	    {
            	    lv_op_2_0=(Token)match(input,RULE_LO,FOLLOW_16); 

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

            	    // InternalC.g:1487:4: ( (lv_args_3_0= ruleRelExp ) )
            	    // InternalC.g:1488:5: (lv_args_3_0= ruleRelExp )
            	    {
            	    // InternalC.g:1488:5: (lv_args_3_0= ruleRelExp )
            	    // InternalC.g:1489:6: lv_args_3_0= ruleRelExp
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleRelExp"
    // InternalC.g:1511:1: entryRuleRelExp returns [EObject current=null] : iv_ruleRelExp= ruleRelExp EOF ;
    public final EObject entryRuleRelExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelExp = null;


        try {
            // InternalC.g:1511:47: (iv_ruleRelExp= ruleRelExp EOF )
            // InternalC.g:1512:2: iv_ruleRelExp= ruleRelExp EOF
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
    // InternalC.g:1518:1: ruleRelExp returns [EObject current=null] : (this_ArithExp_0= ruleArithExp ( () ( (lv_op_2_0= RULE_RO ) ) ( (lv_args_3_0= ruleArithExp ) ) )* ) ;
    public final EObject ruleRelExp() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ArithExp_0 = null;

        EObject lv_args_3_0 = null;



        	enterRule();

        try {
            // InternalC.g:1524:2: ( (this_ArithExp_0= ruleArithExp ( () ( (lv_op_2_0= RULE_RO ) ) ( (lv_args_3_0= ruleArithExp ) ) )* ) )
            // InternalC.g:1525:2: (this_ArithExp_0= ruleArithExp ( () ( (lv_op_2_0= RULE_RO ) ) ( (lv_args_3_0= ruleArithExp ) ) )* )
            {
            // InternalC.g:1525:2: (this_ArithExp_0= ruleArithExp ( () ( (lv_op_2_0= RULE_RO ) ) ( (lv_args_3_0= ruleArithExp ) ) )* )
            // InternalC.g:1526:3: this_ArithExp_0= ruleArithExp ( () ( (lv_op_2_0= RULE_RO ) ) ( (lv_args_3_0= ruleArithExp ) ) )*
            {

            			newCompositeNode(grammarAccess.getRelExpAccess().getArithExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_ArithExp_0=ruleArithExp();

            state._fsp--;


            			current = this_ArithExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalC.g:1534:3: ( () ( (lv_op_2_0= RULE_RO ) ) ( (lv_args_3_0= ruleArithExp ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_RO) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalC.g:1535:4: () ( (lv_op_2_0= RULE_RO ) ) ( (lv_args_3_0= ruleArithExp ) )
            	    {
            	    // InternalC.g:1535:4: ()
            	    // InternalC.g:1536:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getRelExpAccess().getRelExpArgsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalC.g:1542:4: ( (lv_op_2_0= RULE_RO ) )
            	    // InternalC.g:1543:5: (lv_op_2_0= RULE_RO )
            	    {
            	    // InternalC.g:1543:5: (lv_op_2_0= RULE_RO )
            	    // InternalC.g:1544:6: lv_op_2_0= RULE_RO
            	    {
            	    lv_op_2_0=(Token)match(input,RULE_RO,FOLLOW_16); 

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

            	    // InternalC.g:1560:4: ( (lv_args_3_0= ruleArithExp ) )
            	    // InternalC.g:1561:5: (lv_args_3_0= ruleArithExp )
            	    {
            	    // InternalC.g:1561:5: (lv_args_3_0= ruleArithExp )
            	    // InternalC.g:1562:6: lv_args_3_0= ruleArithExp
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
    // $ANTLR end "ruleRelExp"


    // $ANTLR start "entryRuleArithExp"
    // InternalC.g:1584:1: entryRuleArithExp returns [EObject current=null] : iv_ruleArithExp= ruleArithExp EOF ;
    public final EObject entryRuleArithExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithExp = null;


        try {
            // InternalC.g:1584:49: (iv_ruleArithExp= ruleArithExp EOF )
            // InternalC.g:1585:2: iv_ruleArithExp= ruleArithExp EOF
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
    // InternalC.g:1591:1: ruleArithExp returns [EObject current=null] : (this_Term_0= ruleTerm ( () ( (lv_op_2_0= RULE_AO1 ) ) ( (lv_args_3_0= ruleTerm ) ) )* ) ;
    public final EObject ruleArithExp() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Term_0 = null;

        EObject lv_args_3_0 = null;



        	enterRule();

        try {
            // InternalC.g:1597:2: ( (this_Term_0= ruleTerm ( () ( (lv_op_2_0= RULE_AO1 ) ) ( (lv_args_3_0= ruleTerm ) ) )* ) )
            // InternalC.g:1598:2: (this_Term_0= ruleTerm ( () ( (lv_op_2_0= RULE_AO1 ) ) ( (lv_args_3_0= ruleTerm ) ) )* )
            {
            // InternalC.g:1598:2: (this_Term_0= ruleTerm ( () ( (lv_op_2_0= RULE_AO1 ) ) ( (lv_args_3_0= ruleTerm ) ) )* )
            // InternalC.g:1599:3: this_Term_0= ruleTerm ( () ( (lv_op_2_0= RULE_AO1 ) ) ( (lv_args_3_0= ruleTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getArithExpAccess().getTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_Term_0=ruleTerm();

            state._fsp--;


            			current = this_Term_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalC.g:1607:3: ( () ( (lv_op_2_0= RULE_AO1 ) ) ( (lv_args_3_0= ruleTerm ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_AO1) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalC.g:1608:4: () ( (lv_op_2_0= RULE_AO1 ) ) ( (lv_args_3_0= ruleTerm ) )
            	    {
            	    // InternalC.g:1608:4: ()
            	    // InternalC.g:1609:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getArithExpAccess().getArithExpArgsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalC.g:1615:4: ( (lv_op_2_0= RULE_AO1 ) )
            	    // InternalC.g:1616:5: (lv_op_2_0= RULE_AO1 )
            	    {
            	    // InternalC.g:1616:5: (lv_op_2_0= RULE_AO1 )
            	    // InternalC.g:1617:6: lv_op_2_0= RULE_AO1
            	    {
            	    lv_op_2_0=(Token)match(input,RULE_AO1,FOLLOW_16); 

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

            	    // InternalC.g:1633:4: ( (lv_args_3_0= ruleTerm ) )
            	    // InternalC.g:1634:5: (lv_args_3_0= ruleTerm )
            	    {
            	    // InternalC.g:1634:5: (lv_args_3_0= ruleTerm )
            	    // InternalC.g:1635:6: lv_args_3_0= ruleTerm
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
    // $ANTLR end "ruleArithExp"


    // $ANTLR start "entryRuleTerm"
    // InternalC.g:1657:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalC.g:1657:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalC.g:1658:2: iv_ruleTerm= ruleTerm EOF
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
    // InternalC.g:1664:1: ruleTerm returns [EObject current=null] : (this_Factor_0= ruleFactor ( () ( (lv_op_2_0= RULE_AO2 ) ) ( (lv_args_3_0= ruleFactor ) ) )* ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Factor_0 = null;

        EObject lv_args_3_0 = null;



        	enterRule();

        try {
            // InternalC.g:1670:2: ( (this_Factor_0= ruleFactor ( () ( (lv_op_2_0= RULE_AO2 ) ) ( (lv_args_3_0= ruleFactor ) ) )* ) )
            // InternalC.g:1671:2: (this_Factor_0= ruleFactor ( () ( (lv_op_2_0= RULE_AO2 ) ) ( (lv_args_3_0= ruleFactor ) ) )* )
            {
            // InternalC.g:1671:2: (this_Factor_0= ruleFactor ( () ( (lv_op_2_0= RULE_AO2 ) ) ( (lv_args_3_0= ruleFactor ) ) )* )
            // InternalC.g:1672:3: this_Factor_0= ruleFactor ( () ( (lv_op_2_0= RULE_AO2 ) ) ( (lv_args_3_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalC.g:1680:3: ( () ( (lv_op_2_0= RULE_AO2 ) ) ( (lv_args_3_0= ruleFactor ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_AO2) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalC.g:1681:4: () ( (lv_op_2_0= RULE_AO2 ) ) ( (lv_args_3_0= ruleFactor ) )
            	    {
            	    // InternalC.g:1681:4: ()
            	    // InternalC.g:1682:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getTermAccess().getTermArgsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalC.g:1688:4: ( (lv_op_2_0= RULE_AO2 ) )
            	    // InternalC.g:1689:5: (lv_op_2_0= RULE_AO2 )
            	    {
            	    // InternalC.g:1689:5: (lv_op_2_0= RULE_AO2 )
            	    // InternalC.g:1690:6: lv_op_2_0= RULE_AO2
            	    {
            	    lv_op_2_0=(Token)match(input,RULE_AO2,FOLLOW_16); 

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

            	    // InternalC.g:1706:4: ( (lv_args_3_0= ruleFactor ) )
            	    // InternalC.g:1707:5: (lv_args_3_0= ruleFactor )
            	    {
            	    // InternalC.g:1707:5: (lv_args_3_0= ruleFactor )
            	    // InternalC.g:1708:6: lv_args_3_0= ruleFactor
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
            	    break loop29;
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
    // InternalC.g:1730:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalC.g:1730:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalC.g:1731:2: iv_ruleFactor= ruleFactor EOF
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
    // InternalC.g:1737:1: ruleFactor returns [EObject current=null] : ( (this_Atom_0= ruleAtom ( () ( (lv_uo_2_0= RULE_UO ) ) )? ) | ( () ( (lv_uo_4_0= RULE_UO ) ) ( (lv_arg_5_0= ruleAtom ) ) ) ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token lv_uo_2_0=null;
        Token lv_uo_4_0=null;
        EObject this_Atom_0 = null;

        EObject lv_arg_5_0 = null;



        	enterRule();

        try {
            // InternalC.g:1743:2: ( ( (this_Atom_0= ruleAtom ( () ( (lv_uo_2_0= RULE_UO ) ) )? ) | ( () ( (lv_uo_4_0= RULE_UO ) ) ( (lv_arg_5_0= ruleAtom ) ) ) ) )
            // InternalC.g:1744:2: ( (this_Atom_0= ruleAtom ( () ( (lv_uo_2_0= RULE_UO ) ) )? ) | ( () ( (lv_uo_4_0= RULE_UO ) ) ( (lv_arg_5_0= ruleAtom ) ) ) )
            {
            // InternalC.g:1744:2: ( (this_Atom_0= ruleAtom ( () ( (lv_uo_2_0= RULE_UO ) ) )? ) | ( () ( (lv_uo_4_0= RULE_UO ) ) ( (lv_arg_5_0= ruleAtom ) ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID||(LA31_0>=RULE_INT && LA31_0<=RULE_STRING)||LA31_0==18||LA31_0==23||(LA31_0>=43 && LA31_0<=44)) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_UO) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalC.g:1745:3: (this_Atom_0= ruleAtom ( () ( (lv_uo_2_0= RULE_UO ) ) )? )
                    {
                    // InternalC.g:1745:3: (this_Atom_0= ruleAtom ( () ( (lv_uo_2_0= RULE_UO ) ) )? )
                    // InternalC.g:1746:4: this_Atom_0= ruleAtom ( () ( (lv_uo_2_0= RULE_UO ) ) )?
                    {

                    				newCompositeNode(grammarAccess.getFactorAccess().getAtomParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_31);
                    this_Atom_0=ruleAtom();

                    state._fsp--;


                    				current = this_Atom_0;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalC.g:1754:4: ( () ( (lv_uo_2_0= RULE_UO ) ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==RULE_UO) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalC.g:1755:5: () ( (lv_uo_2_0= RULE_UO ) )
                            {
                            // InternalC.g:1755:5: ()
                            // InternalC.g:1756:6: 
                            {

                            						current = forceCreateModelElementAndSet(
                            							grammarAccess.getFactorAccess().getPostfixOpArgAction_0_1_0(),
                            							current);
                            					

                            }

                            // InternalC.g:1762:5: ( (lv_uo_2_0= RULE_UO ) )
                            // InternalC.g:1763:6: (lv_uo_2_0= RULE_UO )
                            {
                            // InternalC.g:1763:6: (lv_uo_2_0= RULE_UO )
                            // InternalC.g:1764:7: lv_uo_2_0= RULE_UO
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
                    // InternalC.g:1783:3: ( () ( (lv_uo_4_0= RULE_UO ) ) ( (lv_arg_5_0= ruleAtom ) ) )
                    {
                    // InternalC.g:1783:3: ( () ( (lv_uo_4_0= RULE_UO ) ) ( (lv_arg_5_0= ruleAtom ) ) )
                    // InternalC.g:1784:4: () ( (lv_uo_4_0= RULE_UO ) ) ( (lv_arg_5_0= ruleAtom ) )
                    {
                    // InternalC.g:1784:4: ()
                    // InternalC.g:1785:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFactorAccess().getPrefixOpAction_1_0(),
                    						current);
                    				

                    }

                    // InternalC.g:1791:4: ( (lv_uo_4_0= RULE_UO ) )
                    // InternalC.g:1792:5: (lv_uo_4_0= RULE_UO )
                    {
                    // InternalC.g:1792:5: (lv_uo_4_0= RULE_UO )
                    // InternalC.g:1793:6: lv_uo_4_0= RULE_UO
                    {
                    lv_uo_4_0=(Token)match(input,RULE_UO,FOLLOW_15); 

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

                    // InternalC.g:1809:4: ( (lv_arg_5_0= ruleAtom ) )
                    // InternalC.g:1810:5: (lv_arg_5_0= ruleAtom )
                    {
                    // InternalC.g:1810:5: (lv_arg_5_0= ruleAtom )
                    // InternalC.g:1811:6: lv_arg_5_0= ruleAtom
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
    // InternalC.g:1833:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalC.g:1833:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalC.g:1834:2: iv_ruleAtom= ruleAtom EOF
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
    // InternalC.g:1840:1: ruleAtom returns [EObject current=null] : (this_Literal_0= ruleLiteral | ( () otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' ) | this_lValue_5= rulelValue ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Literal_0 = null;

        EObject lv_exp_3_0 = null;

        EObject this_lValue_5 = null;



        	enterRule();

        try {
            // InternalC.g:1846:2: ( (this_Literal_0= ruleLiteral | ( () otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' ) | this_lValue_5= rulelValue ) )
            // InternalC.g:1847:2: (this_Literal_0= ruleLiteral | ( () otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' ) | this_lValue_5= rulelValue )
            {
            // InternalC.g:1847:2: (this_Literal_0= ruleLiteral | ( () otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' ) | this_lValue_5= rulelValue )
            int alt32=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
            case 43:
            case 44:
                {
                alt32=1;
                }
                break;
            case 18:
                {
                alt32=2;
                }
                break;
            case RULE_ID:
            case 23:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalC.g:1848:3: this_Literal_0= ruleLiteral
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
                    // InternalC.g:1857:3: ( () otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' )
                    {
                    // InternalC.g:1857:3: ( () otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' )
                    // InternalC.g:1858:4: () otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')'
                    {
                    // InternalC.g:1858:4: ()
                    // InternalC.g:1859:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomAccess().getParentesesAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,18,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalC.g:1869:4: ( (lv_exp_3_0= ruleExpression ) )
                    // InternalC.g:1870:5: (lv_exp_3_0= ruleExpression )
                    {
                    // InternalC.g:1870:5: (lv_exp_3_0= ruleExpression )
                    // InternalC.g:1871:6: lv_exp_3_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getAtomAccess().getExpExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_17);
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
                    // InternalC.g:1894:3: this_lValue_5= rulelValue
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
    // InternalC.g:1906:1: entryRulelValue returns [EObject current=null] : iv_rulelValue= rulelValue EOF ;
    public final EObject entryRulelValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelValue = null;


        try {
            // InternalC.g:1906:47: (iv_rulelValue= rulelValue EOF )
            // InternalC.g:1907:2: iv_rulelValue= rulelValue EOF
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
    // InternalC.g:1913:1: rulelValue returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ( ( () otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) )? otherlv_5= ')' ) | ( () otherlv_7= '.' ( (lv_field_8_0= RULE_ID ) ) ) | ( () otherlv_10= '[' ( (lv_index_11_0= ruleExpression ) ) otherlv_12= ']' ) )* ) | this_PointerExp_13= rulePointerExp ) ;
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
            // InternalC.g:1919:2: ( ( ( () ( (otherlv_1= RULE_ID ) ) ( ( () otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) )? otherlv_5= ')' ) | ( () otherlv_7= '.' ( (lv_field_8_0= RULE_ID ) ) ) | ( () otherlv_10= '[' ( (lv_index_11_0= ruleExpression ) ) otherlv_12= ']' ) )* ) | this_PointerExp_13= rulePointerExp ) )
            // InternalC.g:1920:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( () otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) )? otherlv_5= ')' ) | ( () otherlv_7= '.' ( (lv_field_8_0= RULE_ID ) ) ) | ( () otherlv_10= '[' ( (lv_index_11_0= ruleExpression ) ) otherlv_12= ']' ) )* ) | this_PointerExp_13= rulePointerExp )
            {
            // InternalC.g:1920:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( () otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) )? otherlv_5= ')' ) | ( () otherlv_7= '.' ( (lv_field_8_0= RULE_ID ) ) ) | ( () otherlv_10= '[' ( (lv_index_11_0= ruleExpression ) ) otherlv_12= ']' ) )* ) | this_PointerExp_13= rulePointerExp )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            else if ( (LA35_0==23) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalC.g:1921:3: ( () ( (otherlv_1= RULE_ID ) ) ( ( () otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) )? otherlv_5= ')' ) | ( () otherlv_7= '.' ( (lv_field_8_0= RULE_ID ) ) ) | ( () otherlv_10= '[' ( (lv_index_11_0= ruleExpression ) ) otherlv_12= ']' ) )* )
                    {
                    // InternalC.g:1921:3: ( () ( (otherlv_1= RULE_ID ) ) ( ( () otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) )? otherlv_5= ')' ) | ( () otherlv_7= '.' ( (lv_field_8_0= RULE_ID ) ) ) | ( () otherlv_10= '[' ( (lv_index_11_0= ruleExpression ) ) otherlv_12= ']' ) )* )
                    // InternalC.g:1922:4: () ( (otherlv_1= RULE_ID ) ) ( ( () otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) )? otherlv_5= ')' ) | ( () otherlv_7= '.' ( (lv_field_8_0= RULE_ID ) ) ) | ( () otherlv_10= '[' ( (lv_index_11_0= ruleExpression ) ) otherlv_12= ']' ) )*
                    {
                    // InternalC.g:1922:4: ()
                    // InternalC.g:1923:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLValueAccess().getVarAction_0_0(),
                    						current);
                    				

                    }

                    // InternalC.g:1929:4: ( (otherlv_1= RULE_ID ) )
                    // InternalC.g:1930:5: (otherlv_1= RULE_ID )
                    {
                    // InternalC.g:1930:5: (otherlv_1= RULE_ID )
                    // InternalC.g:1931:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLValueRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_32); 

                    						newLeafNode(otherlv_1, grammarAccess.getLValueAccess().getValorDefinitionCrossReference_0_1_0());
                    					

                    }


                    }

                    // InternalC.g:1942:4: ( ( () otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) )? otherlv_5= ')' ) | ( () otherlv_7= '.' ( (lv_field_8_0= RULE_ID ) ) ) | ( () otherlv_10= '[' ( (lv_index_11_0= ruleExpression ) ) otherlv_12= ']' ) )*
                    loop34:
                    do {
                        int alt34=4;
                        switch ( input.LA(1) ) {
                        case 18:
                            {
                            alt34=1;
                            }
                            break;
                        case 39:
                            {
                            alt34=2;
                            }
                            break;
                        case 40:
                            {
                            alt34=3;
                            }
                            break;

                        }

                        switch (alt34) {
                    	case 1 :
                    	    // InternalC.g:1943:5: ( () otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) )? otherlv_5= ')' )
                    	    {
                    	    // InternalC.g:1943:5: ( () otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) )? otherlv_5= ')' )
                    	    // InternalC.g:1944:6: () otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) )? otherlv_5= ')'
                    	    {
                    	    // InternalC.g:1944:6: ()
                    	    // InternalC.g:1945:7: 
                    	    {

                    	    							current = forceCreateModelElementAndSet(
                    	    								grammarAccess.getLValueAccess().getFuncCallDefAction_0_2_0_0(),
                    	    								current);
                    	    						

                    	    }

                    	    otherlv_3=(Token)match(input,18,FOLLOW_25); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getLValueAccess().getLeftParenthesisKeyword_0_2_0_1());
                    	    					
                    	    // InternalC.g:1955:6: ( (lv_arg_4_0= ruleArgument ) )?
                    	    int alt33=2;
                    	    int LA33_0 = input.LA(1);

                    	    if ( (LA33_0==RULE_ID||LA33_0==RULE_UO||(LA33_0>=RULE_INT && LA33_0<=RULE_STRING)||LA33_0==18||LA33_0==23||(LA33_0>=43 && LA33_0<=44)) ) {
                    	        alt33=1;
                    	    }
                    	    switch (alt33) {
                    	        case 1 :
                    	            // InternalC.g:1956:7: (lv_arg_4_0= ruleArgument )
                    	            {
                    	            // InternalC.g:1956:7: (lv_arg_4_0= ruleArgument )
                    	            // InternalC.g:1957:8: lv_arg_4_0= ruleArgument
                    	            {

                    	            								newCompositeNode(grammarAccess.getLValueAccess().getArgArgumentParserRuleCall_0_2_0_2_0());
                    	            							
                    	            pushFollow(FOLLOW_17);
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
                    	    // InternalC.g:1980:5: ( () otherlv_7= '.' ( (lv_field_8_0= RULE_ID ) ) )
                    	    {
                    	    // InternalC.g:1980:5: ( () otherlv_7= '.' ( (lv_field_8_0= RULE_ID ) ) )
                    	    // InternalC.g:1981:6: () otherlv_7= '.' ( (lv_field_8_0= RULE_ID ) )
                    	    {
                    	    // InternalC.g:1981:6: ()
                    	    // InternalC.g:1982:7: 
                    	    {

                    	    							current = forceCreateModelElementAndSet(
                    	    								grammarAccess.getLValueAccess().getFieldAccessObjAction_0_2_1_0(),
                    	    								current);
                    	    						

                    	    }

                    	    otherlv_7=(Token)match(input,39,FOLLOW_5); 

                    	    						newLeafNode(otherlv_7, grammarAccess.getLValueAccess().getFullStopKeyword_0_2_1_1());
                    	    					
                    	    // InternalC.g:1992:6: ( (lv_field_8_0= RULE_ID ) )
                    	    // InternalC.g:1993:7: (lv_field_8_0= RULE_ID )
                    	    {
                    	    // InternalC.g:1993:7: (lv_field_8_0= RULE_ID )
                    	    // InternalC.g:1994:8: lv_field_8_0= RULE_ID
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
                    	    // InternalC.g:2012:5: ( () otherlv_10= '[' ( (lv_index_11_0= ruleExpression ) ) otherlv_12= ']' )
                    	    {
                    	    // InternalC.g:2012:5: ( () otherlv_10= '[' ( (lv_index_11_0= ruleExpression ) ) otherlv_12= ']' )
                    	    // InternalC.g:2013:6: () otherlv_10= '[' ( (lv_index_11_0= ruleExpression ) ) otherlv_12= ']'
                    	    {
                    	    // InternalC.g:2013:6: ()
                    	    // InternalC.g:2014:7: 
                    	    {

                    	    							current = forceCreateModelElementAndSet(
                    	    								grammarAccess.getLValueAccess().getArrayAccessArrAction_0_2_2_0(),
                    	    								current);
                    	    						

                    	    }

                    	    otherlv_10=(Token)match(input,40,FOLLOW_16); 

                    	    						newLeafNode(otherlv_10, grammarAccess.getLValueAccess().getLeftSquareBracketKeyword_0_2_2_1());
                    	    					
                    	    // InternalC.g:2024:6: ( (lv_index_11_0= ruleExpression ) )
                    	    // InternalC.g:2025:7: (lv_index_11_0= ruleExpression )
                    	    {
                    	    // InternalC.g:2025:7: (lv_index_11_0= ruleExpression )
                    	    // InternalC.g:2026:8: lv_index_11_0= ruleExpression
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
                    	    break loop34;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalC.g:2051:3: this_PointerExp_13= rulePointerExp
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
    // InternalC.g:2063:1: entryRulePointerExp returns [EObject current=null] : iv_rulePointerExp= rulePointerExp EOF ;
    public final EObject entryRulePointerExp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointerExp = null;


        try {
            // InternalC.g:2063:51: (iv_rulePointerExp= rulePointerExp EOF )
            // InternalC.g:2064:2: iv_rulePointerExp= rulePointerExp EOF
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
    // InternalC.g:2070:1: rulePointerExp returns [EObject current=null] : ( () otherlv_1= '**' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject rulePointerExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalC.g:2076:2: ( ( () otherlv_1= '**' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalC.g:2077:2: ( () otherlv_1= '**' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalC.g:2077:2: ( () otherlv_1= '**' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalC.g:2078:3: () otherlv_1= '**' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            // InternalC.g:2078:3: ()
            // InternalC.g:2079:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPointerExpAccess().getPointerExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getPointerExpAccess().getAsteriskAsteriskKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getPointerExpAccess().getLeftParenthesisKeyword_2());
            		
            // InternalC.g:2093:3: ( (lv_exp_3_0= ruleExpression ) )
            // InternalC.g:2094:4: (lv_exp_3_0= ruleExpression )
            {
            // InternalC.g:2094:4: (lv_exp_3_0= ruleExpression )
            // InternalC.g:2095:5: lv_exp_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getPointerExpAccess().getExpExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
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
    // InternalC.g:2120:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // InternalC.g:2120:45: (iv_ruleCase= ruleCase EOF )
            // InternalC.g:2121:2: iv_ruleCase= ruleCase EOF
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
    // InternalC.g:2127:1: ruleCase returns [EObject current=null] : (otherlv_0= 'case' ( (lv_val_1_0= ruleAtom ) ) otherlv_2= ':' ( (lv_commands_3_0= ruleCommand ) )* ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_val_1_0 = null;

        EObject lv_commands_3_0 = null;



        	enterRule();

        try {
            // InternalC.g:2133:2: ( (otherlv_0= 'case' ( (lv_val_1_0= ruleAtom ) ) otherlv_2= ':' ( (lv_commands_3_0= ruleCommand ) )* ) )
            // InternalC.g:2134:2: (otherlv_0= 'case' ( (lv_val_1_0= ruleAtom ) ) otherlv_2= ':' ( (lv_commands_3_0= ruleCommand ) )* )
            {
            // InternalC.g:2134:2: (otherlv_0= 'case' ( (lv_val_1_0= ruleAtom ) ) otherlv_2= ':' ( (lv_commands_3_0= ruleCommand ) )* )
            // InternalC.g:2135:3: otherlv_0= 'case' ( (lv_val_1_0= ruleAtom ) ) otherlv_2= ':' ( (lv_commands_3_0= ruleCommand ) )*
            {
            otherlv_0=(Token)match(input,42,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getCaseAccess().getCaseKeyword_0());
            		
            // InternalC.g:2139:3: ( (lv_val_1_0= ruleAtom ) )
            // InternalC.g:2140:4: (lv_val_1_0= ruleAtom )
            {
            // InternalC.g:2140:4: (lv_val_1_0= ruleAtom )
            // InternalC.g:2141:5: lv_val_1_0= ruleAtom
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
            		
            // InternalC.g:2162:3: ( (lv_commands_3_0= ruleCommand ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID||(LA36_0>=RULE_UO && LA36_0<=RULE_STRING)||LA36_0==18||(LA36_0>=23 && LA36_0<=24)||LA36_0==26||(LA36_0>=28 && LA36_0<=30)||(LA36_0>=33 && LA36_0<=37)||(LA36_0>=43 && LA36_0<=44)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalC.g:2163:4: (lv_commands_3_0= ruleCommand )
            	    {
            	    // InternalC.g:2163:4: (lv_commands_3_0= ruleCommand )
            	    // InternalC.g:2164:5: lv_commands_3_0= ruleCommand
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
            	    break loop36;
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
    // InternalC.g:2185:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalC.g:2185:45: (iv_ruleType= ruleType EOF )
            // InternalC.g:2186:2: iv_ruleType= ruleType EOF
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
    // InternalC.g:2192:1: ruleType returns [EObject current=null] : ( ( (lv_tipo_0_0= RULE_TYPELIT ) ) (otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' )? ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_tipo_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalC.g:2198:2: ( ( ( (lv_tipo_0_0= RULE_TYPELIT ) ) (otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' )? ) )
            // InternalC.g:2199:2: ( ( (lv_tipo_0_0= RULE_TYPELIT ) ) (otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' )? )
            {
            // InternalC.g:2199:2: ( ( (lv_tipo_0_0= RULE_TYPELIT ) ) (otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' )? )
            // InternalC.g:2200:3: ( (lv_tipo_0_0= RULE_TYPELIT ) ) (otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' )?
            {
            // InternalC.g:2200:3: ( (lv_tipo_0_0= RULE_TYPELIT ) )
            // InternalC.g:2201:4: (lv_tipo_0_0= RULE_TYPELIT )
            {
            // InternalC.g:2201:4: (lv_tipo_0_0= RULE_TYPELIT )
            // InternalC.g:2202:5: lv_tipo_0_0= RULE_TYPELIT
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

            // InternalC.g:2218:3: (otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==40) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalC.g:2219:4: otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_36); 

                    				newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalC.g:2223:4: ( (lv_exp_2_0= ruleExpression ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_ID||LA37_0==RULE_UO||(LA37_0>=RULE_INT && LA37_0<=RULE_STRING)||LA37_0==18||LA37_0==23||(LA37_0>=43 && LA37_0<=44)) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalC.g:2224:5: (lv_exp_2_0= ruleExpression )
                            {
                            // InternalC.g:2224:5: (lv_exp_2_0= ruleExpression )
                            // InternalC.g:2225:6: lv_exp_2_0= ruleExpression
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
    // InternalC.g:2251:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalC.g:2251:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalC.g:2252:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalC.g:2258:1: ruleLiteral returns [EObject current=null] : ( ( () ( (lv_val_1_0= RULE_INT ) ) ) | ( () otherlv_3= 'true' ) | ( () otherlv_5= 'false' ) | ( () ( (lv_val_7_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_val_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_val_7_0=null;


        	enterRule();

        try {
            // InternalC.g:2264:2: ( ( ( () ( (lv_val_1_0= RULE_INT ) ) ) | ( () otherlv_3= 'true' ) | ( () otherlv_5= 'false' ) | ( () ( (lv_val_7_0= RULE_STRING ) ) ) ) )
            // InternalC.g:2265:2: ( ( () ( (lv_val_1_0= RULE_INT ) ) ) | ( () otherlv_3= 'true' ) | ( () otherlv_5= 'false' ) | ( () ( (lv_val_7_0= RULE_STRING ) ) ) )
            {
            // InternalC.g:2265:2: ( ( () ( (lv_val_1_0= RULE_INT ) ) ) | ( () otherlv_3= 'true' ) | ( () otherlv_5= 'false' ) | ( () ( (lv_val_7_0= RULE_STRING ) ) ) )
            int alt39=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt39=1;
                }
                break;
            case 43:
                {
                alt39=2;
                }
                break;
            case 44:
                {
                alt39=3;
                }
                break;
            case RULE_STRING:
                {
                alt39=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalC.g:2266:3: ( () ( (lv_val_1_0= RULE_INT ) ) )
                    {
                    // InternalC.g:2266:3: ( () ( (lv_val_1_0= RULE_INT ) ) )
                    // InternalC.g:2267:4: () ( (lv_val_1_0= RULE_INT ) )
                    {
                    // InternalC.g:2267:4: ()
                    // InternalC.g:2268:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLiteralAccess().getIntLitAction_0_0(),
                    						current);
                    				

                    }

                    // InternalC.g:2274:4: ( (lv_val_1_0= RULE_INT ) )
                    // InternalC.g:2275:5: (lv_val_1_0= RULE_INT )
                    {
                    // InternalC.g:2275:5: (lv_val_1_0= RULE_INT )
                    // InternalC.g:2276:6: lv_val_1_0= RULE_INT
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
                    // InternalC.g:2294:3: ( () otherlv_3= 'true' )
                    {
                    // InternalC.g:2294:3: ( () otherlv_3= 'true' )
                    // InternalC.g:2295:4: () otherlv_3= 'true'
                    {
                    // InternalC.g:2295:4: ()
                    // InternalC.g:2296:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLiteralAccess().getTrueLitAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,43,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getLiteralAccess().getTrueKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalC.g:2308:3: ( () otherlv_5= 'false' )
                    {
                    // InternalC.g:2308:3: ( () otherlv_5= 'false' )
                    // InternalC.g:2309:4: () otherlv_5= 'false'
                    {
                    // InternalC.g:2309:4: ()
                    // InternalC.g:2310:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLiteralAccess().getFalseLitAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,44,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getLiteralAccess().getFalseKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalC.g:2322:3: ( () ( (lv_val_7_0= RULE_STRING ) ) )
                    {
                    // InternalC.g:2322:3: ( () ( (lv_val_7_0= RULE_STRING ) ) )
                    // InternalC.g:2323:4: () ( (lv_val_7_0= RULE_STRING ) )
                    {
                    // InternalC.g:2323:4: ()
                    // InternalC.g:2324:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLiteralAccess().getStrLitAction_3_0(),
                    						current);
                    				

                    }

                    // InternalC.g:2330:4: ( (lv_val_7_0= RULE_STRING ) )
                    // InternalC.g:2331:5: (lv_val_7_0= RULE_STRING )
                    {
                    // InternalC.g:2331:5: (lv_val_7_0= RULE_STRING )
                    // InternalC.g:2332:6: lv_val_7_0= RULE_STRING
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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100400L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000183E75C61E10L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000004002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001420400L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000180000841810L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000180000841A10L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000002L});
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