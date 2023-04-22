package rw.ac.rca.webapp.web;

import rw.ac.rca.webapp.dao.CourseDAO;
import rw.ac.rca.webapp.dao.impl.CourseDAOImpl;
import rw.ac.rca.webapp.orm.Course;
import rw.ac.rca.webapp.orm.User;
import rw.ac.rca.webapp.util.UserRole;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ListCourse
 */
public class ListCourse extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CourseDAO courseDAO = CourseDAOImpl.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListCourse() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pageRedirect = request.getParameter("page");

		HttpSession httpSession = request.getSession();
		Object user = httpSession.getAttribute("authenticatedUser");
		System.out.println("The user in session is: " + user);

		if (pageRedirect != null) {
			if (pageRedirect.equals("courses") && request.getParameter("action").equals("list")) {

				List<Course> courses = courseDAO.getAllCourses();
				httpSession.setAttribute("courses", courses);
				UserRole[] userRoles = UserRole.values();
				httpSession.setAttribute("userRoles", userRoles);
				request.getRequestDispatcher("WEB-INF/courses.jsp").forward(request , response);
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
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
