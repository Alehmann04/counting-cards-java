package counting.cards;

import java.util.Random;

public class SlowShuffler {

  Random rand = new Random();

  public int[] SlowShuffle(int[] deck) {
    int[] shuffle = new int[deck.length];
    int n = 0;
    while (n < shuffle.length) {
      // pick random index
      int i = rand.nextInt(deck.length);
      boolean new_card = true;
      for (int x : shuffle) {
        if (deck[i] == x) {
          new_card = false;
        }
      }
      if (new_card) {
        shuffle[n] = deck[i];
        n++;
      }
    }
    return shuffle;
  }
}
