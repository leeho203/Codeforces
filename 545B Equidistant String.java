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
		
		// 다른 비트수가 짝수이면 str1과 str2와의 해밍거리가 같은 특정 str을 구할 수 있으나 
		// 다른 비트수가 홀수이면 구할 수 없다
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
