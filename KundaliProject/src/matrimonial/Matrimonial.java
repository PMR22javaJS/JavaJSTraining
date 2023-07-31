package matrimonial;

import java.io.Serializable;

interface Welcome{
	void welcome();
}

public class Matrimonial implements Welcome,Serializable{
	private String jointName;
	private float fees;
	private int starsMatch;
	private boolean match;
	
	public Matrimonial(){
		
	}
	
	public Matrimonial(String jointName, float fees, int starsMatch, boolean match) {
		super();
		this.jointName = jointName;
		this.fees = fees;
		this.starsMatch = starsMatch;
		this.match = match;
	}
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
	
	@Override
	public String toString() {
		return "Matrimonial [jointName=" + jointName + ", fees=" + fees + ", starsMatch=" + starsMatch + ", match="
				+ match + "]";
	}
	public void showJointDetails() {
		System.out.println("----------Joint Details----------");
		System.out.println("Joint Name : "+jointName);
		System.out.println("Fees : "+fees);
		System.out.println("Stars Match : "+starsMatch);
		System.out.println("Decision : "+match);
	}
	@Override
	public void welcome() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Matrimonial Site...........");
	}
}