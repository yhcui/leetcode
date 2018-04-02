package com.yhcui.ds.linkedlist.twoway;

import com.yhcui.annotation.NotThreadSafe;
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
@NotThreadSafe
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
        size++;
    }

    @Override
    public E get(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("索引超出边界异常");
        }

        Node tempNode = first;
        int i = 0;
        while (tempNode != null) {
            if (index == i++) {
                return (E) tempNode.data;
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

        // 从头重新构建list
        Node tempNode = first;
        Node tempLast =  null;
        Node tempHead = new Node();
        int i = 0;
        while (tempNode != null) {
            Node tempPre =  tempNode.next;
            Node tempHeadNext = tempHead.next;
            tempNode.next = tempHeadNext;
            tempNode.pre = tempHead;
            tempHead.next = tempNode;

            if (i == 0) {
                tempLast = tempNode;
            }
            tempNode = tempPre;
            i++;
        }

        first = tempHead.next;
        last = tempLast;
    }

    public void list() {
        Node tempNode = first;
        while (tempNode != null) {
            System.out.println("list:" + tempNode.data);
            tempNode = tempNode.next;
        }
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

}
