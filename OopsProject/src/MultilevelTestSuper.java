class Person{
	private String name;
	private char gender;
	private int age;
//	Person(){
//		System.out.println("Person() ctor....");
//	}
	Person(String name, char gender, int age){
		if(Validator.checkName(name)) {
			this.name=name;
		}
		else {
			throw new RuntimeException("Invalid Name");
		}
		
		if(Validator.checkGender(gender)) {
			this.gender=gender;
		}
		else {
			throw new RuntimeException("Invalid Gender");
		}
		
		if(Validator.checkAge(age,1,120)) {
			this.age=age;
		}
		else {
			throw new RuntimeException("Invalid Age");
		}
	}
	void show() {
		System.out.println("Name : "+this.name);
		System.out.println("Gender : "+this.gender);
		System.out.println("Age : "+this.age);
	}
	
}

class Student extends Person{
	private int rollNo;
	private String collegeName;
	private String stream;
//	Student(){
//		System.out.println("Student() ctor....");
//	}
	Student(String name, char gender, int age,int rollNo, String collegeName, String stream){
		super(name,gender,age);
		if(Validator.checkNameWithSpace(collegeName)) {
			this.collegeName=collegeName;
		}
		else {
			throw new RuntimeException("Invalid College Name");
		}
		
		if(Validator.checkNameWithSpace(stream)) {
			this.stream=stream;
		}
		else {
			throw new RuntimeException("Invalid Stream");
		}
		this.rollNo=rollNo;
	}
	@Override
	void show() {
		super.show();
		System.out.println("Roll Number : "+this.rollNo );
		System.out.println("College Name : "+this.collegeName);
		System.out.println("Stream : "+this.stream);
	}
}


class Employee extends Student{
	private int empId;
	private String role;
	private float salary;
//	Employee(){
//		System.out.println("Employee() ctor....");
//	}
	Employee(String name, char gender, int age, int rollNo, String collegeName, String stream,int empId, String role, float salary){
		super(name,gender,age,rollNo,collegeName,stream);
		this.empId=empId;
		if(Validator.checkNameWithSpace(role)) {
			this.role=role;
		}
		else {
			throw new RuntimeException("Invalid Role");
		}
		if(Validator.checkSalary(salary, 35000.0f, 72000.0f)) {
			this.salary=salary;
		}
		else {
			throw new RuntimeException("Invalid Salary");
		}
	}
	@Override
	void show() {
		super.show();
		System.out.println("Employee Id : "+this.empId);
		System.out.println("Role : "+this.role);
		System.out.println("Salary : "+this.salary );
	}
}


public class MultilevelTestSuper {
	public static void main(String[] args) {
		Employee empObj =new Employee("Derek",'M',25,19117070,"NITRR","ECE",100754,"ASE",72000.50f);
		empObj.show();
	}
}
