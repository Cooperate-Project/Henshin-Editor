package agg.attribute.parser.javaExpr;

/* Generated By:JavaCC: Do not edit this line. Token.java Version 0.6 */
/**
 * Describes the input token stream.
 * 
 * @version $Id: Token.java,v 1.2 2007/09/10 13:05:49 olga Exp $
 * @author $Author: olga $
 */
public class Token {

	static final long serialVersionUID = 1L;

	/**
	 * An integer that describes the kind of this token. This numbering system
	 * is determined by JavaCCParser, and a table of these numbers is stored in
	 * the file ...Constants.java.
	 */
	public int kind;

	/**
	 * beginLine and beginColumn describe the position of the first character of
	 * this token; endLine and endColumn describe the position of the last
	 * character of this token.
	 */
	public int beginLine, beginColumn, endLine, endColumn;

	/**
	 * The string image of the token.
	 */
	public String image;

	/**
	 * A reference to the next regular (non-special) token from the input
	 * stream. If this is the last token from the input stream, or if the token
	 * manager has not read tokens beyond this one, this field is set to null.
	 * This is true only if this token is also a regular token. Otherwise, see
	 * below for a description of the contents of this field.
	 */
	public Token next;

	/**
	 * This field is used to access special tokens that occur prior to this
	 * token, but after the immediately preceding regular (non-special) token.
	 * If there are no such special tokens, this field is set to null. When
	 * there are more than one such special token, this field refers to the last
	 * of these special tokens, which in turn refers to the next previous
	 * special token through its specialToken field, and so on until the first
	 * special token (whose specialToken field is null). The next fields of
	 * special tokens refer to other special tokens that immediately follow it
	 * (without an intervening regular token). If there is no such token, this
	 * field is null.
	 */
	public Token specialToken;

}
/*
 * $Log: Token.java,v $
 * Revision 1.2  2007/09/10 13:05:49  olga
 * In this update:
 * - package xerces2.5.0 is not used anymore;
 * - class com.objectspace.jgl.Pair is replaced by the agg own generic class agg.util.Pair;
 * - bugs fixed in:  usage of PACs in rules;  match completion;
 * 	usage of static method calls in attr. conditions
 * - graph editing: added some new features
 * Revision 1.1 2005/08/25 11:56:51 enrico *** empty log
 * message ***
 * 
 * Revision 1.1 2005/05/30 12:58:01 olga Version with Eclipse
 * 
 * Revision 1.2 2003/03/05 18:24:15 komm sorted/optimized import statements
 * 
 * Revision 1.1.1.1 2002/07/11 12:17:04 olga Imported sources
 * 
 * Revision 1.8 2000/04/05 12:11:14 shultzke serialVersionUID aus V1.0.0
 * generiert
 * 
 * Revision 1.7 2000/03/14 11:00:01 shultzke Transformieren von Variablen auf
 * Variablen sollte jetzt funktionieren Ueber das Design der Copy-Methode des
 * abstrakten Syntaxbaumes sollte unbedingt diskutiert werden.
 * 
 */
