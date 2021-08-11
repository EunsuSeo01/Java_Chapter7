/**
 * 조상 클래스의 생성자인 super()를 이용한 예제.
 * @author user EunSu Seo
 * last modified 2021-08-12
 */
public class PointTest {
	public static void main(String[] args) {
		// Point3D 클래스의 매개변수가 3개인 생성자를 사용하여 인스턴스를 생성.
		Point3D p3 = new Point3D(1,2,3);
		System.out.println(p3.getLocation());
	}
}

class Point1 {
	int x, y;
	
	Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x : " + x + ", y : " + y;
	}
}

// Point3D is a Point1.
class Point3D extends Point1 {
	int z;
	
	Point3D(int x, int y, int z) {
		super(x, y);	// 조상 클래스의 생성자를 호출하여 조상의 멤버변수들을 초기화시킴.
		this.z = z;
	}
	
	// 오버라이딩. 조상 클래스의 메서드와 선언부가 똑같아야 함.
	String getLocation() {
		// 조상 클래스를 참조하는 super 참조변수를 이용하여 조상 클래스의 메서드를 사용함.
		return super.getLocation() + ", z : " + z;
	}
}