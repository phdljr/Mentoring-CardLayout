import java.awt.CardLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	private CardLayout cl = new CardLayout();
	
	public MainFrame() {
		setTitle("�г� ��ȯ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setLocationRelativeTo(null);
		setLayout(cl);
		
		add(new FirstPanel(cl));
		add(new SecondPanel(cl));
		
		setVisible(true);
	}
}
