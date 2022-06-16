package jungol;

import java.util.Scanner;

public class J560 {

	public static void main(String[] args) {

		// 10개의 정수를 입력받는 배열 선언
		int arr[] = new int[10];

		Scanner sc = new Scanner(System.in);

		// 입력한 값을 배열에 저장하는 for문
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// arr[0]의 값을 최솟값이라고 두고 비교하는 for문
		int min = arr[0];
		// 혹은 int min = Integer.MAX_VALUE;//1000
		for (int i = 0; i < arr.length; i++) {
			// min값이 arr[i]보다 크다면 예(3>5) 이면 무시하고,
			// 다시 그 다음 배열로 넘어가 3>1이라면 그걸 다시 최솟값에 저장한다.
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.print(min);

		sc.close();

	}

}
