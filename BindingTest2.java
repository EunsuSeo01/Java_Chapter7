/**
 * 참조변수와 인스턴스의 연결에 관한 예제.
 * @author user EunSu Seo
 * last modified 2021-08-19
 */
public class BindingTest2 {
	public static void main(String[] args) {
		Parent3 p = new Parent3();
		Child3 c = new Child3();
		
		// 자손 클래스에서 조상 클래스의 멤버를 중복 정의하지 않았다!
		// -> 참조변수의 타입에 따른 변화 X.
		System.out.println("p.x = " + p.x);
		p.method();
		
		System.out.println("c.x = " + c.x);
		c.method();
	}
}

class Parent3 {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child3 extends Parent3 { }