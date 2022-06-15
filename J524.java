package jungol;

import java.util.Scanner;

public class J524 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		boolean c = (a != 0);
		boolean d = (b != 0);

		System.out.println((c && d) + " " + (c || d));
		sc.close();

	}
}
