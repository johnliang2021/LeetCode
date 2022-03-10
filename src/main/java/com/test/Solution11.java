package com.test;

import com.test.common.ListNode;

/**
 * @author
 * @version V1.0
 * @description 返回倒数第 k 个节点
 * @date 2022/3/10 9:37
 */
public class Solution11 {
    public int kthToLast(ListNode head, int k) {
        // 遍历链表，每一次遍历时都要判断接下来第k个节点是否为null
        // 如果是，则该节点就是目标节点
        ListNode cur = head; // 作为指针
        while (cur != null && cur.next != null) {
            ListNode zz = cur;
            for (int i = 0; i < k; i++) {
                zz = zz.next; // 单独的指针
            }
            if (zz == null) {
                return cur.val;
            }
            // 指针右移
            cur = cur.next;
        }
        return cur.val;
    }
}
