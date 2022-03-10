package com.test;

import com.test.common.ListNode;

/**
 * @author
 * @version V1.0
 * @description 删除中间节点
 * @date 2022/3/10 9:58
 */
public class Solution12 {
    public void deleteNode(ListNode node) {
        // 用下一个节点的数据覆盖当前节点
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
