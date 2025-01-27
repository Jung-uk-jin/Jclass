package j0127;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Stu_Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Stu_Deck std = new Stu_Deck();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("[학생성적프로그램]");
			System.out.println("1.학생성적입력");
			System.out.println("2.학생성적출력");
			System.out.println("3.학생성적수정");
			System.out.println("4.학생성적삭제");
			System.out.println("5.학생성적검색");
			System.out.println("6.학생등수정렬");
			System.out.println("7.학생이름정렬");
			System.out.println("8.등수처리(6번 적용)");
			System.out.println("9.파일저장");
			System.out.println("0.프로그램종료");
			System.out.println();
			System.out.println("번호 입력");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				std.stu_input();
				break;
			case 2:
				std.print();
				break;
			case 3:
				std.alter();
				break;
			case 4:
				std.remove();
				break;
			case 5:
				std.search();
				break;
			case 6:
				std.rank_sort();
				break;
			case 7:
				std.name_sort();
				break;
			case 9:
				std.send_file();
				break;
			case 0:
				System.out.println("종료");
				break;
			}//switch
		}//while
	}

}
