/**
 * 내부 클래스 예제.
 * @author user EunSu Seo
 * last modified 2021-08-24
 */
public class InnerEx3 {
	private int outerIv = 0;
	static int outerCv = 0;
	
	// 인스턴스클래스 -> 외부 클래스의 인스턴스멤버.
	class InstanceInner {
		int iiv = outerIv;	// outerIv의 접근 제어자가 private여도 사용가능함.
		int iiv2 = outerCv;
	}
	
	// 스태틱클래스 -> 외부 클래스의 static멤버.
	static class StaticInner {
		// 인스턴스 변수에 접근 불가능.
		// int siv = outerIv;	-> outerCv;로 바꾸면 스태틱 변수라 가능.
		static int scv = outerCv;
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0;
		
		// 지역클래스 -> 외부 클래스의 인스턴스멤버와 static멤버 모두에 접근 가능.
		class LocalInner {
			int liv = outerIv;
			int liv2 = outerCv;
			int liv3 = lv;
			int liv4 = LV;
		}
	}
}
