package framePractice;

import javax.swing.*;

public class panelPractice extends JFrame{
	public panelPractice() {
		setTitle("gui ���ʿ���");
		setLocation(250,250);
		
		JLabel label1=new JLabel("Label�� ������ �ؽ�Ʈ");
		JTextField field1=new JTextField(15);
		JLabel label2=new JLabel("�ι�° label");
		JTextField field2=new JTextField(15);
		
		
		JPanel panel1=new JPanel(); // �г� �����
		add(panel1); // ������ �ȿ� ���� ū �г� �ֱ�
		
		panel1.add(label1); // �гο� �ؽ�Ʈ�� �Է�â �ֱ�
		panel1.add(field1);
		panel1.add(label2);
		panel1.add(field2);
		
		
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		panelPractice f=new panelPractice();
		
		f.setSize(300,150);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
		/*JPanel panel2=new JPanel(); 
		panel1.add(panel2); // ���� ū �г� panel1�� ���� ������ panel2�����*/
		
		
	}

}
