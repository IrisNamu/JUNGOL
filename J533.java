import java.util.Scanner;

public class J533 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char gender = sc.next().charAt(0);
		int age = sc.nextInt();
		sc.close();

		if ((gender == 'M') && (age >= 20)) {
			System.out.println("MAN");
		} else if ((gender == 'M') && (age < 20)) {
			System.out.println("BOY");
		} else if ((gender == 'F') && (age >= 20)) {
			System.out.println("WOMAN");
		} else if ((gender == 'F') && (age < 20)) {
			System.out.println("GIRL");

		}
	}

}
