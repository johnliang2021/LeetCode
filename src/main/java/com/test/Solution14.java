package com.test;

import com.test.common.ListNode;

/**
 * @author
 * @version V1.0
 * @description 链表求和
 * @date 2022/3/10 16:58
 */
public class Solution14 {
    /**
     * 示例：
     * <p>
     * 输入：(7 -> 1 -> 6) + (5 -> 9 -> 2)，即617 + 295
     * 输出：2 -> 1 -> 9，即912
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode l3 = new ListNode(0);
        ListNode cur = l3;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
            // 进位数
            carry = sum / 10;
            // 个位数
            cur.next = new ListNode(sum % 10);
            // 指针移动
            cur = cur.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        return l3.next;
    }
}
