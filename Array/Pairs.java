public class Pairs {
    
    public static void PA(int arr[]){
        System.out.println("Pairs in array are:");
        for (int i= 0; i< arr.length; i++){
            for(int j=0;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12};
        System.out.print("The Given Array is:");
        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    PA(arr);
        
    }
}
