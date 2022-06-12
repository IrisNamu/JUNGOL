import java.util.Scanner;

public class J539 {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int cnt = 0; // 입력받은 숫자 카운트
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

	// 첫번째 방법
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

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int sum = 0, cnt = 0, inp = 0;
//		
////만약inp이  1 2 100. 숫자가 입력된 만큼 cnt가 하나씩 증가
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
