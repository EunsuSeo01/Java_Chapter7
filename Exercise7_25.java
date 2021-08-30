/**
 * 연습문제 7-25 풀이.
 * @author user EunSu Seo
 * last modified 2021-08-30
 */
class Outer_Ex {
	class Inner_Ex {
		int iv = 100;
	}
}
public class Exercise7_25 {
	public static void main(String[] args) {
		// 인스턴스 내부 클래스는 외부 클래스의 인스턴스 변수이므로,
		// 외부 클래스의 인스턴스 생성 후에야 내부 클래스의 인스턴스 생성이 가능해진다.
		Outer_Ex o = new Outer_Ex();
		Outer_Ex.Inner_Ex i = o.new Inner_Ex();
		System.out.println(i.iv);
	}
}
