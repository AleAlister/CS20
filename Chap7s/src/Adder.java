/*

Program: Adder.java          Last Date of this Revision: April 4, 2022

Purpose: An application that asks an addition question while giving points for being correct and taking away points for incorrect answers

Author: Ali Al-sebbah, 
School: CHHS
Course: Computer Programming 20
 

*/


import java.util.Scanner; 
import java.util.Random;
public class Adder {
	
	

	public static void main(String[] args) {
	
	 

		
	
		
	    Scanner san = new Scanner(System.in);//Ready for input
		Random rand = new Random(); //Ready for random number
		int N1 =  rand.nextInt(20) + 1;//Calcs 1 random number
		int N2 = rand.nextInt(20) + 1;//Calcs 2 random number
		AdderC c = new AdderC();//Insert class

		//Declarations
		int T=3;
		int R=2;
		int L=1;		
		int guess;
		int A;
		int score;
		A= N1 +N2;
		int cont;

		
		System.out.println("Please solve this question: "+ N1 + " + " +N2);//Output
		
		guess = san.nextInt();//Records input
		
		
		
		while(guess != -1)
		{
			   if(guess == A)
			   {
				   c.addPoints(5); //Uses class to store/add points
				 System.out.println("You have "+c.givepoints()+ " Points");//Displays points/Output
				
			   }
			   
			   else
			   {
				   if(c.givepoints() > 0)
				   {
					   c.takePointsAway();//Uses class to store/subtract points
					   System.out.println("You have "+c.givepoints()+ " Points");//Displays points/Output
				   }
				   else
				   {
					   System.out.println("You do not have any points");//Output
				   }
			   }
			
			   
			   //Calculations
			  N1 =  rand.nextInt(20) + 1;
			N2 = rand.nextInt(20) + 1;
			A= N1 +N2;
			   System.out.println("Please solve this question: "+ N1 + " + " +N2);//Output
				
				guess = san.nextInt();//Records int 
				
			
					   
		}
			
		          
			san.close();
		
				   
		
		   
			 
				   
		
				   
				 
				  
				  
				  
	
				   
	
		
		

	}
}//End 


/*Please solve this question: 2 + 1
3
You have 5 Points
Please solve this question: 6 + 12
18
You have 10 Points
Please solve this question: 15 + 11
26
You have 15 Points
Please solve this question: 6 + 7
13
You have 20 Points
Please solve this question: 17 + 6
23
You have 25 Points
Please solve this question: 10 + 18
-1

*/