import java.util.*;
import java.io.*;

public class Main {
	static final int MAX = 1000000000;
	static final int A = 1234567;
	static final int B = 123456;
	static final int C = 1234;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		boolean isAnswer = false;
		for (int i = 0; i <= MAX / A; i++)
			for (int j = 0; j <= MAX / B; j++)
				if ((n - i * A - j * B) >= 0 && (n - i * A - j * B) % C == 0)
					isAnswer = true;

		if (isAnswer)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
