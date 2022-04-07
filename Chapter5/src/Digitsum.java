/*

Program: GuessinGame.java          Last Date of this Revision: April 4, 2022

Purpose: An application that adds togther the digits of a number.

Author: Ali Al-sebbah, 
School: CHHS
Course: Computer Programming 20
 

*/

import java.util.Scanner;
public class Digitsum {
	
	public static void main(String args[])  
	{  
	
	int number, digit, sum = 0;  //Declaration
	
	Scanner sc = new Scanner(System.in);  //Ready for input
	System.out.print("Enter the number: "); //Asks for part1 
	number = sc.nextInt();  //Records Part 1
	
	
	while(number > 0)  
	{    
	digit = number % 10;  
	sum = sum + digit;  
	number = number / 10;  
	}  

	System.out.println("Sum of Digits: "+sum);  //Prints the sum of Part 1
	
	
	}//End class
}

/*
Enter the number: 2667
Sum of Digits: 21
*/