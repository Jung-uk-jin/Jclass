package j0120;

import java.util.Arrays;
import java.util.Scanner;

public class Cal2 {
	String[] inPut() {
		Scanner sc = new Scanner(System.in);
		String name[] = new String[3];
		for(int i=0 ; i<name.length ; i++) {
			System.out.println("이름 입력 : ");
			String in = sc.next();
			name[i]=in;
		}
		System.out.println(Arrays.toString(name));
		return name;
	}
}
