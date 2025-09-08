package counting.cards.jmh;

import counting.cards.GreetingGenerator;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Benchmark)
@Fork(value = 1, warmups = 2)
@Warmup(iterations = 2)
public class SampleBenchmark {

  @Benchmark
  @Timeout(time = 5, timeUnit = TimeUnit.SECONDS)
  public void sayHelloBenchmark(Blackhole bh) {
    GreetingGenerator generator = new GreetingGenerator();
    String output = generator.sayHello();
    bh.consume(output);
  }
}
