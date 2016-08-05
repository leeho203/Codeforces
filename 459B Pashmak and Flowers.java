import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] data = new int[n];
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < data.length; i++) {
			data[i] = Integer.parseInt(st.nextToken());
			min = Math.min(min, data[i]);
			max = Math.max(max, data[i]);
		}

		int minCount = 0;
		int maxCount = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == min)
				minCount++;
			if (data[i] == max)
				maxCount++;
		}

		long result = 0;
		if (max == min)
			result = n * 1L * (n - 1) / 2;
		else
			result = minCount * 1L * maxCount;

		System.out.println((max - min) + " " + result);
	}
}
