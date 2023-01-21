// class Car{
//     int wheel=4;
//     String color;

//     void run()
//     {
//         System.out.println("Running.");
//     }
// }

// public class ClassObject{
//     public static void main(String[] args) {
//         Car ferrari = new Car();
//         System.out.println(ferrari.wheel);
//         ferrari.color="Red";
//         System.out.println(ferrari.color);

//         Car bmw = new Car();
//         bmw.wheel=6;
//         System.out.println(bmw.wheel);
//         bmw.color="Blue";
//         System.out.println(bmw.color);
//     }
// }


class Test{
    int marks;
    String name;
    String subject="Accounts";
}

public class ClassObject{
    public static void main(String[] args) {
        Test honey = new Test();
        honey.name="Honey";
        System.out.println(honey.name);
        System.out.println(honey.subject);
        honey.marks=40;
        System.out.println(honey.marks);

        Test jenisha = new Test();
        jenisha.name="jenisha";
        System.out.println(jenisha.name);
        System.out.println(jenisha.subject);
        jenisha.marks=45;
        System.out.println(jenisha.marks);

        Test sujal = new Test();
        sujal.name="sujal";
        System.out.println(sujal.name);
        System.out.println(sujal.subject);
        sujal.marks=35;
        System.out.println(sujal.marks);

        Test vedant = new Test();
        vedant.name="vedant";
        System.out.println(vedant.name);
        System.out.println(vedant.subject);
        vedant.marks=42;
        System.out.println(vedant.marks);
    }
} 