import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {
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
			
			Statement statement=conn.createStatement();
			System.out.println("Statement is created : "+statement);
			//4. execute statement
			
			ResultSet result=statement.executeQuery("SELECT * FROM MYDEPT120");
			//5. process result
			
			while(result.next()) {
				System.out.println("DEPTNO : "+result.getInt(1));
				System.out.println("DNAME: "+result.getString(2));
				System.out.println("LOC: "+result.getString(3));
				System.out.println("-----------------------------");
			}
			//6. close the statement
			result.close();
			statement.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
