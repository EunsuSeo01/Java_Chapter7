/**
 * package문 선언 예제.
 * @author user EunSu Seo
 * last modified 2021-08-13
 */
package com.javachobo;		// 패키지명은 소문자로 하는 것이 원칙.
// cmd에서 javac -d . PackageTest.java 를 해서 컴파일함.
// -d 옵션은 소스파일에 지정된 경로를 통해 패키지의 위치를 찾아서 클래스파일(.class)을 생성함.
// 만일 지정된 패키지와 일치하는 디렉토리가 없으면 새로 생성함.

public class PackageTest {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
