/**
 * Huricane  
 * @author Ali Al-sebbah
 *CompSci 20
 *Feb 22 2022
 */
import java.util.Scanner;
public class Hurricane {

	public static void main(String[] args) 
											{
		
		Scanner Scan = new Scanner (System.in); //Ready for input
		
		int Speed; //declaration
		System.out.print("Please enter the category of hurricane you are experiencing *Must be between 1 and 5*: "); //Ask for first part
		Speed = Scan.nextInt();//Record first part
		
		if (Speed==1)
		{
		System.out.println("You can expect speeds of 74-95mph or 64-82kt or 119-153 km/h, in a category 1 hurricane");
		}
		if (Speed==2)
		{
		System.out.println("You can expect speeds of 96-110mph or 83-95kt or 154-177 km/h, in a category 2 hurricane");
		}
		if (Speed==3)
		{
		System.out.println("You can expect speeds of 111-130mph or 96-113kt or 178-209 km/h, in a category 3 hurricane");
		}
		if (Speed==4)
		{
		System.out.println("You can expect speeds of 131-155 mph or 114-135 kt or 210-249 km/h, in a category 1 hurricane");
		}
		if (Speed==5)
		{
		System.out.println("You can expect speeds of 156+ mph or 135+ kt or 249+ km/h");
		}
		
		else if (Speed >= 6) {
			System.out.println("Please enter a number between 1 and 5!");
		}
		
		Scan.close();
}//end class
}


/*
Please enter the category of hurricane you are experiencing *Must be between 1 and 5*: 1
You can expect speeds of 74-95mph or 64-82kt or 119-153 km/h, in a category 1 hurricane

Please enter the category of hurricane you are experiencing *Must be between 1 and 5*: 3
You can expect speeds of 111-130mph or 96-113kt or 178-209 km/h, in a category 3 hurricane

Please enter the category of hurricane you are experiencing *Must be between 1 and 5*: 8
Please enter a number between 1 and 5!
*/