package jungol;

import java.util.Scanner;

public class J153 {

	public static void main(String[] args) {
		int arr[] = new int[100];
		int temp = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] == -1) {
				temp = i - 1; // �ε��� �� �����ϰ�
				break; // �������´�.

			}
		}

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