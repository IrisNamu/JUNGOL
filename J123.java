package jungol;

import java.util.Scanner;

public class J123 {
	public static void main(String[] args) {
		System.out.print("Number? ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		if (num == 1) {
			System.out.println("dog");
		} else if (num == 2) {
			System.out.println("cat");
		} else if (num == 3) {
			System.out.println("chick");
		} else {
			System.out.println("I don't know.");
		}

	}

}
