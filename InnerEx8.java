/**
 * InnerEx7.java의 EventHandler 클래스를 익명 클래스로 변환하는 예제.
 * @author user EunSu Seo
 * last modified 2021-08-25
 */
import java.awt.*;
import java.awt.event.*;

public class InnerEx8 {
	public void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occured!!!");
			}
		}	// 익명 클래스의 끝.
		);
	}	// main의 끝.
}	// InnerEx8의 끝.
