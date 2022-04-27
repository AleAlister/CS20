/*

Program: Adderc.java          Last Date of this Revision: April 27, 2022

Purpose: A class that supports "Adder".

Author: Ali Al-sebbah, 
School: CHHS
Course: Computer Programming 20
 

*/

public class AdderC {
	


private static int points;

	
	public AdderC() 
	{
		points = 0; 
		
	}


	
	public void addPoints(int Tries)
	{
		points = points + Tries;//Adds points
	}
	public int givepoints()
	{
		return points;
	}
	
	public void takePointsAway()
	{
		points = points - 2;//takes away points
	}
	
	

}
