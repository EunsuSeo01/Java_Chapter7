/**
 * 연습문제 7-1 풀이.
 * @author user EunSu Seo
 * last modified 2021-08-27
 */
class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		// 배열 SutdaCard를 적절히 초기화 하세요.
		for (int i = 0; i < CARD_NUM / 2; i++) {
			cards[i] = new SutdaCard(i + 1, false);
			if (i == 0 || i == 2 || i == 7)
				cards[i + 10] = new SutdaCard(i + 1, true);
			else
				cards[i + 10] = new SutdaCard(i + 1, false);
		}
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	// info()대신 Object클래스의 toSting()을 오버라이딩했다.
	public String toString() {
		return num + ( isKwang ? "K" : "" );
	}
}

public class Exercise7_1 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		for (int i = 0 ; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ",");
		}
	}
}
