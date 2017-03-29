package book_basic_panel;

import javax.swing.JPanel;
import javax.swing.JCheckBox;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.Rectangle;
import java.awt.Insets;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class OptionSearchPanel extends JPanel {

	protected JCheckBox chbTitle;
	protected JPanel panel;

	/**
	 * Create the panel.
	 */
	public OptionSearchPanel() {
		setLayout(new GridLayout(0, 2, 0, 10));
		
		chbTitle = new JCheckBox("title");
		chbTitle.setMargin(new Insets(2, 30, 2, 2));
		add(chbTitle);
		
		panel = new JPanel();
		add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));

	}
	
	public void setTitle(String title){
		chbTitle.setText(title);
	}

}
