package com.ui;

import java.util.List;
import java.util.Scanner;

import com.beans.Book;
import com.dao.BookDaoFactory;
import com.dao.BookData;
import com.exception.BookExistException;
import com.exception.BookIdDoesNotExistException;

public class BookManagementSystem {

	private static BookData bookDao = BookDaoFactory.getBookFactoryInstance().getBookStorage("MySQL");

	public static void main(String[] args) {
		System.out.println("<<<<< Book Management System >>>>>");

		while (true) {
			System.out.println("1. Add Book");
			System.out.println("2. View Book");
			System.out.println("3. Get Books by Category");
			System.out.println("4. delete Book");
			System.out.println("5. Update Book Details");
			System.out.println("6. Exit Application");

			Scanner scan = new Scanner(System.in);

			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				Book book = new Book();

				Scanner scan1 = new Scanner(System.in);
				System.out.println("Book ID : ");
				book.setBookId(scan.nextInt());

				System.out.println("Book Name : ");
				book.setBookName(scan.next());

				System.out.println("Book Category: ");
				book.setCategory(scan.next());

				try {

					int responseCode = bookDao.addBook(book);

					if (responseCode == 1) {
						System.out.println("Book details added successfully");
					} else {
						System.err.println("Failed to add Book");
					}
				} catch (BookExistException e) {

					System.out.println("A book with similar details exists already");
				}
				break;
			case 2:
				scan1 = new Scanner(System.in);
				System.out.println("Book ID : ");

				Book book1;
				try {
					book1 = bookDao.getBookDetails(scan1.nextInt());
					System.out.println(book1);
				} catch (BookIdDoesNotExistException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			case 3:
				scan1 = new Scanner(System.in);
				System.out.println("Enter Book Category : ");

				List<Book> bookList = bookDao.getBooksByCategory(null);

				System.out.println(bookList);

				break;
			case 4:
				break;
			case 5:
				break;
			case 6:

				System.out.println("<<< Thank you for using Book Management System >>>>");
				System.exit(0);
				break;
			}
		}

	}

}
