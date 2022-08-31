import java.io.*;
import java.util.*;

public class LeetCodeQfirstandLast {
//Q:Leetcode question, find the first and last position(index) of element in sorted
	//array of given target
	//value
	//logic of the program:if target is qual to mid then we find the first target value
	//then check wheather any value is present in the left and right side of the first occured
	//target value.perform binary search at the left hand side to find the first occurance
	//perform binary search on the right hand side for the last occurance
	
	
	public static void main(String[] args) {
		int[] nums= {5,7,7,7,8,8,9};
		int target=7;
		int[] ans=searchRange(nums,target);
		System.out.println(Arrays.toString(ans));
	}
	
	public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};//initial answer because you have to print -1,-1 
        //if no target is present
        
        
        
        // check for first occurrence if target first
        ans[0] = search(nums, target, true);//this is to check for the first index of the target(start value)
        if (ans[0] != -1) {//if first value found,then find second value(ans[1])
            ans[1] = search(nums, target, false);//this is to return final index of the target(end value)
        }
        return ans;
    }

    // this function just returns the index value of target
   static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
            	//if the target equal to mid then ans=mid then go to left side of mid
            	//using if(true){}
            	//go to right side using else
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
