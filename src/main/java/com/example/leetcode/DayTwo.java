package com.example.leetcode;

import com.example.dto.ListNode;

public class DayTwo {

    public static ListNode addTwoNum(ListNode l1, ListNode l2){

        ListNode a = new ListNode(0);//结果
        ListNode curr = a;
        int carry = 0;// 进位值

        while (l1 != null || l2 != null){
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;

            int sum = n1 + n2 + carry;//

            carry = sum / 10;//进位

            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if (l1 != null) l1 = l1.next;
            if (null != l2) l2 = l2.next;
        }

        if (carry > 0){
            curr.next = new ListNode(carry);
        }

        return a.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(2);
        ListNode l12 = new ListNode(3);

        l1.next = l11;
        l11.next = l12;

        ListNode l2 = new ListNode(9);
        ListNode l21 = new ListNode(9);
        ListNode l22 = new ListNode(9);

        l2.next = l21;
        l21.next = l22;

        ListNode listNode = addTwoNum(l1, l2);
        while (null != listNode){

        System.out.print(listNode.val + ",");
        listNode = listNode.next;
        }
    }
}
