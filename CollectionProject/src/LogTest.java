
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class Log{
	private String logType;
	private String logBy;
	private LocalDateTime logDateTime;
	private String logMessage;
	public Log(String logType, String logBy, LocalDateTime logDateTime, String logMessage) {
		super();
		this.logType = logType;
		this.logBy = logBy;
		this.logDateTime = logDateTime;
		this.logMessage=logMessage;
	}
	@Override
	public String toString() {
		return "Log [logType=" + logType + ", logBy=" + logBy + ", logDateTime=" + logDateTime + ", logMessage="
				+ logMessage + "]";
	}
	
}


public class LogTest{
	public static void main(String[] args) {
		System.out.println("Creating new content");
		Log log1=new Log("AAA","GO",LocalDateTime.now(),"INFO");
		Log log2=new Log("BBB","ON",LocalDateTime.now(),"DEL");
		Log log3=new Log("CCC","KUN",LocalDateTime.now(),"DEBUG");
		Log log4=new Log("DDD","DWDA",LocalDateTime.now(),"FILE");
		Log log5=new Log("EEE","QSAA",LocalDateTime.now(),"NEW");
		System.out.println("Content created");
		
		ArrayList arrayList1=new ArrayList();
		System.out.println("Container created");
		System.out.println("Adding contents into the container");
		arrayList1.add(log1);
		arrayList1.add(log2);
		arrayList1.add(log3);
		arrayList1.add(log4);
		arrayList1.add(log5);
		System.out.println("Entire content added to the container");
		
		LinkedList linkedList1=new LinkedList();
		linkedList1.add(log1);
		linkedList1.add(log2);
		linkedList1.add(log3);
		linkedList1.add(log4);
		linkedList1.add(log5);
		
		Iterator iterator1=arrayList1.iterator();
		while(iterator1.hasNext()) {
			Log x=(Log)iterator1.next();
			System.out.println("Log in array list : "+x);
		}
		
		System.out.println("---------------------------------------------");
		
		Iterator iterator2=linkedList1.iterator();
		while(iterator2.hasNext()) {
			Log x=(Log) iterator2.next();
			System.out.println("Log in linked list : "+x);
		}
	}
}
