package j0127;

import java.io.IOException;
import java.util.Scanner;

public class Stu_Main_File {

	public static void main(String[] args) throws Exception {
		Stu_Deck_File stdf = new Stu_Deck_File();
			Scanner sc = new Scanner(System.in);
			stdf.file_read();
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
					stdf.file_write();
					break;
				case 2:
					stdf.file_print();
					break;
				case 3:
					stdf.file_alter();
					break;
				default:
					System.out.println("종료");
					break;
				}//switch
			}//whi
			

	}

}
