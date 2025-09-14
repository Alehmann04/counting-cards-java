package counting.cards;

import java.util.Random;

public class BetterShuffler {

  Random rand = new Random();
  int pointer = 0;

  int[] push(int[] deck, int value) {
    deck[pointer] = value;
    this.pointer++;
    return deck;
  }

  int[] splice(int[] deck, int index) {
    int[] output = new int[deck.length - 1];
    for (int i = 0; i < index; i++) {
      output[i] = deck[i];
    }
    for (int i = index + 1; i < deck.length; i++) {
      output[i - 1] = deck[i];
    }
    return output;
  }

  public int[] Shuffle(int[] deck) {
    int[] shuffle = new int[deck.length];
    int n = deck.length;
    while (n > 0) {
      int i = rand.nextInt(n);
      shuffle = push(shuffle, deck[i]);
      deck = splice(deck, i);
      n--;
    }
    return shuffle;
  }
}
