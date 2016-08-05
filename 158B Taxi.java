import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] data = new int[5];
		int cnt = 0;

		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		while (st.hasMoreTokens())
			data[Integer.parseInt(st.nextToken())]++;

		cnt = data[4] + data[3] + data[2] / 2;
		data[1] -= data[3];

		if (data[2] % 2 == 1) {
			cnt++;
			data[1] -= 2;
		}

		if (data[1] > 0)
			cnt += (data[1] + 3) / 4;

		System.out.println(cnt);
	}
}
