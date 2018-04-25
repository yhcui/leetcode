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
 * @Date Created in 2018年04月24日 23:19
 * @since 1.0
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] arr1 = {1,4,2,7,9,8,3,6,22};
        sort1(arr1);
        System.out.println("::" + Arrays.toString(arr1));
        int[] arr2 = {1,4,2,7,9,8,3,6};
        sort2(arr2);
        System.out.println("::" + Arrays.toString(arr2));
    }

    public static void sort1(int[] arr) {
        for (int gap = arr.length / 2; gap > 0 ; gap = gap/2) {
            System.out.println("gap:" + gap);
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                while (j - gap >= 0 && arr[j] < arr[j-gap]) {
                    swap(arr, j, j-gap);
                    j = j - gap;
                    System.out.println("i:" + i + ",j:" + j);
                }
            }
        }
    }


    public static void swap(int[] arr, int a, int b) {
        arr[a] = arr[a] + arr[b];
        arr[b] =  arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }

    public static void sort2(int[] arr) {

    }
}
