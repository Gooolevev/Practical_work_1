class Solution2 {
    public static int secondMethod( int first, int difference, int n) {
        if (n == 0) {
            return first;
        }

        return secondMethod(first, difference, n - 1) + difference;
    }

    public static void main(String[] args) {
        System.out.println("n = 3 (first=3, diff=4) -> " + secondMethod(3, 4, 3));
        System.out.println("n = 3 (first=10, diff=-2) -> " + secondMethod(10, -2, 3));
        System.out.println("n = 0 (first=7, diff=5) -> " + secondMethod(7, 5, 0));
    }
}