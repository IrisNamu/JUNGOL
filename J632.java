package jungol;

import java.util.Scanner;

public class J632 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		// �� �� �� ���� ���� ���� ���� �� ������ ���� ���ϱ�
		int small = (a < b) ? a : b;
		int min = (small < c) ? small : c;
		System.out.println(min);

	}

}
