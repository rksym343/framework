package book_basic_panel;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class OptionSearchTF extends OptionSearchPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public OptionSearchTF() {
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		

	}
	


}
