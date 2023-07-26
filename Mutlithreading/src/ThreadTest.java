class Car extends Thread{
	String model;
	int delay;
	
	public Car(String model, int delay) {
		super();
		this.model = model;
		this.delay = delay;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(model + " is running ........."+(i+1));
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Bus extends Thread{
	String model;
	int delay;
	
	public Bus(String model, int delay) {
		super();
		this.model = model;
		this.delay = delay;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(model + " is running ........."+(i+1));
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest {
	public static void main(String[] args) {
		Car car1=new Car("Swift",1000);
		Car car2=new Car("Lambo",1000);
		Car car3=new Car("Maruti",1000);
		car1.start();
		car2.start();
		car3.start();
		
		Bus bus1=new Bus("AAA",10);
		Bus bus2=new Bus("BBB",10);
		Bus bus3=new Bus("CCC",10);
		bus1.start();
		bus2.start();
		bus3.start();
		try {
			car1.join();
			car2.join();
			car3.join();
			bus1.join();
			bus2.join();
			bus3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("END");
	}
}
