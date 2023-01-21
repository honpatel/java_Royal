
//Take one character from user and check it is number , Alphabet or special character.
import java.util.Scanner;

class Check {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter any character:");
		char ch = scr.next().charAt(0);
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println("character is alphabet");

		} else if (ch >= '0' && ch <= '9') {

			System.out.println("character is digit");

		} else {

			System.out.println("character is special");
		}
	}
}