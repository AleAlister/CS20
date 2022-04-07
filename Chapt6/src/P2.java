/*

Program: p2.java          Last Date of this Revision: April 7, 2022

Purpose: An application that displays whether or not a number is prime.

Author: Ali Al-sebbah, 
School: CHHS
Course: Computer Programming 20
 

*/

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		
		int num;//Declaration
		Scanner Scan = new Scanner(System.in); //Ready for input
	    System.out.print("Please enter a number: ");//Prompt user
		num=Scan.nextInt();//Record input
		   
		
		
	       {
	         if (isPrimeNumber(num))
	         {
	            System.out.println(num +" is a prime number");//Display
	         }
	         else {
	        	 
	        	 System.out.println(num +" is not a prime number");//Display
	         }
	         }
	       }
	    


	    public static boolean isPrimeNumber(int i) {
	        int F = 0;//Declaration
	        int F2 = 1;//Declaration

	        while(F2 <= i)
	        {
	            if(i % F2 == 0)
	            {
	                F++;
	            }
	            F2++;
	        }
	        return (F == 2);
	  }



	}//End class

