/**
 * 생성자를 이용한 final 멤버 변수의 초기화 예제.
 * @author user EunSu Seo
 * last modified 2021-08-13
 */
class Card2 {
	// final 멤버변수 -> final : 마지막의, 변경될 수 없는.
	final int NUMBER;	// 상수.
	final String KIND;	// 상수.
	
	// static 멤버변수 -> static : 클래스의, 공통적인.
	static int width = 100;
	static int height = 250;
	
	// 생성자.
	Card2(String kind, int number) {	// 생성자에 전달된 값을 통해 final 변수를 초기화시킴.
		// -> 각 인스턴스마다 final 멤버변수가 다른 값을 가질 수 있으면서, 그 값은 상수라 중간에 변경할 수 없음.
		KIND = kind;
		NUMBER = number;
	}
	Card2() {
		this("HEART", 1);
	}
	
	// Overriding. Object 클래스에 있는 toString()를 Card2에 맞게 재정의한 것.
	public String toString() {
		return KIND + " " + NUMBER;
	}
}

public class FinalCardTest {
	// public : 접근 제어자. static : (그 외의)제어자.
	public static void main(String[] args) {
		Card2 c = new Card2("HEART", 10);
		// c.NUMBER = 5;	// ERROR! 상수는 중간에 변경 불가.
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);		// 참조변수 c를 println의 인자로 넣으면 c.toString() 메서드가 호출됨.
	}
}
