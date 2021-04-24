package com.tariq.dsnal;

import java.util.Arrays;

public class TwoSum {

	/**
	 * LeetCode TwoSum problem link
	 * @see <a href="https://leetcode.com/problems/two-sum/description/">TwoSum</a>
	 */
	public static void main(String[] args) {
		// Test Inputs
//		int[] nums = {2,7,11,15};
//		int target = 9;
//		int[] nums = {3,2,4};
		int[] nums = {3,3};
		int target = 6;
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}
    public static int[] twoSum(int[] nums, int target) {
        int [] indices = new int[2];
        int start=0, end=1;
        while(start<=nums.length-2 && (nums[start]+nums[end])!=target) {
        	if(end==nums.length-1) {
        		start++;
        		end = start+1;
        	}else {
        		end++;
        	}
        }
        indices[0]=start;
        indices[1]=end;
        return indices;
    }
}
