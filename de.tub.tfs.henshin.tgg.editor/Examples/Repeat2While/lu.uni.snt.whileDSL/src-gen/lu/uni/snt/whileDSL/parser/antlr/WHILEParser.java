/*
* generated by Xtext
*/
package lu.uni.snt.whileDSL.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import lu.uni.snt.whileDSL.services.WHILEGrammarAccess;

public class WHILEParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private WHILEGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected lu.uni.snt.whileDSL.parser.antlr.internal.InternalWHILEParser createParser(XtextTokenStream stream) {
		return new lu.uni.snt.whileDSL.parser.antlr.internal.InternalWHILEParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "WProgram";
	}
	
	public WHILEGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(WHILEGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
