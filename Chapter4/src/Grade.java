import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner (System.in); //Ready for input
		
		int Grade; //declaration
		System.out.print("Please enter the grade you recived: "); //Ask for first part
		Grade = Scan.nextInt();//Record first part
		
		if (Grade>=90 && 100>=Grade)
		{
		System.out.println("The corresponding letter for your grade is A!");
		}
		

		if (Grade>=80 && 89>=Grade)
		{
		System.out.println("The corresponding letter for your grade is B");
		}
		

		if (Grade>=70 && 79>=Grade)
		{
			System.out.println("The corresponding letter for your grade is C");
		}
		
		if (Grade>=60 && 69>=Grade)
		{
			System.out.println("The corresponding letter for your grade is D");
		}
		
		if (60>Grade)
		{
			System.out.println("The corresponding letter for your grade is F :(");
		}
		
		else if (Grade>100) 
		{
			System.out.println("Enter a real grade!!");
		}
	
	   Scan.close();
	
	
	}

}
