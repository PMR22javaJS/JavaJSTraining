class Calculator{
	static void divide(int num, int deno) throws Exception {
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
		if(deno==0)
		{
			throw new Exception("The deno is zero");
		}
		int divison=num/deno;
		System.out.println("Divison "+divison);
		System.out.println("End of program");
		System.out.println("------------------------------");
	}
}
public class DivisionTest {
	 public static void main(String[] args) {
		System.out.println("Begin");
		try {
			Calculator.divide(100, 4);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("The exception is "+e);
			
		}
		finally {
			System.out.println("The program is run regardless of the outcome and the inputs");
		}
		
		try {
			Calculator.divide(100, 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("The exception is "+e);
		}
		finally {
			System.out.println("The program is run regardless of the outcome and the inputs");
		}
		
		try {
			Calculator.divide(50,5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("The exception is "+e);
		}
		finally {
			System.out.println("The program is run regardless of the outcome and the inputs");
		}
		System.out.println("End");
	 }
}
