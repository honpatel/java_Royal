import java.util.Scanner;

class divisible{
    public static void main(String[] args)
    {
        System.out.print("Enter number: ");
        Scanner scr = new Scanner(System.in);
        int n= scr.nextInt();
        if(n%13==0)
        {
            System.out.print("Yes.");
        }
        else
        {
            System.out.print("No.");
        }
    }
}

