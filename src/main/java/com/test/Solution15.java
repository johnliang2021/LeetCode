package com.test;

import com.test.common.ListNode;

/**
 * @author
 * @version V1.0
 * @description 回文链表
 * @date 2022/3/10 16:58
 */
public class Solution15 {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        // 先用快慢指针找出中间节点
        ListNode midNode = findMiddleNode(head);
        // 再将后半段链表反转
        ListNode reversetNode = reverseLinked(midNode.next);
        // 依次比较前半段和后半段反转的每一个节点值
        ListNode cur1 = head;
        ListNode cur2 = reversetNode;
        while (cur2 != null && cur1 != null) {
            if (cur1.val != cur2.val) {
                return false;
            }
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return true;
    }

    public  ListNode findMiddleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode reverseLinked(ListNode head) {
        ListNode pred = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pred;
            pred = cur;
            cur = temp; // temp作为中间变量存储下一步指针
        }
        return pred;
    }
}
