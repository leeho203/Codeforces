import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] data = new int[5001];

		int m = Integer.parseInt(br.readLine());
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		for (int i = 0; i < m; i++) {
			data[Integer.parseInt(st.nextToken())]++;
		}

		int cnt = 0;
		int maxIdx = Integer.MIN_VALUE;
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int i = 0; i < data.length; i++) {
			if (data[i] > 0) {
				maxIdx = Math.max(maxIdx, i);
				ans.add(i);
				data[i]--;
				cnt++;
			}
		}

		for (int i = maxIdx - 1; i >= 0; i--) {
			if (data[i] > 0) {
				ans.add(i);
				data[i]--;
				cnt++;
			}
		}

		bw.write(cnt + "\n");

		for (int i = 0; i < ans.size(); i++) {
			bw.write(ans.get(i) + "");
			if (i != ans.size() - 1)
				bw.write(" ");
		}

		bw.flush();
	}
}
