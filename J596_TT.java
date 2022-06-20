package jungol;

import java.util.Scanner;

public class J596_TT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int num = sc.nextInt();
		sc.close();

		StringBuilder sb = new StringBuilder(str);
		StringBuilder sb2 = sb.reverse();

		for (int i = 0; i < num; i++) {
			System.out.print(sb2.charAt(i));
		}

	}

}
//
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		int num = sc.nextInt();
//		sc.close();
//
//		StringBuffer sb = new StringBuffer(str);
//		String reverse = sb.reverse().toString();
//		String print = "";
//
//		if (str.length() >= num) {
//			print = reverse.substring(0, num);
//		} else {
//			print = reverse.substring(0);
//		}
//		System.out.println(print);
//	}
//}
