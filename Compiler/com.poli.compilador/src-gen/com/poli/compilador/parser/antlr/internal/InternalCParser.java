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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_LO", "RULE_RO", "RULE_AO1", "RULE_AO2", "RULE_UO", "RULE_TYPELIT", "RULE_INT", "RULE_TRUE", "RULE_FALSE", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'{'", "'}'", "','", "';'", "'struct'", "'if'", "'else'", "'while'", "'for'", "'switch'", "'default'", "':'", "'do'", "'break'", "'continue'", "'return'", "'='", "'**'", "'['", "']'", "'.'", "'case'"
    };
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

                if ( (LA1_0==RULE_TYPELIT||LA1_0==25) ) {
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
    // InternalC.g:107:1: ruleDefinition returns [EObject current=null] : ( (this_IdDef_0= ruleIdDef ( ( (lv_val_1_0= ruleFunction ) ) | ( (lv_val_2_0= ruleDeclaration ) ) ) ) | this_Struct_3= ruleStruct ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_IdDef_0 = null;

        EObject lv_val_1_0 = null;

        EObject lv_val_2_0 = null;

        EObject this_Struct_3 = null;



        	enterRule();

        try {
            // InternalC.g:113:2: ( ( (this_IdDef_0= ruleIdDef ( ( (lv_val_1_0= ruleFunction ) ) | ( (lv_val_2_0= ruleDeclaration ) ) ) ) | this_Struct_3= ruleStruct ) )
            // InternalC.g:114:2: ( (this_IdDef_0= ruleIdDef ( ( (lv_val_1_0= ruleFunction ) ) | ( (lv_val_2_0= ruleDeclaration ) ) ) ) | this_Struct_3= ruleStruct )
            {
            // InternalC.g:114:2: ( (this_IdDef_0= ruleIdDef ( ( (lv_val_1_0= ruleFunction ) ) | ( (lv_val_2_0= ruleDeclaration ) ) ) ) | this_Struct_3= ruleStruct )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_TYPELIT) ) {
                alt3=1;
            }
            else if ( (LA3_0==25) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalC.g:115:3: (this_IdDef_0= ruleIdDef ( ( (lv_val_1_0= ruleFunction ) ) | ( (lv_val_2_0= ruleDeclaration ) ) ) )
                    {
                    // InternalC.g:115:3: (this_IdDef_0= ruleIdDef ( ( (lv_val_1_0= ruleFunction ) ) | ( (lv_val_2_0= ruleDeclaration ) ) ) )
                    // InternalC.g:116:4: this_IdDef_0= ruleIdDef ( ( (lv_val_1_0= ruleFunction ) ) | ( (lv_val_2_0= ruleDeclaration ) ) )
                    {

                    				newCompositeNode(grammarAccess.getDefinitionAccess().getIdDefParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_4);
                    this_IdDef_0=ruleIdDef();

                    state._fsp--;


                    				current = this_IdDef_0;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalC.g:124:4: ( ( (lv_val_1_0= ruleFunction ) ) | ( (lv_val_2_0= ruleDeclaration ) ) )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==19) ) {
                        alt2=1;
                    }
                    else if ( ((LA2_0>=23 && LA2_0<=24)||LA2_0==37) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalC.g:125:5: ( (lv_val_1_0= ruleFunction ) )
                            {
                            // InternalC.g:125:5: ( (lv_val_1_0= ruleFunction ) )
                            // InternalC.g:126:6: (lv_val_1_0= ruleFunction )
                            {
                            // InternalC.g:126:6: (lv_val_1_0= ruleFunction )
                            // InternalC.g:127:7: lv_val_1_0= ruleFunction
                            {

                            							newCompositeNode(grammarAccess.getDefinitionAccess().getValFunctionParserRuleCall_0_1_0_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_val_1_0=ruleFunction();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getDefinitionRule());
                            							}
                            							set(
                            								current,
                            								"val",
                            								lv_val_1_0,
                            								"com.poli.compilador.C.Function");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalC.g:145:5: ( (lv_val_2_0= ruleDeclaration ) )
                            {
                            // InternalC.g:145:5: ( (lv_val_2_0= ruleDeclaration ) )
                            // InternalC.g:146:6: (lv_val_2_0= ruleDeclaration )
                            {
                            // InternalC.g:146:6: (lv_val_2_0= ruleDeclaration )
                            // InternalC.g:147:7: lv_val_2_0= ruleDeclaration
                            {

                            							newCompositeNode(grammarAccess.getDefinitionAccess().getValDeclarationParserRuleCall_0_1_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_val_2_0=ruleDeclaration();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getDefinitionRule());
                            							}
                            							set(
                            								current,
                            								"val",
                            								lv_val_2_0,
                            								"com.poli.compilador.C.Declaration");
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
                    // InternalC.g:167:3: this_Struct_3= ruleStruct
                    {

                    			newCompositeNode(grammarAccess.getDefinitionAccess().getStructParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Struct_3=ruleStruct();

                    state._fsp--;


                    			current = this_Struct_3;
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
    // InternalC.g:179:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalC.g:179:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalC.g:180:2: iv_ruleFunction= ruleFunction EOF
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
    // InternalC.g:186:1: ruleFunction returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_params_2_0= ruleParameter ) )? otherlv_3= ')' otherlv_4= '{' ( (lv_commands_5_0= ruleCommand ) )* otherlv_6= '}' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_params_2_0 = null;

        EObject lv_commands_5_0 = null;



        	enterRule();

        try {
            // InternalC.g:192:2: ( ( () otherlv_1= '(' ( (lv_params_2_0= ruleParameter ) )? otherlv_3= ')' otherlv_4= '{' ( (lv_commands_5_0= ruleCommand ) )* otherlv_6= '}' ) )
            // InternalC.g:193:2: ( () otherlv_1= '(' ( (lv_params_2_0= ruleParameter ) )? otherlv_3= ')' otherlv_4= '{' ( (lv_commands_5_0= ruleCommand ) )* otherlv_6= '}' )
            {
            // InternalC.g:193:2: ( () otherlv_1= '(' ( (lv_params_2_0= ruleParameter ) )? otherlv_3= ')' otherlv_4= '{' ( (lv_commands_5_0= ruleCommand ) )* otherlv_6= '}' )
            // InternalC.g:194:3: () otherlv_1= '(' ( (lv_params_2_0= ruleParameter ) )? otherlv_3= ')' otherlv_4= '{' ( (lv_commands_5_0= ruleCommand ) )* otherlv_6= '}'
            {
            // InternalC.g:194:3: ()
            // InternalC.g:195:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFunctionAccess().getFunctionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalC.g:205:3: ( (lv_params_2_0= ruleParameter ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_TYPELIT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalC.g:206:4: (lv_params_2_0= ruleParameter )
                    {
                    // InternalC.g:206:4: (lv_params_2_0= ruleParameter )
                    // InternalC.g:207:5: lv_params_2_0= ruleParameter
                    {

                    					newCompositeNode(grammarAccess.getFunctionAccess().getParamsParameterParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_params_2_0=ruleParameter();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionRule());
                    					}
                    					add(
                    						current,
                    						"params",
                    						lv_params_2_0,
                    						"com.poli.compilador.C.Parameter");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalC.g:232:3: ( (lv_commands_5_0= ruleCommand ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==RULE_TYPELIT||(LA5_0>=25 && LA5_0<=26)||(LA5_0>=28 && LA5_0<=30)||(LA5_0>=33 && LA5_0<=36)||LA5_0==38) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalC.g:233:4: (lv_commands_5_0= ruleCommand )
            	    {
            	    // InternalC.g:233:4: (lv_commands_5_0= ruleCommand )
            	    // InternalC.g:234:5: lv_commands_5_0= ruleCommand
            	    {

            	    					newCompositeNode(grammarAccess.getFunctionAccess().getCommandsCommandParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_commands_5_0=ruleCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFunctionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"commands",
            	    						lv_commands_5_0,
            	    						"com.poli.compilador.C.Command");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalC.g:259:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalC.g:259:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalC.g:260:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // InternalC.g:266:1: ruleDeclaration returns [EObject current=null] : ( () (otherlv_1= ',' ( (lv_name_2_0= ruleVariable ) ) )* ( (lv_val_3_0= ruleAssignment ) )? otherlv_4= ';' ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_name_2_0 = null;

        EObject lv_val_3_0 = null;



        	enterRule();

        try {
            // InternalC.g:272:2: ( ( () (otherlv_1= ',' ( (lv_name_2_0= ruleVariable ) ) )* ( (lv_val_3_0= ruleAssignment ) )? otherlv_4= ';' ) )
            // InternalC.g:273:2: ( () (otherlv_1= ',' ( (lv_name_2_0= ruleVariable ) ) )* ( (lv_val_3_0= ruleAssignment ) )? otherlv_4= ';' )
            {
            // InternalC.g:273:2: ( () (otherlv_1= ',' ( (lv_name_2_0= ruleVariable ) ) )* ( (lv_val_3_0= ruleAssignment ) )? otherlv_4= ';' )
            // InternalC.g:274:3: () (otherlv_1= ',' ( (lv_name_2_0= ruleVariable ) ) )* ( (lv_val_3_0= ruleAssignment ) )? otherlv_4= ';'
            {
            // InternalC.g:274:3: ()
            // InternalC.g:275:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeclarationAccess().getDeclarationAction_0(),
            					current);
            			

            }

            // InternalC.g:281:3: (otherlv_1= ',' ( (lv_name_2_0= ruleVariable ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalC.g:282:4: otherlv_1= ',' ( (lv_name_2_0= ruleVariable ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_9); 

            	    				newLeafNode(otherlv_1, grammarAccess.getDeclarationAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalC.g:286:4: ( (lv_name_2_0= ruleVariable ) )
            	    // InternalC.g:287:5: (lv_name_2_0= ruleVariable )
            	    {
            	    // InternalC.g:287:5: (lv_name_2_0= ruleVariable )
            	    // InternalC.g:288:6: lv_name_2_0= ruleVariable
            	    {

            	    						newCompositeNode(grammarAccess.getDeclarationAccess().getNameVariableParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_name_2_0=ruleVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"name",
            	    							lv_name_2_0,
            	    							"com.poli.compilador.C.Variable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalC.g:306:3: ( (lv_val_3_0= ruleAssignment ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==37) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalC.g:307:4: (lv_val_3_0= ruleAssignment )
                    {
                    // InternalC.g:307:4: (lv_val_3_0= ruleAssignment )
                    // InternalC.g:308:5: lv_val_3_0= ruleAssignment
                    {

                    					newCompositeNode(grammarAccess.getDeclarationAccess().getValAssignmentParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_val_3_0=ruleAssignment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclarationRule());
                    					}
                    					add(
                    						current,
                    						"val",
                    						lv_val_3_0,
                    						"com.poli.compilador.C.Assignment");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDeclarationAccess().getSemicolonKeyword_3());
            		

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
    // InternalC.g:333:1: entryRuleStruct returns [EObject current=null] : iv_ruleStruct= ruleStruct EOF ;
    public final EObject entryRuleStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStruct = null;


        try {
            // InternalC.g:333:47: (iv_ruleStruct= ruleStruct EOF )
            // InternalC.g:334:2: iv_ruleStruct= ruleStruct EOF
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
    // InternalC.g:340:1: ruleStruct returns [EObject current=null] : ( () otherlv_1= 'struct' ( (lv_name_2_0= ruleVariable ) ) otherlv_3= '{' ( (lv_def_4_0= ruleIdDef ) ) ( (lv_decl_5_0= ruleDeclaration ) ) otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleStruct() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_name_2_0 = null;

        EObject lv_def_4_0 = null;

        EObject lv_decl_5_0 = null;



        	enterRule();

        try {
            // InternalC.g:346:2: ( ( () otherlv_1= 'struct' ( (lv_name_2_0= ruleVariable ) ) otherlv_3= '{' ( (lv_def_4_0= ruleIdDef ) ) ( (lv_decl_5_0= ruleDeclaration ) ) otherlv_6= '}' otherlv_7= ';' ) )
            // InternalC.g:347:2: ( () otherlv_1= 'struct' ( (lv_name_2_0= ruleVariable ) ) otherlv_3= '{' ( (lv_def_4_0= ruleIdDef ) ) ( (lv_decl_5_0= ruleDeclaration ) ) otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalC.g:347:2: ( () otherlv_1= 'struct' ( (lv_name_2_0= ruleVariable ) ) otherlv_3= '{' ( (lv_def_4_0= ruleIdDef ) ) ( (lv_decl_5_0= ruleDeclaration ) ) otherlv_6= '}' otherlv_7= ';' )
            // InternalC.g:348:3: () otherlv_1= 'struct' ( (lv_name_2_0= ruleVariable ) ) otherlv_3= '{' ( (lv_def_4_0= ruleIdDef ) ) ( (lv_decl_5_0= ruleDeclaration ) ) otherlv_6= '}' otherlv_7= ';'
            {
            // InternalC.g:348:3: ()
            // InternalC.g:349:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStructAccess().getStructAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getStructAccess().getStructKeyword_1());
            		
            // InternalC.g:359:3: ( (lv_name_2_0= ruleVariable ) )
            // InternalC.g:360:4: (lv_name_2_0= ruleVariable )
            {
            // InternalC.g:360:4: (lv_name_2_0= ruleVariable )
            // InternalC.g:361:5: lv_name_2_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getStructAccess().getNameVariableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_2_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStructRule());
            					}
            					add(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.poli.compilador.C.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getStructAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalC.g:382:3: ( (lv_def_4_0= ruleIdDef ) )
            // InternalC.g:383:4: (lv_def_4_0= ruleIdDef )
            {
            // InternalC.g:383:4: (lv_def_4_0= ruleIdDef )
            // InternalC.g:384:5: lv_def_4_0= ruleIdDef
            {

            					newCompositeNode(grammarAccess.getStructAccess().getDefIdDefParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_4);
            lv_def_4_0=ruleIdDef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStructRule());
            					}
            					add(
            						current,
            						"def",
            						lv_def_4_0,
            						"com.poli.compilador.C.IdDef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalC.g:401:3: ( (lv_decl_5_0= ruleDeclaration ) )
            // InternalC.g:402:4: (lv_decl_5_0= ruleDeclaration )
            {
            // InternalC.g:402:4: (lv_decl_5_0= ruleDeclaration )
            // InternalC.g:403:5: lv_decl_5_0= ruleDeclaration
            {

            					newCompositeNode(grammarAccess.getStructAccess().getDeclDeclarationParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_13);
            lv_decl_5_0=ruleDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStructRule());
            					}
            					add(
            						current,
            						"decl",
            						lv_decl_5_0,
            						"com.poli.compilador.C.Declaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getStructAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getStructAccess().getSemicolonKeyword_7());
            		

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
    // InternalC.g:432:1: entryRuleIdDef returns [EObject current=null] : iv_ruleIdDef= ruleIdDef EOF ;
    public final EObject entryRuleIdDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdDef = null;


        try {
            // InternalC.g:432:46: (iv_ruleIdDef= ruleIdDef EOF )
            // InternalC.g:433:2: iv_ruleIdDef= ruleIdDef EOF
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
    // InternalC.g:439:1: ruleIdDef returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleType ) ) ( (lv_name_1_0= ruleVariable ) ) ) ;
    public final EObject ruleIdDef() throws RecognitionException {
        EObject current = null;

        EObject lv_tipo_0_0 = null;

        EObject lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalC.g:445:2: ( ( ( (lv_tipo_0_0= ruleType ) ) ( (lv_name_1_0= ruleVariable ) ) ) )
            // InternalC.g:446:2: ( ( (lv_tipo_0_0= ruleType ) ) ( (lv_name_1_0= ruleVariable ) ) )
            {
            // InternalC.g:446:2: ( ( (lv_tipo_0_0= ruleType ) ) ( (lv_name_1_0= ruleVariable ) ) )
            // InternalC.g:447:3: ( (lv_tipo_0_0= ruleType ) ) ( (lv_name_1_0= ruleVariable ) )
            {
            // InternalC.g:447:3: ( (lv_tipo_0_0= ruleType ) )
            // InternalC.g:448:4: (lv_tipo_0_0= ruleType )
            {
            // InternalC.g:448:4: (lv_tipo_0_0= ruleType )
            // InternalC.g:449:5: lv_tipo_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getIdDefAccess().getTipoTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalC.g:466:3: ( (lv_name_1_0= ruleVariable ) )
            // InternalC.g:467:4: (lv_name_1_0= ruleVariable )
            {
            // InternalC.g:467:4: (lv_name_1_0= ruleVariable )
            // InternalC.g:468:5: lv_name_1_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getIdDefAccess().getNameVariableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIdDefRule());
            					}
            					add(
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
    // InternalC.g:489:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalC.g:489:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalC.g:490:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalC.g:496:1: ruleVariable returns [EObject current=null] : ( ( () this_ID_1= RULE_ID ) | this_PointerExp_2= rulePointerExp ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token this_ID_1=null;
        EObject this_PointerExp_2 = null;



        	enterRule();

        try {
            // InternalC.g:502:2: ( ( ( () this_ID_1= RULE_ID ) | this_PointerExp_2= rulePointerExp ) )
            // InternalC.g:503:2: ( ( () this_ID_1= RULE_ID ) | this_PointerExp_2= rulePointerExp )
            {
            // InternalC.g:503:2: ( ( () this_ID_1= RULE_ID ) | this_PointerExp_2= rulePointerExp )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==38) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalC.g:504:3: ( () this_ID_1= RULE_ID )
                    {
                    // InternalC.g:504:3: ( () this_ID_1= RULE_ID )
                    // InternalC.g:505:4: () this_ID_1= RULE_ID
                    {
                    // InternalC.g:505:4: ()
                    // InternalC.g:506:5: 
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
                    // InternalC.g:518:3: this_PointerExp_2= rulePointerExp
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
    // InternalC.g:530:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalC.g:530:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalC.g:531:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalC.g:537:1: ruleCommand returns [EObject current=null] : ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_commands_6_0= ruleCommand ) )* otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_commands_10_0= ruleCommand ) )* otherlv_11= '}' )? ) | ( () otherlv_13= 'while' otherlv_14= '(' ( (lv_exp_15_0= ruleExpression ) ) otherlv_16= ')' otherlv_17= '{' ( (lv_commands_18_0= ruleCommand ) )* otherlv_19= '}' ) | ( () otherlv_21= 'for' otherlv_22= '(' ( (lv_val_23_0= rulelValue ) ) ( (lv_val_24_0= ruleAssignment ) ) otherlv_25= ';' ( (lv_exp_26_0= ruleExpression ) ) otherlv_27= ';' ( (lv_val_28_0= rulelValue ) ) ( (lv_val_29_0= ruleAssignment ) ) otherlv_30= ')' otherlv_31= '{' ( (lv_commands_32_0= ruleCommand ) )* otherlv_33= '}' ) | ( () otherlv_35= 'switch' otherlv_36= '(' ( (lv_exp_37_0= ruleExpression ) ) otherlv_38= ')' otherlv_39= '{' ( (lv_cases_40_0= ruleCase ) )* (otherlv_41= 'default' otherlv_42= ':' ( (lv_commands_43_0= ruleCommand ) )* )? otherlv_44= '}' ) | ( () ( (lv_def_46_0= ruleIdDef ) ) ( (lv_decl_47_0= ruleDeclaration ) ) ) | ( () otherlv_49= 'do' otherlv_50= '{' ( (lv_commands_51_0= ruleCommand ) )* otherlv_52= '}' otherlv_53= 'while' otherlv_54= '(' ( (lv_exp_55_0= ruleExpression ) ) otherlv_56= ')' otherlv_57= ';' ) | ( () ( ( ( (lv_val_59_0= rulelValue ) ) ( (lv_val_60_0= ruleAssignment ) )? ) | (otherlv_61= 'struct' this_ID_62= RULE_ID this_ID_63= RULE_ID ) ) otherlv_64= ';' ) | ( () otherlv_66= 'break' otherlv_67= ';' ) | ( () otherlv_69= 'continue' otherlv_70= ';' ) | ( () otherlv_72= 'return' ( (lv_exp_73_0= ruleExpression ) )? otherlv_74= ';' ) ) ;
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
        Token otherlv_49=null;
        Token otherlv_50=null;
        Token otherlv_52=null;
        Token otherlv_53=null;
        Token otherlv_54=null;
        Token otherlv_56=null;
        Token otherlv_57=null;
        Token otherlv_61=null;
        Token this_ID_62=null;
        Token this_ID_63=null;
        Token otherlv_64=null;
        Token otherlv_66=null;
        Token otherlv_67=null;
        Token otherlv_69=null;
        Token otherlv_70=null;
        Token otherlv_72=null;
        Token otherlv_74=null;
        EObject lv_exp_3_0 = null;

        EObject lv_commands_6_0 = null;

        EObject lv_commands_10_0 = null;

        EObject lv_exp_15_0 = null;

        EObject lv_commands_18_0 = null;

        EObject lv_val_23_0 = null;

        EObject lv_val_24_0 = null;

        EObject lv_exp_26_0 = null;

        EObject lv_val_28_0 = null;

        EObject lv_val_29_0 = null;

        EObject lv_commands_32_0 = null;

        EObject lv_exp_37_0 = null;

        EObject lv_cases_40_0 = null;

        EObject lv_commands_43_0 = null;

        EObject lv_def_46_0 = null;

        EObject lv_decl_47_0 = null;

        EObject lv_commands_51_0 = null;

        EObject lv_exp_55_0 = null;

        EObject lv_val_59_0 = null;

        EObject lv_val_60_0 = null;

        EObject lv_exp_73_0 = null;



        	enterRule();

        try {
            // InternalC.g:543:2: ( ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_commands_6_0= ruleCommand ) )* otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_commands_10_0= ruleCommand ) )* otherlv_11= '}' )? ) | ( () otherlv_13= 'while' otherlv_14= '(' ( (lv_exp_15_0= ruleExpression ) ) otherlv_16= ')' otherlv_17= '{' ( (lv_commands_18_0= ruleCommand ) )* otherlv_19= '}' ) | ( () otherlv_21= 'for' otherlv_22= '(' ( (lv_val_23_0= rulelValue ) ) ( (lv_val_24_0= ruleAssignment ) ) otherlv_25= ';' ( (lv_exp_26_0= ruleExpression ) ) otherlv_27= ';' ( (lv_val_28_0= rulelValue ) ) ( (lv_val_29_0= ruleAssignment ) ) otherlv_30= ')' otherlv_31= '{' ( (lv_commands_32_0= ruleCommand ) )* otherlv_33= '}' ) | ( () otherlv_35= 'switch' otherlv_36= '(' ( (lv_exp_37_0= ruleExpression ) ) otherlv_38= ')' otherlv_39= '{' ( (lv_cases_40_0= ruleCase ) )* (otherlv_41= 'default' otherlv_42= ':' ( (lv_commands_43_0= ruleCommand ) )* )? otherlv_44= '}' ) | ( () ( (lv_def_46_0= ruleIdDef ) ) ( (lv_decl_47_0= ruleDeclaration ) ) ) | ( () otherlv_49= 'do' otherlv_50= '{' ( (lv_commands_51_0= ruleCommand ) )* otherlv_52= '}' otherlv_53= 'while' otherlv_54= '(' ( (lv_exp_55_0= ruleExpression ) ) otherlv_56= ')' otherlv_57= ';' ) | ( () ( ( ( (lv_val_59_0= rulelValue ) ) ( (lv_val_60_0= ruleAssignment ) )? ) | (otherlv_61= 'struct' this_ID_62= RULE_ID this_ID_63= RULE_ID ) ) otherlv_64= ';' ) | ( () otherlv_66= 'break' otherlv_67= ';' ) | ( () otherlv_69= 'continue' otherlv_70= ';' ) | ( () otherlv_72= 'return' ( (lv_exp_73_0= ruleExpression ) )? otherlv_74= ';' ) ) )
            // InternalC.g:544:2: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_commands_6_0= ruleCommand ) )* otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_commands_10_0= ruleCommand ) )* otherlv_11= '}' )? ) | ( () otherlv_13= 'while' otherlv_14= '(' ( (lv_exp_15_0= ruleExpression ) ) otherlv_16= ')' otherlv_17= '{' ( (lv_commands_18_0= ruleCommand ) )* otherlv_19= '}' ) | ( () otherlv_21= 'for' otherlv_22= '(' ( (lv_val_23_0= rulelValue ) ) ( (lv_val_24_0= ruleAssignment ) ) otherlv_25= ';' ( (lv_exp_26_0= ruleExpression ) ) otherlv_27= ';' ( (lv_val_28_0= rulelValue ) ) ( (lv_val_29_0= ruleAssignment ) ) otherlv_30= ')' otherlv_31= '{' ( (lv_commands_32_0= ruleCommand ) )* otherlv_33= '}' ) | ( () otherlv_35= 'switch' otherlv_36= '(' ( (lv_exp_37_0= ruleExpression ) ) otherlv_38= ')' otherlv_39= '{' ( (lv_cases_40_0= ruleCase ) )* (otherlv_41= 'default' otherlv_42= ':' ( (lv_commands_43_0= ruleCommand ) )* )? otherlv_44= '}' ) | ( () ( (lv_def_46_0= ruleIdDef ) ) ( (lv_decl_47_0= ruleDeclaration ) ) ) | ( () otherlv_49= 'do' otherlv_50= '{' ( (lv_commands_51_0= ruleCommand ) )* otherlv_52= '}' otherlv_53= 'while' otherlv_54= '(' ( (lv_exp_55_0= ruleExpression ) ) otherlv_56= ')' otherlv_57= ';' ) | ( () ( ( ( (lv_val_59_0= rulelValue ) ) ( (lv_val_60_0= ruleAssignment ) )? ) | (otherlv_61= 'struct' this_ID_62= RULE_ID this_ID_63= RULE_ID ) ) otherlv_64= ';' ) | ( () otherlv_66= 'break' otherlv_67= ';' ) | ( () otherlv_69= 'continue' otherlv_70= ';' ) | ( () otherlv_72= 'return' ( (lv_exp_73_0= ruleExpression ) )? otherlv_74= ';' ) )
            {
            // InternalC.g:544:2: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_commands_6_0= ruleCommand ) )* otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_commands_10_0= ruleCommand ) )* otherlv_11= '}' )? ) | ( () otherlv_13= 'while' otherlv_14= '(' ( (lv_exp_15_0= ruleExpression ) ) otherlv_16= ')' otherlv_17= '{' ( (lv_commands_18_0= ruleCommand ) )* otherlv_19= '}' ) | ( () otherlv_21= 'for' otherlv_22= '(' ( (lv_val_23_0= rulelValue ) ) ( (lv_val_24_0= ruleAssignment ) ) otherlv_25= ';' ( (lv_exp_26_0= ruleExpression ) ) otherlv_27= ';' ( (lv_val_28_0= rulelValue ) ) ( (lv_val_29_0= ruleAssignment ) ) otherlv_30= ')' otherlv_31= '{' ( (lv_commands_32_0= ruleCommand ) )* otherlv_33= '}' ) | ( () otherlv_35= 'switch' otherlv_36= '(' ( (lv_exp_37_0= ruleExpression ) ) otherlv_38= ')' otherlv_39= '{' ( (lv_cases_40_0= ruleCase ) )* (otherlv_41= 'default' otherlv_42= ':' ( (lv_commands_43_0= ruleCommand ) )* )? otherlv_44= '}' ) | ( () ( (lv_def_46_0= ruleIdDef ) ) ( (lv_decl_47_0= ruleDeclaration ) ) ) | ( () otherlv_49= 'do' otherlv_50= '{' ( (lv_commands_51_0= ruleCommand ) )* otherlv_52= '}' otherlv_53= 'while' otherlv_54= '(' ( (lv_exp_55_0= ruleExpression ) ) otherlv_56= ')' otherlv_57= ';' ) | ( () ( ( ( (lv_val_59_0= rulelValue ) ) ( (lv_val_60_0= ruleAssignment ) )? ) | (otherlv_61= 'struct' this_ID_62= RULE_ID this_ID_63= RULE_ID ) ) otherlv_64= ';' ) | ( () otherlv_66= 'break' otherlv_67= ';' ) | ( () otherlv_69= 'continue' otherlv_70= ';' ) | ( () otherlv_72= 'return' ( (lv_exp_73_0= ruleExpression ) )? otherlv_74= ';' ) )
            int alt21=10;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt21=1;
                }
                break;
            case 28:
                {
                alt21=2;
                }
                break;
            case 29:
                {
                alt21=3;
                }
                break;
            case 30:
                {
                alt21=4;
                }
                break;
            case RULE_TYPELIT:
                {
                alt21=5;
                }
                break;
            case 33:
                {
                alt21=6;
                }
                break;
            case RULE_ID:
            case 25:
            case 38:
                {
                alt21=7;
                }
                break;
            case 34:
                {
                alt21=8;
                }
                break;
            case 35:
                {
                alt21=9;
                }
                break;
            case 36:
                {
                alt21=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalC.g:545:3: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_commands_6_0= ruleCommand ) )* otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_commands_10_0= ruleCommand ) )* otherlv_11= '}' )? )
                    {
                    // InternalC.g:545:3: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_commands_6_0= ruleCommand ) )* otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_commands_10_0= ruleCommand ) )* otherlv_11= '}' )? )
                    // InternalC.g:546:4: () otherlv_1= 'if' otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_commands_6_0= ruleCommand ) )* otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_commands_10_0= ruleCommand ) )* otherlv_11= '}' )?
                    {
                    // InternalC.g:546:4: ()
                    // InternalC.g:547:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getIfCmdAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,26,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getCommandAccess().getIfKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,19,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getCommandAccess().getLeftParenthesisKeyword_0_2());
                    			
                    // InternalC.g:561:4: ( (lv_exp_3_0= ruleExpression ) )
                    // InternalC.g:562:5: (lv_exp_3_0= ruleExpression )
                    {
                    // InternalC.g:562:5: (lv_exp_3_0= ruleExpression )
                    // InternalC.g:563:6: lv_exp_3_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getExpExpressionParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_exp_3_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						add(
                    							current,
                    							"exp",
                    							lv_exp_3_0,
                    							"com.poli.compilador.C.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getCommandAccess().getRightParenthesisKeyword_0_4());
                    			
                    otherlv_5=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getCommandAccess().getLeftCurlyBracketKeyword_0_5());
                    			
                    // InternalC.g:588:4: ( (lv_commands_6_0= ruleCommand ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID||LA9_0==RULE_TYPELIT||(LA9_0>=25 && LA9_0<=26)||(LA9_0>=28 && LA9_0<=30)||(LA9_0>=33 && LA9_0<=36)||LA9_0==38) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalC.g:589:5: (lv_commands_6_0= ruleCommand )
                    	    {
                    	    // InternalC.g:589:5: (lv_commands_6_0= ruleCommand )
                    	    // InternalC.g:590:6: lv_commands_6_0= ruleCommand
                    	    {

                    	    						newCompositeNode(grammarAccess.getCommandAccess().getCommandsCommandParserRuleCall_0_6_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_commands_6_0=ruleCommand();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"commands",
                    	    							lv_commands_6_0,
                    	    							"com.poli.compilador.C.Command");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getCommandAccess().getRightCurlyBracketKeyword_0_7());
                    			
                    // InternalC.g:611:4: (otherlv_8= 'else' otherlv_9= '{' ( (lv_commands_10_0= ruleCommand ) )* otherlv_11= '}' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==27) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalC.g:612:5: otherlv_8= 'else' otherlv_9= '{' ( (lv_commands_10_0= ruleCommand ) )* otherlv_11= '}'
                            {
                            otherlv_8=(Token)match(input,27,FOLLOW_7); 

                            					newLeafNode(otherlv_8, grammarAccess.getCommandAccess().getElseKeyword_0_8_0());
                            				
                            otherlv_9=(Token)match(input,21,FOLLOW_8); 

                            					newLeafNode(otherlv_9, grammarAccess.getCommandAccess().getLeftCurlyBracketKeyword_0_8_1());
                            				
                            // InternalC.g:620:5: ( (lv_commands_10_0= ruleCommand ) )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==RULE_ID||LA10_0==RULE_TYPELIT||(LA10_0>=25 && LA10_0<=26)||(LA10_0>=28 && LA10_0<=30)||(LA10_0>=33 && LA10_0<=36)||LA10_0==38) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // InternalC.g:621:6: (lv_commands_10_0= ruleCommand )
                            	    {
                            	    // InternalC.g:621:6: (lv_commands_10_0= ruleCommand )
                            	    // InternalC.g:622:7: lv_commands_10_0= ruleCommand
                            	    {

                            	    							newCompositeNode(grammarAccess.getCommandAccess().getCommandsCommandParserRuleCall_0_8_2_0());
                            	    						
                            	    pushFollow(FOLLOW_8);
                            	    lv_commands_10_0=ruleCommand();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getCommandRule());
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
                            	    break loop10;
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
                    // InternalC.g:646:3: ( () otherlv_13= 'while' otherlv_14= '(' ( (lv_exp_15_0= ruleExpression ) ) otherlv_16= ')' otherlv_17= '{' ( (lv_commands_18_0= ruleCommand ) )* otherlv_19= '}' )
                    {
                    // InternalC.g:646:3: ( () otherlv_13= 'while' otherlv_14= '(' ( (lv_exp_15_0= ruleExpression ) ) otherlv_16= ')' otherlv_17= '{' ( (lv_commands_18_0= ruleCommand ) )* otherlv_19= '}' )
                    // InternalC.g:647:4: () otherlv_13= 'while' otherlv_14= '(' ( (lv_exp_15_0= ruleExpression ) ) otherlv_16= ')' otherlv_17= '{' ( (lv_commands_18_0= ruleCommand ) )* otherlv_19= '}'
                    {
                    // InternalC.g:647:4: ()
                    // InternalC.g:648:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getWhileCmdAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_13=(Token)match(input,28,FOLLOW_14); 

                    				newLeafNode(otherlv_13, grammarAccess.getCommandAccess().getWhileKeyword_1_1());
                    			
                    otherlv_14=(Token)match(input,19,FOLLOW_15); 

                    				newLeafNode(otherlv_14, grammarAccess.getCommandAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalC.g:662:4: ( (lv_exp_15_0= ruleExpression ) )
                    // InternalC.g:663:5: (lv_exp_15_0= ruleExpression )
                    {
                    // InternalC.g:663:5: (lv_exp_15_0= ruleExpression )
                    // InternalC.g:664:6: lv_exp_15_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getExpExpressionParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_exp_15_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						add(
                    							current,
                    							"exp",
                    							lv_exp_15_0,
                    							"com.poli.compilador.C.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_16, grammarAccess.getCommandAccess().getRightParenthesisKeyword_1_4());
                    			
                    otherlv_17=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_17, grammarAccess.getCommandAccess().getLeftCurlyBracketKeyword_1_5());
                    			
                    // InternalC.g:689:4: ( (lv_commands_18_0= ruleCommand ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID||LA12_0==RULE_TYPELIT||(LA12_0>=25 && LA12_0<=26)||(LA12_0>=28 && LA12_0<=30)||(LA12_0>=33 && LA12_0<=36)||LA12_0==38) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalC.g:690:5: (lv_commands_18_0= ruleCommand )
                    	    {
                    	    // InternalC.g:690:5: (lv_commands_18_0= ruleCommand )
                    	    // InternalC.g:691:6: lv_commands_18_0= ruleCommand
                    	    {

                    	    						newCompositeNode(grammarAccess.getCommandAccess().getCommandsCommandParserRuleCall_1_6_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
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
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_19, grammarAccess.getCommandAccess().getRightCurlyBracketKeyword_1_7());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalC.g:714:3: ( () otherlv_21= 'for' otherlv_22= '(' ( (lv_val_23_0= rulelValue ) ) ( (lv_val_24_0= ruleAssignment ) ) otherlv_25= ';' ( (lv_exp_26_0= ruleExpression ) ) otherlv_27= ';' ( (lv_val_28_0= rulelValue ) ) ( (lv_val_29_0= ruleAssignment ) ) otherlv_30= ')' otherlv_31= '{' ( (lv_commands_32_0= ruleCommand ) )* otherlv_33= '}' )
                    {
                    // InternalC.g:714:3: ( () otherlv_21= 'for' otherlv_22= '(' ( (lv_val_23_0= rulelValue ) ) ( (lv_val_24_0= ruleAssignment ) ) otherlv_25= ';' ( (lv_exp_26_0= ruleExpression ) ) otherlv_27= ';' ( (lv_val_28_0= rulelValue ) ) ( (lv_val_29_0= ruleAssignment ) ) otherlv_30= ')' otherlv_31= '{' ( (lv_commands_32_0= ruleCommand ) )* otherlv_33= '}' )
                    // InternalC.g:715:4: () otherlv_21= 'for' otherlv_22= '(' ( (lv_val_23_0= rulelValue ) ) ( (lv_val_24_0= ruleAssignment ) ) otherlv_25= ';' ( (lv_exp_26_0= ruleExpression ) ) otherlv_27= ';' ( (lv_val_28_0= rulelValue ) ) ( (lv_val_29_0= ruleAssignment ) ) otherlv_30= ')' otherlv_31= '{' ( (lv_commands_32_0= ruleCommand ) )* otherlv_33= '}'
                    {
                    // InternalC.g:715:4: ()
                    // InternalC.g:716:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getForCmdAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_21=(Token)match(input,29,FOLLOW_14); 

                    				newLeafNode(otherlv_21, grammarAccess.getCommandAccess().getForKeyword_2_1());
                    			
                    otherlv_22=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_22, grammarAccess.getCommandAccess().getLeftParenthesisKeyword_2_2());
                    			
                    // InternalC.g:730:4: ( (lv_val_23_0= rulelValue ) )
                    // InternalC.g:731:5: (lv_val_23_0= rulelValue )
                    {
                    // InternalC.g:731:5: (lv_val_23_0= rulelValue )
                    // InternalC.g:732:6: lv_val_23_0= rulelValue
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getValLValueParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_val_23_0=rulelValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						add(
                    							current,
                    							"val",
                    							lv_val_23_0,
                    							"com.poli.compilador.C.lValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalC.g:749:4: ( (lv_val_24_0= ruleAssignment ) )
                    // InternalC.g:750:5: (lv_val_24_0= ruleAssignment )
                    {
                    // InternalC.g:750:5: (lv_val_24_0= ruleAssignment )
                    // InternalC.g:751:6: lv_val_24_0= ruleAssignment
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getValAssignmentParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_val_24_0=ruleAssignment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						add(
                    							current,
                    							"val",
                    							lv_val_24_0,
                    							"com.poli.compilador.C.Assignment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_25=(Token)match(input,24,FOLLOW_15); 

                    				newLeafNode(otherlv_25, grammarAccess.getCommandAccess().getSemicolonKeyword_2_5());
                    			
                    // InternalC.g:772:4: ( (lv_exp_26_0= ruleExpression ) )
                    // InternalC.g:773:5: (lv_exp_26_0= ruleExpression )
                    {
                    // InternalC.g:773:5: (lv_exp_26_0= ruleExpression )
                    // InternalC.g:774:6: lv_exp_26_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getExpExpressionParserRuleCall_2_6_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_exp_26_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						add(
                    							current,
                    							"exp",
                    							lv_exp_26_0,
                    							"com.poli.compilador.C.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_27=(Token)match(input,24,FOLLOW_9); 

                    				newLeafNode(otherlv_27, grammarAccess.getCommandAccess().getSemicolonKeyword_2_7());
                    			
                    // InternalC.g:795:4: ( (lv_val_28_0= rulelValue ) )
                    // InternalC.g:796:5: (lv_val_28_0= rulelValue )
                    {
                    // InternalC.g:796:5: (lv_val_28_0= rulelValue )
                    // InternalC.g:797:6: lv_val_28_0= rulelValue
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getValLValueParserRuleCall_2_8_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_val_28_0=rulelValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						add(
                    							current,
                    							"val",
                    							lv_val_28_0,
                    							"com.poli.compilador.C.lValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalC.g:814:4: ( (lv_val_29_0= ruleAssignment ) )
                    // InternalC.g:815:5: (lv_val_29_0= ruleAssignment )
                    {
                    // InternalC.g:815:5: (lv_val_29_0= ruleAssignment )
                    // InternalC.g:816:6: lv_val_29_0= ruleAssignment
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getValAssignmentParserRuleCall_2_9_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_val_29_0=ruleAssignment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						add(
                    							current,
                    							"val",
                    							lv_val_29_0,
                    							"com.poli.compilador.C.Assignment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_30=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_30, grammarAccess.getCommandAccess().getRightParenthesisKeyword_2_10());
                    			
                    otherlv_31=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_31, grammarAccess.getCommandAccess().getLeftCurlyBracketKeyword_2_11());
                    			
                    // InternalC.g:841:4: ( (lv_commands_32_0= ruleCommand ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID||LA13_0==RULE_TYPELIT||(LA13_0>=25 && LA13_0<=26)||(LA13_0>=28 && LA13_0<=30)||(LA13_0>=33 && LA13_0<=36)||LA13_0==38) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalC.g:842:5: (lv_commands_32_0= ruleCommand )
                    	    {
                    	    // InternalC.g:842:5: (lv_commands_32_0= ruleCommand )
                    	    // InternalC.g:843:6: lv_commands_32_0= ruleCommand
                    	    {

                    	    						newCompositeNode(grammarAccess.getCommandAccess().getCommandsCommandParserRuleCall_2_12_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
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
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_33, grammarAccess.getCommandAccess().getRightCurlyBracketKeyword_2_13());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalC.g:866:3: ( () otherlv_35= 'switch' otherlv_36= '(' ( (lv_exp_37_0= ruleExpression ) ) otherlv_38= ')' otherlv_39= '{' ( (lv_cases_40_0= ruleCase ) )* (otherlv_41= 'default' otherlv_42= ':' ( (lv_commands_43_0= ruleCommand ) )* )? otherlv_44= '}' )
                    {
                    // InternalC.g:866:3: ( () otherlv_35= 'switch' otherlv_36= '(' ( (lv_exp_37_0= ruleExpression ) ) otherlv_38= ')' otherlv_39= '{' ( (lv_cases_40_0= ruleCase ) )* (otherlv_41= 'default' otherlv_42= ':' ( (lv_commands_43_0= ruleCommand ) )* )? otherlv_44= '}' )
                    // InternalC.g:867:4: () otherlv_35= 'switch' otherlv_36= '(' ( (lv_exp_37_0= ruleExpression ) ) otherlv_38= ')' otherlv_39= '{' ( (lv_cases_40_0= ruleCase ) )* (otherlv_41= 'default' otherlv_42= ':' ( (lv_commands_43_0= ruleCommand ) )* )? otherlv_44= '}'
                    {
                    // InternalC.g:867:4: ()
                    // InternalC.g:868:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getSwitchCmdAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_35=(Token)match(input,30,FOLLOW_14); 

                    				newLeafNode(otherlv_35, grammarAccess.getCommandAccess().getSwitchKeyword_3_1());
                    			
                    otherlv_36=(Token)match(input,19,FOLLOW_15); 

                    				newLeafNode(otherlv_36, grammarAccess.getCommandAccess().getLeftParenthesisKeyword_3_2());
                    			
                    // InternalC.g:882:4: ( (lv_exp_37_0= ruleExpression ) )
                    // InternalC.g:883:5: (lv_exp_37_0= ruleExpression )
                    {
                    // InternalC.g:883:5: (lv_exp_37_0= ruleExpression )
                    // InternalC.g:884:6: lv_exp_37_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getExpExpressionParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_exp_37_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						add(
                    							current,
                    							"exp",
                    							lv_exp_37_0,
                    							"com.poli.compilador.C.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_38=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_38, grammarAccess.getCommandAccess().getRightParenthesisKeyword_3_4());
                    			
                    otherlv_39=(Token)match(input,21,FOLLOW_18); 

                    				newLeafNode(otherlv_39, grammarAccess.getCommandAccess().getLeftCurlyBracketKeyword_3_5());
                    			
                    // InternalC.g:909:4: ( (lv_cases_40_0= ruleCase ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==42) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalC.g:910:5: (lv_cases_40_0= ruleCase )
                    	    {
                    	    // InternalC.g:910:5: (lv_cases_40_0= ruleCase )
                    	    // InternalC.g:911:6: lv_cases_40_0= ruleCase
                    	    {

                    	    						newCompositeNode(grammarAccess.getCommandAccess().getCasesCaseParserRuleCall_3_6_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
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
                    	    break loop14;
                        }
                    } while (true);

                    // InternalC.g:928:4: (otherlv_41= 'default' otherlv_42= ':' ( (lv_commands_43_0= ruleCommand ) )* )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==31) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalC.g:929:5: otherlv_41= 'default' otherlv_42= ':' ( (lv_commands_43_0= ruleCommand ) )*
                            {
                            otherlv_41=(Token)match(input,31,FOLLOW_19); 

                            					newLeafNode(otherlv_41, grammarAccess.getCommandAccess().getDefaultKeyword_3_7_0());
                            				
                            otherlv_42=(Token)match(input,32,FOLLOW_8); 

                            					newLeafNode(otherlv_42, grammarAccess.getCommandAccess().getColonKeyword_3_7_1());
                            				
                            // InternalC.g:937:5: ( (lv_commands_43_0= ruleCommand ) )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==RULE_ID||LA15_0==RULE_TYPELIT||(LA15_0>=25 && LA15_0<=26)||(LA15_0>=28 && LA15_0<=30)||(LA15_0>=33 && LA15_0<=36)||LA15_0==38) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // InternalC.g:938:6: (lv_commands_43_0= ruleCommand )
                            	    {
                            	    // InternalC.g:938:6: (lv_commands_43_0= ruleCommand )
                            	    // InternalC.g:939:7: lv_commands_43_0= ruleCommand
                            	    {

                            	    							newCompositeNode(grammarAccess.getCommandAccess().getCommandsCommandParserRuleCall_3_7_2_0());
                            	    						
                            	    pushFollow(FOLLOW_8);
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
                            	    break loop15;
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
                    // InternalC.g:963:3: ( () ( (lv_def_46_0= ruleIdDef ) ) ( (lv_decl_47_0= ruleDeclaration ) ) )
                    {
                    // InternalC.g:963:3: ( () ( (lv_def_46_0= ruleIdDef ) ) ( (lv_decl_47_0= ruleDeclaration ) ) )
                    // InternalC.g:964:4: () ( (lv_def_46_0= ruleIdDef ) ) ( (lv_decl_47_0= ruleDeclaration ) )
                    {
                    // InternalC.g:964:4: ()
                    // InternalC.g:965:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getDeclCmdAction_4_0(),
                    						current);
                    				

                    }

                    // InternalC.g:971:4: ( (lv_def_46_0= ruleIdDef ) )
                    // InternalC.g:972:5: (lv_def_46_0= ruleIdDef )
                    {
                    // InternalC.g:972:5: (lv_def_46_0= ruleIdDef )
                    // InternalC.g:973:6: lv_def_46_0= ruleIdDef
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getDefIdDefParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_def_46_0=ruleIdDef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						add(
                    							current,
                    							"def",
                    							lv_def_46_0,
                    							"com.poli.compilador.C.IdDef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalC.g:990:4: ( (lv_decl_47_0= ruleDeclaration ) )
                    // InternalC.g:991:5: (lv_decl_47_0= ruleDeclaration )
                    {
                    // InternalC.g:991:5: (lv_decl_47_0= ruleDeclaration )
                    // InternalC.g:992:6: lv_decl_47_0= ruleDeclaration
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getDeclDeclarationParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_decl_47_0=ruleDeclaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						add(
                    							current,
                    							"decl",
                    							lv_decl_47_0,
                    							"com.poli.compilador.C.Declaration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalC.g:1011:3: ( () otherlv_49= 'do' otherlv_50= '{' ( (lv_commands_51_0= ruleCommand ) )* otherlv_52= '}' otherlv_53= 'while' otherlv_54= '(' ( (lv_exp_55_0= ruleExpression ) ) otherlv_56= ')' otherlv_57= ';' )
                    {
                    // InternalC.g:1011:3: ( () otherlv_49= 'do' otherlv_50= '{' ( (lv_commands_51_0= ruleCommand ) )* otherlv_52= '}' otherlv_53= 'while' otherlv_54= '(' ( (lv_exp_55_0= ruleExpression ) ) otherlv_56= ')' otherlv_57= ';' )
                    // InternalC.g:1012:4: () otherlv_49= 'do' otherlv_50= '{' ( (lv_commands_51_0= ruleCommand ) )* otherlv_52= '}' otherlv_53= 'while' otherlv_54= '(' ( (lv_exp_55_0= ruleExpression ) ) otherlv_56= ')' otherlv_57= ';'
                    {
                    // InternalC.g:1012:4: ()
                    // InternalC.g:1013:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getDoWhileCmdAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_49=(Token)match(input,33,FOLLOW_7); 

                    				newLeafNode(otherlv_49, grammarAccess.getCommandAccess().getDoKeyword_5_1());
                    			
                    otherlv_50=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_50, grammarAccess.getCommandAccess().getLeftCurlyBracketKeyword_5_2());
                    			
                    // InternalC.g:1027:4: ( (lv_commands_51_0= ruleCommand ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_ID||LA17_0==RULE_TYPELIT||(LA17_0>=25 && LA17_0<=26)||(LA17_0>=28 && LA17_0<=30)||(LA17_0>=33 && LA17_0<=36)||LA17_0==38) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalC.g:1028:5: (lv_commands_51_0= ruleCommand )
                    	    {
                    	    // InternalC.g:1028:5: (lv_commands_51_0= ruleCommand )
                    	    // InternalC.g:1029:6: lv_commands_51_0= ruleCommand
                    	    {

                    	    						newCompositeNode(grammarAccess.getCommandAccess().getCommandsCommandParserRuleCall_5_3_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_commands_51_0=ruleCommand();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"commands",
                    	    							lv_commands_51_0,
                    	    							"com.poli.compilador.C.Command");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_52=(Token)match(input,22,FOLLOW_20); 

                    				newLeafNode(otherlv_52, grammarAccess.getCommandAccess().getRightCurlyBracketKeyword_5_4());
                    			
                    otherlv_53=(Token)match(input,28,FOLLOW_14); 

                    				newLeafNode(otherlv_53, grammarAccess.getCommandAccess().getWhileKeyword_5_5());
                    			
                    otherlv_54=(Token)match(input,19,FOLLOW_15); 

                    				newLeafNode(otherlv_54, grammarAccess.getCommandAccess().getLeftParenthesisKeyword_5_6());
                    			
                    // InternalC.g:1058:4: ( (lv_exp_55_0= ruleExpression ) )
                    // InternalC.g:1059:5: (lv_exp_55_0= ruleExpression )
                    {
                    // InternalC.g:1059:5: (lv_exp_55_0= ruleExpression )
                    // InternalC.g:1060:6: lv_exp_55_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getExpExpressionParserRuleCall_5_7_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_exp_55_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						add(
                    							current,
                    							"exp",
                    							lv_exp_55_0,
                    							"com.poli.compilador.C.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_56=(Token)match(input,20,FOLLOW_11); 

                    				newLeafNode(otherlv_56, grammarAccess.getCommandAccess().getRightParenthesisKeyword_5_8());
                    			
                    otherlv_57=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_57, grammarAccess.getCommandAccess().getSemicolonKeyword_5_9());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalC.g:1087:3: ( () ( ( ( (lv_val_59_0= rulelValue ) ) ( (lv_val_60_0= ruleAssignment ) )? ) | (otherlv_61= 'struct' this_ID_62= RULE_ID this_ID_63= RULE_ID ) ) otherlv_64= ';' )
                    {
                    // InternalC.g:1087:3: ( () ( ( ( (lv_val_59_0= rulelValue ) ) ( (lv_val_60_0= ruleAssignment ) )? ) | (otherlv_61= 'struct' this_ID_62= RULE_ID this_ID_63= RULE_ID ) ) otherlv_64= ';' )
                    // InternalC.g:1088:4: () ( ( ( (lv_val_59_0= rulelValue ) ) ( (lv_val_60_0= ruleAssignment ) )? ) | (otherlv_61= 'struct' this_ID_62= RULE_ID this_ID_63= RULE_ID ) ) otherlv_64= ';'
                    {
                    // InternalC.g:1088:4: ()
                    // InternalC.g:1089:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getVarCmdAction_6_0(),
                    						current);
                    				

                    }

                    // InternalC.g:1095:4: ( ( ( (lv_val_59_0= rulelValue ) ) ( (lv_val_60_0= ruleAssignment ) )? ) | (otherlv_61= 'struct' this_ID_62= RULE_ID this_ID_63= RULE_ID ) )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_ID||LA19_0==38) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==25) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalC.g:1096:5: ( ( (lv_val_59_0= rulelValue ) ) ( (lv_val_60_0= ruleAssignment ) )? )
                            {
                            // InternalC.g:1096:5: ( ( (lv_val_59_0= rulelValue ) ) ( (lv_val_60_0= ruleAssignment ) )? )
                            // InternalC.g:1097:6: ( (lv_val_59_0= rulelValue ) ) ( (lv_val_60_0= ruleAssignment ) )?
                            {
                            // InternalC.g:1097:6: ( (lv_val_59_0= rulelValue ) )
                            // InternalC.g:1098:7: (lv_val_59_0= rulelValue )
                            {
                            // InternalC.g:1098:7: (lv_val_59_0= rulelValue )
                            // InternalC.g:1099:8: lv_val_59_0= rulelValue
                            {

                            								newCompositeNode(grammarAccess.getCommandAccess().getValLValueParserRuleCall_6_1_0_0_0());
                            							
                            pushFollow(FOLLOW_21);
                            lv_val_59_0=rulelValue();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getCommandRule());
                            								}
                            								add(
                            									current,
                            									"val",
                            									lv_val_59_0,
                            									"com.poli.compilador.C.lValue");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalC.g:1116:6: ( (lv_val_60_0= ruleAssignment ) )?
                            int alt18=2;
                            int LA18_0 = input.LA(1);

                            if ( (LA18_0==37) ) {
                                alt18=1;
                            }
                            switch (alt18) {
                                case 1 :
                                    // InternalC.g:1117:7: (lv_val_60_0= ruleAssignment )
                                    {
                                    // InternalC.g:1117:7: (lv_val_60_0= ruleAssignment )
                                    // InternalC.g:1118:8: lv_val_60_0= ruleAssignment
                                    {

                                    								newCompositeNode(grammarAccess.getCommandAccess().getValAssignmentParserRuleCall_6_1_0_1_0());
                                    							
                                    pushFollow(FOLLOW_11);
                                    lv_val_60_0=ruleAssignment();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getCommandRule());
                                    								}
                                    								add(
                                    									current,
                                    									"val",
                                    									lv_val_60_0,
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
                            // InternalC.g:1137:5: (otherlv_61= 'struct' this_ID_62= RULE_ID this_ID_63= RULE_ID )
                            {
                            // InternalC.g:1137:5: (otherlv_61= 'struct' this_ID_62= RULE_ID this_ID_63= RULE_ID )
                            // InternalC.g:1138:6: otherlv_61= 'struct' this_ID_62= RULE_ID this_ID_63= RULE_ID
                            {
                            otherlv_61=(Token)match(input,25,FOLLOW_22); 

                            						newLeafNode(otherlv_61, grammarAccess.getCommandAccess().getStructKeyword_6_1_1_0());
                            					
                            this_ID_62=(Token)match(input,RULE_ID,FOLLOW_22); 

                            						newLeafNode(this_ID_62, grammarAccess.getCommandAccess().getIDTerminalRuleCall_6_1_1_1());
                            					
                            this_ID_63=(Token)match(input,RULE_ID,FOLLOW_11); 

                            						newLeafNode(this_ID_63, grammarAccess.getCommandAccess().getIDTerminalRuleCall_6_1_1_2());
                            					

                            }


                            }
                            break;

                    }

                    otherlv_64=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_64, grammarAccess.getCommandAccess().getSemicolonKeyword_6_2());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalC.g:1158:3: ( () otherlv_66= 'break' otherlv_67= ';' )
                    {
                    // InternalC.g:1158:3: ( () otherlv_66= 'break' otherlv_67= ';' )
                    // InternalC.g:1159:4: () otherlv_66= 'break' otherlv_67= ';'
                    {
                    // InternalC.g:1159:4: ()
                    // InternalC.g:1160:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getBreakCmdAction_7_0(),
                    						current);
                    				

                    }

                    otherlv_66=(Token)match(input,34,FOLLOW_11); 

                    				newLeafNode(otherlv_66, grammarAccess.getCommandAccess().getBreakKeyword_7_1());
                    			
                    otherlv_67=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_67, grammarAccess.getCommandAccess().getSemicolonKeyword_7_2());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalC.g:1176:3: ( () otherlv_69= 'continue' otherlv_70= ';' )
                    {
                    // InternalC.g:1176:3: ( () otherlv_69= 'continue' otherlv_70= ';' )
                    // InternalC.g:1177:4: () otherlv_69= 'continue' otherlv_70= ';'
                    {
                    // InternalC.g:1177:4: ()
                    // InternalC.g:1178:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getContinueCmdAction_8_0(),
                    						current);
                    				

                    }

                    otherlv_69=(Token)match(input,35,FOLLOW_11); 

                    				newLeafNode(otherlv_69, grammarAccess.getCommandAccess().getContinueKeyword_8_1());
                    			
                    otherlv_70=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_70, grammarAccess.getCommandAccess().getSemicolonKeyword_8_2());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalC.g:1194:3: ( () otherlv_72= 'return' ( (lv_exp_73_0= ruleExpression ) )? otherlv_74= ';' )
                    {
                    // InternalC.g:1194:3: ( () otherlv_72= 'return' ( (lv_exp_73_0= ruleExpression ) )? otherlv_74= ';' )
                    // InternalC.g:1195:4: () otherlv_72= 'return' ( (lv_exp_73_0= ruleExpression ) )? otherlv_74= ';'
                    {
                    // InternalC.g:1195:4: ()
                    // InternalC.g:1196:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getReturnCmdAction_9_0(),
                    						current);
                    				

                    }

                    otherlv_72=(Token)match(input,36,FOLLOW_23); 

                    				newLeafNode(otherlv_72, grammarAccess.getCommandAccess().getReturnKeyword_9_1());
                    			
                    // InternalC.g:1206:4: ( (lv_exp_73_0= ruleExpression ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_ID||LA20_0==RULE_UO||(LA20_0>=RULE_INT && LA20_0<=RULE_FALSE)||LA20_0==19||LA20_0==38) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalC.g:1207:5: (lv_exp_73_0= ruleExpression )
                            {
                            // InternalC.g:1207:5: (lv_exp_73_0= ruleExpression )
                            // InternalC.g:1208:6: lv_exp_73_0= ruleExpression
                            {

                            						newCompositeNode(grammarAccess.getCommandAccess().getExpExpressionParserRuleCall_9_2_0());
                            					
                            pushFollow(FOLLOW_11);
                            lv_exp_73_0=ruleExpression();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getCommandRule());
                            						}
                            						add(
                            							current,
                            							"exp",
                            							lv_exp_73_0,
                            							"com.poli.compilador.C.Expression");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_74=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_74, grammarAccess.getCommandAccess().getSemicolonKeyword_9_3());
                    			

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


    // $ANTLR start "entryRuleParameter"
    // InternalC.g:1234:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalC.g:1234:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalC.g:1235:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalC.g:1241:1: ruleParameter returns [EObject current=null] : ( ( (lv_def_0_0= ruleIdDef ) ) (otherlv_1= ',' ( (lv_def_2_0= ruleIdDef ) ) )* ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_def_0_0 = null;

        EObject lv_def_2_0 = null;



        	enterRule();

        try {
            // InternalC.g:1247:2: ( ( ( (lv_def_0_0= ruleIdDef ) ) (otherlv_1= ',' ( (lv_def_2_0= ruleIdDef ) ) )* ) )
            // InternalC.g:1248:2: ( ( (lv_def_0_0= ruleIdDef ) ) (otherlv_1= ',' ( (lv_def_2_0= ruleIdDef ) ) )* )
            {
            // InternalC.g:1248:2: ( ( (lv_def_0_0= ruleIdDef ) ) (otherlv_1= ',' ( (lv_def_2_0= ruleIdDef ) ) )* )
            // InternalC.g:1249:3: ( (lv_def_0_0= ruleIdDef ) ) (otherlv_1= ',' ( (lv_def_2_0= ruleIdDef ) ) )*
            {
            // InternalC.g:1249:3: ( (lv_def_0_0= ruleIdDef ) )
            // InternalC.g:1250:4: (lv_def_0_0= ruleIdDef )
            {
            // InternalC.g:1250:4: (lv_def_0_0= ruleIdDef )
            // InternalC.g:1251:5: lv_def_0_0= ruleIdDef
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getDefIdDefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
            lv_def_0_0=ruleIdDef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					add(
            						current,
            						"def",
            						lv_def_0_0,
            						"com.poli.compilador.C.IdDef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalC.g:1268:3: (otherlv_1= ',' ( (lv_def_2_0= ruleIdDef ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==23) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalC.g:1269:4: otherlv_1= ',' ( (lv_def_2_0= ruleIdDef ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_12); 

            	    				newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalC.g:1273:4: ( (lv_def_2_0= ruleIdDef ) )
            	    // InternalC.g:1274:5: (lv_def_2_0= ruleIdDef )
            	    {
            	    // InternalC.g:1274:5: (lv_def_2_0= ruleIdDef )
            	    // InternalC.g:1275:6: lv_def_2_0= ruleIdDef
            	    {

            	    						newCompositeNode(grammarAccess.getParameterAccess().getDefIdDefParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_def_2_0=ruleIdDef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParameterRule());
            	    						}
            	    						add(
            	    							current,
            	    							"def",
            	    							lv_def_2_0,
            	    							"com.poli.compilador.C.IdDef");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleArgument"
    // InternalC.g:1297:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalC.g:1297:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalC.g:1298:2: iv_ruleArgument= ruleArgument EOF
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
    // InternalC.g:1304:1: ruleArgument returns [EObject current=null] : ( ( (lv_exp_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exp_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exp_0_0 = null;

        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalC.g:1310:2: ( ( ( (lv_exp_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exp_2_0= ruleExpression ) ) )* ) )
            // InternalC.g:1311:2: ( ( (lv_exp_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exp_2_0= ruleExpression ) ) )* )
            {
            // InternalC.g:1311:2: ( ( (lv_exp_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exp_2_0= ruleExpression ) ) )* )
            // InternalC.g:1312:3: ( (lv_exp_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exp_2_0= ruleExpression ) ) )*
            {
            // InternalC.g:1312:3: ( (lv_exp_0_0= ruleExpression ) )
            // InternalC.g:1313:4: (lv_exp_0_0= ruleExpression )
            {
            // InternalC.g:1313:4: (lv_exp_0_0= ruleExpression )
            // InternalC.g:1314:5: lv_exp_0_0= ruleExpression
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

            // InternalC.g:1331:3: (otherlv_1= ',' ( (lv_exp_2_0= ruleExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==23) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalC.g:1332:4: otherlv_1= ',' ( (lv_exp_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_15); 

            	    				newLeafNode(otherlv_1, grammarAccess.getArgumentAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalC.g:1336:4: ( (lv_exp_2_0= ruleExpression ) )
            	    // InternalC.g:1337:5: (lv_exp_2_0= ruleExpression )
            	    {
            	    // InternalC.g:1337:5: (lv_exp_2_0= ruleExpression )
            	    // InternalC.g:1338:6: lv_exp_2_0= ruleExpression
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
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleAssignment"
    // InternalC.g:1360:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalC.g:1360:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalC.g:1361:2: iv_ruleAssignment= ruleAssignment EOF
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
    // InternalC.g:1367:1: ruleAssignment returns [EObject current=null] : (otherlv_0= '=' ( (lv_exp_1_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalC.g:1373:2: ( (otherlv_0= '=' ( (lv_exp_1_0= ruleExpression ) ) ) )
            // InternalC.g:1374:2: (otherlv_0= '=' ( (lv_exp_1_0= ruleExpression ) ) )
            {
            // InternalC.g:1374:2: (otherlv_0= '=' ( (lv_exp_1_0= ruleExpression ) ) )
            // InternalC.g:1375:3: otherlv_0= '=' ( (lv_exp_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_0());
            		
            // InternalC.g:1379:3: ( (lv_exp_1_0= ruleExpression ) )
            // InternalC.g:1380:4: (lv_exp_1_0= ruleExpression )
            {
            // InternalC.g:1380:4: (lv_exp_1_0= ruleExpression )
            // InternalC.g:1381:5: lv_exp_1_0= ruleExpression
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
    // InternalC.g:1402:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalC.g:1402:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalC.g:1403:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalC.g:1409:1: ruleExpression returns [EObject current=null] : ( ( (lv_args_0_0= ruleRelExp ) ) ( () ( (lv_val_2_0= RULE_LO ) ) ( (lv_args_3_0= ruleRelExp ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_val_2_0=null;
        EObject lv_args_0_0 = null;

        EObject lv_args_3_0 = null;



        	enterRule();

        try {
            // InternalC.g:1415:2: ( ( ( (lv_args_0_0= ruleRelExp ) ) ( () ( (lv_val_2_0= RULE_LO ) ) ( (lv_args_3_0= ruleRelExp ) ) )* ) )
            // InternalC.g:1416:2: ( ( (lv_args_0_0= ruleRelExp ) ) ( () ( (lv_val_2_0= RULE_LO ) ) ( (lv_args_3_0= ruleRelExp ) ) )* )
            {
            // InternalC.g:1416:2: ( ( (lv_args_0_0= ruleRelExp ) ) ( () ( (lv_val_2_0= RULE_LO ) ) ( (lv_args_3_0= ruleRelExp ) ) )* )
            // InternalC.g:1417:3: ( (lv_args_0_0= ruleRelExp ) ) ( () ( (lv_val_2_0= RULE_LO ) ) ( (lv_args_3_0= ruleRelExp ) ) )*
            {
            // InternalC.g:1417:3: ( (lv_args_0_0= ruleRelExp ) )
            // InternalC.g:1418:4: (lv_args_0_0= ruleRelExp )
            {
            // InternalC.g:1418:4: (lv_args_0_0= ruleRelExp )
            // InternalC.g:1419:5: lv_args_0_0= ruleRelExp
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

            // InternalC.g:1436:3: ( () ( (lv_val_2_0= RULE_LO ) ) ( (lv_args_3_0= ruleRelExp ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_LO) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalC.g:1437:4: () ( (lv_val_2_0= RULE_LO ) ) ( (lv_args_3_0= ruleRelExp ) )
            	    {
            	    // InternalC.g:1437:4: ()
            	    // InternalC.g:1438:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getExpressionAccess().getLogicExpArgsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalC.g:1444:4: ( (lv_val_2_0= RULE_LO ) )
            	    // InternalC.g:1445:5: (lv_val_2_0= RULE_LO )
            	    {
            	    // InternalC.g:1445:5: (lv_val_2_0= RULE_LO )
            	    // InternalC.g:1446:6: lv_val_2_0= RULE_LO
            	    {
            	    lv_val_2_0=(Token)match(input,RULE_LO,FOLLOW_15); 

            	    						newLeafNode(lv_val_2_0, grammarAccess.getExpressionAccess().getValLOTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getExpressionRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"val",
            	    							lv_val_2_0,
            	    							"com.poli.compilador.C.LO");
            	    					

            	    }


            	    }

            	    // InternalC.g:1462:4: ( (lv_args_3_0= ruleRelExp ) )
            	    // InternalC.g:1463:5: (lv_args_3_0= ruleRelExp )
            	    {
            	    // InternalC.g:1463:5: (lv_args_3_0= ruleRelExp )
            	    // InternalC.g:1464:6: lv_args_3_0= ruleRelExp
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleRelExp"
    // InternalC.g:1486:1: entryRuleRelExp returns [EObject current=null] : iv_ruleRelExp= ruleRelExp EOF ;
    public final EObject entryRuleRelExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelExp = null;


        try {
            // InternalC.g:1486:47: (iv_ruleRelExp= ruleRelExp EOF )
            // InternalC.g:1487:2: iv_ruleRelExp= ruleRelExp EOF
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
    // InternalC.g:1493:1: ruleRelExp returns [EObject current=null] : (this_ArithExp_0= ruleArithExp ( () ( (lv_val_2_0= RULE_RO ) ) ( (lv_args_3_0= ruleArithExp ) ) )? ) ;
    public final EObject ruleRelExp() throws RecognitionException {
        EObject current = null;

        Token lv_val_2_0=null;
        EObject this_ArithExp_0 = null;

        EObject lv_args_3_0 = null;



        	enterRule();

        try {
            // InternalC.g:1499:2: ( (this_ArithExp_0= ruleArithExp ( () ( (lv_val_2_0= RULE_RO ) ) ( (lv_args_3_0= ruleArithExp ) ) )? ) )
            // InternalC.g:1500:2: (this_ArithExp_0= ruleArithExp ( () ( (lv_val_2_0= RULE_RO ) ) ( (lv_args_3_0= ruleArithExp ) ) )? )
            {
            // InternalC.g:1500:2: (this_ArithExp_0= ruleArithExp ( () ( (lv_val_2_0= RULE_RO ) ) ( (lv_args_3_0= ruleArithExp ) ) )? )
            // InternalC.g:1501:3: this_ArithExp_0= ruleArithExp ( () ( (lv_val_2_0= RULE_RO ) ) ( (lv_args_3_0= ruleArithExp ) ) )?
            {

            			newCompositeNode(grammarAccess.getRelExpAccess().getArithExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_ArithExp_0=ruleArithExp();

            state._fsp--;


            			current = this_ArithExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalC.g:1509:3: ( () ( (lv_val_2_0= RULE_RO ) ) ( (lv_args_3_0= ruleArithExp ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_RO) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalC.g:1510:4: () ( (lv_val_2_0= RULE_RO ) ) ( (lv_args_3_0= ruleArithExp ) )
                    {
                    // InternalC.g:1510:4: ()
                    // InternalC.g:1511:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getRelExpAccess().getRelExpArgsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalC.g:1517:4: ( (lv_val_2_0= RULE_RO ) )
                    // InternalC.g:1518:5: (lv_val_2_0= RULE_RO )
                    {
                    // InternalC.g:1518:5: (lv_val_2_0= RULE_RO )
                    // InternalC.g:1519:6: lv_val_2_0= RULE_RO
                    {
                    lv_val_2_0=(Token)match(input,RULE_RO,FOLLOW_15); 

                    						newLeafNode(lv_val_2_0, grammarAccess.getRelExpAccess().getValROTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelExpRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"val",
                    							lv_val_2_0,
                    							"com.poli.compilador.C.RO");
                    					

                    }


                    }

                    // InternalC.g:1535:4: ( (lv_args_3_0= ruleArithExp ) )
                    // InternalC.g:1536:5: (lv_args_3_0= ruleArithExp )
                    {
                    // InternalC.g:1536:5: (lv_args_3_0= ruleArithExp )
                    // InternalC.g:1537:6: lv_args_3_0= ruleArithExp
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
    // InternalC.g:1559:1: entryRuleArithExp returns [EObject current=null] : iv_ruleArithExp= ruleArithExp EOF ;
    public final EObject entryRuleArithExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithExp = null;


        try {
            // InternalC.g:1559:49: (iv_ruleArithExp= ruleArithExp EOF )
            // InternalC.g:1560:2: iv_ruleArithExp= ruleArithExp EOF
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
    // InternalC.g:1566:1: ruleArithExp returns [EObject current=null] : (this_Term_0= ruleTerm ( () ( (lv_val_2_0= RULE_AO1 ) ) ( (lv_args_3_0= ruleTerm ) ) )* ) ;
    public final EObject ruleArithExp() throws RecognitionException {
        EObject current = null;

        Token lv_val_2_0=null;
        EObject this_Term_0 = null;

        EObject lv_args_3_0 = null;



        	enterRule();

        try {
            // InternalC.g:1572:2: ( (this_Term_0= ruleTerm ( () ( (lv_val_2_0= RULE_AO1 ) ) ( (lv_args_3_0= ruleTerm ) ) )* ) )
            // InternalC.g:1573:2: (this_Term_0= ruleTerm ( () ( (lv_val_2_0= RULE_AO1 ) ) ( (lv_args_3_0= ruleTerm ) ) )* )
            {
            // InternalC.g:1573:2: (this_Term_0= ruleTerm ( () ( (lv_val_2_0= RULE_AO1 ) ) ( (lv_args_3_0= ruleTerm ) ) )* )
            // InternalC.g:1574:3: this_Term_0= ruleTerm ( () ( (lv_val_2_0= RULE_AO1 ) ) ( (lv_args_3_0= ruleTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getArithExpAccess().getTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_Term_0=ruleTerm();

            state._fsp--;


            			current = this_Term_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalC.g:1582:3: ( () ( (lv_val_2_0= RULE_AO1 ) ) ( (lv_args_3_0= ruleTerm ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_AO1) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalC.g:1583:4: () ( (lv_val_2_0= RULE_AO1 ) ) ( (lv_args_3_0= ruleTerm ) )
            	    {
            	    // InternalC.g:1583:4: ()
            	    // InternalC.g:1584:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getArithExpAccess().getAritmExpArgsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalC.g:1590:4: ( (lv_val_2_0= RULE_AO1 ) )
            	    // InternalC.g:1591:5: (lv_val_2_0= RULE_AO1 )
            	    {
            	    // InternalC.g:1591:5: (lv_val_2_0= RULE_AO1 )
            	    // InternalC.g:1592:6: lv_val_2_0= RULE_AO1
            	    {
            	    lv_val_2_0=(Token)match(input,RULE_AO1,FOLLOW_15); 

            	    						newLeafNode(lv_val_2_0, grammarAccess.getArithExpAccess().getValAO1TerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getArithExpRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"val",
            	    							lv_val_2_0,
            	    							"com.poli.compilador.C.AO1");
            	    					

            	    }


            	    }

            	    // InternalC.g:1608:4: ( (lv_args_3_0= ruleTerm ) )
            	    // InternalC.g:1609:5: (lv_args_3_0= ruleTerm )
            	    {
            	    // InternalC.g:1609:5: (lv_args_3_0= ruleTerm )
            	    // InternalC.g:1610:6: lv_args_3_0= ruleTerm
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
    // $ANTLR end "ruleArithExp"


    // $ANTLR start "entryRuleTerm"
    // InternalC.g:1632:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalC.g:1632:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalC.g:1633:2: iv_ruleTerm= ruleTerm EOF
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
    // InternalC.g:1639:1: ruleTerm returns [EObject current=null] : (this_Factor_0= ruleFactor ( () ( (lv_val_2_0= RULE_AO2 ) ) ( (lv_args_3_0= ruleFactor ) ) )* ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token lv_val_2_0=null;
        EObject this_Factor_0 = null;

        EObject lv_args_3_0 = null;



        	enterRule();

        try {
            // InternalC.g:1645:2: ( (this_Factor_0= ruleFactor ( () ( (lv_val_2_0= RULE_AO2 ) ) ( (lv_args_3_0= ruleFactor ) ) )* ) )
            // InternalC.g:1646:2: (this_Factor_0= ruleFactor ( () ( (lv_val_2_0= RULE_AO2 ) ) ( (lv_args_3_0= ruleFactor ) ) )* )
            {
            // InternalC.g:1646:2: (this_Factor_0= ruleFactor ( () ( (lv_val_2_0= RULE_AO2 ) ) ( (lv_args_3_0= ruleFactor ) ) )* )
            // InternalC.g:1647:3: this_Factor_0= ruleFactor ( () ( (lv_val_2_0= RULE_AO2 ) ) ( (lv_args_3_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalC.g:1655:3: ( () ( (lv_val_2_0= RULE_AO2 ) ) ( (lv_args_3_0= ruleFactor ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_AO2) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalC.g:1656:4: () ( (lv_val_2_0= RULE_AO2 ) ) ( (lv_args_3_0= ruleFactor ) )
            	    {
            	    // InternalC.g:1656:4: ()
            	    // InternalC.g:1657:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getTermAccess().getTermArgsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalC.g:1663:4: ( (lv_val_2_0= RULE_AO2 ) )
            	    // InternalC.g:1664:5: (lv_val_2_0= RULE_AO2 )
            	    {
            	    // InternalC.g:1664:5: (lv_val_2_0= RULE_AO2 )
            	    // InternalC.g:1665:6: lv_val_2_0= RULE_AO2
            	    {
            	    lv_val_2_0=(Token)match(input,RULE_AO2,FOLLOW_15); 

            	    						newLeafNode(lv_val_2_0, grammarAccess.getTermAccess().getValAO2TerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTermRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"val",
            	    							lv_val_2_0,
            	    							"com.poli.compilador.C.AO2");
            	    					

            	    }


            	    }

            	    // InternalC.g:1681:4: ( (lv_args_3_0= ruleFactor ) )
            	    // InternalC.g:1682:5: (lv_args_3_0= ruleFactor )
            	    {
            	    // InternalC.g:1682:5: (lv_args_3_0= ruleFactor )
            	    // InternalC.g:1683:6: lv_args_3_0= ruleFactor
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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleFactor"
    // InternalC.g:1705:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalC.g:1705:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalC.g:1706:2: iv_ruleFactor= ruleFactor EOF
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
    // InternalC.g:1712:1: ruleFactor returns [EObject current=null] : ( ( () ( (lv_val_1_0= RULE_UO ) ) ( (lv_args_2_0= ruleAtom ) ) ) | this_Atom_3= ruleAtom ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token lv_val_1_0=null;
        EObject lv_args_2_0 = null;

        EObject this_Atom_3 = null;



        	enterRule();

        try {
            // InternalC.g:1718:2: ( ( ( () ( (lv_val_1_0= RULE_UO ) ) ( (lv_args_2_0= ruleAtom ) ) ) | this_Atom_3= ruleAtom ) )
            // InternalC.g:1719:2: ( ( () ( (lv_val_1_0= RULE_UO ) ) ( (lv_args_2_0= ruleAtom ) ) ) | this_Atom_3= ruleAtom )
            {
            // InternalC.g:1719:2: ( ( () ( (lv_val_1_0= RULE_UO ) ) ( (lv_args_2_0= ruleAtom ) ) ) | this_Atom_3= ruleAtom )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_UO) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_ID||(LA28_0>=RULE_INT && LA28_0<=RULE_FALSE)||LA28_0==19||LA28_0==38) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalC.g:1720:3: ( () ( (lv_val_1_0= RULE_UO ) ) ( (lv_args_2_0= ruleAtom ) ) )
                    {
                    // InternalC.g:1720:3: ( () ( (lv_val_1_0= RULE_UO ) ) ( (lv_args_2_0= ruleAtom ) ) )
                    // InternalC.g:1721:4: () ( (lv_val_1_0= RULE_UO ) ) ( (lv_args_2_0= ruleAtom ) )
                    {
                    // InternalC.g:1721:4: ()
                    // InternalC.g:1722:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFactorAccess().getUnaryExpAction_0_0(),
                    						current);
                    				

                    }

                    // InternalC.g:1728:4: ( (lv_val_1_0= RULE_UO ) )
                    // InternalC.g:1729:5: (lv_val_1_0= RULE_UO )
                    {
                    // InternalC.g:1729:5: (lv_val_1_0= RULE_UO )
                    // InternalC.g:1730:6: lv_val_1_0= RULE_UO
                    {
                    lv_val_1_0=(Token)match(input,RULE_UO,FOLLOW_15); 

                    						newLeafNode(lv_val_1_0, grammarAccess.getFactorAccess().getValUOTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFactorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"val",
                    							lv_val_1_0,
                    							"com.poli.compilador.C.UO");
                    					

                    }


                    }

                    // InternalC.g:1746:4: ( (lv_args_2_0= ruleAtom ) )
                    // InternalC.g:1747:5: (lv_args_2_0= ruleAtom )
                    {
                    // InternalC.g:1747:5: (lv_args_2_0= ruleAtom )
                    // InternalC.g:1748:6: lv_args_2_0= ruleAtom
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getArgsAtomParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_args_2_0=ruleAtom();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFactorRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_2_0,
                    							"com.poli.compilador.C.Atom");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalC.g:1767:3: this_Atom_3= ruleAtom
                    {

                    			newCompositeNode(grammarAccess.getFactorAccess().getAtomParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atom_3=ruleAtom();

                    state._fsp--;


                    			current = this_Atom_3;
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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleAtom"
    // InternalC.g:1779:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalC.g:1779:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalC.g:1780:2: iv_ruleAtom= ruleAtom EOF
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
    // InternalC.g:1786:1: ruleAtom returns [EObject current=null] : (this_Literal_0= ruleLiteral | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) | this_lValue_4= rulelValue ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Literal_0 = null;

        EObject this_Expression_2 = null;

        EObject this_lValue_4 = null;



        	enterRule();

        try {
            // InternalC.g:1792:2: ( (this_Literal_0= ruleLiteral | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) | this_lValue_4= rulelValue ) )
            // InternalC.g:1793:2: (this_Literal_0= ruleLiteral | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) | this_lValue_4= rulelValue )
            {
            // InternalC.g:1793:2: (this_Literal_0= ruleLiteral | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) | this_lValue_4= rulelValue )
            int alt29=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_TRUE:
            case RULE_FALSE:
                {
                alt29=1;
                }
                break;
            case 19:
                {
                alt29=2;
                }
                break;
            case RULE_ID:
            case 38:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalC.g:1794:3: this_Literal_0= ruleLiteral
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
                    // InternalC.g:1803:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    {
                    // InternalC.g:1803:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    // InternalC.g:1804:4: otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getAtomAccess().getExpressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_6);
                    this_Expression_2=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalC.g:1822:3: this_lValue_4= rulelValue
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
    // InternalC.g:1834:1: entryRulelValue returns [EObject current=null] : iv_rulelValue= rulelValue EOF ;
    public final EObject entryRulelValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelValue = null;


        try {
            // InternalC.g:1834:47: (iv_rulelValue= rulelValue EOF )
            // InternalC.g:1835:2: iv_rulelValue= rulelValue EOF
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
    // InternalC.g:1841:1: rulelValue returns [EObject current=null] : ( ( ( (lv_val_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_args_2_0= ruleArgument ) )? otherlv_3= ')' ) | ( (lv_acc_4_0= ruleAccessExp ) ) )? ) | this_PointerExp_5= rulePointerExp ) ;
    public final EObject rulelValue() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_args_2_0 = null;

        EObject lv_acc_4_0 = null;

        EObject this_PointerExp_5 = null;



        	enterRule();

        try {
            // InternalC.g:1847:2: ( ( ( ( (lv_val_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_args_2_0= ruleArgument ) )? otherlv_3= ')' ) | ( (lv_acc_4_0= ruleAccessExp ) ) )? ) | this_PointerExp_5= rulePointerExp ) )
            // InternalC.g:1848:2: ( ( ( (lv_val_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_args_2_0= ruleArgument ) )? otherlv_3= ')' ) | ( (lv_acc_4_0= ruleAccessExp ) ) )? ) | this_PointerExp_5= rulePointerExp )
            {
            // InternalC.g:1848:2: ( ( ( (lv_val_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_args_2_0= ruleArgument ) )? otherlv_3= ')' ) | ( (lv_acc_4_0= ruleAccessExp ) ) )? ) | this_PointerExp_5= rulePointerExp )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            else if ( (LA32_0==38) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalC.g:1849:3: ( ( (lv_val_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_args_2_0= ruleArgument ) )? otherlv_3= ')' ) | ( (lv_acc_4_0= ruleAccessExp ) ) )? )
                    {
                    // InternalC.g:1849:3: ( ( (lv_val_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_args_2_0= ruleArgument ) )? otherlv_3= ')' ) | ( (lv_acc_4_0= ruleAccessExp ) ) )? )
                    // InternalC.g:1850:4: ( (lv_val_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_args_2_0= ruleArgument ) )? otherlv_3= ')' ) | ( (lv_acc_4_0= ruleAccessExp ) ) )?
                    {
                    // InternalC.g:1850:4: ( (lv_val_0_0= RULE_ID ) )
                    // InternalC.g:1851:5: (lv_val_0_0= RULE_ID )
                    {
                    // InternalC.g:1851:5: (lv_val_0_0= RULE_ID )
                    // InternalC.g:1852:6: lv_val_0_0= RULE_ID
                    {
                    lv_val_0_0=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(lv_val_0_0, grammarAccess.getLValueAccess().getValIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLValueRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"val",
                    							lv_val_0_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalC.g:1868:4: ( (otherlv_1= '(' ( (lv_args_2_0= ruleArgument ) )? otherlv_3= ')' ) | ( (lv_acc_4_0= ruleAccessExp ) ) )?
                    int alt31=3;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==19) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==39||LA31_0==41) ) {
                        alt31=2;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalC.g:1869:5: (otherlv_1= '(' ( (lv_args_2_0= ruleArgument ) )? otherlv_3= ')' )
                            {
                            // InternalC.g:1869:5: (otherlv_1= '(' ( (lv_args_2_0= ruleArgument ) )? otherlv_3= ')' )
                            // InternalC.g:1870:6: otherlv_1= '(' ( (lv_args_2_0= ruleArgument ) )? otherlv_3= ')'
                            {
                            otherlv_1=(Token)match(input,19,FOLLOW_30); 

                            						newLeafNode(otherlv_1, grammarAccess.getLValueAccess().getLeftParenthesisKeyword_0_1_0_0());
                            					
                            // InternalC.g:1874:6: ( (lv_args_2_0= ruleArgument ) )?
                            int alt30=2;
                            int LA30_0 = input.LA(1);

                            if ( (LA30_0==RULE_ID||LA30_0==RULE_UO||(LA30_0>=RULE_INT && LA30_0<=RULE_FALSE)||LA30_0==19||LA30_0==38) ) {
                                alt30=1;
                            }
                            switch (alt30) {
                                case 1 :
                                    // InternalC.g:1875:7: (lv_args_2_0= ruleArgument )
                                    {
                                    // InternalC.g:1875:7: (lv_args_2_0= ruleArgument )
                                    // InternalC.g:1876:8: lv_args_2_0= ruleArgument
                                    {

                                    								newCompositeNode(grammarAccess.getLValueAccess().getArgsArgumentParserRuleCall_0_1_0_1_0());
                                    							
                                    pushFollow(FOLLOW_6);
                                    lv_args_2_0=ruleArgument();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getLValueRule());
                                    								}
                                    								add(
                                    									current,
                                    									"args",
                                    									lv_args_2_0,
                                    									"com.poli.compilador.C.Argument");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }
                                    break;

                            }

                            otherlv_3=(Token)match(input,20,FOLLOW_2); 

                            						newLeafNode(otherlv_3, grammarAccess.getLValueAccess().getRightParenthesisKeyword_0_1_0_2());
                            					

                            }


                            }
                            break;
                        case 2 :
                            // InternalC.g:1899:5: ( (lv_acc_4_0= ruleAccessExp ) )
                            {
                            // InternalC.g:1899:5: ( (lv_acc_4_0= ruleAccessExp ) )
                            // InternalC.g:1900:6: (lv_acc_4_0= ruleAccessExp )
                            {
                            // InternalC.g:1900:6: (lv_acc_4_0= ruleAccessExp )
                            // InternalC.g:1901:7: lv_acc_4_0= ruleAccessExp
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
                    // InternalC.g:1921:3: this_PointerExp_5= rulePointerExp
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
    // InternalC.g:1933:1: entryRulePointerExp returns [EObject current=null] : iv_rulePointerExp= rulePointerExp EOF ;
    public final EObject entryRulePointerExp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointerExp = null;


        try {
            // InternalC.g:1933:51: (iv_rulePointerExp= rulePointerExp EOF )
            // InternalC.g:1934:2: iv_rulePointerExp= rulePointerExp EOF
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
    // InternalC.g:1940:1: rulePointerExp returns [EObject current=null] : ( () otherlv_1= '**' (this_ID_2= RULE_ID | (otherlv_3= '(' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' ) ) ) ;
    public final EObject rulePointerExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_ID_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exp_4_0 = null;



        	enterRule();

        try {
            // InternalC.g:1946:2: ( ( () otherlv_1= '**' (this_ID_2= RULE_ID | (otherlv_3= '(' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' ) ) ) )
            // InternalC.g:1947:2: ( () otherlv_1= '**' (this_ID_2= RULE_ID | (otherlv_3= '(' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' ) ) )
            {
            // InternalC.g:1947:2: ( () otherlv_1= '**' (this_ID_2= RULE_ID | (otherlv_3= '(' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' ) ) )
            // InternalC.g:1948:3: () otherlv_1= '**' (this_ID_2= RULE_ID | (otherlv_3= '(' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            {
            // InternalC.g:1948:3: ()
            // InternalC.g:1949:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPointerExpAccess().getPointerExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getPointerExpAccess().getAsteriskAsteriskKeyword_1());
            		
            // InternalC.g:1959:3: (this_ID_2= RULE_ID | (otherlv_3= '(' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            else if ( (LA33_0==19) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalC.g:1960:4: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    				newLeafNode(this_ID_2, grammarAccess.getPointerExpAccess().getIDTerminalRuleCall_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalC.g:1965:4: (otherlv_3= '(' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' )
                    {
                    // InternalC.g:1965:4: (otherlv_3= '(' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' )
                    // InternalC.g:1966:5: otherlv_3= '(' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_15); 

                    					newLeafNode(otherlv_3, grammarAccess.getPointerExpAccess().getLeftParenthesisKeyword_2_1_0());
                    				
                    // InternalC.g:1970:5: ( (lv_exp_4_0= ruleExpression ) )
                    // InternalC.g:1971:6: (lv_exp_4_0= ruleExpression )
                    {
                    // InternalC.g:1971:6: (lv_exp_4_0= ruleExpression )
                    // InternalC.g:1972:7: lv_exp_4_0= ruleExpression
                    {

                    							newCompositeNode(grammarAccess.getPointerExpAccess().getExpExpressionParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_exp_4_0=ruleExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPointerExpRule());
                    							}
                    							add(
                    								current,
                    								"exp",
                    								lv_exp_4_0,
                    								"com.poli.compilador.C.Expression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,20,FOLLOW_2); 

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
    // InternalC.g:1999:1: entryRuleAccessExp returns [EObject current=null] : iv_ruleAccessExp= ruleAccessExp EOF ;
    public final EObject entryRuleAccessExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessExp = null;


        try {
            // InternalC.g:1999:50: (iv_ruleAccessExp= ruleAccessExp EOF )
            // InternalC.g:2000:2: iv_ruleAccessExp= ruleAccessExp EOF
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
    // InternalC.g:2006:1: ruleAccessExp returns [EObject current=null] : ( ( () otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' ) | ( () otherlv_5= '.' ( (lv_field_6_0= RULE_ID ) ) ) ) ;
    public final EObject ruleAccessExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_field_6_0=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalC.g:2012:2: ( ( ( () otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' ) | ( () otherlv_5= '.' ( (lv_field_6_0= RULE_ID ) ) ) ) )
            // InternalC.g:2013:2: ( ( () otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' ) | ( () otherlv_5= '.' ( (lv_field_6_0= RULE_ID ) ) ) )
            {
            // InternalC.g:2013:2: ( ( () otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' ) | ( () otherlv_5= '.' ( (lv_field_6_0= RULE_ID ) ) ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==39) ) {
                alt35=1;
            }
            else if ( (LA35_0==41) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalC.g:2014:3: ( () otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' )
                    {
                    // InternalC.g:2014:3: ( () otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' )
                    // InternalC.g:2015:4: () otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']'
                    {
                    // InternalC.g:2015:4: ()
                    // InternalC.g:2016:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAccessExpAccess().getArrayAccessAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,39,FOLLOW_32); 

                    				newLeafNode(otherlv_1, grammarAccess.getAccessExpAccess().getLeftSquareBracketKeyword_0_1());
                    			
                    // InternalC.g:2026:4: ( (lv_exp_2_0= ruleExpression ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_ID||LA34_0==RULE_UO||(LA34_0>=RULE_INT && LA34_0<=RULE_FALSE)||LA34_0==19||LA34_0==38) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalC.g:2027:5: (lv_exp_2_0= ruleExpression )
                            {
                            // InternalC.g:2027:5: (lv_exp_2_0= ruleExpression )
                            // InternalC.g:2028:6: lv_exp_2_0= ruleExpression
                            {

                            						newCompositeNode(grammarAccess.getAccessExpAccess().getExpExpressionParserRuleCall_0_2_0());
                            					
                            pushFollow(FOLLOW_33);
                            lv_exp_2_0=ruleExpression();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getAccessExpRule());
                            						}
                            						add(
                            							current,
                            							"exp",
                            							lv_exp_2_0,
                            							"com.poli.compilador.C.Expression");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,40,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getAccessExpAccess().getRightSquareBracketKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalC.g:2051:3: ( () otherlv_5= '.' ( (lv_field_6_0= RULE_ID ) ) )
                    {
                    // InternalC.g:2051:3: ( () otherlv_5= '.' ( (lv_field_6_0= RULE_ID ) ) )
                    // InternalC.g:2052:4: () otherlv_5= '.' ( (lv_field_6_0= RULE_ID ) )
                    {
                    // InternalC.g:2052:4: ()
                    // InternalC.g:2053:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAccessExpAccess().getFieldAccessAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,41,FOLLOW_22); 

                    				newLeafNode(otherlv_5, grammarAccess.getAccessExpAccess().getFullStopKeyword_1_1());
                    			
                    // InternalC.g:2063:4: ( (lv_field_6_0= RULE_ID ) )
                    // InternalC.g:2064:5: (lv_field_6_0= RULE_ID )
                    {
                    // InternalC.g:2064:5: (lv_field_6_0= RULE_ID )
                    // InternalC.g:2065:6: lv_field_6_0= RULE_ID
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
    // InternalC.g:2086:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // InternalC.g:2086:45: (iv_ruleCase= ruleCase EOF )
            // InternalC.g:2087:2: iv_ruleCase= ruleCase EOF
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
    // InternalC.g:2093:1: ruleCase returns [EObject current=null] : (otherlv_0= 'case' ( (lv_val_1_0= ruleAtom ) ) otherlv_2= ':' ( (lv_commands_3_0= ruleCommand ) )* ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_val_1_0 = null;

        EObject lv_commands_3_0 = null;



        	enterRule();

        try {
            // InternalC.g:2099:2: ( (otherlv_0= 'case' ( (lv_val_1_0= ruleAtom ) ) otherlv_2= ':' ( (lv_commands_3_0= ruleCommand ) )* ) )
            // InternalC.g:2100:2: (otherlv_0= 'case' ( (lv_val_1_0= ruleAtom ) ) otherlv_2= ':' ( (lv_commands_3_0= ruleCommand ) )* )
            {
            // InternalC.g:2100:2: (otherlv_0= 'case' ( (lv_val_1_0= ruleAtom ) ) otherlv_2= ':' ( (lv_commands_3_0= ruleCommand ) )* )
            // InternalC.g:2101:3: otherlv_0= 'case' ( (lv_val_1_0= ruleAtom ) ) otherlv_2= ':' ( (lv_commands_3_0= ruleCommand ) )*
            {
            otherlv_0=(Token)match(input,42,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getCaseAccess().getCaseKeyword_0());
            		
            // InternalC.g:2105:3: ( (lv_val_1_0= ruleAtom ) )
            // InternalC.g:2106:4: (lv_val_1_0= ruleAtom )
            {
            // InternalC.g:2106:4: (lv_val_1_0= ruleAtom )
            // InternalC.g:2107:5: lv_val_1_0= ruleAtom
            {

            					newCompositeNode(grammarAccess.getCaseAccess().getValAtomParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_val_1_0=ruleAtom();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCaseRule());
            					}
            					add(
            						current,
            						"val",
            						lv_val_1_0,
            						"com.poli.compilador.C.Atom");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getCaseAccess().getColonKeyword_2());
            		
            // InternalC.g:2128:3: ( (lv_commands_3_0= ruleCommand ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID||LA36_0==RULE_TYPELIT||(LA36_0>=25 && LA36_0<=26)||(LA36_0>=28 && LA36_0<=30)||(LA36_0>=33 && LA36_0<=36)||LA36_0==38) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalC.g:2129:4: (lv_commands_3_0= ruleCommand )
            	    {
            	    // InternalC.g:2129:4: (lv_commands_3_0= ruleCommand )
            	    // InternalC.g:2130:5: lv_commands_3_0= ruleCommand
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
    // InternalC.g:2151:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalC.g:2151:45: (iv_ruleType= ruleType EOF )
            // InternalC.g:2152:2: iv_ruleType= ruleType EOF
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
    // InternalC.g:2158:1: ruleType returns [EObject current=null] : ( ( (lv_tipo_0_0= RULE_TYPELIT ) ) (otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' )? ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_tipo_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalC.g:2164:2: ( ( ( (lv_tipo_0_0= RULE_TYPELIT ) ) (otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' )? ) )
            // InternalC.g:2165:2: ( ( (lv_tipo_0_0= RULE_TYPELIT ) ) (otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' )? )
            {
            // InternalC.g:2165:2: ( ( (lv_tipo_0_0= RULE_TYPELIT ) ) (otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' )? )
            // InternalC.g:2166:3: ( (lv_tipo_0_0= RULE_TYPELIT ) ) (otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' )?
            {
            // InternalC.g:2166:3: ( (lv_tipo_0_0= RULE_TYPELIT ) )
            // InternalC.g:2167:4: (lv_tipo_0_0= RULE_TYPELIT )
            {
            // InternalC.g:2167:4: (lv_tipo_0_0= RULE_TYPELIT )
            // InternalC.g:2168:5: lv_tipo_0_0= RULE_TYPELIT
            {
            lv_tipo_0_0=(Token)match(input,RULE_TYPELIT,FOLLOW_35); 

            					newLeafNode(lv_tipo_0_0, grammarAccess.getTypeAccess().getTipoTYPELITTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeRule());
            					}
            					addWithLastConsumed(
            						current,
            						"tipo",
            						lv_tipo_0_0,
            						"com.poli.compilador.C.TYPELIT");
            				

            }


            }

            // InternalC.g:2184:3: (otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==39) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalC.g:2185:4: otherlv_1= '[' ( (lv_exp_2_0= ruleExpression ) )? otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_32); 

                    				newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalC.g:2189:4: ( (lv_exp_2_0= ruleExpression ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_ID||LA37_0==RULE_UO||(LA37_0>=RULE_INT && LA37_0<=RULE_FALSE)||LA37_0==19||LA37_0==38) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalC.g:2190:5: (lv_exp_2_0= ruleExpression )
                            {
                            // InternalC.g:2190:5: (lv_exp_2_0= ruleExpression )
                            // InternalC.g:2191:6: lv_exp_2_0= ruleExpression
                            {

                            						newCompositeNode(grammarAccess.getTypeAccess().getExpExpressionParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_33);
                            lv_exp_2_0=ruleExpression();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getTypeRule());
                            						}
                            						add(
                            							current,
                            							"exp",
                            							lv_exp_2_0,
                            							"com.poli.compilador.C.Expression");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,40,FOLLOW_2); 

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
    // InternalC.g:2217:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalC.g:2217:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalC.g:2218:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalC.g:2224:1: ruleLiteral returns [EObject current=null] : ( ( () ( (lv_valor_1_0= RULE_INT ) ) ) | ( () ( (lv_val_3_0= RULE_TRUE ) ) ) | ( () ( (lv_val_5_0= RULE_FALSE ) ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_valor_1_0=null;
        Token lv_val_3_0=null;
        Token lv_val_5_0=null;


        	enterRule();

        try {
            // InternalC.g:2230:2: ( ( ( () ( (lv_valor_1_0= RULE_INT ) ) ) | ( () ( (lv_val_3_0= RULE_TRUE ) ) ) | ( () ( (lv_val_5_0= RULE_FALSE ) ) ) ) )
            // InternalC.g:2231:2: ( ( () ( (lv_valor_1_0= RULE_INT ) ) ) | ( () ( (lv_val_3_0= RULE_TRUE ) ) ) | ( () ( (lv_val_5_0= RULE_FALSE ) ) ) )
            {
            // InternalC.g:2231:2: ( ( () ( (lv_valor_1_0= RULE_INT ) ) ) | ( () ( (lv_val_3_0= RULE_TRUE ) ) ) | ( () ( (lv_val_5_0= RULE_FALSE ) ) ) )
            int alt39=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt39=1;
                }
                break;
            case RULE_TRUE:
                {
                alt39=2;
                }
                break;
            case RULE_FALSE:
                {
                alt39=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalC.g:2232:3: ( () ( (lv_valor_1_0= RULE_INT ) ) )
                    {
                    // InternalC.g:2232:3: ( () ( (lv_valor_1_0= RULE_INT ) ) )
                    // InternalC.g:2233:4: () ( (lv_valor_1_0= RULE_INT ) )
                    {
                    // InternalC.g:2233:4: ()
                    // InternalC.g:2234:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLiteralAccess().getIntLitAction_0_0(),
                    						current);
                    				

                    }

                    // InternalC.g:2240:4: ( (lv_valor_1_0= RULE_INT ) )
                    // InternalC.g:2241:5: (lv_valor_1_0= RULE_INT )
                    {
                    // InternalC.g:2241:5: (lv_valor_1_0= RULE_INT )
                    // InternalC.g:2242:6: lv_valor_1_0= RULE_INT
                    {
                    lv_valor_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_valor_1_0, grammarAccess.getLiteralAccess().getValorINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLiteralRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"valor",
                    							lv_valor_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalC.g:2260:3: ( () ( (lv_val_3_0= RULE_TRUE ) ) )
                    {
                    // InternalC.g:2260:3: ( () ( (lv_val_3_0= RULE_TRUE ) ) )
                    // InternalC.g:2261:4: () ( (lv_val_3_0= RULE_TRUE ) )
                    {
                    // InternalC.g:2261:4: ()
                    // InternalC.g:2262:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLiteralAccess().getTrueLitAction_1_0(),
                    						current);
                    				

                    }

                    // InternalC.g:2268:4: ( (lv_val_3_0= RULE_TRUE ) )
                    // InternalC.g:2269:5: (lv_val_3_0= RULE_TRUE )
                    {
                    // InternalC.g:2269:5: (lv_val_3_0= RULE_TRUE )
                    // InternalC.g:2270:6: lv_val_3_0= RULE_TRUE
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
                    // InternalC.g:2288:3: ( () ( (lv_val_5_0= RULE_FALSE ) ) )
                    {
                    // InternalC.g:2288:3: ( () ( (lv_val_5_0= RULE_FALSE ) ) )
                    // InternalC.g:2289:4: () ( (lv_val_5_0= RULE_FALSE ) )
                    {
                    // InternalC.g:2289:4: ()
                    // InternalC.g:2290:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLiteralAccess().getFalseLitAction_2_0(),
                    						current);
                    				

                    }

                    // InternalC.g:2296:4: ( (lv_val_5_0= RULE_FALSE ) )
                    // InternalC.g:2297:5: (lv_val_5_0= RULE_FALSE )
                    {
                    // InternalC.g:2297:5: (lv_val_5_0= RULE_FALSE )
                    // InternalC.g:2298:6: lv_val_5_0= RULE_FALSE
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002000402L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000002001880000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100400L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000005E76400410L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000002001800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000004000083A10L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000040080400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004001083A10L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000028000080002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000183A10L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000014000083A10L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000005E76000412L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000002L});

}