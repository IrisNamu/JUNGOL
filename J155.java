import java.util.Arrays;
import java.util.Scanner;

public class J155 {

	public static void main(String[] args) {

		// 6��¥�� �迭 ����
		char[] arr = { 'J', 'U', 'N', 'G', 'O', 'L' };

		// �����Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		char inp = sc.next().charAt(0); // ���� �տ� �ִ� ����
		sc.close();

		// ����� �� �ǳ� Ȯ��
		// System.out.println(inp);

		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {

			if (inp == arr[i]) {
				System.out.println(i);
				flag = true; // ó������ ������ �� ���ϴٰ� ������ Ʈ��� �ϳ��� �ٲ�� ���� ���̴�.

			}

			// b�� ó������ ������ ����. �׷��� none���� ���
			else if (flag == false) {
				System.out.println("none");
			}
		}
	}
}
