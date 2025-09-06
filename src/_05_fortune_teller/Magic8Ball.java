package _05_fortune_teller;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {

		// 2. Make a variable that will hold a random number and put a random number
		// into this variable using "new Random().nextInt(4)"
		int x = new Random().nextInt(4);

		// 3. Print out this variable
		System.out.println(x);

		// 4. Get the user to enter a question for the 8 ball
		System.out.println("Enter a yes or no question for the magic 8 ball");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();

		// 5. If the random number is 0

		// -- tell the user "Yes"
		if(x == 0) {
			System.out.println("yes");
		}

		// 6. If the random number is 1

		// -- tell the user "No"
		if(x==1) {
			System.out.println("No");
		}

		// 7. If the random number is 2

		// -- tell the user "Maybe you should ask Google?"
		if(x==2) {
			System.out.println("Maybe you should ask google"); 
		}

		// 8. If the random number is 3
		if(x==3) {
			System.out.println("maybe"); 
		}

		// -- write your own answer
	}

}
