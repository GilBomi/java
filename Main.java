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
		System.out.println("hw9_2: 길보미");

		Student kim = new Student();
		kim.age = 19;
		kim.score = 80;

		// 따로 클래스 정의하지말고 무명 클래스를 이용하기
		check(kim, new Tester() {
			public boolean test(Student s) {
				return s.score>=60;
			}
		});

		// 따로 클래스 정의하지말고 무명 클래스를 이용하기
		check(kim, new Tester() {
			public boolean test(Student s) {
				return s.age>=20;
			}
		});
	}
}
