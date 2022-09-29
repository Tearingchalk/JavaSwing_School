package unit03.EventExam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingLogin extends JFrame implements ActionListener{
	
	JTextField tfId = new JTextField();
	JPasswordField tfPwd = new JPasswordField();
	
	JButton btnlogin = new JButton("로그인");
	JButton btnCancel = new JButton("취소");
	
	JLabel lbResult = new JLabel("결과출력", JLabel.LEFT);
	
	
	SwingLogin() {
		
		setLayout(new BorderLayout()); //frame 기본값: Border
		
		//북쪽 레이아웃
		ImageIcon img = new ImageIcon("img/robot.png");
		JLabel lbLogo = new JLabel(img);
		add(lbLogo, BorderLayout.NORTH);
		
		//센터레이아웃
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(0, 2));
		add(p, BorderLayout.CENTER);
		
		JLabel lbId = new JLabel ("아이디", JLabel.CENTER);
		JLabel lbPwd = new JLabel ("비밀번호", JLabel.CENTER);
		
		btnlogin.setBackground(Color.yellow);
		btnCancel.setBackground(Color.pink);
		
		p.add(lbId);
		p.add(tfId);
		p.add(lbPwd);
		p.add(tfPwd);
		p.add(btnlogin);
		p.add(btnCancel);
		
		add(p, BorderLayout.CENTER);
		
		add(lbResult, BorderLayout.SOUTH);
		
		btnlogin.addActionListener(this);
		btnCancel.addActionListener(this);
		
		setTitle("로그인");
		setSize(300, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new SwingLogin();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == btnlogin) { 
			String strid = tfId.getText();
			String strpwd = new String(tfPwd.getPassword());
			
			if(strid.length() == 0)
				lbResult.setText("아이디를 입력하세요");
			else if(strpwd.length() == 0)
				lbResult.setText("비밀번호를 입력하세요");
			else
				lbResult.setText(strid+"님의 비밀번호는 " + strpwd + "입니다.");
		}
		
		else if (e.getSource() == btnCancel) {
			lbResult.setText("취소하였습니다.");
			tfId.setText("");
			tfPwd.setText("");
		}
	}
	
	

}
