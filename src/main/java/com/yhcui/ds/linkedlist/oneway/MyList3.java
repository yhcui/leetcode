package com.yhcui.ds.linkedlist.oneway;
/**
 * <p>单链反转</p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author cuiyh9
 * @version 1.0
 * @Date Created in 2018年04月10日 23:26
 * @since 1.0
 */
public class MyList3 {



    public static void main(String[] args) {

        MyList3.Node node1 = new MyList3.Node(1);
        MyList3.Node node2 = new MyList3.Node(2);
        MyList3.Node node3 = new MyList3.Node(3);
        MyList3.Node node4 = new MyList3.Node(4);
        MyList3.Node node5 = new MyList3.Node(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        printNode(node1);
        System.out.println("--------||||--------");
        MyList3.Node newNode = reverse(node1);

        printNode(newNode);
    }

    private static MyList3.Node reverse(MyList3.Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node pre = head;
        Node cur = head.next;
        while (cur != null) {
            Node  tempNode = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tempNode;
        }

        head.next = null;

        return pre;

    }

    private static void printNode(MyList3.Node node) {
        while (node != null) {
            System.out.println("nodev:" + node.data);
            node = node.next;
        }
    }


    private  static  class Node {

        int data;
        Node next;

        public Node() {

        }

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
