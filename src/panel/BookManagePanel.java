package panel;

import javax.swing.JPanel;

import book_basic_panel.InputComp;
import kr.or.dgit.book_project.dto.Book;

import java.awt.Component;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class BookManagePanel extends AbsContent<Book> {

	private InputComp pBCode;
	private InputComp pBName;
	private InputComp pAuthor;
	private InputComp pPublisher;
	private InputComp pPrice;

	public BookManagePanel() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		pBCode = new InputComp();
		pBCode.setTitle("도서코드");
		add(pBCode);

		pBName = new InputComp();
		pBName.setTitle("도서명");
		add(pBName);

		pAuthor = new InputComp();
		pAuthor.setTitle("저자");
		add(pAuthor);

		pPublisher = new InputComp();
		pPublisher.setTitle("출판사");
		add(pPublisher);

		pPrice = new InputComp();
		pPrice.setTitle("가격");
		
		add(pPrice);

	}

	@Override
	public boolean isValidCheck() {

		try {
			pBCode.isEmptyCheck();
			pBName.isEmptyCheck();
			pAuthor.isEmptyCheck();
			pPublisher.isEmptyCheck();
			pPrice.isEmptyCheck();
			pBCode.isValidCheck("[a-zA-Z]+", "첫문자가 영문자로 시작해야 합니다");
			return true;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return false;
		}

	}

	@Override
	public Book getValues() {
		String bCode = pBCode.getTFValue();
		String bName = pBName.getTFValue();
		String author = pAuthor.getTFValue();
		String publisher = pPublisher.getTFValue();
		int price = Integer.parseInt(pPrice.getTFValue());
		return new Book(bCode, bName, author, publisher, price);
	}

	@Override
	public void setValues(Book item) {
		pBCode.setTFValue(item.getbCode());
		pBName.setTFValue(item.getbName());
		pAuthor.setTFValue(item.getAuthor());
		pPublisher.setTFValue(item.getPublisher());
		pPrice.setTFValue(item.getPrice() + "");
	}

	public InputComp getpBCode() {
		return pBCode;
	}

	public void setpBCode(InputComp pBCode) {
		this.pBCode = pBCode;
	}

	public InputComp getpBName() {
		return pBName;
	}

	public void setpBName(InputComp pBName) {
		this.pBName = pBName;
	}

	public InputComp getpAuthor() {
		return pAuthor;
	}

	public void setpAuthor(InputComp pAuthor) {
		this.pAuthor = pAuthor;
	}

	public InputComp getpPublisher() {
		return pPublisher;
	}

	public void setpPublisher(InputComp pPublisher) {
		this.pPublisher = pPublisher;
	}

	public InputComp getpPrice() {
		return pPrice;
	}

	public void setpPrice(InputComp pPrice) {
		this.pPrice = pPrice;
	}
	
	

}
