//Take selling price and cost price from user and print profit or loss.

import java.util.Scanner;
class pandl
{
	public static void main(String args[]) 
   	{ 
		Scanner scr= new Scanner(System.in);
		int cp;
		int sp;
		System.out.println("Enter the Cost price ");
		cp = scr.nextInt();
        System.out.println("Enter the Selling price:");
		sp = scr.nextInt();
		if(cp>sp)
            {
		  		System.out.println("Loss");
			}
		else if(sp>cp)
            {
		  		System.out.println("Profit");
			}
		else
		    {
		    	System.out.println("Neither Profit nor Loss");
 		    }
	}
}