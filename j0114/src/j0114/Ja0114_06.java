package j0114;

import java.util.Scanner;

public class Ja0114_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사용자권한 생성  ");
		int num = sc.nextInt();
		switch(num) {
		case 5:
			System.out.println("슈퍼바이저 권한 부여");
		case 4:
			System.out.println("삭제 권한 부여");
		case 3:
			System.out.println("수정 권한 부여");
		case 2:
			System.out.println("작성 권한 부여");
		case 1:
			System.out.println("읽을 권한 부여");
			break;
		}
//		System.out.println("번호 입력 : ");
//		int num = sc.nextInt();
//		switch(num) {
//		case 1:
//			System.out.println("입력창");
//			break;
//		case 2:
//			System.out.println("검색창");
//			break;
//		case 3:
//			System.out.println("수정창");
//			break;
//		case 4:
//			System.out.println("삭제창");
//			break;
//		default:
//			System.out.println("종료창");
//			break;
//		}
		
//		if (score>=90) {
//			System.out.println('A');
//		}
//		else if (score>=80) {
//			System.out.println('B');
//		}
//		else if (score>=70) {
//			System.out.println('C');
//		}
//		else if (score>=60) {
//			System.out.println('D');
//		}
//		else {
//			System.out.println('F');
//		}
		
//		System.out.println("숫자 입력 : ");
//		int num=sc.nextInt();
//		if(num>0) {
//			System.out.println("양수");
//		}
//		else if(num==0) {
//			System.out.println("0");
//		}
//		else {
//			System.out.println("음수");
//		}
//	}
	}
}
