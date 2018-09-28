package hw6_1;

public class MyLinkedList {
	private class Node { // 단순 연결리스트의 노드를 표현하는 노드 클래스
		int data;
		Node link;
		
		Node(int data) {
			this.data=data;
		}
	}
	private Node head=null; // 리스트의 첫번째 노드를 가리킬 변수(head) - null로 초기화 됨
	
	public void addFirst(int a) {
		Node t=new Node(a);
		t.link=head;
		head=t;
	}
	public String toString() { // toString 오버라이드 - 리스트에 저장된 항목 전체를 문자열로 리턴
		String s="list=";
		Node t=head;
		while(t!=null) {
			s+=t.data+" ";
			t=t.link;
		}
		return s;
	}
	public int size() { // size - 리스트의 길이를 리턴
		Node t=head;
		int num=0;
		while(t!=null) {
			num+=1;
			t=t.link;
		}
		return num;
	}
	public void addLast(int a) { //  addLast - 정수값을 매개변수로 받아 리스트의 마지막에 삽입     
		Node t=new Node(a);
		Node k=head;
		while(k.link!=null) {
			k=k.link;
		}
		k.link=t;
	}
	public int removeFirst() { //  removeFirst - 리스트의 가장 앞 원소(정수값)을 삭제하여 리턴  
		int temp=head.data;
		head=head.link;
		return temp;
	}
	public int removeLast() { //  removeLast - 리스트의 마지막 원소(정수값)을 삭제하여 리턴  
		Node t=head;
		while(t.link.link!=null) {
			t=t.link;
		}
		int temp=t.link.data;
		t.link=null;
		return temp;
	}

}
