package panel;

import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import erp_myframework.RadioButtonPanel;
import javax.swing.JTextField;

public class BookSearchContent extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public BookSearchContent() {
setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_4 = new JPanel();
		
		panel_3.add(panel_4);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("도서명");
		panel_4.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("도서코드");
		panel_4.add(rdbtnNewRadioButton);
		
		textField = new JTextField();
		panel_3.add(textField);
		textField.setColumns(10);
		
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
