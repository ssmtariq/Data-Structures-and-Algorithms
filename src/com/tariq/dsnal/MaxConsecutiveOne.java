package com.tariq.dsnal;

public class MaxConsecutiveOne {

    /**
     * LeetCode MaximumConsecutiveOnesInArray problem link
     * @see <a href="https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/">MaximumConsecutiveOnesInArray</a>
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        int[] nums = {1,1,0,1,1,1};
		int[] nums = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxFrequency=0, frequency=0;
        for (int n: nums){
            if(n==1){
                frequency++;
                maxFrequency= Math.max(frequency, maxFrequency);
            }else {
                maxFrequency= Math.max(frequency, maxFrequency);
                frequency=0;
            }
        }
        return maxFrequency;
    }
}
