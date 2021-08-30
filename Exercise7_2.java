/**
 * 연습문제 7-2 풀이.
 * @author user EunSu Seo
 * last modified 2021-08-30
 */
class SutdaDeck2 {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck2() {
		for (int i = 0; i < CARD_NUM / 2; i++) {
			cards[i] = new SutdaCard(i + 1, false);
			if (i == 0 || i == 2 || i == 7)
				cards[i + 10] = new SutdaCard(i + 1, true);
			else
				cards[i + 10] = new SutdaCard(i + 1, false);
		}
	}
	
	// 3개의 메서드를 작성하세요.
	// 배열 cards에 담긴 카드의 위치를 뒤섞는다. (Math.random() 사용)
	public void shuffle() {
		for (int i = 0; i < cards.length; i++) {
			int index = (int) (Math.random() * cards.length);
						// -> Math.random() * CARD_NUM에 괄호를 꼭 써줘야 잘 작동됨!!
						// 괄호 안하면 (int) Math.random()이 먼저 돼서 0밖에 안 나옴.
			SutdaCard tmp = cards[i];
			cards[i] = cards[index];
			cards[index] = tmp;
		}
	}
	
	// 배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
	public SutdaCard pick(int index) {
		// 매개변수가 있는 메서드는 반드시 작업 전에 매개변수의 유효성 검사를 해야함을 잊지 말자!
		if (index < 0 || index >= CARD_NUM)
			return null;
		return cards[index];
	}
	
	// 배열 cards에서 임의의 위치의 SutdaCard를 반환한다. (Math.random() 사용)
	public SutdaCard pick() {
		int index = (int) (Math.random() * cards.length);
		return cards[index];
	}
}
public class Exercise7_2 {
	public static void main(String[] args) {
		SutdaDeck2 deck = new SutdaDeck2();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for (int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ",");
		}
		
		System.out.println();
		System.out.println(deck.pick(0));
	}
}
