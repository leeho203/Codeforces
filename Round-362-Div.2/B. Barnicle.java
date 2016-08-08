import java.io.*;
import java.math.BigDecimal;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int eIdx = str.indexOf('e');
		BigDecimal p = new BigDecimal((str.substring(0, eIdx))).stripTrailingZeros();
		int q = Integer.parseInt(str.substring(eIdx + 1));
		p = p.movePointRight(q);
		System.out.println(p.toString());
	}
}
