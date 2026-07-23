public class CountPositive {
    public static void main(String[] args) {
        int[] arr = {-5, 10, 0, 8, -2, 15, -7};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        System.out.println("Number of positive elements : " + count);
    }
}