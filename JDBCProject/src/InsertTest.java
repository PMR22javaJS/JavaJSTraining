import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {
	public static void main(String[] args) {
		//1. Load the driver
		
		try {
			System.out.println("Trying to load");
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver loaded");
			//2. acquire the connection
			System.out.println("Trying the connection");
			Connection conn=DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			System.out.println("Connection is made "+conn);
			//3. insert/delete/update
			
			PreparedStatement preStatement = conn.prepareStatement("INSERT INTO MYDEPT120 VALUES (?,?,?)");

			System.out.println("Statement is created : "+preStatement);
			preStatement.setInt(1, 40);
			preStatement.setString(2, "PUNE");
			preStatement.setString(3,"TESTING");
			
			//4. execute statement
			
			int rows = preStatement.executeUpdate();
			
			System.out.println("Rows created : "+rows);
			//6. close the statement
			conn.close();
			preStatement.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
