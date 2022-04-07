import java.util.Random;
import java.util.Scanner;
public class RandomNum {

	public static void main(String[] args) 
											{
		
		Scanner Scan = new Scanner (System.in); //Ready for Input
		
		int Numb, Max, Min; //declaration 
		System.out.print("Please enter a two digit number!: "); //Ask for first part
		Numb= Scan.nextInt (); //Record first part
		
		Min = Numb/10; //Calculation
		Max = (Numb%10);
		
		Random rn = new Random(); //Choosing a random number
		int range = Max - Min + 1;
		int randomNum =  rn.nextInt(range) + Min;
	
		System.out.println("A random number between the integers you entered is:" + randomNum);// Gives a random int between the two entered point
		
	
		Scan.close();//Closes input
		
		
		

	}//End Class

}

/*
 * Please enter a two digit number!: 19
A random number between the integers you entered is:7

Please enter a two digit number!: 37
A random number between the integers you entered is:3
*/
