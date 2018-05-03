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
 * @Date Created in 2018年05月03日 11:10
 * @since 1.0
 */
public class QuickSort2 {
    public static void main(String[] args) {
//        int[] arr = {1, 6, 7};
        int[] arr = {7, 6, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(":" + Arrays.toString(arr));
    }

    public static  void quickSort(int[] arr, int left ,int right) {
        if (left > right) {
            return ;
        }
        int pivot = arr[left];
        int i = left;
        int j = right;
        while (i != j) {



            while(arr[j] >= pivot && i < j) {
                j--;
            }

            while(arr[i] <= pivot && i < j) {
                i++;
            }


            if (i < j) {
                SortUtils.swap(arr, i, j);
            }
        }

        arr[left] =  arr[i];
        arr[i] = pivot;
        quickSort(arr, left, i - 1);
        quickSort(arr, i+1, right);


    }

}
