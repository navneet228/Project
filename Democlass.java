package ComputerPackage;

import java.util.Scanner;

public class Democlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner kb = new Scanner(System.in);
		System.out.println("WElcome to my Electro Store : ");
		System.out.println("Please give me the brand you want ");
		String br = kb.nextLine();
		System.out.println("Please give me the Model you want ");
		String Md = kb.nextLine();
		System.out.println("The Serial Of your Computer is : ");
		long Serial_number= kb.nextLong();
//		long SN=kb.nextLong() ;
		System.out.print("Please Enter the price ");
		double Pr = kb.nextDouble();
		
		Computer c1= new Computer("Apple","Pro",1,4505.00);
		System.out.println("Info of Computer 1: ");
		c1.ShowInfo();
		
		Computer c2= new Computer(br,Md,Serial_number,Pr);
		System.out.println("Info of Computer 2: ");
		c2.ShowInfo();			
		
		
		kb.close();
	}

}
