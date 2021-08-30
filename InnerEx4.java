/**
 * 내부 클래스 예제.
 * 외부 클래스(Outer)가 아닌 다른 클래스에서 내부 클래스의 인스턴스를 생성하고 내부 클래스의 멤버에 접근하는 예제인데,
 * 실제로 이런 경우가 발생했다는 건 내부 클래스로 선언하면 안 되는 걸 내부 클래스로 선언했다는 의미임. 참고로만 보기.
 * @author user EunSu Seo
 * last modified 2021-08-25
 */
class Outer {
	class InstanceInner {
		int iv = 100;
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 300;
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 400;
		}
	}
}
public class InnerEx4 {
	public static void main(String[] args) {
		// (static메서드나 static 클래스 내에서) 인스턴스 클래스(내부 클래스)의 인스턴스를 생성하려면
		// 외부 클래스의 인스턴스를 먼저 생성해야 함!
		Outer oc = new Outer();
		Outer.InstanceInner ii = oc.new InstanceInner();
		
		System.out.println("ii.iv = " + ii.iv);
		System.out.println("Outer.StaticInner.cv = " + Outer.StaticInner.cv);
		
		// 스태틱 클래스(내부 클래스)의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 됨.
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.iv = " + si.iv);
	}
}
