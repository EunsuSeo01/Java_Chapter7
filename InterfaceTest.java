/**
 * 인터페이스를 이용해 직접적인 관계의 클래스들을 간접적인 관계로 바꿔줄 수 있음을 보여주는 예제.
 * @author user EunSu Seo
 * last modified 2021-08-24
 */

/*
 A-B 직접적인 관계 : 한쪽(Provider)이 변경되면 다른 한쪽(User)도 변경되어야 한다는 단점이 있음.
class A {
	public void methodA(B b) {
		b.methodB();
	}
}

class B {
	public void methodB() {
		System.out.println("methodB()");
	}
}
*/

// A-I-B의 간접적인 관계 : 클래스 A는 인터페이스 I하고만 직접적인 관계라서 클래스 B의 변경에 영향을 받지 않게 됨!
// -> 인터페이스를 이용해 클래스 B(Provider)의 선언과 구현을 분리시킴으로써 간접적인 관계로 바꿀 수 있음.
class A {
	public void methodA(I i) {
		i.methodB();
	}	// -> 클래스 A를 작성하는 데 클래스 B가 사용되지 않았음. A는 B를 몰라도 됨.
}

interface I {
	public abstract void methodB();
}

class B implements I {
	public void methodB() {
		System.out.println("methodB() in B class");
	}
}

public class InterfaceTest {
	public static void main(String[] args) {
		A a = new A();
		a.methodA(new B());
	}
}
