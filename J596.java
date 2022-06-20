package jungol;

import java.util.Scanner;

public class J596 {
	static public void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int num = sc.nextInt();
		sc.close();

		StringBuilder sb = new StringBuilder(str);
		String reverse = sb.reverse().toString().substring(0, num);

		System.out.println(reverse);

	}

}
