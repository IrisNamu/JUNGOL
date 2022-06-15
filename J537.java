package jungol;

import java.util.Scanner;
//반복제어문 이용
 public class J537 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		int sum = 0;
		int i = 0;

		while (true) {
			sum += i;
			i++;
			if (i > num)
				break;

		}
		System.out.print(sum);
	}

}


//선택제어문으로 풀기
//public class J537 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		sc.close();
//
//		int sum = 0;
//		for (int i = 1; i <= num; i++) {
//			sum += i;
//		}
//		System.out.print(sum);
//	}
//
//}
