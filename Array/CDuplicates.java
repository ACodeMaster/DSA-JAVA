// Given an integer array nums, return true if any value appears at least twice in the 
// array, and return false if every element is distinct.

import java.util.*;
public class CDuplicates{
    public static void main(String[]args){
        int nums[] = {1,2,3,4,5,6,1};

        //Display the Array
        System.out.print("The Array is: ");
        for(int i=0; i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }

        System.out.print("\nResult is : "+Duplicates(nums));
    }

    public static boolean Duplicates(int nums[]){
        for(int i =0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}