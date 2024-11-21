package com.app.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.app.dao.EmployeeDao;
import com.app.model.Employee;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/registerServlet")
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
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		String user = request.getParameter("uname");
		String password = request.getParameter("pass");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String age= request.getParameter("age");
		String terms= request.getParameter("terms");
		
	Employee e = new Employee();
		
		e.setUsername(user);
		e.setPassword(password);
		e.setEmail(email);
		e.setGender(gender);
		e.setAge(age);
		e.setTerm(terms);
		
		
		try {
			int i = EmployeeDao.registerEmployee(e);
			
			if(i==1) {
				pw.write("Registered Successfully !!! Please login");
				request.getRequestDispatcher("login.html").include(request, response);
			}
			else
			{
				pw.write("Registration failed ");
			
				request.getRequestDispatcher("register.html").include(request, response);
				
			}
		}
		catch (Exception exp) {
			// TODO: handle exception
		}
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
