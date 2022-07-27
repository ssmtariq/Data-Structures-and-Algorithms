package com.tariq.dsnal;

import java.util.Arrays;

public class RotateArray {

	/**
	 * LeetCode RotateArray problem link
	 * @see <a href="https://leetcode.com/problems/rotate-array/description/">RotateArray</a>
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] nums = {1,2,3,4,5,6,7};
		int[] nums = {1,2,3,4,5};
//		int[] nums = {-1};
//		int[] nums = {1,2};
//		int[] nums = {-1,-100,3,99};
		rotate(nums, 3);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ",");
		}
	}
    
    public static void rotate(int[] nums, int k) {
    	if(k<nums.length && nums.length>1) {
        	int [] array = Arrays.copyOf(nums, nums.length);
        	int index = k;
        	for (int i = 0; i < nums.length - k; i++) {
    			nums[index] = array[i];
    			index++;
    		}
//


        	for (int i = 0; i < k; i++) {
    			nums[i] = array[nums.length-k+i];
    		}
    	}else {
    		while (k > 0) {
    			int temp = nums[nums.length - 1];
    			for (int i = 0; i < nums.length - 1; i++) {
    				nums[(nums.length - 1) - i] = nums[(nums.length - 1) - i - 1];
    			}
    			k--;
    			nums[0] = temp;
    		}
    	}
    }
}
