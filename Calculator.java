package swingPra;
import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame{
	private JPanel p;
	private JTextField t;
	private JButton b[][];
	private String[][] s= {
			{"Backspace","","","CE","C"},
			{"7","8","9","/","sqrt"},
			{"4","5","6","x","%"},
			{"1","2","3","-","1/x"},
			{"0","+/-",".","+","="}
	};

	public Calculator() {
		setTitle("Calculator");
		p=new JPanel();
		p.setLayout(new GridLayout(0,5,3,3)); // 격자 사이의 간격을 가로 3,세로 3으로 설정 
		t=new JTextField(20);
		t.setText("0."); // 실행하자마자 바로 써져있음
		t.setEnabled(false); // 입력이 가능한지 

		b=new JButton[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {	
				b[i][j]=new JButton(s[i][j]);
				b[i][j].setBackground(Color.yellow); // setBackground는 배경색 바꾸기
				if(j>=3) 
					b[i][j].setForeground(Color.red); // setForeground는 글자색 바꾸기
				else
					b[i][j].setForeground(Color.blue);
				p.add(b[i][j]);
			}
		}
		// 프레임 안에 텍스트필드와 버튼들이 들어있는 패널로 나누어져있음 
		add(t,BorderLayout.NORTH);
		add(p,BorderLayout.CENTER);

		pack(); // setSize대신 pack을 쓰면 컴포넌트들의 크기에 맞춰서 프레임 크기가 설정됨  
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator f=new Calculator();
	}

}
