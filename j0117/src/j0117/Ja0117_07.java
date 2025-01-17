package j0117;

public class Ja0117_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stu.count =10; //클래스 변수 - 객체선언 없이 클래스명.변수명
		System.out.println(Stu.count);
		
		Stu s1 = new Stu(); // 객체선언 
		s1.id="aaa"; // 지역 변수 - 객체선언 후 참조변수명.변수명
		s1.count=100;
		s1.age=100;
		System.out.println(s1.id+ " " +s1.age);
		
		Stu s2 = new Stu(); // 객체선언 
		s2.id="bbb"; // 지역 변수 - 객체선언 후 참조변수명.변수명
		s2.count=500;
		s2.age=500;
		System.out.println(s2.id+ " " +s2.age);
		System.out.println(s1.count);
		System.out.println(s2.count);
	}

}
