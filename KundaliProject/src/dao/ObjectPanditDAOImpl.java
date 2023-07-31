package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ObjectPanditDAOImpl implements ObjectPanditDAO {

	Connection conn ; 
	
	public ObjectPanditDAOImpl() {
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			conn = 	DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void insertPandit(ObjectPandit pandit) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pst = 
					conn.prepareStatement("INSERT INTO MYMATCH VALUES (?,?,?)");
			
			pst.setString(1, pandit.getJointName());
			pst.setInt(2, pandit.getStarsMatch());
			pst.setBoolean(3,pandit.isMatch());
			
			System.out.println("PreparedStatement is created : "+ pst);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			int rows = pst.executeUpdate();
			
			System.out.println("Rows created : "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public ObjectPandit selectPandit(boolean match) {
		// TODO Auto-generated method stub
		ObjectPandit pand =null;
		try {
			
			Statement statement = conn.createStatement();
			System.out.println("Statement is created : "+ statement);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			ResultSet result = statement.executeQuery("SELECT * FROM MYMATCH WHERE MATCH ="+match);
			
			//5. process teh result if any
			if(result.next()) {
				pand = new ObjectPandit(); //blank object
				
				pand.setJointName(result.getString(1));
				pand.setStarsMatch(3);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pand;
	}

	@Override
	public List<ObjectPandit> selectPandit() {
		// TODO Auto-generated method stub
		List<ObjectPandit> pandList = new ArrayList<ObjectPandit>();
		try {
			
			 
			Statement statement = conn.createStatement();
			System.out.println("Statement is created : "+ statement);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			ResultSet result = statement.executeQuery("SELECT * FROM MYMATCH");
			
			//5. process teh result if any
			while(result.next()) {
				ObjectPandit panda = new ObjectPandit(); //blank object
				
				panda.setJointName(result.getString(1));
				panda.setStarsMatch(result.getInt(2));
				panda.setMatch(result.getBoolean(3));
				pandList.add(panda); // add this object to the LIST 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pandList;
	}

	@Override
	public void updatePandit(ObjectPandit pandit) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pst = 
					conn.prepareStatement("UPDATE DMYMATCH name=?, starsmatch=? where match=?");
			
			
			pst.setString(1, pandit.getJointName()); 
			pst.setInt(2,pandit.getStarsMatch());
			pst.setBoolean(3, pandit.isMatch()); 

			
			System.out.println("PreparedStatement is created : "+ pst);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			int rows = pst.executeUpdate();
			
			System.out.println("Row MODIFIED : "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deletePandit(boolean match) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pst = 
					conn.prepareStatement("DELETE FROM MYMATCH where match=?");
			
			pst.setBoolean(3,match);

			
			System.out.println("PreparedStatement is created : "+ pst);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			int rows = pst.executeUpdate();
			
			System.out.println("Row DELETED : "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
