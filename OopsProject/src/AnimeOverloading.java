class AnimeName{
	void show(String name) {
		System.out.println("The name of anime is "+name);
	}
	void show(int rating) {
		System.out.println("The rating of the anime is "+rating);
	}
	void show(float rating) {
		System.out.println("The rating in myAnimeList is "+rating);
	}
	void show(String name1, String name2) {
		System.out.println("The name of the main character is "+name1+" and the villian name is "+name2);
	}
	void show(String name, int number) {
		System.out.println("The creator of the anime is "+name+" and he has written "+number+" of manga chapters");
	}
}


public class AnimeOverloading {
	public static void main(String[] args) {
		AnimeName animeName=new AnimeName();
		animeName.show("Attack on Titan");
		animeName.show(4.7f);
		animeName.show(5);
		animeName.show("Eren Yeager","Humans");
		animeName.show("Hajiyame",227);
	}
}
