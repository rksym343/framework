package kr.or.dgit.book_project.book_panel;

import java.awt.GridLayout;

import javax.swing.JPanel;

import kr.or.dgit.book_project.basic_panel.BookCodePanel;
import kr.or.dgit.book_project.basic_panel.ComboBoxPanel;
import kr.or.dgit.book_project.basic_panel.InputComp;
import kr.or.dgit.book_project.basic_panel.SpinnerPanel;

public class PaymentIoVer2 extends JPanel {

	public PaymentIoVer2() {
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
		
		ComboBoxPanel pPublisher = new ComboBoxPanel();
		pPublisher.setTitle("출  판  사");
		panelBSub.add(pPublisher);
		
		SpinnerPanel pPrice = new SpinnerPanel();
		pPrice.setTitle("가      격");
		panelBSub.add(pPrice);
		
	
		
		InputComp pBLendCount = new InputComp();
		pBLendCount.setTitle("총 대여 횟수");
		panelBSub.add(pBLendCount);

	}

}
