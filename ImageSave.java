package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.io.*;

public class ImageSave {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/dhruv";
			String username = "root";
			String password = "Dhruv@61202";

			Connection con = DriverManager.getConnection(url, username, password);

			String q = "insert into images(pic) values(?)";

			java.sql.PreparedStatement pstmt = con.prepareStatement(q);

			FileInputStream fis = new FileInputStream("C:\\Semester 3\\Rash.jpg");

			pstmt.setBinaryStream(1, fis, fis.available());

			pstmt.executeUpdate();
			System.out.println("Done!");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error!");
		}
	}
}
