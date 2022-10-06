package unit03.EventExam;

import javax.swing.*;

public class LabelButtonEx extends JFrame{

	LabelButtonEx() {
	
		JPanel p = new JPanel();
		add(p); 
		
		// 글자리별 작성
		JLabel lb = new JLabel("제이스 고슬링입니다");
		p.add(lb);
		
		//이미지 라벨 작성 
		ImageIcon img = new ImageIcon("img/gosling.jpg");
		JLabel lbImage = new JLabel(img);
		p.add(lbImage); 
		
		//이미지 버튼
		ImageIcon normalIcon = new ImageIcon("img/normalIcon.gif");
		ImageIcon pressedIcon = new ImageIcon("img/pressedIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon("img/pressedIcon.gif");
		
		JButton btn = new JButton("call~", normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		p.add(btn);
		
		//프레임 기본 설정
		setTitle("라벨과 버튼 예제");
		setSize(300, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
	 	new LabelButtonEx();

	}

}
