package dao;

public class ObjectPandit {
	ObjectPandit(){;
		System.out.println("In ctr............");
	}
	private String jointName;
	private int starsMatch;
	private boolean match;
	public String getJointName() {
		return jointName;
	}
	public void setJointName(String jointName) {
		this.jointName = jointName;
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
	
}