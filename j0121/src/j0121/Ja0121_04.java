package j0121;

import java.util.Scanner;

public class Ja0121_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//카드게임
		//카드 게임 실행
		//컴퓨터가 랜덤으로 1개를 뽑고 무늬와 ㅜㅅ자가 높은 사람 승리
		Scanner sc = new Scanner(System.in);
		Card[] c = new Card[52];
		String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","k"};
		String[] s = {"Spade","Diamond","Heart","Clover"};
		
		Deck d = new Deck();
		d.shuffle();
//		d.card_print(5);
		
//		System.out.println((n+1)+"번쨰 카드");
		
		System.out.println("숫자 선택 : ");
		int i = sc.nextInt();
		Card ic = d.pick(i);
		
		int ran=(int)(Math.random()*52);
		Card cc = d.pick(ran);
		
		
		
		System.out.println("내가 뽑은 카드");
		d.card_print(ic);
		System.out.println("컴퓨터가 뽑은 카드");
		d.card_print(cc);
		
		
	}

}
