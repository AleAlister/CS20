import java.util.Scanner;

public class Squares {

	public static void main(String[] args) {
		
		
		Scanner Scan = new Scanner(System.in); //Ready for input
		
		  int Num[];//Declaration 
		  int Dig;//Declaration 
		System.out.print("Please enter how many elements you want to store: ");//Display
		Dig=Scan.nextInt();// Record input
		Num = new int [Dig];
		

		for (int I=0; I <Dig;I++)//Traversing
		{
			
			System.out.print("Please enter a number: ");//Display
			Num[I]=Scan.nextInt();
		}
	

		System.out.println("Square List: ");
		
		for (int I=0; I<Dig; I++)   //Traversing
		{  
			
			  Num[I] = (int) Math.pow(Num[I], 2);
		System.out.println(Num[I]);  //Display
		}  
		
	

	}

}

/*ScreenDump
 * Please enter how many elements you want to store: 5
Please enter a number: 1
Please enter a number: 2
Please enter a number: 3
Please enter a number: 4
Please enter a number: 5
Square List: 
1
4
9
16
25
*/
