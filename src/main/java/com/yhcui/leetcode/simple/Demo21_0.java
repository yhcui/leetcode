package com.yhcui.leetcode.simple;


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
 * @Date Created in 2020年02月19日 21:39
 * @since 1.0
 */
public class Demo21_0 {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        prev.next =  (l1 == null?l2 : l1);
        return prehead.next;
    }

    public ListNode mergeTwoLists_01(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if(l1.val < l2.val) {
            l1.next = mergeTwoLists_01(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists_01(l1, l2.next);
            return l2;
        }
    }


}


