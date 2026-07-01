import java.util.*;
public class BubbleSort{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array : ");
    int n = sc.nextInt();
    int nums[] = new int[n];

    //user input
    for(int i=0; i<n; i++){
        System.out.print("Enter element at index "+(i+1)+" : ");
        nums[i] = sc.nextInt();
    }

    //Display Array
    System.out.print("The Array is : ");
    for(int i=0; i<n; i++){
        System.out.print(nums[i]+" ");
    }
    Bubble(nums);
    }

    public static void Bubble(int nums[]){
        for(int i=0; i<nums.length-1; i++){
            for(int j=0; j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    //swap
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.println("The sorted Array is : ");
        for(int i=0;i<nums.length;i++){
            System.out.print(+nums[i]+" ");
        }
    }

}