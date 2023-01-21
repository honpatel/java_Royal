import java.util.Scanner;
// class OneDArray{
//     public static void main(String[] args){
     

//         int a[]=new int[5];

//         Scanner scr= new Scanner(System.in);
//         for(int i=0;i<a.length;i++)
//         {
//             System.out.println("Enter Value:");
//             a[i]=scr.nextInt();
//         }

//         System.out.println("Content of the Array:");
//         for(int i=0;i<a.length;i++)
//         {
//             System.out.println(a[i]);
//         }
//     }
// }

public class OneDArray{
    public static void main(String[] args){
     
        int sum=0;
        int a[]=new int[5];

        Scanner scr= new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter Value:");
            a[i]=scr.nextInt();
            sum=sum+a[i];
        }

        System.out.println("Content of the Array:");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Sum of Elements:" + sum);
    }
}