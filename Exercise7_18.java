/**
 * 연습문제 7-18 풀이.
 * @author user EunSu Seo
 * last modified 2021-08-30
 */
class Robot { }

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 부릅니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}

public class Exercise7_18 {
	static void action(Robot r) {
		if (r instanceof DanceRobot) {
			DanceRobot dr = (DanceRobot)r;
			dr.dance();
		} else if (r instanceof SingRobot) {
			SingRobot sr = (SingRobot)r;
			sr.sing();
		} else if (r instanceof DrawRobot) {
			DrawRobot dr = (DrawRobot)r;
			dr.draw();
		} else return;
	}
	
	public static void main(String[] args) {
		Robot[] arr = {
				new DanceRobot(),
				new SingRobot(),
				new DrawRobot()
		};
		
		for (int i = 0; i < arr.length; i++) {
			action(arr[i]);
		}
	}
}
