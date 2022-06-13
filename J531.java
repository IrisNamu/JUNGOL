import java.util.Scanner;

public class J531 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w = sc.nextDouble();
		sc.close();

		if (w <= 50.80) {
			System.out.println("Flyweight");
		} else if (w <= 61.23) {
			System.out.println("Lightweight");
		} else if (w <= 75.27) {
			System.out.println("Middleweight");
		} else if (w <= 88.45) {
			System.out.println("Cruiserweight");
		} else {
			System.out.println("Heavyweight");
		}
	}

}
