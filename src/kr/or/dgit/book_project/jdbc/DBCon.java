package kr.or.dgit.book_project.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
	private String dbname = "book_pjt";
	private String url = "jdbc:mysql://localhost:3306/" + dbname;
	private String user = "user_book";
	private String password = "rootroot";
	private Connection connection;

	public DBCon() {
		try {
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("DBCon: 연결성공");
		} catch (SQLException e) {
			System.out.println("연결실패 = 사용자 정보 및 드라이버를 찾을 수 없음");
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		return connection;
	}
	
	public void close(){
		if(connection!=null){
			try {
				connection.close();
				connection = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	

}
