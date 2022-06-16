package jungol;

import java.util.Scanner;

public class J555 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char arr[] = new char[10];

		// 입력된 알파벳을 배열에 순서에 맞게 저장
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next().charAt(0);
			System.out.print(arr[i]);
		}
		sc.close();

	}

}
