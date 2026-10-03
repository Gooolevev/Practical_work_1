class Solution1 {
    public static int firstSum(int n) {

        if ( n < 10) {
            return n;
        }

        return (n % 10) + firstSum(n / 10);
    }

    public static void main(String[] args) {

        System.out.println("0 -> " + firstSum(0));
        System.out.println("7 -> " + firstSum(7));
        System.out.println("572 -> " + firstSum(572));
        System.out.println("1005 -> " + firstSum(1005));
    }
}



