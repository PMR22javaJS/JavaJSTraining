import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingTest{
	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream=new FileInputStream("king.txt");
			byte ch=(byte)fileInputStream.read();
			
			while(ch != -1) {
				System.out.print((char)ch);
				ch=(byte)fileInputStream.read();
				Thread.sleep(100);
			}
			
			fileInputStream.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

