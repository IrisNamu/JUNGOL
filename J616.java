import java.util.Scanner;

public class J616 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();

		sc.close();

		Tri t = new Tri(x1, y1, x2, y2, x3, y3);

		t.print();

	}
}

class Tri {
	double x1;
	double y1;
	double x2;
	double y2;
	double x3;
	double y3;

	public Tri(double x1, double y1, double x2, double y2, double x3, double y3) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
	}
	
	// 출력메서드 구현
	public void print() {
		double centerX = (x1 + x2 + x3) / 3;
		double centerY = (y1 + y2 + y3) / 3;
		System.out.printf("(%.1f, %.1f)", centerX, centerY);
	}

}
