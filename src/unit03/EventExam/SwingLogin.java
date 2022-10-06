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
	JButton btncancel = new JButton("���");
	
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
		btncancel.setBackground(Color.pink);
		
		p.add(lbId);
		p.add(tfId);
		p.add(lbPwd);
		p.add(tfPwd);
		p.add(btnlogin);
		p.add(btncancel);
		
		add(p, BorderLayout.CENTER);
		//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
		add(lbResult, BorderLayout.SOUTH);
		
		btnlogin.addActionListener(this);
		btncancel.addActionListener(this);
		
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
		if (e.getSource() == btnlogin) {
			String strId = tfId.getText();
			String strPwd = new String (tfPwd.getPassword());
			
			if(strId.length() == 0)
				lbResult.setText("���̵� �Է��ϼ���");
			else if(strPwd.length() == 0)
				lbResult.setText("��й�ȣ�� �Է��ϼ���");
			else
				lbResult.setText(strId+"���� ��й�ȣ�� " + strPwd + "�Դϴ�.");
		}
		else if (e.getSource() == btncancel) {
			lbResult.setText("����Ͽ����ϴ�.");
			tfId.setText("");
			tfPwd.setText("");
			
		}
	}
	
	

}
