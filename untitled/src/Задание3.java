class Solution3 {

    static void thirdMethod(int[] values, int index, int[] current, int currentSize) {
        if (index == values.length) {
            printArray(current, currentSize);
            return;
        }

        thirdMethod(values, index + 1, current, currentSize);

        current[currentSize] = values[index];
        thirdMethod(values, index + 1, current, currentSize + 1);
    }

    private static void printArray(int[] arr, int size) {
        System.out.print("{ ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + (i < size - 1 ? ", " : " "));
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3};
        int[] current = new int[values.length];

        thirdMethod(values, 0, current, 0);
    }
}