package j0121;

public class Circle extends Shape{
	Circle(){
		this(new Point(0,0),100);
	}
	Circle(Point center, int r){
		center = new Point();
		this.center = center;
		this.r=r;
	}
	Point center; // 클래스 선언
	int r;
	
}
