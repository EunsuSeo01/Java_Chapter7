/**
 * 참조변수의 형변환 예제.
 * @author user EunSu Seo
 * last modified 2021-08-17
 */
public class CastingTest1 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;	// car = (Car)fe;와 같음. fe를 car로, Up-Casting -> 형변환 생략 가능.
		// car.water();		// car는 Car타입의 참조변수.
		// Car타입(조상)의 참조변수로는 FireEngine의 메서드인 water()를 호출할 수 없다.
		fe2 = (FireEngine)car;		// car(조상)를 fe2(자손)로, Down-Casting -> 형변환 생략 불가능.
		fe2.water();
	}
}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	
	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!!");
	}
}