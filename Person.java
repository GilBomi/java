package test;
import mic.Singer;

//Singer를 구현한 Person 클래스
public class Person implements Singer {
	public void sing() {
		System.out.println("도레미파솔라시도");
	}
}// Singer 인터페이스를 테스트하는 클래스

