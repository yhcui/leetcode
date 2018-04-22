package com.yhcui.alg.sort;

import java.util.Arrays;

/**
 * <p>https://www.cnblogs.com/chengxiao/p/6262208.html </p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author cuiyh9
 * @version 1.0
 * @Date Created in 2018年04月22日 22:26
 * @since 1.0
 */
public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
//        int[] arr = {3, 2, 1};
//        int[] arr = {3, 1, 2};
//        int[] arr = {1, 2, 3};
//        int[] arr = {1, 3, 2};
//        int[] arr = {2, 3, 1};
//        int[] arr = {2, 1, 3};
        quickSort(arr, 0, arr.length -1);
        System.out.println("排序结果:" + Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            dealPivot(arr, left, right);
            int pivot = right - 1;
            int i = left;
            int j = right - 1;

            while (true) {
                while (arr[++i] < arr[pivot]) {

                }

                while (j > left && arr[--j] > arr[pivot]) {

                }

                if (i < j) {
                    swap(arr, i, j);
                } else {
                    break;
                }

            }
            if (i < right) {
                swap(arr, i, right - 1);
            }
            quickSort(arr, left, i-1);
            quickSort(arr, i+1, right);
        } else {
            System.out.println("left >= right");
        }

    }

    public static void dealPivot(int[] arr, int left, int right) {
        int mid = (right + left)/2;
        if (arr[left] > arr[mid]) {
            // 交换
            swap(arr, left, mid);
        }

        if (arr[mid] > arr[right]) {
            // 交换
            swap(arr, mid, right);
        }

        if (arr[left]  > arr[mid]) {
            // 交换
            swap(arr, left, mid);
        }

        swap(arr, mid, right - 1);

    }

    public static void swap(int[] arr, int a, int b) {
        int tempk =  arr[a];
        arr[a] =  arr[b];
        arr[b] =  tempk;
    }
}
