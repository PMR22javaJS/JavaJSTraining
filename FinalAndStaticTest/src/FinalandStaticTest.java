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

class ShowRoom{
	private boolean available;
	private String name;
	private long idCard;
	private String address;
	
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getIdCard() {
		return idCard;
	}
	public void setIdCard(long idCard) {
		this.idCard = idCard;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	void showRoomDetails() {
		System.out.println("Name : "+name);
		System.out.println("Id Card : "+idCard);
		System.out.println("Address : "+address);
		System.out.println("Availability : "+available);
	}
	
}

class Dealer{
	ShowRoom show(FormForBike form, PersonalDetails details) {
		ShowRoom showObj=new ShowRoom();
		showObj.setAddress(form.getAddress());
		showObj.setAvailable(true);
		showObj.setIdCard(details.getAadhar());
		showObj.setName(form.getName());
		return showObj;
	}
}

public class FinalandStaticTest {
	public static void main(String[] args) {
		PersonalDetails personalObj=new PersonalDetails("PAN102040",1030405050,"01-01-1990");
		FormForBike bikeObj=new FormForBike("Derek","Delhi","Yamaha");
		personalObj.showPersonal();
		System.out.println("------------------------------------------------------------------");
		bikeObj.showFormBike();
		System.out.println("------------------------------------------------------------------");
		Dealer dealer=new Dealer();
		ShowRoom bikerObj=dealer.show(bikeObj, personalObj);
		bikerObj.showRoomDetails();
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------");
		
		PersonalDetails personalObj2=new PersonalDetails("NAP0214234",623462565,"27-07-2001");
		FormForBike bikeObj2=new FormForBike("Bhide","Indore","Yamaha");
		personalObj2.showPersonal();
		System.out.println("------------------------------------------------------------------");
		bikeObj2.showFormBike();
		System.out.println("------------------------------------------------------------------");
		Dealer dealer2=new Dealer();
		ShowRoom bikerObj2=dealer.show(bikeObj2, personalObj2);
		bikerObj2.showRoomDetails();
	}
}