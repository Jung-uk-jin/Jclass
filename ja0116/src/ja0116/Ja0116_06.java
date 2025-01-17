package ja0116;

import java.util.Scanner;

public class Ja0116_06 {

	public static void main(String[] args) {
		// 변수 선언 - 화면구현 - 번호선택 switch - 학생성적 입력 - 학생성적 출력 -  수정 - 등수처리 -종료
		//변수
		Scanner sc = new Scanner(System.in);
		int[] no = new int[3];
		String[] name = new String[3];
		int[][] score = new int [3][4];
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		double[] avg = new double[3];
		int cnt=0;
		int total=0;
		int sno=0;
		//화면 구현
		lop:while(true) {		
			System.out.println("<학생성적 프로그램>");
			System.out.println("1. 학생 성적 입력");
			System.out.println("2. 학생 성적 출력");
			System.out.println("0. 종료");
			System.out.println("---------------------------");
			System.out.print("번호 입력 : ");
			int in = sc.nextInt();
			switch(in) {
			case 1:
				int i=cnt;
				while(i<3) {
						System.out.println("성적 입력");
						System.out.printf("[%d번쨰] ",cnt+1);
						no[i] = cnt+1;
						//이름
						System.out.println("이름 입력 (0 : 이전페이지 이동)");
						name[i]=sc.next();
						if(name[i].equals("0")) {
							break;
						}
						for(int j=0 ; j<3; j++) {
							System.out.printf("%s 점수 입력 : ",title[j+2]);
							score[i][j] = sc.nextInt();
							total+=score[i][j];
						}
						score[i][3] = total;
						avg[i]=total/3.0;
						total=0;
						System.out.println("저장 완료");
						i++;
						cnt++;
						
				}		
				break;
			case 2:
				System.out.println("성적 출력");
				for(int j=0 ; j<title.length ; j++) {
					System.out.print(title[j]+"\t");
				}
				System.out.println();
				for(int j=0 ; j<cnt ; j++) {
					System.out.printf("%d\t", no[j]);
					System.out.printf("%s\t", name[j]);
					for(int k =0 ; k<score[j].length ; k++) {
						System.out.printf("%d\t",score[j][k]);
					}
					System.out.printf("%.2f\n",avg[j]);
				}
				break;

			default:
				System.out.println("종료");
				break lop;
			}
		}
		
	}

}
