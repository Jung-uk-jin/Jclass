package jjcard;

public class Point {
	int x;
	int y;
	
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	String getLocation() {
		return "X : " + x + " Y :" +y;
	}
}
