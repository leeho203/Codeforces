import java.util.*;
import java.io.*;

public class Main {
	static class Card {
		private int cardNumber;
		private int owner;

		Card(int cardNumber, int owner) {
			this.cardNumber = cardNumber;
			this.owner = owner;
		}
	}

	static class CardComparator implements Comparator<Card> {
		@Override
		public int compare(Card c1, Card c2) {
			return c1.cardNumber - c2.cardNumber;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Card[] card = new Card[n];
		for (int i = 0; i < n; i++)
			card[i] = new Card(sc.nextInt(), i + 1);

		Arrays.sort(card, new CardComparator());

		for (int i = 0; i < n / 2; i++)
			System.out.println(card[i].owner + " " + card[n - 1 - i].owner);
	}
}
