package com.yhcui.ds.linkedlist.oneway;

import com.yhcui.ds.linkedlist.MyLinkedList;
import sun.jvm.hotspot.ui.FindInHeapPanel;

/**
 * <p>单向链表</p>
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
public class OneWayLinkedList<E> implements MyLinkedList<E> {


    private Node head;

    private int size;

    @Override
    public void add(E data) {
        if (size >= Integer.MAX_VALUE) {
            throw new RuntimeException("链表元素数量超出范围");
        }

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

        if (index < 0) {
            throw new RuntimeException("参数非法");
        }

        if (head == null) {
            return null;
        }

        Node tempNode = head;
        int i = 0;
        while (tempNode != null) {
            if (i == index++) {
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

    @Override
    public void list() {
        Node point = head;
        while (point != null) {
            System.out.println("point:" + point.data);
            point = point.next;
        }
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
