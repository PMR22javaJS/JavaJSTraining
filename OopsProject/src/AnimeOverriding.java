class AnimeA{
	void show() {
		System.out.println("The Master Anime Fan is here");
	}
}

class AnimeB extends AnimeA{
	@Override
	void show() {
		System.out.println("The SubMaster Anime Fan is here");
	}
}

class AnimeC extends AnimeB{
	@Override
	void show() {
		System.out.println("The LittleMaster Anime Fan is here");
	}
}


public class AnimeOverriding {
	public static void main(String[] args) {
		AnimeA animeCobj=new AnimeC();
		animeCobj.show();
	}
}
