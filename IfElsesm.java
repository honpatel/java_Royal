//Take 3 number from user and print minimum number of them.
import java.util.Scanner;

class IfElsesm{
	public static void main(String[] args){
		int a, b, c;
		int min;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter 3 values: ");
		a= scr.nextInt();
		b= scr.nextInt();
		c= scr.nextInt();
		if (a<b){
			if(c<a){
				min=c;
			}
			else{
				min=a;
			}
		}
		else if(b<c){
			min=b;
		}
		else{
			min=c;
		}
					
		System.out.println(min+ " is the minimum number.");
	}
}