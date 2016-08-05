import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer, Integer> tree1 = new HashMap<Integer, Integer>();
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		while (st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			if (tree1.containsKey(num))
				tree1.put(num, tree1.get(num) + 1);
			else
				tree1.put(num, 1);
		}

		HashMap<Integer, Integer> tree2 = new HashMap<Integer, Integer>();
		str = br.readLine();
		st = new StringTokenizer(str, " ");
		while (st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			if (tree2.containsKey(num))
				tree2.put(num, tree2.get(num) + 1);
			else
				tree2.put(num, 1);

			if (tree1.get(num) == 1)
				tree1.remove(num);
			else if (tree1.get(num) > 1)
				tree1.replace(num, tree1.get(num) - 1);
		}

		str = br.readLine();
		st = new StringTokenizer(str, " ");
		while (st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			if (tree2.get(num) == 1)
				tree2.remove(num);
			else if (tree2.get(num) > 1)
				tree2.replace(num, tree2.get(num) - 1);
		}

		for (Integer key : tree1.keySet())
			System.out.println(key);

		for (Integer key : tree2.keySet())
			System.out.println(key);
	}
}
