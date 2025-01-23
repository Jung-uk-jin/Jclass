package j0123;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Ja0123_01 {
	public static void main(String[] args) {
		Stu_Deck sd = new Stu_Deck();
		Scanner sc = new Scanner(System.in);
		int choice=0;
	
		loop:while(true) {
			choice = sd.main_print();
			switch(choice) {
			case 1:
				sd.input();
				break;
			case 2:
				sd.output();
				break;
			case 3:
				sd.replace();
				break;
			default:{
				System.out.println("프로그램 종료");
				break loop;
			}
		}
		//화면 구현
		}	
	}
}
