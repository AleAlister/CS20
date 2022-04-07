/*

Program: GuessinGame.java          Last Date of this Revision: April 4, 2022

Purpose: An application that chooses a number between 1-20 and then asks the user to guess said number.

Author: Ali Al-sebbah, 
School: CHHS
Course: Computer Programming 20
 

*/


import java.util.Random; //random generator calling, generates a random number
import java.util.Scanner; //scanner calling generator
public class GuessinGame {
	
	  public static void main(String[] args) { 
	       
	        Scanner Scan = new Scanner(System.in); //Ready for input
	                                                   
	        Random rand = new Random(); //Generates random number
	 
	        int random = rand.nextInt(20) + 1;  
	                                            
	        System.out.print("please pick a number between 1-20: ");//Asking the user to guess a number between 1 - 20
	        int number = Scan.nextInt(); //Records Answer 
	        
	        
	        boolean found = false;
	        while (!found)
	        	{
          
	        	if (number == random)
	        	{ 
               System.out.println("Good guess!");
               break;
                }
	        	
	        	else if (number > random) 
	        	{ 
               System.out.println("You guess is too high, please try again:");
               number = Scan.nextInt();
                 } 
	        	
	        	else if (number < random)
	        	{ 
               System.out.println("Your guess is too low, please try again:");
               number = Scan.nextInt();
                }
	     
	    
	        	
	        }
	        
	        Scan.close(); //Closes input
	  }//End class
}

/* ScreenDump
 * please pick a number between 1-20: 13
Your guess is too low, please try again:
18
Your guess is too low, please try again:
19
Your guess is too low, please try again:
20
Good guess!
*/
