package applicant;

import java.io.Serializable;

final class Details{
	long aadharCard;

	public long getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(long aadharCard) {
		this.aadharCard = aadharCard;
	}

	@Override
	public String toString() {
		return "Details [aadharCard=" + aadharCard + "]";
	}
}

public class Applicant implements Serializable{
	private String name;
	private int age;
	public Applicant(String name, int age, String dateOfBirth, String placeOfBirth, String timeOfBirth) {
		super();
		this.name = name;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.placeOfBirth = placeOfBirth;
		this.timeOfBirth = timeOfBirth;
	}

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
	
	@Override
	public String toString() {
		return "Applicant [name=" + name + ", age=" + age + ", dateOfBirth=" + dateOfBirth + ", placeOfBirth="
				+ placeOfBirth + ", timeOfBirth=" + timeOfBirth + "]";
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