import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J530 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 0; // 지역변수 선언하고 초기화 필요
		try {
			String inp = br.readLine();
			n = Integer.parseInt(inp);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (n >= 20) {
			System.out.println("adult");
		} else {
			System.out.println((20 - n) + "years later");
		}
	}

}
