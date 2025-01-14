package j0114;

import java.util.Scanner;

public class Ja0114_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=2;
		while(i<=9) {
			int j=1;
			System.out.println(i+"단");
			while(j<=9) {
				System.out.printf("%d * %d = %d\t ",i,j,i*j);
				j++;
			}
			i++;
			System.out.println();
		}
		
//		int i=1;
//		while(i<=5) {
//			System.out.println("gd"+i);
//			i++;
//		}
//		for(int j=0 ; j<5 ; j++) {
//			System.out.println("gd"+j);
//		}
		
		
//		System.out.println("숫자 입력");
//		int n = sc.nextInt();
//		int n2 = sc.nextInt();
//		int min,max=0;
//		//방법 1
////		if(n<n2) {
////			min=n;
////			max=n2;
////		}
////		else {
////			min=n2;
////			max=n;
////		}
//		//방법 2
//		max = Math.max(n,n2);
//		min = Math.min(n,n2);
//		for(int i=min ; i<=max ; i++) {
//			System.out.println(i+"단");
//			for(int j=1 ; j<=9 ; j++) {
//				System.out.printf("%d * %d = %d\t",i,j,i*j);
//			}
//			System.out.println();
//		}
//		
//		for(int i=n ; i<=9 ; i++) {
//			System.out.println(i+"단");
//			for(int j=1 ; j<=9 ; j++) {
//				System.out.printf("%d * %d = %d\t",i,j,i*j);
//			}
//			System.out.println();
//		}
//		
		
		//모두 영문자일때만 1개씩 출력
//		System.out.println("영문자 입력 : ");
//		String in = sc.next();
//		int temp=0;
//		for(int i = 0 ; i<in.length() ; i++) {
//			if (!(in.charAt(i)>='a' && in.charAt(i)<='z') || (in.charAt(i)>='A' && in.charAt(i)<='Z'))  {
//				temp=1;
//				break;
//			}
//		}
//		//영문자면 출력 아니면 다시 입력 
//		if(temp==0) {
//			for(int i=0;i<in.length();i++) {
//				System.out.println(in.charAt(i));
//			}
//		}else {
//			System.out.println("다시 입력");
//		}
//		
		
		
		
		
		//입력받은 글자를 1개씩 출력하는 프로그램 구현
//		System.out.println("글자 입력 : ");
//		String in = sc.nextLine();
//		for(int i=0 ; i<in.length() ; i++)
//		{
//			System.out.println(in.charAt(i));
//		}
		//단어를 1개씩 출력
//		String in = "abcdefghijk";
//		System.out.println(in.length());
//		System.out.println(in.charAt(in.length()-1));
//		for(int i=0 ;i<in.length(); i++) {
//			System.out.println(in.charAt(i));
//		}
		
//		System.out.println("영문자 입력 : ");
//		String str = sc.next();
//		char c = str.charAt(0);
//		if(c>='a' && c<='z' || c>='A' && c<='Z' ) {
//			System.out.println("출력 : "+c);
//		}
//		else {
//			System.out.println("영문자가 아니므로 다시 입력");
//		}
//		
		
//		int sum=0;
//		for(int i=0 ; i<=100 ; i++) {
//			System.out.println(i);
//			sum=sum+i;
//		}
//		System.out.println(sum);
	}

}
