import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 0;
		for (int i = 0; i < n; i++)
			sum += sc.nextInt();

		double result = sum / n;

		System.out.printf("%.12f", result);
	}
}
