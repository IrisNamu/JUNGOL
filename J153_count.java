package jungol;

import java.util.Scanner;

public class J153_count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		int count = 0;
		int num;

		for (int i = 0; i < arr.length; i++) { // arr[0],arr[1],arr[2] �Է¹ް� arr[3]���� -1 �ԷµǾ����� count = 3, i = 4
			num = sc.nextInt();
			if (num != -1) {
				arr[i] = num;
				count++;
			} else {
				break;
			}
		}
		sc.close(); // -1�� �Էµǰų� ���� 100��ŭ ��� �ԷµǾ����� �Է� ����

		if (count < 3) {
			for (int i = 0; i < count; i++) {
				System.out.print(arr[i] + " ");
			}
		} else {
			for (int i = count - 3; i < count; i++) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}