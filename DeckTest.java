/**
 * 포함관계를 갖는 클래스들에 대한 예제. toString()도 사용된 예제.
 * @author user EunSu Seo
 * last modified 2021-08-11
 */
public class DeckTest {
	public static void main(String[] args) {
		Deck d = new Deck();	// 카드 한 벌(Deck)을 만든다.
		Card c = d.pick(0);		// 섞기 전에 제일 위(index가 0)의 카드를 뽑는다.
		System.out.println(c);	// System.out.println(c.toString());과 같다!
		
		d.shuffle();	// 카드 섞기.
		c = d.pick(0);	// 섞은 후에 제일 위의 카드를 뽑는다.
		System.out.println(c);	// 참조변수 c가 가리키고 있는 인스턴스의 toString()을 호출하는 것.
	}
}

class Deck {
	final int CARD_NUM = 52;	// 카드의 개수. (상수)
	Card cardArr[] = new Card[CARD_NUM];	// Card객체 배열을 포함.
	
	Deck() {
		int i = 0;
		
		// 객체 배열의 각 요소의 객체를 생성하는 것.
		for (int k = Card.KIND_MAX; k > 0; k--)
			for (int n = 0; n < Card.NUM_MAX; n++)
				cardArr[i++] = new Card(k, n+1);
	}
	
	// 반환형이 Card 인스턴스.
	Card pick(int index) {	// 저장된 위치(index)에 있는 카드 하나를 꺼내서 반환.
		return cardArr[index];
	}
	
	Card pick() {	// Deck에서 카드 하나를 선택한다.
		int index = (int)(Math.random() * CARD_NUM);
		return pick(index);
	}
	
	void shuffle() {	// 카드의 순서를 섞는다.
		for (int i = 0; i < cardArr.length; i++) {
			int r = (int)(Math.random() * CARD_NUM);
			
			Card temp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = temp;
		}
	}
}

class Card {
	static final int KIND_MAX = 4;	// 카드 무늬의 수.
	static final int NUM_MAX = 13;	// 무늬별 카드 수.
	
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	
	int kind;
	int number;
	
	Card() {
		this(SPADE, 1);
	}
	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	// 참조변수의 출력이나 덧셈연산자를 이용한 참조변수와 문자열의 결합에는 toString()이 자동적으로 호출됨.
	// 참조변수를 문자열로 대치한 후 처리.
	public String toString() {
		String[] kinds = { "", "CLOVER", "HEART", "DIAMOND", "SPADE" };
		String numbers = "0123456789XJQK";	// 숫자 10은 X로 표현.
		return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
	}
}