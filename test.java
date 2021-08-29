// 상속 테스트
interface Movable2 {}
class Unit2 { int x = 0; }
class GroundUnit2 extends Unit2 implements Movable2 { int x = super.x; }
class Tank2 extends GroundUnit2 { int x = super.x; }

public class test {
	public static void main(String[] args) {
		Unit2 u = new GroundUnit2();
		GroundUnit2 gu = (GroundUnit2) u;	// 다운 캐스팅이라 형변환 생략 불가.
	
		System.out.println(u instanceof Unit2);
		System.out.println(u instanceof GroundUnit2);
		System.out.println(u instanceof Movable2);		// 인터페이스도 가능.
		System.out.println(gu instanceof Tank2);
		
		
	}
}
