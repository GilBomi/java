package framePractice;

import javax.swing.*;
public class pizzaDelivery extends JFrame{
	public pizzaDelivery() {
		setSize(600,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("���� �ֹ�");
		
		JPanel panel=new JPanel();
		add(panel);
		JPanel panel1=new JPanel();
		panel.add(panel1); // ���� ū �г� panel �ȿ� panel1 �ֱ� 
		JPanel panel2=new JPanel(); 
		panel.add(panel2); // ���� ū �г� panel �ȿ� panel1 �ֱ� 
		
		JLabel label1=new JLabel("�ڹ� ���ڿ� ���� ���� ȯ���մϴ�. ������ ������ �����Ͻÿ�.");
		JButton button1=new JButton("�޺�����");
		JButton button2=new JButton("������������");
		JButton button3=new JButton("�Ұ������");
		JLabel label2=new JLabel("����");
		JTextField field=new JTextField(20);
		panel1.add(label1);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(label2);
		panel2.add(field);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pizzaDelivery p=new pizzaDelivery();
	}

}
