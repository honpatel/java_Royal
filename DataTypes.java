import java.util.Scanner;

public class DataTypes
{
    public static void main(String[] args)
    {
        System.out.print("Enter name-");
        char name;
        byte age;
        char address;
        int pincode;
        float marks;
        double spi;
        char gender;
        boolean voting ;
        short rank;

        Scanner scr=new Scanner(System.in);
        System.out.println("Enter name:");
        String str=scr.nextLine();
        System.out.println("Your name is "+str);
    }
}