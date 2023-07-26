
public class CustomExceptionTest {
	public static void main(String[] args) 
	{
		System.out.println("MAIN started...\n");
		
		try {
			Car myCar = new Car();
			myCar.longDrive();
		}
		catch(CarKeyNotFoundException ex1) {
			System.out.println("Key Issue : "+ex1);
		} catch (DieselOver ex2) {
			// TODO Auto-generated catch block
			System.out.println("Diesel Issue : "+ex2);
		} catch (BatteryCharged ex3) {
			// TODO Auto-generated catch block
			System.out.println("Battery Issue "+ex3);
		}
		System.out.println("\nMAIN finished...\n");
		
	}
}

class CarKeyNotFoundException extends Exception
{
	CarKeyNotFoundException(String msg) {
		super(msg);
	}
}
class DieselOver extends Exception{
	DieselOver(String msg){
		super(msg);
	}
}
class BatteryCharged extends Exception{
	BatteryCharged(String msg){
		super(msg);
	}
}
class RedSignalDishnouredException extends RuntimeException
{
	RedSignalDishnouredException(String msg) {
		super(msg);
	}
}
class TirePunctured extends RuntimeException{
	TirePunctured(String msg){
		super(msg);
	}
}
class EngineBreakDown extends RuntimeException{
	EngineBreakDown(String msg){
		super(msg);
	}
}

class Car
{
	boolean keyFound=false;
	
	Car() throws CarKeyNotFoundException, DieselOver, BatteryCharged
	{
		double value = Math.random()%10;
		double fuel=Math.random()%10;
		double charge=Math.random()%10;
		
		if(value>=0.20) {
			keyFound=true;
		}
		
		if(keyFound==true) {
			System.out.println("Car is started....");
			
		}
		else {
			//System.out.println("Car Key Not Found....");
			throw new CarKeyNotFoundException("Hey...Where is the Car Key? im not getting it...");
			
		}
		
		if(fuel>0.20) {
			System.out.println("Car has enough fuel");
		}
		else {
			throw new DieselOver("Diesel is not enough");
		}
		
		if(charge>0.20) {
			System.out.println("Battery is enough charged");
		}
		else {
			throw new BatteryCharged("Battery not fully charged");
		}
	}
	public void longDrive() {
		for (int i = 1; i <=30; i++) {
			System.out.println(i+" kms driven....");
			double value = Math.random()%10;
			double temp=Math.random()%10;
			double var=Math.random()%10;
			if(value>0.95) {
				RedSignalDishnouredException ex1 = new RedSignalDishnouredException("Oh No!!! Red signal is dishonoured....");
				throw ex1;
			}
			if(temp>0.90) {
				throw new TirePunctured("Tire is Punctured");
			}
			if(var>0.90) {
				throw new EngineBreakDown("Engine is broken down");
			}
		}
	}
}