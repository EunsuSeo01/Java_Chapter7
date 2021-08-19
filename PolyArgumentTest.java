/**
 * 매개변수의 다형성을 이용한 예제.
 * @author user EunSu Seo
 * last modified 2021-08-19
 */
class Product {
	int price;		// 제품의 가격.
	int bonusPoint;	// 제품 구매 시 제공하는 보너스 점수.
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);		// 보너스 점수는 제품 가격의 10%.
	}
}

// Product의 자손 클래스 Tv0.
class Tv0 extends Product {
	Tv0() { super(100); }	// 조상 클래스의 생성자를 호출한다! -> Tv0의 가격을 100으로 설정.
	public String toString() { return "Tv"; }	// Object 클래스의 메서드를 오버라이딩.
}

// Product의 자손 클래스 Computer.
class Computer extends Product {
	Computer() { super(200); }	// 조상 클래스의 생성자를 호출! -> Computer의 가격을 200으로 설정.
	public String toString() { return "Computer"; }	// Object 클래스의 메서드를 오버라이딩.
}

// 고객, 물건을 사는 사람.
class Buyer {
	int money = 1000;	// 소유금액.
	int bonusPoint = 0;	// 보너스 점수.
	
	// 고객이 제품을 사는 행동을 메서드 buy로 구현.
	void buy(Product p) {	// 매개변수를 Product로 설정하여 Product의 자손타입의 인스턴스도 매개변수로 받아들일 수 있게 함.
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;		// 메서드가 종료됨. -> 이 문장 아래의 코드들은 실행되지 않음.
		}
		
		money -= p.price;	// 가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint;		// 제품 가격의 10%를 보너스 점수로 적립해 준다.
		System.out.println(p + "을/를 구입하셨습니다.");		// println(Object o) -> 매개변수의 toString()을 호출.
	}
}
public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv0());
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점입니다.");
	}
}
