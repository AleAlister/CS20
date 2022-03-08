import java.util.Scanner;
public class OddSum {

	public static void main(String[] args) {
		
		
		 Scanner Scan=new Scanner(System.in);
		 int num, count=1, add=0;
		 
		 System.out.print("Please enter a number: ");
		 num=Scan.nextInt();
		 
		 do
		 {
		 count+=2;
		 add+=count;
		 }
		 
		 while(count<num);
		 
		 System.out.println("The odd numbers sum is "+ add);
		 
		 Scan.close();

	}

}
