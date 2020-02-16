package com.yhcui.leetcode.simple;

import com.yhcui.anno.ConsumePower;
import com.yhcui.anno.Optimal;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>TODO</p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author cuiyh9
 * @version 1.0
 * @Date Created in 2020年02月13日 21:34
 * @since 1.0
 */
public class Demo1_0 {

    @ConsumePower(elapsedTime = 30, memeory = 44.9F)
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j <nums.length; j++) {
                if ((target - nums[i]) ==  nums[j]) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    @ConsumePower(elapsedTime = 3, memeory = 45.9F)
    public int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>(64);

        for (int i = 0; i < nums.length; i++) {
            numMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int remain = target - nums[i];
            Integer index = numMap.get(remain);
            if (index != null && index.intValue() != i) {
                return new int[]{i, index};
            }
        }

        return null;
    }

    @Optimal
    @ConsumePower(elapsedTime = 3, memeory = 46.7F)
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remain =  target - nums[i];
            Integer index = numsMap.get(remain);
            if (index != null) {
                return new int[]{index, i};
            }
            numsMap.put(nums[i], i);
        }
        return null;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 18;

        Demo1_0 d = new Demo1_0();
        int[] index = d.twoSum(nums, target);
        if (index == null) {
            System.out.println("---null----");
        } else {
            System.out.println("index:" +  index[0] + "," + index[1]);
        }

    }

}
