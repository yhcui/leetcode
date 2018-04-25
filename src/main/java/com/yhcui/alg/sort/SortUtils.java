package com.yhcui.alg.sort;

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
 * @Date Created in 2018年04月25日 20:27
 * @since 1.0
 */
public class SortUtils {


    private SortUtils() {

    }

    public static void swap(int[] arr, int a, int b) {
        arr[a] =  arr[a] + arr[b];
        arr[b] = arr[a] -  arr[b];
        arr[a] =  arr[a] - arr[b];
    }
}
