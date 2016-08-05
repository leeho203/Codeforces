import java.util.*;
import java.io.*;

public class Main {

	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		char[] ch = new char[] { 'a', 'o', 'y', 'e', 'u', 'i' };

		String str = sc.nextLine();
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			boolean isConsonants = true;

			for (int j = 0; j < ch.length; j++)
				if (a == ch[j])
					isConsonants = false;

			if (isConsonants) {
				System.out.print(".");
				System.out.print(a);
			}
		}
	}
}
