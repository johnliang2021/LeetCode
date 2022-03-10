package com.test;

import com.test.common.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author
 * @version V1.0
 * @description 移除重复节点
 * @date 2022/3/10 9:08
 */
public class Solution10 {
    public ListNode removeDuplicateNodes(ListNode head) {
        // 遍历链表，将元素依次存入set集合，如果已经存入，过滤该元素
        Set<Integer> set = new HashSet<Integer>();
        ListNode cur = head; // 指针作用，可以移动
        while (cur != null && cur.next != null) {
            set.add(cur.val);
            if (set.contains(cur.next.val)) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next; //如果不存在，指针移动到下一位
            }
        }
        return head;
    }
}
