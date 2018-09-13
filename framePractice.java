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
		setTitle("gui 기초연습");
		
		setLayout(new FlowLayout()); // 글자 크기 맞춰서 크기 조정됨
		JButton button=new JButton("버튼");
		add(button); 
		
		Toolkit kit=Toolkit.getDefaultToolkit(); // 로컬 경로 이미지를 얻기 위해
		Dimension screenSize=kit.getScreenSize(); //  모니터 화면의 면적 알아냄, 해상도(픽셀)로
		// Toolkit.getDefaultToolkit().getImage()와 같음
		// Tooklit 클래스를 이용해서 프레임의 디폴트 이미지를 특정 이미지 객체 생성한걸로 변화시키기
		Image img=kit.getImage("bt.jpg"); 
		setIconImage(img);
		
		setLocation(250,0); // 프레임이 처음에 뜨는 위치
		setResizable(false); // 사용자가 프레임 크기 조절 가능한지
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		framePractice f=new framePractice();
		
	}

}
