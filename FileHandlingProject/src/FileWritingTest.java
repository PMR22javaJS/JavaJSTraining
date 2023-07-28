
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWritingTest {
	public static void main(String[] args) {
		try {
			FileOutputStream fileOutputStream=new FileOutputStream("queen.txt");
			String str="Taylor Swift is our music industry";
			
			byte arr[]=str.getBytes();
			fileOutputStream.write(arr);
			System.out.println("The file is created");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
