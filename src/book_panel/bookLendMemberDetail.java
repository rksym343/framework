package book_panel;

import javax.swing.JPanel;

import book_basic_panel.InputComp;

import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;

public class bookLendMemberDetail extends JPanel {

	protected JLabel lblMsg;

	/**
	 * Create the panel.
	 */
	public bookLendMemberDetail() {
		setLayout(new GridLayout(0, 1, 0, 10));
		
		InputComp pMCode = new InputComp();
		add(pMCode);
		pMCode.setTitle("회원코드");
		
		lblMsg = new JLabel();
		add(lblMsg);
		
		InputComp pMName = new InputComp();
		add(pMName);
		pMName.setTitle("성명");
		
		InputComp pMTel = new InputComp();
		add(pMTel);
		pMTel.setTitle("전화번호");
		
		

	}

}
