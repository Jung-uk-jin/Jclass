package j0123;

public class Stu {
	static int cnt=0;
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int total;
	private double avg;
	private int rank;
	Stu(){}
	Stu(String name, int kor, int eng, int mat){
		this.no = cnt++; //자동
		this.name=name;
		this.kor = kor;
		this.eng=eng;
		this.mat=mat;
		this.total = kor+eng+mat; // 자동
		this.avg = this.total/3.0; // 자동
	}
	//get, set
	int getNo() {
		return no+1;
	}
	void setNo(int no) {
		this.no=no;
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
	
	@Override
	public boolean equals(Object obj) {
		return name == ((Stu)obj).name;
	}
}
