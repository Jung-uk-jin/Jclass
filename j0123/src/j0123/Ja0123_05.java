package j0123;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ja0123_05 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("파일 이름 입력 : ");
		String name = sc.next();
		File f = createFile(name+".txt");
		System.out.println("파일 생성");
	}
	
	static File createFile(String fileName) throws Exception {
		File f = new File(fileName);
		f.createNewFile();// 파일 생성 - 외부에 있는 하드디스크에 파일 1개 생성
		return f;
//		if(fileName==null || fileName.equals("")) {
//			throw new Exception("파일이 없음");
//		}
		
	}

}
