package service;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dao.DepartmentDAO;
import dao.DepartmentDAOImplementation;
import dao.EmployeeDAO;
import dao.EmployeeDAOImplementation;
import entities.Department;
import entities.Employee;

public class DepartmentEmployeeService {
	
	
	@Test
	public void showEmpsDeptWise() {
		
		DepartmentDAO deptDAO = new DepartmentDAOImplementation();
		Assertions.assertTrue(deptDAO!=null);
		
		EmployeeDAO empDAO = new EmployeeDAOImplementation();
		Assertions.assertTrue(empDAO!=null);
		
		Department dept = deptDAO.selectDepartment(30);
		Assertions.assertTrue(dept!=null);
		
		List<Employee> empList = empDAO.selectEmployees();
		for (Employee employee : empList) {
			if(employee.getDepartmentNumber() == dept.getDepartmentNumber()) {
				System.out.println("Employee : "+employee);
			}
		}

		
		
		
	}
}
