/*

Program: GuessinGame.java          Last Date of this Revision: April 4, 2022

Purpose: An application that adds all the odd digits leading up to the givin number.

Author: Ali Al-sebbah, 
School: CHHS
Course: Computer Programming 20
 

*/
import java.util.Scanner;
public class OddSum {

	public static void main(String[] args) {
		
		
		 Scanner Scan=new Scanner(System.in);//Ready for input
		 int num, count=1, add=0; //Declaration
		 
		 System.out.print("Please enter a number: ");//Prompts the user 
		 num=Scan.nextInt();//Records answer
		 
		 do
		 {
		 count+=2;
		 add+=count;
		 }
		 
		 while(count<num);
		 
		 System.out.println("The odd numbers sum is "+ add);
		 
		 Scan.close();//Closes input

	}//End class

}

/*
Please enter a number: 34
The odd numbers sum is 323

Please enter a number: 23
The odd numbers sum is 143


*/

