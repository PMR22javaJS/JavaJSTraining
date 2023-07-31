class Applicant{
	private String name;
	private int age;
	private String dateOfBirth;
	private String placeOfBirth;
	private String timeOfBirth;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	public String getTimeOfBirth() {
		return timeOfBirth;
	}
	public void setTimeOfBirth(String timeOfBirth) {
		this.timeOfBirth = timeOfBirth;
	}
	
	public void showApplicantDetails() {
		System.out.println("----------Applicant Details----------");
		System.out.println("Name : "+name);
		System.out.println("Age "+age);
		System.out.println("Date of Birth "+dateOfBirth);
		System.out.println("Place of Birth "+placeOfBirth);
		System.out.println("Time Of Birth "+timeOfBirth);
	}
}

class Matrimonial{
	private String jointName;
	private float fees;
	private int starsMatch;
	private boolean match;
	public String getJointName() {
		return jointName;
	}
	public void setJointName(String jointName) {
		this.jointName = jointName;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	public int getStarsMatch() {
		return starsMatch;
	}
	public void setStarsMatch(int starsMatch) {
		this.starsMatch = starsMatch;
	}
	public boolean isMatch() {
		return match;
	}
	public void setMatch(boolean match) {
		this.match = match;
	}
	
	public void showJointDetails() {
		System.out.println("----------Joint Details----------");
		System.out.println("Joint Name : "+jointName);
		System.out.println("Fees : "+fees);
		System.out.println("Stars Match : "+starsMatch);
		System.out.println("Decision : "+match);
	}
}

class Pandit{
	Matrimonial checkingComparable(Applicant app1, Applicant app2) {
		Matrimonial matriObj=new Matrimonial();
		matriObj.setJointName(app1.getName()+" "+app2.getName());
		matriObj.setFees(5000);
		matriObj.setStarsMatch(app1.getAge()-app2.getAge());
		if((app1.getAge()-app2.getAge())>8) {
			matriObj.setMatch(false);
		}
		else {
			matriObj.setMatch(true);
		}
		return matriObj;
	}
}

public class Kundali {
	public static void main(String[] args) {
		Applicant person1=new Applicant();
		person1.setName("Rahul Singh");
		person1.setAge(29);
		person1.setDateOfBirth("27/02/1991");
		person1.setPlaceOfBirth("Delhi");
		person1.setTimeOfBirth("01:50:59");
		
		Applicant person2=new Applicant();
		person2.setName("Simran Kaur");
		person2.setAge(23);
		person2.setDateOfBirth("27/02/1997");
		person2.setPlaceOfBirth("Haridwar");
		person2.setTimeOfBirth("03:48:37");
		
		person1.showApplicantDetails();
		person2.showApplicantDetails();
		
		Pandit pandit=new Pandit();
		Matrimonial matrObj1=pandit.checkingComparable(person1, person2);
		matrObj1.showJointDetails();
	}
}
