package ja0116;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ja0116_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("숫자1 입력 : ");
		String input = sc.next();
		System.err.println("숫자2 입력 : ");
		String input2 = sc.next();
		
		int num = Integer.parseInt(input);
		int num2 = Integer.parseInt(input2);
		
		System.out.println("입력한 숫자 : "+(num+num2));
//		String input = JOptionPane.showInputDialog("1~100까지의 숫자 입력"); // 새창을 출력하여 값 입력
//		System.out.println("입력 숫자 : " + input);
//		int[] num = {1,2,3,4,5};
//		int[] num2 = new int[6];
//		
		// arraycopy(복사할 배열, 복사할 배열의 주소값부터, 붙혀넣을 배열, 붙혀넣을 배열의 주소값부터, 붙혀넣을 배열의 주소값까지
//		System.arraycopy(num, 0, num2, 0, 4); 
//		System.out.println(Arrays.toString(num2));
////		num[5]=6; 네어
//		System.out.println(Arrays.toString(num));
//		//배열 복사
//		for(int i=0 ; i<num.length; i++) {
//			num2[i]=num[i];
//		}
//		num=num2;
//		num2[5]=6;
//		System.out.println(Arrays.toString(num));
		
//		int[][] score = new int[4][6];
//		for(int i=0 ; i<score.length ; i++) {
//			for (int j=0 ; j<score[i].length ; j++) {
//				score[i][j] = (6*i)+j+1;
//				System.out.print(score[i][j]+ "\t");
//			}
//			System.out.println();
//		}
//		int[][] score = new int[5][5];
//		
//		for(int i=0 ; i<score.length ; i++) {
//			for(int j=0 ; j<score[i].length ; j++) {
//				score[i][j] = (5*i)+j+1;
//				System.out.print(score[i][j]+ "\t");
//			}
//			System.out.println();
//		}
//		int[] num = new int[5];
//		for(int i=0 ; i<5 ; i++) {
//			num[i]=i+1;
//		}
//		for(int i=0 ; i<5 ; i++) {
//			System.out.println(num[i]);
//		}
	}

}
