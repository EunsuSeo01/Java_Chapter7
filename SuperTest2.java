/**
 * super 참조변수를 이용한 예제.
 * @author user EunSu Seo
 * last modified 2021-08-12
 */
public class SuperTest2 {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
	}
}

class Parent2 {
	int x = 10;
}

class Child2 extends Parent2 {
	int x = 20;
	
	void method() {
		// x랑 this.x는 현재 이 인스턴스인 Child2의 x값을 가리키지만,
		// super.x는 Child2의 super 클래스인 Parent2의 x값을 가리킨다.
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}