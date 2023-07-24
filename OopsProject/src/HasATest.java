class Heart{
	void pumping() {
		System.out.println("Heart is Pumping.....");
	}
}

class Brain{
	void analyzing() {
		System.out.println("Brain is analyzing.....");
	}
}

class Kidney{
	void filtering() {
		System.out.println("Kidney is filtering.....");
	}
}

class Lung{
	void purifing() {
		System.out.println("Lungs is purifing");
	}
}

class Human{
	private Heart heart=new Heart();						//hasA 
	private Brain brain=new Brain();						//hasA relation
	private Kidney kidney=new Kidney();
	private Lung lung=new Lung();
	
	void pumpBlood() {
		heart.pumping();
	}
	void think() {
		brain.analyzing();
	}
	void filter() {
		kidney.filtering();
	}
	void airing() {
		lung.purifing();
	}
	
}

public class HasATest {
	public static void main(String[] args) {
		Human human =new Human();
		human.pumpBlood();
		human.think();
		human.filter();
		human.airing();
	}
}
