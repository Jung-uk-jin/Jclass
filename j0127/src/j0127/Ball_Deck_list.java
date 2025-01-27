package j0127;

import java.util.ArrayList;
import java.util.Scanner;

public class Ball_Deck_list {
    // Ball 객체들을 저장할 리스트
    ArrayList<Ball> list = new ArrayList<Ball>();
    Scanner sc = new Scanner(System.in);
    boolean ps = true;
    int[] lotto = new int[6];
    int[] input = new int[6];

    // Ball 객체를 생성하여 리스트에 추가하는 메서드
    void new_ball() {
        for (int i = 0; i < 45; i++) {
            list.add(new Ball(i + 1));  // Ball 객체를 생성하여 리스트에 추가
        }
    }

    // Ball 리스트를 섞는 메서드
    void shuffle() {
        for (int i = 0; i < 300; i++) {
            int ran = (int) (Math.random() * 45);
            Ball temp = list.get(0);
            list.set(0, list.get(ran));
            list.set(ran, temp);
        }
    }

    // 로또 번호를 ball 리스트에서 lotto 배열로 복사하는 메서드
    void ball_value() {
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = list.get(i).getNumber();  // 리스트에서 Ball 객체의 번호를 가져옴
        }
    }

    // 사용자가 로또 번호를 입력받는 메서드
    void input() {
        int i = 0;
        loop:
        while (i < input.length) {
            System.out.println((i + 1) + "번째 숫자를 입력하세요");
            int in = sc.nextInt();
            if (in > 45) {
                System.out.println("숫자가 45보다 큽니다");
                continue;
            }
            for (int j = 0; j < i; j++) {
                if (in == input[j]) {
                    ps = false;
                    System.out.println("같은 숫자가 있습니다. 다시 실행하십시오");
                    break loop;
                }
            }
            input[i] = in;
            i++;
        }
    }

    // 로또 번호와 사용자가 입력한 번호를 비교하여 출력하는 메서드
    void print() {
        int cnt = 0;
        System.out.println("\t      로또번호\t내번호");
        for (int i = 0; i < lotto.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (lotto[i] == input[j]) {
                    cnt++;
                }
            }
            System.out.print((i + 1) + "번째 숫자\t");
            System.out.print(lotto[i] + "\t");
            System.out.print(input[i] + "\t\n");
        }
        System.out.println("맞춘 갯수 : " + cnt);
    }
}