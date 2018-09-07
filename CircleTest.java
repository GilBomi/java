/*
 * 파일명 : CircleTest.java
 * 작성자 : 길보미
 * 작성일 : 9/5
 * 설명 : 반지름 속성을 갖는 Circle 클래스를 작성하고 사용하는 프로그램을 다음과 같이 작성하시오.
 */
package lab1_5;

class Circle {
	private int radius; // 반지름 필드
	
	public Circle() { // 매개변수가 없는 생성자(constuctor) - 반지름을 1로 초기화
		radius=1;
	}
	public Circle(int radius) { // 반지름을 매개변수로 받아 초기화 하는 생성자(consturctor)
		this.radius=radius;
	}
	public int getRadius() { // getter
		return radius;
	}
	public void setRadius(int radius) { // setter
		this.radius = radius;
	}
	public double area() { // 면적을 계산하여 리턴하는 메소드 
		return 3.14*radius*radius;
	}
	
	@Override
	public int hashCode() { // hashCode 오버라이드
		final int prime = 31;
		int result = 1;
		result = prime * result + radius;
		return result;
	}
	@Override
	public boolean equals(Object obj) { //  equals 오버라이드
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (radius != other.radius)
			return false;
		return true;
	}
	@Override
	public String toString() { // toString 오버라이드
		return "Circle [radius=" + radius + "]";
	}
	
	
}
public class CircleTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab1_5:길보미");
		Circle circle1=new Circle(); // 원 객체를 생성(circle1)
		circle1.setRadius(2); // circle1의 반지름을 2로 수정
		Circle circle2=new Circle((int)(Math.random()*4+1)); // 원 객체를 생성하되, 1~4 범위의 랜덤 정수값으로 반지름을 초기화하도록 생성(circle2)
		System.out.println(circle1.toString()); // circle1를 출력 - toString 호출
		System.out.println(circle2.toString()); // circle2를 출력 - toString 호출
		System.out.println(circle1.equals(circle2)); // circle1과 circle2가 동일한지를 알아보아 결과를 출력 - equals 호출
		System.out.println(circle1.hashCode()); // circle1의 hashCode를 출력 - hashCode 호출
		System.out.println(circle2.hashCode()); // circle2의 hashCode를 출력 - hashCode 호출
		System.out.println(circle1.area()); // circle1의 면적을 출력 - 면적계산 메소드 호출
		System.out.println(circle2.area()); // circle2의 면적을 출력 - 면적계산 메소드 호출
	}

}
