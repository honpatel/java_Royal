// import java.util.Scanner;

// public class abstraction{
//     public static void main(String[] args){

//     }
// }

// abstract class Staff{
//     abstract void salary();

//     void tax(){
//         System.out.println("Staff::tax()");
//     }
// }

// class Faculty extends Staff{
//     void salary(){
//         System.out.println("Faculty::salary()");
//     }
// }

// import java.util.Scanner;

// public class abstraction {
//     public static void main(String[] args) {
//     }
// }

// interface RBI {
//     abstract void wid();

//     public void dep();
// }

// class ICICI implements RBI {
//     public void wid() {
//     }

//     public void dep() {
//     }
// }

import java.util.Scanner;

public class abstraction{
    public static void main(String[] args){

    }
}

interface Menu{
    abstract void southindian();

    public void punjabi();
    public void gujarati();

}

class Mastermenu implements Menu{
    public void punjabi(){
        System.out.println("punjabi thali");

    }
    public void gujarati(){
        System.out.println("gujarati");
        
    }
    public void southindian(){
        System.out.println("southindian");
    }
}