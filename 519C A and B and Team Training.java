import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] temp = br.readLine().split(" ");
		int XP = Integer.parseInt(temp[0]);
		int NB = Integer.parseInt(temp[1]);
		System.out.println(Math.min((XP + NB) / 3, Math.min(XP, NB)));
	}
}
