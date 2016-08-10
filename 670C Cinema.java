import java.util.*;
import java.io.*;

public class Main {
	static class Movie {
		private int index;
		private int verySatisfied;
		private int almostSatisfied;

		Movie(int index, int verySatisfied, int almostSatisfied) {
			this.index = index;
			this.verySatisfied = verySatisfied;
			this.almostSatisfied = almostSatisfied;
		}
	}

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		String temp = br.readLine();
		StringTokenizer st = new StringTokenizer(temp, " ");
		for (int i = 0; i < n; i++) {
			int key = Integer.parseInt(st.nextToken());
			if (!map.containsKey(key))
				map.put(key, 1);
			else
				map.replace(key, map.get(key) + 1);
		}

		int m = Integer.parseInt(br.readLine());
		String temp1 = br.readLine();
		StringTokenizer st1 = new StringTokenizer(temp1, " ");
		String temp2 = br.readLine();
		StringTokenizer st2 = new StringTokenizer(temp2, " ");

		ArrayList<Movie> list = new ArrayList<Movie>();
		for (int i = 0; i < m; i++) {
			int verySatisfiedKey = Integer.parseInt(st1.nextToken());
			int verySatisfied = (map.containsKey(verySatisfiedKey)) ? map.get(verySatisfiedKey) : 0;

			int almostSatisfiedKey = Integer.parseInt(st2.nextToken());
			int almostSatisfied = (map.containsKey(almostSatisfiedKey)) ? map.get(almostSatisfiedKey) : 0;

			list.add(new Movie(i + 1, verySatisfied, almostSatisfied));
		}

		Collections.sort(list, new Comparator<Movie>() {
			@Override
			public int compare(Movie o1, Movie o2) {
				int result = o2.verySatisfied - o1.verySatisfied;
				if (o2.verySatisfied == o1.verySatisfied)
					result = o2.almostSatisfied - o1.almostSatisfied;
				return result;
			}
		});

		System.out.println(list.get(0).index);
	}
}
