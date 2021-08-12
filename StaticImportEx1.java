/**
 * static import문 사용 예제.
 * @author user EunSu Seo
 * last modified 2021-08-13
 */
// 맨 마지막 .의 앞에 있는 단어를 생략할 수 있게 되는 것.
import static java.lang.System.out;		// out이 System을 생략 가능.
import static java.lang.Math.*;			// *(= 모든 멤버들)이 Math를 생략 가능.

public class StaticImportEx1 {
	public static void main(String[] args) {
		// System.out.println(Math.random());
		out.println(random());
		
		// System.out.println("Math.PI: " + Math.PI);
		out.println("Math.PI: " + PI);
	}
}
