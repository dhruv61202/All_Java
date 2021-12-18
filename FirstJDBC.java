package jdbc;

import java.lang.Class;
import java.sql.*;

public class FirstJDBC {
	public static void main(String[] args) {
		try {
//			Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

//			Create a connection
			String url = "jdbc:mysql://localhost:3306/dhruv";
			String username = "root";
			String password = "Dhruv@61202";

			Connection con = DriverManager.getConnection(url, username, password);
			if (con.isClosed()) {
				System.out.println("Connection is still Closed....");

			} else {
				System.out.println("Connection Created....");
			}
			
//			Creating a table !
			
			

		} catch (Exception e) {
			e.printStackTrace();
			
		}

	}

}
