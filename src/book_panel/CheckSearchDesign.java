package book_panel;

import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.GridLayout;

public class CheckSearchDesign extends JPanel {

	public CheckSearchDesign() {
		setBounds(new Rectangle(0, 0, 775, 0));
		setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel = new JPanel();
		add(panel);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);

	}

}
