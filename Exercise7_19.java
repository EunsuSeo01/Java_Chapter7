/**
 * 연습문제 7-19 풀이.
 * @author user EunSu Seo
 * last modified 2021-08-30
 */
class Buyer_Ex19 {
	int money = 1000;
	Product_Ex19[] cart = new Product_Ex19[3];	// 구입한 제품을 저장하기 위한 배열.
	int i = 0;		// Product배열 cart에 사용될 index.
	
	void buy(Product_Ex19 p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 " + p + "을/를 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		add(p);
	}
	
	void add(Product_Ex19 p) {
		if (i >= cart.length) {
			Product_Ex19[] newCart = new Product_Ex19[cart.length * 2];
			
			for (int i = 0; i < cart.length; i++) {
				newCart[i] = cart[i];	// 기존의 내용을 새 장바구니에 복사.
			}
			cart = newCart;
		}
		
		cart[i] = p;
		i++;
	}
	
	void summary() {
		System.out.print("구입한 물건:");
		for (int i = 0; i < cart.length; i++) {
			if(cart[i]==null)
				break;
			System.out.print(cart[i] + ",");
		}
		System.out.println();
		
		int sum = 0;
		System.out.print("사용한 금액:");
		for (int i = 0; i < this.i; i++) {
			sum += cart[i].price;
		}
		System.out.println(sum);
		
		System.out.println("남은 금액:" + money);
	}
}

class Product_Ex19 {
	int price;		// 제품의 가격.
	
	Product_Ex19(int price) {
		this.price = price;
	}
}

class Tv_Ex19 extends Product_Ex19 {
	Tv_Ex19() { super(100); }
	
	public String toString() { return "Tv"; }
}

class Computer_Ex19 extends Product_Ex19 {
	Computer_Ex19() { super(200); }
	
	public String toString() { return "Computer"; }
}

class Audio_Ex19 extends Product_Ex19 {
	Audio_Ex19() { super(50); }
	
	public String toString() { return "Audio"; }
}

public class Exercise7_19 {
	public static void main(String[] args) {
		Buyer_Ex19 b = new Buyer_Ex19();
		b.buy(new Tv_Ex19());
		b.buy(new Computer_Ex19());
		b.buy(new Tv_Ex19());
		b.buy(new Audio_Ex19());
		b.buy(new Computer_Ex19());
		b.buy(new Computer_Ex19());
		b.buy(new Computer_Ex19());
		
		b.summary();
	}
}
