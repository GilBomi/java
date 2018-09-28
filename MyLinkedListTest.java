/*
 * 파일 이름 : MyLinkedListTest.java
 * 내용 : 다음과 같이 내부적으로 단순 연결리스트를 사용하여 정수 리스트를 관리하는 MyLinkedList 클래스를 작성하고 사용하는 프로그램을 작성하시오.
 * 작성자 : 길보미
 * 작성일 : 9/28
 */
package hw6_1;

import java.util.Scanner;

public class MyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList list=new MyLinkedList(); //  MyLinkedList 객체를 생성(list라고 하자)
		Scanner input=new Scanner(System.in);
		int k=1;
		do { // 사용자에게 다음과 같은 메뉴를 반복하여 제공하되 7 입력시 반복 종료
			System.out.print("1:전체조회 2:길이조회 3:맨앞삽입 4:맨뒤삽입 5:맨앞삭제 6:맨뒤삭제 7:종료 : ");
			k=input.nextInt(); // k에 입력받기
			if(k<1 && k>7) // 다른 수 입력하면 다시 반복문 실행
				continue;
			else if(k==1) // 1 선택시, list의 전체 내용을 출력(toString 호출)
				System.out.println(list.toString());
			else if(k==2) // 2 선택시, list의 길이를 출력(size 호출)
				System.out.println("길이 :"+list.size());
			else if(k==3) { // 3 선택시, 사용자로부터 정수값을 입력받아 list 맨 앞에 삽입
				System.out.print("정수값 입력:");
				int n=input.nextInt();
				list.addFirst(n);
			}
			else if(k==4) { // 4 선택시, 사용자로부터 정수값을 입력받아 list 맨 뒤에 삽입
				System.out.print("정수값 입력:");
				int n=input.nextInt();
				list.addLast(n);
			}
			else if(k==5) // 5 선택시, list 맨 앞에서 정수값을 삭제하고 그 정수를 출력
				System.out.println(list.removeFirst());
			else if(k==6) // 6 선택시, list 맨 뒤에서 정수값을 삭제하고 그 정수를 출력
				System.out.println(list.removeLast());
			
		}while(k!=7);
	}

}
