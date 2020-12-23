package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBUtil {

	public static Connection getMyDBConnection(){
		Connection con = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			String user = "system";
			String pass = "sastra";
			con=DriverManager.getConnection(url,user, pass);
		}catch(Exception e){
			System.out.println(e);
		}
		return con;
	}
}
