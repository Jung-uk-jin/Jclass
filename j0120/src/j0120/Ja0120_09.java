package j0120;

public class Ja0120_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		System.out.println(p1.serialNo);
		Product p2 = new Product();
		System.out.println(p2.serialNo);
		Product p3 = new Product();
		System.out.println(p3.serialNo);
		
		System.out.println("cnt :" + Product.cnt);
	}

}
class Product {
	static int cnt=0;
	int serialNo;
	//초기화 블럭
	{
		++cnt;
		serialNo=cnt;
	}
	Product(){
		
	}
}
