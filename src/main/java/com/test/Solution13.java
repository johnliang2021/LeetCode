package com.test;

import com.test.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @version V1.0
 * @description 分割链表
 * @date 2022/3/10 10:04
 */
public class Solution13 {
    public ListNode partition(ListNode head, int x) {
        // 准备两个list,遍历链表，小于x的和大于等于x的分别放入两个list
        //新建一个链表，依次放入两个list中的元素
        List<Integer> little = new ArrayList<Integer>();
        List<Integer> big = new ArrayList<Integer>();
        ListNode cur = head; // 指针
        while (cur != null) {
            if (cur.val < x) {
                little.add(cur.val);
            } else {
                big.add(cur.val);
            }
            // 指针移动
            cur = cur.next;
        }

        ListNode n = head;
        for (int i = 0; i < little.size(); i++) {
            n.val = little.get(i);
            n = n.next;
        }
        for (int j = 0; j < big.size(); j++) {
            n.val = big.get(j);
            n = n.next;
        }
        return head;
    }
}
