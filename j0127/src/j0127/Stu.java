package j0127;

public class Stu {
	static int cnt=1;
	private int no;
	private String name ="";
	private int kor;
	private int eng;
	private int mat;
	private int total;
	private double avg;
	private int rank;
	{this.no=cnt++;}
	Stu(){}
	Stu(String name, int kor, int eng, int mat){
		this.name=name;
		this.kor=kor;
		this.eng = eng;
		this.mat=mat;
		this.total=kor+eng+mat;
		this.avg = total/3.0;
		this.rank=0;
	}
	Stu(int no, String name, int kor, int eng, int mat, int total, double avg, int rank ){
		this.no=no;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		this.total=total;
		this.avg=avg;
		this.rank=rank;
		cnt++;
	}
	public String toString() {
		return no+name+kor+eng+mat+total+avg+rank;
	}
	public static int getCnt() {
		return cnt;
	}
	public static void setCnt(int cnt) {
		Stu.cnt = cnt;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}

}
