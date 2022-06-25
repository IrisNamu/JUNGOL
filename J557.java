import java.util.Scanner;

public class J557 {

	public static void main(String[] args) {

		String[] arr = new String[10];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {

			arr[i]= sc.next();
		}
		System.out.printf("%s %s %s", arr[0], arr[3], arr[6]);

		sc.close();
	}

}
