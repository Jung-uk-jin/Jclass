package j0120;

import java.util.Scanner;

public class Ja0120_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stuscore[] s =new Stuscore[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0 ; i<3 ; i++) {
			System.out.println("학생이름 입력 : ");
			String name = sc.next();
			System.out.println("국어 점수 입력 : ");
			int kor = sc.nextInt();
			System.out.println("영어 점수 입력 : ");
			int eng = sc.nextInt();
			System.out.println("수학 점수 입력 : ");
			int mat = sc.nextInt();
			s[i] = new Stuscore(name,kor,eng,mat);
			s[i].print();
			System.out.println();
		}

		
		
//		Car c1 = new Car("red","auto",5);
//		Car c2 = new Car();
//		Car c3 = new Car(c1);
		
//		Stuscore s = new Stuscore();
//		s.no=1;
//		s.name="홍길동";
//		s.kor=100;
//		s.eng=100;
//		s.mat=100;
//		s.total = s.kor+s.eng+s.mat;
//		s.avg = s.total/3.0;
//		System.out.println(s.no);
//		System.out.println(s.name);
//		System.out.println(s.kor);
//		System.out.println(s.eng);
//		System.out.println(s.mat);
//		System.out.println(s.total);
//		System.out.println(s.avg);
//		s.print();
//		System.out.println();
		
//		Stuscore s2 = new Stuscore(2,"유관순",99,98,87);
//		s2.print();
	}

}
