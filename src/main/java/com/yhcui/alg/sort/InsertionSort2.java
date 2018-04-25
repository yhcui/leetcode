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
 * @Date Created in 2018年04月25日 20:21
 * @since 1.0
 */
public class InsertionSort2 {

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//        int[] arr = {10, 24, 54, 23, 2, 22, 65, 55};
        insertionSort(arr);
        System.out.println("::" + Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i;

            while (j > 0 && arr[j] < arr[j-1]) {
                SortUtils.swap(arr, j, j-1);
                j--;
//                System.out.println("1:" + Arrays.toString(arr));
            }
        }
    }


}
