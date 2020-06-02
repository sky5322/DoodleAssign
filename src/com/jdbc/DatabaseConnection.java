package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class DatabaseConnection {
	
	static Connection myCon=null;
	static Statement myStmt=null;
	static PreparedStatement prepareStmt=null;
	static ResultSet resultSet=null;
	
	
	public static Connection connectDb() {
		
			ResourceBundle bundle = ResourceBundle.getBundle("com.jdbc.utilities.mysqlinfo");
			String url = bundle.getString("url");
			String user = bundle.getString("user");
			String password = bundle.getString("password");
			
			try {
				
				myCon = DriverManager.getConnection(url,user,password);
				myStmt = myCon.createStatement();
				myCon.setAutoCommit(false);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return myCon;
			
 }
	public static void closeDb() {
		
			try {
				if(resultSet!=null) {
					resultSet.close();
				}
				if(prepareStmt!=null) {
					prepareStmt.close();
				}
				if(myStmt!=null) {
					myStmt.close();
				}
				if(myCon!=null) {
					myCon.close();
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}

