package j0124;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StuDeck {
	ArrayList<Stu> list = new ArrayList<Stu>();
	Scanner sc = new Scanner(System.in);
	int temp=0;
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
	void listPrint() {
		System.out.println("          학생 성적 출력");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				title[0],title[1],title[2],title[3],title[4],title[5],title[6],
				title[7]);
		for(int i=0 ; i<list.size() ; i++) {
			Stu s = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMat(),
					s.getTotal(), s.getAvg(), s.getRank());
		}
	}
	
	
	void fileRead() throws Exception { 	//파일 읽어오기
		FileReader fr = new FileReader("c:/save/studata.txt");
		BufferedReader br = new BufferedReader(fr);
		int no,kor,eng,mat,total,rank=0;
		double avg=0;
		String name="";
		while(true) {
			String line = br.readLine();
			if(line==null) {
				break;
			}else {			
				String[] str = line.split(",");
				no=Integer.parseInt(str[0]);
				name = str[1];
				kor=Integer.parseInt(str[2]);
				eng=Integer.parseInt(str[3]);
				mat=Integer.parseInt(str[4]);
				total=Integer.parseInt(str[5]);
				avg=Double.parseDouble(str[6]);
				rank=Integer.parseInt(str[7]);
				list.add(new Stu(no,name,kor,eng,mat,total,avg,rank));
			}
		}
		br.close();
		fr.close();
	}
	
	void remove() {
		System.out.println("삭제할 학생 이름 검색 : ");
		String str_name = sc.next();
		for(int i=0  ;i<list.size() ; i++) {
			Stu s = list.get(i);
			if(s.getName().equals(str_name)) {
				System.out.println("이름 있다");
				list.remove(i);
				System.out.println("완료");
				break;
			}
			else {
				System.out.println("이름 없다");
			}
		}
	}//remove
	
	void save() throws IOException {
		FileWriter fw = new FileWriter("c:/save/studata.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		for(int i=0 ; i<list.size() ; i++) {
			Stu s = list.get(i);
			String str = String.format("%d,%s,%d,%d,%d,%d,%f,%d\r\n",
					s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMat(),
					s.getTotal(), s.getAvg(), s.getRank());
			bw.write(str);
		}
		bw.close();
		System.out.println("저장 완료");
	}
}
