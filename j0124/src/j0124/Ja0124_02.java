package j0124;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public class Ja0124_02 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Stu("홍길동",100,100,99));
		
		
		for(int i=0 ; i<list.size() ; i++) {
			Stu s = (Stu)list.get(i);
			System.out.println(s.getNo() +" " + s.getName() + " " + s.getTotal());
		}
		

//		list.add(new Stu("유관순",90,100,99));
//		list.add(new Stu("김유신",90,79,99));
//		list.add(new Stu("김구",90,15,44));
//		list.add(new Stu("강감찬",11,100,99));
//		list.add(new Stu("홍길자",90,57,100));
//		list.add(new Stu("홍길순",5,2,99));
//
//		for(int i=0 ; i<list.size() ; i++) {
//			Stu s = (Stu)list.get(i);
//			System.out.println(s.getNo() +" " + s.getName() + " " + s.getTotal());
//		}
//		
//		list.sort(new Comparator<Stu>() {
		//	@Override : 애너테이션 - 주석,,,. 스프링 : 명령어
//			public int compare(Stu s1, Stu s2) {
//				// TODO Auto-generated method stub
//				return s1.getTotal()-s2.getTotal();
//			}
//		});
	}

}
