package chap04_controlstatement;

public class _08_DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        do {
        	System.out.println("무조건 1회 실행");
        } while(10 < 5);
        
        int i = 0;
        
        do {
        	if(i % 3 == 0)
        		System.out.println(i);
        } while(++i <= 20);
	}

}
