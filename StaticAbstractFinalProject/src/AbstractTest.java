
public class AbstractTest {
	public static void main(String[] args) {
		
				//Cannot instantiate the type GeometricalShape
		GeometricalShape geoShape = new Square(40);
		
		geoShape.calcArea();
		geoShape.calcPerimeter();
		
		System.out.println("-------------");
		
		geoShape = new Rectangle(50,60);
		geoShape.calcArea();
		geoShape.calcPerimeter();
		
		System.out.println("-------------");
		
		geoShape =new  RoundedRectangle(10,20,2);
		geoShape.calcArea();
		geoShape.calcPerimeter();
	}
}


abstract class GeometricalShape
{
	abstract void calcArea(); //METHOD WITHOUT BODY
	abstract void calcPerimeter();
	
	void fillColor() { //METHOD WITH BODY
		System.out.println("Filling color...");
	}
}
//The type Square must implement the inherited abstract method GeometricalShape.calcArea()
class Square extends GeometricalShape //inheritance of implementation
{
	private int side;
	
	public Square(int side) {
		super();
		this.side = side;
	}
	
	void calcArea() {//MANDATORY
		float area = side * side;
		System.out.println("Square area : "+area);
	}
	void calcPerimeter() { //MANDATORY
		float perimeter = 4 * side;
		System.out.println("Perimeter of Square : "+perimeter);
	}

	public int getSide() {
		return side;
	}
	
}

class Rectangle extends Square //inheritance of derivation
{
	int breadth;

	public Rectangle(int side, int breadth) {
		super(side);
		this.breadth = breadth;
	}
	
	void calcArea() {//MANDATORY
		float area = getSide() * breadth;
		System.out.println("Rectangle area : "+area);
	}
	public int getBreadth() {
		return breadth;
	}

	void calcPerimeter() { //MANDATORY
		float perimeter = 2*(getSide() + breadth);
		System.out.println("Perimeter of Rectangle : "+perimeter);
	}	
}

class RoundedRectangle extends Rectangle{
	private int radius; 
	public RoundedRectangle(int side, int breadth , int radius) {
		super(side, breadth);
		// TODO Auto-generated constructor stub
		this.radius=radius;
	}
	
	void calcArea() {
		System.out.println("Rounded Rectangle Area : "+(getSide()*getBreadth()-(4-3.14f)*radius*radius));
	}
	
	void calcPeri(){
		System.out.println("Rounded Rectangle Perimeter : "+(2*(getSide()+getBreadth())-(8-2*3.14f)*radius));
	}
	
}