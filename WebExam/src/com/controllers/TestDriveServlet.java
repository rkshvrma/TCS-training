package com.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.TestDrive;
import com.beans.booking;
import com.dao.DriveDaoFactory;

/**
 * Servlet implementation class TestDriveServlet
 */
@WebServlet("/TestDriveServlet")
public class TestDriveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TestDriveServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = request.getParameter("currentPage");

		if ("book".equals(page)) {
			String custName = request.getParameter("customername");
			String vehiMake = request.getParameter("make");
			int bookingid = Integer.parseInt(request.getParameter("bookingid"));
			int licenseno = Integer.parseInt(request.getParameter("drivinglic"));
			int proposeddate = Integer.parseInt(request.getParameter("date"));

			TestDrive tourDao = DriveDaoFactory.getInstance().getDriveDataCollection("Oracle");

			booking newPlan = new booking(bookingid, custName, licenseno, vehiMake, proposeddate);

			boolean added = tourDao.testDriveBooking(newPlan);
			request.setAttribute("added", new Boolean(added));
			request.getRequestDispatcher("pages/success.jsp").forward(request, response);

		} else if ("search".equals(page)) {
			String date1 = request.getParameter("date");
			int date2 = date1.equals("") ? 0 : Integer.parseInt(date1);

			TestDrive testDao = DriveDaoFactory.getInstance().getDriveDataCollection("Oracle");
			List<booking> driveList = testDao.viewBookings(date2);

			request.setAttribute("driveList", driveList);
			request.getRequestDispatcher("pages/footer.jsp").forward(request, response);

		} else if ("cancelDrive".equals(page)) {
			int bookId = Integer.parseInt(request.getParameter("bookid"));

			Boolean deleted = new Boolean(true);
			TestDrive bookDao = DriveDaoFactory.getInstance().getDriveDataCollection("Oracle");

			bookDao.cancelBooking(bookId);

			request.setAttribute("deleted", deleted);

			RequestDispatcher reqDispatch = request.getRequestDispatcher("pages/cancel.jsp");
			reqDispatch.forward(request, response);

		}

	}
}
