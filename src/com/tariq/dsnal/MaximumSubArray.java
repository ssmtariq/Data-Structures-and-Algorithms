package com.tariq.dsnal;

public class MaximumSubArray {

	/**
	 * LeetCode MaximumSubArray problem link
	 * @see <a href="https://leetcode.com/problems/maximum-subarray/description/">MaximumSubArray</a>
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
//		int[] nums = {1};
//		int[] nums = {-1};
//		int[] nums = {5,4,-1,7,8};
		int[] nums = {-2, 1};
		System.out.println(maxSubArray(nums));
	}
	
    public static int maxSubArray(int[] nums) {
        int start=0, end=start+1;
        int largestSum = nums[start], contigousSum=nums[start];
        while(start<nums.length) {
        	if(end==nums.length) {
        		start++;
        		end=start+1;
        		if(start==nums.length) break;
    			contigousSum=nums[start];
        	}else {
            	contigousSum += nums[end];
            	if(contigousSum>largestSum) largestSum = contigousSum;
            	if(nums[end]>largestSum) largestSum = nums[end];
            	end++;
        	}
        }
        return largestSum;
    }
}
