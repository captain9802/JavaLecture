package chap04_controlstatement;

import java.util.Scanner;

public class _19_BreakEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 사용자가 입력한 숫자까지의 구구단을 출력하세요. 0을 입력하면 종료.
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력하세요. 0은 종료");
			int user = sc.nextInt();
			  if(user == 0) {
				  System.out.println("종료합니다.");
				  break;
			  }
			if(user < 1 || user > 10) {
			    System.out.println("다시 입력해주세요");
			    continue;
			}    
			
			  for(int i = 2; i < user; i++) {
				  
				  for(int x = 1; x < 10; x++) {					  
					 
					  					  
				  System.out.print(i + " * " + x + " = " + (i*x) + "  ");
				  }
				  System.out.println();

					  
				  					  				  
			  }
				  
			  
		}
			
				

	}

}
