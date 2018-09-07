//***************************
// 파일명: MyArrayList.java
// 작성자: 길보미
// 작성일: 9/6
// 설명:정수 리스트를 관리하는 MyArrayList 클래스를 작성하고 사용하는 프로그램을 다음과 같이 작성하시오.
//***************************
package lab1_6;

import java.util.Arrays;

public class MyArrayList { // MyArrayList 클래스

	private int[] array; // 정수 배열
	private int number; //  배열에 저장된 항목수

	public MyArrayList() { //  매개변수가 없는 constuctor - 정수 배열 필드를 크기가 10인 배열로 초기화하고, 항목수 필드는 0으로 초기화
		array=new int[10];
		number=0;
	}
	public boolean add(int n) { // 원소 삽입 메소드(add) - 정수값을 매개변수로 받아 배열에 삽입
		if(number<10) {
			array[number]=n;
			number+=1;
			return true;
		}
		else
			return false;
	}
	@Override
	public String toString() { // toString 오버라이드 - 배열에 저장된 항목 전체를 문자열로 리턴
		String result="";
		for(int i=0;i<number;i++) {
			result+=array[i]+" ";
		}
		return result;
	}	
	
}
