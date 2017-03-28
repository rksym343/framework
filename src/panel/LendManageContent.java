package panel;

import javax.swing.JPanel;

import book_basic_panel.InputComp;

import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Dimension;

public class LendManageContent extends JPanel {

	/**
	 * Create the panel.
	 */
	public LendManageContent() {
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
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setFocusTraversalKeysEnabled(false);
		panel_1.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		JButton bLend = new JButton("대여");
		bLend.setPreferredSize(new Dimension(150, 40));
		panel_3.add(bLend);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		add(panel_5);
		panel_5.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_5.add(panel_6);
		panel_6.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JButton bSearch = new JButton("검색");
		bSearch.setPreferredSize(new Dimension(60, 40));
		panel_6.add(bSearch);
		
		JPanel panel_7 = new JPanel();
		panel_5.add(panel_7);
		
		JPanel panel_8 = new JPanel();
		panel_5.add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_5.add(panel_9);
		
		JPanel panel_10 = new JPanel();
		panel_5.add(panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_5.add(panel_11);

	}

}
