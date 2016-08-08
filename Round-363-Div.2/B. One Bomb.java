import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] temp = br.readLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int m = Integer.parseInt(temp[1]);
		char[][] ch = new char[n + 1][m + 1];
		int[] row = new int[n + 1];
		int[] col = new int[m + 1];
		int starCnt = 0;
		int curCnt = 0;

		for (int i = 1; i <= n; i++) {
			String str = br.readLine();
			for (int j = 1; j <= m; j++) {
				ch[i][j] = str.charAt(j - 1);
				if (ch[i][j] == '*') {
					row[i]++;
					col[j]++;
					starCnt++;
				}
			}
		}

		int ansY = 0;
		int ansX = 0;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				curCnt = row[i] + col[j];
				if (ch[i][j] == '*')
					curCnt--;
				if (curCnt == starCnt) {
					ansY = i;
					ansX = j;
				}
			}
		}

		if (ansY != 0 && ansX != 0) {
			System.out.println("YES");
			System.out.println(ansY + " " + ansX);
		} else
			System.out.println("NO");
	}
}
