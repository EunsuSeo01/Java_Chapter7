/**
 * 익명 클래스로 변환하는 예제(InnerEx8.java)를 보여주기 위한 예제.
 * @author user EunSu Seo
 * last modified 2021-08-25
 */
import java.awt.*;
import java.awt.event.*;

public class InnerEx7 {
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new EventHandler());
	}
}

// ActionListener 인터페이스를 구현한 EventHandler 클래스.
class EventHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occured!!!");
	}
}