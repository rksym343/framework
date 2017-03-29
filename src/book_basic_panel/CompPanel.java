package book_basic_panel;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

@SuppressWarnings("serial")
public class CompPanel extends BasicPanel {
	
	protected JLabel lblTitle;
	protected JPanel pValue;

	public CompPanel() {
		
		lblTitle = new JLabel("New label");
		lblTitle.setHorizontalAlignment(SwingConstants.TRAILING);
		pTitle.add(lblTitle);
	

	}

	public void setTitle(String title) {
		lblTitle.setText(title);
	}
	
	
}
