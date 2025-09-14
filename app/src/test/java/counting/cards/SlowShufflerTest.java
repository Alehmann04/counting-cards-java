package counting.cards;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SlowShufflerTest {

  @Test
  void itShuffles() {
    SlowShuffler mixer = new SlowShuffler();
    int[] deck = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    assertNotEquals(deck, mixer.Shuffle(deck.clone()));
  }
}
