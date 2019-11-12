package com.training.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.daos.RegisterUsersDao;
import com.training.entity.RegisterUser;
import com.training.utils.DbConnections;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Connection con;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        con= DbConnections.getOracleConnection();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	  long userID = Long.parseLong(request.getParameter("userID"));
	  String passWord = request.getParameter("passWord");
	
	     RegisterUser user = new RegisterUser(userID,passWord);
		 System.out.println(user);
		
		 RegisterUsersDao userDao = new RegisterUsersDao(con);
	
		 try {
			 if(userDao.authenticate(user).equalsIgnoreCase("Employee")) {
				 response.sendRedirect("tripDetails.jsp");
			 }else {
				 response.sendRedirect("login.jsp");
			 }
					
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
