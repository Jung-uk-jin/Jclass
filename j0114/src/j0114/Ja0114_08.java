package j0114;

import java.util.Scanner;

public class Ja0114_08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for(int i=2 ; i<=9 ; i++) {
			if(i%2==0) {
				continue;
			}
			for(int j=1 ; j<=9 ; j++) {
				if(j==3) {
					continue;
				}

				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
		}
//		String str = "홍길동";
//		System.out.println("이름 입력 : ");
//		String input = sc.next();
//		
//		if( str.equals(input)) {
//			System.out.println("같다");
//		}
//		else {
//			System.out.println("다르다");
//		}
		
//		String str="안녕하세여";
//		String str2= "안녕";
//		String str3 = "안녕하세여";
//		String str4 = new String("안녕하세여");
//		
//		System.out.println(str);
//		System.out.println(str3);
//		System.out.println(str4);
//		if(str==str4) {
//			System.out.println("같다");
//		}
//		else {
//			System.out.println("다르다");
//		}
//		if(str.equals(str4)) {
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
//		int n = 10;
//		int n2=10;
//		if(n==n2) {
//			System.out.println("같다");
//		}
//		else {
//			System.out.println("다르다");
//		}
//		//1~100까지 랜덤숫자 입력 받아, 10번을 입력해서 숫자 맞추기 게임 구현
//		int ran = (int)(Math.random()*100)+1;
//		for(int i=1 ; i<=10; i++) {
//			System.out.println(i+"번쨰 도전, 숫자 입력");
//			int n = sc.nextInt();
//			if(n>ran) {
//				System.out.println("랜덤숫자보다 크다");
//			}
//			else if (n<ran){
//				System.out.println("랜덤숫자보다 작다");
//			}
//			else {
//				System.out.println("정답");
//				System.out.println(i+"번째 도전에 정답");
//				break;
//				
//			}
//		}
		
//		for(int i=0 ; i<5 ; i++) {
//			int ran = (int)(Math.random()*100)+1;
//			System.out.println(ran);
//			
//		}
		//반복문을 사용해서 000~999까지 출력 000 001 002 ...999
//		for(int i=0 ; i<=999 ; i++) {
//			System.out.printf("%03d\n",i);
//		}
	}

}
