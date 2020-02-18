package com.yhcui.leetcode.simple;

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
 * @Date Created in 2020年02月16日 15:22
 * @since 1.0
 */
public class Demo14_0 {
    // Todo 二分查找法

    // TODO 更进一步
    /**
     * 分治算法
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int r = strs.length - 1;
        return longestCommonPrefix(strs, 0, r);
    }

    public String longestCommonPrefix(String[] strs, int l, int r) {
        if (l == r) {
            return strs[l];
        } else {
            int mid = (l + r)/2;
            String left = longestCommonPrefix(strs, l, mid);
            String right = longestCommonPrefix(strs, mid+1, r);
            return commonPrefix(left, right);
        }
    }

    public String commonPrefix(String left, String right) {
        int min = Math.min(left.length(), right.length());
        for (int i = 0; i < min; i++) {
            if (left.charAt(i) != right.charAt(i)) {
                return left.substring(0, i);
            }
        }
        return left.substring(0, min);
    }

    public String longestCommonPrefix_02(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

    public String longestCommonPrefix_01(String[] strs) {
        if (strs.length == 0) { return "";}
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }

        }
        return prefix;
    }


    public static void main(String[] args) {
        Demo14_0 demo14_0 = new Demo14_0();
        String[] strs = new String[]{"flower","flow","flight"};
        String cp =demo14_0.longestCommonPrefix(strs);
        System.out.println("cp:" + cp);

        strs = new String[]{"dog","racecar","car"};
        cp =demo14_0.longestCommonPrefix(strs);
        System.out.println("cp:" + cp);

        strs = new String[]{"aabbcc","aabb","aa"};
        cp =demo14_0.longestCommonPrefix(strs);
        System.out.println("cp:" + cp);

        String cc = "abc";
        System.out.println("aa---:" + cc.substring(0, 1));
    }
}
