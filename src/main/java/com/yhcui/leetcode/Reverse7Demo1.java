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
 * @Date Created in 2019年03月04日 23:27
 * @since 1.0
 */
public class Reverse7Demo1 {
    public static void main(String[] args) {
        Reverse7Demo1 d = new Reverse7Demo1();
//        int tt = d.reverse(1534236469);
        System.out.println("tt:" + Integer.valueOf("9646324351"));
    }

    public int reverse(int x) {
        boolean isPos = false;
        if (x < 0) {
            isPos = true;
            x = Math.abs(x);
        }
        char[] chars = String.valueOf(x).toCharArray();
        StringBuilder sb = new StringBuilder(100);
        if (isPos) {
            sb.append("-");
        }
        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }
        try {
            return Integer.valueOf(sb.toString());
        } catch (Exception e) {
            return 0;
        }

    }
}
