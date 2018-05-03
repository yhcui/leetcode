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
 * @Date Created in 2018年05月02日 16:46
 * @since 1.0
 */
public class ShellSort3 {

    public static void main(String[] args) {
        int[] arr = {100, 40, 60, 10, 30, 101, 99, 77};
        shellSort(arr);
        System.out.println(":" + Arrays.toString(arr));
    }


    public static void shellSort(int[] arr) {
        for (int gap = arr.length/2; gap > 0; gap=gap/2) {
            for (int i = gap; i < arr.length; i++) {
                insertI(arr, gap, i);
            }
        }
    }

    public static void insertI(int[] arr, int gap, int i) {
        System.out.println("gap:" + gap + ",i:" + i + ",j:" + (i - gap));
        for (int j =  i - gap; j >= 0; j -= gap) {
            if (arr[j] > arr[j + gap]) {
                SortUtils.swap(arr, j, j+gap);
            }
        }
    }

}
