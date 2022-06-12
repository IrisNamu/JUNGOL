import java.util.Scanner;

public class J530 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 넉넉하게 배열 선언
		int[] arr = new int[100];

		int i = -1;// 1

		do {
			i++;

			arr[i] = sc.nextInt(); // 입력한 숫자를 배열로 받는다.
			System.out.println(i + "번째 배열=" + arr[i]); // 모르겠으면 써보자
		} while (arr[i] < 100); // i=i+1; 입력한 숫자 100이전까지 하나씩 증가하면서 돌려준ㄷ
		System.out.println("\n100이상의 숫자는 계산되지 않습니다.");
		sc.close();

		int sum = 0;
		for (int j = 0; j < i; j++) {
			sum += arr[j];
		}
		System.out.println(sum);
		System.out.printf("%.1f\n", (double) sum / i);
	}
}
