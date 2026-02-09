class SubArrays{
    
    public static void SA(int arr[]){
        for(int i=0;i<arr.length;i++){
            int start = i;
            for (int j=i;j<arr.length;j++){
                int end = j;
                for(int k =start;k<=end;k++){
                    System.out.print(+arr[k]+" ");
                }
                System.out.println();
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
        System.out.println("The suarrays are:");
        SA(arr);
    }
    
}