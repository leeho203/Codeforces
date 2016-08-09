import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str1 = br.readLine();
		String str2 = br.readLine();
		int notEqual = 0;
		int halfCnt = 0;
		for (int i = 0; i < str1.length(); i++)
			if (str1.charAt(i) != str2.charAt(i))
				notEqual++;

		if (notEqual % 2 == 0) {
			halfCnt = notEqual / 2;
			int idx = 1;
			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) == str2.charAt(i))
					bw.write(str1.charAt(i));
				else {
					if (halfCnt >= idx)
						bw.write(str1.charAt(i));
					else
						bw.write(str2.charAt(i));
					idx++;
				}
			}
		} else
			bw.write("impossible");
		bw.flush();
	}
}
