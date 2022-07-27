package com.tariq.dsnal;

public class FindEvenNumberOfDigits {

    /**
     * LeetCode FindEvenNumberOfDigits problem link
     * @see <a href="https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3237/">FindEvenNumberOfDigitsInArray</a>
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = {12,345,2,6,7896};
//        int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int counter=0;
        for (int number : nums){
            String str = String.valueOf(number);
            if(str.length()%2==0) counter++;
        }
        return counter;
    }
}
