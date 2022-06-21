package jungol;

import java.util.Scanner;

public class J126 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;
		int odd = 0;
		int even = 0;

		do {
			num = sc.nextInt();

			if (num == 0)
				break;
			
			if (num % 2 == 1) {
				odd++;

			} else {
				even++;
			}
		} while (true);

		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
		sc.close();
	}

}
