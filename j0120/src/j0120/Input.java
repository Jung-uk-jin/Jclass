package j0120;

import java.util.Scanner;

public class Input {
		int valInput() {
		Scanner sc = new Scanner(System.in);
		int in=0;
		System.out.println("숫자 입력 : ");
		in=sc.nextInt();
		return in;
	}

}
