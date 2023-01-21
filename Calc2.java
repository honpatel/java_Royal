import java.util.Scanner;
class Calc2 {
    
    void calculate(int a)
    {
        System.out.println("a^2= "+a*a);
    }
    void calculate(int a, int b)
    {
        System.out.println("Multiplication:"+a*b);
        
    }
    public static void main(String[] args)
    {
        Calc2 c = new Calc2();

        c.calculate(5);
        c.calculate(5,10);
    }
}