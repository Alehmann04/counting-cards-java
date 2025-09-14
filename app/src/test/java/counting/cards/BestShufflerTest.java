package counting.cards;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BestShufflerTest {

  @Test
  void itShuffles() {
    BestShuffler mixer = new BestShuffler();
    int[] deck = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    assertNotEquals(deck, mixer.Shuffle(deck.clone()));
  }
}
