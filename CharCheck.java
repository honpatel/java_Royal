//Take one character from user and check character is vowel or consonant.

import java.util.Scanner;
class CharCheck{
	public static void main(String[] args){
		//char ch;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch=scr.next().charAt(0);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
			System.out.println(ch + " is a vowel");
		}
		else{
			System.out.println(ch + " is a consonant");
		}		
	}
}