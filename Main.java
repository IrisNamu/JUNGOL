import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String name1 = sc.next();
		int kor1 = sc.nextInt();
		int eng1 = sc.nextInt();

		String name2 = sc.next();
		int kor2 = sc.nextInt();
		int eng2 = sc.nextInt();

		Who who = new Who(name1, kor1, eng1, name2, kor2, eng2);
	//	Who who = new Who(sc.next(), sc.nextInt(), sc.nextInt());

		sc.close();

		System.out.println(who.getName1() + " " + who.getKor1() + " " + who.getEng1());
		System.out.println(who.getName2() + " " + who.getKor2() + " " + who.getEng2());
		System.out.println("avg " + (who.getKor1() + who.getKor2()) / 2 + " " + (who.getEng1() + who.getEng2()) / 2);
	}

}

class Who {
	private String name1, name2;
	private int kor1, kor2;
	private int eng1, eng2;

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public int getKor1() {
		return kor1;
	}

	public void setKor1(int kor1) {
		this.kor1 = kor1;
	}

	public int getKor2() {
		return kor2;
	}

	public void setKor2(int kor2) {
		this.kor2 = kor2;
	}

	public int getEng1() {
		return eng1;
	}

	public void setEng1(int eng1) {
		this.eng1 = eng1;
	}

	public int getEng2() {
		return eng2;
	}

	public void setEng2(int eng2) {
		this.eng2 = eng2;
	}

	
	Who(String name1, int kor1, int eng1, String name2, int kor2, int eng2) {
		this.name1 = name1;
		this.kor1 = kor1;
		this.eng1 = eng1;

		this.name2 = name2;
		this.kor2 = kor2;
		this.eng2 = eng2;
	}

}
