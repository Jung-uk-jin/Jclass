package j0124;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ja0124_08 {

	public static void main(String[] args) {
		
		//FileOutputStream
		try {
			//폴더 확인 및 폴더 생성
			String folder="c:/save3";
			File f = new File(folder);
			if(!f.exists()) {
				f.mkdir();
			}
			File file = new File(folder + "abc.txt");
			if(!file.exists()) {
				file.createNewFile();
				System.out.println("파일 생성");
			}
			FileOutputStream fos = new FileOutputStream(folder + "abc.txt");
			String str = "1,homg홍,100,100,100,300,100.0,0";
			str+="2,Yu유,100,100,70,270,90.0,0";
			byte[] bytes = str.getBytes(); //byte단위로 분리
			for(byte b:bytes) {
				fos.write(b);
			}
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		// FileInputStream
//		try {
//			FileInputStream fis = new FileInputStream("c:/save2/bbb.txt");
//			int read =0;
//			while((read =fis.read()) !=-1){
//				System.out.print((char)read);
//			}
//			System.out.println();
//			fis.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
	}

}
