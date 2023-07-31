package kundali;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

import applicant.Applicant;
import matrimonial.Matrimonial;
import pandit.Pandit;
import dao.*;

public class KundaliChecker {
	public static void main(String[] args) {
		Applicant person1=new Applicant("Rahul Singh",29,"27/02/1991","Delhi","01:50:59");
		Applicant person2=new Applicant("Simran Kaur",23,"27/02/1997","Haridwar","03:48:37");
		Applicant person3=new Applicant("Vikram Pratap",26,"27/02/1997","Patna","02:05:50");
		Applicant person4=new Applicant("Roshini Kumari",24,"27/02/1999","Indore","12:09:34");
		
		
		System.out.println("-----------------------------------------------------------------");
		person1.showApplicantDetails();
		System.out.println("-----------------------------------------------------------------");
		person2.showApplicantDetails();
		System.out.println("-----------------------------------------------------------------");
		person3.showApplicantDetails();
		System.out.println("-----------------------------------------------------------------");
		person4.showApplicantDetails();
		System.out.println("-----------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------");
		
		
		Pandit pandit1=new Pandit(person1, person2);
		Pandit pandit2=new Pandit(person3, person4);
		
		Thread thread1=new Thread(pandit1);
		Thread thread2=new Thread(pandit2);
		
		thread1.start();
		thread2.start();
		
		Matrimonial matrObj1=pandit1.getMatriObj();
		Matrimonial matrObj2=pandit2.getMatriObj();
		
		ArrayList<Pandit> marriage=new ArrayList<Pandit>();
		marriage.add(pandit1);
		marriage.add(pandit2);
		
		try {
			FileOutputStream fout = new FileOutputStream("xyz.txt",false);
			
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			
			oos.writeObject(marriage);
			oos.close();
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileInputStream fin = new FileInputStream("xyz.txt");
			
			ObjectInputStream ois = new ObjectInputStream(fin);
			@SuppressWarnings("unchecked")
			ArrayList<Pandit> accList = 	(ArrayList<Pandit>) ois.readObject();
				
				Iterator<Pandit> accIterator = accList.iterator();
				
				while(accIterator.hasNext()) {
					Pandit matri = accIterator.next();
					System.out.println(matri.toString());
				}
			ois.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			thread1.join();
			thread2.join();
		}
		catch(InterruptedException ex) {
			System.out.println("The exception is : "+ex);
		}
		

		
	}
}