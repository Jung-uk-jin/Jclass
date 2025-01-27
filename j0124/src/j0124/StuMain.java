package j0124;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class StuMain {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		StuDeck stuDeck = new StuDeck();
		//파일 읽어오기
		stuDeck.fileRead();
		while(true) {
			System.out.println("[학생성적프로그램]");
			System.out.println("1.학생성적입력");
			System.out.println("2.학생성적출력");
			System.out.println("3.학생성적수정");
			System.out.println("4.학생성적삭제");
			System.out.println("5.학생성적검색");
			System.out.println("6.학생등수정렬");
			System.out.println("7.학생이름정렬");
			System.out.println("8.등수처리");
			System.out.println("9.파일저장");
			System.out.println("0.프로그램종료");
			System.out.println();
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				FileWriter fw = new FileWriter("c:/save/studata.txt"+true);
				BufferedWriter bw = new BufferedWriter(fw);
				
				break;
			case 2:
				stuDeck.listPrint();
				break;
			case 4:
				stuDeck.remove();
				break;
			case 9:
				stuDeck.save();
				break;
			case 0:
				break;
			}//switch
		}//while
	}
}
