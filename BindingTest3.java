/**
 * 참조변수와 인스턴스의 연결에 관한 예제.
 * @author user EunSu Seo
 * last modified 2021-08-19
 */
public class BindingTest3 {
	public static void main(String[] args) {
		Parent4 p = new Parent4();
		Child4 c = new Child4();
		
		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println();
		System.out.println("c.x = " + c.x);
		c.method();
	}
}

class Parent4 {
	int x = 100;
	void method() {
		System.out.println("Parent Method");
	}
}

class Child4 extends Parent4 {
	int x = 200;
	void method() {
		System.out.println("x = " + x);	// this.x와 같다.
		System.out.println("super.x = " + super.x);
		System.out.println("this.x = " + this.x);
	}
}