package jjcard;

public class Point3D extends Point{

	int z;
	Point3D(int x,int y, int z){
		super(x,y); //부모에 있는 생성자를 호출하면 에러 x
		this.x=x;
		this.y=y;
		this.z=z;
	}
	String getLocation() {
		return "X : " + x + " Y :" +y + "z :"+z;
	}
}
