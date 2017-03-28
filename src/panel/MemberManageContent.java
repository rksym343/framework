package panel;

import javax.swing.JButton;
import javax.swing.JPanel;

import book_basic_panel.InputComp;

import javax.swing.BoxLayout;

public class MemberManageContent extends JPanel {

	/**
	 * Create the panel.
	 */
	public MemberManageContent() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		InputComp pMCode = new InputComp();
		pMCode.setTitle("회원코드");
		add(pMCode);
		
		InputComp pMName = new InputComp();
		pMName.setTitle("성명");
		add(pMName);
		
		InputComp pTel = new InputComp();
		pTel.setTitle("전화번호");
		add(pTel);
		
		
		
		JPanel panel = new JPanel();
		add(panel);
		
		JButton bAdd = new JButton("추가");
		panel.add(bAdd);
		
		JButton bSave = new JButton("저장");
		panel.add(bSave);
		
		JButton bModify = new JButton("수정");
		panel.add(bModify);
		
		JButton bDel = new JButton("삭제");
		panel.add(bDel);

		JButton bExit = new JButton("닫기");
		panel.add(bExit);
		
	}

}
