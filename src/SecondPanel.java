import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SecondPanel extends JPanel{
	public SecondPanel(CardLayout cl) {
		setLayout(new FlowLayout());
		add(new JLabel("두 번째 페널"));
		setBackground(new Color(128,255,255));
		
		JButton btn = new JButton("패널 전환");
		btn.addActionListener((e)->{
			cl.next(getParent());
		});
		add(btn);
	}
}
