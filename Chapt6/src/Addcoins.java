/*

Program: Addcoins.java          Last Date of this Revision: April 4, 2022

Purpose: An application that adds coin values.

Author: Ali Al-sebbah, 
School: CHHS
Course: Computer Programming 20
 

*/


import java.text.DecimalFormat;
import java.util.Scanner;

public class Addcoins {

	public static void main(String[] args) {


		Scanner Scan = new Scanner(System.in);//Ready for input
		int QU, DI, NI, PE, TO,total ;// declaration
		System.out.print("Please enter the total amount of coins: ");//Prompts user
		TO=Scan.nextInt();//Records input
		
		System.out.print("Please enter the amount of Quarters: ");//Prompts user
		QU=Scan.nextInt();//Records input
		
		System.out.print("Please enter the amount of Dimes: ");//Prompts user
		DI=Scan.nextInt();//Records input
		
		System.out.print("Please enter the amount of Nickels: ");//Prompts user
		NI=Scan.nextInt();//Records input
		
		System.out.print("Please enter the amount of Pennies: ");//Prompts user
		PE=Scan.nextInt();//Records input
		
		DecimalFormat fmt = new DecimalFormat("$#,###.##");
	    System.out.println("Total:"+fmt.format(calctotal(QU, DI, NI, PE)));
		
		
		
		
	}
		
		
		public static double calctotal(int QU, int DI, int NI, int PE) {
		    double total;// declaration
		    total=((0.25 * QU) + (0.1 * DI) + (0.05 * NI) + (0.01 * PE));//Calculation
			
		    return (total);
	
		    

	}//End class
		
	
			
		
		
	

}
