package book_basic_panel;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BookInfo1 extends JPanel {

	/**
	 * Create the panel.
	 */
	public BookInfo1() {
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new GridLayout(5, 3, 0, 0));
		
		JPanel p = new JPanel();
		panel.add(p);
		p.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btnNewPlus = new JButton("신규추가");
		p.add(btnNewPlus);
		
		JButton btnOldPlus = new JButton("기존추가");
		p.add(btnOldPlus);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btnPPlus = new JButton("추      가");
		panel_3.add(btnPPlus);

	}

}
