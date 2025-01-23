package j0123;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu_Deck {
	Scanner sc = new Scanner(System.in);
	ArrayList list = new ArrayList();
	int choice=0, temp=0;
	int kor=0,mat=0,eng=0,no=0,rank=0;
	double avg=0;
	int total=0;
	int rankC=0;
	String name ="";
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
	
	//0. 상단 메뉴 메소드 
	int main_print() {
		System.out.println("[학생성적프로그램]");
		System.out.println("1.성적 입력");
		System.out.println("2.성적 출력");
		System.out.println("3.성적 수정");
		System.out.println("4.성적 삭제");
		System.out.println("5.등수 처리");
		System.out.println("0.종료");
		System.out.println("-----------------------------------------------");
		System.out.println("원하는 번호 입력 : ");
		choice=sc.nextInt();
		return choice;
	}
	
	//1. 입력 메소드
	void input() {
		System.out.println("[학생성적 입력]");
		while(true) {
			//ㅂ번호
			System.out.printf("[%d번쨰] ",list.size()+1);
			//이름
			System.out.println("이름 입력 (0 : 이전페이지 이동)");
			name = sc.next();
			if(name.equals("0")) {
				break;
			}
			//국 영 수
			System.out.printf("국어 점수 입력 : \n");
			kor = sc.nextInt();
			System.out.printf("영어 점수 입력 : \n");
			eng = sc.nextInt();
			System.out.printf("수학 점수 입력 : \n");
			mat = sc.nextInt();
			
			//list 저장
			list.add(new Stu(name,kor,eng,mat));
			System.out.println("저장되었습니다.");
		}//while
	}//input
	
	//2. 입력 메소드
	void output() {
		System.out.println("[학생성적 출력]");
		for(int j=0 ; j<title.length ; j++) {
			System.out.printf("%s\t",title[j]);
		}//title_for
		System.out.println();
		for(int j=0 ; j<list.size() ; j++) {
			Stu s = (Stu)list.get(j);
			System.out.printf("%d\t",s.getNo());
			System.out.printf("%s\t",s.getName());
			System.out.printf("%d\t",s.getKor());
			System.out.printf("%d\t",s.getEng());
			System.out.printf("%d\t",s.getMat());
			System.out.printf("%d\t",s.getTotal());
			System.out.printf("%.2f\t",s.getAvg());
			System.out.printf("%d\n",s.getRank());
		}//list_for
	}//output
	void replace() {
		System.out.println("[학생성적 수정]");
		System.out.println("성적을 수정할 학생의 이름 입력 : ");
		String search = sc.next();
		int temp=0;
		if(search.equals(name)) {
			temp=1;
		}
		if(temp==0) {
			System.out.println("학생 없음");
		}
		else {
			System.out.println(search+"학생 성적 수정");
			System.out.println("1.국어 점수 수정");
			System.out.println("2.국어 점수 수정");
			System.out.println("3.국어 점수 수정");
			System.out.println("원하는 번호 입력 : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("[국어 점수 수정]");
				System.out.println("현제 국어 점수 : "+kor);
				System.out.println("뱐경 점수 입력 : ");
				kor= sc.nextInt();
				break;
			case 2:
				System.out.println("[영어 점수 수정]");
				System.out.println("현제 영어 점수 : "+eng);
				System.out.println("뱐경 점수 입력 : ");
				eng = sc.nextInt();
				break;
			case 3:
				System.out.println("[수학 점수 수정]");
				System.out.println("현제 수학 점수 : "+mat);
				System.out.println("뱐경 점수 입력 : ");
				mat = sc.nextInt();
				break;
			}
			total = kor+mat+eng;
			avg = total/3.0;
		}
	}
}
