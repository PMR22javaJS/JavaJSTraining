interface Flying{
	void flying();
}

interface Landing{
	void land();
}

abstract class Flight implements Flying, Landing{
	
}

interface Ticketing{
	void checkTicket();
}
class CommercialFlight extends Flight implements Ticketing{

	@Override
	public void flying() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkTicket() {
		// TODO Auto-generated method stub
		
	}
	
}

public class FlightTest {
	public static void main(String[] args) {
		
	}
}
