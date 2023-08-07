package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Employee;

public class EmployeeDAOImplementation extends BaseDAO implements EmployeeDAO {

	public EmployeeDAOImplementation() {
		super();
	}
	
	@Override
	public void createEmployee(Employee emp) {
			//3. make a desired statement (insert/update/delete/select)
		
				try {
					PreparedStatement pst = 
							conn.prepareStatement("INSERT INTO EMP VALUES (?,?,?, ?,?,?, ?,?,?)");
					
					pst.setInt(1, emp.getEmployeeNumber());
					pst.setString(2,emp.getEmployeeName());
					pst.setString(3,emp.getEmailAddress());
					pst.setString(4,emp.getEmployeeJob());
					pst.setInt(5, emp.getManagerCode());
					java.sql.Date doj = new java.sql.Date(emp.getHiredate().getTime());
					pst.setDate(6, doj);
					pst.setInt(7,emp.getSalary());
					pst.setInt(8, emp.getCommission());
					pst.setInt(9, emp.getDepartmentNumber());
					
					
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
	public Employee selectEmployee(int empno) {
		Employee empObj =null;
		try {
			
			Statement statement = conn.createStatement();
			System.out.println("Statement is created : "+ statement);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			ResultSet result = statement.executeQuery("SELECT * FROM EMP WHERE EMPNO="+empno);
			
			//5. process teh result if any
			if(result.next()) {
				empObj = new Employee(); //blank object
				
				empObj.setEmployeeNumber(result.getInt(1));
				empObj.setEmployeeName(result.getString(2));
				empObj.setEmailAddress(result.getString(3));
				empObj.setEmployeeJob(result.getString(4));
				empObj.setManagerCode(result.getInt(5));
				empObj.setHiredate(result.getDate(6));
				empObj.setSalary(result.getInt(7));
				empObj.setCommission(result.getInt(8));
				empObj.setDepartmentNumber(result.getInt(9));
				

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empObj;

	}

	@Override
	public List<Employee> selectEmployees() {
		List<Employee> empList = new ArrayList<Employee>();

		Employee empObj =null;
		try {
			
			Statement statement = conn.createStatement();
			System.out.println("Statement is created : "+ statement);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			ResultSet result = statement.executeQuery("SELECT * FROM EMP");
			
			//5. process teh result if any
			while(result.next()) {
				empObj = new Employee(); //blank object
				
				empObj.setEmployeeNumber(result.getInt(1));
				empObj.setEmployeeName(result.getString(2));
				empObj.setEmailAddress(result.getString(3));
				empObj.setEmployeeJob(result.getString(4));
				empObj.setManagerCode(result.getInt(5));
				empObj.setHiredate(result.getDate(6));
				empObj.setSalary(result.getInt(7));
				empObj.setCommission(result.getInt(8));
				empObj.setDepartmentNumber(result.getInt(9));
				
				empList.add(empObj); //fill up the list

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empList;
	}

	@Override
	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		//3. make a desired statement (insert/update/delete/select)
		
		try {
			PreparedStatement pst = 
					conn.prepareStatement("UPDATE EMP set ENAME=?,EMAIL=?,JOB=?,MGR=?,HIREDATE=?,SAL=?,COMM=?,DNO=?  WHERE EMPNO=?");
			
			pst.setInt(9, emp.getEmployeeNumber());
			
			pst.setString(1,emp.getEmployeeName());
			pst.setString(2,emp.getEmailAddress());
			pst.setString(3,emp.getEmployeeJob());
			pst.setInt(4, emp.getManagerCode());
			
			java.sql.Date doj = new java.sql.Date(emp.getHiredate().getTime());
			pst.setDate(5, doj);
			
			pst.setInt(6,emp.getSalary());
			pst.setInt(7, emp.getCommission());
			pst.setInt(8, emp.getDepartmentNumber());
			
			
			System.out.println("PreparedStatement is created : "+ pst);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			int rows = pst.executeUpdate();
			
			System.out.println("Rows UPDATED : "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteEmployee(int empno) {
		// TODO Auto-generated method stub

		try {
			PreparedStatement pst = 
					conn.prepareStatement("DELETE FROM EMP_ where EMPNO=?");
			
			pst.setInt(1, empno); //WHERE deptno=?

			
			System.out.println("PreparedStatement is created : "+ pst);
			
			//4. execute that statement //  UR TABLENAME IS 
			int rows = pst.executeUpdate();
			
			System.out.println("Row DELETED : "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
