package unit03.EventExam;

import javax.swing.*;

public class LabelButtonEx extends JFrame{

	LabelButtonEx() {
	
		JPanel p = new JPanel();
		add(p); 
		
		// ���ڸ��� �ۼ�
		JLabel lb = new JLabel("���̽� �����Դϴ�");
		p.add(lb);
		
		//�̹��� �� �ۼ� 
		ImageIcon img = new ImageIcon("img/gosling.jpg");
		JLabel lbImage = new JLabel(img);
		p.add(lbImage); 
		
		//�̹��� ��ư
		ImageIcon normalIcon = new ImageIcon("img/normalIcon.gif");
		ImageIcon pressedIcon = new ImageIcon("img/pressedIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon("img/pressedIcon.gif");
		
		JButton btn = new JButton("call~", normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		p.add(btn);
		
		//������ �⺻ ����
		setTitle("�󺧰� ��ư ����");
		setSize(300, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
	 	new LabelButtonEx();

	}

}
