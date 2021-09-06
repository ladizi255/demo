package com.example.dto;

public class ListNode {
    public int val;//数据 ：节点数据
    public ListNode next;//对象 ：引用下一个节点对象。在Java中没有指针的概念，Java中的引用和C语言的指针类似

    public ListNode(int val) {
        this.val = val;
    }
}
