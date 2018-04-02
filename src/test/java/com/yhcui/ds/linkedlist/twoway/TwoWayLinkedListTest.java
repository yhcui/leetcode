package com.yhcui.ds.linkedlist.twoway;

import com.yhcui.ds.linkedlist.MyLinkedList;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.*;

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

    private MyLinkedList<Integer> myLinkedList;

    @Before
    public void before() {
        myLinkedList = new TwoWayLinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
    }

    @Test
    public void testAdd() {
        assertEquals(3, myLinkedList.size());
    }

    @Test
    public void testGet() {

        assertEquals(1, myLinkedList.get(0).intValue());
        assertEquals(2, myLinkedList.get(1).intValue());
        assertEquals(3, myLinkedList.get(2).intValue());
        assertEquals(3, myLinkedList.size());

        try {
            myLinkedList.get(3).intValue();
        } catch (Exception e) {
            assertEquals(true, "索引超出边界异常".equals(e.getMessage()));
        }

        try {
            myLinkedList.get(-1).intValue();
        } catch (Exception e) {
            assertEquals(true, "索引超出边界异常".equals(e.getMessage()));
        }

    }

    @Test
    public void testSize() {
        assertEquals(3, myLinkedList.size());
    }

    @Test
    public void testReverse() {
        myLinkedList.reverse();
        assertEquals(3, myLinkedList.get(0).intValue());
        assertEquals(2, myLinkedList.get(1).intValue());
        assertEquals(1, myLinkedList.get(2).intValue());
        assertEquals(3, myLinkedList.size());
        try {
            myLinkedList.get(3).intValue();
        } catch (Exception e) {
            assertEquals(true, "索引超出边界异常".equals(e.getMessage()));
        }
        try {
            myLinkedList.get(-1).intValue();
        } catch (Exception e) {
            assertEquals(true, "索引超出边界异常".equals(e.getMessage()));
        }
    }
}
