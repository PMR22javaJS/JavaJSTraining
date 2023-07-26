
public class Validator {
	static boolean checkName(String name) {
		return (name.matches("^[a-zA-Z]*$"))?true:false;
	}
	
	static boolean checkAge(int age, int minVal, int maxVal) {
		return (age>=minVal && age<=maxVal)?true:false;
	}
	
	static boolean checkNameWithSpace(String cllgName) {
		return (cllgName.matches("^[a-zA-Z,' ']*$"))?true:false;
	}
	
	static boolean checkGender(char gender) {
		return (gender=='M' || gender=='F')?true:false;
	}
	
	static boolean checkSalary(float salary, float minVal, float maxVal) {
		return (salary>=minVal && salary<=maxVal) ? true : false;
	}
}