package counting.cards.jmh;

import counting.cards.BestShuffler;
import counting.cards.BetterShuffler;
import counting.cards.DeckMaker;
import counting.cards.SlowShuffler;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Benchmark)
@Warmup(iterations = 2, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.SECONDS)
@Timeout(time = 5, timeUnit = TimeUnit.SECONDS)
@Fork(value = 1)
//@Threads(5)
public class ShufflerBenchmark {

  DeckMaker deck_maker = new DeckMaker();
  int[] deck;

  //@Param({ "10", "20", "30", "52", "90", "100", "200", "500", "1000" })
  @Param({ "0" })
  int deck_length;

  @Setup
  public void doSetup() {
    deck = deck_maker.make(deck_length);
  }

  @Benchmark
  public void itBestShufflesBenchmark(Blackhole bh) {
    BestShuffler mixer = new BestShuffler();
    int[] output = mixer.Shuffle(deck.clone());
    bh.consume(output);
  }

  @Benchmark
  @Timeout(time = 5, timeUnit = TimeUnit.SECONDS)
  public void itBetterShufflesBenchmark(Blackhole bh) {
    BetterShuffler mixer = new BetterShuffler();
    int[] output = mixer.Shuffle(deck.clone());
    bh.consume(output);
  }

  @Benchmark
  public void itSlowShufflesBenchmark(Blackhole bh) {
    SlowShuffler mixer = new SlowShuffler();
    int[] output = mixer.Shuffle(deck.clone());
    bh.consume(output);
  }
}
