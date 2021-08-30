package com.example.leetcode;

import java.util.HashMap;

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

    /** 复杂度O(n) 适用于数组中仅有一组答案  */
    public int[] twoSum2(int[] nums, int target) {
        int n = nums.length;
        //声明一个HashMap，key和value的类型都是int，变量名叫map。key和value分别记录数值和下标
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            //如果存在nums[j] + nums[i] == target，那么nums[j] = target - nums[i]
            int diff = target - nums[i];
            //如果存在diff，则返回diff和nums[i]的下标
            //HashMap的containsKey方法判断该HashMap中是否存在这个key
            if(map.containsKey(diff)){
                //返回的时候直接创建一个数组，创建数组时可以直接初始化，就不需要填大小了，比如说new int[]{1, 2, 3};
                //此时创建一个大小为2的数组，第一个元素为map.get(diff)也就是map中对应diff的value，第二个元素就是i，也就是2个数的下标
                return new int[]{map.get(diff), i};
            }else   //否则，将nums[i]存入map中
                map.put(nums[i], i);
        }
        return new int[0];
    }


    public static void main(String[] args) {
        int[] nums = {2,7,1,8};
        int target = 9;
        DayOne dayOne = new DayOne();

        int[] ints = dayOne.twoSum2(nums, target);
        System.out.println("[" + ints[0] + "," + ints[1] + "]");
    }
}
