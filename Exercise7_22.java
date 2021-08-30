/**
 * 연습문제 7-22, 23 풀이.
 * @author user EunSu Seo
 * last modified 2021-08-30
 */
abstract class Shape_Ex {
	Point_Ex p;

	Shape_Ex() {
		this(new Point_Ex(0, 0));
	}
	Shape_Ex(Point_Ex p) {
		this.p = p;
	}

	abstract double calcArea();		// 도형의 면적을 계산해서 반환하는 메서드.

	Point_Ex getPosition() {
		return p;
	}

	void setPosition(Point_Ex p) {
		this.p = p;
	}
}

class Point_Ex {
	int x;
	int y;

	Point_Ex() {
		this(0, 0);
	}
	Point_Ex(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "[" + x + "," + y +"]";
	}
}

class Circle_Ex extends Shape_Ex {
	double r;

	Circle_Ex(double r) {
		this(new Point_Ex(0, 0), r);
	}
	Circle_Ex(Point_Ex p, double r) {
		super(p);
		this.r = r;
	}

	double calcArea() {
		return r * r * Math.PI;
	}
}

class Rectangle_Ex extends Shape_Ex {
	double width;
	double height;

	Rectangle_Ex(double width, double height) {
		this(new Point_Ex(0, 0), width, height);
	}
	Rectangle_Ex(Point_Ex p, double width, double height) {
		super(p);
		this.width = width;
		this.height = height;
	}

	boolean isSquare() {
		return width * height != 0 && width == height;		// 둘 중 하나라도 길이가 0이면 안 됨.
	}

	double calcArea() {
		return width * height;
	}
}

public class Exercise7_22 {
	static double sumArea(Shape_Ex[] arr) {
		double sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i].calcArea();
		}
		return sum;
	}

	public static void main(String[] args) {
		Shape_Ex[] arr = {
				new Circle_Ex(5.0),
				new Rectangle_Ex(3, 4),
				new Circle_Ex(1)
		};
		System.out.println("면적의 합: " + sumArea(arr));
	}
}