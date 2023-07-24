
class BankAppForm{
	private String applicantName;
	private String address;
	private long aadharNumber;
	private String panNumber;
	private String emailId;
	private String accountType;
	private int mobileNumber;
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public void showBankApplication() {
		System.out.println("----------Bank Application Form----------");
		System.out.println("Bank Applicant Name : "+applicantName);
		System.out.println("Bank Account Type   : "+accountType);
		System.out.println("Applicant Address   : "+address);
		System.out.println("Applicant's Adhaar  : "+aadharNumber);
		System.out.println("Applicant's PAN     : "+panNumber);
		System.out.println("Applicant's Email   : "+emailId);
		System.out.println("Applicant's Mobile  : "+mobileNumber);
	}
}

class BankAccount{
	private String accountHolder;
	private String ifscCode;
	private String accountType;
	private long accountNumber;
	private long balance;
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public void showAccountDetails() {
		System.out.println("----------Bank Account Details----------");
		System.out.println("Account Number      : "+accountNumber);
		System.out.println("Account Type        : "+accountType);
		System.out.println("Account Holder      : "+accountHolder);
		System.out.println("Bank Account IFSC   : "+ifscCode);
		System.out.println("Account Balance     : "+balance);
	}
}

class Bank{
	BankAccount formBankAccount(BankAppForm bankAppForm) {
		System.out.println("----------Bank Process----------");
		System.out.println("Application Form Recieved "+bankAppForm.getApplicantName());
		System.out.println("Creating Bank Account ");
		BankAccount bankAccObj=new BankAccount();
		
		double temp=Math.random()*100;
		long acc=(long)temp;
		bankAccObj.setAccountHolder(bankAppForm.getApplicantName());
		bankAccObj.setAccountNumber(acc);
		bankAccObj.setAccountType(bankAppForm.getAccountType());
		bankAccObj.setBalance(3000);
		bankAccObj.setIfscCode("SSS00010203");
		
		return bankAccObj;
		
	}
	
	BankAccount formJointAccount(BankAppForm bankForm1, BankAppForm bankForm2) {
		BankAccount jointAccObj=new BankAccount();
		double temp=Math.random()*100;
		long acc=(long)temp;
		
		jointAccObj.setAccountHolder(bankForm1.getApplicantName()+" "+bankForm2.getApplicantName());
		jointAccObj.setAccountType("Joint");
		jointAccObj.setAccountNumber(acc);
		jointAccObj.setBalance(3000);
		jointAccObj.setIfscCode("SSS00010203");
		
		return jointAccObj;
	}
}

public class BankApplicationTest {
	public static void main(String[] args) {
		BankAppForm bankFormObj1=new BankAppForm();
		bankFormObj1.setAadharNumber(1234567899);
		bankFormObj1.setAccountType("Savings");
		bankFormObj1.setAddress("Pune Hinjewadi");
		bankFormObj1.setApplicantName("Derek Jason");
		bankFormObj1.setEmailId("123@mail.com");
		bankFormObj1.setMobileNumber(1023456789);
		bankFormObj1.setPanNumber("PAN0001111");
		bankFormObj1.showBankApplication();
		
		BankAppForm bankFormObj2=new BankAppForm();
		bankFormObj2.setAadharNumber(987065432);
		bankFormObj2.setAccountType("Savings");
		bankFormObj2.setAddress("Pune Hinjewadi");
		bankFormObj2.setApplicantName("Sean Jason");
		bankFormObj2.setEmailId("sean.123@mail.com");
		bankFormObj2.setMobileNumber(1980645752);
		bankFormObj2.setPanNumber("PAN0009999");
		bankFormObj2.showBankApplication();
		
		Bank bank=new Bank();
		BankAccount bankAccObj1=bank.formBankAccount(bankFormObj1);
		BankAccount bankAccObj2=bank.formBankAccount(bankFormObj2);
		bankAccObj1.showAccountDetails();
		bankAccObj2.showAccountDetails();
		
		BankAccount jointAccObj1=bank.formJointAccount(bankFormObj1, bankFormObj2);
		jointAccObj1.showAccountDetails();
	}
}
