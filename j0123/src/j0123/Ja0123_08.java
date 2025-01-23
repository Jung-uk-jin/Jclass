package j0123;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ja0123_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		HashSet set = new HashSet();
		set.add(1); // 순서 X, 중복 X
		set.add(2);
		set.add(3);
		set.add(1); // 안됨
		
		System.out.println(set.size());
		
		Iterator i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		Iterator i2 = set.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
	}

}
