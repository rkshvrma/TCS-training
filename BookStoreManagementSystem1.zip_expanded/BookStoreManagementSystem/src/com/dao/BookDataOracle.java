package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.beans.Book;
import com.exception.BookExistException;
import com.exception.BookIdDoesNotExistException;
import com.util.DBUtil;

public class BookDataOracle implements BookData {

	@Override
	public int addBook(Book book) throws BookExistException {
		// TODO Auto-generated method stub

		Connection con = null;
		try {

			con = DBUtil.getDBConnection();

			String query = "insert into book (bookId, bookName, category) values (?,?,?)";

			PreparedStatement pstmt = con.prepareStatement(query);

			pstmt.setInt(1, book.getBookId());
			pstmt.setString(2, book.getBookName());
			pstmt.setString(3, book.getCategory());

			pstmt.execute();

		} catch (SQLException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				DBUtil.closeConnection(con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 1;
	}

	@Override
	public Book getBookDetails(int bookId) throws BookIdDoesNotExistException {
		// TODO Auto-generated method stub

		Connection con = null;

		con = DBUtil.getDBConnection();

		String query = "select * from book";

		PreparedStatement pstmt = con.prepareStatement(query);

		ResultSet rs = pstmt.executeQuery();
		int id = rs.getInt(1);
		String str1 = rs.getString(2);
		String str2 = rs.getString(3);
		Book book = new Book(id, str1, str2);

	}DBUtil.closeConnection(con);return book;

	}

	@Override
	public List<Book> getBooksByCategory(String Category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteBook(int bookId) throws BookIdDoesNotExistException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBookDetails(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Map<String, Integer> getBookCountBasedOnBookCategory() {
		// TODO Auto-generated method stub
		return null;
	}

}
