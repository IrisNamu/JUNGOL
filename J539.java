import java.util.Scanner;

public class J539 {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int cnt = 0; // �Է¹��� ���� ī��Ʈ
//		int sum = 0;
//		double avg = 0;
//
//		while (true) {
//			int num = sc.nextInt();
//			cnt++;
//			sum += num;
//
//			if (num >= 100) {
//				break;
//			}
//		}
//		avg = sum / (double) cnt;
//		System.out.println(sum);
//		System.out.printf("%.1f", avg);
//
//		sc.close();
//	}
//
//}

	// ù��° ���
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

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int sum = 0, cnt = 0, inp = 0;
//		
////����inp��  1 2 100. ���ڰ� �Էµ� ��ŭ cnt�� �ϳ��� ����
//		while (inp < 100) {
//			inp = sc.nextInt();
//			sum += inp;
//			cnt++;
//		}
//		sc.close();
//		System.out.println(sum);
//		System.out.printf("%.1f\n", (double) sum / cnt);
//	}
//}
