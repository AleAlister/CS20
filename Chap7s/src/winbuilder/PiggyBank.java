/*

Program: PiggyBank.java          Last Date of this Revision: April 27, 2022

Purpose: A class that supports "Mysavings"

Author: Ali Al-sebbah, 
School: CHHS
Course: Computer Programming 20
 

*/


package winbuilder;

public class PiggyBank 
{
	
	private double balance;
	
	public PiggyBank() 
	{
		balance = 0;
		
	}
	
	public void addCoin(double cents)
	{
		balance = balance + cents;
	}
	
	public void withdrawl(Double cents)
	{
		balance = balance - cents;
	}
	
	public double giveTotal()
	{
		return balance;
	}
	
	
	//Do the withDraw method
	
	
}
