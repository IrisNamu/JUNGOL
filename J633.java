package jungol;

import java.util.Scanner;

//±ò²ûÇÏ°Ô Â®´Ù±¸ ÄªÂù¹Þ¾Ò´Ù>_<

public class J633 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1. Korea\r\n"
					+ "2. USA\r\n"
					+ "3. Japan\r\n"
					+ "4. China\r\n"
					+ "number? ");
			
			int num = sc.nextInt();
			System.out.println();
			
				if (num == 1) {
				System.out.println("Seoul");
			} else if (num == 2) {
				System.out.println("Washington");
			} else if (num == 3) {
				System.out.println("Tokyo");
			} else if (num == 4) {
				System.out.println("Beijing");
			} else {
				System.out.println("none");
				break;
			}
		}
		sc.close();
	}
}

// ¹è¿­ÀÌ¿ë

//public class J633 {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//
//		String[] sudos = { "", "Seoul", "Washington", "Tokyo", "Beijing" };
//
//		boolean isPrint;
//
//		do {
//			System.out.println("1. Korea\n" + "2. USA\n" + "3. Japan\n" + "4. China");
//
//			System.out.print("number? ");
//			int num = scan.nextInt();
//
//			isPrint = (1 <= num && num < sudos.length);
//			System.out.printf("\n%s", (isPrint ? sudos[num] + "\n" : "none"));
//		} while (isPrint);
//
//		scan.close();
//	}
//}