package book_view_panel.membersearch;

import javax.swing.JButton;
import javax.swing.JPanel;

import kr.or.dgit.book_project.book_panel.AbsViewPanel;
import kr.or.dgit.book_project.book_panel.memberSearchPanel;

public class memberSearchViewPanelOld extends AbsViewPanel {

	/**
	 * Create the panel.
	 */
	public memberSearchViewPanelOld() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 775, 150);
		add(panel);
		panel.setLayout(null);
		
		memberSearchPanel panel_2 = new memberSearchPanel();
		panel_2.setBounds(0, 0, 560, 150);
		panel.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(572, 0, 202, 150);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnSearch = new JButton("검색");
		btnSearch.setBounds(50, 50, 100, 50);
		panel_3.add(btnSearch);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 160, 775, 440);
		add(panel_1);

	}
}
