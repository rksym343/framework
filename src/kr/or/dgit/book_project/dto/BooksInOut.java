package kr.or.dgit.book_project.dto;

import java.util.Date;

public class BooksInOut {

	private int no;
	private Book book;
	private Member member;
	private Date lendDate;
	private Date dueDate;
	private Date returnDate;

	public BooksInOut(int no) {
		super();
		this.no = no;
	}

	public BooksInOut(int no, Book book, Member member, Date lendDate, Date dueDate, Date returnDate) {
		super();
		this.no = no;
		this.book = book;
		this.member = member;
		this.lendDate = lendDate;
		this.dueDate = dueDate;
		this.returnDate = returnDate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Date getLendDate() {
		return lendDate;
	}

	public void setLendDate(Date lendDate) {
		this.lendDate = lendDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	@Override
	public String toString() {
		return String.format("BooksInOut [no=%s, book=%s, member=%s, lendDate=%s, dueDate=%s, returnDate=%s]", no, book,
				member, lendDate, dueDate, returnDate);
	}

}
