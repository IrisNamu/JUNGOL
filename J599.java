package jungol;

import java.util.Scanner;

public class J599 {
	public static void main(String[] args) {

		double score[] = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		double score1 = score[num1 - 1];

		int num2 = sc.nextInt();
		double score2 = score[num2 - 1];

		sc.close();

		double sum = score1 + score2;

		System.out.printf("%.1f", sum);

	}

}

//1.
