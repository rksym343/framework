package book_panel;

import java.awt.GridLayout;

import javax.swing.JPanel;

import book_basic_panel.InputComp;

public class MemberInfo22 extends JPanel {

	/**
	 * Create the panel.
	 */
	public MemberInfo22() {
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panelM = new JPanel();
		add(panelM);
		panelM.setLayout(new GridLayout(5, 0, 10, 10));
		
		InputComp pMCode = new InputComp();
		pMCode.setTitle("회원코드");
		panelM.add(pMCode);
		
		InputComp pMName = new InputComp();
		pMName.setTitle("성      명");
		panelM.add(pMName);
		
		InputComp pMZipCode = new InputComp();
		pMZipCode.setTitle("우편번호");
		panelM.add(pMZipCode);
		
		InputComp pMTel = new InputComp();
		pMTel.setTitle("전화번호");
		panelM.add(pMTel);
		
		InputComp pMAddress = new InputComp();
		pMAddress.setTitle("주      소");
		panelM.add(pMAddress);

	}

}
