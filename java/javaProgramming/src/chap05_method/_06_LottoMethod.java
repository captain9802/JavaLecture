package chap05_method;

import chap05_method.game.Lotto;

public class _06_LottoMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lotto lotto = new Lotto();
		int[] lottoArray = lotto.generateRandomArray();
		
		System.out.println("이번 주 로또 번호는 ");
		
		for(int i = 0; i < lottoArray.length; i++) {
			if(i == lottoArray.length - 1) {
				System.out.println(" 보너스 번호 : " + lottoArray[i]);
			} else {
				System.out.print(lottoArray[i] + ", ");
			}
		}
		
		

	}

}
