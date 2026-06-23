import java.util.*;
class Kadane{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        //User input for array element

        for(int i =0; i<n;i++){
            System.out.print("Enter the element at position "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }

        //Display the Array
        System.out.print("THe Array is : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        //Calling kadanes algorithm method
        KD(arr);

    }
// Method to create kadanes algo
    public static void KD(int arr[]){
        int MaxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0; i<arr.length; i++){
            currSum = currSum + arr[i];
        
        if(currSum<0){
            currSum = 0;
        }

        MaxSum = Math.max(currSum,MaxSum);
    }

        System.out.println("\nMaximum Sum is : "+MaxSum);
    }
}