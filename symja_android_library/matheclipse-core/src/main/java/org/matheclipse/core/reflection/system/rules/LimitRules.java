package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://bitbucket.org/axelclk/symja_android_library">bitbucket.org/axelclk/symja_android_library under the tools directory</a>.</p>
 */
public interface LimitRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 4, 7 };

  final public static IAST RULES = List(
    IInit(Limit, SIZES),
    // Limit(x_^m_NumberQ,x_Symbol->Infinity):=Infinity/;Positive(m)
    ISetDelayed(Limit(Power(x_,$p(m,NumberQ)),Rule(x_Symbol,oo)),
      Condition(oo,Positive(m))),
    // Limit(x_^m_NumberQ,x_Symbol->Infinity):=0/;Negative(m)
    ISetDelayed(Limit(Power(x_,$p(m,NumberQ)),Rule(x_Symbol,oo)),
      Condition(C0,Negative(m))),
    // Limit(m_NumberQ^x_,x_Symbol->Infinity):=If(m>1,Infinity,If(m==1,1,0))/;Positive(m)
    ISetDelayed(Limit(Power($p(m,NumberQ),x_),Rule(x_Symbol,oo)),
      Condition(If(Greater(m,C1),oo,If(Equal(m,C1),C1,C0)),Positive(m))),
    // Limit(m_NumberQ^(-x_),x_Symbol->Infinity):=0/;m>1
    ISetDelayed(Limit(Power($p(m,NumberQ),Negate(x_)),Rule(x_Symbol,oo)),
      Condition(C0,Greater(m,C1))),
    // Limit(E^x_,x_Symbol->Infinity):=Infinity
    ISetDelayed(Limit(Power(E,x_),Rule(x_Symbol,oo)),
      oo),
    // Limit(E^x_,x_Symbol->-Infinity):=0
    ISetDelayed(Limit(Power(E,x_),Rule(x_Symbol,Negate(oo))),
      C0),
    // Limit(Log(x_),x_Symbol->0)=-Infinity
    ISet(Limit(Log(x_),Rule(x_Symbol,C0)),
      Noo),
    // Limit(Log(x_),x_Symbol->Infinity)=Infinity
    ISet(Limit(Log(x_),Rule(x_Symbol,oo)),
      oo),
    // Limit((1+1/x_)^x_,x_Symbol->Infinity)=E
    ISet(Limit(Power(Plus(C1,Power(x_,-1)),x_),Rule(x_Symbol,oo)),
      E),
    // Limit((1+a_/x_)^x_,x_Symbol->Infinity)=E^a/;FreeQ(a,x)
    ISet(Limit(Power(Plus(C1,Times(a_,Power(x_,-1))),x_),Rule(x_Symbol,oo)),
      Power(E,a)),
    // Limit(HarmonicNumber(y_Symbol,s_IntegerQ),x_Symbol->Infinity):=Module({v=s/2},((2*Pi)^(2*v)*(-1)^(v+1)*BernoulliB(2*v))/(2*(2*v)!))/;EvenQ(s)&&Positive(s)
    ISetDelayed(Limit(HarmonicNumber(y_Symbol,$p(s,IntegerQ)),Rule(x_Symbol,oo)),
      Condition(Module(List(Set(v,Times(C1D2,s))),Times(Power(Times(C2,Pi),Times(C2,v)),Power(CN1,Plus(v,C1)),BernoulliB(Times(C2,v)),Power(Times(C2,Factorial(Times(C2,v))),-1))),And(EvenQ(s),Positive(s))))
  );
}
