/**
 * super 참조변수를 이용한 예제.
 * @author user EunSu Seo
 * last modified 2021-08-11
 */
public class SuperTest {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}

class Parent {
	int x = 10;
}

class Child extends Parent {
	void method() {
		// x와 this.x, super.x 모두 같은 변수를 의미함.
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}
