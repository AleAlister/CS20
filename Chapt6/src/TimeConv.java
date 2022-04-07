/*

Program: TimeConv.java          Last Date of this Revision: April 7, 2022

Purpose: An application that converts time.

Author: Ali Al-sebbah, 
School: CHHS
Course: Computer Programming 20
 

*/

import java.util.Scanner;

public class TimeConv {

	public static void main(String[] args) {
		
		
		int input;// declaration 

		 Scanner Scan=new Scanner(System.in);//Ready for input

		 //Promoting the user for input
		 System.out.println("Enter 0 for hours to minutes");

		 System.out.println("Enter 1 for days to hours");

		 System.out.println("Enter 2 for minutes to hours");

		 System.out.println("Enter 3 for hours to days");

		 input=Scan.nextInt();
		
		 
		 if(input==0)
		 {
		 hourstominutes();
		 }
		 else if(input==1)
		 {
			 daystohours();
	     } 
		 else if(input==2)
		 {
			 minutestohours();
		 }
		 else if(input==3) 
		 {
				 hourstodays();
	     }

			 }
			 

		 

	 public static void hourstominutes(){

	 int hours,minutes;//Declaration 

	 Scanner Scan =new Scanner(System.in);//Ready for input

	 System.out.println("Please enter the amount of hours you want to convert: ");//Prompts user

	 hours=Scan.nextInt();//Records input

	 Scan.close();//Closes input

	 minutes=hours*60;//Calculation

	 System.out.println("There is "+minutes+" minutes in "+hours+" hours");//Display

	 }
		 

	 

	 public static void daystohours(){

	 int hours,days;//Declaration

	 Scanner scan =new Scanner(System.in);//Ready for input

	 System.out.println("Please enter the amount of days you want to convert: ");//Prompts user

	 days=scan.nextInt();//Records input

	 scan.close();//Closes input

	 hours=days*24;//Calculation

	 System.out.println("There is "+hours+" hours in "+days+" days");//Display

	 }

	 

	 public static void minutestohours(){

	 int hours,minutes;//Declaration 

	 Scanner scan =new Scanner(System.in);//Ready for input

	 System.out.println("Please enter the amount of minutes you want to convert: ");//Prompts user

	 minutes=scan.nextInt();//Records input

	 scan.close();//Closes input

	 hours=minutes/60;//Calculation

	 System.out.println("There is "+hours+" hours in "+minutes+" minutes");//Display

	 }

	 

	 public static void hourstodays(){

	 int hours,days;//Declaration 

	 Scanner scan =new Scanner(System.in);//Ready for input

	 System.out.println("Please enter the amount of hours you want to convert: ");//Prompts user

	 hours=scan.nextInt();//Records input

	 scan.close();//Closes input

	 days=hours/24;//Calculation

	 System.out.println("There is "+days+" days in "+hours+" hours");//Display

	 }


	

}
