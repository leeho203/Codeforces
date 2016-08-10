import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] temp = br.readLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int q = Integer.parseInt(temp[1]);

		Integer[] data = new Integer[n];
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		for (int i = 0; i < n; i++)
			data[i] = Integer.parseInt(st.nextToken());

		Arrays.sort(data, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});

		Integer[] bound = new Integer[n + 2];
		for (int i = 0; i < bound.length; i++)
			bound[i] = 0;

		for (int i = 0; i < q; i++) {
			String[] query = br.readLine().split(" ");
			int l = Integer.parseInt(query[0]);
			int r = Integer.parseInt(query[1]);
			bound[l]++;
			bound[r + 1]--;
		}

		for (int i = 1; i < bound.length; i++)
			bound[i] += bound[i - 1];

		Arrays.sort(bound, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});

		long sum = 0;
		for (int i = 0; i < data.length; i++)
			sum += data[i] * 1L * bound[i];
		bw.write(sum + "\n");
		bw.flush();
	}
}
