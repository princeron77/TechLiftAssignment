package assignments;

import java.util.Scanner;

public class PositiveInteger {

	public static void main(String args[]) {
		Scanner z=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=z.nextInt();
		if(n%2==0&&n%5!=0) System.out.println("Number is divisible by 2");
		else if(n%5==0 &n%2!=0) System.out.println("Number is divisible by 5");
		else if(n%2==0&&n%5==0) System.out.println("Number is divisible by both 2 and 5");
		else if(n%2!=0&&n%5!=0) System.out.println("Number is not divisible by 2 or 5");
		else return;
		
	}
}
