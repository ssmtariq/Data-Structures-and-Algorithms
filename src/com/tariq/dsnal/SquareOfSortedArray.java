package com.tariq.dsnal;

import java.util.Arrays;

public class SquareOfSortedArray {

    /**
     * LeetCode SquareOfSortedArray problem link
     * @see <a href="https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3240/">SquareOfSortedArray</a>
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        int[] nums = {-4,-1,0,3,10};
        int[] nums = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        for (int i=0; i<nums.length; i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
