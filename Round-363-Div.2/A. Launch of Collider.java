import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		char[] chArr = new char[n];
		int[] nArr = new int[n];
		String str = br.readLine();
		for (int i = 0; i < n; i++)
			chArr[i] = str.charAt(i);

		str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		for (int i = 0; i < n; i++)
			nArr[i] = Integer.parseInt(st.nextToken());

		int minDiff = Integer.MAX_VALUE;
		for (int i = 0; i < n - 1; i++)
			if (chArr[i] == 'R' && chArr[i + 1] == 'L' && nArr[i] < nArr[i + 1])
				minDiff = Math.min(minDiff, (nArr[i + 1] - nArr[i]) / 2);

		if (minDiff >= Integer.MAX_VALUE)
			System.out.println(-1);
		else
			System.out.println(minDiff);
	}
}
