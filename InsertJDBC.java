package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertJDBC {
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
//			Create a query
			String q = "create table table1(tId int(20) primary key auto_increment,"
					+ "tName varchar(200) not null, tCity varchar(400)  )";

			// Create a statement
			Statement stmt = con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("Table created in Database!");
			con.close();
			
			

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
