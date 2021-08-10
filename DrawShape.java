/**
 * 상속관계(is a)와 포함관계(has a)에 대한 예제.
 * @author user EunSu Seo
 * last modified 2021-08-11
 */
public class DrawShape {
	public static void main(String[] args) {
		Point[] p = {	new Point(100, 100),
						new Point(140, 50),
						new Point(200, 100)
					};	// 객체 배열 선언.
		
		Triangle t = new Triangle(p);
		Circle c = new Circle(new Point(150, 150), 50);
		
		t.draw();	// 삼각형을 그린다.
		c.draw();	// 원을 그린다.
	}
}

class Shape {
	String color = "black";
	void draw() {
		System.out.printf("[color = %s] \n", color);
	}
}

class Point {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	Point() {
		this(0,0);
	}
	String getXY() {
		return "(" + x + "," + y + ")";		// x와 y의 값을 문자열로 반환.
	}
}

class Circle extends Shape {	// Circle is a Shape. (상속관계)
	Point center;	// 원의 원점 좌표. Circle has a Point. (포함관계)
	int r;			// 반지름.
	
	Circle() {
		this(new Point(0,0), 100);	// Circle(Point center, int r) 생성자를 호출.
	}
	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
	void draw() {
		System.out.printf("[center = (%d,%d), r = %d, color = %s]\n", center.x, center.y, r, color);
	}
}

class Triangle extends Shape {	// Triangle is a Shape. (상속관계)
	Point[] p = new Point[3];	// 3개의 Point 인스턴스를 담을 배열 선언.
	// Triangle has a Point. (포함관계)
	Triangle(Point[] p) {
		this.p = p;
	}
	
	void draw() {
		System.out.printf("[p1 = %s , p2 = %s, p3 = %s, color = %s]\n",
				p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}
}