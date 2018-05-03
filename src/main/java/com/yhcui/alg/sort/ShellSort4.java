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
 * @Date Created in 2018年05月03日 10:13
 * @since 1.0
 */
public class ShellSort4 {

    public static void main(String[] args) {
        int[] arr = {100, 40, 60, 10, 30, 101};
        shellSort(arr);
        System.out.println(":" + Arrays.toString(arr));
    }

    public static void shellSort(int[] arr) {
        int size = arr.length;
        for (int gap = size/2; gap > 0; gap=gap/2) {
            for (int i = gap; i < size; i++) {
                insertionSort(arr, gap, i);
            }
        }
    }

    public static void insertionSort(int[] arr, int gap, int i) {
        for (int j = i - gap; j >= 0; j = j-gap) {
            if (arr[j] > arr[j+gap]) {
                SortUtils.swap(arr, j, j+gap);
            }
        }

    }
}
