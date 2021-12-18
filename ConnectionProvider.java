package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

	private static Connection con;

	public static Connection getConnection() {
		try {
		if (con == null) {
			
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/dhruv";
				String username = "root";
				String password = "Dhruv@61202";

				Connection con = DriverManager.getConnection(url, username, password);

			} 
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e);

		}


		return con;

	}
}
