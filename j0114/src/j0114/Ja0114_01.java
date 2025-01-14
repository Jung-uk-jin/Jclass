package j0114;

public class Ja0114_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean temp = true; //논리형
		char c = 'a'; // 문자형
		int num= 100; // 정수형
		long num2 = 10000L; //정수형
		float f = 3.14F; //실수형
		double d = 10.345; //실수형
		String str = "abc"; //문자열
		
		System.out.printf("%b\n",temp);
		System.out.printf("%c\n",c);
		System.out.printf("%d %5d %05d\n",num,num,num);
		System.out.printf("%f %.2f\n",d,d);
		System.out.printf("%s\n",str);
	}

}
