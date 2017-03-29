package book_panel;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.util.regex.Pattern;

import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class BookCodePanel extends CompPanel {
	protected JTextField tfBCode;
	protected JTextField tfBSubCode;

	/**
	 * Create the panel.
	 */
	public BookCodePanel() {
		setLayout(new GridLayout(0, 2, 10, 0));
		
		JPanel panel = new JPanel();
		pValue.add(panel);
		panel.setLayout(new GridLayout(0, 2, 2, 0));
		
		tfBCode = new JTextField();
		panel.add(tfBCode);
		tfBCode.setColumns(10);
		
		tfBSubCode = new JTextField();
		panel.add(tfBSubCode);
		tfBSubCode.setColumns(2);
		

		setTitle("도 서 코 드");

	}

	public String getTfBCode() {
		return tfBCode.getText();
	}

	public void setTfBCode(String bCode) {
		tfBCode.setText(bCode);
	}
	public String getTfBSubCode() {
		return tfBSubCode.getText();
	}

	public void setTfBSubCode(int bSubCode) {
		tfBSubCode.setText(bSubCode+"");
	}

	
	public boolean isEmpty(){
		if (getTfBCode().equals("") || getTfBSubCode().equals("")) {
			return true;
		}
		return false;
	}

	public void isEmptyCheck() throws Exception {
		if (getTfBCode().equals("") || getTfBSubCode().equals("")) {
			throw new Exception("공백 존재");
		}
	}

	public void isValidCheck() throws Exception {
		if (!Pattern.matches("[A-Z]{1}[0-9]{3}", getTfBCode())) {
			throw new Exception("도서코드 형식 오류");
		}
		if (!Pattern.matches("[0-9]{2}", getTfBSubCode())) {
			throw new Exception("도서중복코드 형식 오류");
		}
		
	}
	
	

}