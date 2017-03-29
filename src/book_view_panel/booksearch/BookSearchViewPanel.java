package book_view_panel.booksearch;

import javax.swing.JPanel;
import java.awt.GridLayout;
import book_panel.BookSearchPanel;
import book_view_panel.AbsViewPanel;

import javax.swing.JButton;

public class BookSearchViewPanel extends AbsViewPanel {

	/**
	 * Create the panel.
	 */
	public BookSearchViewPanel() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 775, 180);
		add(panel);
		panel.setLayout(null);
		
		BookSearchPanel panel_3 = new BookSearchPanel();
		panel_3.setBounds(0, 0, 560, 180);
		panel.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(572, 0, 202, 180);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JButton button = new JButton("검색");
		button.setBounds(54, 57, 100, 50);
		panel_4.add(button);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 190, 775, 410);
		add(panel_1);

	}

}
