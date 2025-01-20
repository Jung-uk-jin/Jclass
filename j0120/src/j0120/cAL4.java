package j0120;

import java.util.Scanner;

public class cAL4 {
	void input(String[] name, int[] kor) {
		Scanner sc = new Scanner(System.in);
		for(int i=0 ; i<3 ; i++) {
			System.out.println("이름 입력 : ");
			name[i] = sc.next();
			System.out.println("국어 점수 입력 : ");
			kor[i] = sc.nextInt();
		}
		for(int i=0 ; i<3 ; i++) {
			System.out.println(name[i]+ " " +kor[i]);
		}
		
	}
}
