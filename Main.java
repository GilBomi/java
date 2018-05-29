/*
 * 작성자 : 길보미
 * 작성일 : 5.29
 * 작성내용 : 람다식
 */
package snippet;
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
	   System.out.println("hw9_3: 길보미");

	  Student kim = new Student();
	   kim.age = 19;
	   kim.score = 80;
/*
	  class PassTester implements Tester {
	    @Override
	    public boolean test(Student s) {
	     return s.score >= 60;
	    }
	   }

	  class AdultTester implements Tester {
	    @Override
	    public boolean test(Student s) {
	     return s.age >= 20;
	    }   
	   }
*/
	   // 위에 주석 처리한 것을 람다식으로 바꿔서 출력하기
	  check(kim, (s)->{return s.score>=60;});

	  check(kim,(s)->s.age>=20);
	  }
	 }
