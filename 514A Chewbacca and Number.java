import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		String ans = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (i == 0) {
				if (ch >= '5' && ch <= '8')
					ch = (char) (9 - Integer.parseInt(ch + "") + '0');
			} else {
				if (ch >= '5' && ch <= '9')
					ch = (char) (9 - Integer.parseInt(ch + "") + '0');
			}
			ans += ch;
		}

		System.out.println(ans);
	}
}
