package jungol;

import java.util.Arrays;
import java.util.Scanner;

//입력한 배열을 작은 숫자대로 차례대로 정렬하기
//입력받은 배열을 차례대로 정렬해주는 기능
//5 10 8 55 6 31 12 24 61 2 입력값
// Arrays.sort(arr);

public class J560_Apply {

	public static void main(String[] args) {

		// 10개의 정수를 입력받는 배열 선언
		int arr[] = new int[10];

		Scanner sc = new Scanner(System.in);

		// 입력한 값을 배열에 저장하는 for문
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// 입력한 값 차례대로 출력하는 for문
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// 배열 차례대로 저장해서 출력하는 for문
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(arr[0]); // 2

	}

}
