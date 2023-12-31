
class Desktop{
	private int length;
	private int breadth;
	
	Desktop(int length, int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	
	public void show() {
		System.out.println("The length is "+this.length);
		System.out.println("The breadth is "+this.breadth);
	}
}

class Laptop extends Desktop{
	private int pixel;
	
	Laptop(int length, int breadth, int pixel){
		super(length, breadth);
		this.pixel=pixel;
	}
	
	@Override
	public void show() {
		super.show();
		System.out.println("The pixel is "+pixel);
	}
}

class IPad extends Laptop{
	private boolean camera;
	
	IPad(int length, int breadth, int pixel, boolean camera){
		super(length, breadth, pixel);
		this.camera=camera;
	}
	
	@Override
	public void show() {
		super.show();
		System.out.println("The camera is present : "+camera);
	}	
}


public class InheritanceTest {
	public static void main(String[] args) {
		IPad ipad=new IPad(15,25,55,true);
		ipad.show();
		
	}
}
