package j0127;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Stu_Deck_File {
	ArrayList<Stu> list = new ArrayList<Stu>();
	Scanner sc = new Scanner(System.in);
	void file_read() throws Exception  {
		FileReader fr = new FileReader("c:/save/studata.txt");
		BufferedReader br = new BufferedReader(fr);
		int no,kor,eng,mat,total,rank=0;
		double avg=0;
		String name="";
		while(true) {
			String line = br.readLine();
			if(line==null) {
				break;
			}
			else {
				String[] str = line.split(",");
				no = Integer.parseInt(str[0]);
				name = str[1];
				kor = Integer.parseInt(str[2]);
				eng = Integer.parseInt(str[3]);
				mat = Integer.parseInt(str[4]);
				total = Integer.parseInt(str[5]);
				avg = Double.parseDouble(str[6]);
				rank = Integer.parseInt(str[7]);
				list.add(new Stu(no,name,kor,eng,mat,total,avg,rank));
			}
		}
		br.close();
		fr.close();
	}//file_read
	void file_print() {
		for(int i=0 ; i<list.size() ; i++) {
			Stu s = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMat(),
					s.getTotal(), s.getAvg(), s.getRank());
		}
	}//file_print
	void file_write() throws IOException {
		FileWriter fw = new FileWriter("c:/save/studata.txt");
		BufferedWriter bw = new BufferedWriter(fw);
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
	}
	void file_alter() {
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
	}
}
