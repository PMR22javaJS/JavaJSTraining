class Anime2{
	private String animeName;
	private float rating;
	private String heroName;
	private String villianName;
	
	Anime2(String animeName, float rating, String heroName, String villianName){		//parameterized constructor
		this.animeName=animeName;
		this.rating=rating;
		this.heroName=heroName;
		this.villianName=villianName;
	}
	
	void printHello() {							//no argument | no return
		System.out.println("Hello weebs");
	}
	
	float getNewRating(float temp) {			//with return | with argument
		this.rating=temp;
		return 1.5f*rating;
	}
	
	void setRating(float rating) {				//no return | with argument
		this.rating=rating;
	}
	
	String getVillianName() {					//no argument | with return 
		return this.villianName;
	}
	
	public void printField() {					//print method
		System.out.println("Anime name is " + this.animeName);
		System.out.println("Rating is "+ this.rating);
		System.out.println("Hero Name is " + this.heroName);
		System.out.println("Villian Name is "+this.villianName);
	}
}
public class FourTypesOfFunction {
	public static void main(String[] args) {
		Anime2 anime2obj=new Anime2("Demon Slayer", 4.8f, "Nezuko", "Muzan");
		anime2obj.printHello();
		anime2obj.printField();
		anime2obj.setRating(4.5f);
		System.out.println("The villian name is "+anime2obj.getVillianName());
		float newRate=anime2obj.getNewRating(1.5f);
		System.out.println("The new rating is "+newRate);
		System.out.println(anime2obj.getVillianName());
	}
}
