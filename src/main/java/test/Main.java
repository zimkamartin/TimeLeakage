package test;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Path;

public class Main {

    private static final BigInteger Q = BigInteger.valueOf(17);
    private static final int NUM_OF_ROUNDS = 10000;
    private static final String RESULTS_PATH = "./result.txt";

    public static void main(String[] args) throws IOException {

        Path path = Path.of(RESULTS_PATH);

        Add.test(NUM_OF_ROUNDS, Q, path);
    }
}