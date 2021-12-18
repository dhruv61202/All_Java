package jdbc;

import java.io.BufferedReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.io.*;

//import jdk.internal.org.jline.utils.InputStreamReader;

public class UpdateJDBC {
	public static void main(String[] args) {
		try {
//			Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

//			Create a connection
			String url = "jdbc:mysql://localhost:3306/dhruv";
			String username = "root";
			String password = "Dhruv@61202";

			Connection con = DriverManager.getConnection(url, username, password);
			String q = "update table1 set tName=?, tCity=? where tId=?";
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter new Name: ");
			String name = br.readLine();

			System.out.println("Enter new city name: ");
			String city = br.readLine();

			System.out.println("Enter the Student id: ");
			int id = Integer.parseInt(br.readLine());

			java.sql.PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			pstmt.setInt(3, id);

			pstmt.executeUpdate();
			System.out.println("Done");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
