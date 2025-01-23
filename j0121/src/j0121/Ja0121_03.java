package j0121;

public class Ja0121_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck d = new Deck();
		d.shuffle();
		d.card_print(10);

		Card c = d.pick(2);
		d.card_print(c);
	}

}
