package com.yhcui.alg.sort;

import java.util.Arrays;

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
 * @Date Created in 2018年05月02日 16:25
 * @since 1.0
 */
public class BubbleSort4 {

    public static void main(String[] args) {
        int[] arr = {10, 30, 15, 8, 2, 40};
        bubbleSort(arr);
        System.out.println(":" + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    SortUtils.swap(arr, j, j+1);
                }
            }
        }
    }

}
