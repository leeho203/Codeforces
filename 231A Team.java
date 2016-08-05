import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			int sure = sc.nextInt() + sc.nextInt() + sc.nextInt();
			if (sure >= 2)
				cnt++;
		}

		System.out.println(cnt);
	}
}
