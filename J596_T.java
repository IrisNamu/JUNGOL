package jungol;

import java.util.Scanner;

public class J596_T {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int inp = sc.nextInt();
		sc.close();

		if (str.length() >= inp) {
			for (int i = str.length() - 1, cnt = 0; cnt < inp; i--, cnt++) {
				System.out.println(str.charAt(i));
			}
		} else {
			for (int i = str.length() - 1; i >= 0; i--) {
				System.out.println(str.charAt(i));
			}
		}

	}

}
