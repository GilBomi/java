package 깃;


interface Speakable { // 인터페이스
	public void speak(); // 매개변수와 리턴값이 없는 메소드
}

class Dog implements Speakable { // Speakable 구현
	private int age;// 필드: 나이

	public int getAge() { // 나이 getter
		return age;
	}

	public void setAge(int age) { // 나이 setter
		this.age = age;
	}
	public void speak() { // 인터페이스 메소드 정의
		for(int i=0;i<age;i++) { // 반복문(i=0부터 age전까지 반복)
			System.out.print("멍"); // 멍 출력
		}
		System.out.println(); // 줄바꾸기
	}
	
}
class Person implements Speakable { // Speakable 구현
	private String name; // 필드 : 이름

	public String getName() { // 이름 getter
		return name;
	}

	public void setName(String name) { // 이름 setter
		this.name = name;
	}
	public void speak() { // 인터페이스 메소드 정의
		System.out.println("안녕하세요."); // 출력
	}
	
	
}
public class SpeakableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw9_1:길보미");
		
		Speakable[] s=new Speakable[4];  // Speakable 배열 크기 4로 정의
		s[0]=new Person(); // Person객체 2개 생성해서 배열에 저장
		s[1]=new Person();
		s[2]=new Dog(); // Dog객체 2개 생성해서 배열에 저장
		s[3]=new Dog();
		
		((Person)s[0]).setName("마루"); // 타입캐스팅으로 이름 초기화
		((Person)s[1]).setName("머머루"); // 이름 초기화
		((Dog)s[2]).setAge(4); // 타입 캐스팅으로 나이 초기화
		((Dog)s[3]).setAge(14); // 나이 초기화
		
		for(int i=0;i<4;i++) { // 반복문(i=0부터 3까지 반복)
			s[i].speak(); // speak메소드 호출
			if(s[i] instanceof Person) // 만약 s[i]가 Person타입이면
				System.out.println(((Person)s[i]).getName()+"입니다.\n"); // 출력
			else // 그 외 경우면
				System.out.println(); // 줄바꾸기
			
		}
		
		
		
	}
}
