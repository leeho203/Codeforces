import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int m = Integer.parseInt(temp[1]);
		int[] data = new int[m];
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		for (int i = 0; i < m; i++)
			data[i] = Integer.parseInt(st.nextToken());

		long result = data[0] - 1;
		for (int i = 0; i < data.length - 1; i++) {
			if (data[i] < data[i + 1])
				result += data[i + 1] - data[i];
			else if (data[i] > data[i + 1])
				result += (n - data[i]) + data[i + 1];
		}

		System.out.println(result);
	}
}
