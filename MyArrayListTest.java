//***************************
// 파일명: MyArrayListTest.java
// 작성자: 길보미
// 작성일: 9/6
// 설명:정수 리스트를 관리하는 MyArrayList 클래스를 작성하고 사용하는 프로그램을 다음과 같이 작성하시오.
//***************************
package lab1_6;

public class MyArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab1_6:길보미");
		
		MyArrayList list=new MyArrayList(); // MyArrayList 객체를 생성(list라고 하자)
		System.out.println("list="+list); // list를 출력
		
		list.add(2); // list에 2를 삽입
		list.add(-3); //  list에 -3을 삽입
		list.add(0); // list에 0을 삽입

		System.out.println("list="+list); // list를 출력
	}

}
