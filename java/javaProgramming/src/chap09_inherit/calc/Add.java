package chap09_inherit.calc;

public class Add extends Calculator {
	
	int c;
	
	public Add() {
		
	}
	
	
	public Add(int a, int b) {
		super(a, b);
		
		
//		super(a, b);
//		ab가 먼저 있어야함.
	}
	
	public int calculator() {
		return a + b;
	}


	@Override
	public int Calculate() {
		// TODO Auto-generated method stub
		return 0;
	}


	
}
