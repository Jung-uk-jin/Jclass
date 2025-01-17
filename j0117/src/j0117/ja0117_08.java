package j0117;

public class ja0117_08 {

	public static void main(String[] args) {
		//카드 모양 : spade,heart,clover,diamond
		//숫자 : 1(A),2,3,4,5,6,7,8,9,10,11(J),12(Q),13(K)
		//총 카드 숫ㅅ자 : 52
		
		Card[] c = new Card[52];
		String[] shape = {"spade","heart","diamond","clover"};
		int temp=0;
		for(int i=0; i <c.length ; i++) {
			c[i] = new Card();
			c[i].kind = shape[i/13];
			c[i].number = (i%13)+1;
		}
//		for(int i=0; i <c.length ; i++) {
//			System.out.printf("%s-%d\n",c[i].kind,c[i].number);
//		}
		for(int i=0 ; i<300 ; i++) {
			int ran = (int)(Math.random()*52);
			temp = c[0].number;
			c[0].number = c[ran].number;
			c[ran].number = temp;
		}
		for(int i=0; i <c.length ; i++) {
			System.out.printf("%s-%d\n",c[i].kind,c[i].number);
		}
		
		
		
		
//		Card c1 = new Card();
//		c1.kind="Heart";
//		c1.number=1;
//		Card c2 = new Card();
//		c2.kind="Clover";
//		c2.number=2;
//		System.out.println(c1.kind);
//		System.out.println(c1.number);
//		System.out.println(c2.kind);
//		System.out.println(c2.number);
//		System.out.println(c1.width+" "+ c1.height);
//		
//		c2.width=50;
//		c2.height=70;
//		
//		System.out.println(c1.width+" "+ c1.height);
	}

}
