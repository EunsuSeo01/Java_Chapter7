/**
 * import문 선언 예제.
 * @author user EunSu Seo
 * last modified 2021-08-13
 */
/* SimpleDateFormat과 Date 클래스는 각각 다른 패키지에 속한 클래스라서
   import문으로 어느 패키지에 속하는 클래스인지 명시해 줌.
   -> import문을 지정해 주었기 때문에 클래스 이름에 패키지명을 생략할 수 있게 됨. */
import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTest {
	public static void main(String[] args) {
		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
		/* 사실 System도 java.lang패키지의 클래스인데 패키지명을 생략할 수 있는 이유는
		   모든 소스파일(.java)에는 묵시적으로 import java.lang.*;가 선언되어 있기 때문. */
		System.out.println("오늘 날짜는 " + date.format(today));
		System.out.println("현재 시간은 " + time.format(today));
	}
}
