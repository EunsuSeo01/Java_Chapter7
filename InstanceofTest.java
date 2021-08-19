/**
 * instanceof 연산자를 사용한 예제.
 * @author user EunSu Seo
 * last modified 2021-08-19
 */
public class InstanceofTest {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		if (fe instanceof FireEngine) {	// 실제 인스턴스(FireEngine)와 같은 타입. -> true.
			System.out.println("This is a FireEngine instance.");
		}
		
		if (fe instanceof Car) {	// 실제 인스턴스의 조상타입(Car)과의 연산에도 true가 나옴.
			System.out.println("This is a Car instance.");
		}
		
		if (fe instanceof Object) {	// 실제 인스턴스의 조상타입(Object)과의 연산에도 true가 나옴.
			System.out.println("This is an Object instance.");
		}
		
		/*
		 * instanceof 연산을 통해 true를 얻은 타입은
		 * 그 타입으로 참조변수의 형변환이 가능하다는 뜻이다.
		 */
				
		System.out.println(fe.getClass().getName());	// 클래스의 이름을 출력.
	}
}
