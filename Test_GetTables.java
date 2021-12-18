package jdbc;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test_GetTables {
	public static void main(String args[]) throws Exception {
		// Registering the Driver
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		// Getting the connection
		String mysqlUrl = "jdbc:mysql://localhost/dhruv";
		Connection con = DriverManager.getConnection(mysqlUrl, "root", "Dhruv@61202");
		System.out.println("Connection established......");
		// Retrieving the meta data object
		DatabaseMetaData metaData = con.getMetaData();
		String[] types = { "TABLE" };
		// Retrieving the columns in the database
		ResultSet tables = metaData.getTables(null, null, "%", types);
		while (tables.next()) {
			System.out.println(tables.getString("TABLE_NAME"));
		}
	}
}