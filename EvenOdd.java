package ClientInterview;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("even nember");
		}
		else {
			System.out.println("odd number");
		}
	}
}
