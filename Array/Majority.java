// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times.
//  You may assume that the majority element always exists in the array.

import java.util.*;
class Majority{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int nums [] = new int [n];

        //User input for elements in array
        
        for(int i=0; i<n; i++){
            System.out.print("Enter the element at position "+(i+1)+" :");
            nums[i] = sc.nextInt();
        }

        //Display Array
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        int result = ME(nums);
        System.out.print("\nThe Majority Element is : "+result);
    }

    //New method to print majority element
    public static int ME(int nums[]){
        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count > nums.length / 2){
                return nums[i];
            }
        }
        return -1;
    }
} 