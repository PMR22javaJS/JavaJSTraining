package testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dao.DepartmentDAO;
import dao.DepartmentDAOImplementation;
import entities.Department;

public class DepartmentDAOTesting {


	DepartmentDAO deptDAO = new DepartmentDAOImplementation();
	
	@Test
	public void selectTest() {
		
		System.out.println("Test started..");
		Assertions.assertTrue(deptDAO!=null);
		System.out.println("Got the DAO : "+deptDAO);

		Department deptObj = deptDAO.selectDepartment(10);
		
		System.out.println("Dept Obj : "+deptObj);

		System.out.println("Test over...");
	}

}
