import java.util.Scanner;
//테스트1
public class J562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declare an array that receives 10 integers
		int[] arr = new int[10];

		int odd = 0, even = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (i % 2 == 0) {
				odd += arr[i];
			} else {
				even += arr[i];

			}
		}
		System.out.println("sum : " + even);
		System.out.printf("avg : %.1f\n", (double) odd / (arr.length / 2));
		sc.close();
	}
}