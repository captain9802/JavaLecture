package homework1020_school;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int gaCnt = 0;
		int baCnt = 0;
						
		while(true) {
			System.out.println("문자를 입력하세요.");
			String user = sc.nextLine();
			
			for(int i = 0; i < user.length(); i++) {
				char ga = user.charAt(i);
				if(ga == '가') {
				gaCnt++;
				} else if(ga == '바') {
					baCnt++;
					
			} else if(ga == '바' || ga == '가') {
				System.out.println("가'와 '바'가 존재하지 않습니다.");
				continue;
			}
				
			
		}
			System.out.println("가의 개수: " +gaCnt + "  바의 개수 :" +baCnt );
			

	}

}
}