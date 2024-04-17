public class Task {
    public static void main(String[] args) {
        int[] numbers = {11, 2, 2, 24, 13, 7, 8, 8, 8, 17};
        printOddNumbers(numbers);
    }

    public static void printOddNumbers(int[] arr) {
        int lastOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                lastOdd = i;
            }
        }
        for (int i = 0; i < lastOdd; i++) {
            if (arr[i] % 2 == 1) {
                System.out.print(arr[i] + ",");
            }
        }
        if (arr[lastOdd] % 2 == 1) {
            System.out.println(arr[lastOdd]);
        }
    }
}

