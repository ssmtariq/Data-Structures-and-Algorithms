package com.tariq.dsnal;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DuplicateZeroShiftElementToRight {

    /**
     * LeetCode DuplicateZeroShiftElementToRight problem link
     *
     * @see <a href="https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3245/">DuplicateZeroShiftElementToRight</a>
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        int[] nums = {1,0,2,3,0,4,5,0};
//        int[] nums = {1,2,3};
        int[] nums = {0, 4, 1, 0, 0, 8, 0, 0, 3};
        duplicateZeros(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void duplicateZerosBruteForce(int[] arr) {
        int start = 0, end = arr.length - 1;
        Queue<Integer> buffer = new LinkedList<>();
        while (start <= end) {
            if (buffer.peek() == null && arr[start] == 0) {
                if (start < end) {
                    swap(arr, buffer, start);
                    start += 2;
                } else {
                    start++;
                }
            } else if (buffer.peek() != null) {
                if (buffer.peek().equals(0)) {
                    buffer.add(arr[start]);
                    arr[start] = buffer.poll();
                    if (start < end) {
                        swap(arr, buffer, start);
                        start += 2;
                    } else {
                        start++;
                    }
                } else if (buffer.peek() != null && buffer.peek() > 0) {
                    int bucket = arr[start];
                    arr[start] = buffer.poll();
                    buffer.add(bucket);
                    start++;
                }
            } else {
                start++;
            }
        }
    }

    private static void swap(int[] arr, Queue<Integer> buffer, int start) {
        buffer.add(arr[start + 1]);
        arr[start + 1] = arr[start];
    }

    public static void duplicateZeros(int[] arr) {
        Queue<Integer> buffer = new LinkedList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                buffer.add(0);
                buffer.add(0);
            }else {
                buffer.add(arr[i]);
            }
            arr[i]=buffer.poll();
        }
    }
}
