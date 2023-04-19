package rw.ac.rca.webapp.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import rw.ac.rca.webapp.orm.User;
import rw.ac.rca.webapp.util.UserRole;
import rw.ac.rca.webapp.dao.UserDAO;
import rw.ac.rca.webapp.dao.impl.UserDAOImpl;

/**
 * Servlet implementation class ListUser
 */
public class ListUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAO userDAO = UserDAOImpl.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListUser() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pageRedirect = request.getParameter("page");

		HttpSession httpSession = request.getSession();
		Object user = httpSession.getAttribute("authenticatedUser");
		System.out.println("The user in session is: " + user);

		if (pageRedirect != null) {
			if (pageRedirect.equals("users") && request.getParameter("action").equals("list")) {

				List<User> users = userDAO.getAllUsers();
				httpSession.setAttribute("users", users);
				UserRole[] userRoles = UserRole.values();
				httpSession.setAttribute("userRoles", userRoles);
				RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/users.jsp");
				dispatcher.forward(request, response);
			} 
		} else {
			httpSession.setAttribute("error", "Invalid User. Try again!");
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/login.jsp");
			dispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
