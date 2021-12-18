package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectJDBC {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/dhruv";
			String username = "root";
			String password = "Dhruv@61202";

			Connection con = DriverManager.getConnection(url, username, password);


			String query = "select * from table1";
			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(query);
			while(set.next())
			{
				int id = set.getInt(1);
				String name = set.getString(2);
				String city = set.getString(3);
				System.out.println("ID:  " + id+ "  Name:"+name+"  City:"+city);
				
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
