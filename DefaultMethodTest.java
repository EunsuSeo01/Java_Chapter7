/**
 * 디폴트 메서드 예제.
 * @author user EunSu Seo
 * last modified 2021-08-24
 */
public class DefaultMethodTest {
	public static void main(String[] args) {
		Child_ c = new Child_();
		c.method1();
		c.method2();	// Child_가 extends한 조상 클래스의 메서드와 implements한 인터페이스의 디폴트 메서드가
						// 이름이 같으면, extends한 '조상 클래스의 메서드가 호출'된다! (디폴트 메서드는 무시됨)
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
	}
}

// MyInterface와 MyInterface2에는 추상 메서드가 없어서 Child_ 클래스가 구현해야 할 메서드는 없음.
class Child_ extends Parent_ implements MyInterface, MyInterface2 {
	public void method1() {	// 조상(인터페이스도 조상임)의 메서드를 재정의하는 것 = 오버라이딩.
		System.out.println("method1() in Child_");	// 오버라이딩이 필수적. -> 두 인터페이스의 디폴트 메서드 간의 충돌이 있어서.
	}
}

class Parent_ {
	public void method2() {		// 이름 중복.
		System.out.println("method2() in Parent_");
	}
}

interface MyInterface {
	default void method1() {	// 이름 중복.
		System.out.println("method1() in MyInterface");
	}
	default void method2() {	// 이름 중복.
		System.out.println("method2() in MyInterface");
	}
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
}

interface MyInterface2 {
	default void method1() {	// 이름 중복.
		System.out.println("method1() in MyInterface2");
	}
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2");
	}
}