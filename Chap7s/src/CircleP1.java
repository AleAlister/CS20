/*

Program: Circlep1.java          Last Date of this Revision: April 27, 2022

Purpose: An application that calcs radius,circumfrence and area of a circle.

Author: Ali Al-sebbah, 
School: CHHS
Course: Computer Programming 20
 

*/

public class CircleP1 {
	
	private static final double PI =3.14;
	private double R;
	
	 public CircleP1() {
		 R = 1;  //default radius
		 }
	 
	 
	 public void setR(double newRadius) {
		 R = newRadius;
		 
	 }
	 

	 
   public double area() {
	   double CA;//Declaration
	   CA = PI*R*R;//Calculation
	   
	return CA;
   }
   
   public double getRadius() {
	  
	   return(R);
   }
   
   
   public double circumference() {
	   double CI;//Declaration
	   CI = 2*PI*R;//Calculation
	   
	   return CI;
	
   }
   
   
   public static void main(String[] args) {
	   CircleP1 spot = new CircleP1();
	   
	   
	   //oUTPUT
	   spot.setR(3);  
	   System.out.println("Circle radius: " + spot.getRadius());
	   System.out.println("Circle area: "+ spot.area());
	   System.out.println("Circle Circumference: "+ spot.circumference());
   }

}

/*
 * Circle radius: 3.0
Circle area: 28.259999999999998
Circle Circumference: 18.84
*/
