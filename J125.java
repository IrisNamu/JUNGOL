package jungol;

import java.util.Scanner;

//1번 for문 으로 풀기
//public class J125 {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		sc.close();
//
//		for (int i = 1; i <= num; i++) {
//			System.out.print(i + " ");
//
//		}
//	
//	}
//	
//}

//2번 while문으로 풀기
public class J125 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		int i = 1; // 초기값이 1인 변수 선언
		while (i <= num) {
			System.out.print(i + " ");
			i++; // i의 값을 1 증가시킨다.

		}

	}

}