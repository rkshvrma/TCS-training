

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.Employee;
import com.beans.Policy;
import com.dao.EmployeeDAOFactory;
import com.dao.EmployeeDataOracle;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
		 

		if ("register".equals(page)) {
			
			
		Policy policy = new Policy(-1,
								Date.valueOf(request.getParameter("policyStart")),
								Integer.parseInt(request.getParameter("policyLen")),
								Integer.parseInt(request.getParameter("policySum")),
								Integer.parseInt(request.getParameter("policyPremium")));
		
		
		EmployeeDataOracle empOracle = EmployeeDAOFactory.getInstance().getEmployeeDataCollection("Oracle");
		int success = -1;
		try {
			success = empOracle.addPolicy(policy);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(success != -1) {
			
			Employee emp = new Employee(Integer.parseInt(request.getParameter("empNum")), 
								request.getParameter("empName"),
								Date.valueOf(request.getParameter("Date")), 
								request.getParameter("empGender"), 
								request.getParameter("empMail"), 
								request.getParameter("empAltEmail"),
								request.getParameter("empPhone"), 
								request.getParameter("empAltPhone"),
								success,
								request.getParameter("empBankNum"), 
								request.getParameter("empBankName"), 
								request.getParameter("empBankCode") 
					);
			 
			 empOracle.addEmployee(emp);
			
		}
		
		
				
		
				Boolean added  = new Boolean(true);
				
				request.setAttribute("added", added);
				
				RequestDispatcher reqDispatch = request.getRequestDispatcher("pages/success.jsp");
				reqDispatch.forward(request, response);
				
		}}}