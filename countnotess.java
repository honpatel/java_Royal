// count total no of notes in given amount - 1552
// 500 - 3
// 200-0
// 100-0
// 50 - 1
// 10-0
// 5-0
// 1 - 2

import java.util.Scanner;

class countnotess
{
    public static void main(String[] args)
    {
	int n500=0, n200=0, n100=0, n50=0, n20=0, n10=0, n1=0;
	Scanner scr = new Scanner(System.in);
	System.out.print("Enter amount: ");
	int amount= scr.nextInt();
	if(amount >= 500)
	{
		n500= amount/500;
		amount= amount % 500;
	}
	if(amount >= 200)
	{
		n200= amount/200;
		amount= amount % 200;
	}
	if(amount >= 100)
	{
		n100= amount/100;
		amount= amount % 100;
	}
	if(amount >= 50)
	{
		n50= amount/50;
		amount= amount % 50;
	}
	if(amount >= 20)
	{
		n20= amount/20;
		amount= amount % 20;
	}
	if(amount >= 10)
	{
		n10= amount/10;
		amount= amount % 10;
	}
	else
	{
		n1= amount;
	}
	System.out.print("500/- notes : "+n500);
	System.out.println("200/- notes : "+n200);
	System.out.println("100/- notes : "+n100);
	System.out.println("50/- notes : "+n50);
	System.out.println("20/- notes : "+n20);
                  System.out.println("10/- notes : "+n10);
	System.out.println("1/- notes : "+n1);
    }
}
