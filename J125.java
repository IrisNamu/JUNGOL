package jungol;

import java.util.Scanner;

//1�� for�� ���� Ǯ��
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

//2�� while������ Ǯ��
public class J125 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		int i = 1; // �ʱⰪ�� 1�� ���� ����
		while (i <= num) {
			System.out.print(i + " ");
			i++; // i�� ���� 1 ������Ų��.

		}

	}

}