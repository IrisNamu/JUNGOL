package jungol;

import java.util.Arrays;
import java.util.Scanner;

//�Է��� �迭�� ���� ���ڴ�� ���ʴ�� �����ϱ�
//�Է¹��� �迭�� ���ʴ�� �������ִ� ���
//5 10 8 55 6 31 12 24 61 2 �Է°�
// Arrays.sort(arr);

public class J560_Apply {

	public static void main(String[] args) {

		// 10���� ������ �Է¹޴� �迭 ����
		int arr[] = new int[10];

		Scanner sc = new Scanner(System.in);

		// �Է��� ���� �迭�� �����ϴ� for��
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// �Է��� �� ���ʴ�� ����ϴ� for��
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// �迭 ���ʴ�� �����ؼ� ����ϴ� for��
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(arr[0]); // 2

	}

}
