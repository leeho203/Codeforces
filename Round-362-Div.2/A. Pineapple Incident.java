import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = br.readLine().split(" ");
		int t = Integer.parseInt(str[0]);
		int s = Integer.parseInt(str[1]);
		int x = Integer.parseInt(str[2]);

		int num = -1;
		int i = 0;
		for (; num + 1 < x;) {
			num = t + i * s;
			i++;
		}

		if (t == x || num == x || (i > 1 && num + 1 == x))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
