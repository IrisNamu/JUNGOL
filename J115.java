package jungol;

import java.util.Scanner;

public class J115 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h1 = sc.nextInt();
		int w1 = sc.nextInt();

		int h2 = sc.nextInt();
		int w2 = sc.nextInt();

		sc.close();

		if ((h1 > h2) && (w1 > w2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
