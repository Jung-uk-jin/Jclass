package j0120;

public class Ja0120_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		for(int i=1 ; i<=5 ; i++) {
			total+=i+1;
		}
		System.out.println(total);
		System.out.println(fac(5));
	}
	static long fac(int n) {
		long r=0;
		if(n==1) {
			r=1;
		}
		else {
			r = n*fac(n-1);
		}
		return r;
	}

}
