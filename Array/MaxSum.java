public class MaxSum {
    
    public static void MaxxSum(int arr[]){
        int MaximumSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end =j;
                int sum =0;
                for(int k=start;k<=end;k++){
                    
                    System.out.print(arr[k]+" ");
                    sum = sum + arr[k];
                    
                }
                
                System.out.println("\n Sum of SubArray is :"+sum);

                 if(sum<minSum){
                minSum = sum;
                }
                else if(sum > MaximumSum){
                    MaximumSum = sum;
                }
            }

           
        }
        System.out.println("Maximum Subarray Sum = " + MaximumSum);
        System.out.println("Minimum Subarray Sum = " + minSum);
    }


    public static void main(String args[]){
        int arr[] = {2,4,6,8,10,12};
        System.out.println("The Given Array is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("The subarrays are:");
        MaxxSum(arr);
    }
}
