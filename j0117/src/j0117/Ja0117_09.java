package j0117;

import java.util.Scanner;

public class Ja0117_09 {

//	int add(int a, int b) {
//		int result = a+b;
//		return result;
//	}
//	boolean power;
//	void power() {
//		power = !power;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Cal2 c = new Cal2();
		while(true) {
			System.out.println("a 입력");
			int a = sc.nextInt();
			if(a==-1) {
				System.out.println("종료");
				break;
			}
			System.out.println("b 입력");
			int b = sc.nextInt();
			if(b==-1) {
				System.out.println("종료");
				break;
			}
			int r = c.addt(a, b);
			System.out.println(r);
		}
	
		
		
		
//		int add = c.addt(num, num2);
//		int mul2 = c.mult(num, num2);
//		int mul = c.mul(num, num2);
//		System.out.println(add);
//		System.out.println(mul2);
//		System.out.println(mul);
		
//		Cal c = new Cal();
//		int num=100;
//		int num2=20;
//		int add = c.add(num, num2);
//		System.out.println(add);
//		int sub = c.sub(num, num2);
//		System.out.println(sub);
	}

}
