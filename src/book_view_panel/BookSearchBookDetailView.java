package book_view_panel;

import javax.swing.JPanel;
import book_panel.PaymentIo;

public class BookSearchBookDetailView extends InformDetailPanel {

	/**
	 * Create the panel.
	 */
	public BookSearchBookDetailView() {
		
		PaymentIo panel = new PaymentIo();
		panel_2.add(panel);
		
		setOption("- 도서정보 -", "폐기");
		
	}
}
