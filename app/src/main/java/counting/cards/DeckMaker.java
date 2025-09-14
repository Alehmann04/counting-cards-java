package counting.cards;

public class DeckMaker {

  public int[] make(int length) {
    int[] deck = new int[length];
    for (int i = 0; i < length; i++) {
      deck[i] = i + 1;
    }
    return deck;
  }
}
