import java.util.Scanner;

public class primerange {
    public static void main(String args[])
    {
         int a, b ,flag = 0, i, j;
         Scanner scr = new Scanner(System.in);
         System.out.println ("Enter the first no :"); 
         a= scr.nextInt();
         System.out.println ("Enter the second no :"); 
         b = scr.nextInt();
         System.out.println ("prime numbers in between no. are :");
         for(i = a; i <=b; i++)
         {
            flag=0;
             for( j = 2; j <= i/2; j++)
             {
                 if(i % j == 0)
                 {
                     flag = 1;
                     break;
                 }
                 
             }
             if(flag == 0)
             {
                 System.out.println(i);
             }
         }
    }
    
}
