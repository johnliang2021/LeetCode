package com.test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author
 * @version V1.0
 * @description 回文排列
 * @date 2022/3/9 9:20
 */
public class Solution4 {
    // 遍历字符数组，将每个字符依次装入哈希表，如果已经存在则移除该字符，遍历完成后判断哈希表容量，如果容量大于1则不是回文排列
    public boolean canPermutePalindrome(String s) {
        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<Character>();
        for (char c:chars) {
            if (set.contains(c)) {
                set.remove(c);
            } else {
                set.add(c);
            }
        }
        if (set.size() > 1) {
            return false;
        }
        return true;
    }
}
