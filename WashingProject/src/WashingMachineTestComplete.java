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

public class WashingMachineTestComplete {
	public static void main(String[] args) throws OutOfWater, OutOfElec, OutOfTime, OutOfCloths {
//		System.out.println("wash powder : "+washPowder); //toString is invoked
//		String material, String color, float cost, String type, boolean clean
		
		Cloth cloth1= new Cloth("fabric","red",9.0f,"jeans",false);
		Cloth clothObj1 []=new Cloth[1];
		clothObj1[0]=cloth1;
		WashingPowder washPowder1 = new WashingPowder(100,"Nirma", "Front Load", true, 10.0f);
		Electricity elecObj1=new Electricity("AC",8.2f,10,2,"Reliance");
		Water water1=new Water("Soft",2,"35");
		
		WashingMachine washMachine1=new WashingMachine("Samsung",washPowder1, water1, elecObj1, clothObj1);
		Thread thread1=new Thread(washMachine1);
		
		
		Cloth cloth2= new Cloth("silk","white",19.0f,"shirt",false);
		Cloth clothObj2 []=new Cloth[1];
		clothObj2[0]=cloth2;
		WashingPowder washPowder2 = new WashingPowder(200,"Surf", "Back", true, 20.0f);
		Electricity elecObj2=new Electricity("AC",18.2f,20,4,"JIO");
		Water water2=new Water("Hard",4,"40");
		
		WashingMachine washMachine2=new WashingMachine("HP",washPowder2, water2, elecObj2, clothObj2);
		Thread thread2=new Thread(washMachine2);
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		}
		catch(InterruptedException ex) {
			System.out.println("The exception is : "+ex);
		}
		
		Laundry laundry1=washMachine1.wash();
		Laundry laundry2=washMachine2.wash();
		System.out.println(laundry1.toString());
		System.out.println(laundry2.toString());
		
	}

	@Override
	public String toString() {
		return "WashingMachineTestSir [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}

class Machine {
	
}
class WashingMachine extends Machine implements Runnable{ //isA
	
//	WashingTub washTub = new WashingTub(); //hasA
		private String brand;
		WashingPowder washPowder;
		Water water;
		Electricity elect;
		Cloth [] cloth;
		
		WashingMachine(String brand,WashingPowder washPowder, Water water, Electricity elect, Cloth [] cloth1){
			this.brand=brand;
			this.washPowder=washPowder;
			this.water=water;
			this.elect=elect;
			this.cloth=cloth1;
		}
		
		public void run() {
			for(int i=0;i<1000;i++) {
				System.out.println(brand+" is running............");
			}
			try {
				this.wash();
			} catch (OutOfWater e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (OutOfElec e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (OutOfTime e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (OutOfCloths e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		Laundry wash() throws  OutOfWater, OutOfElec, OutOfTime, OutOfCloths {
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
			for(int i=0;i<cloth.length;i++) {
				cloth[i].setClean(true);
			}
			
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
	
	public Laundry() {
	}
	
	public Laundry(int numberOfCloths, float timeRequired, float totalCost, float waterUsed, float electricityUsed,
			float costOfWashingPowder) {
		super();
		this.numberOfCloths = numberOfCloths;
		this.timeRequired = timeRequired;
		this.totalCost = totalCost;
		this.waterUsed = waterUsed;
		this.electricityUsed = electricityUsed;
		this.costOfWashingPowder = costOfWashingPowder;
	}

	@Override
	public String toString() {
		return "Laundry [numberOfCloths=" + numberOfCloths + ", timeRequired=" + timeRequired + ", totalCost="
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
	private int quantity;
	private String temperature;
	
	public Water(String type, int quantity, String temperature) {
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
	public int getQuantity() {
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
	private int unitUsed;
	private String supplier;
	public Electricity(String type, float voltage, int costPerUnit, int unitUsed, String supplier) {
		super();
		this.type = type;
		this.voltage = voltage;
		this.costPerUnit = costPerUnit;
		this.unitUsed = unitUsed;
		this.supplier = supplier;
	}
	public float getTime() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		return "Electricity [type=" + type + ", voltage=" + voltage + ", costPerUnit=" + costPerUnit + ", unitUsed="
				+ unitUsed + ", supplier=" + supplier + "]";
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
	public int getCostPerUnit() {
		return costPerUnit;
	}
	public void setCostPerUnit(int costPerUnit) {
		this.costPerUnit = costPerUnit;
	}
	public int getUnitUsed() {
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
