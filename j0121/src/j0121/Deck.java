package j0121;

public class Deck {
//카드에 사용되는 메서드
	Deck(){
		for(int i=0 ; i<4 ; i++) {
			for(int j=0 ; j<13 ; j++) {
				c[i*13+j]=new Card(s[i],j+1);
			}
		}
	}
	Card[] c = new Card[52];
	String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","k"};
	String[] s = {"Spade","Diamond","Heart","Clover"};
	final int Card_Num=52;
	
	//카드 전체 출력메소드
	void card_print(int no) {
		System.out.printf("%d개 출력\n",no);
		for(int i=0 ; i<no ; i++) {
				System.out.printf("%s, %s\n",c[i].shape, n[c[i].number]);
			}
	}
	//카드 출력메소드
	void card_print(Card c) {
		System.out.printf("%s, %s\n",c.shape,n[c.number]);
	}
	void shuffle() {
		Card temp=null;
		int randomN=0;
		for(int i=0 ; i<300 ;i++) {
			randomN = (int)(Math.random()*52);
			temp=c[0];
			c[0]=c[randomN];
			c[randomN]=temp;
		}
	}
	
	Card pick(int no) {
		if(no>=0 && no<=51) {
			return c[no];
		}else {
			System.out.println("번호 확인");
			return c[0];
		}
	}
	
}
