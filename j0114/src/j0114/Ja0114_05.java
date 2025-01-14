package j0114;

import java.util.Scanner;

public class Ja0114_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int max = (num1>num2)?((num1>num3)?num1:num3):(num2>num3?num2:num3);
		System.out.println(max);
		int min = (num1<num2)?((num1<num3)?num1:num3):(num2<num3?num2:num3);
		System.out.println(min);
		
//		System.out.println("숫자 입력 : ");
//		int num = sc.nextInt();
//		String r = num>0?"양수":(num==0)?"0":"음수";
//		System.out.println(r);
		
//		System.out.println("점수 입력");
//		int score = sc.nextInt();
//		String result = score>=60?"합격":"불합격";
//		System.out.println(result);
		
//		int x= sc.nextInt();
//		int absX = x>=0?x:x-x;
//		System.out.println(absX);
//		System.out.println("소문자 입력 : ");
//		char c = sc.next().charAt(0);
//		if(c>='a' && c<='z' || (c>='A' && c<='Z')) {
//			System.out.println("영문자");
//		}
//		else {
//			System.out.println("영문자가 아님");
//		}
		
//		if(5>3) {
//			System.out.println("정답");
//		}
//		else {	
//			System.out.println("오답");
//		}
		
		//반올림
//		System.out.println("소수점 3자리 실수 입려 ㄱ");
//		double d = sc.nextDouble();
//		double d2 = Math.round(d*100)/100.0;
//		System.out.println(d2);
		
		

		// 버림b
//		float pi=3.141592F;
//		float pi2 = (int)(pi*10)/10F;
//		System.out.println(pi2);
	}

}
