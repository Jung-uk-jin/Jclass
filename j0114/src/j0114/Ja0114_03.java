package j0114;

import java.util.Scanner;

public class Ja0114_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 이름 입력 : ");
		String name = sc.nextLine();
		System.out.println("국어 점수 입력 : ");
		int kor = sc.nextInt();
		System.out.println("영어 점수 입력 : ");
		int eng = sc.nextInt();
		System.out.println("수학 점수 입력 : ");
		int mat = sc.nextInt();
		
		int sum = kor+eng+mat;
		double avg = sum/3.0; // 마찬가지로 둘 중 하나의 타입이 실수여야함으로 3.0 입력
		System.out.printf("이름 : %s ,국어: %d, 영어: %d,수학: %d, 총점: %d, 평균 : %.2f",name,kor,eng,mat,sum,avg );
//		System.out.printf("이름 : %s ,국어: %d, 영어: %d,수학: %d, 총점: %d, 평균 : %.2lf",name,kor,eng,mat,kor+mat+eng,(kor+eng+mat)/3 );
		//에러나는 이유 : (kor+eng+mat)/3 이면 둘다 타입이 int이므로 둘 중 하나의 타입이 실수여야 함.
//		System.out.printf("이름 : %s ,국어: %d, 영어: %d,수학: %d, 총점: %d, 평균 : %.2lf",name,kor,eng,mat,kor+mat+eng,(kor+eng+mat)/3.0 );
	}

}
