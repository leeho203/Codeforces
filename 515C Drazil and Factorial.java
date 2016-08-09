import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();

		String str = br.readLine();
		for (int i = 0; i < str.length(); i++) {
			int num = Integer.parseInt(str.charAt(i) + "");
			if (num >= 2 && num <= 9) {
				if (num == 4) {
					list.add(3);
					list.add(2);
					list.add(2);
				} else if (num == 6) {
					list.add(5);
					list.add(3);
				} else if (num == 8) {
					list.add(7);
					list.add(2);
					list.add(2);
					list.add(2);
				} else if (num == 9) {
					list.add(7);
					list.add(3);
					list.add(3);
					list.add(2);
				} else
					list.add(num);
			}
		}

		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o0, Integer o1) {
				return o1 - o0;
			}
		});

		for (int i : list)
			System.out.print(i);
	}
}
