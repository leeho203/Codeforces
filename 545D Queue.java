import java.util.*;
import java.io.*;

public class Main {
	static long[] arr;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n + 1];
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		for (int i = 1; i <= n; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		Arrays.sort(arr);
		int sum = 0;
		int cnt = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] >= sum) {
				sum += arr[i];
				cnt++;
			} else
				continue;
		}

		System.out.println(cnt);
	}
}
