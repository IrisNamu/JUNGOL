package jungol;

import java.util.Scanner;

public class J153_T {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];

		int temp = 0;
		
		//�� ���Ϲ��� �̿���
		do {
			arr[temp] = sc.nextInt();
		} while (arr[temp++] != -1);
		sc.close();
		

		// �Է¹��� ������ 3�� �̸��� �� ���
		if (temp - 4 < 0) {
			for (int j = 0; j <= temp; j++) {
				System.out.print(arr[j] + " ");
			}

			// �Է¹��� ������ 3�� �̻��� �� ���
			// �������� �Էµ� ��ġ�� [�Է¹��� ����-1] �̰� �� �տ� �Է¹��� ���� [�Է¹��� ����-2] �̴�.
		} else {
			for (int j = temp - 2; j <= temp; j++) {
				System.out.print(arr[j] + " ");

			}
		}
		sc.close();
	}
}