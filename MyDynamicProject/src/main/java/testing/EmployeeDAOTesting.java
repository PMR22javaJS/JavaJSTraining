package testing;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dao.EmployeeDAO;
import dao.EmployeeDAOImplementation;
import entities.Employee;

public class EmployeeDAOTesting {


	EmployeeDAO empDAO = new EmployeeDAOImplementation();
	
	@Test
	public void selectTest() {
		
		System.out.println("Test started..");
		Assertions.assertTrue(empDAO!=null);
		System.out.println("Got the DAO : "+empDAO);

		Employee empObj = empDAO.selectEmployee(7839);
		
		System.out.println("Emp Obj : "+empObj);

		System.out.println("Test over...");
	}
	
	@Test
	public void createEmployeeTest() {
		
		Employee emp = new Employee();
		Assertions.assertTrue(emp!=null);
		System.out.println("emp created....");
		
		emp.setEmployeeNumber(1111);
		emp.setEmployeeName("Rathan");
		emp.setEmailAddress("rathan@gmail.com");
		
		emp.setManagerCode(7839);
		emp.setEmployeeJob("Analyst");
		emp.setHiredate(new Date());
		
		emp.setSalary(3000);
		emp.setCommission(200);
		emp.setDepartmentNumber(40); //INVALID 50 doesnot exist in DEPT table
		
		empDAO.createEmployee(emp);
		
	}
	
	@Test
	public void modifyEmployeeTest() {
		
		Employee emp = new Employee();
		Assertions.assertTrue(emp!=null);
		System.out.println("emp created....");
		
		emp.setEmployeeNumber(1111);
		emp.setEmployeeName("Ratan");
		emp.setEmailAddress("ratan@gmail.com");
		
		emp.setManagerCode(7566);
		emp.setEmployeeJob("ANALYST");
		emp.setHiredate(new Date());
		
		emp.setSalary(3100);
		emp.setCommission(210);
		emp.setDepartmentNumber(20); //INVALID 50 doesnot exist in DEPT table
		
		empDAO.updateEmployee(emp);
		
	}
}
