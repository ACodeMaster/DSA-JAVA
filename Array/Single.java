// Given a non-empty array of integers nums, every element appears twice except for one.
//  Find that single one.You must implement a solution with a linear runtime complexity
//  and use only constant extra space.

import java.util.*;

class Single{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();
        int nums[] = new int[n];

        //User input for elements in array
        for(int i=0; i<n; i++){
            System.out.print("Enter the element at position "+(i+1)+" :");
            nums[i] = sc.nextInt();
        }
        //Display the array
        System.out.print("The Array is : ");
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        int result = SingleT(nums);
        System.out.print("\nThe element appearing only once is : "+result);
    }

    //Method to print element appearing single time in array
    public static int SingleT(int nums[]){
        for(int i=0; i<nums.length; i++){
            boolean found = false;
            for(int j=0; j<nums.length; j++){
                if(i!=j && nums[i]==nums[j]){
                    found =true;
                    break;
                }
            }
            if(!found){
                return nums[i];
            }
        }
        return -1;
    }
}