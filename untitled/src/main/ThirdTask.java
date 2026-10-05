package main;

import java.math.BigInteger;

public class ThirdTask {

    public static long countSubsetsLong(int n) {
        return 1L << n;
    }

    public static BigInteger countSubsetsBigInteger(int n) {
        return BigInteger.valueOf(2).pow(n);
    }

    public static void generateSubsets(int[] values, int index, int[] current, int currentSize) {
        if (index == values.length) {
            System.out.print("{");
            for (int i = 0; i < currentSize; i++) {
                System.out.print(current[i] + (i < currentSize - 1 ? ", " : ""));
            }
            System.out.println("}");
            return;
        }

        generateSubsets(values, index + 1, current, currentSize);

        current[currentSize] = values[index];
        generateSubsets(values, index + 1, current, currentSize + 1);
    }
}