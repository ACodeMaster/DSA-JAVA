// Given an integer array nums, return an array answer such that:

// answer[i] is equal to the product of all the elements of nums except nums[i].

import java.util.*;

public class Multiplication{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int nums[] = new int[n];
        
        //User inpput
        for(int i=0; i<n; i++){
            System.out.print("Enter element at position "+(i+1)+" : ");
            nums[i] = sc.nextInt();
        }

        //Display Array
        System.out.print("The Array is : ")
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        Mul(nums);
    }

    public static void Mul(int nums[]){
        boolean complete = false;
        int[] ans = new int[nums.length];
        
        for(int i=0; i<nums.length; i++){
            int product = 1;
            for(int j = 0; j<nums.length; j++){
                if(i!=j){
                    product *=nums[j];
                }
            }
            ans[i] = product;
        }
        System.out.print("\nAnswer: ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}