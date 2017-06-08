package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://bitbucket.org/axelclk/symja_android_library">bitbucket.org/axelclk/symja_android_library under the tools directory</a>.</p>
 */
public interface RootRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 0, 2 };

  final public static IAST RULES = List(
    IInit(Root, SIZES),
    // Root(a_.+b_*#1&,1):=-a/b
    ISetDelayed(Root(Function(Plus(a_DEFAULT,Times(b_,Slot1))),C1),
      Times(CN1,a,Power(b,-1))),
    // Root(a_.+b_.*#1+c_.*#1^2&,k_):=-b/(2*c)+Rational(1,2)*(-1)^k*Sqrt((b^2-4*c*a)/c^2)/;k==1||k==2
    ISetDelayed(Root(Function(Plus(a_DEFAULT,Times(c_DEFAULT,Sqr(Slot1)),Times(b_DEFAULT,Slot1))),k_),
      Condition(Plus(Times(CN1,b,Power(Times(C2,c),-1)),Times(C1D2,Power(CN1,k),Sqrt(Times(Plus(Sqr(b),Times(CN1,C4,c,a)),Power(c,-2))))),Or(Equal(k,C1),Equal(k,C2))))
  );
}