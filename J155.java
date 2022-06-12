import java.util.Arrays;
import java.util.Scanner;

public class J155 {

	public static void main(String[] args) {

		// 6개짜리 배열 선언
		char[] arr = { 'J', 'U', 'N', 'G', 'O', 'L' };

		// 문자입력받기
		Scanner sc = new Scanner(System.in);
		char inp = sc.next().charAt(0); // 제일 앞에 있는 문자
		sc.close();

		// 출력이 잘 되나 확인
		// System.out.println(inp);

		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {

			if (inp == arr[i]) {
				System.out.println(i);
				flag = true; // 처음부터 끝까지 다 비교하다가 같으면 트루로 하나가 바뀌어 있을 것이다.

			}

			// b가 처음부터 끝까지 없다. 그러면 none으로 출력
			else if (flag == false) {
				System.out.println("none");
			}
		}
	}
}
