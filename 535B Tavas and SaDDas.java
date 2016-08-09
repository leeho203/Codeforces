import java.util.*;
import java.io.*;

public class Main {
	static long[] arr;
	static int k;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long lNum = Long.parseLong(br.readLine());
		arr = new long[1023];

		k = 1;
		dfs(4, k);
		k = 2;
		dfs(7, k);

		HashMap<Long, Integer> map = new HashMap<Long, Integer>();
		for (int i = 1; i < arr.length; i++)
			map.put(arr[i], i);

		System.out.println(map.get(lNum));
	}

	static void dfs(long n, int k) {
		if (n > 1000000000)
			return;
		arr[k] = n;
		dfs(n * 10 + 4, k * 2 + 1);
		dfs(n * 10 + 7, k * 2 + 2);
	}
}
