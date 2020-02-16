package com.yhcui.leetcode.simple;

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
 * @Date Created in 2020年02月16日 14:52
 * @since 1.0
 */
public class Demo13_0 {


//    public int romanToInt(String s) {
//        int sum = 0;
//        int pre = s.charAt(0);
//        for (int i = 1; i < s.length(); i++) {
//            int num = getValue(s.charAt(i));
//            if (pre < num) {
//                sum += num - pre;
//            } else {
//                sum += pre;
//
//            }
//        }
//    }



//
//    private static final Map<Character, Integer> romanMap= new HashMap<>();
//    static {
//        romanMap.put('I', 1);
//        romanMap.put('V', 5);
//        romanMap.put('X', 10);
//        romanMap.put('L', 50);
//        romanMap.put('C', 100);
//        romanMap.put('D', 500);
//        romanMap.put('M', 1000);
//    }

    public int romanToInt(String s) {
        int len = s.length();

        if (len == 1) {
            return getValue(s.charAt(0));
        }

        int total = 0;
        for (int i = 0; i < len; i++) {
            if (i == len-1) {
                total += getValue(s.charAt(i));
                continue;
            }
            if (getValue(s.charAt(i)) < getValue(s.charAt(i+1))) {
                total +=  getValue(s.charAt(i+1)) - getValue(s.charAt(i));
                i++ ;
            } else {
                total +=  getValue(s.charAt(i));
            }
        }
        return total;
    }

    private int getValue(char ch) {
        switch (ch) {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default: return 0;

        }
    }

    public static void main(String[] args) {
        Demo13_0 demo13_0 = new Demo13_0();
        int v = demo13_0.romanToInt("III");
        System.out.println("v:" + v);
        v = demo13_0.romanToInt("IV");
        System.out.println("v:" + v);
        v = demo13_0.romanToInt("IX");
        System.out.println("v:" + v);
        v = demo13_0.romanToInt("LVIII");
        System.out.println("v:" + v);
        v = demo13_0.romanToInt("MCMXCIV");
        System.out.println("v:" + v);
    }
}
