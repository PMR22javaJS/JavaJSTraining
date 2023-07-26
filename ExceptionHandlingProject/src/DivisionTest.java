class Calculator{
	static void divide(int num, int deno) {
		System.out.println("------------------------------");
		System.out.println("Dividing");
		System.out.println("Numerator " + num);
		System.out.println("Denominator "+deno);
		System.out.println("Trying to divide "+num + " by "+deno);
//		if(deno!=0) {
//			int divison=num/deno;
//			System.out.println("Divison " + divison);
//		}
//		else {
//			System.out.println("CANNOT DIVIDE BY ZERO");
//		}
		int divison=num/deno;
		System.out.println("Divison "+divison);
		System.out.println("End of program");
		System.out.println("------------------------------");
	}
}
public class DivisionTest {
	 public static void main(String[] args) {
		System.out.println("Begin");
		Calculator.divide(100, 4);
		try {
			Calculator.divide(40, 0);
		}
		catch(ArithmeticException ex) {
			System.out.println(ex);
		}
		Calculator.divide(50,5);
		System.out.println("End");
	 }
}
