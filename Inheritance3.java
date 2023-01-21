// Create a class with a method that prints "This is parent class" and its subclass with another method 
//that prints "This is child class". Now, create an object for each of the class and call
// 1 - method of parent class by object of parent class
// 2 - method of child class by object of child class
// 3 - method of parent class by object of child class


class Parent{
    void family()
    {
        System.out.println("This is Parent class.");
    }
}

class Child extends Parent{
    void family2()
    {
        System.out.println("This is Child class.");
    }
}


public class Inheritance3 {
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.family();

        Child obj2 = new Child();
        obj2.family2();
        obj2.family();
    }
}
