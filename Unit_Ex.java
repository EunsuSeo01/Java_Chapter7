/**
 * 연습문제 7-17 풀이.
 * @author user EunSu Seo
 * last modified 2021-08-29
 */
public abstract class Unit_Ex {
	public int x, y;
	abstract void move(int x, int y);	// 추상 클래스로 선언. 왜? -> 상속받는 클래스에 따라 내용이 달라질 거라서.
	void stop() { /* 현재 위치에 정지 */ }
}

// Unit_Ex 클래스를 상속받은 자손 클래스는 Unit_Ex 클래스에 정의된 추상 클래스를 구현해줘야 함. 
class Marine_Ex extends Unit_Ex {
	void move(int x, int y) { /* Marine_Ex 클래스에 맞는 위치 이동을 한다. */ }
	void stimPack() { /* 스팀팩을 사용한다. */ }
}

class Tank_Ex extends Unit_Ex {
	void move(int x, int y) { /* Tank_Ex 클래스에 맞는 위치 이동을 한다. */ }
	void changeMode() { /* 공격모드를 변환한다. */ }
}

class Dropship_Ex extends Unit_Ex {
	void move(int x, int y) { /* Dropship_Ex 클래스에 맞는 위치 이동을 한다. */ }
	void load() { /* 선택된 대상을 태운다. */ }
	void unload() { /* 선택된 대상을 내린다. */ }
}