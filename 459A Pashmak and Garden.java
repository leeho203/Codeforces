import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = 0;
		int y3 = 0;
		int x4 = 0;
		int y4 = 0;
		boolean isThereAnswer = true;
		if (x1 == x2 && y1 == y2) {
			isThereAnswer = false;
		} else if (x1 == x2) {
			x3 = x1 + Math.abs(y2 - y1);
			y3 = y1;
			x4 = x2 + Math.abs(y2 - y1);
			y4 = y2;
		} else if (y1 == y2) {
			x3 = x1;
			y3 = y1 + Math.abs(x2 - x1);
			x4 = x2;
			y4 = y2 + Math.abs(x2 - x1);
		} else if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
			x3 = x1;
			y3 = y2;
			x4 = x2;
			y4 = y1;
		} else {
			isThereAnswer = false;
		}

		if (isThereAnswer)
			System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
		else
			System.out.println(-1);
	}
}
