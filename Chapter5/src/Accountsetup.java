/*

Program: AccountSetup.java          Last Date of this Revision: April 4, 2022

Purpose: An application that creates a username and password for the user.

Author: Ali Al-sebbah, 
School: CHHS
Course: Computer Programming 20
 

*/


import java.util.Scanner;
import java.lang.String;
public class Accountsetup {

	public static void main(String[] args) {
		
		 String password, username;//Declaration
		 int passwordLength;//Declaration
		 Scanner input = new Scanner(System.in);//Ready for input
		 
		 System.out.print("Enter a username:  ");// Ask for part 1
		 username = input.next();//Record Part 1
		 System.out.print("Enter a password that is at least 8 characters:  ");// Ask for part 2
		 password = input.next();//Record Part 2
		 passwordLength = password.length();
		 
		 //Prevents password under 8 characters 
		 while (passwordLength < 8) {
		 System.out.print("Enter a password thats at least 8 characters:  ");
		 password = input.next();
		 passwordLength = password.length();
		 }
		 input.close(); //Closes scan
		 
		 System.out.println("Your username is " + username.toLowerCase() + " and your password is "+ password.toLowerCase()); // Prints final parts
		 
		
		

	}//End class

}

/*
Enter a username:  C20Student
Enter a password that is at least 8 characters:  Ytaasdw12
Your username is c20student and your password is ytaasdw12
*/