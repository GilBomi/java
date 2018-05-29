/*
 * �ۼ��� : �溸��
 * �ۼ��� : 5.26
 * �ۼ����� : ���� Ŭ����
 */
package hw9_2;

class Student {
	int age;
	int score;
}

@FunctionalInterface
interface Tester {
	boolean test(Student s);
}

public class Main {
	public static void check(Student s, Tester t) {
		boolean result = t.test(s);
		System.out.println(result);
	}

	public static void main(String... args) {
		System.out.println("hw9_2: �溸��");

		Student kim = new Student();
		kim.age = 19;
		kim.score = 80;

		// ���� Ŭ���� ������������ ���� Ŭ������ �̿��ϱ�
		check(kim, new Tester() {
			public boolean test(Student s) {
				return s.score>=60;
			}
		});

		// ���� Ŭ���� ������������ ���� Ŭ������ �̿��ϱ�
		check(kim, new Tester() {
			public boolean test(Student s) {
				return s.age>=20;
			}
		});
	}
}
