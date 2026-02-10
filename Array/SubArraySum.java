class SubArraysSum{
    
    public static void SAS(int arr[]){
        for(int i=0;i<arr.length;i++){
            int start = i;
            for (int j=i;j<arr.length;j++){
                int end = j;
                int sum = 0;        //reset sum variable to be 0
                for(int k =start;k<=end;k++){
                    System.out.print(+arr[k]+" ");
                    sum = sum +arr[k];          //add the elements of array to sum variable as it is added in arrays
                }
                System.out.println("-->Sum for this subarray is :"+sum);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12};
        System.out.print("THe given Array is:");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("The subarrays are:");
        SAS(arr);
    }
    
}