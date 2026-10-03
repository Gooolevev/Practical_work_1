package test;

import main.FirstTask;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FirstTaskTest {
    @Test
    void testBaseCases() {
        assertEquals(0, FirstTask.sumOfDigits(0));
        assertEquals(7, FirstTask.sumOfDigits(7));
    }

    @Test
    void testRecursiveCases() {
        assertEquals(14, FirstTask.sumOfDigits(572));
        assertEquals(6, FirstTask.sumOfDigits(1005));
    }
}