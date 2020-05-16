package org.matheclipse.core.system;

import org.matheclipse.core.eval.ConsoleTestCase;
import org.matheclipse.core.form.mathml.MathMLPresentationTestCase;
import org.matheclipse.core.form.tex.BasicTeXTestCase;
import org.matheclipse.core.form.tex.TeXConverterTestCase;
import org.matheclipse.core.system.archunit.ArchUnitTests;
import org.matheclipse.core.test.eval.EvalDoubleCallbackTestCase; 

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * General test suite. Starts all other tests.
 */
public class CompleteTestSuite extends TestCase {

	public CompleteTestSuite(String name) {
		super(name);
	}

	/**
	 * A unit test suite
	 * 
	 * @return The test suite
	 */
	public static Test suite() {
		TestSuite suite = new TestSuite();

		suite.addTestSuite(NumberTheoryTestCase.class);
		suite.addTestSuite(ASCIIPrintTest.class);
		suite.addTestSuite(SVGGraphicsTestCase.class);
		suite.addTestSuite(Graphics3DTestCase.class);
		suite.addTestSuite(SymjifyTestCase.class);

		suite.addTestSuite(BasicPatternPropertiesTestCase.class);
		suite.addTestSuite(CompareToTestCase.class);
		suite.addTestSuite(Java8TestCase.class);
		suite.addTestSuite(PatternMatchingTestCase.class);
		suite.addTestSuite(CombinatoricTestCase.class);

		suite.addTestSuite(MathMLPresentationTestCase.class);
		suite.addTestSuite(BasicTeXTestCase.class);
		suite.addTestSuite(TeXConverterTestCase.class);

		suite.addTestSuite(LastCalculationsHistoryTest.class);
		suite.addTestSuite(ExpandTestCase.class);

		suite.addTestSuite(OpenFixedSizeMapTest.class);
		suite.addTestSuite(NumberTest.class);
		suite.addTestSuite(JavaFormTestCase.class);

		suite.addTestSuite(MainTestCase.class);
		suite.addTestSuite(LowercaseTestCase.class);
		suite.addTestSuite(RubiIntegrationTest.class);
		suite.addTestSuite(DistributionTest.class);
		suite.addTestSuite(SeriesTest.class);
		suite.addTestSuite(SerializableTest.class);
		suite.addTestSuite(PatternsTest.class);

		suite.addTestSuite(EvalDoubleCallbackTestCase.class);
		suite.addTestSuite(ExprEvaluatorTest.class);

		suite.addTestSuite(ConsoleTestCase.class);
		suite.addTestSuite(AssumptionTestCase.class);
		suite.addTestSuite(WXFTestCase.class);
		suite.addTestSuite(IntegerTestCase.class);
		// suite.addTestSuite(ArchUnitTests.class);

		return suite;

	}

	/**
	 * Run all tests in a swing GUI
	 * 
	 * @param args
	 *            Description of Parameter
	 */
	// public static void main(String args[]) {
	// junit.swingui.TestRunner.run(CompleteTestSuite.class);
	// }
}
