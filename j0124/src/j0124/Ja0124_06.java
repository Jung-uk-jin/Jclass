package j0124;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.annotation.processing.Filer;

public class Ja0124_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Stu> list = new ArrayList<Stu>();
		list.add(new Stu("홍길동,100,100,100"));
		list.add(new Stu("이순신,100,100,50"));
		list.add(new Stu("유관순,100,10,20"));
		for(int i=0 ; i<list.size() ; i++) {
			list.get(i);
		try {
			FileWriter fw = new FileWriter("c:/save2/stu.txt"); 
			//파일 저장 (저장위치) true, 이어쓰기 false 덮어쓰기
			BufferedWriter bw = new BufferedWriter(fw); //버퍼 사용
			for(int i1=0 ; i1<list.size() ; i1++) {
				bw.write(list+"\r\n"); // 배열 출력 및 저장
			}
			bw.close(); // 파일 닫기
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			FileReader fr = new FileReader("c:/save2/abc.txt");
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String line= br.readLine();
				if(line==null) {
					break;
				}
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		String[] str = new String[3];
//		str[0]="1,홍길동,100,100,99";
//		str[1]="2,유관순,760,70,99";
//		str[2]="3,이순신,50,10,99";
		System.out.println("완료");
	}
	}}
