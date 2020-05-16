package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface SeriesCoefficientRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 0, 42 };

  final public static IAST RULES = List(
    IInit(SeriesCoefficient, SIZES),
    // SeriesCoefficient(Cos(x_),{x_Symbol,0,n_?NotListQ}):=Piecewise({{((1+(-1)^n)*I^n)/(2*n!),n>=0}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Cos(x_),List(x_Symbol,C0,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(Times(Plus(C1,Power(CN1,n)),Power(CI,n),Power(Times(C2,Factorial(n)),CN1)),GreaterEqual(n,C0))),C0),FreeQ(n,x))),
    // SeriesCoefficient(Cos(x_),{x_Symbol,Pi/2,n_?NotListQ}):=Piecewise({{((-1)*I*(-1+(-1)^n)*I^n)/(2*n!),n>=0}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Cos(x_),List(x_Symbol,CPiHalf,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(Times(CN1,CI,Plus(CN1,Power(CN1,n)),Power(CI,n),Power(Times(C2,Factorial(n)),CN1)),GreaterEqual(n,C0))),C0),FreeQ(n,x))),
    // SeriesCoefficient(Sin(x_),{x_Symbol,0,n_?NotListQ}):=Piecewise({{(I*(-1+(-1)^n)*I^n)/(2*n!),n>=0}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Sin(x_),List(x_Symbol,C0,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(Times(CI,Plus(CN1,Power(CN1,n)),Power(CI,n),Power(Times(C2,Factorial(n)),CN1)),GreaterEqual(n,C0))),C0),FreeQ(n,x))),
    // SeriesCoefficient(Sin(x_),{x_Symbol,Pi/2,n_?NotListQ}):=Piecewise({{((1+(-1)^n)*I^n)/(2*n!),n>=0}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Sin(x_),List(x_Symbol,CPiHalf,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(Times(Plus(C1,Power(CN1,n)),Power(CI,n),Power(Times(C2,Factorial(n)),CN1)),GreaterEqual(n,C0))),C0),FreeQ(n,x))),
    // SeriesCoefficient(Tan(x_),{x_Symbol,0,n_?NotListQ}):=Piecewise({{((-1+(-1)^n)*I^(1+n)*2^n*(-1+2^(1+n))*BernoulliB(1+n))/(1+n)!,n>=1}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Tan(x_),List(x_Symbol,C0,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(Times(Plus(CN1,Power(CN1,n)),Power(CI,Plus(C1,n)),Power(C2,n),Plus(CN1,Power(C2,Plus(C1,n))),BernoulliB(Plus(C1,n)),Power(Factorial(Plus(C1,n)),CN1)),GreaterEqual(n,C1))),C0),FreeQ(n,x))),
    // SeriesCoefficient(Tan(x_),{x_Symbol,Pi/2,n_?NotListQ}):=Piecewise({{-1,n==-1},{((-1+(-1)^n)*I^(1+n)*2^n*BernoulliB(1+n))/(1+n)!,n>=0}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Tan(x_),List(x_Symbol,CPiHalf,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(CN1,Equal(n,CN1)),List(Times(Plus(CN1,Power(CN1,n)),Power(CI,Plus(C1,n)),Power(C2,n),BernoulliB(Plus(C1,n)),Power(Factorial(Plus(C1,n)),CN1)),GreaterEqual(n,C0))),C0),FreeQ(n,x))),
    // SeriesCoefficient(Cot(x_),{x_Symbol,0,n_?NotListQ}):=Piecewise({{1,n==-1},{((-1)*I*(-1+(-1)^n)*(2*I)^n*BernoulliB(1+n))/(1+n)!,n>=0}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Cot(x_),List(x_Symbol,C0,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(C1,Equal(n,CN1)),List(Times(CN1,CI,Plus(CN1,Power(CN1,n)),Power(Times(C2,CI),n),BernoulliB(Plus(C1,n)),Power(Factorial(Plus(C1,n)),CN1)),GreaterEqual(n,C0))),C0),FreeQ(n,x))),
    // SeriesCoefficient(Cot(x_),{x_Symbol,Pi/2,n_?NotListQ}):=Piecewise({{((-1)*I*(-1+(-1)^n)*(-1+2^(1+n))*(2*I)^n*BernoulliB(1+n))/(1+n)!,n>=1}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Cot(x_),List(x_Symbol,CPiHalf,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(Times(CN1,CI,Plus(CN1,Power(CN1,n)),Plus(CN1,Power(C2,Plus(C1,n))),Power(Times(C2,CI),n),BernoulliB(Plus(C1,n)),Power(Factorial(Plus(C1,n)),CN1)),GreaterEqual(n,C1))),C0),FreeQ(n,x))),
    // SeriesCoefficient(Cosh(x_),{x_Symbol,0,n_?NotListQ}):=Piecewise({{1/n!,Mod(n,2)==0&&n>=0}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Cosh(x_),List(x_Symbol,C0,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(Power(Factorial(n),CN1),And(Equal(Mod(n,C2),C0),GreaterEqual(n,C0)))),C0),FreeQ(n,x))),
    // SeriesCoefficient(Coth(x_),{x_Symbol,0,n_?NotListQ}):=Piecewise({{1,n==-1},{(2^(1+n)*BernoulliB(1+n))/(1+n)!,n>=0&&Mod(n,2)==1}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Coth(x_),List(x_Symbol,C0,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(C1,Equal(n,CN1)),List(Times(Power(C2,Plus(C1,n)),BernoulliB(Plus(C1,n)),Power(Factorial(Plus(C1,n)),CN1)),And(GreaterEqual(n,C0),Equal(Mod(n,C2),C1)))),C0),FreeQ(n,x))),
    // SeriesCoefficient(Sinh(x_),{x_Symbol,0,n_?NotListQ}):=Piecewise({{1/n!,Mod(n,2)==1&&n>=0}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Sinh(x_),List(x_Symbol,C0,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(Power(Factorial(n),CN1),And(Equal(Mod(n,C2),C1),GreaterEqual(n,C0)))),C0),FreeQ(n,x))),
    // SeriesCoefficient(Tanh(x_),{x_Symbol,0,n_?NotListQ}):=Piecewise({{((-1+2^(1+n))*2^(1+n)*BernoulliB(1+n))/(1+n)!,Mod(n,2)==1&&n>=1}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Tanh(x_),List(x_Symbol,C0,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(Times(Plus(CN1,Power(C2,Plus(C1,n))),Power(C2,Plus(C1,n)),BernoulliB(Plus(C1,n)),Power(Factorial(Plus(C1,n)),CN1)),And(Equal(Mod(n,C2),C1),GreaterEqual(n,C1)))),C0),FreeQ(n,x))),
    // SeriesCoefficient(ArcCos(x_),{x_Symbol,0,n_?NotListQ}):=Piecewise({{Pi/2,n==0},{-Pochhammer(1/2,1/2*(-1+n))/(n*(1/2*(-1+n))!),n>0&&Mod(n,2)==1}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(ArcCos(x_),List(x_Symbol,C0,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(CPiHalf,Equal(n,C0)),List(Times(CN1,Power(Times(n,Factorial(Times(C1D2,Plus(CN1,n)))),CN1),Pochhammer(C1D2,Times(C1D2,Plus(CN1,n)))),And(Greater(n,C0),Equal(Mod(n,C2),C1)))),C0),FreeQ(n,x))),
    // SeriesCoefficient(ArcCot(x_),{x_Symbol,0,n_?NotListQ}):=Piecewise({{I^(1+n)/n,n>0&&Mod(n,2)==1},{Pi/2,n==0}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(ArcCot(x_),List(x_Symbol,C0,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(Times(Power(CI,Plus(C1,n)),Power(n,CN1)),And(Greater(n,C0),Equal(Mod(n,C2),C1))),List(CPiHalf,Equal(n,C0))),C0),FreeQ(n,x))),
    // SeriesCoefficient(ArcSin(x_),{x_Symbol,0,n_?NotListQ}):=Piecewise({{Pochhammer(1/2,1/2*(-1+n))/(n*(1/2*(-1+n))!),Mod(n,2)==1&&n>=0}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(ArcSin(x_),List(x_Symbol,C0,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(Times(Power(Times(n,Factorial(Times(C1D2,Plus(CN1,n)))),CN1),Pochhammer(C1D2,Times(C1D2,Plus(CN1,n)))),And(Equal(Mod(n,C2),C1),GreaterEqual(n,C0)))),C0),FreeQ(n,x))),
    // SeriesCoefficient(ArcTan(x_),{x_Symbol,0,n_?NotListQ}):=Piecewise({{1/(I^(1-n)*n),Mod(n,2)==1&&n>=0}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(ArcTan(x_),List(x_Symbol,C0,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(Times(Power(CI,Plus(CN1,n)),Power(n,CN1)),And(Equal(Mod(n,C2),C1),GreaterEqual(n,C0)))),C0),FreeQ(n,x))),
    // SeriesCoefficient(ArcCosh(x_),{x_Symbol,0,n_?NotListQ}):=Piecewise({{1/2*I*Pi,n==0},{((-1)*I*Pochhammer(1/2,1/2*(-1+n)))/(n*(1/2*(-1+n))!),n>=1&&Mod(n,2)==1}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(ArcCosh(x_),List(x_Symbol,C0,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(Times(C1D2,CI,Pi),Equal(n,C0)),List(Times(CN1,CI,Power(Times(n,Factorial(Times(C1D2,Plus(CN1,n)))),CN1),Pochhammer(C1D2,Times(C1D2,Plus(CN1,n)))),And(GreaterEqual(n,C1),Equal(Mod(n,C2),C1)))),C0),FreeQ(n,x))),
    // SeriesCoefficient(ArcSinh(x_),{x_Symbol,0,n_?NotListQ}):=Piecewise({{Pochhammer(1/2,1/2*(-1+n))/(I^(1-n)*n*(1/2*(-1+n))!),Mod(n,2)==1&&n>=0}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(ArcSinh(x_),List(x_Symbol,C0,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(Times(Power(CI,Plus(CN1,n)),Power(Times(n,Factorial(Times(C1D2,Plus(CN1,n)))),CN1),Pochhammer(C1D2,Times(C1D2,Plus(CN1,n)))),And(Equal(Mod(n,C2),C1),GreaterEqual(n,C0)))),C0),FreeQ(n,x))),
    // SeriesCoefficient(ArcTanh(x_),{x_Symbol,0,n_?NotListQ}):=Piecewise({{1/n,Mod(n,2)==1&&n>=0}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(ArcTanh(x_),List(x_Symbol,C0,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(Power(n,CN1),And(Equal(Mod(n,C2),C1),GreaterEqual(n,C0)))),C0),FreeQ(n,x))),
    // SeriesCoefficient(Csc(x_),{x_Symbol,0,n_?NotListQ}):=Piecewise({{1,n==-1},{((-1)*I*2*I^n*(-1+2^n)*BernoulliB(1+n))/(1+n)!,n>=0&&Mod(n,2)==1}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Csc(x_),List(x_Symbol,C0,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(C1,Equal(n,CN1)),List(Times(CN1,CI,C2,Power(CI,n),Plus(CN1,Power(C2,n)),BernoulliB(Plus(C1,n)),Power(Factorial(Plus(C1,n)),CN1)),And(GreaterEqual(n,C0),Equal(Mod(n,C2),C1)))),C0),FreeQ(n,x))),
    // SeriesCoefficient(Sec(x_),{x_Symbol,0,n_?NotListQ}):=Piecewise({{(I^n*EulerE(n))/n!,Mod(n,2)==0&&n>=0}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Sec(x_),List(x_Symbol,C0,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(Times(Power(CI,n),EulerE(n),Power(Factorial(n),CN1)),And(Equal(Mod(n,C2),C0),GreaterEqual(n,C0)))),C0),FreeQ(n,x))),
    // SeriesCoefficient(Csch(x_),{x_Symbol,0,n_?NotListQ}):=Piecewise({{1,n==-1},{((-1)*2*(-1+2^n)*BernoulliB(1+n))/(1+n)!,n>=0&&Mod(n,2)==1}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Csch(x_),List(x_Symbol,C0,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(C1,Equal(n,CN1)),List(Times(CN1,C2,Plus(CN1,Power(C2,n)),BernoulliB(Plus(C1,n)),Power(Factorial(Plus(C1,n)),CN1)),And(GreaterEqual(n,C0),Equal(Mod(n,C2),C1)))),C0),FreeQ(n,x))),
    // SeriesCoefficient(Sech(x_),{x_Symbol,0,n_?NotListQ}):=Piecewise({{EulerE(n)/n!,n>=0}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Sech(x_),List(x_Symbol,C0,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(Times(EulerE(n),Power(Factorial(n),CN1)),GreaterEqual(n,C0))),C0),FreeQ(n,x))),
    // SeriesCoefficient(Cos(x_),{x_Symbol,a_,n_?NotListQ}):=Piecewise({{Cos(a+1/2*n*Pi)/n!,n>=0}},0)/;FreeQ(a,x)&&FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Cos(x_),List(x_Symbol,a_,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(Times(Cos(Plus(a,Times(C1D2,n,Pi))),Power(Factorial(n),CN1)),GreaterEqual(n,C0))),C0),And(FreeQ(a,x),FreeQ(n,x)))),
    // SeriesCoefficient(Sin(x_),{x_Symbol,a_,n_?NotListQ}):=Piecewise({{Sin(a+1/2*n*Pi)/n!,n>=0}},0)/;FreeQ(a,x)&&FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Sin(x_),List(x_Symbol,a_,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(Times(Power(Factorial(n),CN1),Sin(Plus(a,Times(C1D2,n,Pi)))),GreaterEqual(n,C0))),C0),And(FreeQ(a,x),FreeQ(n,x)))),
    // SeriesCoefficient(Cosh(x_),{x_Symbol,a_,n_?NotListQ}):=Piecewise({{Cosh(a)/n!,Mod(n,2)==0&&n>=0},{Sinh(a)/n!,Mod(n,2)==1&&n>=0}},0)/;FreeQ(a,x)&&FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Cosh(x_),List(x_Symbol,a_,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(Times(Cosh(a),Power(Factorial(n),CN1)),And(Equal(Mod(n,C2),C0),GreaterEqual(n,C0))),List(Times(Power(Factorial(n),CN1),Sinh(a)),And(Equal(Mod(n,C2),C1),GreaterEqual(n,C0)))),C0),And(FreeQ(a,x),FreeQ(n,x)))),
    // SeriesCoefficient(Sinh(x_),{x_Symbol,a_,n_?NotListQ}):=Piecewise({{Cosh(a)/n!,Mod(n,2)==1&&n>=0},{Sinh(a)/n!,Mod(n,2)==0&&n>=0}},0)/;FreeQ(a,x)&&FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Sinh(x_),List(x_Symbol,a_,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(Times(Cosh(a),Power(Factorial(n),CN1)),And(Equal(Mod(n,C2),C1),GreaterEqual(n,C0))),List(Times(Power(Factorial(n),CN1),Sinh(a)),And(Equal(Mod(n,C2),C0),GreaterEqual(n,C0)))),C0),And(FreeQ(a,x),FreeQ(n,x)))),
    // SeriesCoefficient(ArcCot(x_),{x_Symbol,a_,n_?NotListQ}):=Piecewise({{(I*((-I-a)^(-n)-1/(I-a)^n))/(2*n),n>0},{1/2*I*(Log((-I+a)/a)-Log((I+a)/a)),n==0}},0)/;FreeQ(a,x)&&FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(ArcCot(x_),List(x_Symbol,a_,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(Times(CI,Subtract(Power(Subtract(CNI,a),Negate(n)),Power(Subtract(CI,a),Negate(n))),Power(Times(C2,n),CN1)),Greater(n,C0)),List(Times(C1D2,CI,Subtract(Log(Times(Power(a,CN1),Plus(CNI,a))),Log(Times(Power(a,CN1),Plus(CI,a))))),Equal(n,C0))),C0),And(FreeQ(a,x),FreeQ(n,x)))),
    // SeriesCoefficient(ArcTan(x_),{x_Symbol,a_,n_?NotListQ}):=Piecewise({{((-1)*I*((-I-a)^(-n)-1/(I-a)^n))/(2*n),n>0},{1/2*I*(Log(1-I*a)-Log(1+I*a)),n==0}},0)/;FreeQ(a,x)&&FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(ArcTan(x_),List(x_Symbol,a_,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(Times(CN1,CI,Subtract(Power(Subtract(CNI,a),Negate(n)),Power(Subtract(CI,a),Negate(n))),Power(Times(C2,n),CN1)),Greater(n,C0)),List(Times(C1D2,CI,Subtract(Log(Plus(C1,Times(CNI,a))),Log(Plus(C1,Times(CI,a))))),Equal(n,C0))),C0),And(FreeQ(a,x),FreeQ(n,x)))),
    // SeriesCoefficient(ArcCoth(x_),{x_Symbol,a_,n_?NotListQ}):=Piecewise({{(-1/(-1-a)^n+(1-a)^(-n))/(2*n),n>0},{1/2*(Log(1+1/a)-Log((-1+a)/a)),n==0}},0)/;FreeQ(a,x)&&FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(ArcCoth(x_),List(x_Symbol,a_,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(Times(Plus(Negate(Power(Subtract(CN1,a),Negate(n))),Power(Subtract(C1,a),Negate(n))),Power(Times(C2,n),CN1)),Greater(n,C0)),List(Times(C1D2,Subtract(Log(Plus(C1,Power(a,CN1))),Log(Times(Power(a,CN1),Plus(CN1,a))))),Equal(n,C0))),C0),And(FreeQ(a,x),FreeQ(n,x)))),
    // SeriesCoefficient(ArcTanh(x_),{x_Symbol,a_,n_?NotListQ}):=Piecewise({{((-1)^n*((-1+a)^(-n)-1/(1+a)^n))/(2*n),n>=1},{1/2*(-Log(1-a)+Log(1+a)),n==0}},0)/;FreeQ(a,x)&&FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(ArcTanh(x_),List(x_Symbol,a_,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(Times(Power(CN1,n),Subtract(Power(Plus(CN1,a),Negate(n)),Power(Plus(C1,a),Negate(n))),Power(Times(C2,n),CN1)),GreaterEqual(n,C1)),List(Times(C1D2,Plus(Negate(Log(Subtract(C1,a))),Log(Plus(C1,a)))),Equal(n,C0))),C0),And(FreeQ(a,x),FreeQ(n,x)))),
    // SeriesCoefficient(ArcCos(x_),{x_Symbol,a_,1}):=-1/Sqrt(1-a^2)/;FreeQ(a,x)
    ISetDelayed(SeriesCoefficient(ArcCos(x_),List(x_Symbol,a_,C1)),
      Condition(Negate(Power(Subtract(C1,Sqr(a)),CN1D2)),FreeQ(a,x))),
    // SeriesCoefficient(ArcCot(x_),{x_Symbol,a_,1}):=-1/(1+a^2)/;FreeQ(a,x)
    ISetDelayed(SeriesCoefficient(ArcCot(x_),List(x_Symbol,a_,C1)),
      Condition(Negate(Power(Plus(C1,Sqr(a)),CN1)),FreeQ(a,x))),
    // SeriesCoefficient(ArcSin(x_),{x_Symbol,a_,1}):=1/Sqrt(1-a^2)/;FreeQ(a,x)
    ISetDelayed(SeriesCoefficient(ArcSin(x_),List(x_Symbol,a_,C1)),
      Condition(Power(Subtract(C1,Sqr(a)),CN1D2),FreeQ(a,x))),
    // SeriesCoefficient(ArcTan(x_),{x_Symbol,a_,1}):=1/(1+a^2)/;FreeQ(a,x)
    ISetDelayed(SeriesCoefficient(ArcTan(x_),List(x_Symbol,a_,C1)),
      Condition(Power(Plus(C1,Sqr(a)),CN1),FreeQ(a,x))),
    // SeriesCoefficient(ArcCsc(x_),{x_Symbol,a_,1}):=-1/(Sqrt(1-1/a^2)*a^2)/;FreeQ(a,x)
    ISetDelayed(SeriesCoefficient(ArcCsc(x_),List(x_Symbol,a_,C1)),
      Condition(Negate(Power(Times(Sqrt(Subtract(C1,Power(a,CN2))),Sqr(a)),CN1)),FreeQ(a,x))),
    // SeriesCoefficient(ArcSec(x_),{x_Symbol,a_,1}):=1/(Sqrt(1-1/a^2)*a^2)/;FreeQ(a,x)
    ISetDelayed(SeriesCoefficient(ArcSec(x_),List(x_Symbol,a_,C1)),
      Condition(Power(Times(Sqrt(Subtract(C1,Power(a,CN2))),Sqr(a)),CN1),FreeQ(a,x))),
    // SeriesCoefficient(Log(x_),{x_Symbol,a_,n_?NotListQ}):=Piecewise({{(-1)^(1+n)/(a^n*n),n>=1},{Log(a),n==0}},0)/;FreeQ(a,x)&&a=!=0&&FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Log(x_),List(x_Symbol,a_,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(Times(Power(CN1,Plus(C1,n)),Power(Times(Power(a,n),n),CN1)),GreaterEqual(n,C1)),List(Log(a),Equal(n,C0))),C0),And(FreeQ(a,x),UnsameQ(a,C0),FreeQ(n,x)))),
    // SeriesCoefficient(ProductLog(x_),{x_Symbol,0,n_?NotListQ}):=Piecewise({{1/((-n)^(1-n)*n!),n>=1}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(ProductLog(x_),List(x_Symbol,C0,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(Times(Power(Negate(n),Plus(CN1,n)),Power(Factorial(n),CN1)),GreaterEqual(n,C1))),C0),FreeQ(n,x))),
    // SeriesCoefficient(PolyLog(k_,x_),{x_Symbol,0,n_?NotListQ}):=Piecewise({{n^(-k),n>=1}},0)/;FreeQ(k,x)&&FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(PolyLog(k_,x_),List(x_Symbol,C0,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(Power(n,Negate(k)),GreaterEqual(n,C1))),C0),And(FreeQ(k,x),FreeQ(n,x)))),
    // SeriesCoefficient(ChebyshevT(k_,x_),{x_Symbol,0,n_?NotListQ}):=Piecewise({{((-1/2)^n*Sqrt(Pi)*Gamma(1/2+n)*Pochhammer(-k,n)*Pochhammer(k,n))/(n!*Gamma(1/2*(1-k+n))*Gamma(1/2*(1+k+n))*Pochhammer(1/2,n)),n>=0}},0)/;FreeQ(k,x)&&FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(ChebyshevT(k_,x_),List(x_Symbol,C0,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(Times(Power(CN1D2,n),Sqrt(Pi),Gamma(Plus(C1D2,n)),Power(Times(Factorial(n),Gamma(Times(C1D2,Plus(C1,Negate(k),n))),Gamma(Times(C1D2,Plus(C1,k,n))),Pochhammer(C1D2,n)),CN1),Pochhammer(Negate(k),n),Pochhammer(k,n)),GreaterEqual(n,C0))),C0),And(FreeQ(k,x),FreeQ(n,x)))),
    // SeriesCoefficient(ChebyshevU(k_,x_),{x_Symbol,0,n_?NotListQ}):=Piecewise({{((-1/2)^n*Sqrt(Pi)*Gamma(3/2+n)*Pochhammer(-k,n)*Pochhammer(2+k,n))/(n!*Gamma(1/2*(1-k+n))*Gamma(1/2*(3+k+n))*Pochhammer(3/2,n)),n>=0}},0)/;FreeQ(k,x)&&FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(ChebyshevU(k_,x_),List(x_Symbol,C0,PatternTest(n_,NotListQ))),
      Condition(Piecewise(List(List(Times(Power(CN1D2,n),Sqrt(Pi),Gamma(Plus(QQ(3L,2L),n)),Power(Times(Factorial(n),Gamma(Times(C1D2,Plus(C1,Negate(k),n))),Gamma(Times(C1D2,Plus(C3,k,n))),Pochhammer(QQ(3L,2L),n)),CN1),Pochhammer(Negate(k),n),Pochhammer(Plus(C2,k),n)),GreaterEqual(n,C0))),C0),And(FreeQ(k,x),FreeQ(n,x))))
  );
}
