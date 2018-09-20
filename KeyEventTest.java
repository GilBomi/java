package swingPra;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyEventTest extends JFrame implements KeyListener{
	private JPanel panel;
	private JTextField field;
	private JTextArea area;
	
	public KeyEventTest() {
		panel=new JPanel(new GridLayout(0,2));
		panel.add(new JLabel("문자를 입력하세요:"));
		field=new JTextField(10);
		panel.add(field);
		area=new JTextArea(3,30);
		add(panel,BorderLayout.NORTH);
		add(area,BorderLayout.CENTER);
	
		field.addKeyListener(this);
		setTitle("KeyEvent 연습");
		setSize(400,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyEventTest();
	}
	//밑에 세 Key~는 KeyListener 인터페이스의 필수 메소드. 안써도 정의해야됨
	public void keyTyped(KeyEvent e) { // 꾹 누르면 계속 나옴
		display(e,"Key Typed");
	}
	
	public void keyPressed(KeyEvent e) { // 꾹 누르면 계속 나옴
		display(e,"Key Pressed");
	}
	
	public void keyReleased(KeyEvent e) { // 꾹 눌렀으면 손을 뗐을때 한번 나옴
		display(e,"Key Released");
	}
	protected void display(KeyEvent e,String s) {
		char c=e.getKeyChar(); // 입력된 키보드 한 글자
		int keycode=e.getKeyCode(); // 유니코드 값
		String m="alt:"+e.isAltDown()+" ctrl:"+e.isControlDown()+" shift:"+e.isShiftDown();
		area.append(" "+s+"문자"+c+"(코드:"+keycode+")"+m+"\n");
		// 여기서 is~Down()은 ~키가 눌린건지 안눌린건지 boolean으로 판단해줌
	}

	
}
