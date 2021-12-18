package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Test_ColumnType {
	public static void main(String args[]) throws Exception {
		// Registering the Driver
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		// Getting the connection
		String mysqlUrl = "jdbc:mysql://localhost/dhruv";
		Connection con = DriverManager.getConnection(mysqlUrl, "root", "Dhruv@61202");
		System.out.println("Connection established......");
		// Creating a Statement object
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from table1");
		// Retrieving the ResultSetMetaData object
		ResultSetMetaData rsmd = rs.getMetaData();
		// getting the column type
		String column_name = rsmd.getColumnTypeName(1);//2 and 3 can b tried too!
		System.out.println("Data type of the column with the specified index is: " + column_name);
	}
}