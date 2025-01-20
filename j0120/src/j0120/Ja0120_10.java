package j0120;

import java.util.Scanner;

public class Ja0120_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stuscore[] s = new Stuscore[10]; // 배열선언
		int cnt=0,n=0,kor=0,eng=0,mat=0,total=0;
		String name="";
		int[] score = new int[3];
		int num=0,temp=0,rank=0,choice=0;
		double avg =0;
		String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		while(true) {
			System.out.println("학생 성적 프로그램");
			System.out.println("1. 학생 성적 입력  ");
			System.out.println("2. 학생 성적 출력  ");
			System.out.println("3. 학생 성적 수정  ");
			System.out.println("4. 학생 등수 등록  ");
			System.out.println("번호를 입력하세요 : ");
			num = sc.nextInt();
			switch(num) {
			case 1:
				System.out.println("학생성적 입력");
				while(cnt<3) {
					System.out.printf("%d 번째 학생",cnt+1);
					System.out.println("이름을 입력하시오 : 0이면 이전 ");
					name=sc.next();
					if(name.equals("0")) {
						break;
					}
					
					for(int j=0 ; j<score.length ; j++) {
						System.out.printf("%s 점수 입력 : \n",title[j+2]);
						score[j] = sc.nextInt();
					}
					
					s[cnt] = new Stuscore(name, score[0], score[1], score[2]);
					System.out.println("학생 성적 저장");
					cnt++;
				}
				break;
			
			case 2:
				System.out.println("학생 성적 출력");
				for(int j=0 ; j<title.length ; j++) {
					System.out.printf("%s\t",title[j]);
				}
				System.out.println();
				for(int j=0 ; j<cnt ; j++) {
					System.out.print(s[j].no+"\t");
					System.out.print(s[j].name+"\t");
					System.out.print(s[j].kor+"\t");
					System.out.print(s[j].eng+"\t");
					System.out.print(s[j].mat+"\t");
					System.out.print(s[j].total+"\t");
					System.out.printf("%.2f",s[j].avg);
					System.out.print(s[j].rank+"\t");
					System.out.println();
				}
				break;
			case 3:
				System.out.println("성적 수정");
				System.out.println("성적을 수정할 학생의 이름 입력 : ");
				String search = sc.next();
				temp =0;
				int searchNo=0;
				for(int j=0 ; j<cnt ; j++) {
					if(search.equals(s[j].name)){
						searchNo=j;
						temp=1;
					}
					if(temp==0) {
						System.out.println("이름 없음");
						break;
					}
					else {
						System.out.println("이름 있음."+search+"학생 성적 수정");
						System.out.println("1.국어 점수 수정");
						System.out.println("2.영어 점수 수정");
						System.out.println("3.수학 점수 수정");
						System.out.println("원하는 번호 입력 : ");
						choice = sc.nextInt();
						switch(choice) {
						case 1:
							System.out.println("[국어 점수 수정]");
							System.out.println("현제 국어 점수 : "+s[searchNo].kor);
							System.out.println("뱐경 점수 입력 : ");
							s[searchNo].kor = sc.nextInt();
							break;
						case 2:
							System.out.println("[영어 점수 수정]");
							System.out.println("현제 영어 점수 : "+s[searchNo].eng);
							System.out.println("뱐경 점수 입력 : ");
							s[searchNo].eng = sc.nextInt();
							break;
						case 3:
							System.out.println("[수학 점수 수정]");
							System.out.println("현제 수학 점수 : "+s[searchNo].mat);
							System.out.println("뱐경 점수 입력 : ");
							s[searchNo].mat = sc.nextInt();
							break;
						}
						s[searchNo].total = s[searchNo].kor+s[searchNo].eng+s[searchNo].mat;
						s[searchNo].avg = s[searchNo].total/3.0;
					}
					break;
				}
			case 4:
				System.out.println("성적 수정");
				rank=0;
				for(int j=0 ; j<cnt ; j++) {
					rank=1;
					for(int k=0 ; k<cnt ; k++) {
						if(s[j].total>s[k].total) {
							rank++;
						}
					}
					s[j].rank =rank;
				}
				System.out.println("등수처리 완료");
			}
		}
	}
}
