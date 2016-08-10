import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int m = Integer.parseInt(br.readLine());
		String query[] = new String[3];

		for (int i = 0; i < m; i++) {
			query = br.readLine().split(" ");
			int l = Integer.parseInt(query[0]);
			int r = Integer.parseInt(query[1]);
			int k = Integer.parseInt(query[2]);
			String middle = str.substring(l - 1, r);
			k %= middle.length();
			middle = middle.substring(middle.length() - k) + middle.substring(0, middle.length() - k);
			str = str.substring(0, l - 1) + middle + str.substring(r);
		}

		bw.write(str);
		bw.flush();
	}
}
