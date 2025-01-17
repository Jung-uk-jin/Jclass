package ja0116;

import java.util.Scanner;

public class Ja0116_05 {

	public static void main(String[] args) {
		// 학생성적프로그램
		//번호. 이름 국어 영어 수학 합계 평균
		Scanner sc = new Scanner(System.in);
		int cnt=0; // 학생수
		int choice=0, temp=0;
		int total=0;
		int rankC=0;
		int[] no = new int[10];
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		int[] rank = new int[10];
		String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		
		loop:while(true) {
			System.out.println("[학생성적프로그램]");
			System.out.println("1.성적 입력");
			System.out.println("2.성적 출력");
			System.out.println("3.성적 수정");
			System.out.println("4.등수 처리");
			System.out.println("0.종료");
			System.out.println("-----------------------------------------------");
			System.out.println("원하는 번호 입력 : ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:{
				System.out.println("[학생성적 입력]");
				int i=cnt;	
				while(i<10) {
					//ㅂ번호
					System.out.printf("[%d번쨰] ",cnt+1);
					no[i] = cnt+1;
					//이름
					System.out.println("이름 입력 (0 : 이전페이지 이동)");
					name[i] = sc.next();
					if(name[i].equals("0")) {
						break;
					}
					//국 영 수
					for(int j=0 ; j<3 ; j++) {
						System.out.printf("%s 점수 입력 : \n",title[j+2]);
						score[i][j] = sc.nextInt();
						total+=score[i][j];
					}
					//합계
					score[i][3] =  total;
					avg[i]=total/3.0;
					System.out.println((cnt+1)+"번 학생이 저장되었습니다.");
					total=0;
					i++;
					cnt++;
					break;
				}
			}
			case 2:{
				System.out.println("[학생성적 출력]");
				for(int j=0 ; j<title.length ; j++) {
					System.out.printf("%s\t",title[j]);
				}
				System.out.println();
				for(int j=0 ; j<cnt ; j++) {
					System.out.printf("%d\t",no[j]);
					System.out.printf("%s\t",name[j]);
					for(int k=0 ; k<4 ; k++) {
						System.out.printf("%d\t",score[j][k]);
					}
					System.out.printf("%.2f\t",avg[j]);
					System.out.printf("%d\n",rank[j]);
				}
				break;
			}
			case 3:
				System.out.println("성적 수정");
				System.out.println("성적을 수정할 학생의 이름 입력 : ");
				String search = sc.next();
				temp=0;
				int searchNo=0;
				for(int j=0 ; j<name.length ;j++) {
					if(search.equals(name[j])) {
						searchNo = j; //위치값
						temp=1; //검색이 있음
					}
				}
				if(temp==0) {
					System.out.println("학생 없음");
				}
				else {
					System.out.println(search+"학생 성적 수정");
					System.out.println("1.국어 점수 수정");
					System.out.println("2.국어 점수 수정");
					System.out.println("3.국어 점수 수정");
					System.out.println("원하는 번호 입력 : ");
					choice = sc.nextInt();
					switch (choice) {
					case 1:
						System.out.println("[국어 점수 수정]");
						System.out.println("현제 국어 점수 : "+score[searchNo][0]);
						System.out.println("뱐경 점수 입력 : ");
						score[searchNo][0] = sc.nextInt();
						break;
					case 2:
						System.out.println("[영어 점수 수정]");
						System.out.println("현제 국어 점수 : "+score[searchNo][1]);
						System.out.println("뱐경 점수 입력 : ");
						score[searchNo][1] = sc.nextInt();
						break;
					case 3:
						System.out.println("[수학 점수 수정]");
						System.out.println("현제 국어 점수 : "+score[searchNo][2]);
						System.out.println("뱐경 점수 입력 : ");
						score[searchNo][2] = sc.nextInt();
						break;
					}
					score[searchNo][3] = score[searchNo][0]+score[searchNo][1]+score[searchNo][2];
					avg[searchNo] = score[searchNo][3]/3.0;
					
				}
			case 4:
				rankC=0;
				System.out.println("등수 처리");
				for(int j=0 ; j<cnt ; j++) {
					rankC=1;
					for(int k=0 ; k<cnt ; k++) {
						if(score[j][3]<score[k][3]) {
							rankC++;
						}
					}
					rank[j] = rankC;
				}
				System.out.println("등수처리 완료");
				System.out.println();
				break;
				
			default:{
				System.out.println("프로그램 종료");
				break loop;
			}
		}
		//화면 구현
		}	
	}
}
