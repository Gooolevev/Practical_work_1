package main;

public class SecondTask {

    public static int money(int first, int difference, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Номер дня n не может быть отрицательным");
        }
        if (n == 0) {
            return first;
        }
        return money(first, difference, n - 1) + difference;
    }
}