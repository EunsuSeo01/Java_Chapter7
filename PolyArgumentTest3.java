/**
 * 크기가 동적으로 관리되는 객체 배열인 Vector 클래스를 사용한 예제.
 * @author user EunSu Seo
 * last modified 2021-08-20
 */
import java.util.*;		// Vector 클래스를 사용하기 위해 추가.

class Product3 {
	int price;
	int bonusPoint;

	Product3(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
	Product3() {
		price = 0;
		bonusPoint = 0;
	}
}

class Tv_3 extends Product3 {
	Tv_3() { super(100); }
	public String toString() { return "Tv"; }
}

class Computer_3 extends Product3 {
	Computer_3() { super(200); }
	public String toString() { return "Computer"; }
}

class Audio_3 extends Product3 {
	Audio_3() { super(50); }
	public String toString() { return "Audio"; }
}

class Buyer3 {
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector();		// 구입한 제품을 저장하는데 사용될 Vector 객체!

	void buy(Product3 p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}

		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);	// Vector 클래스의 메서드 add == Vector에 객체를 추가한다.
						// 구입한 제품을 Vector에 저장한다.
		System.out.println(p + "을/를 구입하셨습니다.");
	}

	// 구입한 제품을 환불시켜 주는 메서드.
	void refund(Product3 p) {	// 매개변수로 Product3의 자손 클래스의 인스턴스들이 다 올 수 있음.
		if (item.remove(p)) {	// 제품을 Vector 배열에서 제거한다.
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "을/를 반품하셨습니다.");
		} else {	// 제품 제거에 실패한 경우.
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}

	void summary() {
		int sum = 0;
		String itemList = "";

		if (item.isEmpty()) {	// Vector 배열이 비어있다면,
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}

		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		for (int i = 0; i < item.size(); i++) {
			Product3 p = (Product3)item.get(i);		// Vector 배열에서 i번째 인덱스의 객체를 가져온다.
													// !! 이 반환형이 Object라서 형변환 후 매개변수에 저장해야 한다!
			sum += p.price;
			itemList += (i == 0) ? "" + p : ", " + p;
		}
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}

public class PolyArgumentTest3 {
	public static void main(String[] args) {
		Buyer3 b = new Buyer3();
		Tv_3 tv = new Tv_3();
		Computer_3 com = new Computer_3();
		Audio_3 audio = new Audio_3();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		
		b.refund(com);
		b.summary();
	}
}
