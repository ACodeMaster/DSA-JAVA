class BubbleSortExample2{
    public static void main(String[]args){
        int[] marks = {78, 45, 92, 34, 67, 89, 56, 73};
        for (int i = 0; i < marks.length - 1; i++) {
            for (int j = 0; j < marks.length - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    // Swap elements
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }
        System.out.println("Marks in ascending order:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}