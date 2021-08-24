/**
 * 인터페이스를 통한 다형성 예제.
 * @author user EunSu Seo
 * last modified 2021-08-24
 */
class A2 {
	void autoPlay(I2 i) {
		i.play();
	}
}

interface I2 {
	public abstract void play();
}

class B2 implements I2 {
	public void play() {
		System.out.println("play in B class");
	}
}

class C2 implements I2 {
	public void play() {
		System.out.println("play in C class");
	}
}

public class InterfaceTest2 {
	public static void main(String[] args) {
		A2 a = new A2();
		a.autoPlay(new B2());	
		a.autoPlay(new C2());	// 인스턴스 B와 C는 인터페이스 I를 구현한 클래스의 인스턴스들이기 때문에
								// autoPlay(I i)메서드의 매개변수로 들어갈 수 있다.
	}
}
