/*
 * 작성자 : 길보미
 * 작성일 : 9/20
 * 작성파일 : MatrixTest.java
 * 내용  : 2차원 정수 배열로 표현된 행렬의 곱을 구하여 출력하는 프로그램을 작성하시오.
 */
package hw5_2;

public class MatrixTest {
	public static void main(String[] args) {
		System.out.println("hw5_2: 길보미 ");

		// 행렬 x, y의 곱을 구하여 출력
		int[][] x = {
				{4, 4, 4, 4, 4, 4},
				{4, 4, 4, 4, 4, 4},
				{4, 4, 4, 4, 4, 4},
				{4, 4, 4, 4, 4, 4},
				{4, 4, 4, 4, 4, 4},
				{4, 4, 4, 4, 4, 4}
		};

		int[][] y = {
				{2, 2, 2, 2, 2, 2},
				{2, 2, 2, 2, 2, 2},
				{2, 2, 2, 2, 2, 2},
				{2, 2, 2, 2, 2, 2},
				{2, 2, 2, 2, 2, 2},
				{2, 2, 2, 2, 2, 2}
		};

		int[][] z = MyMatrixService.multiply(x,  y);     
		MyMatrixService.print(z);
		System.out.println();

		// 행렬 a, b의 곱을 구하여 출력
		int[][] a = {
				{1, 1, 1},
				{2, 2, 2},
				{1, 2, 3},
				{4, 5, 6}
		};

		int[][] b = {
				{1, 1, 1, 1, -3},
				{1, 2, 3, 4, 5},
				{-2, 0, 6, 9, 12}
		};

		int[][] c = MyMatrixService.multiply(a,  b);  
		MyMatrixService.print(c);
	}
}

class MyMatrixService {
	// (1) 정적 메소드 multiply를 작성하시오.
	// 이차원 정수 배열로 표현된 두개의 행렬을 매개변수로 받아 곱을 구해 결과를 이차원 정수 배열로 표현하여 리턴
	// 매개변수로 받은 두 행렬은 곱을 구하기에 타당한 크기라고 가정해도 됨
	public static int[][] multiply(int[][] x,int[][] y) {
		int[][] temp=new int[x.length][y[0].length];
		for(int i=0;i<x.length;i++) { // 0부터 x의 행의 개수까지
			for(int j=0;j<y[0].length;j++) { // 0부터 y의 열의 개수까지
				for(int k=0;k<x[0].length;k++) { // 0부터 x의 열의 개수까지
					temp[i][j]+=x[i][k]*y[k][j]; // 곱하기
				}
			}
		}
		return temp;
	}

	// (2) 정적 메소드 print를 작성하시오.
	// 이차원 정수 배열로 표현된 하나의 행렬을 매개변수로 받아 한 줄에 한 행씩 출력
	public static void print(int[][] temp) {
		String s="";
		int k=0; // 한 행씩 한줄에 출력하기 위한 변수
		for(int i=0;i<temp.length;i++) {
			for(int j=0;j<temp[0].length;j++) { 
				s+=temp[i][j]+" "; // 문자열로 행렬값을 받음
				++k; // 행렬요소가 s에 저장되는 동시에 k의 값도 증가시킴
				if(k>0&&k%(temp[0].length)==0) // 행렬의 한 줄이 만족되면
					s+="\n"; // 다음줄로 넘기기 
			}
		}
		System.out.print(s);
	}

}
