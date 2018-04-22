package com.yhcui.ds.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树迭代
 * <p>参考: https://blog.csdn.net/gfj0814/article/details/51637696</p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author cuiyh9
 * @version 1.0
 * @Date Created in 2018年04月17日 11:23
 * @since 1.0
 */
public class Tree {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.init();
//        tree.preOrder(tree.root);
        tree.midOrder(tree.root);
//        tree.postOrder(tree.root);
        for (Node node : tree.list) {
            System.out.println("node:" + node.data);
        }

    }



    List<Node> list = new ArrayList<>();

    Node root;

    public void init() {
        Node x = new Node("X",null,null);
        Node y = new Node("Y",null,null);
        Node d = new Node("d",x,y);
        Node e = new Node("e",null,null);
        Node f = new Node("f",null,null);
        Node c = new Node("c",e,f);
        Node b = new Node("b",d,null);
        Node a = new Node("a",b,c);
        root = a;
    }

    // 先序
    public void preOrder(Node node) {
        list.add(node);
        if (node.lchild != null) {
            preOrder(node.lchild);
        }
        if (node.rchild != null) {
            preOrder(node.rchild);
        }

    }

    public void midOrder(Node node) {
        if (node.lchild != null) {
            midOrder(node.lchild);
        }

        list.add(node);

        if (node.rchild != null) {
            midOrder(node.rchild);
        }
    }

    public void postOrder(Node node) {
        if (node.lchild != null) {
            postOrder(node.lchild);
        }

        if (node.rchild != null) {
            postOrder(node.rchild);
        }
        list.add(node);
    }




    private class Node {

        String data;

        Node lchild;

        Node rchild;

        public Node(String data, Node lchild, Node rchild) {
            this.data = data;
            this.lchild = lchild;
            this.rchild = rchild;
        }

    }
}
