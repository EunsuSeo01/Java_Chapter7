/**
 * 연습문제 7-26 풀이.
 * @author user EunSu Seo
 * last modified 2021-08-30
 */
class Outer_Ex2 {
	static class Inner_Ex2 {
		int iv = 200;
	}
}
public class Exercise7_26 {
	public static void main(String[] args) {
		// 내부 클래스가 스태틱 클래스일 때는 외부 클래스의 인스턴스 없이도 내부 클래스의 변수에 접근이 가능.
		Outer_Ex2.Inner_Ex2 si = new Outer_Ex2.Inner_Ex2();
		System.out.println(si.iv);
	}
}
