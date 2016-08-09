import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		for (int i = 1; i <= n + 1; i++) {
			for (int j = n; j >= i; j--)
				System.out.print("  ");
			int idx = 0;
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print(idx);
				if (j < i * 2 - 1)
					System.out.print(" ");
				if (j < i)
					idx++;
				else
					idx--;
			}
			System.out.println();
		}

		for (int i = n; i >= 1; i--) {
			for (int j = n; j >= i; j--)
				System.out.print("  ");
			int idx = 0;
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print(idx);
				if (j < i * 2 - 1)
					System.out.print(" ");
				if (j < i)
					idx++;
				else
					idx--;
			}
			System.out.println();
		}
	}
}
