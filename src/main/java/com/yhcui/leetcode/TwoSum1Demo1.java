package com.yhcui.leetcode;

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
 * @Date Created in 2019年03月04日 22:56
 * @since 1.0
 */
public class TwoSum1Demo1 {

    public static void main(String[] args) {
        TwoSum1Demo1 p = new TwoSum1Demo1();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] index = p.twoSum(nums, target);
        System.out.println("index:" + index[0]+","+index[1]);

    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length -1) {
                return null;
            }
            int subTarget = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == subTarget) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
