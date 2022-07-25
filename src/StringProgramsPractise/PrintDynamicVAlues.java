package StringProgramsPractise;

import java.util.Scanner;

public class PrintDynamicVAlues {
	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();

		if(no%3==0 && no%5==0) {
			System.out.println("Hi Hello");
		}else if (no%5==0) {
			System.out.println("Hello");
		}else if (no%3==0) {
			System.out.println("Hi");
		}else {
			System.out.println("Bye");
		}

	}
}


