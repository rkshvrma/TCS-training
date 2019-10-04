package com.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.tourPlan;
import com.dao.TourData;

/**
 * Servlet implementation class member
 */
@WebServlet("/memberServlet")
public class memberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public memberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = request.getParameter("currentPage");
		

		if ("createtourplan".equals(page)) {
			String tour_name = request.getParameter("TourName");
			String starting_location = request.getParameter("StartingLocation");
			String places_included = request.getParameter("PlacesofInterest");
			Double tour_cost = Double.parseDouble(request.getParameter("TourCost"));
			Double discount_per = Double.parseDouble(request.getParameter("Discount"));
			int tour_days = Integer.parseInt(request.getParameter("tourdays"));
			int tourid = 0;
			
			tourPlan tour = new tourPlan(tourid,tour_name, starting_location, places_included, tour_cost, discount_per, tour_days);

			int count = TourData.createTourPlan(tour);  
			if (count > 0) {
			
			tourid++;	
			out.print("Tour is added");
			RequestDispatcher rd = request.getRequestDispatcher("/pages/login.jsp");
			rd.include(request, response);
			}


}
