package com.app.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import com.app.dao.EmployeeDao;
import com.app.model.Employee;

/**
 * Servlet implementation class LoginServlet
 */

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		
		Employee e = new Employee();
		
		e.setUsername(user);
		e.setPassword(password);
//		pw.write("loginServlet");
		
		
		boolean flag;
		
		try {
			flag = EmployeeDao.loginEmployee(e);
			
			if(flag) {
				pw.write("Login Successfull");
				HttpSession session = request.getSession();
				session.setAttribute("user", user);
				session.setAttribute("pwd", password);
				request.getRequestDispatcher("welcome.html").include(request, response);
			}
			else {
				pw.write("invalid Credentials <b>OR</b>");
				pw.write("<a class='btn btn-success' href='Register.html' value='Register'>Register</a>");
				request.getRequestDispatcher("login.html").include(request, response);
				
			}
		}catch(ClassNotFoundException exp ) {
			exp.printStackTrace();
		}
		catch(SQLException exp ) {
			exp.printStackTrace();
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
