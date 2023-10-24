package chap09_inherit.calc;

public abstract class Div extends Calculator {
	
	public Div() {
		
	}
	
	public Div(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculator() {
		return a / b;
	}
}
