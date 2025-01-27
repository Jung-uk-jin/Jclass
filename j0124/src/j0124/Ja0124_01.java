package j0124;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Ja0124_01 {

	public static void main(String[] args) {

		//Map
		ArrayList list = new ArrayList();
		list.add(new Stu("홍길동",100,100,99));
		list.add(new Stu("유관순",90,100,99));
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("UserId", "aaa");
		map.put("UserPw", "1111");
		map.put("UserName", "홍길동");
		map.put("list", list);
		
		//key 값이 존재하는지
//		System.out.println(map.containsKey("UserId"));
		//value값이 존재하는지
//		System.out.println(map.containsValue("1111"));
		
//		//전체 출력 - iterator 활용
//		Iterator i = map.entrySet().iterator();
//		
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
//		
//		ArrayList list2 = (ArrayList)map.get(list);
//		for(int i=0 ; i<list.size() ; i++) {
//			Stu s = (Stu)list2.get(i);
//			System.out.println(s.getNo()+ " " + s.getName());
//		}
//		
//		System.out.println(map.get("UserId"));
//		
//		System.out.println(map.get("list"));
		
		// hash
//		HashSet set = new HashSet();
//		set.add(1);
//		set.add(2);
//		set.add(3);
//		set.add(2);
//		
//		Iterator i = set.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
//		i = set.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
//		ArrayList list = new ArrayList();
//		list.add(new Stu("홍길동",100,100,99));
//		list.add(new Stu("유관순",90,100,99));
//		list.add(new Stu("이순신",90,90,99));
//		Stu s1 = new Stu();
//		s1.setName("강감찬");
//		s1.setKor(70);
//		s1.setEng(80);
//		s1.setMat(88);
//		list.add(s1);
//		
//		for(int i=0 ; i<list.size() ; i++) {
//			Stu s = (Stu)list.get(i);
//			System.out.println(s.getNo() + ", " + s.getName());
//		}
	}

}
