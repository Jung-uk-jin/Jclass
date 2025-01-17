package ja0116;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0116_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] arr = new String[5][5]; //뽑기 글자 배열
		String[][] arr2 = new String[5][5]; // 번호 입력 배열
		int[] num = {1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; // 숫자 배열
		//arr에 뽑기 글자 입력 
		for(int i=0 ; i<5 ; i++) {
			for(int j=0 ; j<5 ; j++) {
				arr[i][j] = "뽑기";
			}
		}
		// 숫자 배열 섞기(num)
		int temp=0; // 섞기 위한 임시 변수
		for(int i=0 ; i<300 ; i++) {
			int ran = (int)(Math.random()*25); // 0~24까지 랜덤수
			temp = num[0]; 
			num[0]=num[ran];
			num[ran]=temp;
		}
		//배열에 번호 입력
		for(int i=0 ; i<arr2.length ; i++) {
			for (int j=0 ; j<arr2[i].length ; j++) {
				arr2[i][j]=num[5*i+j]+""; // 5*i+j
			}
		}
		//뽑기 배열 출력(arr)
		int money=0; //돈
		int cnt=0; // 당첨횟수
		r:while(true) {
			for(int i=0 ; i<arr.length ; i++) {
				for(int j=0 ; j<arr[i].length ; j++) {
					System.out.print(arr[i][j]+"\t");
				}
				System.out.println();
			}
			//사용자 번호 입력
			int x,y=0;
			System.out.print("x좌표 입력 : ");
			x=sc.nextInt();
			System.out.print("y좌표 입력 : ");
			y=sc.nextInt();
			if((x<0 && x>4) && (y<0 && y>4)) {
				System.out.println("잘못입력했습니다 다시 입력");
				continue;
			}else if(x==-1 || y==-1){
				System.out.println("종료");
				break r;
			}
			
			if(arr2[x][y].equals("1")) {
				arr[x][y]="당첨";
				cnt+=1;
				if(money==0) {
					money=100000000;
				}
				else {
					money*=2;
				}
				System.out.println("당첨");
			}
			else {
				arr[x][y]="꽝";
				System.out.println("꽝");
			}
			System.out.println("계좌 : "+money);
			System.out.println("당첨횟수 : "+cnt);
		}

	}

}
