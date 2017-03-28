package book_view_panel;

import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import book_panel.PaymentIo;
import book_panel.bookLendMemberDetail;
import book_panel.bookLendMemberDetailDate;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class BookReturnPanel extends AbsViewPanel {

	/**
	 * Create the panel.
	 */
	public BookReturnPanel() {
		GridLayout gridLayout = (GridLayout) getLayout();
		gridLayout.setVgap(10);
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		PaymentIo panel_3 = new PaymentIo();
		panel.add(panel_3);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[] {380, 10};
		gbl_panel_5.rowHeights = new int[]{250, 50, 0};
		gbl_panel_5.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_5.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_5.setLayout(gbl_panel_5);
		
		bookLendMemberDetailDate panel_4 = new bookLendMemberDetailDate();
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.insets = new Insets(0, 0, 5, 0);
		gbc_panel_4.gridx = 0;
		gbc_panel_4.gridy = 0;
		panel_5.add(panel_4, gbc_panel_4);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 1;
		panel_5.add(panel_2, gbc_panel_2);
		panel_2.setLayout(null);
		
		JButton btnLend = new JButton("반납");
		btnLend.setBounds(146, 5, 100, 35);
		panel_2.add(btnLend);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
	}

}
