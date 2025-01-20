package j0120;

import java.util.Arrays;

public class Ja0120_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d= new Data();
		d.x = 10;
		System.out.println(d.x);
		d.x = cal(d.x);
		System.out.println(d.x);
	}
	static int cal(int x) {
		x=x+10;
		return x;
	}
}
