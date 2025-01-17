package j0117;

import java.util.Scanner;

public class Ja0117_02 {

	public static void main(String[] args) {
		//성적 입력 
		Scanner sc = new Scanner(System.in);
		StuScore st = new StuScore();
		st.no = 1;
		st.name = "홍길동";
		st.kor =100;
		st.eng = 90;
		st.cal_total();
		st.cal_avg();
		
		StuScore st2 = new StuScore();
		st2.no=2;
		st2.name="유관순";
		st2.kor=90;
		st2.eng=90;
		st2.cal_total();
		st2.cal_avg();
		
		StuScore st3 = new StuScore();
		st3.no=3;
		st3.name="이순신";
		st3.kor=77;
		st3.eng=89;
		st3.cal_total();
		st3.cal_avg();
		
		System.out.println(st3.no);
		System.out.println(st3.name);
		System.out.println(st3.kor);
		System.out.println(st3.eng);
		System.out.println(st3.total);
		System.out.println(st3.avg);
		
	}

}
