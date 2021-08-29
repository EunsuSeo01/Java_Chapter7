/**
 * 연습문제 7-14 풀이.
 * @author user EunSu Seo
 * last modified 2021-08-29
 */
class SutdaCard3 {
	// final이 인스턴스 변수에 붙을 때는 선언시에 초기화하지 않아도, 생성자에서 초기화할 수 있다.
	// '생성할 때 지정된 값이 변하지 않도록' 하는 것이다!
	final int num;
	final boolean isKwang;
	
	SutdaCard3() {
		this(1, true);
	}
	SutdaCard3(int num, boolean isKwang) {
		this.num = num;		// 생성자에서 단 한번 초기화가 가능하다.
		this.isKwang = isKwang;		// 생성자에서 단 한번 초기화가 가능하다.
	}
	
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}
public class Exercise7_14 {
	public static void main(String[] args) {
		SutdaCard3 card = new SutdaCard3(1, true);	// 이후로 값 변경 불가.
		System.out.println(card);
	}
}
