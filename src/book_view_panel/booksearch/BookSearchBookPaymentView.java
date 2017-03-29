package book_view_panel.booksearch;

import javax.swing.JPanel;

import book_view_panel.PaymentDataDetail;

import javax.swing.JLabel;
import java.awt.GridLayout;

public class BookSearchBookPaymentView extends PaymentDataDetail {

	public BookSearchBookPaymentView() {
		lblTitle.setText("- 도서대여정보 -");
		
		JPanel pTable = new JPanel(); // 해당 도서의 대여기록들
		pResult.add(pTable);
		
		JPanel pSum = new JPanel(); // 총 합께?
		pResult.add(pSum);
		pSum.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel label = new JLabel("총 대여횟수 : XX회");
		pSum.add(label);

	}

}
