package ��;


interface Speakable { // �������̽�
	public void speak(); // �Ű������� ���ϰ��� ���� �޼ҵ�
}

class Dog implements Speakable { // Speakable ����
	private int age;// �ʵ�: ����

	public int getAge() { // ���� getter
		return age;
	}

	public void setAge(int age) { // ���� setter
		this.age = age;
	}
	public void speak() { // �������̽� �޼ҵ� ����
		for(int i=0;i<age;i++) { // �ݺ���(i=0���� age������ �ݺ�)
			System.out.print("��"); // �� ���
		}
		System.out.println(); // �ٹٲٱ�
	}
	
}
class Person implements Speakable { // Speakable ����
	private String name; // �ʵ� : �̸�

	public String getName() { // �̸� getter
		return name;
	}

	public void setName(String name) { // �̸� setter
		this.name = name;
	}
	public void speak() { // �������̽� �޼ҵ� ����
		System.out.println("�ȳ��ϼ���."); // ���
	}
	
	
}
public class SpeakableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw9_1:�溸��");
		
		Speakable[] s=new Speakable[4];  // Speakable �迭 ũ�� 4�� ����
		s[0]=new Person(); // Person��ü 2�� �����ؼ� �迭�� ����
		s[1]=new Person();
		s[2]=new Dog(); // Dog��ü 2�� �����ؼ� �迭�� ����
		s[3]=new Dog();
		
		((Person)s[0]).setName("����"); // Ÿ��ĳ�������� �̸� �ʱ�ȭ
		((Person)s[1]).setName("�Ӹӷ�"); // �̸� �ʱ�ȭ
		((Dog)s[2]).setAge(4); // Ÿ�� ĳ�������� ���� �ʱ�ȭ
		((Dog)s[3]).setAge(14); // ���� �ʱ�ȭ
		
		for(int i=0;i<4;i++) { // �ݺ���(i=0���� 3���� �ݺ�)
			s[i].speak(); // speak�޼ҵ� ȣ��
			if(s[i] instanceof Person) // ���� s[i]�� PersonŸ���̸�
				System.out.println(((Person)s[i]).getName()+"�Դϴ�.\n"); // ���
			else // �� �� ����
				System.out.println(); // �ٹٲٱ�
			
		}
		
		
		
	}
}
