package entities;

import java.util.Date;

public class Employee {
	private int employeeNumber;
	private String employeeName;
	private String emailAddress;
	private String employeeJob;
	private int managerCode;
	private Date hiredate;
	private int salary;
	private int commission;
	private int departmentNumber;
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getEmployeeJob() {
		return employeeJob;
	}
	public void setEmployeeJob(String employeeJob) {
		this.employeeJob = employeeJob;
	}
	public int getManagerCode() {
		return managerCode;
	}
	public void setManagerCode(int managerCode) {
		this.managerCode = managerCode;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getCommission() {
		return commission;
	}
	public void setCommission(int commission) {
		this.commission = commission;
	}
	public int getDepartmentNumber() {
		return departmentNumber;
	}
	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}
	@Override
	public String toString() {
		return "Employee [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", emailAddress="
				+ emailAddress + ", employeeJob=" + employeeJob + ", managerCode=" + managerCode + ", hiredate="
				+ hiredate + ", salary=" + salary + ", commission=" + commission + ", departmentNumber="
				+ departmentNumber + "]";
	}
	 
	
}
