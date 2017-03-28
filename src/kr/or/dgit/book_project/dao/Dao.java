package kr.or.dgit.book_project.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface Dao<T> {

	int insertItem(T item);

	int deleteItem(T item);

	int updateItme(T item);

	T selectByCode(T item);

	List<T> selectAll(T item);

	T getObject(ResultSet rs) throws SQLException;

}
