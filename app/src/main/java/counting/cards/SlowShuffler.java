package counting.cards;

import java.util.Random;

public class SlowShuffler {

  Random rand = new Random();
  int pointer = 0;

  int[] push(int[] deck, int value) {
    deck[pointer] = value;
    this.pointer++;
    return deck;
  }

  public int[] Shuffle(int[] deck) {
    int[] shuffle = new int[deck.length];
    int n = deck.length;
    int i;
    while (n > 0) {
      i = rand.nextInt(deck.length);
      if (deck[i] != -1) {
        shuffle = push(shuffle, deck[i]);
        deck[i] = -1;
        n--;
      }
    }
    return shuffle;
  }
}
