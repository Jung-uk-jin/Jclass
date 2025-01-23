package j0123;

import java.util.Scanner;

public class Ja0123_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try { // 정상적으로 돌아가는 프로그램
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			throw new Exception();
		}catch (Exception e){ // 오류 발생시 실행되는 부분
			e.printStackTrace(); //에러가 났을 때 에러 위치, 에러 설명 
			System.out.println("에러");
	
		}
		System.out.println(5);
		System.out.println(6);
		// TODO Auto-generated method stub

	}

}
