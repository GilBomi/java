package framePractice;

import javax.swing.*;

public class panelPractice extends JFrame{
	public panelPractice() {
		setTitle("gui 기초연습");
		setLocation(250,250);
		
		JLabel label1=new JLabel("Label은 고정된 텍스트");
		JTextField field1=new JTextField(15);
		JLabel label2=new JLabel("두번째 label");
		JTextField field2=new JTextField(15);
		
		
		JPanel panel1=new JPanel(); // 패널 만들기
		add(panel1); // 프레임 안에 가장 큰 패널 넣기
		
		panel1.add(label1); // 패널에 텍스트와 입력창 넣기
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
		panel1.add(panel2); // 가장 큰 패널 panel1에 작은 영역의 panel2만들기*/
		
		
	}

}
