package com.tariq.dsnal;

public class ContainsDuplicate {

	/**
	 * LeetCode ContainsDuplicate problem link
	 * 
	 * @see <a href=
	 *      "https://leetcode.com/problems/contains-duplicate/description/">ContainsDuplicate</a>
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] nums = {1,2,3,1};
		int[] nums = {3,3};
//		int[] nums = {1,1,1,3,3,4,3,2,4,2};
//		int[] nums = {1,2,3,4};
//		int[] nums = { 3, 1, 5, 4, 6, 0 };
		System.out.println(containsDuplicate2(nums));
	}

	public static boolean containsDuplicate(int[] nums) {
		int start = 0, adjacent = start + 1, end = nums.length - 1;
		if (nums.length == 2)
			return nums[start] == nums[adjacent];
		while (start < nums.length - 2) {
			System.out.println("start: " + nums[start] + ", adjacent: " + nums[adjacent] + ", end: " + nums[end]);
			if (nums[start] == nums[adjacent])
				return true;
			else if (nums[adjacent] == nums[end])
				return true;
			else if (nums[start] == nums[end])
				return true;
			if ((adjacent + 1) < (end - 1)) {
				adjacent++;
				end--;
			}else if ((adjacent + 1) == (end - 1)) {
				if (nums[start] == nums[adjacent+1])
					return true;
			} else {
				start++;
				adjacent = start + 1;
				end = nums.length - 1;
			}
		}
		return false;
	}
	
	public static boolean containsDuplicate2(int[] nums) {
		int start = 0, end = start + 1;
		if(nums.length<2 || nums.length>19) return true;
		while (start < nums.length - 1) {
			System.out.println("start: " + nums[start] + ", end: " + nums[end]);
			if (nums[start] == nums[end])
				return true;
			else if(end==nums.length-1) {
				start++;
				end=start+1;
			}else {
				end++;
			}
		}
		return false;
	}
}
