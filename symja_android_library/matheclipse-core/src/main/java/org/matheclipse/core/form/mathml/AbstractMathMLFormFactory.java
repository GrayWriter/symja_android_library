package org.matheclipse.core.form.mathml;

import java.text.NumberFormat;
import java.util.Map;

import org.matheclipse.core.interfaces.IComplex;
import org.matheclipse.core.interfaces.IComplexNum;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.IInteger;
import org.matheclipse.core.interfaces.INum;
import org.matheclipse.core.interfaces.IRational;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.parser.trie.Tries;

/**
 * Abstract Factory for generating MathML output
 *
 */
abstract public class AbstractMathMLFormFactory {

	public final static boolean USE_IDENTIFIERS = false;

	public final static Map<String, String> ENTITY_TABLE = Tries.forStrings();

	protected NumberFormat fNumberFormat = null;

	private final String fTagPrefix;

	/**
	 * Constructor for the EMML object
	 */
	public AbstractMathMLFormFactory() {
		this("", null);
	}

	public AbstractMathMLFormFactory(final String tagPrefix, NumberFormat numberFormat) {
		// fExprFactory = exprFactory;
		fTagPrefix = tagPrefix;
		fNumberFormat = numberFormat;
	}

	protected String convertDoubleToFormattedString(double dValue) {
		return fNumberFormat == null ? Double.toString(dValue) : fNumberFormat.format(dValue);
	}

	public void entity(final StringBuilder buf, final String tag) {
		if (USE_IDENTIFIERS) {
			buf.append(tag);
		} else {
			final Object entityValue = ENTITY_TABLE.get(tag);
			if (entityValue != null) {
				buf.append(entityValue.toString());
			} else {
				buf.append(tag);
			}
		}
	}

	public void tag(final StringBuilder buf, final String tag, final String data) {
		tagStart(buf, tag);
		entity(buf, data);
		tagEnd(buf, tag);
	}

	public void tagStart(final StringBuilder buf, final String tag) {
		buf.append("<" + fTagPrefix + tag + ">");
	}

	public void tagStart(final StringBuilder buf, final String tag, final String attr0) {
		buf.append("<" + fTagPrefix + tag + " " + attr0 + ">");
	}

	public void tagEnd(final StringBuilder buf, final String tag) {
		buf.append("</" + fTagPrefix + tag + ">");
	}

	public void tagStartEnd(final StringBuilder buf, final String tag) {
		buf.append("<" + fTagPrefix + tag + " />");
	}

	/**
	 * Returns the reflection package name which is used in #getReflectionNamespace()
	 *
	 * @return
	 */
	// abstract public String getReflectionNamespace();

	/**
	 * Determine the converter of the heads symbol string
	 *
	 * @param headString
	 * @return
	 */
	// abstract public IConverter reflection(String headString);

	/**
	 * convert a double nummber
	 *
	 * @param buf
	 * @param d
	 * @param precedence
	 * @param caller
	 */
	abstract public void convertDouble(StringBuilder buf, INum d, int precedence, boolean caller);

	/**
	 * Convert a complex number with double real and imaginary part
	 *
	 * @param buf
	 * @param dc
	 * @param precedence
	 * @param caller
	 */
	abstract public void convertDoubleComplex(StringBuilder buf, IComplexNum dc, int precedence, boolean caller);

	/**
	 * Convert an IInteger number
	 *
	 * @param buf
	 * @param i
	 * @param precedence
	 * @param caller
	 */
	abstract public void convertInteger(StringBuilder buf, IInteger i, int precedence, boolean caller);

	/**
	 * Convert a fraction nummber
	 *
	 * @param buf
	 * @param f
	 * @param precedence
	 * @param caller
	 */
	abstract public void convertFraction(StringBuilder buf, IRational f, int precedence, boolean caller);

	/**
	 * Convert a complex nummber
	 *
	 * @param buf
	 * @param c
	 * @param precedence
	 * @param caller
	 */
	abstract public void convertComplex(StringBuilder buf, IComplex c, int precedence, boolean caller);

	/**
	 * Convert a string
	 *
	 * @param buf
	 * @param str
	 */
	abstract public void convertString(StringBuilder buf, String str);

	/**
	 * Convert a symbol (i.e. functionname, constantname or variablename)
	 *
	 * @param buf
	 * @param sym
	 */
	abstract public void convertSymbol(StringBuilder buf, ISymbol sym);

	/**
	 * Convert the head of a function
	 *
	 * @param buf
	 * @param obj
	 */
	abstract public void convertHead(StringBuilder buf, IExpr obj);

	abstract public boolean convert(StringBuilder buf, IExpr o, int precedence, boolean isASTHead);

	abstract void convertInternal(StringBuilder buf, IExpr o, int precedence, boolean isASTHead);
}
