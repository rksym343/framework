package panel;

import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;

import book_basic_panel.InputComp;

import java.awt.SystemColor;

public class ReturnManageContent extends JPanel {

	/**
	 * Create the panel.
	 */
	public ReturnManageContent() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));

		InputComp pBCode = new InputComp();
		pBCode.setTitle("도서코드");
		panel.add(pBCode);

		InputComp pBName = new InputComp();
		pBName.setTitle("도서명");
		panel.add(pBName);

		InputComp pAuthor = new InputComp();
		pAuthor.setTitle("저자");
		panel.add(pAuthor);

		InputComp pPublisher = new InputComp();
		pPublisher.setTitle("출판사");
		panel.add(pPublisher);

		InputComp pPrice = new InputComp();
		pPrice.setTitle("가격");
		panel.add(pPrice);

		InputComp pBLendCount = new InputComp();
		pBLendCount.setTitle("총대여횟수");
		panel.add(pBLendCount);

		JPanel panel_1 = new JPanel();
		add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));

		InputComp pMCode = new InputComp();
		pMCode.setTitle("회원코드");
		panel_1.add(pMCode);

		InputComp pMName = new InputComp();
		pMName.setTitle("성명");
		panel_1.add(pMName);

		InputComp pTel = new InputComp();
		pTel.setTitle("전화번호");
		panel_1.add(pTel);

		InputComp pLendDate = new InputComp();
		pLendDate.setTitle("대여일");
		panel_1.add(pLendDate);

		InputComp pReturnDate = new InputComp();
		pReturnDate.setTitle("반납일");
		panel_1.add(pReturnDate);

		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 10, 10));
		
		JButton btnReturn = new JButton("반납");
		panel_4.add(btnReturn);
	}

}
