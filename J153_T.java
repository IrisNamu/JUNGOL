package jungol;

import java.util.Scanner;

public class J153_T {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];

		int temp = 0;
		
		//두 와일문을 이용해
		do {
			arr[temp] = sc.nextInt();
		} while (arr[temp++] != -1);
		sc.close();
		

		// 입력받은 정수가 3개 미만일 때 출력
		if (temp - 4 < 0) {
			for (int j = 0; j <= temp; j++) {
				System.out.print(arr[j] + " ");
			}

			// 입력받은 정수가 3개 이상일 때 출력
			// 마지막에 입력된 위치는 [입력받은 개수-1] 이고 그 앞에 입력받은 것은 [입력받은 개수-2] 이다.
		} else {
			for (int j = temp - 2; j <= temp; j++) {
				System.out.print(arr[j] + " ");

			}
		}
		sc.close();
	}
}