package test;

import main.ThirdTask;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class ThirdTaskTest {

    @Test
    void testBaseCases() {
        assertEquals(1L, ThirdTask.countSubsetsLong(0));
        assertEquals(2L, ThirdTask.countSubsetsLong(1));

        assertEquals(BigInteger.ONE, ThirdTask.countSubsetsBigInteger(0));
        assertEquals(BigInteger.valueOf(2), ThirdTask.countSubsetsBigInteger(1));
    }

    @ParameterizedTest
    @CsvSource({
            "2, 4",
            "3, 8",
            "5, 32",
            "10, 1024",
            "12, 4096"
    })
    void testRecursiveCases(int n, long expected) {
        assertEquals(expected, ThirdTask.countSubsetsLong(n));
        assertEquals(BigInteger.valueOf(expected), ThirdTask.countSubsetsBigInteger(n));
    }

    @Test
    void testFindOverflowN() {
        int overflowN = -1;

        for (int n = 1; n <= 70; n++) {
            BigInteger bigResult = ThirdTask.countSubsetsBigInteger(n);
            long longResult = ThirdTask.countSubsetsLong(n);

            if (!BigInteger.valueOf(longResult).equals(bigResult)) {
                overflowN = n;
                System.out.println("Переполнение типа long происходит при n = " + n);
                System.out.println("Ожидалось (BigInteger): " + bigResult);
                System.out.println("Получено (long):       " + longResult);
                break;
            }
        }
        assertEquals(63, overflowN);
    }
}