package j0120;

import java.util.Arrays;

public class Ja0120_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arr ar = new Arr();
		System.out.println(ar.num);
		System.out.println(Arrays.toString(ar.num));
		cal(ar.num);
		System.out.println(Arrays.toString(ar.num));
	}
	static void cal(int[] num) {
		for(int i=0 ; i<num.length ; i++) {
			num[i] = num[i]+10;
		}
	}

}
