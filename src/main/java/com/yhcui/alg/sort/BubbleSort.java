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
 * @Date Created in 2018年04月22日 23:23
 * @since 1.0
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {10, 24, 1, 23, 54, 22, 65, 55};
        bubbleSort(arr);
        System.out.println("::" + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j< arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }

    public static void swap(int[] arr, int a, int b) {
        arr[a] = arr[a] +  arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }
}
