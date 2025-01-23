package j0123;

public class Point implements Cloneable {
	int x;
	int y;
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return String.format("[%d, %d]", x,y);
	}
}
