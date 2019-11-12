package com.training.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.training.entity.RegisterUser;
import com.training.utils.DbConnections;


public class RegisterUsersDao {
	

		private Connection con;
		
		 public RegisterUsersDao(Connection con) {
			super();
			this.con=DbConnections.getOracleConnection();
		
		}
		 

		public PreparedStatement createStatement(String sql)throws SQLException{
			 return con.prepareCall(sql);
		 }
		
		public int add(RegisterUser t) throws SQLException {
			 String sql = "insert into CUSTOMER_DATA values(?,?,?,?,?)"; //Insert user details into the table 'USERS'
			 
			 
			 PreparedStatement pstmt = createStatement(sql);
			 
			    pstmt.setString(1,t.getFirstName());
				pstmt.setString(2,t.getLastName());
				pstmt.setString(3,t.getUserType());
			    pstmt.setLong(4,t.getUserID());
				pstmt.setString(5,t.getPassWord());
				 
				return pstmt.executeUpdate();
					
		 }
       
		public String authenticate(RegisterUser t) throws SQLException{
			
		
		
			String sql = "select * from CUSTOMER_DATA where userID='"+t.getUserID()+"'and passWord='"+t.getPassWord()+"'";
			
				PreparedStatement pstmt = createStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				String result = null;
				if(rs.next()) {
					result = rs.getString("userType");
				}
		
			return result;
				
		}

}




