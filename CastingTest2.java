/**
 * 참조변수의 형변환 예제.
 * @author user EunSu Seo
 * last modified 2021-08-17
 */
public class CastingTest2 {
	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine)car;	// ERROR! 형변환에 오류! car가 Car타입의 인스턴스이기 때문이다.
								// 자손타입의 참조변수로 조상타입의 인스턴스를 참조하는 것은 불가능!
		fe.drive();
		car2 = fe;
		car2.drive();
	}
}
