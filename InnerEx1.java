/**
 * 내부 클래스 예제.
 * @author user EunSu Seo
 * last modified 2021-08-24
 */
public class InnerEx1 {
	// 인스턴스 클래스 선언.
	class InstanceInner {
		int iv = 100;
		// static int cv = 10;	-> 내부 클래스가 외부 클래스의 '인스턴스 클래스'이기 때문에 스태틱 변수는 선언 불가능.
		final static int CONST = 100;	// final static은 '상수'이므로 허용!
	}
	
	// 스태틱 클래스 선언.
	static class StaticInner {
		int iv = 200;
		static int cv = 200;	// 내부 클래스 중 static 클래스만 staic 멤버를 정의할 수 있다!
	}
	
	// 외부 클래스(InnerEx1)의 메서드.
	void myMethod() {
		// 지역 클래스 선언.
		class LocalInner {
			int iv = 300;
			// static int cv = 300;		static 변수 선언 불가능.
			final static int CONST = 300;	// final static은 상수이므로 허용.
		}
	}

	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}
	
}
