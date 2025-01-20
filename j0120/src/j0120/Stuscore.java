package j0120;

public class Stuscore {
	//학생성적 
	static int cnt;
	int no;
	String name;
	int kor;
	int eng;
	int mat;
	int total;
	double avg;
	int rank;
	
	{
		cnt++;
		this.no=cnt;
	}
	Stuscore(){}
	Stuscore(String name, int kor, int eng, int mat){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.total = kor+eng+mat;
		this.avg = this.total/3.0;
	}
	
	void print() {
		System.out.printf("%d %s %d %d %d %d %.2f",no,name,kor,eng,mat,total,avg);
	}
	
}
