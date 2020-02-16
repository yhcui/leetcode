package com.yhcui.leetcode.simple;

import com.yhcui.anno.Optimal;

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
 * @Date Created in 2020年02月15日 20:41
 * @since 1.0
 */
public class Demo9_0 {


    @Optimal
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + (x % 10);
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber/10;
    }

    public boolean isPalindrome_02(int x) {
        if (x < 0) {
            return false;
        }
        char[] ccs = String.valueOf(x).toCharArray();
        for (int i = 0, j = ccs.length - 1; j > i; i++, j--) {
            if(ccs[i] != ccs[j]) {
                return false;
            }
        }

        return true;
    }

    /**
     *
     * @param x
     * @return
     */
    public boolean isPalindrome_01(int x) {
        if (x < 0) {
            return false;
        }
        char[] ccs = String.valueOf(x).toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = ccs.length-1; i >= 0; i--) {
            sb.append(ccs[i]);
        }
        return Long.valueOf(sb.toString()).longValue() == Long.valueOf(x).longValue();
    }



    public static void main(String[] args) {
        Demo9_0 demo9_0 = new Demo9_0();
        boolean flag = demo9_0.isPalindrome(121);
        System.out.println("flag:" + flag);
    }
}
