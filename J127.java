import java.util.Scanner;

public class J127 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int cnt = 0;
		double avg = 0;

		while (true) {

			int inp = sc.nextInt();
			if ((0 > inp) || (inp > 100)) {
				break;
			}
			sum += inp;

			cnt++;

		}
		// avg = sum / cnt;
		// -> �׳� ���� ������ �����ϸ� �Ҽ��� ���ϴ� ��� 0�� ���´�.
		// �̷� ��� �����ʿ� double�� �� �־�����Ѵ�.
		// 1.�ƿ� ������ ���� double������ �����Ѵ�,
		// 2. �Ǵ� (double)�� �־� ���� �Ҽ������� ���ü� �ֵ��� �Ѵ�.

		avg = (double) sum / cnt;
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", (double) avg);

		sc.close();
	}

}
