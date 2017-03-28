package kr.or.dgit.book_project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.or.dgit.book_project.dto.Book;
import kr.or.dgit.book_project.jdbc.DBCon;


public class BookDao implements Dao<Book> {

	@Override
	public int insertItem(Book item) {
		DBCon dbCon = new DBCon();
		Connection connection = dbCon.getConnection();
		String sql = "INSERT INTO book_pjt.book (bCode, bName, author, publisher, price, is_posbl, bLendCount) "
				+ "VALUES(?,?,?,?,?,?)";
		int res = -1;
		try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
			pstmt.setString(1, item.getbCode());
			pstmt.setString(2, item.getbName());
			pstmt.setString(3, item.getAuthor());
			pstmt.setString(4, item.getPublisher());
			pstmt.setBoolean(5, item.isPosbl());
			pstmt.setInt(6, item.getbLendCount());
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int deleteItem(Book item) {
		DBCon dbCon = new DBCon();
		Connection connection = dbCon.getConnection();
		String sql = "DELETE FROM  book_pjt.book WHERE bCode=?";
		int res = -1;
		try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
			pstmt.setString(1, item.getbCode());
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int updateItme(Book item) {
		DBCon dbCon = new DBCon();
		Connection connection = dbCon.getConnection();
		String sql = "UPDATE book_pjt.book " + "SET bName=?, author=?, publisher=?, price=?, is_posbl=?, bLendCount=? "
				+ "WHERE bCode=?";
		int res = -1;
		try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
			pstmt.setString(1, item.getbName());
			pstmt.setString(2, item.getAuthor());
			pstmt.setString(3, item.getPublisher());
			pstmt.setBoolean(4, item.isPosbl());
			pstmt.setInt(5, item.getbLendCount());
			pstmt.setString(6, item.getbCode());
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public Book selectByCode(Book item) {
		DBCon dbCon = new DBCon();
		Connection connection = dbCon.getConnection();
		String sql = "SELECT bCode, bName, author, publisher, price, is_posbl, bLendCount FROM book_pjt.book WHERE bCode=?";
		Book book = null;
		ResultSet rs = null;
		try (PreparedStatement pstmt = connection.prepareStatement(sql);) {
			pstmt.setString(1, item.getbCode());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				book = getObject(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return book;
	}

	@Override
	public List<Book> selectAll(Book item) {
		DBCon dbCon = new DBCon();
		Connection connection = dbCon.getConnection();
		String sql = "SELECT bCode, bName, author, publisher, price, is_posbl, bLendCount FROM book_pjt.book";
		List<Book> list = new ArrayList<>();
		ResultSet rs = null;
		try (PreparedStatement pstmt = connection.prepareStatement(sql);) {
			rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(getObject(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Book getObject(ResultSet rs) throws SQLException {
		String bCode = rs.getString("bCode");
		String bName = rs.getString("bName");
		String author = rs.getString("author");
		String publisher = rs.getString("publisher");
		int price = rs.getInt("price");
		boolean isPosbl = rs.getBoolean("is_posbl");
		int bLendCount = rs.getInt("bLendCount");
		return new Book(bCode, bName, author, publisher, price, isPosbl, bLendCount);
	}

}
