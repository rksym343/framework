package kr.or.dgit.book_project.dto;

public class Book {

	private String bCode;
	private String bName;
	private String author;
	private String publisher;
	private int price;
	private boolean isPosbl;
	private int bLendCount;

	public Book(String bCode) {
		super();
		this.bCode = bCode;
	}
	
	

	public Book(String bCode, String bName, String author, String publisher, int price) {
		super();
		this.bCode = bCode;
		this.bName = bName;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}



	public Book(String bCode, String bName, String author, String publisher, int price, boolean isPosbl,
			int bLendCount) {
		super();
		this.bCode = bCode;
		this.bName = bName;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.isPosbl = isPosbl;
		this.bLendCount = bLendCount;
	}

	public String getbCode() {
		return bCode;
	}

	public void setbCode(String bCode) {
		this.bCode = bCode;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getbLendCount() {
		return bLendCount;
	}

	public void setbLendCount(int bLendCount) {
		this.bLendCount = bLendCount;
	}

	public boolean isPosbl() {
		return isPosbl;
	}

	public void setPosbl(boolean isPosbl) {
		this.isPosbl = isPosbl;
	}

	@Override
	public String toString() {
		return String.format("Book [bCode=%s, bName=%s, author=%s, publisher=%s, price=%s, isPosbl=%s, bLendCount=%s]",
				bCode, bName, author, publisher, price, isPosbl, bLendCount);
	}

}
