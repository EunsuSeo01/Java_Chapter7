/**
 * 연습문제 7-5 풀이.
 * @author user EunSu Seo
 * last modified 2021-08-27
 */
class Product_Ex {
	int price;
	int bonusPoint;
	
	Product_Ex(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv_Ex extends Product_Ex {
	Tv_Ex() { super(200); }
	
	public String toString() {
		return "Tv";
	}
}

public class Exercise7_5 {
	public static void main(String[] args) {
		Tv_Ex t = new Tv_Ex();
		System.out.println(t);
	}
}
