package j0127;

import java.util.ArrayList;
import java.util.Scanner;

public class Ball_Deck {
	ArrayList<Ball> list = new ArrayList<Ball>();
	Scanner sc = new Scanner(System.in);
	boolean ps = true;
	int[] lotto = new int[6];
	int[] input = new int[6];
	void new_ball() {
		for(int i=0 ; i<45 ; i++) {
			list.add(new Ball(i+1));
		}
	}
	void shuffle() {
		Ball temp;
		for(int i= 0 ; i<300 ; i++) {
			int ran = (int)(Math.random()*45);
			temp = list.get(0);
			list.set(0, list.get(ran));
			list.set(ran, temp);
		}
	}
	void ball_value() {
		for(int i=0 ; i<lotto.length ; i++) {
			lotto[i]=list.get(i).getNumber();
		}
	}
	void input() {
		int i=0;
		loop:while(i<input.length) {
			System.out.println((i+1) + "번째 숫자를 입력하세요");
			int in = sc.nextInt();
			if(in>45) {
				System.out.println("숫자가 45보다 큽니다");
				continue;
			}
			for(int j=0 ; j<i ; j++) {
				if(in==input[j]) {
					ps=false;
					System.out.println("같은 숫자가 있습니다. 다시 실행하십시오");
					break loop;
				}
			}
			input[i]=in;
			i++;
		}
	}
	void print() {
		int cnt=0;
		for(int i=0 ; i<lotto.length; i++) {
			for(int j=0 ; j<lotto.length ; j++) {
				if(lotto[i]==input[j]) {
					cnt++;
				}
			}
			System.out.println("\t      로또번호\t내번호");
			System.out.print((i+1) + "번째 숫자\t");
			System.out.print(lotto[i] + "\t");
			System.out.print(input[i] + "\t\n" );
		}
		System.out.println("맞춘 갯수 : " +cnt);
	}
	
}
