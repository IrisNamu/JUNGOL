package jungol;

import java.util.Scanner;

public class J153_count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		int count = 0;
		int num;

		for (int i = 0; i < arr.length; i++) { // arr[0],arr[1],arr[2] 입력받고 arr[3]에서 -1 입력되었을때 count = 3, i = 4
			num = sc.nextInt();
			if (num != -1) {
				arr[i] = num;
				count++;
			} else {
				break;
			}
		}
		sc.close(); // -1이 입력되거나 길이 100만큼 모두 입력되었을때 입력 종료

		if (count < 3) {
			for (int i = 0; i < count; i++) {
				System.out.print(arr[i] + " ");
			}
		} else {
			for (int i = count - 3; i < count; i++) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}