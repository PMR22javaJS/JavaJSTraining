package pandit;
import java.io.Serializable;

import applicant.Applicant;
import matrimonial.Matrimonial;

public class Pandit implements Runnable,Serializable {
	Applicant app1;
	Applicant app2;
	Matrimonial matriObj;
	
	
	@Override
	public String toString() {
		return "FILE READING -------------->"+getMatriObj();
	}


	public Pandit(Applicant app1, Applicant app2) {
		super();
		this.app1 = app1;
		this.app2 = app2;
	}
	
	
	public Matrimonial getMatriObj() {
		return matriObj;
	}

	public void setMatriObj(Matrimonial matriObj) {
		this.matriObj = matriObj;
	}
	
	public String getName() {
		return matriObj.getJointName();
	}
	
	public int getStars() {
		return matriObj.getStarsMatch();
	}
	
	public boolean getIsMatch() {
		return matriObj.isMatch();
	}
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(app1.getName()+" and "+app2.getName()+" form is in review procedure...............");
		}
		matriObj=this.checkingComparable(app1,app2);
		System.out.println(matriObj.toString());
	}
	
	public Matrimonial checkingComparable(Applicant app1, Applicant app2) {
		
		matriObj=new Matrimonial();
		matriObj.welcome();
		String name=app1.getName()+" "+app2.getName();
		if(Validator.checkStringWithSpace(name)) {
			matriObj.setJointName(name);
		}
		else {
			RuntimeException runtimeNameEx=new RuntimeException("Invalid name...."+name);
			throw runtimeNameEx;
		}
		if(Validator.checkNumber(5000.0f, 1000.0f, 10000.0f)) {
			matriObj.setFees(5000);
		}
		else {
			RuntimeException runtimeNumEx=new RuntimeException("Invalid fees....");
		}
		int diff=app1.getAge()-app2.getAge();
		matriObj.setStarsMatch(diff);
		boolean check;
		if((app1.getAge()-app2.getAge())>8) {
			matriObj.setMatch(false);
			check=false;
		}
		else {
			matriObj.setMatch(true);
			check=true;
		}
		
		return matriObj;
	}
}