package j0123;

import java.util.ArrayList;

public class Ja1023_07 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		for(int i=0 ; i<10 ; i++) {
			list.add(i+1);
		}
		list.add(4,100); // 인덱스 위치에 값 입력add(인덱스 위치, 넣을 값)
		list.remove(2);
		for(int i=0 ; i<10 ; i++) {
			System.out.println(list.get(i));
		}
		
		
		
//		Interger i1 = new Integer(1);
//		Interger i1 = new Integer(2);
//		Interger i1 = new Integer(3);
//		Interger i1 = new Integer(4);
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
		
//		list.add(1); // 순서 0 중복0
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(4);
//		list.add(4);
//		
//		for(int i=0 ; i<list.size() ; i++) {
//			System.out.println(list.get(i));
//		}	
//		list.remove(3); //index 번호 삭제 list[3]
//		System.out.println("-------------");
//		for(int i=0 ; i<list.size() ; i++) {
//			System.out.println(list.get(i));
//		}	
//		list.clear(); // 전체 삭제
//		System.out.println("==============");
//		for(int i=0 ; i<list.size() ; i++) {
//			System.out.println(list.get(i));
//		}	
//		if(list.isEmpty()) { // 값이 있는지 확인
//			System.out.println("파일 없음");
//		}

	
	}

}
