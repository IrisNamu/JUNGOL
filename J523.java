import java.util.Scanner;

public class J523 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		sc.close();

		System.out.printf("%d > %d --- %d\n", num1, num2, (num1 > num2) ? 1 : 0);
		System.out.printf("%d < %d --- %d\n", num1, num2, (num1 < num2) ? 1 : 0);
		System.out.printf("%d >= %d --- %d\n", num1, num2, (num1 >= num2) ? 1 : 0);
		System.out.printf("%d <= %d --- %d", num1, num2, (num1 <= num2) ? 1 : 0);

	}

}
