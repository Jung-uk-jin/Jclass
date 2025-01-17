package ja0116;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0116_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] arr = new String[5][5];
		int[] num = {1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int temp=0;
		int x,y=0;
		for(int i=0; i<300 ; i++) {
			int ran = (int)(Math.random()*25);
			temp=num[0];
			num[0]=num[ran];
			num[ran] = temp;
		}
		
		String[][] arr2 = new String[5][5];
		for(int i=0 ; i<5;i++) {
			for(int j=0 ; j<5; j++) {
				arr2[i][j]=num[5*i+j]+"";
			}
		}
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = "뽑기";			}
		}
		int no=0;
		int money=0;
		int cnt=0;
		r:while(no<10) {
			System.out.println("\t    [뽑기 게임]");
			System.out.println("-----------------------------------------------");
			System.out.println("좌표 |  \t0\t1\t2\t3\t4");
			System.out.println("-----------------------------------------------");
			for(int i=0 ; i<arr.length ; i++) {
				System.out.printf("%d   |\t",i);
				for(int j=0; j<arr[i].length; j++) {
					System.out.printf("%s\t",arr[i][j]);
				}
				System.out.println();
			}
			System.out.println("-----------------------------------------------");
			while(true) {
				System.out.print("X좌표 입력 :  ");
				x = sc.nextInt();
				System.out.print("Y좌표 입력 :  ");
				y = sc.nextInt();
				if(x>=0&& x<=4 && y>=0 && y<=4) {
					break;
				}
				else if(x==-1 || y==-1){
					System.out.println("종료");
					break r;
				}else {
					System.out.println("좌표 잘못 입력");
				}
			}
			System.out.printf("입력한 죄표 : [%d, %d]\n",x,y);
			
			if(arr2[x][y].equals("1")) {
				arr[x][y]="당첨";
				cnt+=1;
				if(money==0) {
					money=100000000;
				}
				else {
					money*=2;
				}
			}
			else {
				arr[x][y]="꽝";
			}
			System.out.println("결과 : "+arr[x][y]);
			System.out.println("계좌 : "+money);
			System.out.println("당첨 횟수 : "+cnt);
			no++;
		}
	}

}
