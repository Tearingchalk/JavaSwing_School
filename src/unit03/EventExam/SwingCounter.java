package unit03.EventExam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingCounter extends JFrame implements ActionListener{
	//레이아웃 구성
	JLabel lb = new JLabel("카운터값");
	JTextField tf = new JTextField("0", 5); //길이는 5 초기값은 0
	JButton btnInc = new JButton("증가");
	JButton btnDec = new JButton("감소");
	JButton btnCls = new JButton("초기화");
	//레이아웃
	SwingCounter() {
		
		//패널구성
		JPanel p = new JPanel();
		add(p);

		//레이아웃 설정
		p.add(lb);
		p.add(tf);
		p.add(btnInc); 
		p.add(btnDec);
		p.add(btnCls);
		  
		//이벤트 리스너 달기
		btnInc.addActionListener(this);
		btnDec.addActionListener(this);
		btnCls.addActionListener(this);	
		
		//기본설정
		setTitle("간단카운터");
		setSize(400, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingCounter();
	}
 
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnInc) {
			String str = tf.getText().trim();
			int cnt = Integer.parseInt(str) + 1;
			tf.setText(cnt+"");
			
		}
		else if(e.getSource() == btnDec) {
			String str = tf.getText().trim();
			int cnt = Integer.parseInt(str) - 1;
			tf.setText(cnt+"");
		}
		
		else if (e.getSource() == btnCls) {
			tf.setText("0");
		}
		
	}
	
	

}
