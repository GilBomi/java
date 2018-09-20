package swingPra;
import javax.swing.*;
import java.awt.*;
public class flowLayoutPrac extends JFrame{
	public flowLayoutPrac() {
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("flowLayout");
		
		JPanel p=new JPanel();
		p.setLayout(new FlowLayout()); // FlowLayout으로 배치관리자 설정
		
		JButton[] b=new JButton[10];
		for(int i=0;i<10;i++) {
			// p.add(new JButton("Button"+i))도 가능
			b[i]=new JButton("Button"+i);
			p.add(b[i]);
		}
		add(p);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		flowLayoutPrac f=new flowLayoutPrac();
	}

}
