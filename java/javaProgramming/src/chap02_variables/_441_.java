package chap02_variables;

import java.util.Scanner;

public class _441_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
		 Scanner sc = new Scanner(System.in);
	        String a = sc.next();
	        //char[] str = a.toCharArray();
	        
	        
	        // 배열 == 문자열 ?? =! 사람 == 원숭이 ? 비교못해요
	        
	        char convertCh = 0;
	        
	        for (int i=0; i<str.length; i++) {
	        	
	        }
	        
	        if(a = 'A' && a != 'Z') {

				convertCh = (char)(str + 32);
				
	        } else if(str >= 'a' && str <= 'z') {

				convertCh = (char)(str - 32);			



			} else {

				convertCh = 0; //만약 ch에 #같은게 들어갔을 경우

			}

			

			if(convertCh != 0) {

				System.out.println(convertCh);

			}
	

	}
}

