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
	
	JButton btnlogin = new JButton("�α���");
	JButton btnCancel = new JButton("���");
	
	JLabel lbResult = new JLabel("������", JLabel.LEFT);
	
	
	SwingLogin() {
		
		setLayout(new BorderLayout()); //frame �⺻��: Border
		
		//���� ���̾ƿ�
		ImageIcon img = new ImageIcon("img/robot.png");
		JLabel lbLogo = new JLabel(img);
		add(lbLogo, BorderLayout.NORTH);
		
		//���ͷ��̾ƿ�
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(0, 2));
		add(p, BorderLayout.CENTER);
		
		JLabel lbId = new JLabel ("���̵�", JLabel.CENTER);
		JLabel lbPwd = new JLabel ("��й�ȣ", JLabel.CENTER);
		
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
		
		setTitle("�α���");
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
				lbResult.setText("���̵� �Է��ϼ���");
			else if(strpwd.length() == 0)
				lbResult.setText("��й�ȣ�� �Է��ϼ���");
			else
				lbResult.setText(strid+"���� ��й�ȣ�� " + strpwd + "�Դϴ�.");
		}
		
		else if (e.getSource() == btnCancel) {
			lbResult.setText("����Ͽ����ϴ�.");
			tfId.setText("");
			tfPwd.setText("");
		}
	}
	
	

}
