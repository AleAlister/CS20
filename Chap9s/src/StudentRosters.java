import java.util.Scanner; 
public class StudentRosters {

	public static void main(String[] args) {
		
		  Scanner Scan = new Scanner(System.in); //Ready for input
		
		  String Name[];
		  int Dig;//Declaration 
		System.out.print("Please enter the amount of students in the class: ");
		Dig=Scan.nextInt();// Record Int
		Name = new String[Dig];
		
		
		
		
		for (int STU=0; STU <Dig;STU++) {//Traversing
			
			System.out.print("Please enter the name of your student: ");//Display
			Name[STU]=Scan.next();
			
			
			
			
		}
		
		System.out.println("Student List: ");//Display
		
		for (int STU=0; STU<Dig; STU++)  //Traversing 
		{  
		System.out.println(Name[STU]);  //Display
		}  
		

		
	}

}

/*
 * Please enter the amount of students in the class: 6
Please enter the name of your student: Alex 
Please enter the name of your student: Lisa
Please enter the name of your student: Bob
Please enter the name of your student: Joe
Please enter the name of your student: Tracey
Please enter the name of your student: Elenoir
Student List: 
Alex
Lisa
Bob
Joe
Tracey
Elenoir
*/
 
 