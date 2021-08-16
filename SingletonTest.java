/**
 * 접근 제어자가 private인 생성자를 사용하는 예제.
 * @author user EunSu Seo
 * last modified 2021-08-17
 */
final class Singleton {		// private 생성자를 가지고 있는 클래스라서 조상 클래스가 될 수 없음.
							// 그래서 미리 클래스 앞에 final을 붙여서 '상속할 수 없는 클래스'임을 알려준 것.
	private static Singleton s = new Singleton();	// 이 클래스의 인스턴스가 getInstance() 메서드에서
													// 사용되어야 하기 때문에 static으로 미리 생성해 둠.

	private Singleton() {	// 인스턴스를 생성하는 데 있어서 접근 제한을 걸어 둠.
		//...
	}
	
	// 외부에서 이 클래스의 인스턴스를 사용할 수 있도록 public.
	// 인스턴스를 생성하지 않고도 호출할 수 있어야 하므로 static.
	public static Singleton getInstance() {
		if(s == null) {
			s = new Singleton();	// s가 null이면 인스턴스를 생성해 줌.
		}
		return s;	// 이미 생성되어 있는 s를 반환해 줌.
	}
}

public class SingletonTest {
	public static void main(String[] args) {
		// Singleton s = new Singleton();	생성자 Singleton의 접근 제어자가 private이기 때문에 접근 불가능.
		Singleton s = Singleton.getInstance();
	}

}
