package test;

import main.SecondTask;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SecondTaskTest {

    @Test
    void testBaseCase() {
        assertEquals(3, SecondTask.money(3, 4, 0));
        assertEquals(10, SecondTask.money(10, -2, 0));
    }

    @Test
    void testRecursiveCases() {
        assertEquals(15, SecondTask.money(3, 4, 3));
        assertEquals(4, SecondTask.money(10, -2, 3));
        assertEquals(25, SecondTask.money(5, 5, 4));
    }
}