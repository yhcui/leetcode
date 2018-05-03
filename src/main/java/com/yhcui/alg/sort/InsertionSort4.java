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
 * @Date Created in 2018年05月03日 10:08
 * @since 1.0
 */
public class InsertionSort4 {

    public static void main(String[] args) {
        int[] arr = {12, 9, 10, 8, 7};
        insertionSort(arr);
        System.out.println(":" + Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (arr[j] > arr[j-1]) {
                    SortUtils.swap(arr, j, j-1);
                }
            }
        }
    }


}
