public class FirstNegativeArray {

    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        for (int i = 0; i <= arr.length - k; i++) {
            int firstNegative = 0;
            for (int j = i; j < i + k; j++) {
                if (arr[j] < 0) {
                    firstNegative = arr[j];
                    break;
                }
            }

            System.out.print(firstNegative + " ");
        }
    }
}