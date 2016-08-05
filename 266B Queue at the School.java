import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		sc.nextLine();
		String queue = sc.nextLine();

		char[] data = new char[n];

		for (int i = 0; i < data.length; i++)
			data[i] = queue.charAt(i);

		for (int i = 1; i <= t; i++) {
			String str = "";
			for (int j = 0; j < data.length; j++)
				str += data[j];

			for (int j = 1; j < data.length; j++) {
				if (str.charAt(j) == 'G' && str.charAt(j - 1) == 'B') {
					char temp = data[j - 1];
					data[j - 1] = data[j];
					data[j] = temp;
				}
			}
		}

		for (int i = 0; i < data.length; i++)
			System.out.print(data[i]);
	}
}
