public class FindMissingNumbers {

    public static void findMissing(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) - 1;
            if (arr[index] > 0) {
                arr[index] = -arr[index];
            }
        }
        // Display missing numbers
        System.out.print("Missing Numbers: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                System.out.print((i + 1) + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        findMissing(arr);
    }
}