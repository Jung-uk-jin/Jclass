package j0114;

import java.util.Scanner;

public class Ja0114_02 {

	public static void main(String[] args) {
		//input("데이터 입력"); 입력을 위한 객체 선언
		Scanner sc = new Scanner(System.in);
		//입력을 받을 때
		// 1. Scanner 선언
		// 정수 - nextInt, nextLong | 실수 - nextFloat, nextDouble() | 문자열 - next, nextLine
		//문자열 입력 next
		System.out.println("문자열 입력 ");
		String str = sc.next();
		System.out.println("문자열1 : "+str);
		sc.nextLine();		
		//문자열 입력 nextLine
		System.out.println("문자열 입력 ");
		String str2 = sc.nextLine();
		System.out.println("문자열2 : "+str2);

//		System.out.println("정수 입력");
//		int num = sc.nextInt();
//		System.out.println("숫자 : "+num);
//		
//		System.out.println("실수 입력");
//		float num2 = sc.nextFloat();
//		System.out.println("숫자 : "+num2);
	}

}
