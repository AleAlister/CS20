/*

Program: GuessinGame.java          Last Date of this Revision: April 4, 2022

Purpose: An application that adds all the digits leading up to the givin number.

Author: Ali Al-sebbah, 
School: CHHS
Course: Computer Programming 20
 

*/


import java.util.Scanner;
public class Numbersum {

	public static void main(String[] args) {


	 int num, sum=0, num1=0;//Declaration
	 Scanner Scan= new Scanner(System.in);//Ready for input
	 
	 System.out.println("Please enter a number");//Asks the user for a number
	 num = Scan.nextInt();// Records number given
	 
	 Scan.close();//Closes input
	 
	 do{
		 System.out.println(num1);
		 num1+=1;
		 sum+=num1;
		 }while(num1<=num);
		 System.out.println(sum);
	 
	 
	}//End class
}

/*
Please enter a number
56
0
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
1653
*/