package j0127;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Stu_Deck {
	ArrayList<Stu> list= new ArrayList<Stu>();
	Scanner sc = new Scanner(System.in);
	
	void stu_input() {
		System.out.println("학생 이름 입력 : ");
		String name = sc.next();
		System.out.println("국어 점수 입력 : ");
		int kor = sc.nextInt();
		System.out.println("영어 점수 입력 : ");
		int eng = sc.nextInt();
		System.out.println("수학 점수 입력 : ");
		int mat = sc.nextInt();
		list.add(new Stu(name,kor,eng,mat));
		System.out.println("저장 완료");
	}//stu_input
	void print() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
		for(int i=0 ; i<list.size() ; i++) {
			Stu s = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMat(),s.getTotal(),s.getAvg(),s.getRank());
		}
	}//print
	void alter() {
		System.out.println("수정할 학생의 이름 입력 : ");
		String name = sc.next();
		int temp=0;
		loop:for(int i=0 ; i<list.size() ; i++) {
			Stu s = list.get(i);
			if(s.getName().equals(name)) {
				temp=1;
				System.out.println("이름 있음");
			}
			if(temp==1) {
				System.out.println("수정할 학생의 과목 입력 : (1-국어, 2-영어, 3-수학) : ");
				int choice = sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("현재 국어 점수 : "+s.getKor());
					System.out.println("수정할 점수 입력 : ");
					int num = sc.nextInt();
					s.setKor(num);
					s.setTotal(s.getKor() + s.getEng() + s.getMat());
					s.setAvg(s.getTotal()/3.0);
					System.out.println("수정 완료");
					break loop;
				case 2:
					System.out.println("현재 영어 점수 : "+s.getEng());
					System.out.println("수정할 점수 입력 : ");
					num = sc.nextInt();
					s.setEng(num);
					s.setTotal(s.getKor() + s.getEng() + s.getMat());
					s.setAvg(s.getTotal()/3.0);
					System.out.println("수정 완료");
					break loop;
				case 3:
					System.out.println("현재 수학 점수 : "+s.getMat());
					System.out.println("수정할 점수 입력 : ");
					num = sc.nextInt();
					s.setMat(num);
					s.setTotal(s.getKor() + s.getEng() + s.getMat());
					s.setAvg(s.getTotal()/3.0);
					System.out.println("수정 완료");
					break loop;
				default:
					System.out.println("종료");
					break loop;
				}//switch
			}//if
		}//for
		if(temp==0) {
			System.out.println("이름 없음");
		}
	}//alter
	void remove() {
		System.out.println("삭제할 학생의 이름 입력 :");
		Iterator<Stu> iterator = list.iterator();
		String name = sc.next();
		int temp=0;
		while (iterator.hasNext()) {
		    Stu s = iterator.next();
		    if (s.getName().equals(name)) {
		        temp = 1;
		        System.out.println("이름 있음");

		        iterator.remove();  // Iterator를 사용하여 안전하게 삭제
		        System.out.println("삭제 완료");
		        break;  // 삭제 후 종료
		    }
		}

		if (temp == 0) {
		    System.out.println("이름 없음");
		}
	}//remove
	void search() {
		System.out.println("검색할 학생의 이름 입력 :");
		String name = sc.next();
		int temp=0;
		loop:for(int i=0 ; i<list.size() ; i++) {
			Stu s = list.get(i);
			if(s.getName().equals(name)) {
				temp=1;
				System.out.println("이름 있음");
			}
			if(temp==1) {
				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
						s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMat(),s.getTotal(),s.getAvg(),s.getRank());
				break loop;
			}
		}
		if(temp==0) {
			System.out.println("이름 없음");
		}
	}
	void rank_sort() {
		list.sort(Comparator.comparingDouble(Stu::getTotal).reversed());
		for(int i=0 ; i<list.size() ; i++) {
			Stu s = list.get(i);
			s.setRank(i+1);
		}
		print();
	}
	void name_sort() {
		 list.sort(Comparator.comparing(Stu::getName));
		 print();
	}
	void send_file() throws IOException {
		FileWriter fw = new FileWriter("c:/save/0127stu.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		for(int i=0 ; i<list.size() ; i++) {
			Stu s = list.get(i);
			String str = String.format("%d,%s,%d,%d,%d,%d,%f,%d\r\n",
					s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMat(),
					s.getTotal(), s.getAvg(), s.getRank());
			bw.write(str);
		}
		bw.close();
		System.out.println("저장 완료e");
	}
}
