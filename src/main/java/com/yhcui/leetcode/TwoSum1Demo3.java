package com.yhcui.leetcode;

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
 * @Date Created in 2019年03月04日 22:56
 * @since 1.0
 */
public class TwoSum1Demo3 {

    public static void main(String[] args) {
        TwoSum1Demo3 p = new TwoSum1Demo3();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] index = p.twoSum(nums, target);
        System.out.println("index:" + index[0]+","+index[1]);

    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(64);
        for (int i = 0; i < nums.length; i++) {
            int subTarget = target - nums[i];
            Integer index = map.get(subTarget);
            if (index != null) {
                return new int[]{index, i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
