import java.util.*;
import java.io.*;

public class Main {
	static long[] arr;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long lNum = Long.parseLong(br.readLine());
		arr = new long[1023];
		
		dfs(0, 0);

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
