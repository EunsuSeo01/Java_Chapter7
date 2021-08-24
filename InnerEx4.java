/**
 * 내부 클래스 예제.
 * @author user EunSu Seo
 * last modified 2021-08-24
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
		// (static에서) 인스턴스 클래스(내부 클래스)의 인스턴스를 생성하려면
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
