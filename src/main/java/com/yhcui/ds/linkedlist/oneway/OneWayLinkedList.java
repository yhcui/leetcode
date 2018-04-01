package com.yhcui.ds.linkedlist.oneway;

import com.yhcui.annotation.NotThreadSafe;
import com.yhcui.ds.linkedlist.MyLinkedList;

/**
 * <p>单向链表,非线程安全</p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author cuiyh9
 * @version 1.0
 * @Date Created in 2018年03月31日 15:21
 * @since 1.0
 */
@NotThreadSafe
public class OneWayLinkedList<E> implements MyLinkedList<E> {


    private Node head;

    private int size;

    @Override
    public void add(E data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        Node tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
        size++;
    }

    @Override
    public E get(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("索引超出边界异常");
        }

        if (head == null) {
            return null;
        }

        Node tempNode = head;
        int i = 0;
        while (tempNode != null) {
            if (index == i++) {
                return tempNode.data;
            }
            tempNode = tempNode.next;
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void reverse() {

        if (head == null || head.next == null) {
            return;
        }

        Node point = head;
        Node newHead = new Node();

        // 采用循环遍历方法 由前到后.
        while (point != null) {
            Node temp = point.next;

            Node tempNode = newHead.next;
            point.next = tempNode;
            newHead.next =  point;

            point = temp;
        }
        head = newHead.next;

    }

    private class Node {

        /** 值 */
        E data;

        /** 下一个节点 */
        Node next;

        public Node() {
        }

        public Node(E data) {
            this.data = data;
        }
    }

}
