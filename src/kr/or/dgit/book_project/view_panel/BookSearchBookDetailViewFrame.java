package kr.or.dgit.book_project.view_panel;

import javax.swing.JPanel;

import kr.or.dgit.book_project.book_panel.InformDetailPanel;
import kr.or.dgit.book_project.book_panel.PaymentIo;

public class BookSearchBookDetailViewFrame extends InformDetailPanel {

	/**
	 * Create the panel.
	 */
	public BookSearchBookDetailViewFrame() {
		
		PaymentIo panel = new PaymentIo();
		pContent.add(panel);
		
		setOption("- 도서정보 -", "폐기");
		
	}
}
