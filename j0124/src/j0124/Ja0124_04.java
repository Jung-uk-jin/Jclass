package j0124;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ja0124_04 {

	public static void main(String[] args) throws IOException {
		
		//폴더 생성 및 파일 저장
		File f = new File("c:/save2");
		if(!f.exists()) {
			f.mkdirs();
		}
		FileInputStream fis = new FileInputStream("c:/save/rose.jpg");
		FileOutputStream fos = new FileOutputStream("c:/save2/rose2.jpg");
		while(true) {
			int read = fis.read();
			if(read==-1) {
				break;
			}else {
				fos.write(read);
			}
		}
		fis.close();
		fos.close();
		
		System.out.println("프로그램 종료");
		
		
		//-------------
		//파일을 읽어서 데이터 출력
//		byte[] b = new byte[1024];
//		FileInputStream fis = new FileInputStream("c:/save/aaa.txt");
//		fis.read(b);
//		System.out.println(new String(b));
		
		
		//글을 가져와서 출력하는 기본 형태
//		try {
//			int read=0;
//			while((read=fis.read())!=-1) {
//				System.out.println((char)read);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

}
