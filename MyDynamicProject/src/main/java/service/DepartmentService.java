package service;

import java.util.List;

import entities.Department;

public interface DepartmentService {
	void createDepartmentService(Department dept);
	Department findDepartmentService(int deptNumber);
	List<Department> findDepartmentsService();
	void modifyDepartment(Department dept);
	void removeDepartmentService(int deptNumber);
	
}
