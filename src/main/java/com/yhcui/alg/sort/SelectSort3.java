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
 * @Date Created in 2018年04月25日 20:30
 * @since 1.0
 */
public class SelectSort3 {

    public static void main(String[] args) {
        int[] arr = new int[]{8, 3, 4, 5, 12, 31, 9};
        selectSort(arr);
        System.out.println("::" + Arrays.toString(arr));
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            if (min != i) {
                SortUtils.swap(arr, min, i);
            }
        }
    }
}
