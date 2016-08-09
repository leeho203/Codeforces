import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] temp = br.readLine().split(" ");
		HashMap<String, String> map = new HashMap<String, String>();
		int n = Integer.parseInt(temp[0]);
		int m = Integer.parseInt(temp[1]);

		for (int i = 0; i < m; i++) {
			String[] str = br.readLine().split(" ");
			String s0 = str[0];
			String s1 = str[1];
			String s2 = (s0.length() > s1.length()) ? s1 : s0;
			map.put(s0, s2);
		}

		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		while (st.hasMoreTokens()) {
			bw.write(map.get(st.nextToken()) + " ");
		}

		bw.flush();
	}
}
