package kr.or.dgit.book_project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import kr.or.dgit.book_project.dto.BooksInOut;
import kr.or.dgit.book_project.jdbc.DBCon;

public class BooksInOutDao implements Dao<BooksInOut> {

	@Override
	public int insertItem(BooksInOut item) {
		DBCon dbCon = new DBCon();
		Connection connection = dbCon.getConnection();
		String sql = "INSERT INTO book_pjt.booksinout (bCode, mCode, lendDate, returnDate) VALUES('', '', '', '');";
		int res = -1;
		try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
			pstmt.setString(1, item.getmCode());
			pstmt.setString(2, item.getmName());
			pstmt.setString(3, item.getTel());
			pstmt.setInt(4, item.getmLendCount());
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int deleteItem(BooksInOut item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateItme(BooksInOut item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BooksInOut selectByCode(BooksInOut item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BooksInOut> selectAll(BooksInOut item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BooksInOut getObject(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
