package swingPra;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventPra extends JFrame implements ActionListener{
	private JLabel label;
	private JButton b; 
	private TextField t;

	public EventPra() {
		label=new JLabel();
		t=new TextField();

		setSize(500,500);
		setTitle("ActionListener 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label.setLayout(new GridLayout(0,3)); // 격자모양

		for(int i=1;i<10;i++) {
			b=new JButton(); // 버튼 b를 배열로 해서 이벤트 발생할 순 없을까?
			b.setText(""+i);
			b.addActionListener(this);
			label.add(b);
		}
		add(t,BorderLayout.PAGE_START);
		add(label); // (label,BorderLayout.PAGE_END) 가 안되는건 위에서 그리드레이아웃으로 정의해서?
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		String s=e.getActionCommand(); // getAcionCommand는 입력된(이벤트 발생된)텍스트값 비교
		// e.getSourse는 변수 이름 비교 
		t.setText(t.getText()+s); 
		// 텍스트 필드 t에 텍스트 쓰기(t에 있는 텍스트 가져오고 거기에 입력된 텍스트 더하기)
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			EventPra f=new EventPra();
		}

	}
