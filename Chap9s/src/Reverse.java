
import java.util.Scanner;
import java.util.*;
import java.util.stream.*;
public class Reverse {
	
	
	
	public static void main(String[] args) {

	Scanner Scan = new Scanner(System.in); //Ready for input
	
	  int CD[];//Declaration 
	  int num;//Declaration 
	System.out.print("How long do you want your countdown to be: ");//Display
	num=Scan.nextInt();// Record input
	CD = new int [num];
	

	for (int I=0; I <num;I++)//Traversing 
	{
		
		System.out.print("Please enter a number in ascending order: ");//Display
		CD[I]=Scan.nextInt();
		
	}
	
	System.out.println("CountDown: ");//Display
	
    for(int i=CD.length-1;i>=0;i--)//Traversing 
    System.out.print(CD[i] + "  ");//Display
	
	} 
	
	
	}//End Class
/*How long do you want your countdown to be: 10
Please enter a number in ascending order: 1
Please enter a number in ascending order: 2
Please enter a number in ascending order: 3
Please enter a number in ascending order: 4
Please enter a number in ascending order: 5
Please enter a number in ascending order: 6
Please enter a number in ascending order: 7
Please enter a number in ascending order: 8
Please enter a number in ascending order: 9
Please enter a number in ascending order: 10
CountDown: 
10  9  8  7  6  5  4  3  2  1  


How long do you want your countdown to be: 5
Please enter a number in ascending order: 10
Please enter a number in ascending order: 11
Please enter a number in ascending order: 12
Please enter a number in ascending order: 13
Please enter a number in ascending order: 14
CountDown: 
14  13  12  11  10  
*/


