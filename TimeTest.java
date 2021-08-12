/**
 * 접근 제어자와 getter, setter를 이용한 캡슐화 예제.
 * @author user EunSu Seo
 * last modified 2021-08-13
 */
public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time(12, 35, 30);
		System.out.println(t);
		
		// t.hour = 13;		ERROR! hour는 접근 제어자가 private라서 다른 클래스에서는 접근 불가능.
		t.setHour(t.getHour() + 1);		// 현재 시간(getter로 알아냄)보다 1시간 후로 변경(setter로).
		System.out.println(t);			// t.toString()이 호출.
	}
}

class Time {
	private int hour, minute, second;	// 접근 제어자 private 사용 -> 같은 클래스 내에서만 접근 가능.
	
	// 생성자.
	Time(int hour, int minute, int second) {
		// 생성자 내에서 setter를 이용해 인스턴스 변수를 초기화! -> 유효성 검사도 됨.
		setHour(hour);
		setMinute(minute);
		setSecond(second);		
	}
	
	public int getHour() { return hour; }
	public void setHour(int hour) {
		if (hour < 0 || hour > 23) return;	// 매개변수의 유효성 검사.
		this.hour = hour;	// if문에 해당되지 않은 케이스들만 이 줄에 도달 가능.
	}
	
	public int getMinute() { return minute; }
	public void setMinute(int minute) {
		if (minute < 0 || minute > 59) return;
		this.minute = minute;	// 인스턴스 변수 = 매개변수(지역변수);
	}
	
	public int getSecond() { return second; }
	public void setSecond(int second) {
		if (second < 0 || second > 59) return;
		this.second = second;
	}
	
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
}
