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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_LO", "RULE_RO", "RULE_AO1", "RULE_AO2", "RULE_UO", "RULE_TYPELIT", "RULE_INT", "RULE_TRUE", "RULE_FALSE", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "'('", "','", "')'", "'{'", "'}'", "'**'", "'struct'", "';'", "'if'", "'else'", "'while'", "'for'", "'switch'", "'default'", "':'", "'do'", "'break'", "'continue'", "'return'", "'='", "'['", "']'", "'.'", "'case'"
    };
    public static final int T__19=19;
    public static final int RULE_TYPELIT=10;
    public static final int RULE_ID=4;
    public static final int RULE_UO=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int RULE_AO1=7;
    public static final int T__25=25;
    public static final int RULE_AO2=8;
    public static final int RULE_FALSE=13;
    public static final int RULE_LO=5;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=14;
    public static final int RULE_SL_COMMENT=16;
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
    public static final int RULE_WS=17;
    public static final int RULE_ANY_OTHER=18;
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

                if ( (LA1_0==RULE_TYPELIT||LA1_0==19||LA1_0==26) ) {
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
            case 26:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==23) ) {
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
            case 19:
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

            otherlv_1=(Token)match(input,19,FOLLOW_4); 

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

            otherlv_4=(Token)match(input,20,FOLLOW_7); 

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

                        if ( (LA3_0==21) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalC.g:233:5: otherlv_6= ',' ( (lv_params_7_0= ruleIdDef ) )
                    	    {
                    	    otherlv_6=(Token)match(input,21,FOLLOW_4); 

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

            otherlv_8=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_6());
            		
            otherlv_9=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalC.g:266:3: ( (lv_commands_10_0= ruleCommand ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||(LA5_0>=RULE_UO && LA5_0<=RULE_FALSE)||LA5_0==20||(LA5_0>=25 && LA5_0<=26)||LA5_0==28||(LA5_0>=30 && LA5_0<=32)||(LA5_0>=35 && LA5_0<=38)) ) {
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

            otherlv_11=(Token)match(input,24,FOLLOW_2); 

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
    // InternalC.g:300:1: ruleDeclaration returns [EObject current=null] : ( () ( ( ( (lv_tipo_1_0= ruleType ) ) (otherlv_2= '**' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_val_4_0= ruleAssignment ) )? ) | (otherlv_5= 'struct' ( (otherlv_6= RULE_ID ) ) ( (lv_name_7_0= RULE_ID ) ) ) ) otherlv_8= ';' ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        EObject lv_tipo_1_0 = null;

        EObject lv_val_4_0 = null;



        	enterRule();

        try {
            // InternalC.g:306:2: ( ( () ( ( ( (lv_tipo_1_0= ruleType ) ) (otherlv_2= '**' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_val_4_0= ruleAssignment ) )? ) | (otherlv_5= 'struct' ( (otherlv_6= RULE_ID ) ) ( (lv_name_7_0= RULE_ID ) ) ) ) otherlv_8= ';' ) )
            // InternalC.g:307:2: ( () ( ( ( (lv_tipo_1_0= ruleType ) ) (otherlv_2= '**' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_val_4_0= ruleAssignment ) )? ) | (otherlv_5= 'struct' ( (otherlv_6= RULE_ID ) ) ( (lv_name_7_0= RULE_ID ) ) ) ) otherlv_8= ';' )
            {
            // InternalC.g:307:2: ( () ( ( ( (lv_tipo_1_0= ruleType ) ) (otherlv_2= '**' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_val_4_0= ruleAssignment ) )? ) | (otherlv_5= 'struct' ( (otherlv_6= RULE_ID ) ) ( (lv_name_7_0= RULE_ID ) ) ) ) otherlv_8= ';' )
            // InternalC.g:308:3: () ( ( ( (lv_tipo_1_0= ruleType ) ) (otherlv_2= '**' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_val_4_0= ruleAssignment ) )? ) | (otherlv_5= 'struct' ( (otherlv_6= RULE_ID ) ) ( (lv_name_7_0= RULE_ID ) ) ) ) otherlv_8= ';'
            {
            // InternalC.g:308:3: ()
            // InternalC.g:309:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeclarationAccess().getDeclarationAction_0(),
            					current);
            			

            }

            // InternalC.g:315:3: ( ( ( (lv_tipo_1_0= ruleType ) ) (otherlv_2= '**' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_val_4_0= ruleAssignment ) )? ) | (otherlv_5= 'struct' ( (otherlv_6= RULE_ID ) ) ( (lv_name_7_0= RULE_ID ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_TYPELIT) ) {
                alt8=1;
            }
            else if ( (LA8_0==26) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalC.g:316:4: ( ( (lv_tipo_1_0= ruleType ) ) (otherlv_2= '**' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_val_4_0= ruleAssignment ) )? )
                    {
                    // InternalC.g:316:4: ( ( (lv_tipo_1_0= ruleType ) ) (otherlv_2= '**' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_val_4_0= ruleAssignment ) )? )
                    // InternalC.g:317:5: ( (lv_tipo_1_0= ruleType ) ) (otherlv_2= '**' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_val_4_0= ruleAssignment ) )?
                    {
                    // InternalC.g:317:5: ( (lv_tipo_1_0= ruleType ) )
                    // InternalC.g:318:6: (lv_tipo_1_0= ruleType )
                    {
                    // InternalC.g:318:6: (lv_tipo_1_0= ruleType )
                    // InternalC.g:319:7: lv_tipo_1_0= ruleType
                    {

                    							newCompositeNode(grammarAccess.getDeclarationAccess().getTipoTypeParserRuleCall_1_0_0_0());
                    						
                    pushFollow(FOLLOW_11);
                    lv_tipo_1_0=ruleType();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDeclarationRule());
                    							}
                    							set(
                    								current,
                    								"tipo",
                    								lv_tipo_1_0,
                    								"com.poli.compilador.C.Type");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalC.g:336:5: (otherlv_2= '**' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==25) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalC.g:337:6: otherlv_2= '**'
                            {
                            otherlv_2=(Token)match(input,25,FOLLOW_5); 

                            						newLeafNode(otherlv_2, grammarAccess.getDeclarationAccess().getAsteriskAsteriskKeyword_1_0_1());
                            					

                            }
                            break;

                    }

                    // InternalC.g:342:5: ( (lv_name_3_0= RULE_ID ) )
                    // InternalC.g:343:6: (lv_name_3_0= RULE_ID )
                    {
                    // InternalC.g:343:6: (lv_name_3_0= RULE_ID )
                    // InternalC.g:344:7: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_12); 

                    							newLeafNode(lv_name_3_0, grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_1_0_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getDeclarationRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_3_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }

                    // InternalC.g:360:5: ( (lv_val_4_0= ruleAssignment ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==39) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalC.g:361:6: (lv_val_4_0= ruleAssignment )
                            {
                            // InternalC.g:361:6: (lv_val_4_0= ruleAssignment )
                            // InternalC.g:362:7: lv_val_4_0= ruleAssignment
                            {

                            							newCompositeNode(grammarAccess.getDeclarationAccess().getValAssignmentParserRuleCall_1_0_3_0());
                            						
                            pushFollow(FOLLOW_13);
                            lv_val_4_0=ruleAssignment();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getDeclarationRule());
                            							}
                            							set(
                            								current,
                            								"val",
                            								lv_val_4_0,
                            								"com.poli.compilador.C.Assignment");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalC.g:381:4: (otherlv_5= 'struct' ( (otherlv_6= RULE_ID ) ) ( (lv_name_7_0= RULE_ID ) ) )
                    {
                    // InternalC.g:381:4: (otherlv_5= 'struct' ( (otherlv_6= RULE_ID ) ) ( (lv_name_7_0= RULE_ID ) ) )
                    // InternalC.g:382:5: otherlv_5= 'struct' ( (otherlv_6= RULE_ID ) ) ( (lv_name_7_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_5); 

                    					newLeafNode(otherlv_5, grammarAccess.getDeclarationAccess().getStructKeyword_1_1_0());
                    				
                    // InternalC.g:386:5: ( (otherlv_6= RULE_ID ) )
                    // InternalC.g:387:6: (otherlv_6= RULE_ID )
                    {
                    // InternalC.g:387:6: (otherlv_6= RULE_ID )
                    // InternalC.g:388:7: otherlv_6= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getDeclarationRule());
                    							}
                    						
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_5); 

                    							newLeafNode(otherlv_6, grammarAccess.getDeclarationAccess().getStrStructCrossReference_1_1_1_0());
                    						

                    }


                    }

                    // InternalC.g:399:5: ( (lv_name_7_0= RULE_ID ) )
                    // InternalC.g:400:6: (lv_name_7_0= RULE_ID )
                    {
                    // InternalC.g:400:6: (lv_name_7_0= RULE_ID )
                    // InternalC.g:401:7: lv_name_7_0= RULE_ID
                    {
                    lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_13); 

                    							newLeafNode(lv_name_7_0, grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_1_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getDeclarationRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_7_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDeclarationAccess().getSemicolonKeyword_2());
            		

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
    // InternalC.g:427:1: entryRuleStruct returns [EObject current=null] : iv_ruleStruct= ruleStruct EOF ;
    public final EObject entryRuleStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStruct = null;


        try {
            // InternalC.g:427:47: (iv_ruleStruct= ruleStruct EOF )
            // InternalC.g:428:2: iv_ruleStruct= ruleStruct EOF
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
    // InternalC.g:434:1: ruleStruct returns [EObject current=null] : ( () otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_decl_4_0= ruleDeclaration ) )* otherlv_5= '}' otherlv_6= ';' ) ;
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
            // InternalC.g:440:2: ( ( () otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_decl_4_0= ruleDeclaration ) )* otherlv_5= '}' otherlv_6= ';' ) )
            // InternalC.g:441:2: ( () otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_decl_4_0= ruleDeclaration ) )* otherlv_5= '}' otherlv_6= ';' )
            {
            // InternalC.g:441:2: ( () otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_decl_4_0= ruleDeclaration ) )* otherlv_5= '}' otherlv_6= ';' )
            // InternalC.g:442:3: () otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_decl_4_0= ruleDeclaration ) )* otherlv_5= '}' otherlv_6= ';'
            {
            // InternalC.g:442:3: ()
            // InternalC.g:443:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStructAccess().getStructAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getStructAccess().getStructKeyword_1());
            		
            // InternalC.g:453:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalC.g:454:4: (lv_name_2_0= RULE_ID )
            {
            // InternalC.g:454:4: (lv_name_2_0= RULE_ID )
            // InternalC.g:455:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getStructAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalC.g:475:3: ( (lv_decl_4_0= ruleDeclaration ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_TYPELIT||LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalC.g:476:4: (lv_decl_4_0= ruleDeclaration )
            	    {
            	    // InternalC.g:476:4: (lv_decl_4_0= ruleDeclaration )
            	    // InternalC.g:477:5: lv_decl_4_0= ruleDeclaration
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

            otherlv_5=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getStructAccess().getRightCurlyBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,27,FOLLOW_2); 

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
    // InternalC.g:506:1: entryRuleIdDef returns [EObject current=null] : iv_ruleIdDef= ruleIdDef EOF ;
    public final EObject entryRuleIdDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdDef = null;


        try {
            // InternalC.g:506:46: (iv_ruleIdDef= ruleIdDef EOF )
            // InternalC.g:507:2: iv_ruleIdDef= ruleIdDef EOF
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
    // InternalC.g:513:1: ruleIdDef returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleType ) ) ( (lv_name_1_0= ruleVariable ) ) ) ;
    public final EObject ruleIdDef() throws RecognitionException {
        EObject current = null;

        EObject lv_tipo_0_0 = null;

        EObject lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalC.g:519:2: ( ( ( (lv_tipo_0_0= ruleType ) ) ( (lv_name_1_0= ruleVariable ) ) ) )
            // InternalC.g:520:2: ( ( (lv_tipo_0_0= ruleType ) ) ( (lv_name_1_0= ruleVariable ) ) )
            {
            // InternalC.g:520:2: ( ( (lv_tipo_0_0= ruleType ) ) ( (lv_name_1_0= ruleVariable ) ) )
            // InternalC.g:521:3: ( (lv_tipo_0_0= ruleType ) ) ( (lv_name_1_0= ruleVariable ) )
            {
            // InternalC.g:521:3: ( (lv_tipo_0_0= ruleType ) )
            // InternalC.g:522:4: (lv_tipo_0_0= ruleType )
            {
            // InternalC.g:522:4: (lv_tipo_0_0= ruleType )
            // InternalC.g:523:5: lv_tipo_0_0= ruleType
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

            // InternalC.g:540:3: ( (lv_name_1_0= ruleVariable ) )
            // InternalC.g:541:4: (lv_name_1_0= ruleVariable )
            {
            // InternalC.g:541:4: (lv_name_1_0= ruleVariable )
            // InternalC.g:542:5: lv_name_1_0= ruleVariable
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
    // InternalC.g:563:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalC.g:563:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalC.g:564:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalC.g:570:1: ruleVariable returns [EObject current=null] : ( ( () this_ID_1= RULE_ID ) | this_PointerExp_2= rulePointerExp ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token this_ID_1=null;
        EObject this_PointerExp_2 = null;



        	enterRule();

        try {
            // InternalC.g:576:2: ( ( ( () this_ID_1= RULE_ID ) | this_PointerExp_2= rulePointerExp ) )
            // InternalC.g:577:2: ( ( () this_ID_1= RULE_ID ) | this_PointerExp_2= rulePointerExp )
            {
            // InternalC.g:577:2: ( ( () this_ID_1= RULE_ID ) | this_PointerExp_2= rulePointerExp )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==25) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalC.g:578:3: ( () this_ID_1= RULE_ID )
                    {
                    // InternalC.g:578:3: ( () this_ID_1= RULE_ID )
                    // InternalC.g:579:4: () this_ID_1= RULE_ID
                    {
                    // InternalC.g:579:4: ()
                    // InternalC.g:580:5: 
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
                    // InternalC.g:592:3: this_PointerExp_2= rulePointerExp
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
    // InternalC.g:604:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalC.g:604:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalC.g:605:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalC.g:611:1: ruleCommand returns [EObject current=null] : ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_trueCommands_5_0= ruleCommandBlock ) ) (otherlv_6= 'else' ( (lv_falseCommands_7_0= ruleCommandBlock ) ) )? ) | ( () otherlv_9= 'while' otherlv_10= '(' ( (lv_exp_11_0= ruleExpression ) ) otherlv_12= ')' ( (lv_commands_13_0= ruleCommandBlock ) ) ) | ( () otherlv_15= 'for' otherlv_16= '(' ( (lv_init_17_0= rulelValue ) ) ( (lv_init_18_0= ruleAssignment ) ) otherlv_19= ';' ( (lv_exp_20_0= ruleExpression ) ) otherlv_21= ';' ( (lv_inc_22_0= ruleFactor ) ) ( (lv_inc_23_0= ruleAssignment ) )? otherlv_24= ')' ( (lv_commands_25_0= ruleCommandBlock ) ) ) | ( () otherlv_27= 'switch' otherlv_28= '(' ( (lv_exp_29_0= ruleExpression ) ) otherlv_30= ')' otherlv_31= '{' ( (lv_cases_32_0= ruleCase ) )* (otherlv_33= 'default' otherlv_34= ':' ( (lv_commands_35_0= ruleCommand ) )* )? otherlv_36= '}' ) | ( () otherlv_38= 'do' ( (lv_commands_39_0= ruleCommandBlock ) ) otherlv_40= 'while' otherlv_41= '(' ( (lv_exp_42_0= ruleExpression ) ) otherlv_43= ')' otherlv_44= ';' ) | ( () ( (lv_val_46_0= ruleFactor ) ) ( (lv_val_47_0= ruleAssignment ) )? otherlv_48= ';' ) | ( () otherlv_50= 'break' otherlv_51= ';' ) | ( () otherlv_53= 'continue' otherlv_54= ';' ) | ( () otherlv_56= 'return' ( (lv_exp_57_0= ruleExpression ) )? otherlv_58= ';' ) | this_Declaration_59= ruleDeclaration ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_24=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_48=null;
        Token otherlv_50=null;
        Token otherlv_51=null;
        Token otherlv_53=null;
        Token otherlv_54=null;
        Token otherlv_56=null;
        Token otherlv_58=null;
        EObject lv_exp_3_0 = null;

        EObject lv_trueCommands_5_0 = null;

        EObject lv_falseCommands_7_0 = null;

        EObject lv_exp_11_0 = null;

        EObject lv_commands_13_0 = null;

        EObject lv_init_17_0 = null;

        EObject lv_init_18_0 = null;

        EObject lv_exp_20_0 = null;

        EObject lv_inc_22_0 = null;

        EObject lv_inc_23_0 = null;

        EObject lv_commands_25_0 = null;

        EObject lv_exp_29_0 = null;

        EObject lv_cases_32_0 = null;

        EObject lv_commands_35_0 = null;

        EObject lv_commands_39_0 = null;

        EObject lv_exp_42_0 = null;

        EObject lv_val_46_0 = null;

        EObject lv_val_47_0 = null;

        EObject lv_exp_57_0 = null;

        EObject this_Declaration_59 = null;



        	enterRule();

        try {
            // InternalC.g:617:2: ( ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_trueCommands_5_0= ruleCommandBlock ) ) (otherlv_6= 'else' ( (lv_falseCommands_7_0= ruleCommandBlock ) ) )? ) | ( () otherlv_9= 'while' otherlv_10= '(' ( (lv_exp_11_0= ruleExpression ) ) otherlv_12= ')' ( (lv_commands_13_0= ruleCommandBlock ) ) ) | ( () otherlv_15= 'for' otherlv_16= '(' ( (lv_init_17_0= rulelValue ) ) ( (lv_init_18_0= ruleAssignment ) ) otherlv_19= ';' ( (lv_exp_20_0= ruleExpression ) ) otherlv_21= ';' ( (lv_inc_22_0= ruleFactor ) ) ( (lv_inc_23_0= ruleAssignment ) )? otherlv_24= ')' ( (lv_commands_25_0= ruleCommandBlock ) ) ) | ( () otherlv_27= 'switch' otherlv_28= '(' ( (lv_exp_29_0= ruleExpression ) ) otherlv_30= ')' otherlv_31= '{' ( (lv_cases_32_0= ruleCase ) )* (otherlv_33= 'default' otherlv_34= ':' ( (lv_commands_35_0= ruleCommand ) )* )? otherlv_36= '}' ) | ( () otherlv_38= 'do' ( (lv_commands_39_0= ruleCommandBlock ) ) otherlv_40= 'while' otherlv_41= '(' ( (lv_exp_42_0= ruleExpression ) ) otherlv_43= ')' otherlv_44= ';' ) | ( () ( (lv_val_46_0= ruleFactor ) ) ( (lv_val_47_0= ruleAssignment ) )? otherlv_48= ';' ) | ( () otherlv_50= 'break' otherlv_51= ';' ) | ( () otherlv_53= 'continue' otherlv_54= ';' ) | ( () otherlv_56= 'return' ( (lv_exp_57_0= ruleExpression ) )? otherlv_58= ';' ) | this_Declaration_59= ruleDeclaration ) )
            // InternalC.g:618:2: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_trueCommands_5_0= ruleCommandBlock ) ) (otherlv_6= 'else' ( (lv_falseCommands_7_0= ruleCommandBlock ) ) )? ) | ( () otherlv_9= 'while' otherlv_10= '(' ( (lv_exp_11_0= ruleExpression ) ) otherlv_12= ')' ( (lv_commands_13_0= ruleCommandBlock ) ) ) | ( () otherlv_15= 'for' otherlv_16= '(' ( (lv_init_17_0= rulelValue ) ) ( (lv_init_18_0= ruleAssignment ) ) otherlv_19= ';' ( (lv_exp_20_0= ruleExpression ) ) otherlv_21= ';' ( (lv_inc_22_0= ruleFactor ) ) ( (lv_inc_23_0= ruleAssignment ) )? otherlv_24= ')' ( (lv_commands_25_0= ruleCommandBlock ) ) ) | ( () otherlv_27= 'switch' otherlv_28= '(' ( (lv_exp_29_0= ruleExpression ) ) otherlv_30= ')' otherlv_31= '{' ( (lv_cases_32_0= ruleCase ) )* (otherlv_33= 'default' otherlv_34= ':' ( (lv_commands_35_0= ruleCommand ) )* )? otherlv_36= '}' ) | ( () otherlv_38= 'do' ( (lv_commands_39_0= ruleCommandBlock ) ) otherlv_40= 'while' otherlv_41= '(' ( (lv_exp_42_0= ruleExpression ) ) otherlv_43= ')' otherlv_44= ';' ) | ( () ( (lv_val_46_0= ruleFactor ) ) ( (lv_val_47_0= ruleAssignment ) )? otherlv_48= ';' ) | ( () otherlv_50= 'break' otherlv_51= ';' ) | ( () otherlv_53= 'continue' otherlv_54= ';' ) | ( () otherlv_56= 'return' ( (lv_exp_57_0= ruleExpression ) )? otherlv_58= ';' ) | this_Declaration_59= ruleDeclaration )
            {
            // InternalC.g:618:2: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_trueCommands_5_0= ruleCommandBlock ) ) (otherlv_6= 'else' ( (lv_falseCommands_7_0= ruleCommandBlock ) ) )? ) | ( () otherlv_9= 'while' otherlv_10= '(' ( (lv_exp_11_0= ruleExpression ) ) otherlv_12= ')' ( (lv_commands_13_0= ruleCommandBlock ) ) ) | ( () otherlv_15= 'for' otherlv_16= '(' ( (lv_init_17_0= rulelValue ) ) ( (lv_init_18_0= ruleAssignment ) ) otherlv_19= ';' ( (lv_exp_20_0= ruleExpression ) ) otherlv_21= ';' ( (lv_inc_22_0= ruleFactor ) ) ( (lv_inc_23_0= ruleAssignment ) )? otherlv_24= ')' ( (lv_commands_25_0= ruleCommandBlock ) ) ) | ( () otherlv_27= 'switch' otherlv_28= '(' ( (lv_exp_29_0= ruleExpression ) ) otherlv_30= ')' otherlv_31= '{' ( (lv_cases_32_0= ruleCase ) )* (otherlv_33= 'default' otherlv_34= ':' ( (lv_commands_35_0= ruleCommand ) )* )? otherlv_36= '}' ) | ( () otherlv_38= 'do' ( (lv_commands_39_0= ruleCommandBlock ) ) otherlv_40= 'while' otherlv_41= '(' ( (lv_exp_42_0= ruleExpression ) ) otherlv_43= ')' otherlv_44= ';' ) | ( () ( (lv_val_46_0= ruleFactor ) ) ( (lv_val_47_0= ruleAssignment ) )? otherlv_48= ';' ) | ( () otherlv_50= 'break' otherlv_51= ';' ) | ( () otherlv_53= 'continue' otherlv_54= ';' ) | ( () otherlv_56= 'return' ( (lv_exp_57_0= ruleExpression ) )? otherlv_58= ';' ) | this_Declaration_59= ruleDeclaration )
            int alt18=10;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt18=1;
                }
                break;
            case 30:
                {
                alt18=2;
                }
                break;
            case 31:
                {
                alt18=3;
                }
                break;
            case 32:
                {
                alt18=4;
                }
                break;
            case 35:
                {
                alt18=5;
                }
                break;
            case RULE_ID:
            case RULE_UO:
            case RULE_INT:
            case RULE_TRUE:
            case RULE_FALSE:
            case 20:
            case 25:
                {
                alt18=6;
                }
                break;
            case 36:
                {
                alt18=7;
                }
                break;
            case 37:
                {
                alt18=8;
                }
                break;
            case 38:
                {
                alt18=9;
                }
                break;
            case RULE_TYPELIT:
            case 26:
                {
                alt18=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalC.g:619:3: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_trueCommands_5_0= ruleCommandBlock ) ) (otherlv_6= 'else' ( (lv_falseCommands_7_0= ruleCommandBlock ) ) )? )
                    {
                    // InternalC.g:619:3: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_trueCommands_5_0= ruleCommandBlock ) ) (otherlv_6= 'else' ( (lv_falseCommands_7_0= ruleCommandBlock ) ) )? )
                    // InternalC.g:620:4: () otherlv_1= 'if' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_trueCommands_5_0= ruleCommandBlock ) ) (otherlv_6= 'else' ( (lv_falseCommands_7_0= ruleCommandBlock ) ) )?
                    {
                    // InternalC.g:620:4: ()
                    // InternalC.g:621:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getIfCmdAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getCommandAccess().getIfKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getCommandAccess().getLeftParenthesisKeyword_0_2());
                    			
                    // InternalC.g:635:4: ( (lv_exp_3_0= ruleExpression ) )
                    // InternalC.g:636:5: (lv_exp_3_0= ruleExpression )
                    {
                    // InternalC.g:636:5: (lv_exp_3_0= ruleExpression )
                    // InternalC.g:637:6: lv_exp_3_0= ruleExpression
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

                    otherlv_4=(Token)match(input,22,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getCommandAccess().getRightParenthesisKeyword_0_4());
                    			
                    // InternalC.g:658:4: ( (lv_trueCommands_5_0= ruleCommandBlock ) )
                    // InternalC.g:659:5: (lv_trueCommands_5_0= ruleCommandBlock )
                    {
                    // InternalC.g:659:5: (lv_trueCommands_5_0= ruleCommandBlock )
                    // InternalC.g:660:6: lv_trueCommands_5_0= ruleCommandBlock
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getTrueCommandsCommandBlockParserRuleCall_0_5_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_trueCommands_5_0=ruleCommandBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						set(
                    							current,
                    							"trueCommands",
                    							lv_trueCommands_5_0,
                    							"com.poli.compilador.C.CommandBlock");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalC.g:677:4: (otherlv_6= 'else' ( (lv_falseCommands_7_0= ruleCommandBlock ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==29) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalC.g:678:5: otherlv_6= 'else' ( (lv_falseCommands_7_0= ruleCommandBlock ) )
                            {
                            otherlv_6=(Token)match(input,29,FOLLOW_9); 

                            					newLeafNode(otherlv_6, grammarAccess.getCommandAccess().getElseKeyword_0_6_0());
                            				
                            // InternalC.g:682:5: ( (lv_falseCommands_7_0= ruleCommandBlock ) )
                            // InternalC.g:683:6: (lv_falseCommands_7_0= ruleCommandBlock )
                            {
                            // InternalC.g:683:6: (lv_falseCommands_7_0= ruleCommandBlock )
                            // InternalC.g:684:7: lv_falseCommands_7_0= ruleCommandBlock
                            {

                            							newCompositeNode(grammarAccess.getCommandAccess().getFalseCommandsCommandBlockParserRuleCall_0_6_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_falseCommands_7_0=ruleCommandBlock();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getCommandRule());
                            							}
                            							set(
                            								current,
                            								"falseCommands",
                            								lv_falseCommands_7_0,
                            								"com.poli.compilador.C.CommandBlock");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalC.g:704:3: ( () otherlv_9= 'while' otherlv_10= '(' ( (lv_exp_11_0= ruleExpression ) ) otherlv_12= ')' ( (lv_commands_13_0= ruleCommandBlock ) ) )
                    {
                    // InternalC.g:704:3: ( () otherlv_9= 'while' otherlv_10= '(' ( (lv_exp_11_0= ruleExpression ) ) otherlv_12= ')' ( (lv_commands_13_0= ruleCommandBlock ) ) )
                    // InternalC.g:705:4: () otherlv_9= 'while' otherlv_10= '(' ( (lv_exp_11_0= ruleExpression ) ) otherlv_12= ')' ( (lv_commands_13_0= ruleCommandBlock ) )
                    {
                    // InternalC.g:705:4: ()
                    // InternalC.g:706:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getWhileCmdAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,30,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getCommandAccess().getWhileKeyword_1_1());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_10, grammarAccess.getCommandAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalC.g:720:4: ( (lv_exp_11_0= ruleExpression ) )
                    // InternalC.g:721:5: (lv_exp_11_0= ruleExpression )
                    {
                    // InternalC.g:721:5: (lv_exp_11_0= ruleExpression )
                    // InternalC.g:722:6: lv_exp_11_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getExpExpressionParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_exp_11_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_11_0,
                    							"com.poli.compilador.C.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,22,FOLLOW_9); 

                    				newLeafNode(otherlv_12, grammarAccess.getCommandAccess().getRightParenthesisKeyword_1_4());
                    			
                    // InternalC.g:743:4: ( (lv_commands_13_0= ruleCommandBlock ) )
                    // InternalC.g:744:5: (lv_commands_13_0= ruleCommandBlock )
                    {
                    // InternalC.g:744:5: (lv_commands_13_0= ruleCommandBlock )
                    // InternalC.g:745:6: lv_commands_13_0= ruleCommandBlock
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getCommandsCommandBlockParserRuleCall_1_5_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_commands_13_0=ruleCommandBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						set(
                    							current,
                    							"commands",
                    							lv_commands_13_0,
                    							"com.poli.compilador.C.CommandBlock");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalC.g:764:3: ( () otherlv_15= 'for' otherlv_16= '(' ( (lv_init_17_0= rulelValue ) ) ( (lv_init_18_0= ruleAssignment ) ) otherlv_19= ';' ( (lv_exp_20_0= ruleExpression ) ) otherlv_21= ';' ( (lv_inc_22_0= ruleFactor ) ) ( (lv_inc_23_0= ruleAssignment ) )? otherlv_24= ')' ( (lv_commands_25_0= ruleCommandBlock ) ) )
                    {
                    // InternalC.g:764:3: ( () otherlv_15= 'for' otherlv_16= '(' ( (lv_init_17_0= rulelValue ) ) ( (lv_init_18_0= ruleAssignment ) ) otherlv_19= ';' ( (lv_exp_20_0= ruleExpression ) ) otherlv_21= ';' ( (lv_inc_22_0= ruleFactor ) ) ( (lv_inc_23_0= ruleAssignment ) )? otherlv_24= ')' ( (lv_commands_25_0= ruleCommandBlock ) ) )
                    // InternalC.g:765:4: () otherlv_15= 'for' otherlv_16= '(' ( (lv_init_17_0= rulelValue ) ) ( (lv_init_18_0= ruleAssignment ) ) otherlv_19= ';' ( (lv_exp_20_0= ruleExpression ) ) otherlv_21= ';' ( (lv_inc_22_0= ruleFactor ) ) ( (lv_inc_23_0= ruleAssignment ) )? otherlv_24= ')' ( (lv_commands_25_0= ruleCommandBlock ) )
                    {
                    // InternalC.g:765:4: ()
                    // InternalC.g:766:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getForCmdAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_15=(Token)match(input,31,FOLLOW_6); 

                    				newLeafNode(otherlv_15, grammarAccess.getCommandAccess().getForKeyword_2_1());
                    			
                    otherlv_16=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_16, grammarAccess.getCommandAccess().getLeftParenthesisKeyword_2_2());
                    			
                    // InternalC.g:780:4: ( (lv_init_17_0= rulelValue ) )
                    // InternalC.g:781:5: (lv_init_17_0= rulelValue )
                    {
                    // InternalC.g:781:5: (lv_init_17_0= rulelValue )
                    // InternalC.g:782:6: lv_init_17_0= rulelValue
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getInitLValueParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_init_17_0=rulelValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						add(
                    							current,
                    							"init",
                    							lv_init_17_0,
                    							"com.poli.compilador.C.lValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalC.g:799:4: ( (lv_init_18_0= ruleAssignment ) )
                    // InternalC.g:800:5: (lv_init_18_0= ruleAssignment )
                    {
                    // InternalC.g:800:5: (lv_init_18_0= ruleAssignment )
                    // InternalC.g:801:6: lv_init_18_0= ruleAssignment
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getInitAssignmentParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_init_18_0=ruleAssignment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						add(
                    							current,
                    							"init",
                    							lv_init_18_0,
                    							"com.poli.compilador.C.Assignment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,27,FOLLOW_15); 

                    				newLeafNode(otherlv_19, grammarAccess.getCommandAccess().getSemicolonKeyword_2_5());
                    			
                    // InternalC.g:822:4: ( (lv_exp_20_0= ruleExpression ) )
                    // InternalC.g:823:5: (lv_exp_20_0= ruleExpression )
                    {
                    // InternalC.g:823:5: (lv_exp_20_0= ruleExpression )
                    // InternalC.g:824:6: lv_exp_20_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getExpExpressionParserRuleCall_2_6_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_exp_20_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_20_0,
                    							"com.poli.compilador.C.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,27,FOLLOW_15); 

                    				newLeafNode(otherlv_21, grammarAccess.getCommandAccess().getSemicolonKeyword_2_7());
                    			
                    // InternalC.g:845:4: ( (lv_inc_22_0= ruleFactor ) )
                    // InternalC.g:846:5: (lv_inc_22_0= ruleFactor )
                    {
                    // InternalC.g:846:5: (lv_inc_22_0= ruleFactor )
                    // InternalC.g:847:6: lv_inc_22_0= ruleFactor
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getIncFactorParserRuleCall_2_8_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_inc_22_0=ruleFactor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						add(
                    							current,
                    							"inc",
                    							lv_inc_22_0,
                    							"com.poli.compilador.C.Factor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalC.g:864:4: ( (lv_inc_23_0= ruleAssignment ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==39) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalC.g:865:5: (lv_inc_23_0= ruleAssignment )
                            {
                            // InternalC.g:865:5: (lv_inc_23_0= ruleAssignment )
                            // InternalC.g:866:6: lv_inc_23_0= ruleAssignment
                            {

                            						newCompositeNode(grammarAccess.getCommandAccess().getIncAssignmentParserRuleCall_2_9_0());
                            					
                            pushFollow(FOLLOW_16);
                            lv_inc_23_0=ruleAssignment();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getCommandRule());
                            						}
                            						add(
                            							current,
                            							"inc",
                            							lv_inc_23_0,
                            							"com.poli.compilador.C.Assignment");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_24=(Token)match(input,22,FOLLOW_9); 

                    				newLeafNode(otherlv_24, grammarAccess.getCommandAccess().getRightParenthesisKeyword_2_10());
                    			
                    // InternalC.g:887:4: ( (lv_commands_25_0= ruleCommandBlock ) )
                    // InternalC.g:888:5: (lv_commands_25_0= ruleCommandBlock )
                    {
                    // InternalC.g:888:5: (lv_commands_25_0= ruleCommandBlock )
                    // InternalC.g:889:6: lv_commands_25_0= ruleCommandBlock
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getCommandsCommandBlockParserRuleCall_2_11_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_commands_25_0=ruleCommandBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						set(
                    							current,
                    							"commands",
                    							lv_commands_25_0,
                    							"com.poli.compilador.C.CommandBlock");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalC.g:908:3: ( () otherlv_27= 'switch' otherlv_28= '(' ( (lv_exp_29_0= ruleExpression ) ) otherlv_30= ')' otherlv_31= '{' ( (lv_cases_32_0= ruleCase ) )* (otherlv_33= 'default' otherlv_34= ':' ( (lv_commands_35_0= ruleCommand ) )* )? otherlv_36= '}' )
                    {
                    // InternalC.g:908:3: ( () otherlv_27= 'switch' otherlv_28= '(' ( (lv_exp_29_0= ruleExpression ) ) otherlv_30= ')' otherlv_31= '{' ( (lv_cases_32_0= ruleCase ) )* (otherlv_33= 'default' otherlv_34= ':' ( (lv_commands_35_0= ruleCommand ) )* )? otherlv_36= '}' )
                    // InternalC.g:909:4: () otherlv_27= 'switch' otherlv_28= '(' ( (lv_exp_29_0= ruleExpression ) ) otherlv_30= ')' otherlv_31= '{' ( (lv_cases_32_0= ruleCase ) )* (otherlv_33= 'default' otherlv_34= ':' ( (lv_commands_35_0= ruleCommand ) )* )? otherlv_36= '}'
                    {
                    // InternalC.g:909:4: ()
                    // InternalC.g:910:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getSwitchCmdAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_27=(Token)match(input,32,FOLLOW_6); 

                    				newLeafNode(otherlv_27, grammarAccess.getCommandAccess().getSwitchKeyword_3_1());
                    			
                    otherlv_28=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_28, grammarAccess.getCommandAccess().getLeftParenthesisKeyword_3_2());
                    			
                    // InternalC.g:924:4: ( (lv_exp_29_0= ruleExpression ) )
                    // InternalC.g:925:5: (lv_exp_29_0= ruleExpression )
                    {
                    // InternalC.g:925:5: (lv_exp_29_0= ruleExpression )
                    // InternalC.g:926:6: lv_exp_29_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getExpExpressionParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_exp_29_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_29_0,
                    							"com.poli.compilador.C.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_30=(Token)match(input,22,FOLLOW_9); 

                    				newLeafNode(otherlv_30, grammarAccess.getCommandAccess().getRightParenthesisKeyword_3_4());
                    			
                    otherlv_31=(Token)match(input,23,FOLLOW_20); 

                    				newLeafNode(otherlv_31, grammarAccess.getCommandAccess().getLeftCurlyBracketKeyword_3_5());
                    			
                    // InternalC.g:951:4: ( (lv_cases_32_0= ruleCase ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==43) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalC.g:952:5: (lv_cases_32_0= ruleCase )
                    	    {
                    	    // InternalC.g:952:5: (lv_cases_32_0= ruleCase )
                    	    // InternalC.g:953:6: lv_cases_32_0= ruleCase
                    	    {

                    	    						newCompositeNode(grammarAccess.getCommandAccess().getCasesCaseParserRuleCall_3_6_0());
                    	    					
                    	    pushFollow(FOLLOW_20);
                    	    lv_cases_32_0=ruleCase();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"cases",
                    	    							lv_cases_32_0,
                    	    							"com.poli.compilador.C.Case");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // InternalC.g:970:4: (otherlv_33= 'default' otherlv_34= ':' ( (lv_commands_35_0= ruleCommand ) )* )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==33) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalC.g:971:5: otherlv_33= 'default' otherlv_34= ':' ( (lv_commands_35_0= ruleCommand ) )*
                            {
                            otherlv_33=(Token)match(input,33,FOLLOW_21); 

                            					newLeafNode(otherlv_33, grammarAccess.getCommandAccess().getDefaultKeyword_3_7_0());
                            				
                            otherlv_34=(Token)match(input,34,FOLLOW_10); 

                            					newLeafNode(otherlv_34, grammarAccess.getCommandAccess().getColonKeyword_3_7_1());
                            				
                            // InternalC.g:979:5: ( (lv_commands_35_0= ruleCommand ) )*
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( (LA14_0==RULE_ID||(LA14_0>=RULE_UO && LA14_0<=RULE_FALSE)||LA14_0==20||(LA14_0>=25 && LA14_0<=26)||LA14_0==28||(LA14_0>=30 && LA14_0<=32)||(LA14_0>=35 && LA14_0<=38)) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // InternalC.g:980:6: (lv_commands_35_0= ruleCommand )
                            	    {
                            	    // InternalC.g:980:6: (lv_commands_35_0= ruleCommand )
                            	    // InternalC.g:981:7: lv_commands_35_0= ruleCommand
                            	    {

                            	    							newCompositeNode(grammarAccess.getCommandAccess().getCommandsCommandParserRuleCall_3_7_2_0());
                            	    						
                            	    pushFollow(FOLLOW_10);
                            	    lv_commands_35_0=ruleCommand();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getCommandRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"commands",
                            	    								lv_commands_35_0,
                            	    								"com.poli.compilador.C.Command");
                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop14;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_36=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_36, grammarAccess.getCommandAccess().getRightCurlyBracketKeyword_3_8());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalC.g:1005:3: ( () otherlv_38= 'do' ( (lv_commands_39_0= ruleCommandBlock ) ) otherlv_40= 'while' otherlv_41= '(' ( (lv_exp_42_0= ruleExpression ) ) otherlv_43= ')' otherlv_44= ';' )
                    {
                    // InternalC.g:1005:3: ( () otherlv_38= 'do' ( (lv_commands_39_0= ruleCommandBlock ) ) otherlv_40= 'while' otherlv_41= '(' ( (lv_exp_42_0= ruleExpression ) ) otherlv_43= ')' otherlv_44= ';' )
                    // InternalC.g:1006:4: () otherlv_38= 'do' ( (lv_commands_39_0= ruleCommandBlock ) ) otherlv_40= 'while' otherlv_41= '(' ( (lv_exp_42_0= ruleExpression ) ) otherlv_43= ')' otherlv_44= ';'
                    {
                    // InternalC.g:1006:4: ()
                    // InternalC.g:1007:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getDoWhileCmdAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_38=(Token)match(input,35,FOLLOW_9); 

                    				newLeafNode(otherlv_38, grammarAccess.getCommandAccess().getDoKeyword_4_1());
                    			
                    // InternalC.g:1017:4: ( (lv_commands_39_0= ruleCommandBlock ) )
                    // InternalC.g:1018:5: (lv_commands_39_0= ruleCommandBlock )
                    {
                    // InternalC.g:1018:5: (lv_commands_39_0= ruleCommandBlock )
                    // InternalC.g:1019:6: lv_commands_39_0= ruleCommandBlock
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getCommandsCommandBlockParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_commands_39_0=ruleCommandBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						set(
                    							current,
                    							"commands",
                    							lv_commands_39_0,
                    							"com.poli.compilador.C.CommandBlock");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_40=(Token)match(input,30,FOLLOW_6); 

                    				newLeafNode(otherlv_40, grammarAccess.getCommandAccess().getWhileKeyword_4_3());
                    			
                    otherlv_41=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_41, grammarAccess.getCommandAccess().getLeftParenthesisKeyword_4_4());
                    			
                    // InternalC.g:1044:4: ( (lv_exp_42_0= ruleExpression ) )
                    // InternalC.g:1045:5: (lv_exp_42_0= ruleExpression )
                    {
                    // InternalC.g:1045:5: (lv_exp_42_0= ruleExpression )
                    // InternalC.g:1046:6: lv_exp_42_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getExpExpressionParserRuleCall_4_5_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_exp_42_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_42_0,
                    							"com.poli.compilador.C.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_43=(Token)match(input,22,FOLLOW_13); 

                    				newLeafNode(otherlv_43, grammarAccess.getCommandAccess().getRightParenthesisKeyword_4_6());
                    			
                    otherlv_44=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_44, grammarAccess.getCommandAccess().getSemicolonKeyword_4_7());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalC.g:1073:3: ( () ( (lv_val_46_0= ruleFactor ) ) ( (lv_val_47_0= ruleAssignment ) )? otherlv_48= ';' )
                    {
                    // InternalC.g:1073:3: ( () ( (lv_val_46_0= ruleFactor ) ) ( (lv_val_47_0= ruleAssignment ) )? otherlv_48= ';' )
                    // InternalC.g:1074:4: () ( (lv_val_46_0= ruleFactor ) ) ( (lv_val_47_0= ruleAssignment ) )? otherlv_48= ';'
                    {
                    // InternalC.g:1074:4: ()
                    // InternalC.g:1075:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getVarCmdAction_5_0(),
                    						current);
                    				

                    }

                    // InternalC.g:1081:4: ( (lv_val_46_0= ruleFactor ) )
                    // InternalC.g:1082:5: (lv_val_46_0= ruleFactor )
                    {
                    // InternalC.g:1082:5: (lv_val_46_0= ruleFactor )
                    // InternalC.g:1083:6: lv_val_46_0= ruleFactor
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getValFactorParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_val_46_0=ruleFactor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						add(
                    							current,
                    							"val",
                    							lv_val_46_0,
                    							"com.poli.compilador.C.Factor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalC.g:1100:4: ( (lv_val_47_0= ruleAssignment ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==39) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalC.g:1101:5: (lv_val_47_0= ruleAssignment )
                            {
                            // InternalC.g:1101:5: (lv_val_47_0= ruleAssignment )
                            // InternalC.g:1102:6: lv_val_47_0= ruleAssignment
                            {

                            						newCompositeNode(grammarAccess.getCommandAccess().getValAssignmentParserRuleCall_5_2_0());
                            					
                            pushFollow(FOLLOW_13);
                            lv_val_47_0=ruleAssignment();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getCommandRule());
                            						}
                            						add(
                            							current,
                            							"val",
                            							lv_val_47_0,
                            							"com.poli.compilador.C.Assignment");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_48=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_48, grammarAccess.getCommandAccess().getSemicolonKeyword_5_3());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalC.g:1125:3: ( () otherlv_50= 'break' otherlv_51= ';' )
                    {
                    // InternalC.g:1125:3: ( () otherlv_50= 'break' otherlv_51= ';' )
                    // InternalC.g:1126:4: () otherlv_50= 'break' otherlv_51= ';'
                    {
                    // InternalC.g:1126:4: ()
                    // InternalC.g:1127:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getBreakCmdAction_6_0(),
                    						current);
                    				

                    }

                    otherlv_50=(Token)match(input,36,FOLLOW_13); 

                    				newLeafNode(otherlv_50, grammarAccess.getCommandAccess().getBreakKeyword_6_1());
                    			
                    otherlv_51=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_51, grammarAccess.getCommandAccess().getSemicolonKeyword_6_2());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalC.g:1143:3: ( () otherlv_53= 'continue' otherlv_54= ';' )
                    {
                    // InternalC.g:1143:3: ( () otherlv_53= 'continue' otherlv_54= ';' )
                    // InternalC.g:1144:4: () otherlv_53= 'continue' otherlv_54= ';'
                    {
                    // InternalC.g:1144:4: ()
                    // InternalC.g:1145:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getContinueCmdAction_7_0(),
                    						current);
                    				

                    }

                    otherlv_53=(Token)match(input,37,FOLLOW_13); 

                    				newLeafNode(otherlv_53, grammarAccess.getCommandAccess().getContinueKeyword_7_1());
                    			
                    otherlv_54=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_54, grammarAccess.getCommandAccess().getSemicolonKeyword_7_2());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalC.g:1161:3: ( () otherlv_56= 'return' ( (lv_exp_57_0= ruleExpression ) )? otherlv_58= ';' )
                    {
                    // InternalC.g:1161:3: ( () otherlv_56= 'return' ( (lv_exp_57_0= ruleExpression ) )? otherlv_58= ';' )
                    // InternalC.g:1162:4: () otherlv_56= 'return' ( (lv_exp_57_0= ruleExpression ) )? otherlv_58= ';'
                    {
                    // InternalC.g:1162:4: ()
                    // InternalC.g:1163:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getReturnCmdAction_8_0(),
                    						current);
                    				

                    }

                    otherlv_56=(Token)match(input,38,FOLLOW_23); 

                    				newLeafNode(otherlv_56, grammarAccess.getCommandAccess().getReturnKeyword_8_1());
                    			
                    // InternalC.g:1173:4: ( (lv_exp_57_0= ruleExpression ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_ID||LA17_0==RULE_UO||(LA17_0>=RULE_INT && LA17_0<=RULE_FALSE)||LA17_0==20||LA17_0==25) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalC.g:1174:5: (lv_exp_57_0= ruleExpression )
                            {
                            // InternalC.g:1174:5: (lv_exp_57_0= ruleExpression )
                            // InternalC.g:1175:6: lv_exp_57_0= ruleExpression
                            {

                            						newCompositeNode(grammarAccess.getCommandAccess().getExpExpressionParserRuleCall_8_2_0());
                            					
                            pushFollow(FOLLOW_13);
                            lv_exp_57_0=ruleExpression();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getCommandRule());
                            						}
                            						add(
                            							current,
                            							"exp",
                            							lv_exp_57_0,
                            							"com.poli.compilador.C.Expression");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_58=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_58, grammarAccess.getCommandAccess().getSemicolonKeyword_8_3());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalC.g:1198:3: this_Declaration_59= ruleDeclaration
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getDeclarationParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Declaration_59=ruleDeclaration();

                    state._fsp--;


                    			current = this_Declaration_59;
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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleCommandBlock"
    // InternalC.g:1210:1: entryRuleCommandBlock returns [EObject current=null] : iv_ruleCommandBlock= ruleCommandBlock EOF ;
    public final EObject entryRuleCommandBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandBlock = null;


        try {
            // InternalC.g:1210:53: (iv_ruleCommandBlock= ruleCommandBlock EOF )
            // InternalC.g:1211:2: iv_ruleCommandBlock= ruleCommandBlock EOF
            {
             newCompositeNode(grammarAccess.getCommandBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandBlock=ruleCommandBlock();

            state._fsp--;

             current =iv_ruleCommandBlock; 
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
    // $ANTLR end "entryRuleCommandBlock"


    // $ANTLR start "ruleCommandBlock"
    // InternalC.g:1217:1: ruleCommandBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '}' ) ;
    public final EObject ruleCommandBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_commands_2_0 = null;



        	enterRule();

        try {
            // InternalC.g:1223:2: ( ( () otherlv_1= '{' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '}' ) )
            // InternalC.g:1224:2: ( () otherlv_1= '{' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '}' )
            {
            // InternalC.g:1224:2: ( () otherlv_1= '{' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '}' )
            // InternalC.g:1225:3: () otherlv_1= '{' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '}'
            {
            // InternalC.g:1225:3: ()
            // InternalC.g:1226:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommandBlockAccess().getCommandBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getCommandBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalC.g:1236:3: ( (lv_commands_2_0= ruleCommand ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||(LA19_0>=RULE_UO && LA19_0<=RULE_FALSE)||LA19_0==20||(LA19_0>=25 && LA19_0<=26)||LA19_0==28||(LA19_0>=30 && LA19_0<=32)||(LA19_0>=35 && LA19_0<=38)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalC.g:1237:4: (lv_commands_2_0= ruleCommand )
            	    {
            	    // InternalC.g:1237:4: (lv_commands_2_0= ruleCommand )
            	    // InternalC.g:1238:5: lv_commands_2_0= ruleCommand
            	    {

            	    					newCompositeNode(grammarAccess.getCommandBlockAccess().getCommandsCommandParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_commands_2_0=ruleCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCommandBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"commands",
            	    						lv_commands_2_0,
            	    						"com.poli.compilador.C.Command");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCommandBlockAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleCommandBlock"


    // $ANTLR start "entryRuleArgument"
    // InternalC.g:1263:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalC.g:1263:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalC.g:1264:2: iv_ruleArgument= ruleArgument EOF
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
    // InternalC.g:1270:1: ruleArgument returns [EObject current=null] : ( ( (lv_exp_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exp_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exp_0_0 = null;

        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalC.g:1276:2: ( ( ( (lv_exp_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exp_2_0= ruleExpression ) ) )* ) )
            // InternalC.g:1277:2: ( ( (lv_exp_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exp_2_0= ruleExpression ) ) )* )
            {
            // InternalC.g:1277:2: ( ( (lv_exp_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exp_2_0= ruleExpression ) ) )* )
            // InternalC.g:1278:3: ( (lv_exp_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exp_2_0= ruleExpression ) ) )*
            {
            // InternalC.g:1278:3: ( (lv_exp_0_0= ruleExpression ) )
            // InternalC.g:1279:4: (lv_exp_0_0= ruleExpression )
            {
            // InternalC.g:1279:4: (lv_exp_0_0= ruleExpression )
            // InternalC.g:1280:5: lv_exp_0_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getArgumentAccess().getExpExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalC.g:1297:3: (otherlv_1= ',' ( (lv_exp_2_0= ruleExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==21) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalC.g:1298:4: otherlv_1= ',' ( (lv_exp_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_15); 

            	    				newLeafNode(otherlv_1, grammarAccess.getArgumentAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalC.g:1302:4: ( (lv_exp_2_0= ruleExpression ) )
            	    // InternalC.g:1303:5: (lv_exp_2_0= ruleExpression )
            	    {
            	    // InternalC.g:1303:5: (lv_exp_2_0= ruleExpression )
            	    // InternalC.g:1304:6: lv_exp_2_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getArgumentAccess().getExpExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
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
            	    break loop20;
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
    // InternalC.g:1326:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalC.g:1326:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalC.g:1327:2: iv_ruleAssignment= ruleAssignment EOF
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
    // InternalC.g:1333:1: ruleAssignment returns [EObject current=null] : (otherlv_0= '=' ( (lv_exp_1_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalC.g:1339:2: ( (otherlv_0= '=' ( (lv_exp_1_0= ruleExpression ) ) ) )
            // InternalC.g:1340:2: (otherlv_0= '=' ( (lv_exp_1_0= ruleExpression ) ) )
            {
            // InternalC.g:1340:2: (otherlv_0= '=' ( (lv_exp_1_0= ruleExpression ) ) )
            // InternalC.g:1341:3: otherlv_0= '=' ( (lv_exp_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_0());
            		
            // InternalC.g:1345:3: ( (lv_exp_1_0= ruleExpression ) )
            // InternalC.g:1346:4: (lv_exp_1_0= ruleExpression )
            {
            // InternalC.g:1346:4: (lv_exp_1_0= ruleExpression )
            // InternalC.g:1347:5: lv_exp_1_0= ruleExpression
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
    // InternalC.g:1368:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalC.g:1368:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalC.g:1369:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalC.g:1375:1: ruleExpression returns [EObject current=null] : ( ( (lv_args_0_0= ruleRelExp ) ) ( () ( (lv_op_2_0= RULE_LO ) ) ( (lv_args_3_0= ruleRelExp ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject lv_args_0_0 = null;

        EObject lv_args_3_0 = null;



        	enterRule();

        try {
            // InternalC.g:1381:2: ( ( ( (lv_args_0_0= ruleRelExp ) ) ( () ( (lv_op_2_0= RULE_LO ) ) ( (lv_args_3_0= ruleRelExp ) ) )* ) )
            // InternalC.g:1382:2: ( ( (lv_args_0_0= ruleRelExp ) ) ( () ( (lv_op_2_0= RULE_LO ) ) ( (lv_args_3_0= ruleRelExp ) ) )* )
            {
            // InternalC.g:1382:2: ( ( (lv_args_0_0= ruleRelExp ) ) ( () ( (lv_op_2_0= RULE_LO ) ) ( (lv_args_3_0= ruleRelExp ) ) )* )
            // InternalC.g:1383:3: ( (lv_args_0_0= ruleRelExp ) ) ( () ( (lv_op_2_0= RULE_LO ) ) ( (lv_args_3_0= ruleRelExp ) ) )*
            {
            // InternalC.g:1383:3: ( (lv_args_0_0= ruleRelExp ) )
            // InternalC.g:1384:4: (lv_args_0_0= ruleRelExp )
            {
            // InternalC.g:1384:4: (lv_args_0_0= ruleRelExp )
            // InternalC.g:1385:5: lv_args_0_0= ruleRelExp
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getArgsRelExpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_args_0_0=ruleRelExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					add(
            						current,
            						"args",
            						lv_args_0_0,
            						"com.poli.compilador.C.RelExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalC.g:1402:3: ( () ( (lv_op_2_0= RULE_LO ) ) ( (lv_args_3_0= ruleRelExp ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_LO) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalC.g:1403:4: () ( (lv_op_2_0= RULE_LO ) ) ( (lv_args_3_0= ruleRelExp ) )
            	    {
            	    // InternalC.g:1403:4: ()
            	    // InternalC.g:1404:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getExpressionAccess().getLogicExpArgsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalC.g:1410:4: ( (lv_op_2_0= RULE_LO ) )
            	    // InternalC.g:1411:5: (lv_op_2_0= RULE_LO )
            	    {
            	    // InternalC.g:1411:5: (lv_op_2_0= RULE_LO )
            	    // InternalC.g:1412:6: lv_op_2_0= RULE_LO
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

            	    // InternalC.g:1428:4: ( (lv_args_3_0= ruleRelExp ) )
            	    // InternalC.g:1429:5: (lv_args_3_0= ruleRelExp )
            	    {
            	    // InternalC.g:1429:5: (lv_args_3_0= ruleRelExp )
            	    // InternalC.g:1430:6: lv_args_3_0= ruleRelExp
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getArgsRelExpParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
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
            	    break loop21;
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
    // InternalC.g:1452:1: entryRuleRelExp returns [EObject current=null] : iv_ruleRelExp= ruleRelExp EOF ;
    public final EObject entryRuleRelExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelExp = null;


        try {
            // InternalC.g:1452:47: (iv_ruleRelExp= ruleRelExp EOF )
            // InternalC.g:1453:2: iv_ruleRelExp= ruleRelExp EOF
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
    // InternalC.g:1459:1: ruleRelExp returns [EObject current=null] : (this_ArithExp_0= ruleArithExp ( () ( (lv_op_2_0= RULE_RO ) ) ( (lv_args_3_0= ruleArithExp ) ) )? ) ;
    public final EObject ruleRelExp() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ArithExp_0 = null;

        EObject lv_args_3_0 = null;



        	enterRule();

        try {
            // InternalC.g:1465:2: ( (this_ArithExp_0= ruleArithExp ( () ( (lv_op_2_0= RULE_RO ) ) ( (lv_args_3_0= ruleArithExp ) ) )? ) )
            // InternalC.g:1466:2: (this_ArithExp_0= ruleArithExp ( () ( (lv_op_2_0= RULE_RO ) ) ( (lv_args_3_0= ruleArithExp ) ) )? )
            {
            // InternalC.g:1466:2: (this_ArithExp_0= ruleArithExp ( () ( (lv_op_2_0= RULE_RO ) ) ( (lv_args_3_0= ruleArithExp ) ) )? )
            // InternalC.g:1467:3: this_ArithExp_0= ruleArithExp ( () ( (lv_op_2_0= RULE_RO ) ) ( (lv_args_3_0= ruleArithExp ) ) )?
            {

            			newCompositeNode(grammarAccess.getRelExpAccess().getArithExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_ArithExp_0=ruleArithExp();

            state._fsp--;


            			current = this_ArithExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalC.g:1475:3: ( () ( (lv_op_2_0= RULE_RO ) ) ( (lv_args_3_0= ruleArithExp ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_RO) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalC.g:1476:4: () ( (lv_op_2_0= RULE_RO ) ) ( (lv_args_3_0= ruleArithExp ) )
                    {
                    // InternalC.g:1476:4: ()
                    // InternalC.g:1477:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getRelExpAccess().getRelExpArgsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalC.g:1483:4: ( (lv_op_2_0= RULE_RO ) )
                    // InternalC.g:1484:5: (lv_op_2_0= RULE_RO )
                    {
                    // InternalC.g:1484:5: (lv_op_2_0= RULE_RO )
                    // InternalC.g:1485:6: lv_op_2_0= RULE_RO
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

                    // InternalC.g:1501:4: ( (lv_args_3_0= ruleArithExp ) )
                    // InternalC.g:1502:5: (lv_args_3_0= ruleArithExp )
                    {
                    // InternalC.g:1502:5: (lv_args_3_0= ruleArithExp )
                    // InternalC.g:1503:6: lv_args_3_0= ruleArithExp
                    {

                    						newCompositeNode(grammarAccess.getRelExpAccess().getArgsArithExpParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
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
    // $ANTLR end "ruleRelExp"


    // $ANTLR start "entryRuleArithExp"
    // InternalC.g:1525:1: entryRuleArithExp returns [EObject current=null] : iv_ruleArithExp= ruleArithExp EOF ;
    public final EObject entryRuleArithExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithExp = null;


        try {
            // InternalC.g:1525:49: (iv_ruleArithExp= ruleArithExp EOF )
            // InternalC.g:1526:2: iv_ruleArithExp= ruleArithExp EOF
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
    // InternalC.g:1532:1: ruleArithExp returns [EObject current=null] : (this_Term_0= ruleTerm ( () ( (lv_op_2_0= RULE_AO1 ) ) ( (lv_args_3_0= ruleTerm ) ) )* ) ;
    public final EObject ruleArithExp() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Term_0 = null;

        EObject lv_args_3_0 = null;



        	enterRule();

        try {
            // InternalC.g:1538:2: ( (this_Term_0= ruleTerm ( () ( (lv_op_2_0= RULE_AO1 ) ) ( (lv_args_3_0= ruleTerm ) ) )* ) )
            // InternalC.g:1539:2: (this_Term_0= ruleTerm ( () ( (lv_op_2_0= RULE_AO1 ) ) ( (lv_args_3_0= ruleTerm ) ) )* )
            {
            // InternalC.g:1539:2: (this_Term_0= ruleTerm ( () ( (lv_op_2_0= RULE_AO1 ) ) ( (lv_args_3_0= ruleTerm ) ) )* )
            // InternalC.g:1540:3: this_Term_0= ruleTerm ( () ( (lv_op_2_0= RULE_AO1 ) ) ( (lv_args_3_0= ruleTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getArithExpAccess().getTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_Term_0=ruleTerm();

            state._fsp--;


            			current = this_Term_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalC.g:1548:3: ( () ( (lv_op_2_0= RULE_AO1 ) ) ( (lv_args_3_0= ruleTerm ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_AO1) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalC.g:1549:4: () ( (lv_op_2_0= RULE_AO1 ) ) ( (lv_args_3_0= ruleTerm ) )
            	    {
            	    // InternalC.g:1549:4: ()
            	    // InternalC.g:1550:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getArithExpAccess().getAritmExpArgsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalC.g:1556:4: ( (lv_op_2_0= RULE_AO1 ) )
            	    // InternalC.g:1557:5: (lv_op_2_0= RULE_AO1 )
            	    {
            	    // InternalC.g:1557:5: (lv_op_2_0= RULE_AO1 )
            	    // InternalC.g:1558:6: lv_op_2_0= RULE_AO1
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

            	    // InternalC.g:1574:4: ( (lv_args_3_0= ruleTerm ) )
            	    // InternalC.g:1575:5: (lv_args_3_0= ruleTerm )
            	    {
            	    // InternalC.g:1575:5: (lv_args_3_0= ruleTerm )
            	    // InternalC.g:1576:6: lv_args_3_0= ruleTerm
            	    {

            	    						newCompositeNode(grammarAccess.getArithExpAccess().getArgsTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_27);
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
            	    break loop23;
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
    // InternalC.g:1598:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalC.g:1598:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalC.g:1599:2: iv_ruleTerm= ruleTerm EOF
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
    // InternalC.g:1605:1: ruleTerm returns [EObject current=null] : (this_Factor_0= ruleFactor ( () ( (lv_op_2_0= RULE_AO2 ) ) ( (lv_args_3_0= ruleFactor ) ) )* ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Factor_0 = null;

        EObject lv_args_3_0 = null;



        	enterRule();

        try {
            // InternalC.g:1611:2: ( (this_Factor_0= ruleFactor ( () ( (lv_op_2_0= RULE_AO2 ) ) ( (lv_args_3_0= ruleFactor ) ) )* ) )
            // InternalC.g:1612:2: (this_Factor_0= ruleFactor ( () ( (lv_op_2_0= RULE_AO2 ) ) ( (lv_args_3_0= ruleFactor ) ) )* )
            {
            // InternalC.g:1612:2: (this_Factor_0= ruleFactor ( () ( (lv_op_2_0= RULE_AO2 ) ) ( (lv_args_3_0= ruleFactor ) ) )* )
            // InternalC.g:1613:3: this_Factor_0= ruleFactor ( () ( (lv_op_2_0= RULE_AO2 ) ) ( (lv_args_3_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalC.g:1621:3: ( () ( (lv_op_2_0= RULE_AO2 ) ) ( (lv_args_3_0= ruleFactor ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_AO2) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalC.g:1622:4: () ( (lv_op_2_0= RULE_AO2 ) ) ( (lv_args_3_0= ruleFactor ) )
            	    {
            	    // InternalC.g:1622:4: ()
            	    // InternalC.g:1623:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getTermAccess().getTermArgsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalC.g:1629:4: ( (lv_op_2_0= RULE_AO2 ) )
            	    // InternalC.g:1630:5: (lv_op_2_0= RULE_AO2 )
            	    {
            	    // InternalC.g:1630:5: (lv_op_2_0= RULE_AO2 )
            	    // InternalC.g:1631:6: lv_op_2_0= RULE_AO2
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

            	    // InternalC.g:1647:4: ( (lv_args_3_0= ruleFactor ) )
            	    // InternalC.g:1648:5: (lv_args_3_0= ruleFactor )
            	    {
            	    // InternalC.g:1648:5: (lv_args_3_0= ruleFactor )
            	    // InternalC.g:1649:6: lv_args_3_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getTermAccess().getArgsFactorParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_28);
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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleFactor"
    // InternalC.g:1671:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalC.g:1671:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalC.g:1672:2: iv_ruleFactor= ruleFactor EOF
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
    // InternalC.g:1678:1: ruleFactor returns [EObject current=null] : ( ( (lv_uo_0_0= RULE_UO ) )? ( (lv_arg_1_0= ruleAtom ) ) ( (lv_uo_2_0= RULE_UO ) )? ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token lv_uo_0_0=null;
        Token lv_uo_2_0=null;
        EObject lv_arg_1_0 = null;



        	enterRule();

        try {
            // InternalC.g:1684:2: ( ( ( (lv_uo_0_0= RULE_UO ) )? ( (lv_arg_1_0= ruleAtom ) ) ( (lv_uo_2_0= RULE_UO ) )? ) )
            // InternalC.g:1685:2: ( ( (lv_uo_0_0= RULE_UO ) )? ( (lv_arg_1_0= ruleAtom ) ) ( (lv_uo_2_0= RULE_UO ) )? )
            {
            // InternalC.g:1685:2: ( ( (lv_uo_0_0= RULE_UO ) )? ( (lv_arg_1_0= ruleAtom ) ) ( (lv_uo_2_0= RULE_UO ) )? )
            // InternalC.g:1686:3: ( (lv_uo_0_0= RULE_UO ) )? ( (lv_arg_1_0= ruleAtom ) ) ( (lv_uo_2_0= RULE_UO ) )?
            {
            // InternalC.g:1686:3: ( (lv_uo_0_0= RULE_UO ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_UO) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalC.g:1687:4: (lv_uo_0_0= RULE_UO )
                    {
                    // InternalC.g:1687:4: (lv_uo_0_0= RULE_UO )
                    // InternalC.g:1688:5: lv_uo_0_0= RULE_UO
                    {
                    lv_uo_0_0=(Token)match(input,RULE_UO,FOLLOW_15); 

                    					newLeafNode(lv_uo_0_0, grammarAccess.getFactorAccess().getUoUOTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFactorRule());
                    					}
                    					addWithLastConsumed(
                    						current,
                    						"uo",
                    						lv_uo_0_0,
                    						"com.poli.compilador.C.UO");
                    				

                    }


                    }
                    break;

            }

            // InternalC.g:1704:3: ( (lv_arg_1_0= ruleAtom ) )
            // InternalC.g:1705:4: (lv_arg_1_0= ruleAtom )
            {
            // InternalC.g:1705:4: (lv_arg_1_0= ruleAtom )
            // InternalC.g:1706:5: lv_arg_1_0= ruleAtom
            {

            					newCompositeNode(grammarAccess.getFactorAccess().getArgAtomParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
            lv_arg_1_0=ruleAtom();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFactorRule());
            					}
            					set(
            						current,
            						"arg",
            						lv_arg_1_0,
            						"com.poli.compilador.C.Atom");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalC.g:1723:3: ( (lv_uo_2_0= RULE_UO ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_UO) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalC.g:1724:4: (lv_uo_2_0= RULE_UO )
                    {
                    // InternalC.g:1724:4: (lv_uo_2_0= RULE_UO )
                    // InternalC.g:1725:5: lv_uo_2_0= RULE_UO
                    {
                    lv_uo_2_0=(Token)match(input,RULE_UO,FOLLOW_2); 

                    					newLeafNode(lv_uo_2_0, grammarAccess.getFactorAccess().getUoUOTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFactorRule());
                    					}
                    					addWithLastConsumed(
                    						current,
                    						"uo",
                    						lv_uo_2_0,
                    						"com.poli.compilador.C.UO");
                    				

                    }


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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleAtom"
    // InternalC.g:1745:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalC.g:1745:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalC.g:1746:2: iv_ruleAtom= ruleAtom EOF
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
    // InternalC.g:1752:1: ruleAtom returns [EObject current=null] : (this_Literal_0= ruleLiteral | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) | this_lValue_4= rulelValue ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Literal_0 = null;

        EObject this_Expression_2 = null;

        EObject this_lValue_4 = null;



        	enterRule();

        try {
            // InternalC.g:1758:2: ( (this_Literal_0= ruleLiteral | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) | this_lValue_4= rulelValue ) )
            // InternalC.g:1759:2: (this_Literal_0= ruleLiteral | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) | this_lValue_4= rulelValue )
            {
            // InternalC.g:1759:2: (this_Literal_0= ruleLiteral | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) | this_lValue_4= rulelValue )
            int alt27=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_TRUE:
            case RULE_FALSE:
                {
                alt27=1;
                }
                break;
            case 20:
                {
                alt27=2;
                }
                break;
            case RULE_ID:
            case 25:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalC.g:1760:3: this_Literal_0= ruleLiteral
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
                    // InternalC.g:1769:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    {
                    // InternalC.g:1769:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    // InternalC.g:1770:4: otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getAtomAccess().getExpressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_16);
                    this_Expression_2=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalC.g:1788:3: this_lValue_4= rulelValue
                    {

                    			newCompositeNode(grammarAccess.getAtomAccess().getLValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_lValue_4=rulelValue();

                    state._fsp--;


                    			current = this_lValue_4;
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
    // InternalC.g:1800:1: entryRulelValue returns [EObject current=null] : iv_rulelValue= rulelValue EOF ;
    public final EObject entryRulelValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelValue = null;


        try {
            // InternalC.g:1800:47: (iv_rulelValue= rulelValue EOF )
            // InternalC.g:1801:2: iv_rulelValue= rulelValue EOF
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
    // InternalC.g:1807:1: rulelValue returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_arg_2_0= ruleArgument ) )? otherlv_3= ')' ) | ( (lv_acc_4_0= ruleAccessExp ) ) )? ) | this_PointerExp_5= rulePointerExp ) ;
    public final EObject rulelValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_arg_2_0 = null;

        EObject lv_acc_4_0 = null;

        EObject this_PointerExp_5 = null;



        	enterRule();

        try {
            // InternalC.g:1813:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_arg_2_0= ruleArgument ) )? otherlv_3= ')' ) | ( (lv_acc_4_0= ruleAccessExp ) ) )? ) | this_PointerExp_5= rulePointerExp ) )
            // InternalC.g:1814:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_arg_2_0= ruleArgument ) )? otherlv_3= ')' ) | ( (lv_acc_4_0= ruleAccessExp ) ) )? ) | this_PointerExp_5= rulePointerExp )
            {
            // InternalC.g:1814:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_arg_2_0= ruleArgument ) )? otherlv_3= ')' ) | ( (lv_acc_4_0= ruleAccessExp ) ) )? ) | this_PointerExp_5= rulePointerExp )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            else if ( (LA30_0==25) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalC.g:1815:3: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_arg_2_0= ruleArgument ) )? otherlv_3= ')' ) | ( (lv_acc_4_0= ruleAccessExp ) ) )? )
                    {
                    // InternalC.g:1815:3: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_arg_2_0= ruleArgument ) )? otherlv_3= ')' ) | ( (lv_acc_4_0= ruleAccessExp ) ) )? )
                    // InternalC.g:1816:4: ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_arg_2_0= ruleArgument ) )? otherlv_3= ')' ) | ( (lv_acc_4_0= ruleAccessExp ) ) )?
                    {
                    // InternalC.g:1816:4: ( (otherlv_0= RULE_ID ) )
                    // InternalC.g:1817:5: (otherlv_0= RULE_ID )
                    {
                    // InternalC.g:1817:5: (otherlv_0= RULE_ID )
                    // InternalC.g:1818:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLValueRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_30); 

                    						newLeafNode(otherlv_0, grammarAccess.getLValueAccess().getValorDefinitionCrossReference_0_0_0());
                    					

                    }


                    }

                    // InternalC.g:1829:4: ( (otherlv_1= '(' ( (lv_arg_2_0= ruleArgument ) )? otherlv_3= ')' ) | ( (lv_acc_4_0= ruleAccessExp ) ) )?
                    int alt29=3;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==20) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==40||LA29_0==42) ) {
                        alt29=2;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalC.g:1830:5: (otherlv_1= '(' ( (lv_arg_2_0= ruleArgument ) )? otherlv_3= ')' )
                            {
                            // InternalC.g:1830:5: (otherlv_1= '(' ( (lv_arg_2_0= ruleArgument ) )? otherlv_3= ')' )
                            // InternalC.g:1831:6: otherlv_1= '(' ( (lv_arg_2_0= ruleArgument ) )? otherlv_3= ')'
                            {
                            otherlv_1=(Token)match(input,20,FOLLOW_31); 

                            						newLeafNode(otherlv_1, grammarAccess.getLValueAccess().getLeftParenthesisKeyword_0_1_0_0());
                            					
                            // InternalC.g:1835:6: ( (lv_arg_2_0= ruleArgument ) )?
                            int alt28=2;
                            int LA28_0 = input.LA(1);

                            if ( (LA28_0==RULE_ID||LA28_0==RULE_UO||(LA28_0>=RULE_INT && LA28_0<=RULE_FALSE)||LA28_0==20||LA28_0==25) ) {
                                alt28=1;
                            }
                            switch (alt28) {
                                case 1 :
                                    // InternalC.g:1836:7: (lv_arg_2_0= ruleArgument )
                                    {
                                    // InternalC.g:1836:7: (lv_arg_2_0= ruleArgument )
                                    // InternalC.g:1837:8: lv_arg_2_0= ruleArgument
                                    {

                                    								newCompositeNode(grammarAccess.getLValueAccess().getArgArgumentParserRuleCall_0_1_0_1_0());
                                    							
                                    pushFollow(FOLLOW_16);
                                    lv_arg_2_0=ruleArgument();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getLValueRule());
                                    								}
                                    								set(
                                    									current,
                                    									"arg",
                                    									lv_arg_2_0,
                                    									"com.poli.compilador.C.Argument");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }
                                    break;

                            }

                            otherlv_3=(Token)match(input,22,FOLLOW_2); 

                            						newLeafNode(otherlv_3, grammarAccess.getLValueAccess().getRightParenthesisKeyword_0_1_0_2());
                            					

                            }


                            }
                            break;
                        case 2 :
                            // InternalC.g:1860:5: ( (lv_acc_4_0= ruleAccessExp ) )
                            {
                            // InternalC.g:1860:5: ( (lv_acc_4_0= ruleAccessExp ) )
                            // InternalC.g:1861:6: (lv_acc_4_0= ruleAccessExp )
                            {
                            // InternalC.g:1861:6: (lv_acc_4_0= ruleAccessExp )
                            // InternalC.g:1862:7: lv_acc_4_0= ruleAccessExp
                            {

                            							newCompositeNode(grammarAccess.getLValueAccess().getAccAccessExpParserRuleCall_0_1_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_acc_4_0=ruleAccessExp();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getLValueRule());
                            							}
                            							set(
                            								current,
                            								"acc",
                            								lv_acc_4_0,
                            								"com.poli.compilador.C.AccessExp");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalC.g:1882:3: this_PointerExp_5= rulePointerExp
                    {

                    			newCompositeNode(grammarAccess.getLValueAccess().getPointerExpParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PointerExp_5=rulePointerExp();

                    state._fsp--;


                    			current = this_PointerExp_5;
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
    // InternalC.g:1894:1: entryRulePointerExp returns [EObject current=null] : iv_rulePointerExp= rulePointerExp EOF ;
    public final EObject entryRulePointerExp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointerExp = null;


        try {
            // InternalC.g:1894:51: (iv_rulePointerExp= rulePointerExp EOF )
            // InternalC.g:1895:2: iv_rulePointerExp= rulePointerExp EOF
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
    // InternalC.g:1901:1: rulePointerExp returns [EObject current=null] : ( () otherlv_1= '**' (this_ID_2= RULE_ID | (otherlv_3= '(' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' ) ) ) ;
    public final EObject rulePointerExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_ID_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exp_4_0 = null;



        	enterRule();

        try {
            // InternalC.g:1907:2: ( ( () otherlv_1= '**' (this_ID_2= RULE_ID | (otherlv_3= '(' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' ) ) ) )
            // InternalC.g:1908:2: ( () otherlv_1= '**' (this_ID_2= RULE_ID | (otherlv_3= '(' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' ) ) )
            {
            // InternalC.g:1908:2: ( () otherlv_1= '**' (this_ID_2= RULE_ID | (otherlv_3= '(' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' ) ) )
            // InternalC.g:1909:3: () otherlv_1= '**' (this_ID_2= RULE_ID | (otherlv_3= '(' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            {
            // InternalC.g:1909:3: ()
            // InternalC.g:1910:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPointerExpAccess().getPointerExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getPointerExpAccess().getAsteriskAsteriskKeyword_1());
            		
            // InternalC.g:1920:3: (this_ID_2= RULE_ID | (otherlv_3= '(' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            else if ( (LA31_0==20) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalC.g:1921:4: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    				newLeafNode(this_ID_2, grammarAccess.getPointerExpAccess().getIDTerminalRuleCall_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalC.g:1926:4: (otherlv_3= '(' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' )
                    {
                    // InternalC.g:1926:4: (otherlv_3= '(' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' )
                    // InternalC.g:1927:5: otherlv_3= '(' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_15); 

                    					newLeafNode(otherlv_3, grammarAccess.getPointerExpAccess().getLeftParenthesisKeyword_2_1_0());
                    				
                    // InternalC.g:1931:5: ( (lv_exp_4_0= ruleExpression ) )
                    // InternalC.g:1932:6: (lv_exp_4_0= ruleExpression )
                    {
                    // InternalC.g:1932:6: (lv_exp_4_0= ruleExpression )
                    // InternalC.g:1933:7: lv_exp_4_0= ruleExpression
                    {

                    							newCompositeNode(grammarAccess.getPointerExpAccess().getExpExpressionParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_16);
                    lv_exp_4_0=ruleExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPointerExpRule());
                    							}
                    							set(
                    								current,
                    								"exp",
                    								lv_exp_4_0,
                    								"com.poli.compilador.C.Expression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(otherlv_5, grammarAccess.getPointerExpAccess().getRightParenthesisKeyword_2_1_2());
                    				

                    }


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
    // $ANTLR end "rulePointerExp"


    // $ANTLR start "entryRuleAccessExp"
    // InternalC.g:1960:1: entryRuleAccessExp returns [EObject current=null] : iv_ruleAccessExp= ruleAccessExp EOF ;
    public final EObject entryRuleAccessExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessExp = null;


        try {
            // InternalC.g:1960:50: (iv_ruleAccessExp= ruleAccessExp EOF )
            // InternalC.g:1961:2: iv_ruleAccessExp= ruleAccessExp EOF
            {
             newCompositeNode(grammarAccess.getAccessExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessExp=ruleAccessExp();

            state._fsp--;

             current =iv_ruleAccessExp; 
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
    // $ANTLR end "entryRuleAccessExp"


    // $ANTLR start "ruleAccessExp"
    // InternalC.g:1967:1: ruleAccessExp returns [EObject current=null] : ( ( () otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' ) | ( () otherlv_5= '.' ( (lv_field_6_0= RULE_ID ) ) ) ) ;
    public final EObject ruleAccessExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_field_6_0=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalC.g:1973:2: ( ( ( () otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' ) | ( () otherlv_5= '.' ( (lv_field_6_0= RULE_ID ) ) ) ) )
            // InternalC.g:1974:2: ( ( () otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' ) | ( () otherlv_5= '.' ( (lv_field_6_0= RULE_ID ) ) ) )
            {
            // InternalC.g:1974:2: ( ( () otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' ) | ( () otherlv_5= '.' ( (lv_field_6_0= RULE_ID ) ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==40) ) {
                alt33=1;
            }
            else if ( (LA33_0==42) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalC.g:1975:3: ( () otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' )
                    {
                    // InternalC.g:1975:3: ( () otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' )
                    // InternalC.g:1976:4: () otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']'
                    {
                    // InternalC.g:1976:4: ()
                    // InternalC.g:1977:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAccessExpAccess().getArrayAccessAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,40,FOLLOW_33); 

                    				newLeafNode(otherlv_1, grammarAccess.getAccessExpAccess().getLeftSquareBracketKeyword_0_1());
                    			
                    // InternalC.g:1987:4: ( (lv_exp_2_0= ruleExpression ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_ID||LA32_0==RULE_UO||(LA32_0>=RULE_INT && LA32_0<=RULE_FALSE)||LA32_0==20||LA32_0==25) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalC.g:1988:5: (lv_exp_2_0= ruleExpression )
                            {
                            // InternalC.g:1988:5: (lv_exp_2_0= ruleExpression )
                            // InternalC.g:1989:6: lv_exp_2_0= ruleExpression
                            {

                            						newCompositeNode(grammarAccess.getAccessExpAccess().getExpExpressionParserRuleCall_0_2_0());
                            					
                            pushFollow(FOLLOW_34);
                            lv_exp_2_0=ruleExpression();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getAccessExpRule());
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

                    				newLeafNode(otherlv_3, grammarAccess.getAccessExpAccess().getRightSquareBracketKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalC.g:2012:3: ( () otherlv_5= '.' ( (lv_field_6_0= RULE_ID ) ) )
                    {
                    // InternalC.g:2012:3: ( () otherlv_5= '.' ( (lv_field_6_0= RULE_ID ) ) )
                    // InternalC.g:2013:4: () otherlv_5= '.' ( (lv_field_6_0= RULE_ID ) )
                    {
                    // InternalC.g:2013:4: ()
                    // InternalC.g:2014:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAccessExpAccess().getFieldAccessAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,42,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getAccessExpAccess().getFullStopKeyword_1_1());
                    			
                    // InternalC.g:2024:4: ( (lv_field_6_0= RULE_ID ) )
                    // InternalC.g:2025:5: (lv_field_6_0= RULE_ID )
                    {
                    // InternalC.g:2025:5: (lv_field_6_0= RULE_ID )
                    // InternalC.g:2026:6: lv_field_6_0= RULE_ID
                    {
                    lv_field_6_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_field_6_0, grammarAccess.getAccessExpAccess().getFieldIDTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAccessExpRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"field",
                    							lv_field_6_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

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
    // $ANTLR end "ruleAccessExp"


    // $ANTLR start "entryRuleCase"
    // InternalC.g:2047:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // InternalC.g:2047:45: (iv_ruleCase= ruleCase EOF )
            // InternalC.g:2048:2: iv_ruleCase= ruleCase EOF
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
    // InternalC.g:2054:1: ruleCase returns [EObject current=null] : (otherlv_0= 'case' ( (lv_val_1_0= ruleAtom ) ) otherlv_2= ':' ( (lv_commands_3_0= ruleCommand ) )* ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_val_1_0 = null;

        EObject lv_commands_3_0 = null;



        	enterRule();

        try {
            // InternalC.g:2060:2: ( (otherlv_0= 'case' ( (lv_val_1_0= ruleAtom ) ) otherlv_2= ':' ( (lv_commands_3_0= ruleCommand ) )* ) )
            // InternalC.g:2061:2: (otherlv_0= 'case' ( (lv_val_1_0= ruleAtom ) ) otherlv_2= ':' ( (lv_commands_3_0= ruleCommand ) )* )
            {
            // InternalC.g:2061:2: (otherlv_0= 'case' ( (lv_val_1_0= ruleAtom ) ) otherlv_2= ':' ( (lv_commands_3_0= ruleCommand ) )* )
            // InternalC.g:2062:3: otherlv_0= 'case' ( (lv_val_1_0= ruleAtom ) ) otherlv_2= ':' ( (lv_commands_3_0= ruleCommand ) )*
            {
            otherlv_0=(Token)match(input,43,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getCaseAccess().getCaseKeyword_0());
            		
            // InternalC.g:2066:3: ( (lv_val_1_0= ruleAtom ) )
            // InternalC.g:2067:4: (lv_val_1_0= ruleAtom )
            {
            // InternalC.g:2067:4: (lv_val_1_0= ruleAtom )
            // InternalC.g:2068:5: lv_val_1_0= ruleAtom
            {

            					newCompositeNode(grammarAccess.getCaseAccess().getValAtomParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_2=(Token)match(input,34,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getCaseAccess().getColonKeyword_2());
            		
            // InternalC.g:2089:3: ( (lv_commands_3_0= ruleCommand ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID||(LA34_0>=RULE_UO && LA34_0<=RULE_FALSE)||LA34_0==20||(LA34_0>=25 && LA34_0<=26)||LA34_0==28||(LA34_0>=30 && LA34_0<=32)||(LA34_0>=35 && LA34_0<=38)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalC.g:2090:4: (lv_commands_3_0= ruleCommand )
            	    {
            	    // InternalC.g:2090:4: (lv_commands_3_0= ruleCommand )
            	    // InternalC.g:2091:5: lv_commands_3_0= ruleCommand
            	    {

            	    					newCompositeNode(grammarAccess.getCaseAccess().getCommandsCommandParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_35);
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
            	    break loop34;
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
    // InternalC.g:2112:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalC.g:2112:45: (iv_ruleType= ruleType EOF )
            // InternalC.g:2113:2: iv_ruleType= ruleType EOF
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
    // InternalC.g:2119:1: ruleType returns [EObject current=null] : ( ( (lv_tipo_0_0= RULE_TYPELIT ) ) (otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' )? ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_tipo_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalC.g:2125:2: ( ( ( (lv_tipo_0_0= RULE_TYPELIT ) ) (otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' )? ) )
            // InternalC.g:2126:2: ( ( (lv_tipo_0_0= RULE_TYPELIT ) ) (otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' )? )
            {
            // InternalC.g:2126:2: ( ( (lv_tipo_0_0= RULE_TYPELIT ) ) (otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' )? )
            // InternalC.g:2127:3: ( (lv_tipo_0_0= RULE_TYPELIT ) ) (otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' )?
            {
            // InternalC.g:2127:3: ( (lv_tipo_0_0= RULE_TYPELIT ) )
            // InternalC.g:2128:4: (lv_tipo_0_0= RULE_TYPELIT )
            {
            // InternalC.g:2128:4: (lv_tipo_0_0= RULE_TYPELIT )
            // InternalC.g:2129:5: lv_tipo_0_0= RULE_TYPELIT
            {
            lv_tipo_0_0=(Token)match(input,RULE_TYPELIT,FOLLOW_36); 

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

            // InternalC.g:2145:3: (otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==40) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalC.g:2146:4: otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_33); 

                    				newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalC.g:2150:4: ( (lv_exp_2_0= ruleExpression ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_ID||LA35_0==RULE_UO||(LA35_0>=RULE_INT && LA35_0<=RULE_FALSE)||LA35_0==20||LA35_0==25) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalC.g:2151:5: (lv_exp_2_0= ruleExpression )
                            {
                            // InternalC.g:2151:5: (lv_exp_2_0= ruleExpression )
                            // InternalC.g:2152:6: lv_exp_2_0= ruleExpression
                            {

                            						newCompositeNode(grammarAccess.getTypeAccess().getExpExpressionParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_34);
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
    // InternalC.g:2178:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalC.g:2178:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalC.g:2179:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalC.g:2185:1: ruleLiteral returns [EObject current=null] : ( ( () ( (lv_val_1_0= RULE_INT ) ) ) | ( () ( (lv_val_3_0= RULE_TRUE ) ) ) | ( () ( (lv_val_5_0= RULE_FALSE ) ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_val_1_0=null;
        Token lv_val_3_0=null;
        Token lv_val_5_0=null;


        	enterRule();

        try {
            // InternalC.g:2191:2: ( ( ( () ( (lv_val_1_0= RULE_INT ) ) ) | ( () ( (lv_val_3_0= RULE_TRUE ) ) ) | ( () ( (lv_val_5_0= RULE_FALSE ) ) ) ) )
            // InternalC.g:2192:2: ( ( () ( (lv_val_1_0= RULE_INT ) ) ) | ( () ( (lv_val_3_0= RULE_TRUE ) ) ) | ( () ( (lv_val_5_0= RULE_FALSE ) ) ) )
            {
            // InternalC.g:2192:2: ( ( () ( (lv_val_1_0= RULE_INT ) ) ) | ( () ( (lv_val_3_0= RULE_TRUE ) ) ) | ( () ( (lv_val_5_0= RULE_FALSE ) ) ) )
            int alt37=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt37=1;
                }
                break;
            case RULE_TRUE:
                {
                alt37=2;
                }
                break;
            case RULE_FALSE:
                {
                alt37=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalC.g:2193:3: ( () ( (lv_val_1_0= RULE_INT ) ) )
                    {
                    // InternalC.g:2193:3: ( () ( (lv_val_1_0= RULE_INT ) ) )
                    // InternalC.g:2194:4: () ( (lv_val_1_0= RULE_INT ) )
                    {
                    // InternalC.g:2194:4: ()
                    // InternalC.g:2195:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLiteralAccess().getIntLitAction_0_0(),
                    						current);
                    				

                    }

                    // InternalC.g:2201:4: ( (lv_val_1_0= RULE_INT ) )
                    // InternalC.g:2202:5: (lv_val_1_0= RULE_INT )
                    {
                    // InternalC.g:2202:5: (lv_val_1_0= RULE_INT )
                    // InternalC.g:2203:6: lv_val_1_0= RULE_INT
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
                    // InternalC.g:2221:3: ( () ( (lv_val_3_0= RULE_TRUE ) ) )
                    {
                    // InternalC.g:2221:3: ( () ( (lv_val_3_0= RULE_TRUE ) ) )
                    // InternalC.g:2222:4: () ( (lv_val_3_0= RULE_TRUE ) )
                    {
                    // InternalC.g:2222:4: ()
                    // InternalC.g:2223:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLiteralAccess().getTrueLitAction_1_0(),
                    						current);
                    				

                    }

                    // InternalC.g:2229:4: ( (lv_val_3_0= RULE_TRUE ) )
                    // InternalC.g:2230:5: (lv_val_3_0= RULE_TRUE )
                    {
                    // InternalC.g:2230:5: (lv_val_3_0= RULE_TRUE )
                    // InternalC.g:2231:6: lv_val_3_0= RULE_TRUE
                    {
                    lv_val_3_0=(Token)match(input,RULE_TRUE,FOLLOW_2); 

                    						newLeafNode(lv_val_3_0, grammarAccess.getLiteralAccess().getValTRUETerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLiteralRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"val",
                    							lv_val_3_0,
                    							"com.poli.compilador.C.TRUE");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalC.g:2249:3: ( () ( (lv_val_5_0= RULE_FALSE ) ) )
                    {
                    // InternalC.g:2249:3: ( () ( (lv_val_5_0= RULE_FALSE ) ) )
                    // InternalC.g:2250:4: () ( (lv_val_5_0= RULE_FALSE ) )
                    {
                    // InternalC.g:2250:4: ()
                    // InternalC.g:2251:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLiteralAccess().getFalseLitAction_2_0(),
                    						current);
                    				

                    }

                    // InternalC.g:2257:4: ( (lv_val_5_0= RULE_FALSE ) )
                    // InternalC.g:2258:5: (lv_val_5_0= RULE_FALSE )
                    {
                    // InternalC.g:2258:5: (lv_val_5_0= RULE_FALSE )
                    // InternalC.g:2259:6: lv_val_5_0= RULE_FALSE
                    {
                    lv_val_5_0=(Token)match(input,RULE_FALSE,FOLLOW_2); 

                    						newLeafNode(lv_val_5_0, grammarAccess.getLiteralAccess().getValFALSETerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLiteralRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"val",
                    							lv_val_5_0,
                    							"com.poli.compilador.C.FALSE");
                    					

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000004080402L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400400L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000079D7183E10L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000008008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000005080400L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002103A10L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000080201000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000A103A10L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000050000100002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000002503A10L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020002103A10L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000079D6183E12L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000002L});

}