import java.util.Scanner;
public class Numbersum {

	public static void main(String[] args) {


	 int num, sum=0, num1=0;
	 Scanner Scan= new Scanner(System.in);
	 
	 System.out.println("Please enter a number");
	 num = Scan.nextInt();
	 
	 Scan.close();
	 
	 do{
		 System.out.println(num1);
		 num1+=1;
		 sum+=num1;
		 }while(num1<=num);
		 System.out.println(sum);
	 
	 
	}
}
