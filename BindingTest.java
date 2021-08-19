/**
 * 참조변수와 인스턴스의 연결에 관한 예제.
 * @author user EunSu Seo
 * last modified 2021-08-19
 */
public class BindingTest {
	public static void main(String[] args) {
		Parent1 p = new Child1();
		Child1 c = new Child1();
		
		// 멤버변수 x가 조상 클래스와 자손 클래스에 중복 정의되었다!
		// -> 참조변수의 타입에 따른 변화 O.
		System.out.println("p.x = " + p.x);		// 멤버변수는 참조변수의 타입에 따라 결과 달라짐.
		p.method();		// 메서드는 참조변수 타입에 관계없이 '항상 오버라이딩된 메서드'가 호출됨.
		System.out.println("c.x = " + c.x);		// 참조변수의 타입의 멤버변수가 사용됨.
		c.method();		// 실제 인스턴스의 메서드(오버라이딩된 메서드)가 호출됨.
	}
}

class Parent1 {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child1 extends Parent1 {
	int x = 200;
	
	// 오버라이딩.
	void method() {
		System.out.println("Child Method");
	}
}