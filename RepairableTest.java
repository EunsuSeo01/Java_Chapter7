/**
 * 인터페이스의 유용함을 알아볼 수 있는 예제.
 * @author user EunSu Seo
 * last modified 2021-08-24
 */
public class RepairableTest {
	public static void main(String[] args) {
		Tank tank = new Tank();		// 기계화 유닛.
		Dropship dropship = new Dropship();		// 기계화 유닛.
		
		Marine marine = new Marine();	// 기계화 유닛이 아님.
		SCV scv = new SCV();	// 건설인부 생성.
		
		scv.repair(tank);	// 기계화 유닛인 tank를 고쳐라.
		scv.repair(dropship);	// dropship을 고쳐라.
		// scv.repair(marine);
	}
}

interface Repairable { }

class Unit_ {
	int hitPoint;
	final int MAX_HP;
	Unit_(int hp) {
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit_ {
	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit_ {
	AirUnit(int hp) {
		super(hp);
	}
}

// 서로 아무런 관계가 없던 Tank 클래스와 Dropship 클래스에게 
// 공통된 하나의 Repairable 인터페이스를 구현하게 함으로써 관계를 만들어 줌!
class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}
}

// 같은 인터페이스를 구현했다는 공통점이 생김.
class Dropship extends AirUnit implements Repairable {
	Dropship() {
		super(125);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Dropship";
	}
}

class Marine extends GroundUnit {
	Marine() {
		super(40);
		hitPoint = MAX_HP;
	}
}

class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}
	
	// repair 메서드의 매개변수로는 Repairable 인터페이스를 구현한 클래스의 인스턴스만이 가능.
	// -> Marine에서는 구현 안 해서 불가능한 것.
	void repair(Repairable r) {
		if (r instanceof Unit_) {	// 타입 체크 후.
			Unit_ u = (Unit_)r;		// 캐스팅 해줌. -> 왜냐하면 Repairable 타입으로는 할 수 있는 게 없음.
			while(u.hitPoint != u.MAX_HP) {	// hitPoint가 최대HP와 다르면 (= hitPoint가 감소한 것)
				u.hitPoint++;	// hitPoint가 최대HP와 같아질 때까지 증가시켜 줌.
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다.");
		}
	}
} 