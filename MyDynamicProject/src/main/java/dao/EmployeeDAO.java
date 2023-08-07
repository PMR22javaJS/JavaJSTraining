package dao;

import java.util.List;

import entities.Employee;

public interface EmployeeDAO {
	void createEmployee(Employee emp);
	Employee selectEmployee(int empno);
	List<Employee> selectEmployees();
	void updateEmployee(Employee emp);
	void deleteEmployee(int empno);
	
}
