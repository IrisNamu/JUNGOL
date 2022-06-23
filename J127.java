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
		// -> 그냥 정수 나누기 정수하면 소수점 이하는 계속 0이 나온다.
		// 이럴 경우 정수쪽에 double을 꼭 넣어줘야한다.
		// 1.아예 받을때 값을 double형으로 선언한다,
		// 2. 또는 (double)을 넣어 값이 소수점까지 나올수 있도록 한다.

		avg = (double) sum / cnt;
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", (double) avg);

		sc.close();
	}

}
