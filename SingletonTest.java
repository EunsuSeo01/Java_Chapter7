/**
 * 
 * @author user EunSu Seo
 * last modified 2021-08-15
 */
class Singleton {
	private static Singleton s = new Singleton();

	private Singleton() {
		//...
	}
	
	public static Singleton getInstance() {
		if(s == null) {
			s = new Singleton();
		}
		return s;
	}
}

public class SingletonTest {
	public static void main(String[] args) {
		// Singleton s = new Singleton();	생성자 Singleton의 접근 제어자가 private이기 때문에 접근 불가능.
		Singleton s = Singleton.getInstance();
	}

}
