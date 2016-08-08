import java.util.*;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mCount = 0;
		int cCount = 0;

		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			int c = sc.nextInt();
			if (m > c)
				mCount++;
			else if (m < c)
				cCount++;
		}

		if (mCount > cCount)
			System.out.println("Mishka");
		else if (mCount < cCount)
			System.out.println("Chris");
		else
			System.out.println("Friendship is magic!^^");
	}
}
