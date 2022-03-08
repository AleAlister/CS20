import java.util.Scanner;
public class Printing {

	public static void main(String[] args) {
		
		
		Scanner Scan = new Scanner (System.in); //Ready for input
		
		int Amount; //declaration
		System.out.print("Please enter the amount of copies you want printed: "); //Ask for first part
		Amount = Scan.nextInt ();// Record first part
		
		if (99>=Amount) 
		{
			System.out.println("The price per copy is: 0.30$ ");
			double total;
			total = (Amount*0.30);
			System.out.print("The total cost is: " + total);
		}
	
		if (Amount>99 && 499>=Amount) 
		{
			System.out.println("The price per copy is: 0.28$ ");
			double total;
			total = (Amount*0.28);
			System.out.print("The total cost is: " + total);
		}
		
		if (Amount>499 && 749>=Amount) 
		{
			System.out.println("The price per copy is: 0.27$ ");
			double total;
			total = (Amount*0.27);
			System.out.print("The total cost is: " + total);
		}
		
		if (Amount>749 && 1000>=Amount) 
		{
			System.out.println("The price per copy is: 0.26$ ");
			double total;
			total = (Amount*0.26);
			System.out.print("The total cost is: " + total);
		}
		
		if (Amount>1000) 
		{
			System.out.println("The price per copy is: 0.25$ ");
			double total;
			total = (Amount*0.25);
			System.out.print("The total cost is: " + total);
		}

		
		Scan.close();
	}

}
