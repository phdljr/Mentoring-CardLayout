import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FirstPanel extends JPanel{
	public FirstPanel(CardLayout cl) {
		setLayout(new FlowLayout());
		add(new JLabel("ù ��° ���"));
		setBackground(new Color(128,128,255));
		
		JButton btn = new JButton("�г� ��ȯ");
		btn.addActionListener((e)->{
			cl.show(getParent(), "first");
		});
		add(btn);
	}
}
