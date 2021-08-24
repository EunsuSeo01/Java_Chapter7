/**
 * 제3의 클래스를 통해 인스턴스를 제공받는 예제.
 * @author user EunSu Seo
 * last modified 2021-08-24
 */
public class InterfaceTest3 {
	public static void main(String[] args) {
		A3 a = new A3();
		a.methodA();
	}
}

class A3 {
	void methodA() {
		I3 i = InstanceManager.getInstance();	// 인스턴스를 직접 생성하지 않고 getInstance()라는 메서드를 통해 제공받음.
		i.methodB();
		System.out.println(i.toString());	// 인터페이스 타입의 참조변수(i)로도 Object 클래스에 정의된 메서드들을 호출할 수 있다!
	}					// i에 toString()이 정의되어 있지는 않지만,
						// 모든 객체는 Object 클래스에 정의된 메서드들을 가지고 있을 것이기 때문에 허용해 준다.
}

interface I3 {
	public abstract void methodB();
}

class B3 implements I3 {
	public void methodB() {
		System.out.println("methodB in B class");
	}
	
	public String toString() {
		return "class B";
	}
}

class InstanceManager {
	public static I3 getInstance() {
		return new B3();	// 인스턴스 제공.
	}
}