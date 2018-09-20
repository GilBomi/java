//***************************
// 파일명: MyArrayList.java
// 작성자: 길보미
// 작성일: 9/16
// 설명:정수 리스트를 관리하는 MyArrayList 클래스를 작성하고 사용하는 프로그램을 작성하시오.
//***************************
package hw5_1;

import java.util.Arrays;
public class MyArrayList {

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
		else {
			return false;
		}
			
	}
	@Override
	public String toString() { // ** 옵션4: toString() 에서 String 대신 StringBuffer를 이용하여 구현해 볼 것
		StringBuffer result=new StringBuffer();
		for(int i=0;i<number;i++) {
			result.append(array[i]+" ");
		}
		return result.substring(0);
	}	
	public int get(int index) { //  get - 인덱스를 매개변수로 받아 배열의 해당 정수값을 리턴    O(1)
		//** 옵션1: 인덱스가 범위를 벗어났을 때 IndexOutOfBoundsException 예외 발생하도록 해 볼 것
		if(index>number-1) 
			throw new IndexOutOfBoundsException();
		else 
			return array[index];
	}
	public int size() { //  size - 리스트의 길이를 리턴(배열 크기가 아님)    O(1)
		return number; 
	}
	public void add(int index,int input) { //  add - 인덱스와 정수값을 매개변수로 받아 배열의 해당 위치에 정수값을 삽입     O(n)
		if(index>number) // 옵션 : 예외발생
			throw new IndexOutOfBoundsException();
		int[] temp;
		if(number<10) 
			temp=new int[++number];
		else 
			temp=new int[number];
		for(int i=0;i<number;i++) {
			if(i<index)
				temp[i]=array[i];
			else if(i==index)
				temp[i]=input;
			else {
				temp[i]=array[i-1];
			}
		}
		for(int i=0;i<temp.length;i++) {
			array[i]=temp[i];
		}
	}

	public int remove(int index) { //  remove - 인덱스를 매개변수로 받아 배열의 해당 위치 정수값을 삭제하고 그 값을 리턴   O(n)
		if(index>number-1) // 옵션 : 예외발생ㄴ
			throw new IndexOutOfBoundsException();
		int[] temp=new int[number-1];
		int value=array[index];
		for(int i=0;i<number;i++) {
			if(i<index)
				temp[i]=array[i];
			else if(i>index) {
				temp[i-1]=array[i];
			}
		}
		--number;
		for(int i=0;i<temp.length;i++) {
			array[i]=temp[i];
		}
		return value;
	}

}