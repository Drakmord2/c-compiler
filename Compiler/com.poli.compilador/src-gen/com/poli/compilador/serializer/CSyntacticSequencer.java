/*
 * generated by Xtext 2.12.0
 */
package com.poli.compilador.serializer;

import com.google.inject.Inject;
import com.poli.compilador.services.CGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class CSyntacticSequencer extends AbstractSyntacticSequencer {

	protected CGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Command___DefaultKeyword_3_7_0_ColonKeyword_3_7_1__q;
	protected AbstractElementAlias match_Declaration_AsteriskAsteriskKeyword_1_0_1_q;
	protected AbstractElementAlias match_Type___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_2__q;
	protected AbstractElementAlias match_lValue___LeftParenthesisKeyword_0_1_0_0_RightParenthesisKeyword_0_1_0_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CGrammarAccess) access;
		match_Command___DefaultKeyword_3_7_0_ColonKeyword_3_7_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getCommandAccess().getDefaultKeyword_3_7_0()), new TokenAlias(false, false, grammarAccess.getCommandAccess().getColonKeyword_3_7_1()));
		match_Declaration_AsteriskAsteriskKeyword_1_0_1_q = new TokenAlias(false, true, grammarAccess.getDeclarationAccess().getAsteriskAsteriskKeyword_1_0_1());
		match_Type___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_1_2()));
		match_lValue___LeftParenthesisKeyword_0_1_0_0_RightParenthesisKeyword_0_1_0_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getLValueAccess().getLeftParenthesisKeyword_0_1_0_0()), new TokenAlias(false, false, grammarAccess.getLValueAccess().getRightParenthesisKeyword_0_1_0_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ID  		: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Command___DefaultKeyword_3_7_0_ColonKeyword_3_7_1__q.equals(syntax))
				emit_Command___DefaultKeyword_3_7_0_ColonKeyword_3_7_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Declaration_AsteriskAsteriskKeyword_1_0_1_q.equals(syntax))
				emit_Declaration_AsteriskAsteriskKeyword_1_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Type___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_2__q.equals(syntax))
				emit_Type___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_lValue___LeftParenthesisKeyword_0_1_0_0_RightParenthesisKeyword_0_1_0_2__q.equals(syntax))
				emit_lValue___LeftParenthesisKeyword_0_1_0_0_RightParenthesisKeyword_0_1_0_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('default' ':')?
	 *
	 * This ambiguous syntax occurs at:
	 *     cases+=Case (ambiguity) '}' (rule end)
	 *     exp=Expression ')' '{' (ambiguity) '}' (rule end)
	 */
	protected void emit_Command___DefaultKeyword_3_7_0_ColonKeyword_3_7_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '**'?
	 *
	 * This ambiguous syntax occurs at:
	 *     tipo=Type (ambiguity) name=ID
	 */
	protected void emit_Declaration_AsteriskAsteriskKeyword_1_0_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('[' ']')?
	 *
	 * This ambiguous syntax occurs at:
	 *     tipo=TYPELIT (ambiguity) (rule end)
	 */
	protected void emit_Type___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     valor=[Definition|ID] (ambiguity) (rule end)
	 */
	protected void emit_lValue___LeftParenthesisKeyword_0_1_0_0_RightParenthesisKeyword_0_1_0_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
