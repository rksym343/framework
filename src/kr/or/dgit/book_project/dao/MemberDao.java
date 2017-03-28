package kr.or.dgit.book_project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.or.dgit.book_project.dto.Member;
import kr.or.dgit.book_project.jdbc.DBCon;

public class MemberDao implements Dao<Member> {

	@Override
	public int insertItem(Member item) {
		DBCon dbCon = new DBCon();
		Connection connection = dbCon.getConnection();
		String sql = "INSERT INTO book_pjt.member (m_code, m_name, tel, m_lend_count, is_secsn) VALUES(?,?,?,?,?)";
		int res = -1;
		try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
			pstmt.setString(1, item.getmCode());
			pstmt.setString(2, item.getmName());
			pstmt.setString(3, item.getTel());
			pstmt.setInt(4, item.getmLendCount());
			pstmt.setBoolean(5, item.isSecsn());
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int deleteItem(Member item) {
		DBCon dbCon = new DBCon();
		Connection connection = dbCon.getConnection();
		String sql = "DELETE FROM book_pjt.member WHERE m_code=?";
		int res = -1;
		try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
			pstmt.setString(1, item.getmCode());
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int updateItme(Member item) {
		DBCon dbCon = new DBCon();
		Connection connection = dbCon.getConnection();
		String sql = "UPDATE book_pjt.member SET m_name=?, tel=?, m_lend_count=? WHERE m_code=?";
		int res = -1;
		try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
			pstmt.setString(1, item.getmName());
			pstmt.setString(2, item.getTel());
			pstmt.setInt(3, item.getmLendCount());
			pstmt.setString(4, item.getmCode());
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public Member selectByCode(Member item) {
		DBCon dbCon = new DBCon();
		Connection connection = dbCon.getConnection();
		String sql = "SELECT m_code, m_name, tel, m_lend_count, is_secsn FROM book_pjt.member WHERE m_code=?";
		Member member = null;
		ResultSet rs = null;
		try (PreparedStatement pstmt = connection.prepareStatement(sql);) {
			pstmt.setString(1, item.getmCode());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				member = getObject(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return member;
	}

	@Override
	public List<Member> selectAll(Member item) {
		DBCon dbCon = new DBCon();
		Connection connection = dbCon.getConnection();
		String sql = "SELECT m_code, m_name, tel, m_lend_count, is_secsn FROM book_pjt.member WHERE m_code=?";
		List<Member> list = new ArrayList<>();
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
	public Member getObject(ResultSet rs) throws SQLException {
		String mCode = rs.getString("m_code");
		String mName = rs.getString("m_name");
		String tel = rs.getString("tel");
		int mLendCount = rs.getInt("m_lend_count");
		boolean isSecsn = rs.getBoolean("is_secsn");
		return new Member(mCode, mName, tel, mLendCount, isSecsn);
	}

}
