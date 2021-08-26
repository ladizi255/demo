package com.example.leetcode;

public class DayOne {

    /**
     * 复杂度O(n^2)
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {

        int [] a = new int[2];

        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target) {
                    a[0] = i;
                    a[1] = j;
                    System.out.println("[" + i + "," + j + "]");
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,1,8};
        int target = 9;
        DayOne dayOne = new DayOne();

        int[] ints = dayOne.twoSum(nums, target);
//        System.out.println("[" + ints[0] + "," + ints[1] + "]");
    }
}
