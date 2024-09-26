package MyPackage;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStream {
	public static long measureSumPerf(Function <Long, Long> adder, long n) {
		long fastest = Long.MAX_VALUE;
		for (int i = 0; i < 10; i++) {
		long start = System.nanoTime();
		long sum = adder.apply(n);
		long duration = (System.nanoTime() - start) / 1_000_000;
		System.out.println("Result: " + sum);
		if (duration < fastest) fastest = duration;
		}
		return fastest;
		}
	
	
	public static void main(String[] args) {
		Function<Long, Long> simpleAdder = num -> {
	        long result = 0;
	        for (long i = 0; i <= num; i++) {
	            result += i;
	        }
	        return result;
	    };

	    long fastestTime = measureSumPerf(simpleAdder, 1_000_000);
	    System.out.println("Fastest execution time: " + fastestTime + " millistrueeconds");
	
	    List<Integer> numbers = IntStream.rangeClosed(1, 1000).boxed().collect(Collectors.toList());

        // Sequential square calculation
        long startSequential = System.currentTimeMillis();
        List<Integer> sequentialSquares = squareNumbersSequential(numbers);
        long endSequential = System.currentTimeMillis();
        System.out.println("Sequential Time: " + (endSequential - startSequential) + " ms");

        // Parallel square calculation
        long startParallel = System.currentTimeMillis();
        List<Integer> parallelSquares = squareNumbersParallel(numbers);
        long endParallel = System.currentTimeMillis();
        System.out.println("Parallel Time: " + (endParallel - startParallel) + " ms");

        // Ensure the results are the same in both cases
        System.out.println("Results are equal: " + sequentialSquares.equals(parallelSquares));
    }

    // Sequential square calculation using Stream
    private static List<Integer> squareNumbersSequential(List<Integer> numbers) {
        return numbers.stream()
                .map(num -> timeConsumingOperation(num))
                .collect(Collectors.toList());
    }

    // Parallel square calculation using Parallel Stream
    private static List<Integer> squareNumbersParallel(List<Integer> numbers) {
        return numbers.parallelStream()
                .map(num -> timeConsumingOperation(num))
                .collect(Collectors.toList());
    }

    // Simulate a time-consuming operation
    private static int timeConsumingOperation(int num) {
        try {
            // Simulate a time-consuming operation (e.g., processing, I/O)
            Thread.sleep(5);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return num * num;
	
	
	}
}
