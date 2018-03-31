package com.yhcui.ds.linkedlist.oneway;

import com.yhcui.ds.linkedlist.MyLinkedList;
import org.junit.Test;

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
 * @Date Created in 2018年03月31日 16:07
 * @since 1.0
 */
public class OneWayLinkedListTest {

    @Test
    public void testAdd() {
        MyLinkedList<Integer> myLinkedList = new OneWayLinkedList<Integer>();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        System.out.println(myLinkedList.size());
    }

    @Test
    public void testReverse() {
        MyLinkedList<Integer> myLinkedList = new OneWayLinkedList<Integer>();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);

        myLinkedList.reverse();
        myLinkedList.list();


    }
}
