package jungol;

import java.util.Scanner;

public class J560 {

	public static void main(String[] args) {

		// 10���� ������ �Է¹޴� �迭 ����
		int arr[] = new int[10];

		Scanner sc = new Scanner(System.in);

		// �Է��� ���� �迭�� �����ϴ� for��
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// arr[0]�� ���� �ּڰ��̶�� �ΰ� ���ϴ� for��
		int min = arr[0];
		// Ȥ�� int min = Integer.MAX_VALUE;//1000
		for (int i = 0; i < arr.length; i++) {
			// min���� arr[i]���� ũ�ٸ� ��(3>5) �̸� �����ϰ�,
			// �ٽ� �� ���� �迭�� �Ѿ 3>1�̶�� �װ� �ٽ� �ּڰ��� �����Ѵ�.
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.print(min);

		sc.close();

	}

}
