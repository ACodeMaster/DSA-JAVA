//  There is an integer array nums sorted in ascending order (with distinct values). 
// Prior to being passed to your function, nums is possibly rotated at an unknown 
// pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], 
// nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For 
// example, [0,1,2,4,5,6,7] might be rotated
//  at pivot index 3 and 
// become [4,5,6,7,0,1,2]. 
// Given the array nums after the possible rotation and an integer target, return the 
// index of target if it is in nums, or -1 if it is not in nums. 
// You must write an algorithm with O(log n) runtime complexity. 
// Example 1: 
// Input: 
// nums = [4, 5, 6, 7, 0, 1, 2], target = 0 
// Output: 4 
// Example 2: 
// Input: 
// nums = [4, 5, 6, 7, 0, 1, 2], target = 3 
// Output: -1 
// Example 3: 
// nums = [1], target = 0 
// Input: 
// Output: -1 
// Constraints: 
// •  1 <= nums . lengtth <= 5000 
// •  -104 <= nums [ i ] <= 104 
// •  All values of nums are unique. 
// •  nums is an ascending array that is possibly rotated. 
// •  -104 <= target <= 104

import java.util.*;

class Question {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();

        int nums[] = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Enter Element " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter number to be searched: ");
        int target = sc.nextInt();

        int result = BS(nums, target);

        System.out.println("Index = " + result);
    }

    public static int BS(int nums[], int target) {

        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(nums[mid] == target)
                return mid;

            // Left half is sorted
            if(nums[start] <= nums[mid]) {

                if(target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
            // Right half is sorted
            else {

                if(target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            }
        }

        return -1;
    }
} 