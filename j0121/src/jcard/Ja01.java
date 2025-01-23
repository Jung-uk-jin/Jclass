package jcard;

public class Ja01 {

	public static void main(String[] args) {
		// 52장 카드 생성 > 52장 카드 순차적으로 출력
		// 랜덤으로 섞기해서 52장 출력
		//0~51 까지 숫자를 입력받아 해당되는 카드 출력
		Card[] c = new Card[52];
		String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] s = {"Spade","Heart","Diamond","Clover"};
		
		for(int i=0 ; i<4 ; i++) {
			for(int j=0 ; j<13 ; j++) {
				c[i*13+j]=new Card(j+1, s[i]);
			}
		}
		for(int i=0 ; i<4 ; i++) {
			for(int j=0 ; j<13 ; j++) {
				System.out.printf("%s, %s\n",n[c[j].num],c[i].sh);
			}
		}
	}
}
