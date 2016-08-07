import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String result = "I hate it";

		for (int i = 2; i <= n; i++) {
			if (i % 2 == 1) {
				result = result.substring(0, result.length() - 2) + "that I hate "
						+ result.subSequence(result.length() - 2, result.length());
			} else {
				result = result.substring(0, result.length() - 2) + "that I love "
						+ result.subSequence(result.length() - 2, result.length());
			}
		}
		System.out.println(result);
	}
}
