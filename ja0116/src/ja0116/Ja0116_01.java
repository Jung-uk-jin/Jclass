package ja0116;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0116_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ball = new int[45];
		int[] lotto = new int[6];
		int[] in = new int[6];
		int[] answer = new int[6];
		int cnt=0;
		//숫자 생성
		for(int i=0 ; i<45 ; i++) {
			ball[i]=i+1;
		}
		//섞기
		int temp=0; // 값을 바꿀 변수
		for(int i=0 ; i<300 ; i++) {
			int ran = (int)(Math.random()*45);// 0~44까지의 주소값
			// temp(0) > 0번자리의 값 | ball[0] > ball[ran](0~44까지의 주소값) | ball[ran](0~44까지의 주소값) > temp(0)
			//숫자값을 바꾼것이 아닌 자리(주소값)를 바꾼것 
			temp=ball[0];
			ball[0] = ball[ran];
			ball[ran] = temp;
		}
		//로또에 숫자값 넣기
		for(int i=0;i<6;i++) {
			lotto[i] = ball[i];
		}
		//번호 입력
		for(int i=0 ; i<6 ; i++) {
			System.out.printf("%d번째 번호 입력\n",i+1);
			in[i] = sc.nextInt();
		}
		//입력 번호와 로또 번호 비교 
		for(int i=0 ; i<6 ; i++) {
			for(int j =0 ; j<6 ; j++) {
				if(in[i]==lotto[j]) {
					answer[cnt] = in[i];
					cnt++;
					break;
				}
			}
		}
		//출력
		System.out.printf("로또 번호 : %s\n",Arrays.toString(lotto));
		System.out.printf("입력 번호 : %s\n",Arrays.toString(in));
		System.out.printf("맞춘 갯수 : %d\n",cnt);
		System.out.print("맞춘 번호 : ");
		for(int i=0 ; i<cnt; i++) {
			System.out.print(answer[i]+" ");
		}
		System.out.println();
	}

}
