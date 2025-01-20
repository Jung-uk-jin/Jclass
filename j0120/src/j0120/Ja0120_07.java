package j0120;

public class Ja0120_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data1 d1 = new Data1();
		d1.value=10;
		d1.name="홍길동";
		d1.kor=100;
		d1.eng=100;
		d1.mat=90;
		System.out.println(d1.value);
		Data2 d2 = new Data2(1,"홍길동",100,100,99);
		System.out.println(d2.value);
	}

}

class Data1{
	int value;
	String name;
	int kor;
	int eng;
	int mat;
}

class Data2{
	int value;
	String name;
	int kor;
	int eng;
	int mat;
	int total;
	double avg;
	Data2(){} // 생성자
	Data2(int x,String n, int k, int e, int m){
		value=x;
		name=n;
		kor=k;
		eng=e;
		mat=m;
		
	}
	
}


