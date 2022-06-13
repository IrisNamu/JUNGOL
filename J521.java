import java.util.Scanner;

public class J521 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
//		a++; a = a + 1 ++a = 
//		--b;
		int ret = a++ * --b; // 10*19
		System.out.println(a + " " + b + " " + ret);
		System.out.println(a++ + " " + --b + " " + a * b);
	}

}
