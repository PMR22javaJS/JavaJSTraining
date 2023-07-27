import java.util.InputMismatchException;
import java.util.Scanner;

class OutOfTime extends Exception{
	OutOfTime(String msg){
		super(msg);
	}
}

class OutOfElec extends Exception{
	OutOfElec(String msg){
		super(msg);
	}
}

class OutOfWater extends Exception{
	OutOfWater(String msg){
		super(msg);
	}
}

class OutOfCloths extends Exception{
	OutOfCloths(String msg){
		super(msg);
	}
}



public class WashingMachineTest {
	public static void main(String[] args) {
//		System.out.println("wash powder : "+washPowder); //toString is invoked
		Scanner scannerObj1=new Scanner(System.in);
		System.out.println("Enter the size of cloth you want to insert in washing machine");
		int size=scannerObj1.nextInt();
		Cloth [] cloth1=new Cloth[size];
		System.out.println("The size of clothes in washing machine is : "+size);
		try {
			for(int i=0;i<size;i++) {
				System.out.println("Enter the details of "+(i+1)+" cloth");
				System.out.println("Enter the material");
				String material=scannerObj1.next();
				System.out.println("Enter the color");
				String color=scannerObj1.next();
//				System.out.println("Enter the cost");
//				String temp=scannerObj.nextLine();
//				float cost=Float.parseFloat(scannerObj.nextLine());
				float cost;
				System.out.println("Enter the type");
				String type=scannerObj1.next();
				if(type.equalsIgnoreCase("Inner")) cost=10.0f;
				else if(type.equalsIgnoreCase("Tshirt")) cost=20.0f;
				else if(type.equalsIgnoreCase("Shirt")) cost=25.0f;
				else if(type.equalsIgnoreCase("Pants") || type.equalsIgnoreCase("Trousers")) cost=30.0f;
				else cost=40.f;
				boolean clean=false;
				cloth1[i]=new Cloth(material,color,cost,type,clean);
				System.out.println("------------------------------");
			}
		}
		catch(InputMismatchException ip) {
			System.out.println("The exception : "+ip);
		}
		WashingPowder washPowder1 = new WashingPowder(100,"Nirma", "Front Load", true, 10.0f);
		Electricity elecObj1=new Electricity("AC",8.2f,10,7.0f,"Reliance",15.0f);
		Water water1=new Water("Soft",30.0f,"35");
		
		
		
//		System.out.println(laundryObj1.toString());
//		for(int i=0;i<size;i++) {
//			System.out.println(cloth1[i].toString());
//		}
		
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		
		Scanner scannerObj2=new Scanner(System.in);
		System.out.println("Enter the size of cloth you want to insert in washing machine");
		int size2=scannerObj2.nextInt();
		Cloth [] cloth2=new Cloth[size];
		System.out.println("The size of clothes in washing machine is : "+size);
		try {
			for(int i=0;i<size;i++) {
				System.out.println("Enter the details of "+(i+1)+" cloth");
				System.out.println("Enter the material");
				String material=scannerObj2.next();
				System.out.println("Enter the color");
				String color=scannerObj2.next();
//				System.out.println("Enter the cost");
//				String temp=scannerObj.nextLine();
//				float cost=Float.parseFloat(scannerObj.nextLine());
				float cost;
				System.out.println("Enter the type");
				String type=scannerObj2.next();
				if(type.equalsIgnoreCase("Inner")) cost=10.0f;
				else if(type.equalsIgnoreCase("Tshirt")) cost=20.0f;
				else if(type.equalsIgnoreCase("Shirt")) cost=25.0f;
				else if(type.equalsIgnoreCase("Pants") || type.equalsIgnoreCase("Trousers")) cost=30.0f;
				else cost=40.f;
				boolean clean=false;
				cloth1[i]=new Cloth(material,color,cost,type,clean);
				System.out.println("------------------------------");
			}
		}
		catch(InputMismatchException ip) {
			System.out.println("The exception : "+ip);
		}
		WashingPowder washPowder2 = new WashingPowder(75,"Surf", "Back Pa", true, 8.0f);
		Electricity elecObj2=new Electricity("AC",6.8f,9,5.0f,"Jio",7.0f);
		Water water2=new Water("Soft",30.0f,"35");
		
		
		
//		System.out.println(laundryObj2.toString());
		
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		
		Scanner scannerObj3=new Scanner(System.in);
		System.out.println("Enter the size of cloth you want to insert in washing machine");
		int size3=scannerObj3.nextInt();
		Cloth [] cloth3=new Cloth[size];
		System.out.println("The size of clothes in washing machine is : "+size);
		try {
			for(int i=0;i<size;i++) {
				System.out.println("Enter the details of "+(i+1)+" cloth");
				System.out.println("Enter the material");
				String material=scannerObj3.next();
				System.out.println("Enter the color");
				String color=scannerObj3.next();
//				System.out.println("Enter the cost");
//				String temp=scannerObj.nextLine();
//				float cost=Float.parseFloat(scannerObj.nextLine());
				float cost;
				System.out.println("Enter the type");
				String type=scannerObj3.next();
				if(type.equalsIgnoreCase("Inner")) cost=10.0f;
				else if(type.equalsIgnoreCase("Tshirt")) cost=20.0f;
				else if(type.equalsIgnoreCase("Shirt")) cost=25.0f;
				else if(type.equalsIgnoreCase("Pants") || type.equalsIgnoreCase("Trousers")) cost=30.0f;
				else cost=40.f;
				boolean clean=false;
				cloth3[i]=new Cloth(material,color,cost,type,clean);
				System.out.println("------------------------------");
			}
		}
		catch(InputMismatchException ip) {
			System.out.println("The exception : "+ip);
		}
		WashingPowder washPowder3 = new WashingPowder(80,"Rim", "Happp", true, 7.5f);
		Electricity elecObj3=new Electricity("AC",9.8f,4,7.0f,"Vodafone",11.0f);
		Water water3=new Water("Soft",30.0f,"35");
		
		
		
//		System.out.println(laundryObj3.toString());
		
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		
		WashingMachine washMachine1=new WashingMachine("Washing Machine 1");
		WashingMachine washMachine2=new WashingMachine("Washing Machine 2");
		WashingMachine washMachine3=new WashingMachine("Washing Machine 3");
		
		Laundry laundryObj1 = null;
		Laundry laundryObj2 = null;
		Laundry laundryObj3 = null;
		
		try {
			laundryObj1=washMachine1.wash(washPowder1,water1,elecObj1,cloth1);
			laundryObj2=washMachine2.wash(washPowder2,water2,elecObj2,cloth2);
			laundryObj3=washMachine3.wash(washPowder3,water3,elecObj3,cloth3);
		} catch (OutOfWater e1) {
			// TODO Auto-generated catch block
			System.out.println("The Water Exception : "+e1);
		} catch (OutOfElec e2) {
			// TODO Auto-generated catch block
			System.out.println("The Electricit Exception : "+e2);
		} catch (OutOfTime e3) {
			// TODO Auto-generated catch block
			System.out.println("The Time Exception : "+e3);
		} catch (OutOfCloths e4) {
			// TODO Auto-generated catch block
			System.out.println("The Cloths Exception : "+e4);
		}
		
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		
		washMachine1.start();
		washMachine2.start();
		washMachine3.start();
		
		try {
			washMachine1.join();
			washMachine2.join();
			washMachine3.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(laundryObj1.toString());	
		System.out.println(laundryObj2.toString());
		System.out.println(laundryObj3.toString());
	}
}

class WashingMachine extends Thread{ //isA
	
		private String model;
		WashingMachine(String model){
			this.model=model;
		}
		public void run() {
			for(int i=0;i<50;i++) {
				System.out.println(model + " is running...................");
			}
		}
	
		Laundry wash(WashingPowder washPowder, Water water, Electricity elect, Cloth cloth[]) throws  OutOfWater, OutOfElec, OutOfTime, OutOfCloths{
			Laundry laundryObj=new Laundry();
			if(cloth.length>0) {
				laundryObj.setNumberOfCloths(cloth.length);
			}
			else {
				throw new OutOfCloths("It is out of cloths ");
			}
			
			float time=(float)(Math.random()*100);
			if(time<101.0f) {
				laundryObj.setTimeRequired(elect.getTime());
			}
			else {
				throw new OutOfTime("It is out of time ");
			}																																																																																																																												
			
			float waterUsed=(float)(Math.random()*100);
			if(waterUsed>1.0f) {
				laundryObj.setWaterUsed(water.getQuantity());
			}
			else {
				throw new OutOfWater("It is out of Water ");
			}
			
			float elecUsed=(float)(Math.random()*10);
			if(elecUsed<10.0f) {
				laundryObj.setElectricityUsed(elect.getUnitUsed());
			}
			else {
				throw new OutOfElec("It is out of electricity ");
			}
			
			laundryObj.setCostOfWashingPowder(washPowder.getPrice());
			float temp=washPowder.getPrice()+elect.getCostPerUnit()*elect.getUnitUsed()*cloth.length;
			laundryObj.setTotalCost(temp);

//			for(int i=0;i<cloth.length;i++) {
//				cloth[i].setClean(true);
//			}
				
			return laundryObj;
		}
}

class Laundry {
	private int numberOfCloths; //cloth.length
	private float timeRequired;
	private float totalCost ;// cloth.length * price per cloth
	private float waterUsed;
	private float electricityUsed;
	private float costOfWashingPowder; //
	private float perCloth;
	
	public Laundry() {
	}
	
	public Laundry(int numberOfCloths, float timeRequired, float totalCost, float waterUsed, float electricityUsed,
			float costOfWashingPowder, float perCloth) {
		super();
		this.numberOfCloths = numberOfCloths;
		this.timeRequired = timeRequired;
		this.totalCost = totalCost;
		this.waterUsed = waterUsed;
		this.electricityUsed = electricityUsed;
		this.costOfWashingPowder = costOfWashingPowder;
		this.perCloth=perCloth;
	}

	@Override
	public String toString() {
		return "Laundry [numberOfCloths=" + numberOfCloths + ", totalCost="
				+ totalCost + ", waterUsed=" + waterUsed + ", electricityUsed=" + electricityUsed
				+ ", costOfWashingPowder=" + costOfWashingPowder + "]";
	}

	public int getNumberOfCloths() {
		return numberOfCloths;
	}

	public void setNumberOfCloths(int numberOfCloths) {
		this.numberOfCloths = numberOfCloths;
	}

	public float getTimeRequired() {
		return timeRequired;
	}

	public void setTimeRequired(float timeRequired) {
		this.timeRequired = timeRequired;
	}

	public float getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}

	public float getWaterUsed() {
		return waterUsed;
	}

	public void setWaterUsed(float waterUsed) {
		this.waterUsed = waterUsed;
	}

	public float getElectricityUsed() {
		return electricityUsed;
	}

	public void setElectricityUsed(float electricityUsed) {
		this.electricityUsed = electricityUsed;
	}

	public float getCostOfWashingPowder() {
		return costOfWashingPowder;
	}

	public void setCostOfWashingPowder(float costOfWashingPowder) {
		this.costOfWashingPowder = costOfWashingPowder;
	}
	public float getPerCloth() {
		return perCloth;
	}

	public void setPerCloth(float perCloth) {
		this.perCloth = perCloth;
	}
	
	public void showLaundry() {
		System.out.println("The no. of cloths : "+this.numberOfCloths);
		System.out.println("The time required : "+this.timeRequired);
		System.out.println("The total cost : "+this.totalCost);
		System.out.println("The water used : "+this.waterUsed);
		System.out.println("The cost of washing powder : "+this.costOfWashingPowder);
		System.out.println("The electricity used : "+this.electricityUsed);
	}

}

class Tub {
	
}

class WashingTub  extends Tub {
	private int capacity;
	private String type; //
	public WashingTub() {
		super();
		this.capacity = capacity;
		this.type = type;
	}
	@Override
	public String toString() {
		return "WashingTub [capacity=" + capacity + ", type=" + type + "]";
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}

class Powder {
	
}

class WashingPowder extends Powder { // isA

	private int quantity;
	private String brand;
	private String type;
	private boolean scented;
	private float price;
	
	public WashingPowder(int quantity, String brand, String type, boolean scented, float price) {
		super();
		this.quantity = quantity;
		this.brand = brand;
		this.type = type;
		this.scented = scented;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "WashingPowder [quantity=" + quantity + ", brand=" + brand + ", type=" + type + ", scented=" + scented
				+ ", price=" + price + "]";
	}
	/*public String toString() {
		String str = (scented) ? "Scented" :"Not Scented";
		return str+ " "+brand+" Washing Powder of "+type+ " type quantity used "+quantity+ " grams ";
	}*/

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isScented() {
		return scented;
	}

	public void setScented(boolean scented) {
		this.scented = scented;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
}

class Water {
	private String type;
	private float quantity;
	private String temperature;
	
	public Water(String type, float quantity, String temperature) {
		super();
		this.type = type;
		this.quantity = quantity;
		this.temperature = temperature;
	}
	@Override
	public String toString() {
		return "Water [type=" + type + ", quantity=" + quantity + ", temperature=" + temperature + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

}

class Electricity {
	private String type; //ac dc
	private float voltage; 
	private int costPerUnit;
	private float unitUsed;
	private String supplier;
	private float time;
	public Electricity(String type, float voltage, int costPerUnit, float unitUsed, String supplier, float time) {
		super();
		this.type = type;
		this.voltage = voltage;
		this.costPerUnit = costPerUnit;
		this.unitUsed = unitUsed;
		this.supplier = supplier;
		this.time=time;
	}
	@Override
	public String toString() {
		return "Electricity [type=" + type + ", voltage=" + voltage + ", costPerUnit=" + costPerUnit + ", unitUsed="
				+ unitUsed + ", supplier=" + supplier + ",time= "+time+"]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getVoltage() {
		return voltage;
	}
	public void setVoltage(float voltage) {
		this.voltage = voltage;
	}
	public float getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getCostPerUnit() {
		return costPerUnit;
	}
	public void setCostPerUnit(int costPerUnit) {
		this.costPerUnit = costPerUnit;
	}
	public float getUnitUsed() {
		return unitUsed;
	}
	public void setUnitUsed(int unitUsed) {
		this.unitUsed = unitUsed;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	
	
	
}

class Cloth {
	private String material; //
	private String color;
	private float cost;
	private String type;
	private boolean clean; //
	
	public Cloth(String material, String color, float cost, String type, boolean clean) {
		super();
		this.material = material;
		this.color = color;
		this.cost = cost;
		this.type = type;
		this.clean = clean;
	}
	@Override
	public String toString() {
		return "Cloth [material=" + material + ", color=" + color + ", cost=" + cost + ", type=" + type + ", clean="
				+ clean + "]";
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isClean() {
		return clean;
	}
	public void setClean(boolean clean) {
		this.clean = clean;
	}
}