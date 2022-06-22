package jungol;

import java.util.Scanner;

public class J156 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[1000];

		int min = 1000;
		int max = -1000; 

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] == 999)
				break;

			if (max < arr[i]) {
				max = arr[i];
			}

			if (min > arr[i]) {
				min = arr[i];
			}

		}
		sc.close();

		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}

}
