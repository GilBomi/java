/*
 * �ۼ��� : �溸��
 * �ۼ��� : 5.29
 * �ۼ����� : ��Ű�� 
 */
package test;
import mic.MicSystem;

//Singer �������̽��� �׽�Ʈ�ϴ� Ŭ����
public class SingerTest {
	public static void main(String[] args) {
		System.out.println("lab9_2: �溸��\n");

		// ����ũ �ý��� ��ü�� ����
		MicSystem mic = new MicSystem();

		// Person ��ü�� �����Ͽ� ����ũ �׽�Ʈ �Ű������� ����
		mic.micTest(new Person());
	}
}