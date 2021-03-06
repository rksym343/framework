package book_panel;

import java.awt.GridLayout;

import javax.swing.JPanel;

import book_basic_panel.InputComp;
import book_basic_panel.BookCodePanel;

public class PaymentIo extends JPanel {

	/**
	 * Create the panel.
	 */
	public PaymentIo() {
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panelBSub = new JPanel();
		add(panelBSub);
		panelBSub.setLayout(new GridLayout(6, 0, 0, 10));
		
		BookCodePanel pBCode = new BookCodePanel();
		panelBSub.add(pBCode);
		
		InputComp pBName = new InputComp();
		pBName.setTitle("도  서  명");
		panelBSub.add(pBName);
		
		InputComp pAuthor = new InputComp();
		pAuthor.setTitle("저      자");
		panelBSub.add(pAuthor);
		
		InputComp pPName = new InputComp();
		pPName.setTitle("출  판  사");
		panelBSub.add(pPName);
		
		InputComp pPrice = new InputComp();
		pPrice.setTitle("가      격");
		panelBSub.add(pPrice);
		
		InputComp pBLendCount = new InputComp();
		pBLendCount.setTitle("총 대여 횟수");
		panelBSub.add(pBLendCount);

	}

}
