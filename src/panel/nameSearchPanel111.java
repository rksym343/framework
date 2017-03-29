package panel;

import javax.swing.JPanel;

import book_basic_panel.InputComp;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.GridLayout;

public class nameSearchPanel111 extends JPanel {

	/**
	 * Create the panel.
	 */
	public nameSearchPanel111() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		InputComp pName = new InputComp();
		panel.add(pName);
		pName.setTitle("성명");
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btnSearch = new JButton("검색");
		panel_1.add(btnSearch);
		
		JButton btnExit = new JButton("닫기");
		panel_1.add(btnExit);
		
		JPanel panel_2 = new JPanel();
		add(panel_2);

	}

}
