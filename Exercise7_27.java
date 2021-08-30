/**
 * 연습문제 7-27 풀이.
 * @author user EunSu Seo
 * last modified 2021-08-30
 */
class Outer_Ex3 {
	int value = 10;
	
	class Inner_Ex3 {
		int value = 20;
		void method1() {
			int value = 30;
			
			System.out.println(value);
			System.out.println(this.value);
			System.out.println();
		}
	}
}
public class Exercise7_27 {
	public static void main(String[] args) {
		Outer_Ex3 outer = new Outer_Ex3();
		Outer_Ex3.Inner_Ex3 inner = outer.new Inner_Ex3(); 
		
		inner.method1();
	}
}
