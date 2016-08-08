import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] temp = br.readLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int k = Integer.parseInt(temp[1]);
		long sum = 0;
		long ans = 0;
		int[] c = new int[n + 1];
		int[] mark = new int[n + 1];
		int i = 1;

		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		while (st.hasMoreTokens()) {
			c[i] = Integer.parseInt(st.nextToken());
			sum += c[i];
			i++;
		}

		str = br.readLine();
		st = new StringTokenizer(str, " ");
		while (st.hasMoreTokens()) {
			int id = Integer.parseInt(st.nextToken());
			mark[id] = 1;
			ans += c[id] * (sum - c[id]);
			sum -= c[id];
		}

		for (int idx = 1; idx < n; idx++)
			if (mark[idx] == 0 && mark[idx + 1] == 0)
				ans += c[idx] * c[idx + 1];

		if (mark[1] == 0 && mark[n] == 0)
			ans += c[1] * c[n];

		System.out.println(ans);
	}
}
