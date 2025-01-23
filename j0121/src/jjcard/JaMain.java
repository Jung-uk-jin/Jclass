package jjcard;

import java.util.Scanner;

public class JaMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Card[] my_card = new Card[5];
		Deck d = new Deck(); //52장 카드 생성
		int choice =0;
		while(true) {
			System.out.println("[카드 게임]");
			System.out.println("------------------------");
			System.out.println("1. 카드 생성");
			System.out.println("2. 카드 출력");
			System.out.println("3. 카드 섞기");
			System.out.println("4. 카드 5장 받기");
			System.out.println("5. 내 카드 보기");
			System.out.println("6. 특정 위치 카드 출력");
			System.out.println("0. 종료");
			System.out.println("------------------------");
			System.out.println("원하는 번호를 입력하세요 >> ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				d.input();// 번호 부여
				System.out.println("부여 완료");
				break;
			case 2:
				System.out.println("카드 출력 갯수 입력 : ");
				int num = sc.nextInt();
				d.print(num);; //52개 카드 출력
				break;
			case 3:
				d.shuffle();
				System.out.println("카드 섞기 완료");
				break;
			case 4:
				System.out.println("5장 출력");
				System.out.println("---------------");
				d.print(5);
			case 5:
				System.out.println("[내 카드 출력]");
				System.out.println("------------------");
				for(int i=0 ; i<5 ; i++) {
					System.out.println(my_card[i]);
				}
			case 6:
				System.out.println("몇번째 카드 출력?? ");
				int no = sc.nextInt();
				Card c_pick = d.pick(no);
				d.print(c_pick);
				break;
				
			}//switch
				
		}//while
		
		
	}

}
