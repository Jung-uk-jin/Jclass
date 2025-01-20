package j0120;

public class Ja0120_1 {
	static int a =10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data();
		d.x=10;
		System.out.println("d.x : " + d.x);
		System.out.println("d : " + d);
		change(d);
		System.out.println("d.x : " + d.x);
		
	}
	static void change(Data d) {
		d.x=1000;
		System.out.println("x : "+d.x);
	}

}
