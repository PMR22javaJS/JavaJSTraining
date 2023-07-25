final class Details{
	private final long aadharNumber;
	private static String panNumber;
	private String name;
	
	Details(long aadhar, String pan, String nameOfPerson){
		aadharNumber=aadhar;
		panNumber=pan;
		name=nameOfPerson;
	}
	
	void show() {
		System.out.println(aadharNumber);
		System.out.println(panNumber);
	}

	@Override
	public String toString() {
		return "Details [name=" + name + "]";
	}
}

class AdditionalDetails{ 
	private String address;
	private long mobileNumber;
	
	public AdditionalDetails(String address, long mobileNumber) {
		this.address = address;
		this.mobileNumber = mobileNumber;
	}

	void myShow() {
		System.out.println(address);
		System.out.println(mobileNumber);
	}

	@Override
	public String toString() {
		return "AdditionalDetails [address=" + address + ", mobileNumber=" + mobileNumber + "]";
	}
}

public class FinalFieldTest {
	public static void main(String[] args) {
		
		Details detailsObj=new Details(123455678, "PAN0101010","Raj");
		System.out.println(detailsObj.toString());
		detailsObj.show();
	}
}
