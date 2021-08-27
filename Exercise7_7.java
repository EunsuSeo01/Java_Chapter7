/**
 * 연습문제 7-7 풀이.
 * @author user EunSu Seo
 * last modified 2021-08-27
 */
class Parent_Ex {
	int x = 100;
	
	Parent_Ex() {
		this(200);
	}
	
	Parent_Ex(int x) {
		this.x = x;
	}
	
	int getX() {
		return x;
	}
}

class Child_Ex extends Parent_Ex {
	int x = 3000;
	
	Child_Ex() {
		this(1000);
	}
	
	Child_Ex(int x) {
		this.x = x;
	}
}

public class Exercise7_7 {
	public static void main(String[] args) {
		Child_Ex c = new Child_Ex();
		
		System.out.println("x="+c.getX());
	}
}