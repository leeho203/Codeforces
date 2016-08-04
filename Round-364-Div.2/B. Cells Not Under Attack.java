import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] xArr = new int[100001];
		int[] yArr = new int[100001];

		String[] temp = br.readLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int m = Integer.parseInt(temp[1]);

		long xRemain = n;
		long yRemain = n;

		for (int i = 0; i < m; i++) {
			String[] data = br.readLine().split(" ");
			int y = Integer.parseInt(data[0]);
			int x = Integer.parseInt(data[1]);

			if (xArr[x] == 0) {
				xArr[x]++;
				xRemain--;
			}

			if (yArr[y] == 0) {
				yArr[y]++;
				yRemain--;
			}

			bw.write(xRemain * yRemain + " ");
		}

		bw.flush();
	}
}
