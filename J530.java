import java.util.Scanner;

public class J530 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// �˳��ϰ� �迭 ����
		int[] arr = new int[100];

		int i = -1;// 1

		do {
			i++;

			arr[i] = sc.nextInt(); // �Է��� ���ڸ� �迭�� �޴´�.
			System.out.println(i + "��° �迭=" + arr[i]); // �𸣰����� �Ẹ��
		} while (arr[i] < 100); // i=i+1; �Է��� ���� 100�������� �ϳ��� �����ϸ鼭 �����ؤ�
		System.out.println("\n100�̻��� ���ڴ� ������ �ʽ��ϴ�.");
		sc.close();

		int sum = 0;
		for (int j = 0; j < i; j++) {
			sum += arr[j];
		}
		System.out.println(sum);
		System.out.printf("%.1f\n", (double) sum / i);
	}
}
