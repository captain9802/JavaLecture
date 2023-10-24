package chap09_inherit;

import chap09_inherit.calc.Add;
import chap09_inherit.calc.Calculator;
import chap09_inherit.calc.Div;
import chap09_inherit.calc.Mul;
import chap09_inherit.calc.Sub;

public class _03_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add add = new Add(20, 10);
		
		int result = add.calculator();
		System.out.println(result);
		
		Sub sub = new Sub(20, 10);
		result = sub.calculator();
		System.out.println(result);
		
		Mul mul = new Mul(20, 10);
		result = mul.calculator();
		System.out.println(result);

		Div div = new Div(20, 10);
		result = div.calculator();
		System.out.println(result);
		
		// 부모 타입의 변수에 자식 객체를 담아서 오버라이딩된 메소드를 사용하면
		// 자식 크래스에 정의된 메소드가 실행된다.
		Calculator calc = new Add(20, 10);
		result = calc.calculator();
		System.out.println(result);
		
		calc = new Div(20, 10);
		result = calc.calculator();
		System.out.println(result);
		
		calc = new Sub(20, 10);
		result = calc.calculator();
		System.out.println(result);
		
		calc = new Mul(20, 10);
		result = calc.calculator();
		System.out.println(result);

		Div div2 = new Div(20, 10);
//		div2 = new Calculator(20, 10);
	}

}
