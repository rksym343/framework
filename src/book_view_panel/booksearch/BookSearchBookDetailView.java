package book_view_panel.booksearch;

import javax.swing.JPanel;
import book_panel.PaymentIo;
import book_view_panel.InformDetailPanel;

public class BookSearchBookDetailView extends InformDetailPanel {

	/**
	 * Create the panel.
	 */
	public BookSearchBookDetailView() {
		
		PaymentIo panel = new PaymentIo();
		pContent.add(panel);
		
		setOption("- 도서정보 -", "폐기");
		
	}
}
