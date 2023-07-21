
class Doctor{
	void diagnose() {
		System.out.println("Doctor : Go for diagnosis");
	}
}

class Surgeon extends Doctor{
	void diagnose() {
		System.out.println("Surgeon : Go for diagnosis");
	}
	void prescribe() {
		System.out.println("Surgeon : Prescribe 1000");
	}
	void cut() {
		System.out.println("Surgeon : Cut the bacterial part");
	}
	void stitch() {
		System.out.println("Surgeon : Stitch the organ");
	}
}	

class HeartSurgeon extends Surgeon{
	void diagnose() {
		System.out.println("HeartSurgeon : Go for diagnosis");
	}
//	void prescribe() {
//		System.out.println("HeartSurgeon : Prescribe 3000");
//	}
//	void cut() {
//		System.out.println("HeartSurgeon : Cut the Heart bacterial part");
//	}
//	void stitch() {
//		System.out.println("HeartSurgeon : Stitch the Heart organ");
//	}
}

public class ClassExtensionTest {
	public static void main(String[] args) {
//		Doctor x=new Doctor();
//		Surgeon x=new Surgeon();
		Surgeon x=new HeartSurgeon();
		x.diagnose();
		x.cut();
		x.stitch();
//		if(x instanceof Doctor) {
//			System.out.println("It's a Doctor Object");
//		}
//		else {
//			System.out.println("It's not a Doctor Object");
//		}
//		
//		if(x instanceof Surgeon) {
//			System.out.println("It's a Surgeon Object");
//		}
//		else {
//			System.out.println("It's not a Surgeon Object");
//		}
//		
//		if(x instanceof HeartSurgeon) {
//			System.out.println("It's a Heart Surgeon Object");
//		}
//		else {
//			System.out.println("It's not a Heart Surgeon Object");
//		}
	}
}
