package jungol;

import java.util.Scanner;

public class J632 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		// 두 수 중 먼저 작은 값을 구한 후 나머지 수와 비교하기
		int small = (a < b) ? a : b;
		int min = (small < c) ? small : c;
		System.out.println(min);

	}

}
