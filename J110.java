import java.util.Scanner;

public class J110 {

	public static void main(String[] args) {
		double yard = 91.44;

		System.out.print("yard? ");

		Scanner sc = new Scanner(System.in);

		double inp = sc.nextDouble();
		double cm = inp * yard;

		System.out.printf("%.1fyard = %.1fcm", inp, cm);

		sc.close();

	}

}
