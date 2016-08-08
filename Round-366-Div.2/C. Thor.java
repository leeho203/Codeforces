import java.util.*;
import java.io.*;

public class Main {

	static class Element {
		private int idx;
		private int x;

		Element(int idx, int x) {
			this.idx = idx;
			this.x = x;
		}
	}

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] temp = br.readLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int q = Integer.parseInt(temp[1]);
		int cnt = 0;
		// 1이면 아직 안 읽음, 0이면 읽음
		int[] mark = new int[300001];
		// (idx, x) 저장하는 큐
		LinkedList<Element> que = new LinkedList<Element>();
		// 각 x에 대한 idx를 저장하는 큐
		LinkedList<Integer> e[] = new LinkedList[n + 1];
		for (int i = 0; i < e.length; i++)
			e[i] = new LinkedList();

		int elemIdx = 1;

		for (int i = 0; i < q; i++) {
			String[] str = br.readLine().split(" ");
			int type = Integer.parseInt(str[0]);
			int num = Integer.parseInt(str[1]);

			if (type == 1) {
				que.add(new Element(elemIdx, num));
				e[num].add(elemIdx);
				mark[elemIdx] = 1;
				elemIdx++;
				cnt++;
			} else if (type == 2) {
				while (!e[num].isEmpty()) {
					mark[e[num].get(0)] = 0;
					e[num].remove(0);
					cnt--;
				}
			} else if (type == 3) {
				while (!que.isEmpty() && que.get(0).idx <= num) {
					int idx = que.get(0).idx;
					int x = que.get(0).x;
					que.remove(0);
					if (mark[idx] == 1) {
						mark[idx] = 0;
						e[x].remove(0);
						cnt--;
					}
				}
			}
			bw.write(cnt + "\n");
		}

		bw.flush();
	}
}
