import java.util.Scanner;

public class J537 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println(num);

		while (num <= 100) {
			for (int i = 1; i <= num; i++) {
				num += i;
				break;
			}
			System.out.println(num);
		}

	}

}
