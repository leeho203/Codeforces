import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] temp = br.readLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int m = Integer.parseInt(temp[1]);
		int[] data = new int[n];
		int sum = 0;
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		for (int i = 0; i < data.length; i++)
			data[i] = Integer.parseInt(st.nextToken());

		Arrays.sort(data);

		for (int i = 0; i < m; i++)
			sum += (data[i] < 0) ? data[i] : 0;

		System.out.println(-sum);
	}
}
