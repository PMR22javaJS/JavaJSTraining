package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DepartmentController
 */
@WebServlet("/deptController")
public class DepartmentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepartmentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		String buttonValue = request.getParameter("submit");
		pw.println("<h3>You selected : "+buttonValue+"</h3>");
		
		RequestDispatcher dispatcher = null;
		
		if(buttonValue.equalsIgnoreCase("Create Department")) {
			dispatcher = request.getRequestDispatcher("InsertDepartment.html");
			System.out.println("create : "+dispatcher);

		}
		else if(buttonValue.equalsIgnoreCase("View All Departments")) {
			dispatcher = request.getRequestDispatcher("LoadAllDepartments.jsp");
			System.out.println("view all : "+dispatcher);

		}
		else if(buttonValue.equalsIgnoreCase("Modify Department")) {
			dispatcher = request.getRequestDispatcher("UpdateDepartment.html");
			System.out.println("modify : "+dispatcher);

		}
		else if(buttonValue.equalsIgnoreCase("Delete Department")) {
			dispatcher = request.getRequestDispatcher("DeleteDepartment.html");
			System.out.println("delete : "+dispatcher);

		}
		else {
			System.out.println("dispatcher : "+dispatcher);
		}
		
		dispatcher.include(request, response);
		pw.println("<br><a href='http://localhost:8080/MyDynamicProject/Home.html'>Home</a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
