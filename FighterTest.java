/**
 * 인터페이스 구현 예제.
 * @author user EunSu Seo
 * last modified 2021-08-21
 */
public class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if (f instanceof Unit)
			System.out.println("f는 Unit 클래스의 자손입니다.");
		if (f instanceof Fightable)
			System.out.println("f는 Fightable 인터페이스를 구현했습니다.");
		if (f instanceof Movable)
			System.out.println("f는 Movable 인터페이스를 구현했습니다.");
		if (f instanceof Attackable)
			System.out.println("f는 Attackable 인터페이스를 구현했습니다.");
		if (f instanceof Object)
			System.out.println("f는 Object 클래스의 자손입니다.");
	}
}

// Fightable 인터페이스에 정의되어 있는 추상 메서드들을 Fighter 클래스에서 모두 구현해 주어야 한다!
class Fighter extends Unit implements Fightable {
	// 오버라이딩 할 때는 조상의 메서드보다 '넓은' 범위의 접근 제어자를 지정해야 함.
	// 조상에서 public abstract void였으므로 여기서는 무조건 접근 제어자를 public으로 해야 함.
	public void move(int x, int y) { /* 내용 생략 */ }
	public void attack(Unit u) { /* 내용 생략 */ }
}

class Unit {
	int currentHP;	// 유닛의 체력.
	int x;			// 유닛의 위치(x좌표).
	int y;			// 유닛의 위치(y좌표).
}

// 인터페이스는 다중상속이 가능하다. (클래스와 달리)
// Fightable은 Movable과 Attackable을 상속받고 있으므로 멤버로 이들의 추상메서드를 가지고 있는 것이다!
interface Fightable extends Movable, Attackable { }
interface Movable { void move(int x, int y); }	// void 앞에 public abstract 생략.
interface Attackable { void attack(Unit u); }	// void 앞에 public abstract 생략.