package jungol;

import java.util.Scanner;

public class J113 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		sc.close();

		int width = w + 5;
		int length = h * 2;
		int area = width * length;

		System.out.printf("width = %d\nlength = %d\narea = %d", width, length, area);
	}

}
