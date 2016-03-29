package com.nowcoder.offer.problem37;

import com.nowcoder.offer.node.ListNode;

/**
 * Created by taoxiaoran on 16/3/29.
 */
public class FindFirstCommonNode {
    public ListNode find(ListNode root1, ListNode root2) {
        int len1 = getLength(root1);
        int len2 = getLength(root2);
        ListNode p = null;
        ListNode q = null;
        int dif = 0;
        if (len1 < len2) {
            p = root1;
            q = root2;
            dif = len1 - len2;
        } else {
            p = root2;
            q = root1;
            dif = len2 - len1;
        }
        for (int i = 0; i < dif; i++) {
            p = p.next;
        }
        while (p != null && q != null && p != q) {
            p = p.next;
            q = q.next;
        }

        return p;
    }

    private int getLength(ListNode root) {
        int res = 0;
        if (null == root) {
            return res;
        }
        ListNode p = root;
        while (p != null) {
            p = p.next;
            res++;
        }

        return res;
    }
}
