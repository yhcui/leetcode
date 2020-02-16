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
 * @Date Created in 2020年02月15日 22:48
 * @since 1.0
 */
public class Demo7_0 {

    /**
     * Integer.MAX: 2147483647
     * Integer.MIN: -2147483648
     * 判断是否溢出，可以采用定义n为long类型 return (int)n==n?
     * @param x
     * @return
     */
    @Optimal
    public int reverse(int x) {
        if (x >= 0 && x <10) {
            return x;
        }
        int reverseNum = 0;
        while (x != 0) {

            int pop = x % 10;

            if (reverseNum > Integer.MAX_VALUE/10) {
                return 0;
            }

            if (reverseNum == Integer.MAX_VALUE/10 && pop > 7) {
                return 0;
            }

            if (reverseNum < Integer.MIN_VALUE/10) {
                return 0;
            }

            if (reverseNum == Integer.MIN_VALUE/10 && pop < -8) {
                return 0;
            }

            reverseNum = reverseNum*10 + pop;
            x = x/10;
        }
        return reverseNum;
    }

    public static void main(String[] args) {
        Demo7_0 demo7_0 = new Demo7_0();
        int v = demo7_0.reverse(1534236469);
        System.out.println("v:" + v);
        v = demo7_0.reverse(123);
        System.out.println("v:" + v);
        v = demo7_0.reverse(-123);
        System.out.println("v:" + v);
        v = demo7_0.reverse(120);
        System.out.println("v:" + v);
    }
}
