
public class ExceptionTest {
	public static void main(String[] args) {
		String str="Dassault Systemes Private Limited";
		int [] arr= {10,20,30,40,50};
		String name ="atraw";
		int num=100;
		int deno=0;
		
		try {
			System.out.println("Begin");
			System.out.println("String : "+str);
			System.out.println("Arr : "+arr[0]);
			System.out.println("Name : "+name.charAt(0));
			System.out.println("Div : "+ num/deno);
			
		}
		catch(NullPointerException ex1) {
			System.out.println("Exception "+ex1);
		}
		catch(ArrayIndexOutOfBoundsException ex2) {
			System.out.println("Exception "+ex2);
		}
		catch(StringIndexOutOfBoundsException ex3) {
			System.out.println("Exception "+ex3);
		}
		catch (ArithmeticException ex4) {
			System.out.println("Exception "+ex4);
		}
		catch (RuntimeException ex5) {
			System.out.println("Exception "+ex5);
		}
		catch (Exception ex6) {
			System.out.println("Exception "+ex6);
		}
		finally {
			System.out.println("End");
		}
		
	}
}
