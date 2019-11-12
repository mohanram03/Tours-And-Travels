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
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Connection con;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        con= DbConnections.getOracleConnection();
    
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

		
		

		 String firstName = request.getParameter("firstName");
		 String lastName = request.getParameter("lastName");
		 String userType = request.getParameter("userType");
		 long userID = Long.parseLong(request.getParameter("userID"));
		 String passWord = request.getParameter("passWord");
		 
		 RegisterUser user = new RegisterUser(firstName,lastName,userType,userID,passWord);
		 System.out.println(user);
		
		 RegisterUsersDao userDao = new RegisterUsersDao(con);
		 
		 try {
			userDao.add(user); 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
