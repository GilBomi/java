/*
 * 파일명 : Average.java
 * 작성자 : 길보미
 * 작성일 : 8/31
 * 설명 : 사용자가 원하는 갯수의 정수값을 입력받아 이 정수값들의 평균을 구하는 프로그램을 다음과 같이 작성하시오.
 */
package lab1_4;
import java.util.Scanner;
public class Average {
	
	// 정수 배열 원소의 평균을 구하는 메소드(매개변수 : 정수배열)
	public static double getAverage(int[] array) {
		int n=array.length; // 배열 길이 저장
		int sum=0; // 합 변수 0으로 정의
		for(int i=0;i<n;i++) { // 0~n까지 반복
			sum+=array[i]; // 합하기
		}
		return (double)sum/n; // 평균값 반환
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab1_4:길보미\n");
		Scanner input=new Scanner(System.in);
		
		System.out.print("정수 개수 입력:");
		int n=input.nextInt(); // n에 정수갯수 입력받기
		int[] array=new int[n]; // 크기 n 배열 선언
		
		System.out.print(n+"개의 정수 입력:");
		for(int i=0;i<n;i++) // 0~n까지 반복
			array[i]=input.nextInt(); // 배열의 값 입력받기
		System.out.println("평균 ="+getAverage(array));
	}

}
