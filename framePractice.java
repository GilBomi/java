package framePractice;

import javax.swing.*;

import java.awt.Dimension;
import java.awt.Toolkit; 
import java.awt.Image;

import java.awt.FlowLayout;

public class framePractice extends JFrame {

	public framePractice() {
		setSize(500,1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("gui ���ʿ���");
		
		setLayout(new FlowLayout()); // ���� ũ�� ���缭 ũ�� ������
		JButton button=new JButton("��ư");
		add(button); 
		
		Toolkit kit=Toolkit.getDefaultToolkit(); // ���� ��� �̹����� ��� ����
		Dimension screenSize=kit.getScreenSize(); //  ����� ȭ���� ���� �˾Ƴ�, �ػ�(�ȼ�)��
		// Toolkit.getDefaultToolkit().getImage()�� ����
		// Tooklit Ŭ������ �̿��ؼ� �������� ����Ʈ �̹����� Ư�� �̹��� ��ü �����Ѱɷ� ��ȭ��Ű��
		Image img=kit.getImage("bt.jpg"); 
		setIconImage(img);
		
		setLocation(250,0); // �������� ó���� �ߴ� ��ġ
		setResizable(false); // ����ڰ� ������ ũ�� ���� ��������
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		framePractice f=new framePractice();
		
	}

}
