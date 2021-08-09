/**
 * 클래스 간의 상속관계를 보여주는 예제.
 * @author user EunSu Seo
 * last modified 2021-08-10
 */
class Tv {
	boolean power;	// 전원상태. (on/ofF)
	int channel;	// 채널.
	
	void power() { power = !power; }
	void channelUp() { channel++; }
	void channelDown() { channel--; }
}

// Parent class: Tv, Child class: CaptionTv.
class CaptionTv extends Tv {
	boolean caption;	// 캡션상태. (on/off)
	void displayCaption(String text) {
		if (caption)	// 캡션상태가 on(true)일 때만 text를 보여준다.
			System.out.println(text);
	}
}

public class CaptionTvTest {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;	// Tv클래스로부터 상속받은 멤버 변수 channel.
		ctv.channelUp();	// 상속받은 멤버 메서드 channelUp().
		System.out.println(ctv.channel);
		
		ctv.displayCaption("Hello, World");
		ctv.caption = true;		// 캡션(자막) 기능을 켠다.
		ctv.displayCaption("Hello, World");
	}
}
