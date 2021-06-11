package com.tariq.dsnal;

public class RemoveElement {

	/**
	 * LeetCode RemoveElement problem link
	 * 
	 * @see <a href=
	 *      "https://leetcode.com/problems/remove-element/">RemoveElement</a>
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Test Inputs
		int[] nums = {0,1,2,2,3,0,4,2};
//		int[] nums = {3,2,2,3};
//		int[] nums = {1};
		int val=2;
		System.out.println(removeElement(nums, val));
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ",");
		}
	}

    public static int removeElement(int[] nums, int val) {
    	int i=0, index=-1; 
    	int count=0;
    	if(nums.length==0) return count;
    	while (i < nums.length) {
    		if(nums[i]==val && index<0) {
    			index=i;
			} else if (nums[i] != val && index >= 0) {
				nums[index] = nums[i];
				nums[i]=val;
				i = index;
				index = -1;
			}
			i++;
    	}
    	i=0;
    	while (i < nums.length) {
    		if(nums[i] != val) {
    			count++;
    		}
    		i++;
    	}
        return count;
    }
}
