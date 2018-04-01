package com.yhcui.ds.linkedlist.twoway;

import com.yhcui.ds.linkedlist.MyLinkedList;
import org.junit.Test;

import java.util.LinkedList;

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
 * @Date Created in 2018年03月31日 17:25
 * @since 1.0
 */
public class TwoWayLinkedListTest {

    @Test
    public void testAdd() {
        MyLinkedList<Integer> myLinkedList = new TwoWayLinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.reverse();
        myLinkedList.list();
    }
}
