/*
* generated by Xtext
*/
package de.tub.tfs.henshin.tgg.interpreter.config.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class TggInterpreterConfigGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class TggInterpreterConfigElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TggInterpreterConfig");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cNLTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cAdditionalOptionsKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cOptionsAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cOptionsProcessingEntryParserRuleCall_1_2_0 = (RuleCall)cOptionsAssignment_1_2.eContents().get(0);
		private final RuleCall cNLTerminalRuleCall_1_3 = (RuleCall)cGroup_1.eContents().get(3);
		
		//TggInterpreterConfig:
		//	NL? ("AdditionalOptions" "=" options+=ProcessingEntry+ NL)*;
		public ParserRule getRule() { return rule; }

		//NL? ("AdditionalOptions" "=" options+=ProcessingEntry+ NL)*
		public Group getGroup() { return cGroup; }

		//NL?
		public RuleCall getNLTerminalRuleCall_0() { return cNLTerminalRuleCall_0; }

		//("AdditionalOptions" "=" options+=ProcessingEntry+ NL)*
		public Group getGroup_1() { return cGroup_1; }

		//"AdditionalOptions"
		public Keyword getAdditionalOptionsKeyword_1_0() { return cAdditionalOptionsKeyword_1_0; }

		//"="
		public Keyword getEqualsSignKeyword_1_1() { return cEqualsSignKeyword_1_1; }

		//options+=ProcessingEntry+
		public Assignment getOptionsAssignment_1_2() { return cOptionsAssignment_1_2; }

		//ProcessingEntry
		public RuleCall getOptionsProcessingEntryParserRuleCall_1_2_0() { return cOptionsProcessingEntryParserRuleCall_1_2_0; }

		//NL
		public RuleCall getNLTerminalRuleCall_1_3() { return cNLTerminalRuleCall_1_3; }
	}

	public class ProcessingEntryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ProcessingEntry");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cNLTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cKeyAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cKeyKeyValueParserRuleCall_1_0 = (RuleCall)cKeyAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final RuleCall cNLTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final Assignment cValueAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cValueScriptOrValueParserRuleCall_5_0 = (RuleCall)cValueAssignment_5.eContents().get(0);
		private final RuleCall cNLTerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final Keyword cCommaKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//ProcessingEntry returns ProcessingMapEntry:
		//	NL? key=keyValue "=" ">" NL? value=ScriptOrValue NL? ","?;
		public ParserRule getRule() { return rule; }

		//NL? key=keyValue "=" ">" NL? value=ScriptOrValue NL? ","?
		public Group getGroup() { return cGroup; }

		//NL?
		public RuleCall getNLTerminalRuleCall_0() { return cNLTerminalRuleCall_0; }

		//key=keyValue
		public Assignment getKeyAssignment_1() { return cKeyAssignment_1; }

		//keyValue
		public RuleCall getKeyKeyValueParserRuleCall_1_0() { return cKeyKeyValueParserRuleCall_1_0; }

		//"="
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }

		//">"
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }

		//NL?
		public RuleCall getNLTerminalRuleCall_4() { return cNLTerminalRuleCall_4; }

		//value=ScriptOrValue
		public Assignment getValueAssignment_5() { return cValueAssignment_5; }

		//ScriptOrValue
		public RuleCall getValueScriptOrValueParserRuleCall_5_0() { return cValueScriptOrValueParserRuleCall_5_0; }

		//NL?
		public RuleCall getNLTerminalRuleCall_6() { return cNLTerminalRuleCall_6; }

		//","?
		public Keyword getCommaKeyword_7() { return cCommaKeyword_7; }
	}

	public class ScriptOrValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ScriptOrValue");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cJSSCRIPTTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cValueParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//ScriptOrValue returns ecore::EString:
		//	JSSCRIPT | value;
		public ParserRule getRule() { return rule; }

		//JSSCRIPT | value
		public Alternatives getAlternatives() { return cAlternatives; }

		//JSSCRIPT
		public RuleCall getJSSCRIPTTerminalRuleCall_0() { return cJSSCRIPTTerminalRuleCall_0; }

		//value
		public RuleCall getValueParserRuleCall_1() { return cValueParserRuleCall_1; }
	}

	public class KeyValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "keyValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_1_0 = (RuleCall)cAlternatives_1.eContents().get(0);
		private final RuleCall cWSTerminalRuleCall_1_1 = (RuleCall)cAlternatives_1.eContents().get(1);
		
		//keyValue returns ecore::EString:
		//	ID (ID | WS)*;
		public ParserRule getRule() { return rule; }

		//ID (ID | WS)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//(ID | WS)*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_0() { return cIDTerminalRuleCall_1_0; }

		//WS
		public RuleCall getWSTerminalRuleCall_1_1() { return cWSTerminalRuleCall_1_1; }
	}

	public class ValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "value");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_0_0 = (RuleCall)cAlternatives_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_0_1 = (Keyword)cAlternatives_0.eContents().get(1);
		private final Keyword cGreaterThanSignKeyword_0_2 = (Keyword)cAlternatives_0.eContents().get(2);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_1_0 = (RuleCall)cAlternatives_1.eContents().get(0);
		private final RuleCall cWSTerminalRuleCall_1_1 = (RuleCall)cAlternatives_1.eContents().get(1);
		private final Keyword cEqualsSignKeyword_1_2 = (Keyword)cAlternatives_1.eContents().get(2);
		private final Keyword cGreaterThanSignKeyword_1_3 = (Keyword)cAlternatives_1.eContents().get(3);
		
		//value returns ecore::EString:
		//	(ID | "=" | ">") (ID | WS | "=" | ">")*;
		public ParserRule getRule() { return rule; }

		//(ID | "=" | ">") (ID | WS | "=" | ">")*
		public Group getGroup() { return cGroup; }

		//ID | "=" | ">"
		public Alternatives getAlternatives_0() { return cAlternatives_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_0_0() { return cIDTerminalRuleCall_0_0; }

		//"="
		public Keyword getEqualsSignKeyword_0_1() { return cEqualsSignKeyword_0_1; }

		//">"
		public Keyword getGreaterThanSignKeyword_0_2() { return cGreaterThanSignKeyword_0_2; }

		//(ID | WS | "=" | ">")*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_0() { return cIDTerminalRuleCall_1_0; }

		//WS
		public RuleCall getWSTerminalRuleCall_1_1() { return cWSTerminalRuleCall_1_1; }

		//"="
		public Keyword getEqualsSignKeyword_1_2() { return cEqualsSignKeyword_1_2; }

		//">"
		public Keyword getGreaterThanSignKeyword_1_3() { return cGreaterThanSignKeyword_1_3; }
	}
	
	
	private TggInterpreterConfigElements pTggInterpreterConfig;
	private ProcessingEntryElements pProcessingEntry;
	private ScriptOrValueElements pScriptOrValue;
	private KeyValueElements pKeyValue;
	private ValueElements pValue;
	private TerminalRule tJSSCRIPT;
	private TerminalRule tID;
	private TerminalRule tNL;
	private TerminalRule tWS;
	private TerminalRule tANY_OTHER;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public TggInterpreterConfigGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("de.tub.tfs.henshin.tgg.interpreter.config.TggInterpreterConfig".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//TggInterpreterConfig:
	//	NL? ("AdditionalOptions" "=" options+=ProcessingEntry+ NL)*;
	public TggInterpreterConfigElements getTggInterpreterConfigAccess() {
		return (pTggInterpreterConfig != null) ? pTggInterpreterConfig : (pTggInterpreterConfig = new TggInterpreterConfigElements());
	}
	
	public ParserRule getTggInterpreterConfigRule() {
		return getTggInterpreterConfigAccess().getRule();
	}

	//ProcessingEntry returns ProcessingMapEntry:
	//	NL? key=keyValue "=" ">" NL? value=ScriptOrValue NL? ","?;
	public ProcessingEntryElements getProcessingEntryAccess() {
		return (pProcessingEntry != null) ? pProcessingEntry : (pProcessingEntry = new ProcessingEntryElements());
	}
	
	public ParserRule getProcessingEntryRule() {
		return getProcessingEntryAccess().getRule();
	}

	//ScriptOrValue returns ecore::EString:
	//	JSSCRIPT | value;
	public ScriptOrValueElements getScriptOrValueAccess() {
		return (pScriptOrValue != null) ? pScriptOrValue : (pScriptOrValue = new ScriptOrValueElements());
	}
	
	public ParserRule getScriptOrValueRule() {
		return getScriptOrValueAccess().getRule();
	}

	//keyValue returns ecore::EString:
	//	ID (ID | WS)*;
	public KeyValueElements getKeyValueAccess() {
		return (pKeyValue != null) ? pKeyValue : (pKeyValue = new KeyValueElements());
	}
	
	public ParserRule getKeyValueRule() {
		return getKeyValueAccess().getRule();
	}

	//value returns ecore::EString:
	//	(ID | "=" | ">") (ID | WS | "=" | ">")*;
	public ValueElements getValueAccess() {
		return (pValue != null) ? pValue : (pValue = new ValueElements());
	}
	
	public ParserRule getValueRule() {
		return getValueAccess().getRule();
	}

	//terminal JSSCRIPT:
	//	"{*"->"*}";
	public TerminalRule getJSSCRIPTRule() {
		return (tJSSCRIPT != null) ? tJSSCRIPT : (tJSSCRIPT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "JSSCRIPT"));
	} 

	//terminal ID:
	//	!("\r" | "\n" | " " | "\t" | "=" | ">") !("\r" | "\n" | " " | "\t" | "=")*;
	public TerminalRule getIDRule() {
		return (tID != null) ? tID : (tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ID"));
	} 

	//terminal NL:
	//	("\r" | "\n")+;
	public TerminalRule getNLRule() {
		return (tNL != null) ? tNL : (tNL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "NL"));
	} 

	//terminal WS:
	//	(" " | "\t")+;
	public TerminalRule getWSRule() {
		return (tWS != null) ? tWS : (tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "WS"));
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return (tANY_OTHER != null) ? tANY_OTHER : (tANY_OTHER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ANY_OTHER"));
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 
}
