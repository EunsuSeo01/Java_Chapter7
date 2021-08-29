/**
 * 연습문제 7-7 풀이.
 * @author user EunSu Seo
 * last modified 2021-08-29
 */
class Parent_Ex {
	int x = 100;
	
	Parent_Ex() {
		this(200);
	}
	
	Parent_Ex(int x) {
		// 생성자의 첫 줄에 '다른 생성자가 호출되지 않으면'
		// 컴파일러는 조상의 기본 생성자를 호출하는 코드 super();을 추가해 준다.
		// 여기선 Parent_Ex의 조상인 'Object의 기본 생성자'를 호출하는 super();가 생략된 것.
		this.x = x;
	}
	
	int getX() {
		return x;
	}
}

class Child_Ex extends Parent_Ex {
	int x = 3000;
	
	Child_Ex() {
		this(1000);
	}
	
	Child_Ex(int x) {
		// super(); 생략됨. 생성자의 첫 줄에 다른 생성자의 호출이 없으니까.
		this.x = x;
	}
}

public class Exercise7_7 {
	public static void main(String[] args) {
		Child_Ex c = new Child_Ex();
		
		System.out.println("x="+c.getX());
		// -> getX()메서드는 Child_Ex의 조상 클래스인 Parent_Ex에 정의된 것이라서
		// Parent_Ex 클래스의 인스턴스 변수 x의 값이 출력된다!
	}
}