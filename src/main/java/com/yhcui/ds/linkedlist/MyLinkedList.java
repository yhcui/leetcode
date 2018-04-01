package com.yhcui.ds.linkedlist;

/**
 * <p>链表接口 提供常用方法</p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author cuiyuhui
 * @version 1.0
 * @Date Created in 2018年03月31日 15:22
 * @since 1.0
 */
public interface MyLinkedList<E> {

    /**
     * 添加无素
     * @author cuiyuhui
     * @created
     * @param data 所需要添加的元素
     * @return
     */
    void add(E data);

    /**
     * 根据下标获取元素
     * @author cuiyuhui
     * @created
     * @param index 下标
     * @return
     */
    E get(int index);

    /**
     * 链表元素数量
     * @author cuiyuhui
     * @created
     * @param
     * @return
     */
    int size();

    /**
     * 链表反转<br>
     * 由1->2->3变为3->2->1
     * @author cuiyuhui
     * @created
     * @param
     * @return
     */
    void reverse();

}
