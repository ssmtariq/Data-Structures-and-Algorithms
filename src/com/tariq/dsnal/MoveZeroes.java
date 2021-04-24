package com.tariq.dsnal;

import java.util.Arrays;

public class MoveZeroes {

	/**
	 * LeetCode MoveZeroes problem link
	 * @see <a href="https://leetcode.com/problems/move-zeroes/description/">MoveZeroes</a>
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] nums = {0,1,0,3,12};
		int[] nums = {0,-2};
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
	}

    public static void moveZeroes(int[] nums) {
        int start=0, end=start+1;
        while(end<nums.length) {
        	if(nums[start]!=0) {
        		start++;
        		end++;
        	}else if(nums[end]==0) {
        		end++;
        	}else {
        		int temp = nums[end];
        		nums[end] = nums[start];
        		nums[start] = temp;
        	}
        }
    }
}
