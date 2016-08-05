import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");

		int[] cache = new int[1000001];
		int pile = 1;
		int idx = 1;
		while (st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			for (int i = 0; i < num; i++) {
				cache[idx] = pile;
				idx++;
			}
			pile++;
		}

		int m = Integer.parseInt(br.readLine());
		str = br.readLine();
		st = new StringTokenizer(str, " ");

		while (st.hasMoreTokens())
			bw.write(cache[Integer.parseInt(st.nextToken())] + "\n");

		bw.flush();
	}
}
