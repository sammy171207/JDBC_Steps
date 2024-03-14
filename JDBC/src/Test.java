import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/////Step 1
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 ///Step2
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/ebook", "root", "abc123");
		
		System.out.println("System Connected to Database");
		Statement sm=connection.createStatement();
	
		int a=sm.executeUpdate("INSERT INTO users (username, gmail, contact_number, password) VALUES ('yash', 'yash@gmail.com', '1234555', '123456')");
		 if(a>0){
			 System.out.println("Data inserted");
		 }
		 else{
			 System.out.println("Error");
		 }
         connection.close();
	}

}
