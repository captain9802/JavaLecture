package chap09_inherit.calc;

public abstract class Mul extends Calculator {
	
	public Mul() {
		
	}
	
	public Mul(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculator() {
		return a * b;
	}

}
