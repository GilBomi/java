import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RockPaperScissor extends JFrame implements ActionListener{
	private int rock=1;
	private int paper=2;
	private int scissor=3;

	private TextField t1;
	private TextField t2;
	private JButton ROCK;
	private JButton PAPER;
	private JButton SCISSOR;
	
	// 버튼같은 경우 배열로 만들어서 하면 간단하나 이벤트를 발생시킬때 b[i]를 actionPerformed 메소드 안에 넣으면 오류가 난다.
	// 아마 i가 지역변수라서 그럴것같다. 따로 button을 따로 클래스로 빼서 i를 그 클래스의 멤버변수로 쓰는 방법이 있는데 아직 너무 어렵다..
	public RockPaperScissor() {
		setTitle("가위바위보");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		t1=new TextField();
		t2=new TextField();
		t1.setText("아래의 버튼 중에서 하나를 클릭하시오!");
		t1.setEnabled(false);
		
		ROCK=new JButton("ROCK");
		PAPER=new JButton("PAPER");
		SCISSOR=new JButton("SCISSOR");
		
		ROCK.addActionListener(this);
		PAPER.addActionListener(this);
		SCISSOR.addActionListener(this);
		
		// 프레임의 가로, 세로 길이 설정하려면 setPreferredSize로 하기
		ROCK.setPreferredSize(new Dimension(200,200)); 
		PAPER.setPreferredSize(new Dimension(200,200));
		SCISSOR.setPreferredSize(new Dimension(200,200));
		
		add(t1,BorderLayout.PAGE_START);
		add(ROCK,BorderLayout.LINE_START);
		add(PAPER,BorderLayout.CENTER);
		add(SCISSOR,BorderLayout.LINE_END);
		add(t2,BorderLayout.PAGE_END);
		
		pack();
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		int computer=(int)(Math.random()*3+1);
		if(e.getSource()==ROCK) {
			if(computer==rock) 
				t2.setText("컴퓨터:rock / 비겼습니다!");
			else if(computer==paper) 
				t2.setText("컴퓨터:paper / 졌습니다!");
			else 
				t2.setText("컴퓨터:scissor / 이겼습니다!");
		}
		else if(e.getSource()==PAPER) {
			if(computer==rock) 
				t2.setText("컴퓨터:rock / 이겼습니다!");
			else if(computer==paper) 
				t2.setText("컴퓨터:paper / 비겼습니다!");
			else 
				t2.setText("컴퓨터:scissor / 졌습니다!");
		}
		else {
			if(computer==rock) 
				t2.setText("컴퓨터:rock / 졌습니다");
			else if(computer==paper) 
				t2.setText("컴퓨터:paper / 이겼습니다!");
			else 
				t2.setText("컴퓨터:scissor /비겼습니다");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RockPaperScissor f=new RockPaperScissor();
	}

}
