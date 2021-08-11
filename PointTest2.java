/**
 * 조상 클래스의 생성자인 super()를 이용한 예제.
 * @author user EunSu Seo
 * last modified 2021-08-12
 */
public class PointTest2 {
	public static void main(String[] args) {
		_Point3D p3 = new _Point3D();
		System.out.println("p3.x = " + p3.x);
		System.out.println("p3.y = " + p3.y);
		System.out.println("p3.z = " + p3.z);
	}
}

class Point2 {
	int x = 10, y = 20;
	
	Point2(int x, int y) {
						// 생성자의 첫 줄에서 다른 생성자를 호출하지 않음.
						// -> 컴파일러가 자동으로 super();을 삽입.
						// -> Point2의 조상 클래스의 기본 생성자인 Object()가 호출됨.
		this.x = x;
		this.y = y;
	}
}

class _Point3D extends Point2 {
	int z = 30;
	
	_Point3D() {
		this(100, 200, 300);	// 같은 클래스 내의 다른 생성자인 _Point3D(int x, int y, int z)를 호출.
	}
	
	_Point3D(int x, int y, int z) {
		super(x, y);			// 조상 클래스의 생성자인 Point2(int x, int y)를 호출.
		this.z = z;
	}
}