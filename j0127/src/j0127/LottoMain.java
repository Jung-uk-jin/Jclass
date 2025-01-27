package j0127;

public class LottoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. ball 객체 만들기
		//2. ball_deck 객체( ball 45개 생성, ball 숫자 입력, ball 섞기 6개 추출 후 6개 숫자 입력 및 비교, 출력화면 있음
		//3. main에서 로또 프로그램 실행에서 6개 숫자 입력, 로또번호와 비교해서 맞춘 개수 확인
		
		Ball_Deck bd = new Ball_Deck();
		bd.new_ball();
		bd.shuffle();
		bd.ball_value();
		bd.input();
		if(bd.ps==true) {
			bd.print();			
		}
	}

}
