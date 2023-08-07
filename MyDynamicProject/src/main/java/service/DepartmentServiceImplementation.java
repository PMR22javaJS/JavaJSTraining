package service;

import java.util.List;

import dao.DepartmentDAO;
import dao.DepartmentDAOImplementation;
import entities.Department;

public class DepartmentServiceImplementation implements DepartmentService {

	DepartmentDAO deptDAO= new DepartmentDAOImplementation();
	
	@Override
	public void createDepartmentService(Department dept) {
		// TODO Auto-generated method stub
		deptDAO.insertDepartment(dept);
	}

	@Override
	public Department findDepartmentService(int deptNumber) {
		// TODO Auto-generated method stub
		return deptDAO.selectDepartment(deptNumber);
	}

	@Override
	public List<Department> findDepartmentsService() {
		// TODO Auto-generated method stub
		return deptDAO.selectDepartments();
	}

	@Override
	public void modifyDepartment(Department dept) {
		// TODO Auto-generated method stub
		deptDAO.updateDepartment(dept);
	}

	@Override
	public void removeDepartmentService(int deptNumber) {
		// TODO Auto-generated method stub
		deptDAO.deleteDepartment(deptNumber);
	}

}
