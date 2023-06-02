package ClientInterview;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int r, s = 0;
		int c = num;
		while (num > 0) {
			r = num % 10;
			s = (s * 10) + r;
			num = num / 10;
		}
		if (c == s) {
			System.out.println("Palindrom Number");
		} else {
			System.out.println("Not Palindrom Number");
		}
		sc.close();

	}
}
