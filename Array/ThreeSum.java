import java.util.*;

public class ThreeSum{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        //User Input
        for(int i=0; i<n; i++){
            System.out.print("Enter the Element at position "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }

        //Display Array
        System.out.print("The Array is : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        Three(arr);
    }

    public static void Three(int arr[]){
        boolean found = false;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length;j++){
                for(int k=j+1; k<arr.length; k++){
                    if((arr[i]+arr[j]+arr[k])==0){
                        System.out.println("["+arr[i]+" "+arr[j]+" "+arr[k]+"]");
                        found = true;
                    }
                }
            }
        }
        if(!found){
            System.out.print("Triplet not found..");
        }
    }
}