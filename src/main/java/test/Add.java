package test;

import java.io.BufferedWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public final class Add {

    private Add() {}

    public static void test(int n, BigInteger q, Path path) throws IOException {

        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            writer.write("ADD \n");

            for (BigInteger a = BigInteger.ZERO; a.compareTo(q) < 0; a = a.add(BigInteger.ONE)) {
                for (BigInteger b = BigInteger.ZERO; b.compareTo(q) < 0; b = b.add(BigInteger.ONE)) {
                    writer.write(a + "," + b + "\n");

                    long t0 = System.nanoTime();

                    for (int i = 0; i < n; i++) {
                        a.add(b);
                    }

                    long t1 = System.nanoTime();

                    double avgTime = (t1 - t0) / (double) n;
                    writer.write(avgTime + "\n");
                }
            }
        }
    }
}
