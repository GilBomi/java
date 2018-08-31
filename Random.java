/*
 * 파일명 : Random.java
 * 작성자 : 길보미
 * 작성일 : 8/31
 * 설명 : 1~4 범위의 랜덤 넘버 10개를 생성하여 각 넘버가 몇개씩 생성되었는가를 세는 프로그램을 작성하시오.
 */
package lab1_3;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab1_3:길보미\n");
		int[] array=new int[10]; // 랜덤 넘버 10개 저장할 배열
		int[] num=new int[4]; // 각 넘버가 몇개씩 생성되었는지 확인할 배열
		
		System.out.print("랜덤 넘버 =");
		for(int i=0;i<10;i++) { // 10번 반복
			array[i]=(int)(Math.random()*4+1); // array[i]에 1~4정수 랜덤 저장
			System.out.print(array[i]+" "); // 랜덤 수 출력
			num[array[i]-1]+=1; // 생성된 넘버 수 카운트
		}
		System.out.println();
		
		for(int j=1;j<5;j++) // 4번 반복
			System.out.println(j+"의 갯수="+num[j-1]); // 갯수 출력
	}
}
