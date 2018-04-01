package com.yhcui.ds.linkedlist.twoway;

import com.yhcui.ds.linkedlist.MyLinkedList;

import java.util.LinkedList;

/**
 * <p>双向链表</p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author cuiyh9
 * @version 1.0
 * @Date Created in 2018年03月31日 15:26
 * @since 1.0
 */
public class TwoWayLinkedList<E> implements MyLinkedList<E> {


    private Node first;

    private Node last;

    private int size;

    @Override
    public void add(E data) {
        Node l = last;
        Node newNode = new Node(data, l,  null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
    }

    @Override
    public E get(int index) {

        Node tempNode = first;
        int i = 0;
        while (tempNode != null) {
            if (i == index++) {
                return (E) tempNode.data;
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void reverse() {
        Node tempLast = last;

        if (tempLast == null || tempLast.pre != null) {
            return;
        }



        Node finFirst = null;

        Node finLast = null;



        while (tempLast != null) {
            Node temp = tempLast.next;

            Node ttLast = finLast;

            tempLast.pre = last;
            tempLast.next = null;

            last = tempLast;
            if (ttLast == null) {
                first = tempLast;
            } else {
                ttLast.next = tempLast;
            }



            tempLast = temp;
        }
        first = finFirst;
        last = finLast;

    }

    private class Node<E> {

        E data;

        Node pre;

        Node next;

        public Node() {

        }

        public Node(E data) {
            this.data = data;
        }

        public Node(E data, Node pre, Node next) {
            this.data = data;
            this.pre = pre;
            this.next = next;
        }
    }

    @Override
    public void list() {
        while (first != null) {
            System.out.println(first.data);
            first = first.next;

        }
    }
}
