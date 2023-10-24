package chap02_variables;

public class _02_ScopeOfVariables {
	// 1. 클래스 변수 선언
	// 2. 클래스 중괄호 안에서 어디서든지 접근가능
			static int num;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 클래스 변수 선언
		// 2. 메소드 지역변수 선언
		int mainNum = 10;
		int sum = 0;
		
		// 3. 조건문의 지역변수
		if(sum == 0) {
			int ifNum = 20;
			sum = mainNum + ifNum;
		}
		System.out.println(sum);
		
		// 조건문 중괄호 블록에서 선언된 변수는 밖에서 사용불가능.
		//		System.out.println(ifNum);

		num = 30;
		System.out.println(num);
		
		// getsum() 메소드 호출
		getSum();
		
		//getSum 메소드의 지역번수에는 접근 할 수 없다.
//		System.out.println(localVa11);
//		System.out.println(localVa12);
//		System.out.println(localResult);
	
		
		

	}
	public static void getSum() {
		// 5. 메소드의 지역변수 선언
		int localVa11 = 50;
		int localVa12 = 60;
		int localResult = localVa11 + localVa12;
		
		num = 100;
		
		System.out.println(localResult + num);
	}
	

}
