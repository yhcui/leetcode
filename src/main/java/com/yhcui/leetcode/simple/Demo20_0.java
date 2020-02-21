package com.yhcui.leetcode.simple;

import java.util.Stack;

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
 * @Date Created in 2020年02月18日 21:50
 * @since 1.0
 */
public class Demo20_0 {

    /**
     * 看一下官方答案
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        if (s == null || s.length() % 2 == 1) {
            return false;
        }
        if ("".equals(s.trim())) {
            return true;
        }

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++ ) {
            Character c = s.charAt(i);
            if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                Character popc = stack.pop();
                if ((popc == '(' && c == ')')
                        || (popc == '[' && c == ']')
                        || (popc == '{' && c == '}') ) {
                    continue;
                } else {
                    return false;
                }

            } else {
                stack.push(c);
            }

        }
        if (stack.empty()) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * 有bug,处理不了()[]这种情况
     * @param s
     * @return
     */
    public boolean isValid_01(String s) {
        if (s == null || s.length() % 2 == 1) {
            return false;
        }

        int mid = s.length() / 2;
        for (int i = mid, j = 0; i > 0; i--,j++) {
            if(s.charAt(i) != s.charAt(mid + j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Demo20_0 demo20_0 = new Demo20_0();

        String s = "()";
        boolean result = demo20_0.isValid(s);
        System.out.println("result:" + result);

        s = "()[]{})";
        result = demo20_0.isValid(s);
        System.out.println("result:" + result);

        s = "(]";
        result = demo20_0.isValid(s);
        System.out.println("result:" + result);

        s = "([)]";
        result = demo20_0.isValid(s);
        System.out.println("result:" + result);

        s = "{[]}";
        result = demo20_0.isValid(s);
        System.out.println("result:" + result);
    }
}
