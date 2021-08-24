/**
 * 외부 클래스의 변수와 내부 클래스의 변수 이름이 중복일 때 구별할 수 있는 법을 알려주는 예제.
 * @author user EunSu Seo
 * last modified 2021-08-25
 */
class Outer1 {
	int value = 10;		// Outer.this.value
	
	class Inner1 {
		int value = 20;		// this.value
		
		void method1() {
			int value = 30;
			System.out.println("		   value : " + value);
			System.out.println("	  this.value : " + this.value);	// this.변수
			System.out.println("Outer.this.value : " + Outer1.this.value);	// 외부클래스명.this.변수
		}
	}
}

public class InnerEx5 {
	public static void main(String[] args) {
		Outer1 outer = new Outer1();
		Outer1.Inner1 inner = outer.new Inner1();
		inner.method1();
	}
}
