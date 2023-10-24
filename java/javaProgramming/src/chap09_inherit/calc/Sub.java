package chap09_inherit.calc;

public abstract class Sub extends Calculator {
	
	public Sub() {
		
	}
	
	public Sub(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculator() {
		return a - b;
	}

}
