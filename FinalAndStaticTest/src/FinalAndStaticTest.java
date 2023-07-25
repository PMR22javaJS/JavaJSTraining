final class PersonalDetails{
	String panCard;
	long aadharCard;
	String dob;
	
	PersonalDetails(String panCard, long aadharCard, String dob){
		this.panCard=panCard;
		this.aadharCard=aadharCard;
		this.dob=dob;
	}
	
	long getAadhar() {
		return aadharCard;
	}
	
	String getPan() {
		return panCard;
	}
	
	String getDob() {
		return dob;
	}
	
	void showPersonal() {
		System.out.println("Aadhar Number : "+aadharCard);
		System.out.println("Pan Number : "+panCard);
		System.out.println("Date of Birth : "+dob);
	}
	
}

class FormForBike{
	private final String name;
	private String address;
	private static String brand;
	
	FormForBike(String name, String address,String brand){
		this.name=name;
		this.address=address;
		FormForBike.brand=brand;
	}
	
//	public void setBrand(String brand) {
//		FormForBike.brand=brand;
//	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public static String getBrand() {
		return brand;
	}
	
	void showFormBike() {
		System.out.println("Name : "+name );
		System.out.println("Address : "+address);
		System.out.println("Brand : "+brand);
	}
	
}

public class FinalAndStaticTest {
	public static void main(String[] args) {
		PersonalDetails personalObj=new PersonalDetails("PAN102040",1030405050,"01-01-1990");
		FormForBike bikeObj=new FormForBike("Derek","Delhi","Yamaha");
		personalObj.showPersonal();
		bikeObj.showFormBike();
		
	}
}
