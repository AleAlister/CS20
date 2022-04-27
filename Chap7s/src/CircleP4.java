/*

Program: Circlep4.java          Last Date of this Revision: April 27, 2022

Purpose: An application that calcs radius,circumfrence and area of a circle.

Author: Ali Al-sebbah, 
School: CHHS
Course: Computer Programming 20
 

*/
public class CircleP4 {
	
	private static final double PI = 3.14;
	 private double R;
	 
	 
	 public CircleP4() {
	 R = 1;  //default radius
	 }
	 
	 public CircleP4 (double r) {
	 R = r;
	 }
	 
	 
	 public boolean equals(Object c) {
	 CircleP4 testObj = (CircleP4)c;
	 
	 if (testObj.getRadius() == R) {
	 return(true);
	 } else {
	 return(false);
	 }
	 }
	 
	
	 public String toString() {
	 String circleString;
	 
	 circleString = "Circle has radius " + R;
	 return(circleString);
	 }
	 
	 
	 public void setRadius(double newRadius) {
	 R = newRadius;
	 }
	 
	
	 public double getRadius() {
	 return(R);
	 }
	 
	
	 public double circumference() {
	 return(2 * PI * R);//Calculation 
	 }
	
	  
	 public double area(){
	 return(PI * (R * R));//Calculation 
	 }
	 
	
	 public static void displayAreaFormula() {
	 System.out.println("The formula for area of a circle is a=PI*R*R.");
	 }  
	 
	 public static void main(String[] args) {
	 CircleP4 spot1 = new CircleP4(3);
	 CircleP4 spot2 = new CircleP4(4);
	 
	 
	 //output
	 if (spot1.equals(spot2)) {
	 System.out.println("Objects are equal.");
	 } else {
	 System.out.println("Objects are not equal.");
	 }
	 System.out.println(spot1);
	 System.out.println(spot2);
	 
	 }

}


/*
Objects are not equal.
Circle has radius 3.0
Circle has radius 4.0
*/