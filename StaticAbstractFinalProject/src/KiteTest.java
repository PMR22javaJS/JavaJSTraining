class Kite{
	private String owner;
	private String color;
	private int length;
	private boolean flying;
	
	private static int kiteCount;
	
	public static void showKite() {
		System.out.println("-----------Total kites in the sky "+kiteCount+"---------------");
	}

	public Kite(String owner, String color, int length, boolean flying ) {
		super();
		this.owner = owner;
		this.color = color;
		this.length = length;
		this.flying = flying;
		kiteCount++;
	}
	
	public void showKiteDetails() {
		System.out.println("Kite Owner "+owner);
		System.out.println("Kite Color "+color);
		System.out.println("Kite Length "+length);
		System.out.println("Kite Flying "+flying);
		Kite.showKite();
	}
	
	public void kiteFight(Kite kiteObj) {
		System.out.println(this.owner+" Kite initiated the fight with "+kiteObj.owner);
		for(int i=0;i<=20;i++) {
			System.out.println("Kites are fighting .............");
			double value=Math.random()%10;
			
			if(value<0.20) {
				kiteCount--;
				this.flying = false;
				System.out.println(this.owner+" lost");
				break;
			}
			
			if(value>0.80) {
				kiteCount--;
				kiteObj.flying = false;
				System.out.println(kiteObj.owner+" lost");
				break;
			}
			
			if(value>0.30 && value<0.50) {
				kiteCount-=2;
				this.flying = false;
				kiteObj.flying= false;
				System.out.println(this.owner + " and " + kiteObj.owner+" both lost the fight");
				break;
			}
		}
		System.out.println("Total kites in the sky "+Kite.kiteCount);
	}

	@Override
	public String toString() {
		return "Kite [owner=" + owner + ", color=" + color + ", length=" + length + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}

public class KiteTest {
	public static void main(String[] args) {
		Kite.showKite();
		Kite kiteObj1=new Kite("Drek","Red",5,true);
		kiteObj1.showKiteDetails();
		Kite kiteObj2=new Kite("Rain","Blue",9,true);
		kiteObj2.showKiteDetails();
		Kite kiteObj3=new Kite("James","White",10,true);
		kiteObj3.showKiteDetails();
		Kite kiteObj4=new Kite("Jason","Pink",9,true);
		kiteObj4.showKiteDetails();
		Kite kiteObj5=new Kite("Boater","Orange",5,true);
		kiteObj5.showKiteDetails();
		kiteObj4.kiteFight(kiteObj5);
	}
}
