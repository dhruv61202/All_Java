package jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class LargeImageSave {
	public static void main(String[] args) {
		try {
//			
			System.out.println("This is testing!");
//			Connection c = ConnectionProvider.getConnection();
			
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/dhruv";
				String username = "root";
				String password = "Dhruv@61202";

				Connection con = DriverManager.getConnection(url, username, password);

			

			
			String q = "insert into images(pic) values(?)";
			
			java.sql.PreparedStatement pstmt = con.prepareStatement(q);
			
			JFileChooser jfc = new JFileChooser();
			jfc.showOpenDialog(null);
			
			File file = jfc.getSelectedFile();
			FileInputStream fis = new  FileInputStream(file);
			
			pstmt.setBinaryStream(1, fis, fis.available());
			pstmt.executeUpdate();
			System.out.println("Done!!");
			JOptionPane.showMessageDialog(null, "Success");
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
}
