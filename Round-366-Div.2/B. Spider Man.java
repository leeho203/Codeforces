import java.util.*;
import java.io.*;

public class Main2 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int sum = 0;
		while (st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			sum += (num - 1);
			if (sum % 2 == 0)
				bw.write(2 + "\n");
			else
				bw.write(1 + "\n");
		}

		bw.flush();
	}
}
