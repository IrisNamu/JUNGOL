package jungol;

import java.util.Scanner;

public class J126 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp=0;
		
		int num=sc.nextInt();
		while(num<=0) {
			if(num%2==0) {
				System.out.println("odd : " +num);
				System.out.println("even : " +num);
			}
			
			if(num==0)
				break;
		}
				
		sc.close();
	}

}
