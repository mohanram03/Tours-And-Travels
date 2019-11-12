package com.training.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.training.entity.TripDetails;
import com.training.utils.DbConnections;

public class TripDetailsDao {
	
	
			private Connection con;
			
			 public TripDetailsDao(Connection con) {
				super();
				this.con=DbConnections.getOracleConnection();
			
			}
			 

			public PreparedStatement createStatement(String sql)throws SQLException{
				 return con.prepareStatement(sql);
			 }
			
			public int add(TripDetails t) throws SQLException {
				 String sql = "insert into Trip_Details values(?,?,?,?,?,?)"; //Insert user details into the table 'USERS'
				 
				 
				 PreparedStatement pstmt = createStatement(sql);
				 
				    pstmt.setInt(1,t.getTripCode());
					pstmt.setString(2,t.getTourName());
					pstmt.setDate(3,t.getStartDate());
				    pstmt.setDate(4,t.getEndDate());
					pstmt.setString(5,t.getPlacesCovered());
					pstmt.setDouble(6,t.getTripCost());
					 
			return pstmt.executeUpdate();
						
			 }
        



			

		}


