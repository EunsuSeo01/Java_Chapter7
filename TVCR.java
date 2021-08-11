/**
 * '단일상속'만 가능한 자바의 특성을 고려하여 상속관계에 더해 포함관계까지 이용한 예제.
 * @author user EunSu Seo
 * last modified 2021-08-11
 */
class Tv2 {
	boolean power;	// 전원상태(on/off).
	int channel;	// 채널.
	
	void power() { power = !power; }
	void channelUp() { channel++; }
	void channelDown() { channel--; }
}

class VCR {
	boolean power;
	int counter = 0;
	
	void power() { power = !power; }
	void play() { }
	void stop() { }
	void rew() { }
	void ff() { }
}

public class TVCR extends Tv2 {
	VCR vcr = new VCR();	// VCR 클래스를 포함시켜서 사용한다.
	int counter = vcr.counter;		// VCR 클래스의 counter 변수를 사용한다.
	
	// VCR 클래스의 메서드들을 사용한다.
	// -> 이렇게 함으로써 외부적으로는 TVCR클래스의 인스턴스를 사용하는 것처럼 보이지만,
	// 내부적으로는 VCR클래스의 인스턴스를 생성해서 사용하는 것이다. (counter 변수도 마찬가지)
	void play() {
		vcr.play();
	}
	
	void stop() {
		vcr.stop();
	}
	
	void rew() {
		vcr.rew();
	}
	
	void ff() {
		vcr.ff();
	}
}
