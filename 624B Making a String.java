import java.util.*;
import java.io.*;

public class Main {

	static class DataComparator implements Comparator<Integer> {
		@Override
		public int compare(Integer o1, Integer o2) {
			return o2 - o1;
		}
	}

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Integer[] data = new Integer[n];
		long sum = 0;

		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");

		for (int i = 0; i < n; i++)
			data[i] = Integer.parseInt(st.nextToken());

		Arrays.sort(data, new DataComparator());

		int compare = data[0];

		for (int i = 0; i < n; i++) {
			if (compare < data[i])
				data[i] = compare;
			if (compare > 0)
				compare = data[i] - 1;
		}

		for (int d : data)
			sum += d;
		
		System.out.println(sum);
	}
}
