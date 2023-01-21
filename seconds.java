//Write a program to take input from user in seconds and convert into hours and minutes.

//	10000 - 2 :46 : 40


import java.util.Scanner;

class seconds
{
    public static void main(String[] args)
    {
	Scanner scr = new Scanner(System.in);
	System.out.print("Enter seconds: ");
	int scs = scr.nextInt();
	int hrs = scs / 3600;
                  int mins = (scs % 3600) / 60;
	System.out.print("Hours: " + hrs); 
	System.out.println("Minutes: " + mins); 
   }
}
