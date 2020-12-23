
package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBTester {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pst = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			String user = "system";
			String pass = "sastra";
			con=DriverManager.getConnection(url,user, pass);
			System.out.println("connected");
			pst = con.prepareStatement("select * from ugstudent");
			ResultSet rs = pst.executeQuery();
			while(rs.next()){
				System.out.println("\n");
				System.out.print(rs.getInt(1));
				System.out.print(rs.getString(2));
				System.out.print(rs.getDouble(3));
				System.out.print(rs.getString(4));
				
			}
			
			
			
			
		}catch(Exception e){
			System.out.println(e);
		}
		
		

	}

}
