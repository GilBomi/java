package framePractice;

import javax.swing.*;
public class pizzaDelivery extends JFrame{
	public pizzaDelivery() {
		setSize(600,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("피자 주문");
		
		JPanel panel=new JPanel();
		add(panel);
		JPanel panel1=new JPanel();
		panel.add(panel1); // 제일 큰 패널 panel 안에 panel1 넣기 
		JPanel panel2=new JPanel(); 
		panel.add(panel2); // 제일 큰 패널 panel 안에 panel1 넣기 
		
		JLabel label1=new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오.");
		JButton button1=new JButton("콤보피자");
		JButton button2=new JButton("포테이토피자");
		JButton button3=new JButton("불고기피자");
		JLabel label2=new JLabel("개수");
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
