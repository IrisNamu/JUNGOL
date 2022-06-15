package jungol;

import java.util.Scanner;

public class J122 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();

		// 4로 나누어떨어지고 100으로 나누어떨어지지 않으면 윤년이다. 나머지는 모두 평년이다.
		if ((year % 4 == 0) && (year % 100 != 0)) {
			System.out.println("leap year");
		} else if (year % 400 == 0) {
			System.out.println("leap year");
		} else {
			System.out.println("common year");
		}

	}

}
