package counting.cards;

public class App {

  static String pp(int[] deck) {
    String output = "";
    for (int card : deck) {
      output += card + ", ";
    }
    return output.substring(0, (output.length() - 2));
  }

  public static void main(String[] args) {
    int[] deck = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    SlowShuffler slow_mixer = new SlowShuffler();
    int[] slow_shuffled = slow_mixer.Shuffle(deck.clone());
    String slow_output = pp(slow_shuffled);
    System.out.println("  slow shuffle: " + slow_output);

    BetterShuffler better_mixer = new BetterShuffler();
    int[] better_shuffled = better_mixer.Shuffle(deck.clone());
    String better_output = pp(better_shuffled);
    System.out.println("better shuffle: " + better_output);

    BestShuffler best_mixer = new BestShuffler();
    int[] best_shuffled = best_mixer.Shuffle(deck.clone());
    String best_output = pp(best_shuffled);
    System.out.println("  best shuffle: " + best_output);
  }
}
