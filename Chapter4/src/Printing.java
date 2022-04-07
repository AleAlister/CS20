import java.util.Scanner;
public class Printing {

	public static void main(String[] args) {
		
		
		Scanner Scan = new Scanner (System.in); //Ready for input
		
		int Amount; //declaration
		System.out.print("Please enter the amount of copies you want printed: "); //Ask for first part
		Amount = Scan.nextInt ();// Record first part
		
		if (99>=Amount)  
		{
			System.out.println("The price per copy is: 0.30$ ");//Tells the user price per copy
			double total;//Declaration 
			total = (Amount*0.30);//Calculation
			System.out.print("The total cost is: " + total);// Gives total price
		}
	
		if (Amount>99 && 499>=Amount) 
		{
			System.out.println("The price per copy is: 0.28$ ");//Tells the user price per copy
			double total;//Declaration 
			total = (Amount*0.28);//Calculation
			System.out.print("The total cost is: " + total);// Gives total price
		}
		
		
		if (Amount>499 && 749>=Amount) 
		{
			System.out.println("The price per copy is: 0.27$ ");//Tells the user price per copy
			double total;//Declaration 
			total = (Amount*0.27);//Calculation
			System.out.print("The total cost is: " + total);// Gives total price
		
		}
		
		if (Amount>749 && 1000>=Amount) 
		{
			System.out.println("The price per copy is: 0.26$ ");//Tells the user price per copy
			double total;//Declaration 
			total = (Amount*0.26);//Calculation
			System.out.print("The total cost is: " + total);// Gives total price
		
		}
		
		if (Amount>1000) 
		{
			System.out.println("The price per copy is: 0.25$ ");//Tells the user price per copy
			double total;//Declaration 
			total = (Amount*0.25);//Calculation
			System.out.print("The total cost is: " + total);// Gives total price
		}

		
		Scan.close();//Closes input
	}//End class

}

/*
 * Please enter the amount of copies you want printed: 600
The price per copy is: 0.27$ 
The total cost is: 162.0


Please enter the amount of copies you want printed: 200
The price per copy is: 0.28$ 
The total cost is: 56.00000000000001
*/
