interface Transport{
	void type();
}

interface LandTransport extends Transport{
	void noOfWheel();
}

interface WaterTransport extends Transport{
	void ballast();
}

interface AirTransport extends Transport{
	void cockPit();
}

abstract class TwoWheelLand implements LandTransport{
	abstract void discBrake();
}

abstract class FourWheelLand implements LandTransport{
	abstract void handBrake();
}

abstract class TwoWayWater implements WaterTransport{
	abstract void propeller();
}

abstract class GroupWayWater implements WaterTransport{
	abstract void deck();
}

abstract class MiniAir implements AirTransport{
	abstract void personalBooking();
}

abstract class LargeAir implements AirTransport{
	abstract void cargo();
}

class Bike extends TwoWheelLand{
	public void type() {
		System.out.println("Bike is Land Transport");
	}
	
	public void noOfWheel() {
		System.out.println("There are two wheels");
	}

	public void discBrake() {
		System.out.println("Bike has 2 disc Brakes");
	}
	
	public void noOfMembers() {
		System.out.println("Their are 3 persons");
	}
}

class Car extends FourWheelLand{
	public void type() {
		System.out.println("Car is Land Transport");
	}
	
	public void noOfWheel() {
		System.out.println("Car has 4 wheels");
	}
	
	public void handBrake() {
		System.out.println("Car has a hand Brake");
	}
	
	public void noOfMembers() {
		System.out.println("Car can have 5 seats");
	}
}

class JetSki extends TwoWayWater{
	public void type() {
		System.out.println("Jet Ski is Water Transport");
	}
	
	public void ballast(){
		System.out.println("Jet Ski has ballast in front");
	}
	
	public void propeller() {
		System.out.println("Jet Ski propeller is slow");
	}
	
	public void noOfMembers() {
		System.out.println("Jet Ski has 2 members");
	}
}

class Boat extends GroupWayWater{
	public void type() {
		System.out.println("Boat is Water Transport");
	}
	
	public void ballast() {
		System.out.println("Boat has ballast in back");
	}
	
	public void deck() {
		System.out.println("Boat has small deck");
	}
	
	public void noOfMembers() { 
		System.out.println("Boat has large capacity");
	}
}

class ChartedPlane extends MiniAir{
	public void type() {
		System.out.println("Charted Plane is Air Transport");
	}
	
	public void cockPit() { 
		System.out.println("Charted Plane has small cockpit");
	}
	
	public void personalBooking() {
		System.out.println("Charted Plane requires personal booking");
	}
}

class AirBus extends LargeAir{
	public void type() {
		System.out.println("AirBus is Air Transport");
	}
	
	public void cockPit() {
		System.out.println("AirBus has Large cockpit");
	}
	
	public void cargo() {
		System.out.println("AirBus can carry cargoes");
	}
}

public class RangeOfTransport {
	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.type();
		bike.noOfWheel();
		bike.discBrake();
		bike.noOfMembers();
		
		System.out.println("------------------------------------------------------");
		
		Car car=new Car();
		car.type();
		car.noOfWheel();
		car.handBrake();
		car.noOfMembers();
		
		System.out.println("------------------------------------------------------");
		
		JetSki jetSki=new JetSki();
		jetSki.type();
		jetSki.ballast();
		jetSki.propeller();
		jetSki.noOfMembers();
		
		System.out.println("------------------------------------------------------");
		
		Boat boat=new Boat();
		boat.type();
		boat.ballast();
		boat.deck();
		boat.noOfMembers();
		
		System.out.println("------------------------------------------------------");
		
		ChartedPlane charPlane=new ChartedPlane();
		charPlane.type();
		charPlane.cockPit();
		charPlane.personalBooking();
		
		System.out.println("------------------------------------------------------");
		
		AirBus airBus=new AirBus();
		airBus.type();
		airBus.cockPit();
		airBus.cargo();
		
	}
}