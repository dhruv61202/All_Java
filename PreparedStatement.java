package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import java.io.*;

public class PreparedStatement {
	public static void main(String[] args) {
		try {
//			Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

//			Create a connection
			String url = "jdbc:mysql://localhost:3306/dhruv";
			String username = "root";
			String password = "Dhruv@61202";

			Connection con = DriverManager.getConnection(url, username, password);
//			Create a query
			String q = "insert into table1(tName,tCity) values (?,?)";

//			get the PreaparedStatement object
			java.sql.PreparedStatement pstmt = con.prepareStatement(q);

			// set the values to query

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Name : ");
			String name = br.readLine();
			System.out.println("Enter City: ");
			String city = br.readLine();

			pstmt.setString(1, name);
			pstmt.setString(2, city);
			pstmt.executeUpdate();

			System.out.println("Inserted!!");
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
