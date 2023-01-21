    //       Shape
    //  /             \ 
    // Rectangle   Circle

    // -> find the area


import java.util.Scanner;
class Shape
{
    Scanner scr = new Scanner(System.in);
    int len, hei;
    float rad;
    
    void sub()
    {
        
        System.out.println("Enter length: ");
        len =scr.nextInt();
        System.out.println("Enter height: ");
        hei =scr.nextInt();
        System.out.println("Enter radius: ");
        rad =scr.nextInt();
    }

    
}

class Rectangle extends Shape{
    void sub2()
    {
        System.out.println("Area of Rectangle: "+(len*hei));
    }
}

class Circle extends Shape{
    void sub3()
    {
        System.out.println("Area of Circle: "+(3.14*rad));
    }
}

class InheritanceShape
{
    public static void main(String[] args) {
       Rectangle obj = new Rectangle();
       obj.sub();
       obj.sub2();
       
       Circle obj2 = new Circle();
       obj2.sub3();
       
    }
}