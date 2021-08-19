/**
 * 매개변수의 다형성을 이용한 예제.
 * @author user EunSu Seo
 * last modified 2021-08-20
 */
class Product1 {
	int price;
	int bonusPoint;
	
	Product1(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
	Product1() {}	// 기본 생성자도 선언.
}

class Tv1 extends Product1 {
	Tv1() { super(100); }
	public String toString() { return "Tv"; }
}

class Computer1 extends Product1 {
	Computer1() { super(200); }
	public String toString() { return "Computer"; }
}

class Audio1 extends Product1 {
	Audio1() { super(50); }
	public String toString() { return "Audio"; }
}

class Buyer1 {
	int money = 1000;
	int bonusPoint = 0;
	Product1[] item = new Product1[10];	// 구입한 제품 목록. (객체 배열로 구현)
	int i = 0;
	
	void buy(Product1 p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;	// 객체를 객체 배열에 저장.
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
	// 구입한 물품에 대한 정보를 요약해서 보여주는 기능을 summary 메서드로 구현.
	void summary() {
		int sum = 0;	// 구입한 물품들의 가격 합계.
		String itemList = "";	// 구입한 물품 목록. -> 문자열!
		
		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		for (int i = 0; i < item.length; i++) {
			if (item[i] == null) break;
			sum += item[i].price;
			itemList += (i == 0) ? "" + item[i] : ", " + item[i];	// 객체에 문자열을 +연산함으로서 객체를 문자열로서 저장.
		}
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}

public class PolyArgumentTest2 {
	public static void main(String[] args) {
		Buyer1 b = new Buyer1();
		
		b.buy(new Tv1());
		b.buy(new Computer1());
		b.buy(new Audio1());
		b.summary();
	}
}
