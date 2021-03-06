/*
 * generated by Xtext 2.12.0
 */
package com.poli.compilador.ide.contentassist.antlr;

import com.google.inject.Inject;
import com.poli.compilador.ide.contentassist.antlr.internal.InternalCParser;
import com.poli.compilador.services.CGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class CParser extends AbstractContentAssistParser {

	@Inject
	private CGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalCParser createParser() {
		InternalCParser result = new InternalCParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDefinitionAccess().getAlternatives(), "rule__Definition__Alternatives");
					put(grammarAccess.getDeclarationAccess().getAlternatives_1(), "rule__Declaration__Alternatives_1");
					put(grammarAccess.getCommandAccess().getAlternatives(), "rule__Command__Alternatives");
					put(grammarAccess.getFactorAccess().getAlternatives(), "rule__Factor__Alternatives");
					put(grammarAccess.getAtomAccess().getAlternatives(), "rule__Atom__Alternatives");
					put(grammarAccess.getLValueAccess().getAlternatives(), "rule__LValue__Alternatives");
					put(grammarAccess.getLValueAccess().getAlternatives_0_2(), "rule__LValue__Alternatives_0_2");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
					put(grammarAccess.getDeclarationAccess().getGroup(), "rule__Declaration__Group__0");
					put(grammarAccess.getDeclarationAccess().getGroup_1_0(), "rule__Declaration__Group_1_0__0");
					put(grammarAccess.getDeclarationAccess().getGroup_1_0_1(), "rule__Declaration__Group_1_0_1__0");
					put(grammarAccess.getDeclarationAccess().getGroup_1_1(), "rule__Declaration__Group_1_1__0");
					put(grammarAccess.getDeclarationAccess().getGroup_1_1_1(), "rule__Declaration__Group_1_1_1__0");
					put(grammarAccess.getStructAccess().getGroup(), "rule__Struct__Group__0");
					put(grammarAccess.getCommandAccess().getGroup_0(), "rule__Command__Group_0__0");
					put(grammarAccess.getCommandAccess().getGroup_0_8(), "rule__Command__Group_0_8__0");
					put(grammarAccess.getCommandAccess().getGroup_1(), "rule__Command__Group_1__0");
					put(grammarAccess.getCommandAccess().getGroup_2(), "rule__Command__Group_2__0");
					put(grammarAccess.getCommandAccess().getGroup_3(), "rule__Command__Group_3__0");
					put(grammarAccess.getCommandAccess().getGroup_3_7(), "rule__Command__Group_3_7__0");
					put(grammarAccess.getCommandAccess().getGroup_4(), "rule__Command__Group_4__0");
					put(grammarAccess.getCommandAccess().getGroup_5(), "rule__Command__Group_5__0");
					put(grammarAccess.getCommandAccess().getGroup_6(), "rule__Command__Group_6__0");
					put(grammarAccess.getCommandAccess().getGroup_7(), "rule__Command__Group_7__0");
					put(grammarAccess.getCommandAccess().getGroup_8(), "rule__Command__Group_8__0");
					put(grammarAccess.getCommandAccess().getGroup_9(), "rule__Command__Group_9__0");
					put(grammarAccess.getCommandAccess().getGroup_10(), "rule__Command__Group_10__0");
					put(grammarAccess.getArgumentAccess().getGroup(), "rule__Argument__Group__0");
					put(grammarAccess.getArgumentAccess().getGroup_1(), "rule__Argument__Group_1__0");
					put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
					put(grammarAccess.getRelExpAccess().getGroup(), "rule__RelExp__Group__0");
					put(grammarAccess.getRelExpAccess().getGroup_1(), "rule__RelExp__Group_1__0");
					put(grammarAccess.getArithExpAccess().getGroup(), "rule__ArithExp__Group__0");
					put(grammarAccess.getArithExpAccess().getGroup_1(), "rule__ArithExp__Group_1__0");
					put(grammarAccess.getTermAccess().getGroup(), "rule__Term__Group__0");
					put(grammarAccess.getTermAccess().getGroup_1(), "rule__Term__Group_1__0");
					put(grammarAccess.getFactorAccess().getGroup_0(), "rule__Factor__Group_0__0");
					put(grammarAccess.getFactorAccess().getGroup_0_1(), "rule__Factor__Group_0_1__0");
					put(grammarAccess.getFactorAccess().getGroup_1(), "rule__Factor__Group_1__0");
					put(grammarAccess.getAtomAccess().getGroup_1(), "rule__Atom__Group_1__0");
					put(grammarAccess.getLValueAccess().getGroup_0(), "rule__LValue__Group_0__0");
					put(grammarAccess.getLValueAccess().getGroup_0_2_0(), "rule__LValue__Group_0_2_0__0");
					put(grammarAccess.getLValueAccess().getGroup_0_2_1(), "rule__LValue__Group_0_2_1__0");
					put(grammarAccess.getLValueAccess().getGroup_0_2_2(), "rule__LValue__Group_0_2_2__0");
					put(grammarAccess.getPointerExpAccess().getGroup(), "rule__PointerExp__Group__0");
					put(grammarAccess.getCaseAccess().getGroup(), "rule__Case__Group__0");
					put(grammarAccess.getTypeAccess().getGroup(), "rule__Type__Group__0");
					put(grammarAccess.getTypeAccess().getGroup_1(), "rule__Type__Group_1__0");
					put(grammarAccess.getLiteralAccess().getGroup_0(), "rule__Literal__Group_0__0");
					put(grammarAccess.getLiteralAccess().getGroup_1(), "rule__Literal__Group_1__0");
					put(grammarAccess.getLiteralAccess().getGroup_2(), "rule__Literal__Group_2__0");
					put(grammarAccess.getLiteralAccess().getGroup_3(), "rule__Literal__Group_3__0");
					put(grammarAccess.getProgramAccess().getDefinitionAssignment(), "rule__Program__DefinitionAssignment");
					put(grammarAccess.getFunctionAccess().getTipoAssignment_2(), "rule__Function__TipoAssignment_2");
					put(grammarAccess.getFunctionAccess().getNameAssignment_3(), "rule__Function__NameAssignment_3");
					put(grammarAccess.getFunctionAccess().getParamsAssignment_5(), "rule__Function__ParamsAssignment_5");
					put(grammarAccess.getFunctionAccess().getCommandsAssignment_8(), "rule__Function__CommandsAssignment_8");
					put(grammarAccess.getDeclarationAccess().getTipoAssignment_1_0_1_0(), "rule__Declaration__TipoAssignment_1_0_1_0");
					put(grammarAccess.getDeclarationAccess().getNameAssignment_1_0_1_2(), "rule__Declaration__NameAssignment_1_0_1_2");
					put(grammarAccess.getDeclarationAccess().getValAssignment_1_0_1_3(), "rule__Declaration__ValAssignment_1_0_1_3");
					put(grammarAccess.getDeclarationAccess().getStrAssignment_1_1_1_1(), "rule__Declaration__StrAssignment_1_1_1_1");
					put(grammarAccess.getDeclarationAccess().getNameAssignment_1_1_1_2(), "rule__Declaration__NameAssignment_1_1_1_2");
					put(grammarAccess.getStructAccess().getNameAssignment_2(), "rule__Struct__NameAssignment_2");
					put(grammarAccess.getStructAccess().getDeclAssignment_4(), "rule__Struct__DeclAssignment_4");
					put(grammarAccess.getCommandAccess().getExpAssignment_0_3(), "rule__Command__ExpAssignment_0_3");
					put(grammarAccess.getCommandAccess().getTrueCommandsAssignment_0_6(), "rule__Command__TrueCommandsAssignment_0_6");
					put(grammarAccess.getCommandAccess().getFalseCommandsAssignment_0_8_2(), "rule__Command__FalseCommandsAssignment_0_8_2");
					put(grammarAccess.getCommandAccess().getExpAssignment_1_3(), "rule__Command__ExpAssignment_1_3");
					put(grammarAccess.getCommandAccess().getCommandsAssignment_1_6(), "rule__Command__CommandsAssignment_1_6");
					put(grammarAccess.getCommandAccess().getInitAssignment_2_3(), "rule__Command__InitAssignment_2_3");
					put(grammarAccess.getCommandAccess().getInitAsgAssignment_2_4(), "rule__Command__InitAsgAssignment_2_4");
					put(grammarAccess.getCommandAccess().getExpAssignment_2_6(), "rule__Command__ExpAssignment_2_6");
					put(grammarAccess.getCommandAccess().getIncAssignment_2_8(), "rule__Command__IncAssignment_2_8");
					put(grammarAccess.getCommandAccess().getIncAsgAssignment_2_9(), "rule__Command__IncAsgAssignment_2_9");
					put(grammarAccess.getCommandAccess().getCommandsAssignment_2_12(), "rule__Command__CommandsAssignment_2_12");
					put(grammarAccess.getCommandAccess().getExpAssignment_3_3(), "rule__Command__ExpAssignment_3_3");
					put(grammarAccess.getCommandAccess().getCasesAssignment_3_6(), "rule__Command__CasesAssignment_3_6");
					put(grammarAccess.getCommandAccess().getDefaultCmdsAssignment_3_7_2(), "rule__Command__DefaultCmdsAssignment_3_7_2");
					put(grammarAccess.getCommandAccess().getCommandsAssignment_4_3(), "rule__Command__CommandsAssignment_4_3");
					put(grammarAccess.getCommandAccess().getExpAssignment_4_7(), "rule__Command__ExpAssignment_4_7");
					put(grammarAccess.getCommandAccess().getLvalAssignment_5_1(), "rule__Command__LvalAssignment_5_1");
					put(grammarAccess.getCommandAccess().getAsgAssignment_5_2(), "rule__Command__AsgAssignment_5_2");
					put(grammarAccess.getCommandAccess().getExpAssignment_8_2(), "rule__Command__ExpAssignment_8_2");
					put(grammarAccess.getCommandAccess().getValAssignment_9_1(), "rule__Command__ValAssignment_9_1");
					put(grammarAccess.getCommandAccess().getExpAssignment_10_3(), "rule__Command__ExpAssignment_10_3");
					put(grammarAccess.getArgumentAccess().getExpAssignment_0(), "rule__Argument__ExpAssignment_0");
					put(grammarAccess.getArgumentAccess().getExpAssignment_1_1(), "rule__Argument__ExpAssignment_1_1");
					put(grammarAccess.getAssignmentAccess().getExpAssignment_1(), "rule__Assignment__ExpAssignment_1");
					put(grammarAccess.getExpressionAccess().getOpAssignment_1_1(), "rule__Expression__OpAssignment_1_1");
					put(grammarAccess.getExpressionAccess().getArgsAssignment_1_2(), "rule__Expression__ArgsAssignment_1_2");
					put(grammarAccess.getRelExpAccess().getOpAssignment_1_1(), "rule__RelExp__OpAssignment_1_1");
					put(grammarAccess.getRelExpAccess().getArgsAssignment_1_2(), "rule__RelExp__ArgsAssignment_1_2");
					put(grammarAccess.getArithExpAccess().getOpAssignment_1_1(), "rule__ArithExp__OpAssignment_1_1");
					put(grammarAccess.getArithExpAccess().getArgsAssignment_1_2(), "rule__ArithExp__ArgsAssignment_1_2");
					put(grammarAccess.getTermAccess().getOpAssignment_1_1(), "rule__Term__OpAssignment_1_1");
					put(grammarAccess.getTermAccess().getArgsAssignment_1_2(), "rule__Term__ArgsAssignment_1_2");
					put(grammarAccess.getFactorAccess().getUoAssignment_0_1_1(), "rule__Factor__UoAssignment_0_1_1");
					put(grammarAccess.getFactorAccess().getUoAssignment_1_1(), "rule__Factor__UoAssignment_1_1");
					put(grammarAccess.getFactorAccess().getArgAssignment_1_2(), "rule__Factor__ArgAssignment_1_2");
					put(grammarAccess.getAtomAccess().getExpAssignment_1_2(), "rule__Atom__ExpAssignment_1_2");
					put(grammarAccess.getLValueAccess().getValorAssignment_0_1(), "rule__LValue__ValorAssignment_0_1");
					put(grammarAccess.getLValueAccess().getArgAssignment_0_2_0_2(), "rule__LValue__ArgAssignment_0_2_0_2");
					put(grammarAccess.getLValueAccess().getFieldAssignment_0_2_1_2(), "rule__LValue__FieldAssignment_0_2_1_2");
					put(grammarAccess.getLValueAccess().getIndexAssignment_0_2_2_2(), "rule__LValue__IndexAssignment_0_2_2_2");
					put(grammarAccess.getPointerExpAccess().getExpAssignment_3(), "rule__PointerExp__ExpAssignment_3");
					put(grammarAccess.getCaseAccess().getValAssignment_1(), "rule__Case__ValAssignment_1");
					put(grammarAccess.getCaseAccess().getCommandsAssignment_3(), "rule__Case__CommandsAssignment_3");
					put(grammarAccess.getTypeAccess().getTipoAssignment_0(), "rule__Type__TipoAssignment_0");
					put(grammarAccess.getTypeAccess().getExpAssignment_1_1(), "rule__Type__ExpAssignment_1_1");
					put(grammarAccess.getLiteralAccess().getValAssignment_0_1(), "rule__Literal__ValAssignment_0_1");
					put(grammarAccess.getLiteralAccess().getValAssignment_1_1(), "rule__Literal__ValAssignment_1_1");
					put(grammarAccess.getLiteralAccess().getValAssignment_2_1(), "rule__Literal__ValAssignment_2_1");
					put(grammarAccess.getLiteralAccess().getValAssignment_3_1(), "rule__Literal__ValAssignment_3_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public CGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
