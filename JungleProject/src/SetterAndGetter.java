class Anime{
	private String animeName;
	private float rating;
	private String heroName;
	private String villianName;
	
	public String getHeroName() {
		return heroName;
	}
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
	public String getVillianName() {
		return villianName;
	}
	public void setVillianName(String villianName) {
		this.villianName = villianName;
	}
	public String getAnimeName() {
		return animeName;
	}
	public void setAnimeName(String animeName) {
		this.animeName = animeName;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	
	
}
public class SetterAndGetter {
	public static void main(String[] args) {
		Anime animeObj1=new Anime();
		animeObj1.setAnimeName("Jujutsu Kaisen");
		animeObj1.setHeroName("Gojo Satoru");
		animeObj1.setRating(4.6f);
		animeObj1.setVillianName("Saime");
		
		System.out.println("Anime Name is "+animeObj1.getAnimeName());
		System.out.println("Hero Name is "+animeObj1.getHeroName());
		System.out.println("Rating Name is "+animeObj1.getRating());
		System.out.println("Villian Name is " +animeObj1.getVillianName());
		
		Anime animeObj2=new Anime();
		animeObj2.setAnimeName("Demon Slayer");
		animeObj2.setHeroName("Nezoku");
		animeObj2.setRating(4.8f);
		animeObj2.setVillianName("Muzan Kibutsuji");
		
		System.out.println("Anime Name is "+animeObj2.getAnimeName());
		System.out.println("Hero Name is "+animeObj2.getHeroName());
		System.out.println("Rating Name is "+animeObj2.getRating());
		System.out.println("Villian Name is " +animeObj2.getVillianName());
		
	}
}
