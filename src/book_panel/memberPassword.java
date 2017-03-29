package book_panel;

import javax.swing.JPanel;

import book_basic_panel.PasswordPanel;

import javax.swing.BoxLayout;
import java.awt.GridLayout;

public class memberPassword extends JPanel {

	private PasswordPanel pPw1;
	private PasswordPanel pPw2;

	/**
	 * Create the panel.
	 */
	public memberPassword() {
		setLayout(new GridLayout(0, 1, 0, 10));
		
		pPw1 = new PasswordPanel();
		pPw1.setTitle("비밀번호 입력");
		add(pPw1);
		
		pPw2 = new PasswordPanel();
		pPw2.setTitle("비밀번호 확인");
		add(pPw2);

	}
	
	public boolean isMatch(){
		if(String.valueOf(pPw1.getPwField().getPassword()).equals(String.valueOf(pPw2.getPwField().getPassword()))){
			return true;
		}
		return false;
	}

}
