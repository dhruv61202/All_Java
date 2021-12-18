package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Test_ColName {
	public static void main(String args[]) throws Exception {
		// Registering the Driver
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		// Getting the connection
		String mysqlUrl = "jdbc:mysql://localhost/dhruv";
		Connection con = DriverManager.getConnection(mysqlUrl, "root", "Dhruv@61202");
		System.out.println("Connection established......");
		// Creating a Statement object
		Statement stmt = con.createStatement();
		// Retrieving the data
		ResultSet rs = stmt.executeQuery("select * from table1");
		// Retrieving the ResultSetMetadata object
		ResultSetMetaData rsMetaData = rs.getMetaData();
		System.out.println("List of column names in the current table: ");
		// Retrieving the list of column names
		int count = rsMetaData.getColumnCount();
		for (int i = 1; i <= count; i++) {
			System.out.println(rsMetaData.getColumnName(i));
		}
	}
}