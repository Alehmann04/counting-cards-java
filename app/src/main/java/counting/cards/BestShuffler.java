package counting.cards;

import java.util.Random;

public class BestShuffler {

  Random rand = new Random();
  int pointer = 0;

  int[] swap(int[] deck, int m, int i) {
    int temp = deck[m];
    deck[m] = deck[i];
    deck[i] = temp;
    return deck;
  }

  public int[] Shuffle(int[] deck) {
    int m = deck.length - 1;
    int i;

    while (m > 0) {
      i = rand.nextInt(m);
      deck = swap(deck, m, i);
      m--;
    }
    return deck;
  }
}
