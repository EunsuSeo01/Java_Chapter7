/**
 * 익명 클래스의 사용 예제.
 * @author user EunSu Seo
 * last modified 2021-08-25
 */
public class InnerEx6 {
	Object iv = new Object() { void method(){} };	// 익명 크
	static Object cv = new Object() { void method(){} };
	
	void myMethod() {
		Object lv = new Object() { void method(){} };
	}
}
