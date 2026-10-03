package test;

import main.Factorial;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void testBaseCases() {
        assertEquals(1L, Factorial.factorialLong(0));
        assertEquals(1L, Factorial.factorialLong(1));

        assertEquals(BigInteger.ONE, Factorial.factorialBigInteger(0));
        assertEquals(BigInteger.ONE, Factorial.factorialBigInteger(1));
    }

    @ParameterizedTest
    @CsvSource({
            "2, 2",
            "5, 120",
            "10, 3628800",
            "12, 479001600"
    })
    void testRecursiveCases(int n, long expected) {
        assertEquals(expected, Factorial.factorialLong(n));
        assertEquals(BigInteger.valueOf(expected), Factorial.factorialBigInteger(n));
    }

    @Test
    void testFindOverflowN() {
        int overflowN = -1;

        for (int n = 1; n <= 30; n++) {
            BigInteger bigResult = Factorial.factorialBigInteger(n);
            long longResult = Factorial.factorialLong(n);

            if (!BigInteger.valueOf(longResult).equals(bigResult)) {
                overflowN = n;
                System.out.println("Переполнение типа long происходит при n = " + n);
                System.out.println("Ожидалось (BigInteger): " + bigResult);
                System.out.println("Получено (long):       " + longResult);
                break;
            }
        }
        assertEquals(21, overflowN);
    }
}